package org.finos.legend.engine.language.pure.grammar.from.mapping;

import static org.junit.Assert.assertTrue;
import org.antlr.v4.runtime.ParserRuleContext;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.enumerationMapping.EnumerationMappingParserGrammar;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.EnumerationMapping;
import org.junit.Test;

public class EnumerationMappingParseTreeWalkerDiffblueTest {
  @Test
  public void testVisitEnumerationMapping() {
    // Arrange
    EnumerationMappingParseTreeWalker enumerationMappingParseTreeWalker = new EnumerationMappingParseTreeWalker(null);
    EnumerationMappingParserGrammar.EnumerationMappingContext ctx = new EnumerationMappingParserGrammar.EnumerationMappingContext(
        new ParserRuleContext(), 1);
    EnumerationMapping enumerationMapping = new EnumerationMapping();

    // Act
    enumerationMappingParseTreeWalker.visitEnumerationMapping(ctx, enumerationMapping);

    // Assert
    assertTrue(enumerationMapping.enumValueMappings instanceof org.eclipse.collections.impl.list.mutable.FastList);
  }
}

