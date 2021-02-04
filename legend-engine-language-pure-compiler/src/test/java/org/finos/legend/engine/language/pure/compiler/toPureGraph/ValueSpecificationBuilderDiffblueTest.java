package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertTrue;
import org.eclipse.collections.impl.list.mutable.MultiReaderFastList;
import org.finos.legend.pure.generated.Root_meta_pure_mapping_MappingClass_Impl;
import org.junit.Test;

public class ValueSpecificationBuilderDiffblueTest {
  @Test
  public void testTypeAndListConstructor() {
    // Arrange
    MultiReaderFastList<String> openVariables = new MultiReaderFastList<String>();
    ValueSpecificationBuilder valueSpecificationBuilder = new ValueSpecificationBuilder(null, openVariables,
        new ProcessingContext("First Tag"));

    // Act
    ValueSpecificationBuilder.TypeAndList actualTypeAndList = valueSpecificationBuilder.new TypeAndList(
        new Root_meta_pure_mapping_MappingClass_Impl<Object>("42"));

    // Assert
    assertTrue(actualTypeAndList.currentClass instanceof Root_meta_pure_mapping_MappingClass_Impl);
    assertTrue(actualTypeAndList.result instanceof org.eclipse.collections.impl.list.mutable.FastList);
  }
}

