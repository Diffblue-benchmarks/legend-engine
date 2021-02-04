package org.finos.legend.engine.language.pure.dsl.generation.config;

import static org.junit.Assert.assertSame;
import org.finos.legend.engine.external.shared.format.generations.GenerationConfiguration;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.fileGeneration.FileGenerationSpecification;
import org.junit.Test;

public class ConfigBuilderDiffblueTest {
  @Test
  public void testSetScopeElements() {
    // Arrange
    FileGenerationSpecification fileGenerationSpecification = new FileGenerationSpecification();
    GenerationConfiguration generationConfiguration = new GenerationConfiguration();

    // Act
    ConfigBuilder.setScopeElements(fileGenerationSpecification, generationConfiguration);

    // Assert
    assertSame(fileGenerationSpecification.scopeElements, generationConfiguration.scopeElements);
  }
}

