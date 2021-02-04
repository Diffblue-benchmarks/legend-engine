package org.finos.legend.engine.language.pure.dsl.diagram.grammar.to;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DiagramGrammarComposerExtensionDiffblueTest {
  @Test
  public void testGetExtraSectionComposers() {
    // Arrange, Act and Assert
    assertEquals(1, (new DiagramGrammarComposerExtension()).getExtraSectionComposers().size());
  }

  @Test
  public void testGetExtraFreeSectionComposers() {
    // Arrange, Act and Assert
    assertEquals(1, (new DiagramGrammarComposerExtension()).getExtraFreeSectionComposers().size());
  }
}

