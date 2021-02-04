package org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw.graph;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class PropertyGraphFetchTreeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    PropertyGraphFetchTree actualPropertyGraphFetchTree = new PropertyGraphFetchTree();

    // Assert
    List<GraphFetchTree> graphFetchTreeList = actualPropertyGraphFetchTree.subTrees;
    assertTrue(graphFetchTreeList.isEmpty());
    assertSame(graphFetchTreeList, actualPropertyGraphFetchTree.parameters);
    assertNull(actualPropertyGraphFetchTree.alias);
  }
}

