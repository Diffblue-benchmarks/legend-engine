package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.EnumerationMapping;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.MappingClass;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.aggregationAware.AggregationAwarePropertyMapping;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.xStore.XStorePropertyMapping;
import org.finos.legend.pure.generated.Root_meta_pure_mapping_EmbeddedSetImplementation_Impl;
import org.finos.legend.pure.generated.Root_meta_pure_mapping_MappingClass_Impl;
import org.finos.legend.pure.generated.Root_meta_pure_mapping_Mapping_Impl;
import org.junit.Test;

public class HelperMappingBuilderDiffblueTest {
  @Test
  public void testGetAllIncludedMappings() {
    // Arrange, Act and Assert
    assertEquals(1, HelperMappingBuilder.getAllIncludedMappings(new Root_meta_pure_mapping_Mapping_Impl("42")).size());
  }

  @Test
  public void testGetAllClassMappings() {
    // Arrange, Act and Assert
    assertTrue(HelperMappingBuilder.getAllClassMappings(new Root_meta_pure_mapping_Mapping_Impl("42")).isEmpty());
  }

  @Test
  public void testGetAllClassMappings2() {
    // Arrange
    Root_meta_pure_mapping_Mapping_Impl root_meta_pure_mapping_Mapping_Impl = new Root_meta_pure_mapping_Mapping_Impl(
        "42");
    root_meta_pure_mapping_Mapping_Impl
        ._reverse_classMappings(new Root_meta_pure_mapping_EmbeddedSetImplementation_Impl("42"));

    // Act and Assert
    assertEquals(1, HelperMappingBuilder.getAllClassMappings(root_meta_pure_mapping_Mapping_Impl).size());
  }

  @Test
  public void testGetAllEnumerationMappings() {
    // Arrange, Act and Assert
    assertTrue(HelperMappingBuilder.getAllEnumerationMappings(new Root_meta_pure_mapping_Mapping_Impl("42")).isEmpty());
  }

  @Test
  public void testGetPropertyMappingTargetId() {
    // Arrange, Act and Assert
    assertEquals("", HelperMappingBuilder.getPropertyMappingTargetId(new AggregationAwarePropertyMapping()));
    assertEquals("", HelperMappingBuilder.getPropertyMappingTargetId(new XStorePropertyMapping()));
  }

  @Test
  public void testConvertSourceValues() {
    // Arrange
    EnumerationMapping em = new EnumerationMapping();

    // Act and Assert
    assertTrue(HelperMappingBuilder.convertSourceValues(em, new ArrayList<Object>(), null).isEmpty());
  }

  @Test
  public void testConvertSourceValues2() {
    // Arrange
    EnumerationMapping em = new EnumerationMapping();

    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("e");

    // Act and Assert
    assertEquals(1, HelperMappingBuilder.convertSourceValues(em, objectList, null).size());
  }

  @Test
  public void testConvertSourceValues3() {
    // Arrange
    EnumerationMapping em = new EnumerationMapping();

    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);
    objectList.add("e");

    // Act and Assert
    assertEquals(2, HelperMappingBuilder.convertSourceValues(em, objectList, null).size());
  }

  @Test
  public void testProcessMappingClass() {
    // Arrange
    MappingClass mappingclass = new MappingClass();

    // Act
    Root_meta_pure_mapping_MappingClass_Impl actualProcessMappingClassResult = HelperMappingBuilder
        .processMappingClass(mappingclass, null, new Root_meta_pure_mapping_Mapping_Impl("42"));

    // Assert
    assertTrue(
        actualProcessMappingClassResult._taggedValues instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertNull(actualProcessMappingClassResult._name);
    assertTrue(
        actualProcessMappingClassResult._propertiesFromAssociations instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._multiplicityParameters instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._specializations instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._referenceUsages instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._qualifiedProperties instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._stereotypes instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._qualifiedPropertiesFromAssociations instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._typeParameters instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._originalMilestonedProperties instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._properties instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._constraints instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._localProperties instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(
        actualProcessMappingClassResult._generalizations instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertFalse(actualProcessMappingClassResult.hasBeenValidated());
    assertEquals(" ", actualProcessMappingClassResult.getName());
  }
}

