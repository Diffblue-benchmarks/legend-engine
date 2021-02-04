package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.xStore;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class XStoreAssociationMappingDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    XStoreAssociationMapping actualXStoreAssociationMapping = new XStoreAssociationMapping();

    // Assert
    List<String> stringList = actualXStoreAssociationMapping.stores;
    assertTrue(stringList.isEmpty());
    assertSame(stringList, actualXStoreAssociationMapping.propertyMappings);
  }
}

