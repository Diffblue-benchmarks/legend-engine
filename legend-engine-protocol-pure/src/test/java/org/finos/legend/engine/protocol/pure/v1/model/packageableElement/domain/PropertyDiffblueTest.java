package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class PropertyDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Property actualProperty = new Property();

    // Assert
    List<TaggedValue> taggedValueList = actualProperty.taggedValues;
    assertTrue(taggedValueList.isEmpty());
    assertSame(taggedValueList, actualProperty.stereotypes);
  }
}

