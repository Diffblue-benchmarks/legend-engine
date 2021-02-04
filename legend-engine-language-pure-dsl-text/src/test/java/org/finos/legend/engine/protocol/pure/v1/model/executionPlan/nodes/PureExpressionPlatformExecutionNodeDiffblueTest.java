package org.finos.legend.engine.protocol.pure.v1.model.executionPlan.nodes;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PureExpressionPlatformExecutionNodeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new PureExpressionPlatformExecutionNode()).executionNodes.isEmpty());
  }
}

