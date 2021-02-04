package org.finos.legend.engine.language.pure.grammar.from;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CorePureGrammarParserDiffblueTest {
  @Test
  public void testGetExtraConnectionParsers() {
    // Arrange, Act and Assert
    assertEquals(1, (new CorePureGrammarParser()).getExtraConnectionParsers().size());
  }

  @Test
  public void testGetExtraMappingElementParsers() {
    // Arrange, Act and Assert
    assertEquals(3, (new CorePureGrammarParser()).getExtraMappingElementParsers().size());
  }
}

