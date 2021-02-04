package org.finos.legend.engine.external.shared.format.generations.description;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.collections.impl.lazy.CompositeIterable;
import org.eclipse.collections.impl.list.mutable.CompositeFastList;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.finos.legend.pure.generated.Root_meta_pure_generation_metamodel_GenerationParameter;
import org.junit.Test;

public class FileGenerationDescriptionDiffblueTest {
  @Test
  public void testExtractGenerationProperties() {
    // Arrange, Act and Assert
    assertTrue(
        FileGenerationDescription
            .extractGenerationProperties(
                new CompositeIterable<? extends Root_meta_pure_generation_metamodel_GenerationParameter>())
            .isEmpty());
    assertTrue(FileGenerationDescription.extractGenerationProperties(null).isEmpty());
    assertTrue(FileGenerationDescription
        .extractGenerationProperties(new FastList<GenerationProperty>(new ArrayList<GenerationProperty>()))
        .isEmpty());
  }

  @Test
  public void testExtractGenerationProperties2() {
    // Arrange
    CompositeFastList<GenerationProperty> generationPropertyList = new CompositeFastList<GenerationProperty>();
    generationPropertyList.add(null);

    // Act
    List<GenerationProperty> actualExtractGenerationPropertiesResult = FileGenerationDescription
        .extractGenerationProperties(generationPropertyList);

    // Assert
    assertEquals(1, actualExtractGenerationPropertiesResult.size());
    assertNull(((GenerationParameter) actualExtractGenerationPropertiesResult.get(0)).parameter);
  }
}

