package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class EnumValueMappingSourceValueSerializerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    EnumValueMappingSourceValueSerializer actualEnumValueMappingSourceValueSerializer = new EnumValueMappingSourceValueSerializer();

    // Assert
    assertNull(actualEnumValueMappingSourceValueSerializer.getDelegatee());
    assertFalse(actualEnumValueMappingSourceValueSerializer.isUnwrappingSerializer());
  }
}

