package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.fasterxml.jackson.databind.util.AccessPattern;
import org.junit.Test;

public class EnumValueMappingSourceValueDeserializerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    EnumValueMappingSourceValueDeserializer actualEnumValueMappingSourceValueDeserializer = new EnumValueMappingSourceValueDeserializer();

    // Assert
    assertNull(actualEnumValueMappingSourceValueDeserializer.getObjectIdReader());
    assertFalse(actualEnumValueMappingSourceValueDeserializer.isCachable());
    assertNull(actualEnumValueMappingSourceValueDeserializer.getDelegatee());
    assertNull(actualEnumValueMappingSourceValueDeserializer.getKnownPropertyNames());
    assertNull(actualEnumValueMappingSourceValueDeserializer.getNullValue());
    assertEquals(AccessPattern.CONSTANT, actualEnumValueMappingSourceValueDeserializer.getNullAccessPattern());
    assertNull(actualEnumValueMappingSourceValueDeserializer.getEmptyValue());
    assertEquals(AccessPattern.DYNAMIC, actualEnumValueMappingSourceValueDeserializer.getEmptyAccessPattern());
  }
}

