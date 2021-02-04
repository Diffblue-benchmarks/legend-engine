package org.finos.legend.engine.language.pure.grammar.from.extension;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PureGrammarParserExtensionLoaderDiffblueTest {
  @Test
  public void testExtensions() {
    // Arrange, Act and Assert
    assertEquals(1, PureGrammarParserExtensionLoader.extensions().size());
  }
}

