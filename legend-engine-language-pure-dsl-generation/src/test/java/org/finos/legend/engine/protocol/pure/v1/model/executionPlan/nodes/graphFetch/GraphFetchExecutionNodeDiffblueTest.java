package org.finos.legend.engine.protocol.pure.v1.model.executionPlan.nodes.graphFetch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GraphFetchExecutionNodeDiffblueTest {
  @Test
  public void testChildNodes() {
    // Arrange, Act and Assert
    assertEquals(2, (new GraphFetchExecutionNode()).childNodes().size());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new GraphFetchExecutionNode()).executionNodes.isEmpty());
  }
}

