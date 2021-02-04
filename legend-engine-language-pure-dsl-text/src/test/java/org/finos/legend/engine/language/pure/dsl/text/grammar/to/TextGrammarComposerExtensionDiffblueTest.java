package org.finos.legend.engine.language.pure.dsl.text.grammar.to;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TextGrammarComposerExtensionDiffblueTest {
  @Test
  public void testGetExtraSectionComposers() {
    // Arrange, Act and Assert
    assertEquals(1, (new TextGrammarComposerExtension()).getExtraSectionComposers().size());
  }

  @Test
  public void testGetExtraFreeSectionComposers() {
    // Arrange, Act and Assert
    assertEquals(1, (new TextGrammarComposerExtension()).getExtraFreeSectionComposers().size());
  }
}

