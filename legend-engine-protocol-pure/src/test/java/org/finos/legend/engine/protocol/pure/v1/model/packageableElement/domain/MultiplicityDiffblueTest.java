package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MultiplicityDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new Multiplicity()).isInfinite());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Multiplicity actualMultiplicity = new Multiplicity(1, 1);

    // Assert
    assertFalse(actualMultiplicity.isInfinite());
    assertEquals(1, actualMultiplicity.lowerBound);
    assertEquals(1, actualMultiplicity.getUpperBoundInt().intValue());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    Multiplicity actualMultiplicity = new Multiplicity(1, null);

    // Assert
    assertTrue(actualMultiplicity.isInfinite());
    assertEquals(1, actualMultiplicity.lowerBound);
  }

  @Test
  public void testConstructor4() {
    // Arrange and Act
    Multiplicity actualMultiplicity = new Multiplicity(1, 2147483647);

    // Assert
    assertTrue(actualMultiplicity.isInfinite());
    assertEquals(1, actualMultiplicity.lowerBound);
  }

  @Test
  public void testSetUpperBound() {
    // Arrange
    Multiplicity multiplicity = new Multiplicity();

    // Act
    multiplicity.setUpperBound(1);

    // Assert
    assertFalse(multiplicity.isInfinite());
    assertEquals(1, multiplicity.getUpperBoundInt().intValue());
  }

  @Test
  public void testSetUpperBound2() {
    // Arrange
    Multiplicity multiplicity = new Multiplicity();

    // Act
    multiplicity.setUpperBound(null);

    // Assert
    assertTrue(multiplicity.isInfinite());
  }

  @Test
  public void testSetUpperBound3() {
    // Arrange
    Multiplicity multiplicity = new Multiplicity();

    // Act
    multiplicity.setUpperBound(2147483647);

    // Assert
    assertTrue(multiplicity.isInfinite());
  }

  @Test
  public void testGetUpperBound() {
    // Arrange, Act and Assert
    assertNull((new Multiplicity()).getUpperBound());
    assertEquals(1, (new Multiplicity(1, 1)).getUpperBound().intValue());
  }

  @Test
  public void testIsUpperBoundEqualTo() {
    // Arrange, Act and Assert
    assertFalse((new Multiplicity()).isUpperBoundEqualTo(1));
    assertTrue((new Multiplicity(1, 1)).isUpperBoundEqualTo(1));
    assertFalse((new Multiplicity(1, 0)).isUpperBoundEqualTo(1));
  }

  @Test
  public void testIsUpperBoundGreaterThan() {
    // Arrange, Act and Assert
    assertTrue((new Multiplicity()).isUpperBoundGreaterThan(1));
    assertFalse((new Multiplicity(1, 1)).isUpperBoundGreaterThan(1));
    assertTrue((new Multiplicity(1, 1)).isUpperBoundGreaterThan(0));
    assertTrue((new Multiplicity(1, 1)).isUpperBoundGreaterThan(-1));
  }

  @Test
  public void testGetUpperBoundInt() {
    // Arrange, Act and Assert
    assertEquals(2147483647, (new Multiplicity()).getUpperBoundInt().intValue());
    assertEquals(1, (new Multiplicity(1, 1)).getUpperBoundInt().intValue());
  }
}

