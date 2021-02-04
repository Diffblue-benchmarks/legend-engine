package org.finos.legend.engine.language.pure.grammar.api.grammarToJson;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.junit.Test;

public class GrammarToJsonInputDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new GrammarToJsonInput()).isolatedLambdas.isEmpty());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();

    // Act and Assert
    assertSame((new GrammarToJsonInput(stringStringMap)).isolatedLambdas, stringStringMap);
  }
}

