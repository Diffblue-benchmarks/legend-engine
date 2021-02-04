package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.store.modelToModel.mapping;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PureInstanceClassMappingDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    PureInstanceClassMapping actualPureInstanceClassMapping = new PureInstanceClassMapping();

    // Assert
    assertTrue(actualPureInstanceClassMapping.propertyMappings.isEmpty());
    assertTrue(actualPureInstanceClassMapping.root);
  }
}

