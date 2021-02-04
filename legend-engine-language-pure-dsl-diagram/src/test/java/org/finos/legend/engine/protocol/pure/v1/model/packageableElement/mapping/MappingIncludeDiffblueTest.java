package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MappingIncludeDiffblueTest {
  @Test
  public void testGetIncludedMapping() {
    // Arrange, Act and Assert
    assertEquals("null::null", (new MappingInclude()).getIncludedMapping());
  }

  @Test
  public void testGetIncludedMapping2() {
    // Arrange
    MappingInclude mappingInclude = new MappingInclude();
    mappingInclude.setIncludedMapping("::");

    // Act and Assert
    assertEquals("::", mappingInclude.getIncludedMapping());
  }

  @Test
  public void testSetIncludedMapping() {
    // Arrange
    MappingInclude mappingInclude = new MappingInclude();

    // Act
    mappingInclude.setIncludedMapping("Included Mapping");

    // Assert
    assertEquals("Included Mapping", mappingInclude.getIncludedMapping());
  }
}

