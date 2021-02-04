package org.finos.legend.engine.language.pure.grammar.to;

import static org.junit.Assert.assertEquals;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.runtime.EngineRuntime;
import org.junit.Test;

public class HelperRuntimeGrammarComposerDiffblueTest {
  @Test
  public void testRenderRuntimeValue() {
    // Arrange, Act and Assert
    assertEquals("", HelperRuntimeGrammarComposer.renderRuntimeValue(new EngineRuntime(), 1, true, null));
    assertEquals("", HelperRuntimeGrammarComposer.renderRuntimeValue(new EngineRuntime(), 0, true, null));
    assertEquals("\n  mappings:\n  [\n  ];",
        HelperRuntimeGrammarComposer.renderRuntimeValue(new EngineRuntime(), 1, false, null));
    assertEquals("\nmappings:\n[\n];",
        HelperRuntimeGrammarComposer.renderRuntimeValue(new EngineRuntime(), -1, false, null));
  }
}

