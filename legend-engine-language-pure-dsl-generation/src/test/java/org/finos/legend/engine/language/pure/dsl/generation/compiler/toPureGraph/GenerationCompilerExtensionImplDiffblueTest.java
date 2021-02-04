package org.finos.legend.engine.language.pure.dsl.generation.compiler.toPureGraph;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GenerationCompilerExtensionImplDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    GenerationCompilerExtensionImpl actualGenerationCompilerExtensionImpl = new GenerationCompilerExtensionImpl();

    // Assert
    assertTrue(
        actualGenerationCompilerExtensionImpl.fileConfigurationsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(
        actualGenerationCompilerExtensionImpl.generationSpecificationsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
  }
}

