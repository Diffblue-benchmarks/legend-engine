package org.finos.engine.shared.javaCompiler;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.JavaSourceClassLoader;
import org.junit.Test;

public class SingleFileCompilerDiffblueTest {
  @Test
  public void testCompileFile() throws IOException, CompileException {
    // Arrange, Act and Assert
    assertTrue(
        SingleFileCompiler.compileFile(StringJavaSource.newStringJavaSource("java.text", "Name", "", true)).isEmpty());
  }

  @Test
  public void testCompileFile2() throws IOException, CompileException {
    // Arrange
    StringJavaSource source = StringJavaSource.newStringJavaSource("java.text", "Name", "", true);

    // Act and Assert
    assertTrue(SingleFileCompiler.compileFile(source, new JavaSourceClassLoader()).isEmpty());
  }
}

