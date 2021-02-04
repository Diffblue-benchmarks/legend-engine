package org.finos.legend.engine.external.shared.format.generations.description;

import static org.junit.Assert.assertEquals;
import org.finos.legend.pure.generated.Root_meta_pure_generation_metamodel_GenerationParameter_Impl;
import org.junit.Test;

public class GenerationParameterDiffblueTest {
  @Test
  public void testGetDefaultValue() {
    // Arrange, Act and Assert
    assertEquals("null",
        (new GenerationParameter(new Root_meta_pure_generation_metamodel_GenerationParameter_Impl("foo")))
            .getDefaultValue());
    assertEquals("null",
        (new GenerationParameter(new Root_meta_pure_generation_metamodel_GenerationParameter_Impl("description")))
            .getDefaultValue());
  }
}

