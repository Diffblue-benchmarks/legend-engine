package org.finos.legend.engine.external.shared.format.generations;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class GenerationConfigurationDiffblueTest {
  @Test
  public void testGenerationScope() {
    // Arrange
    GenerationConfiguration generationConfiguration = new GenerationConfiguration();

    // Act
    List<String> actualGenerationScopeResult = generationConfiguration.generationScope();

    // Assert
    assertSame(generationConfiguration.scopeElements, actualGenerationScopeResult);
    assertTrue(actualGenerationScopeResult.isEmpty());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new GenerationConfiguration()).scopeElements.isEmpty());
  }
}

