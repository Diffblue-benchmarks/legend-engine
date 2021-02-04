package org.finos.legend.engine.external.format.avro.extension;

import static org.junit.Assert.assertTrue;
import org.finos.legend.engine.language.pure.modelManager.ModelManager;
import org.finos.legend.engine.shared.core.deployment.DeploymentMode;
import org.junit.Test;

public class AvroGenerationExtensionDiffblueTest {
  @Test
  public void testGetService() {
    // Arrange
    AvroGenerationExtension avroGenerationExtension = new AvroGenerationExtension();

    // Act and Assert
    assertTrue(avroGenerationExtension.getService(new ModelManager(
        DeploymentMode.INT)) instanceof org.finos.legend.engine.external.format.avro.schema.generations.AvroGenerationService);
  }
}

