package org.finos.legend.engine.language.pure.dsl.text.grammar.from;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TextParserExtensionDiffblueTest {
  @Test
  public void testGetExtraSectionParsers() {
    // Arrange, Act and Assert
    assertEquals(1, (new TextParserExtension()).getExtraSectionParsers().size());
  }
}

