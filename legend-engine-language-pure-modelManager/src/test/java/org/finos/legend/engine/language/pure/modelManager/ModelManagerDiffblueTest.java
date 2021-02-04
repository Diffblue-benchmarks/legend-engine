package org.finos.legend.engine.language.pure.modelManager;

import static org.junit.Assert.assertEquals;
import org.finos.legend.engine.shared.core.deployment.DeploymentMode;
import org.junit.Test;

public class ModelManagerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ModelLoader[] modelLoaderArray = new ModelLoader[]{};

    // Act
    new ModelManager(DeploymentMode.INT, modelLoaderArray);

    // Assert
    assertEquals(0, modelLoaderArray.length);
  }
}

