package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class EnumValueDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    EnumValue actualEnumValue = new EnumValue();

    // Assert
    List<TaggedValue> taggedValueList = actualEnumValue.taggedValues;
    assertTrue(taggedValueList.isEmpty());
    assertSame(taggedValueList, actualEnumValue.stereotypes);
  }
}

