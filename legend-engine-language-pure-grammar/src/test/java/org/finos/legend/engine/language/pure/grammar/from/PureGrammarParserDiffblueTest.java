package org.finos.legend.engine.language.pure.grammar.from;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.finos.legend.engine.protocol.pure.v1.model.SourceInformation;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextData;
import org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.ValueSpecification;
import org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw.Enum;
import org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw.Lambda;
import org.junit.Test;

public class PureGrammarParserDiffblueTest {
  @Test
  public void testParseLambda() {
    // Arrange and Act
    Lambda actualParseLambdaResult = PureGrammarParser.newInstance().parseLambda("Code", "42");

    // Assert
    assertTrue(actualParseLambdaResult.parameters.isEmpty());
    List<ValueSpecification> valueSpecificationList = actualParseLambdaResult.body;
    assertEquals(1, valueSpecificationList.size());
    SourceInformation sourceInformation = actualParseLambdaResult.sourceInformation;
    assertEquals(1, sourceInformation.endLine);
    assertEquals("42", sourceInformation.sourceId);
    assertEquals(1, sourceInformation.startLine);
    assertEquals(1, sourceInformation.startColumn);
    assertEquals(4, sourceInformation.endColumn);
    assertEquals("Code", ((Enum) valueSpecificationList.get(0)).fullPath);
    SourceInformation sourceInformation1 = ((Enum) valueSpecificationList.get(0)).sourceInformation;
    assertEquals(4, sourceInformation1.endColumn);
    assertEquals(1, sourceInformation1.endLine);
    assertEquals("42", sourceInformation1.sourceId);
    assertEquals(1, sourceInformation1.startLine);
    assertEquals(1, sourceInformation1.startColumn);
  }

  @Test
  public void testParseModel() {
    // Arrange and Act
    PureModelContextData actualParseModelResult = PureGrammarParser.newInstance().parseModel("\n###Pure\n");

    // Assert
    assertNull(actualParseModelResult.getOrigin());
    assertNull(actualParseModelResult.getSerializer());
  }
}

