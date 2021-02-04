package org.finos.legend.engine.language.pure.grammar.to;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class DEPRECATED_PureGrammarComposerCoreDiffblueTest {
  @Test
  public void testBuilderBuild() {
    // Arrange and Act
    DEPRECATED_PureGrammarComposerCore actualBuildResult = DEPRECATED_PureGrammarComposerCore.Builder.newInstance()
        .build();

    // Assert
    assertFalse(actualBuildResult.isFlatDataMappingProcessingModeEnabled());
    assertFalse(actualBuildResult.isVariableInFunctionSignature());
    assertEquals("", actualBuildResult.getIndentationString());
    assertFalse(actualBuildResult.isValueSpecificationExternalParameter());
    assertEquals(PureGrammarComposerContext.RenderStyle.STANDARD, actualBuildResult.getRenderStyle());
  }
}

