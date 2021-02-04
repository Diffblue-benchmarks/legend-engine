package org.finos.legend.engine.protocol.pure.v1.model.context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PackageableElementPointerDiffblueTest {
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("{null, null}", (new PackageableElementPointer()).toString());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new PackageableElementPointer()).equals("o"));
    assertFalse((new PackageableElementPointer()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(961, (new PackageableElementPointer()).hashCode());
  }
}

