package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class MappingDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Mapping actualMapping = new Mapping();

    // Assert
    List<AssociationMapping> associationMappingList = actualMapping.associationMappings;
    assertTrue(associationMappingList.isEmpty());
    assertSame(associationMappingList, actualMapping.enumerationMappings);
    assertSame(associationMappingList, actualMapping.tests);
    assertSame(associationMappingList, actualMapping.includedMappings);
  }
}

