package org.finos.legend.engine.external.format.protobuf.extension;

import static org.junit.Assert.assertTrue;
import org.finos.legend.engine.language.pure.modelManager.ModelManager;
import org.finos.legend.engine.shared.core.deployment.DeploymentMode;
import org.junit.Test;

public class ProtobufGenerationExtensionDiffblueTest {
  @Test
  public void testGetService() {
    // Arrange
    ProtobufGenerationExtension protobufGenerationExtension = new ProtobufGenerationExtension();

    // Act and Assert
    assertTrue(protobufGenerationExtension.getService(new ModelManager(
        DeploymentMode.INT)) instanceof org.finos.legend.engine.external.format.protobuf.schema.generations.ProtobufGenerationService);
  }
}

