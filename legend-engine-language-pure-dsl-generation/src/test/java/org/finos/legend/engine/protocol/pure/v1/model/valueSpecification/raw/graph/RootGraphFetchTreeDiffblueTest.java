package org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw.graph;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RootGraphFetchTreeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new RootGraphFetchTree()).subTrees.isEmpty());
  }
}

