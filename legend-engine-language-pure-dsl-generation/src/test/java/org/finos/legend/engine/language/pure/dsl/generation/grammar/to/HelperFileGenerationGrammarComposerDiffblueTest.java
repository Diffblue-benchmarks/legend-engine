package org.finos.legend.engine.language.pure.dsl.generation.grammar.to;

import static org.junit.Assert.assertEquals;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.fileGeneration.ConfigurationProperty;
import org.junit.Test;

public class HelperFileGenerationGrammarComposerDiffblueTest {
  @Test
  public void testRenderFileGenerationPropertyValue() {
    // Arrange, Act and Assert
    assertEquals("null: null;",
        HelperFileGenerationGrammarComposer.renderFileGenerationPropertyValue(new ConfigurationProperty()));
  }
}

