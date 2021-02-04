package org.finos.legend.engine.protocol.pure.v1.model.context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PureSDLCDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    PureSDLC actualPureSDLC = new PureSDLC();

    // Assert
    assertEquals("none", actualPureSDLC.version);
    assertTrue(actualPureSDLC.packageableElementPointers.isEmpty());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new PureSDLC()).equals("o"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(105003945, (new PureSDLC()).hashCode());
  }
}

