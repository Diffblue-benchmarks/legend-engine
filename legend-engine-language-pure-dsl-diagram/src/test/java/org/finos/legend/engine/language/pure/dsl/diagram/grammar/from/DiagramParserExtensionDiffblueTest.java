package org.finos.legend.engine.language.pure.dsl.diagram.grammar.from;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DiagramParserExtensionDiffblueTest {
  @Test
  public void testGetExtraSectionParsers() {
    // Arrange, Act and Assert
    assertEquals(1, (new DiagramParserExtension()).getExtraSectionParsers().size());
  }
}

