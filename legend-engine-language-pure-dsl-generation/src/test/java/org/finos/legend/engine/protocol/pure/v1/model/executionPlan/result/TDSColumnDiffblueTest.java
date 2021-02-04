package org.finos.legend.engine.protocol.pure.v1.model.executionPlan.result;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TDSColumnDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new TDSColumn()).enumMapping.isEmpty());
  }

  @Test
  public void testCopyWithoutEnumMapping() {
    // Arrange and Act
    TDSColumn actualCopyWithoutEnumMappingResult = (new TDSColumn()).copyWithoutEnumMapping();

    // Assert
    assertNull(actualCopyWithoutEnumMappingResult.relationalType);
    assertNull(actualCopyWithoutEnumMappingResult.type);
    assertNull(actualCopyWithoutEnumMappingResult.name);
    assertNull(actualCopyWithoutEnumMappingResult.enumMapping);
    assertNull(actualCopyWithoutEnumMappingResult.doc);
  }
}

