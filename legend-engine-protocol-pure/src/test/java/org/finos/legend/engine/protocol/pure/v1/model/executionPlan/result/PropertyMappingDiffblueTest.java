package org.finos.legend.engine.protocol.pure.v1.model.executionPlan.result;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PropertyMappingDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new PropertyMapping()).enumMapping.isEmpty());
  }
}

