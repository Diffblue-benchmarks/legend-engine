package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class AssociationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Association actualAssociation = new Association();

    // Assert
    List<QualifiedProperty> qualifiedPropertyList = actualAssociation.qualifiedProperties;
    assertTrue(qualifiedPropertyList.isEmpty());
    assertSame(qualifiedPropertyList, actualAssociation.originalMilestonedProperties);
    assertSame(qualifiedPropertyList, actualAssociation.taggedValues);
    assertSame(qualifiedPropertyList, actualAssociation.stereotypes);
    assertSame(qualifiedPropertyList, actualAssociation.properties);
  }
}

