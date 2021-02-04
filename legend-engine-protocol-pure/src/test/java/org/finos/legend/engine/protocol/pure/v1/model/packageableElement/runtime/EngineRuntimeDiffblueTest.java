package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.runtime;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.finos.legend.engine.protocol.pure.v1.model.context.PackageableElementPointer;
import org.junit.Test;

public class EngineRuntimeDiffblueTest {
  @Test
  public void testGetStoreConnections() {
    // Arrange, Act and Assert
    assertNull((new EngineRuntime()).getStoreConnections("Store"));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    EngineRuntime actualEngineRuntime = new EngineRuntime();

    // Assert
    List<PackageableElementPointer> packageableElementPointerList = actualEngineRuntime.mappings;
    assertTrue(packageableElementPointerList instanceof java.util.ArrayList);
    List<StoreConnections> storeConnectionsList = actualEngineRuntime.connections;
    assertTrue(storeConnectionsList instanceof java.util.ArrayList);
    assertTrue(packageableElementPointerList.isEmpty());
    assertTrue(storeConnectionsList.isEmpty());
    assertNull(actualEngineRuntime.sourceInformation);
  }
}

