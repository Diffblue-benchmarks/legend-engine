package org.finos.legend.engine.protocol.pure.v1.model.executionPlan.nodes;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GraphFetchM2MExecutionNodeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    GraphFetchM2MExecutionNode actualGraphFetchM2MExecutionNode = new GraphFetchM2MExecutionNode();

    // Assert
    assertTrue(actualGraphFetchM2MExecutionNode.executionNodes.isEmpty());
    assertTrue(actualGraphFetchM2MExecutionNode.enableConstraints);
  }
}

