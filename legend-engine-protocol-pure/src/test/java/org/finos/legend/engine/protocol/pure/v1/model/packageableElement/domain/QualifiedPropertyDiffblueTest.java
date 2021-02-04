package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class QualifiedPropertyDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    QualifiedProperty actualQualifiedProperty = new QualifiedProperty();

    // Assert
    List<StereotypePtr> stereotypePtrList = actualQualifiedProperty.stereotypes;
    assertTrue(stereotypePtrList.isEmpty());
    assertSame(stereotypePtrList, actualQualifiedProperty.parameters);
    assertSame(stereotypePtrList, actualQualifiedProperty.body);
    assertSame(stereotypePtrList, actualQualifiedProperty.taggedValues);
  }
}

