package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Property;
import org.junit.Test;

public class MappingClassDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    MappingClass actualMappingClass = new MappingClass();

    // Assert
    List<Property> propertyList = actualMappingClass.properties;
    assertTrue(propertyList.isEmpty());
    assertSame(propertyList, actualMappingClass.originalMilestonedProperties);
    assertSame(propertyList, actualMappingClass.constraints);
    assertSame(propertyList, actualMappingClass.taggedValues);
    assertSame(propertyList, actualMappingClass.stereotypes);
    assertSame(propertyList, actualMappingClass.superTypes);
    assertSame(propertyList, actualMappingClass.qualifiedProperties);
  }
}

