package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.runtime;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.finos.legend.engine.protocol.pure.v1.model.context.PackageableElementPointer;
import org.junit.Test;

public class LegacyRuntimeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    LegacyRuntime actualLegacyRuntime = new LegacyRuntime();

    // Assert
    List<PackageableElementPointer> packageableElementPointerList = actualLegacyRuntime.mappings;
    assertTrue(packageableElementPointerList.isEmpty());
    assertSame(packageableElementPointerList, actualLegacyRuntime.connections);
  }

  @Test
  public void testToEngineRuntime() {
    // Arrange, Act and Assert
    assertTrue((new LegacyRuntime()).toEngineRuntime().mappings.isEmpty());
  }
}

