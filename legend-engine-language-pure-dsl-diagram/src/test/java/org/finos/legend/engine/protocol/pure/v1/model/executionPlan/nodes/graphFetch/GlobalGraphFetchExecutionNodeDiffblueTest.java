package org.finos.legend.engine.protocol.pure.v1.model.executionPlan.nodes.graphFetch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GlobalGraphFetchExecutionNodeDiffblueTest {
  @Test
  public void testChildNodes() {
    // Arrange, Act and Assert
    assertEquals(1, (new GlobalGraphFetchExecutionNode()).childNodes().size());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new GlobalGraphFetchExecutionNode()).executionNodes.isEmpty());
  }
}

