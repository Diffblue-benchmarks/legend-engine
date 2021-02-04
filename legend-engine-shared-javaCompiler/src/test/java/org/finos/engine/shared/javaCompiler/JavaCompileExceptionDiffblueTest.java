package org.finos.engine.shared.javaCompiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaFileObject;
import org.eclipse.collections.api.RichIterable;
import org.junit.Test;

public class JavaCompileExceptionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new JavaCompileException(new ArrayList<Diagnostic<? extends JavaFileObject>>()))
        .getErrorDiagnostics() instanceof org.eclipse.collections.impl.lazy.SelectIterable);
    assertTrue((new JavaCompileException(new DiagnosticCollector<JavaFileObject>()))
        .getErrorDiagnostics() instanceof org.eclipse.collections.impl.lazy.SelectIterable);
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Diagnostic<? extends JavaFileObject>> diagnosticList = new ArrayList<Diagnostic<? extends JavaFileObject>>();
    diagnosticList.add(null);

    // Act and Assert
    RichIterable<Diagnostic<? extends JavaFileObject>> errorDiagnostics = (new JavaCompileException(diagnosticList))
        .getErrorDiagnostics();
    assertTrue(errorDiagnostics instanceof org.eclipse.collections.impl.lazy.SelectIterable);
    assertEquals("[]", errorDiagnostics.toString());
  }

  @Test
  public void testGetErrorDiagnostics() {
    // Arrange, Act and Assert
    assertNull((new JavaCompileException(new ArrayList<Diagnostic<? extends JavaFileObject>>())).getErrorDiagnostics()
        .getAny());
  }
}

