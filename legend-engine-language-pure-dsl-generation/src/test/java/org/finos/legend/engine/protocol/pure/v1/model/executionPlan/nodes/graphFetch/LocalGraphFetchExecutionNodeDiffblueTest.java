package org.finos.legend.engine.protocol.pure.v1.model.executionPlan.nodes.graphFetch;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LocalGraphFetchExecutionNodeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new LocalGraphFetchExecutionNode()).executionNodes.isEmpty());
  }
}

