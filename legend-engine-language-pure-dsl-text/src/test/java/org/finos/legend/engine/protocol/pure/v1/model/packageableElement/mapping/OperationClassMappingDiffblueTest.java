package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class OperationClassMappingDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    OperationClassMapping actualOperationClassMapping = new OperationClassMapping();

    // Assert
    assertTrue(actualOperationClassMapping.parameters.isEmpty());
    assertTrue(actualOperationClassMapping.root);
  }
}

