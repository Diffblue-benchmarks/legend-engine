package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.finos.legend.engine.language.pure.compiler.toPureGraph.extension.CompilerExtensions;
import org.finos.legend.engine.language.pure.compiler.toPureGraph.handlers.Handlers;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextData;
import org.finos.legend.engine.shared.core.deployment.DeploymentMode;
import org.finos.legend.pure.runtime.java.compiled.execution.CompiledExecutionSupport;
import org.junit.Test;
import org.pac4j.core.profile.CommonProfile;

public class PureModelDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    PureModelContextData pure = PureModelContextData.newPureModelContextData();
    ArrayList<CommonProfile> pm = new ArrayList<CommonProfile>();

    // Act
    PureModel actualPureModel = new PureModel(pure, pm, DeploymentMode.INT, new PureModelProcessParameter());

    // Assert
    assertTrue(actualPureModel.mappingsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertEquals(DeploymentMode.INT, actualPureModel.getDeploymentMode());
    assertTrue(actualPureModel.profilesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.sectionsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.runtimesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.typesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    Handlers expectedHandlers = actualPureModel.handlers;
    assertSame(expectedHandlers, actualPureModel.getHandlers());
    assertTrue(actualPureModel.storesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.connectionsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.associationsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.functionsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.typesGenericTypeIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    CompiledExecutionSupport executionSupport = actualPureModel.getExecutionSupport();
    assertNull(executionSupport.getMemoryFileManager());
    assertNull(executionSupport.getSourceRegistry());
    assertNull(executionSupport.getMetadataProvider());
    assertTrue(
        executionSupport.getMetadata() instanceof org.finos.legend.engine.language.pure.compiler.MetadataWrapper);
    assertTrue(executionSupport
        .getExecutionActivityListener() instanceof org.finos.legend.pure.m3.statelistener.VoidExecutionActivityListener);
    assertNull(actualPureModel.getModelClasses().getFirst());
    CompilerExtensions compilerExtensions = actualPureModel.extensions;
    assertTrue(
        compilerExtensions.getExtraProcessors() instanceof org.eclipse.collections.impl.lazy.LazyIterableAdapter);
    assertNull(executionSupport.getIncrementalCompiler());
    assertTrue(
        executionSupport.getCodeStorage() instanceof org.finos.legend.pure.m3.serialization.filesystem.PureCodeStorage);
    assertSame(compilerExtensions, actualPureModel.getContext().getCompilerExtensions());
    assertTrue(executionSupport
        .getMetadataAccessor() instanceof org.finos.legend.pure.runtime.java.compiled.metadata.MetadataHolder);
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<CommonProfile> pm = new ArrayList<CommonProfile>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> new PureModel(null, pm, DeploymentMode.INT, new PureModelProcessParameter()));
  }

  @Test
  public void testConstructor3() {
    // Arrange
    PureModelContextData pure = PureModelContextData.newPureModelContextData();

    // Act and Assert
    assertThrows(RuntimeException.class, () -> new PureModel(pure, new ArrayList<CommonProfile>(), DeploymentMode.INT,
        (PureModelProcessParameter) null));
  }

  @Test
  public void testConstructor4() {
    // Arrange
    PureModelContextData pure = PureModelContextData.newPureModelContextData();
    ArrayList<CommonProfile> pm = new ArrayList<CommonProfile>();

    // Act
    PureModel actualPureModel = new PureModel(pure, pm, DeploymentMode.INT, new PureModelProcessParameter("java.text"));

    // Assert
    assertTrue(actualPureModel.mappingsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertEquals(DeploymentMode.INT, actualPureModel.getDeploymentMode());
    assertTrue(actualPureModel.profilesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.sectionsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.runtimesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.typesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    Handlers expectedHandlers = actualPureModel.handlers;
    assertSame(expectedHandlers, actualPureModel.getHandlers());
    assertTrue(actualPureModel.storesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.connectionsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.associationsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.functionsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.typesGenericTypeIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    CompiledExecutionSupport executionSupport = actualPureModel.getExecutionSupport();
    assertNull(executionSupport.getMemoryFileManager());
    assertNull(executionSupport.getSourceRegistry());
    assertNull(executionSupport.getMetadataProvider());
    assertTrue(
        executionSupport.getMetadata() instanceof org.finos.legend.engine.language.pure.compiler.MetadataWrapper);
    assertTrue(executionSupport
        .getExecutionActivityListener() instanceof org.finos.legend.pure.m3.statelistener.VoidExecutionActivityListener);
    assertNull(actualPureModel.getModelClasses().getFirst());
    CompilerExtensions compilerExtensions = actualPureModel.extensions;
    assertTrue(
        compilerExtensions.getExtraProcessors() instanceof org.eclipse.collections.impl.lazy.LazyIterableAdapter);
    assertNull(executionSupport.getIncrementalCompiler());
    assertTrue(
        executionSupport.getCodeStorage() instanceof org.finos.legend.pure.m3.serialization.filesystem.PureCodeStorage);
    assertSame(compilerExtensions, actualPureModel.getContext().getCompilerExtensions());
    assertTrue(executionSupport
        .getMetadataAccessor() instanceof org.finos.legend.pure.runtime.java.compiled.metadata.MetadataHolder);
  }

  @Test
  public void testConstructor5() {
    // Arrange
    PureModelContextData pure = PureModelContextData.newPureModelContextData();
    ArrayList<CommonProfile> pm = new ArrayList<CommonProfile>();

    // Act
    PureModel actualPureModel = new PureModel(pure, pm, DeploymentMode.INT, new PureModelProcessParameter(""));

    // Assert
    assertTrue(actualPureModel.mappingsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertEquals(DeploymentMode.INT, actualPureModel.getDeploymentMode());
    assertTrue(actualPureModel.profilesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.sectionsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.runtimesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.typesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    Handlers expectedHandlers = actualPureModel.handlers;
    assertSame(expectedHandlers, actualPureModel.getHandlers());
    assertTrue(actualPureModel.storesIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.connectionsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.associationsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.functionsIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualPureModel.typesGenericTypeIndex instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    CompiledExecutionSupport executionSupport = actualPureModel.getExecutionSupport();
    assertNull(executionSupport.getMemoryFileManager());
    assertNull(executionSupport.getSourceRegistry());
    assertNull(executionSupport.getMetadataProvider());
    assertTrue(
        executionSupport.getMetadata() instanceof org.finos.legend.engine.language.pure.compiler.MetadataWrapper);
    assertTrue(executionSupport
        .getExecutionActivityListener() instanceof org.finos.legend.pure.m3.statelistener.VoidExecutionActivityListener);
    assertNull(actualPureModel.getModelClasses().getFirst());
    CompilerExtensions compilerExtensions = actualPureModel.extensions;
    assertTrue(
        compilerExtensions.getExtraProcessors() instanceof org.eclipse.collections.impl.lazy.LazyIterableAdapter);
    assertNull(executionSupport.getIncrementalCompiler());
    assertTrue(
        executionSupport.getCodeStorage() instanceof org.finos.legend.pure.m3.serialization.filesystem.PureCodeStorage);
    assertSame(compilerExtensions, actualPureModel.getContext().getCompilerExtensions());
    assertTrue(executionSupport
        .getMetadataAccessor() instanceof org.finos.legend.pure.runtime.java.compiled.metadata.MetadataHolder);
  }
}

