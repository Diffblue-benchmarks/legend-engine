package org.finos.engine.shared.javaCompiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.junit.Test;

public class ClassJavaSourceDiffblueTest {
  @Test
  public void testOpenInputStream() throws IOException {
    // Arrange, Act and Assert
    assertTrue(ClassJavaSource.fromClassName("memo:///").openInputStream() instanceof java.io.ByteArrayInputStream);
  }

  @Test
  public void testSetBytes() {
    // Arrange
    ClassJavaSource fromClassNameResult = ClassJavaSource.fromClassName("memo:///");

    // Act
    fromClassNameResult.setBytes(
        new byte[]{65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65});

    // Assert
    assertEquals(24, fromClassNameResult.getBytes().length);
  }

  @Test
  public void testInferBinaryName() {
    // Arrange, Act and Assert
    assertEquals("memo:...", ClassJavaSource.fromClassName("memo:///").inferBinaryName());
  }

  @Test
  public void testFromClassName() {
    // Arrange, Act and Assert
    assertEquals(0, ClassJavaSource.fromClassName("memo:///").getBytes().length);
  }
}

