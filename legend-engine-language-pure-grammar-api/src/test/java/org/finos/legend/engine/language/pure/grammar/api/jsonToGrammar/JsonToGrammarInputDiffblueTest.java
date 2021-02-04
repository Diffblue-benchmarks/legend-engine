package org.finos.legend.engine.language.pure.grammar.api.jsonToGrammar;

import static org.junit.Assert.assertEquals;
import org.finos.legend.engine.language.pure.grammar.to.PureGrammarComposerContext;
import org.junit.Test;

public class JsonToGrammarInputDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(PureGrammarComposerContext.RenderStyle.STANDARD, (new JsonToGrammarInput()).renderStyle);
    assertEquals(PureGrammarComposerContext.RenderStyle.STANDARD,
        (new JsonToGrammarInput(new LambdaInput())).renderStyle);
  }
}

