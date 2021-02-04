package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.runtime;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class StoreConnectionsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    StoreConnections actualStoreConnections = new StoreConnections();

    // Assert
    List<IdentifiedConnection> identifiedConnectionList = actualStoreConnections.storeConnections;
    assertTrue(identifiedConnectionList instanceof java.util.ArrayList);
    assertNull(actualStoreConnections.sourceInformation);
    assertTrue(identifiedConnectionList.isEmpty());
    assertNull(actualStoreConnections.store);
  }
}

