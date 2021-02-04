package org.finos.legend.engine.language.pure.grammar.from;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.finos.legend.engine.language.pure.grammar.from.extension.PureGrammarParserExtension;
import org.junit.Test;

public class PureGrammarParserContextDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    List<PureGrammarParserExtension> pureGrammarParserExtensionList = (new PureGrammarParserContext()).extensions;
    assertTrue(pureGrammarParserExtensionList instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertEquals(1, pureGrammarParserExtensionList.size());
  }

  @Test
  public void testConstructor2() {
    // Arrange, Act and Assert
    List<PureGrammarParserExtension> pureGrammarParserExtensionList = (new PureGrammarParserContext(
        new HashMap<String, Map<String, String>>())).extensions;
    assertTrue(pureGrammarParserExtensionList instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertEquals(1, pureGrammarParserExtensionList.size());
  }
}

