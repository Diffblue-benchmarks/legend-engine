package org.finos.legend.engine.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ProtocolDiffblueTest {
  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Protocol()).equals("o"));
    assertFalse((new Protocol()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(961, (new Protocol()).hashCode());
  }
}

