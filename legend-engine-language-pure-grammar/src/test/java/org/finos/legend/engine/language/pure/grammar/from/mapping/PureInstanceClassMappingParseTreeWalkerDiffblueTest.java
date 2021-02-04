package org.finos.legend.engine.language.pure.grammar.from.mapping;

import static org.junit.Assert.assertTrue;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.finos.legend.engine.language.pure.grammar.from.PureGrammarParserContext;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.MappingParserGrammar;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.pureInstanceClassMapping.PureInstanceClassMappingParserGrammar;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.store.modelToModel.mapping.PureInstanceClassMapping;
import org.junit.Test;

public class PureInstanceClassMappingParseTreeWalkerDiffblueTest {
  @Test
  public void testVisitPureInstanceClassMapping() {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();
    PureInstanceClassMappingParseTreeWalker pureInstanceClassMappingParseTreeWalker = new PureInstanceClassMappingParseTreeWalker(
        null, input, new PureGrammarParserContext());
    PureInstanceClassMappingParserGrammar.PureInstanceClassMappingContext ctx = new PureInstanceClassMappingParserGrammar.PureInstanceClassMappingContext(
        new ParserRuleContext(), 1);
    MappingParserGrammar.MappingElementContext classMappingContext = new MappingParserGrammar.MappingElementContext(
        new ParserRuleContext(), 1);
    PureInstanceClassMapping pureInstanceClassMapping = new PureInstanceClassMapping();

    // Act
    pureInstanceClassMappingParseTreeWalker.visitPureInstanceClassMapping(ctx, classMappingContext,
        pureInstanceClassMapping);

    // Assert
    assertTrue(pureInstanceClassMapping.propertyMappings instanceof org.eclipse.collections.impl.list.mutable.FastList);
  }
}

