package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertNull;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.aggregationAware.AggregationAwareClassMapping;
import org.finos.legend.pure.generated.Root_meta_pure_mapping_Mapping_Impl;
import org.junit.Test;

public class ClassMappingSecondPassBuilderDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    ClassMappingSecondPassBuilder classMappingSecondPassBuilder = new ClassMappingSecondPassBuilder(null,
        new Root_meta_pure_mapping_Mapping_Impl("42"));

    // Act and Assert
    assertNull(classMappingSecondPassBuilder.visit(new AggregationAwareClassMapping()));
  }
}

