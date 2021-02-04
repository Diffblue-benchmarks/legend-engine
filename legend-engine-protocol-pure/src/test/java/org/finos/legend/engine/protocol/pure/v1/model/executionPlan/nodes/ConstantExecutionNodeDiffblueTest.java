package org.finos.legend.engine.protocol.pure.v1.model.executionPlan.nodes;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConstantExecutionNodeDiffblueTest {
  @Test
  public void testValues() {
    // Arrange, Act and Assert
    assertNull((new ConstantExecutionNode()).values());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new ConstantExecutionNode()).executionNodes.isEmpty());
  }
}

