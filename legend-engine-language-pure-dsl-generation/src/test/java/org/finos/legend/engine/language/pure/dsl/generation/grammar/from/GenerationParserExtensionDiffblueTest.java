package org.finos.legend.engine.language.pure.dsl.generation.grammar.from;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GenerationParserExtensionDiffblueTest {
  @Test
  public void testGetExtraSectionParsers() {
    // Arrange, Act and Assert
    assertEquals(2, (new GenerationParserExtension()).getExtraSectionParsers().size());
  }
}

