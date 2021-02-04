package org.finos.legend.engine.language.pure.grammar.to.extension;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PureGrammarComposerExtensionLoaderDiffblueTest {
  @Test
  public void testExtensions() {
    // Arrange, Act and Assert
    assertEquals(1, PureGrammarComposerExtensionLoader.extensions().size());
  }
}

