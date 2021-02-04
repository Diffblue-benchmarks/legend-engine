package org.finos.legend.engine.protocol.pure.v1.model.executionPlan.nodes.graphFetch.store.inMemory;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StoreStreamReadingExecutionNodeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new StoreStreamReadingExecutionNode()).executionNodes.isEmpty());
  }
}

