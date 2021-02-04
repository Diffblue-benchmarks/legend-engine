package org.finos.legend.engine.language.pure.compiler.toPureGraph.extension;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.eclipse.collections.impl.lazy.LazyIterableAdapter;
import org.finos.legend.engine.language.pure.compiler.toPureGraph.CoreCompilerExtension;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.PackageableElement;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.PackageableConnection;
import org.junit.Test;

public class CompilerExtensionsDiffblueTest {
  @Test
  public void testGetExtensions() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>()).getExtensions().isEmpty());
  }

  @Test
  public void testGetExtraProcessors() {
    // Arrange, Act and Assert
    assertNull(((LazyIterableAdapter<? extends Processor<?>>) CompilerExtensions
        .fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraProcessors()).getAny());
  }

  @Test
  public void testGetExtraProcessor() {
    // Arrange
    CompilerExtensions fromExtensionsResult = CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>());

    // Act and Assert
    assertNull(fromExtensionsResult.getExtraProcessor(PackageableElement.class));
  }

  @Test
  public void testGetExtraProcessor2() {
    // Arrange
    CompilerExtensions fromExtensionsResult = CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>());

    // Act and Assert
    assertNull(fromExtensionsResult.getExtraProcessor(new PackageableConnection()));
  }

  @Test
  public void testGetExtraClassMappingFirstPassProcessors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraClassMappingFirstPassProcessors()
        .isEmpty());
  }

  @Test
  public void testGetExtraClassMappingSecondPassProcessors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraClassMappingSecondPassProcessors()
        .isEmpty());
  }

  @Test
  public void testGetExtraAssociationMappingProcessors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraAssociationMappingProcessors()
        .isEmpty());
  }

  @Test
  public void testGetExtraConnectionValueProcessors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraConnectionValueProcessors()
        .isEmpty());
  }

  @Test
  public void testGetExtraMappingTestInputDataProcessors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraMappingTestInputDataProcessors()
        .isEmpty());
  }

  @Test
  public void testGetExtraFunctionHandlerDispatchBuilderInfoCollectors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraFunctionHandlerDispatchBuilderInfoCollectors()
        .isEmpty());
  }

  @Test
  public void testGetExtraFunctionExpressionBuilderRegistrationInfoCollectors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraFunctionExpressionBuilderRegistrationInfoCollectors()
        .isEmpty());
  }

  @Test
  public void testGetExtraFunctionHandlerRegistrationInfoCollectors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraFunctionHandlerRegistrationInfoCollectors()
        .isEmpty());
  }

  @Test
  public void testGetExtraValueSpecificationProcessors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraValueSpecificationProcessors()
        .isEmpty());
  }

  @Test
  public void testGetExtraStoreStatBuilders() {
    // Arrange, Act and Assert
    assertTrue(
        CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>()).getExtraStoreStatBuilders().isEmpty());
  }

  @Test
  public void testGetExtraExecutionContextProcessors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraExecutionContextProcessors()
        .isEmpty());
  }

  @Test
  public void testGetExtraElementForPathToElementRegisters() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraElementForPathToElementRegisters()
        .isEmpty());
  }

  @Test
  public void testGetExtraSetImplementationSourceScanners() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>())
        .getExtraSetImplementationSourceScanners()
        .isEmpty());
  }

  @Test
  public void testGetExtraPostValidators() {
    // Arrange, Act and Assert
    assertTrue(
        CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>()).getExtraPostValidators().isEmpty());
  }

  @Test
  public void testSortExtraProcessors() {
    // Arrange, Act and Assert
    assertTrue(CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>()).sortExtraProcessors().isEmpty());
  }

  @Test
  public void testSortExtraProcessors2() {
    // Arrange
    CompilerExtensions fromExtensionsResult = CompilerExtensions.fromExtensions(new ArrayList<CompilerExtension>());

    // Act and Assert
    assertTrue(fromExtensionsResult.sortExtraProcessors(new ArrayList<Processor<?>>()).isEmpty());
  }

  @Test
  public void testFromExtensions() {
    // Arrange, Act and Assert
    Iterable<? extends Processor<?>> extraProcessors = CompilerExtensions.fromExtensions(new CoreCompilerExtension())
        .getExtraProcessors();
    assertTrue(extraProcessors instanceof LazyIterableAdapter);
    assertEquals(0, ((LazyIterableAdapter<? extends Processor<?>>) extraProcessors).toArray().length);
  }

  @Test
  public void testFromExtensions2() {
    // Arrange, Act and Assert
    Iterable<? extends Processor<?>> extraProcessors = CompilerExtensions.fromExtensions().getExtraProcessors();
    assertTrue(extraProcessors instanceof LazyIterableAdapter);
    assertEquals(0, ((LazyIterableAdapter<? extends Processor<?>>) extraProcessors).toArray().length);
  }

  @Test
  public void testFromAvailableExtensions() {
    // Arrange, Act and Assert
    Iterable<? extends Processor<?>> extraProcessors = CompilerExtensions.fromAvailableExtensions()
        .getExtraProcessors();
    assertTrue(extraProcessors instanceof LazyIterableAdapter);
    assertEquals(0, ((LazyIterableAdapter<? extends Processor<?>>) extraProcessors).toArray().length);
  }
}

