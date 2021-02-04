package org.finos.legend.engine.language.pure.grammar.to;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class PureGrammarComposerUtilityDiffblueTest {
  @Test
  public void testGetTabSize() {
    // Arrange, Act and Assert
    assertEquals(2, PureGrammarComposerUtility.getTabSize());
    assertEquals(2, PureGrammarComposerUtility.getTabSize(1));
  }

  @Test
  public void testGetTabString() {
    // Arrange, Act and Assert
    assertEquals("  ", PureGrammarComposerUtility.getTabString(1));
    assertEquals("", PureGrammarComposerUtility.getTabString(0));
  }

  @Test
  public void testAppendTabString() {
    // Arrange
    StringBuilder stringBuilder = new StringBuilder();

    // Act and Assert
    assertSame(stringBuilder, PureGrammarComposerUtility.appendTabString(stringBuilder));
  }

  @Test
  public void testAppendTabString2() {
    // Arrange
    StringBuilder stringBuilder = new StringBuilder(1);

    // Act and Assert
    assertSame(stringBuilder, PureGrammarComposerUtility.appendTabString(stringBuilder));
  }

  @Test
  public void testAppendTabString3() {
    // Arrange
    StringBuilder stringBuilder = new StringBuilder();

    // Act and Assert
    assertSame(stringBuilder, PureGrammarComposerUtility.appendTabString(stringBuilder, 1));
  }

  @Test
  public void testAppendTabString4() {
    // Arrange
    StringBuilder stringBuilder = new StringBuilder();

    // Act and Assert
    assertSame(stringBuilder, PureGrammarComposerUtility.appendTabString(stringBuilder, 0));
  }

  @Test
  public void testAppendTabString5() {
    // Arrange
    StringBuilder stringBuilder = new StringBuilder(3);

    // Act and Assert
    assertSame(stringBuilder, PureGrammarComposerUtility.appendTabString(stringBuilder, 0));
  }

  @Test
  public void testAppendTabString6() {
    // Arrange
    StringBuilder stringBuilder = new StringBuilder(0);

    // Act and Assert
    assertSame(stringBuilder, PureGrammarComposerUtility.appendTabString(stringBuilder, 0));
  }

  @Test
  public void testConvertString() {
    // Arrange, Act and Assert
    assertEquals("'Val'", PureGrammarComposerUtility.convertString("Val", true));
    assertEquals("'Val'", PureGrammarComposerUtility.convertString("Val", false));
  }

  @Test
  public void testConvertPath() {
    // Arrange, Act and Assert
    assertEquals("Val", PureGrammarComposerUtility.convertPath("Val"));
    assertEquals("", PureGrammarComposerUtility.convertPath("::"));
    assertEquals("", PureGrammarComposerUtility.convertPath(""));
    assertEquals("'\\''", PureGrammarComposerUtility.convertPath("'"));
  }

  @Test
  public void testConvertIdentifier() {
    // Arrange, Act and Assert
    assertEquals("Val", PureGrammarComposerUtility.convertIdentifier("Val"));
    assertEquals("", PureGrammarComposerUtility.convertIdentifier(null));
    assertEquals("", PureGrammarComposerUtility.convertIdentifier(""));
    assertEquals("'\\''", PureGrammarComposerUtility.convertIdentifier("'"));
  }

  @Test
  public void testUnsupported() {
    // Arrange, Act and Assert
    assertEquals("/* Unsupported transformation for 'java.lang.Object' */",
        PureGrammarComposerUtility.unsupported(Object.class));
    assertEquals("/* Unsupported transformation for 'java.lang.String' */",
        PureGrammarComposerUtility.unsupported(String.class));
    assertEquals("/* Unsupported transformation for Type Name 'java.lang.Object' */",
        PureGrammarComposerUtility.unsupported(Object.class, "Type Name"));
    assertEquals("/* Unsupported transformation for /* Unsupported transformation for  'java.lang.Object' */",
        PureGrammarComposerUtility.unsupported(Object.class, "/* Unsupported transformation for "));
    assertEquals("/* Unsupported transformation for 'java.lang.Object' */",
        PureGrammarComposerUtility.unsupported(Object.class, null));
  }

  @Test
  public void testRenderObject() {
    // Arrange, Act and Assert
    assertEquals("'value'", PureGrammarComposerUtility.renderObject("value"));
    assertEquals("42", PureGrammarComposerUtility.renderObject(42));
  }
}

