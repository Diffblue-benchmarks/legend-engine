package org.finos.engine.shared.javaCompiler;

import static org.junit.Assert.assertSame;
import org.codehaus.janino.JavaSourceClassLoader;
import org.junit.Test;

public class MemoryClassLoaderDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    JavaSourceClassLoader javaSourceClassLoader = new JavaSourceClassLoader();

    // Act and Assert
    assertSame((new MemoryClassLoader(null, javaSourceClassLoader)).getParent(), javaSourceClassLoader);
  }
}

