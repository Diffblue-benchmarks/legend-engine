package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DomainDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Domain actualDomain = new Domain();

    // Assert
    assertTrue(actualDomain.profiles instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(actualDomain.classes instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(actualDomain.functions instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(actualDomain.measures instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(actualDomain.enums instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(actualDomain.associations instanceof org.eclipse.collections.impl.list.mutable.FastList);
  }
}

