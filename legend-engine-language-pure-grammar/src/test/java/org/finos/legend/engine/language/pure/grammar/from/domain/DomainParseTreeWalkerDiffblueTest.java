package org.finos.legend.engine.language.pure.grammar.from.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import org.antlr.v4.runtime.ParserRuleContext;
import org.finos.legend.engine.language.pure.grammar.from.PureGrammarParserContext;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.domain.DomainParserGrammar;
import org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.Variable;
import org.junit.Test;

public class DomainParseTreeWalkerDiffblueTest {
  @Test
  public void testBuildDivide() {
    // Arrange
    DomainParseTreeWalker domainParseTreeWalker = new DomainParseTreeWalker(null, new PureGrammarParserContext(),
        "Flat Data Record Type Source");
    DomainParserGrammar.ArithmeticPartContext ctx = new DomainParserGrammar.ArithmeticPartContext(
        new ParserRuleContext(), 1);
    Variable initialValue = new Variable();
    ArrayList<String> typeParametersNames = new ArrayList<String>();

    // Act and Assert
    assertNull(domainParseTreeWalker.buildDivide(ctx, "Op", initialValue, "Expr Name", typeParametersNames,
        new DomainParseTreeWalker.LambdaContext("42"), "Space", true, true));
  }

  @Test
  public void testLambdaContextGetLambdaFunctionUniqueName() {
    // Arrange, Act and Assert
    assertEquals("42$0", (new DomainParseTreeWalker.LambdaContext("42")).getLambdaFunctionUniqueName());
  }
}

