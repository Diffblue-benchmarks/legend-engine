package org.finos.legend.engine.language.pure.grammar.from;

import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import org.finos.legend.engine.protocol.pure.v1.model.SourceInformation;
import org.junit.Test;

public class DEPRECATED_PureGrammarParserLibraryDiffblueTest {
  @Test
  public void testGetParser() {
    // Arrange
    DEPRECATED_PureGrammarParserLibrary deprecated_PureGrammarParserLibrary = new DEPRECATED_PureGrammarParserLibrary(
        new ArrayList<DEPRECATED_SectionGrammarParser>());

    // Act and Assert
    assertNull(deprecated_PureGrammarParserLibrary.getParser("Name", new SourceInformation()));
  }
}

