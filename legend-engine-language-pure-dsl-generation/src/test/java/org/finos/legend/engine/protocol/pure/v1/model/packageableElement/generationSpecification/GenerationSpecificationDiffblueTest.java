package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.generationSpecification;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class GenerationSpecificationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    GenerationSpecification actualGenerationSpecification = new GenerationSpecification();

    // Assert
    List<GenerationTreeNode> generationTreeNodeList = actualGenerationSpecification.generationNodes;
    assertTrue(generationTreeNodeList.isEmpty());
    assertSame(generationTreeNodeList, actualGenerationSpecification.fileGenerations);
  }
}

