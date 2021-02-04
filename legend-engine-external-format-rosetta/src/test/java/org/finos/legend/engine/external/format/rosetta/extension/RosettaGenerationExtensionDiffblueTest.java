package org.finos.legend.engine.external.format.rosetta.extension;

import static org.junit.Assert.assertTrue;
import org.finos.legend.engine.language.pure.modelManager.ModelManager;
import org.finos.legend.engine.shared.core.deployment.DeploymentMode;
import org.junit.Test;

public class RosettaGenerationExtensionDiffblueTest {
  @Test
  public void testGetService() {
    // Arrange
    RosettaGenerationExtension rosettaGenerationExtension = new RosettaGenerationExtension();

    // Act and Assert
    assertTrue(rosettaGenerationExtension.getService(new ModelManager(
        DeploymentMode.INT)) instanceof org.finos.legend.engine.external.format.rosetta.schema.generations.RosettaGenerationService);
  }
}

