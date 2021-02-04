package org.finos.engine.shared.javaCompiler;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringJavaSourceDiffblueTest {
  @Test
  public void testHasPackageDeclaration() {
    // Arrange, Act and Assert
    assertFalse(StringJavaSource.hasPackageDeclaration("Code"));
    assertTrue(StringJavaSource.hasPackageDeclaration(" package U ; "));
  }
}

