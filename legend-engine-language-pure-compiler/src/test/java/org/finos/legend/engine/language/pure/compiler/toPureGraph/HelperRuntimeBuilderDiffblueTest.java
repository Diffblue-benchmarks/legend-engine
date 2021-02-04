package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.runtime.EngineRuntime;
import org.finos.legend.engine.shared.core.operational.errorManagement.EngineException;
import org.junit.Test;

public class HelperRuntimeBuilderDiffblueTest {
  @Test
  public void testBuildPureRuntime() {
    // Arrange, Act and Assert
    assertThrows(EngineException.class, () -> HelperRuntimeBuilder.buildPureRuntime(new EngineRuntime(), null));
    assertNull(HelperRuntimeBuilder.buildPureRuntime(null, null));
  }
}

