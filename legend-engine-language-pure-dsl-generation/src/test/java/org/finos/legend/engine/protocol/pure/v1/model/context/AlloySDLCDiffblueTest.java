package org.finos.legend.engine.protocol.pure.v1.model.context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AlloySDLCDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    AlloySDLC actualAlloySDLC = new AlloySDLC();

    // Assert
    assertEquals("none", actualAlloySDLC.version);
    assertTrue(actualAlloySDLC.packageableElementPointers.isEmpty());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new AlloySDLC()).equals("o"));
    assertFalse((new AlloySDLC()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(301460088, (new AlloySDLC()).hashCode());
  }
}

