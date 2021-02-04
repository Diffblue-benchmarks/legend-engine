package org.finos.legend.engine.language.pure.grammar.to;

import static org.junit.Assert.assertEquals;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextData;
import org.junit.Test;

public class PureGrammarComposerDiffblueTest {
  @Test
  public void testRenderPureModelContextData() {
    // Arrange
    PureGrammarComposer newInstanceResult = PureGrammarComposer
        .newInstance(new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance()));

    // Act and Assert
    assertEquals("", newInstanceResult.renderPureModelContextData(PureModelContextData.newPureModelContextData()));
  }
}

