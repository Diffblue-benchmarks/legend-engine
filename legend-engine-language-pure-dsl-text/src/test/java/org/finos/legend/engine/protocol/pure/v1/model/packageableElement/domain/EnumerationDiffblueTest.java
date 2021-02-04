package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class EnumerationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Enumeration actualEnumeration = new Enumeration();

    // Assert
    List<TaggedValue> taggedValueList = actualEnumeration.taggedValues;
    assertTrue(taggedValueList.isEmpty());
    assertSame(taggedValueList, actualEnumeration.stereotypes);
  }
}

