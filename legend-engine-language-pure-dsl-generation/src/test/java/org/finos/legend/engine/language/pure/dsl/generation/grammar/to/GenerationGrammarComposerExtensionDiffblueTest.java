package org.finos.legend.engine.language.pure.dsl.generation.grammar.to;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GenerationGrammarComposerExtensionDiffblueTest {
  @Test
  public void testGetExtraSectionComposers() {
    // Arrange, Act and Assert
    assertEquals(2, (new GenerationGrammarComposerExtension()).getExtraSectionComposers().size());
  }

  @Test
  public void testGetExtraFreeSectionComposers() {
    // Arrange, Act and Assert
    assertEquals(2, (new GenerationGrammarComposerExtension()).getExtraFreeSectionComposers().size());
  }
}

