package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class ClassDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Class actualResultClass = new Class();

    // Assert
    List<Property> propertyList = actualResultClass.properties;
    assertTrue(propertyList.isEmpty());
    assertSame(propertyList, actualResultClass.constraints);
    assertSame(propertyList, actualResultClass.taggedValues);
    assertSame(propertyList, actualResultClass.stereotypes);
    assertSame(propertyList, actualResultClass.superTypes);
    assertSame(propertyList, actualResultClass.qualifiedProperties);
    assertSame(propertyList, actualResultClass.originalMilestonedProperties);
  }
}

