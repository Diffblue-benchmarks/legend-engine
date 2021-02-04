package org.finos.engine.shared.javaCompiler;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EngineJavaCompilerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new EngineJavaCompiler()).getClassLoader() instanceof MemoryClassLoader);
    assertTrue((new EngineJavaCompiler(new EngineJavaCompiler())).getClassLoader() instanceof MemoryClassLoader);
    assertTrue((new EngineJavaCompiler((EngineJavaCompiler) null)).getClassLoader() instanceof MemoryClassLoader);
    assertTrue((new EngineJavaCompiler(JavaVersion.JAVA_7)).getClassLoader() instanceof MemoryClassLoader);
  }

  @Test
  public void testSave() {
    // Arrange, Act and Assert
    assertTrue((new EngineJavaCompiler()).save().isEmpty());
  }

  @Test
  public void testLoad() {
    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> (new EngineJavaCompiler()).load("Class Name", "Encoded Bytecode"));
    assertThrows(RuntimeException.class, () -> (new EngineJavaCompiler()).load("memo:///", "Encoded Bytecode"));
    assertThrows(RuntimeException.class, () -> (new EngineJavaCompiler()).load("memo:///", "\""));
  }

  @Test
  public void testLoad2() {
    // Arrange
    EngineJavaCompiler engineJavaCompiler = new EngineJavaCompiler();

    // Act and Assert
    assertSame(engineJavaCompiler, engineJavaCompiler.load("memo:///", ""));
  }
}

