package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.Variable;
import org.junit.Test;

public class FunctionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Function actualFunction = new Function();

    // Assert
    List<Variable> variableList = actualFunction.parameters;
    assertTrue(variableList.isEmpty());
    assertSame(variableList, actualFunction.body);
    assertSame(variableList, actualFunction.postConstraints);
    assertSame(variableList, actualFunction.preConstraints);
    assertSame(variableList, actualFunction.taggedValues);
    assertSame(variableList, actualFunction.stereotypes);
  }
}

