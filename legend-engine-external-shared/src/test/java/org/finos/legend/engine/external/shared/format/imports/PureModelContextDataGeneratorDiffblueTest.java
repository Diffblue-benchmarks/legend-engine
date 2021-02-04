package org.finos.legend.engine.external.shared.format.imports;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import org.eclipse.collections.impl.lazy.CompositeIterable;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextData;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.PackageableElement;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.FunctionDefinition;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.type.Class;
import org.finos.legend.pure.m4.tools.ConcurrentHashSet;
import org.junit.Test;

public class PureModelContextDataGeneratorDiffblueTest {
  @Test
  public void testGeneratePureModelContextDataFromClasses() throws RuntimeException {
    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> PureModelContextDataGenerator
        .generatePureModelContextDataFromClasses(new CompositeIterable<? extends PackageableElement>(), "1.0.2", null));
  }

  @Test
  public void testGeneratePureModelContextDataFromClasses2() throws RuntimeException {
    // Arrange and Act
    PureModelContextData actualGeneratePureModelContextDataFromClassesResult = PureModelContextDataGenerator
        .generatePureModelContextDataFromClasses(new CompositeIterable<? extends PackageableElement>(), "vX_X_X", null);

    // Assert
    assertNull(actualGeneratePureModelContextDataFromClassesResult.getOrigin());
    assertNull(actualGeneratePureModelContextDataFromClassesResult.getSerializer());
  }

  @Test
  public void testGeneratePureModelContextDataFromClasses3() throws RuntimeException {
    // Arrange and Act
    PureModelContextData actualGeneratePureModelContextDataFromClassesResult = PureModelContextDataGenerator
        .generatePureModelContextDataFromClasses(new ConcurrentHashSet<? extends PackageableElement>(), "vX_X_X", null);

    // Assert
    assertNull(actualGeneratePureModelContextDataFromClassesResult.getOrigin());
    assertNull(actualGeneratePureModelContextDataFromClassesResult.getSerializer());
  }

  @Test
  public void testGeneratePureModelContextDataFromClassesWithAppliedFunctions() throws RuntimeException {
    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> PureModelContextDataGenerator
        .generatePureModelContextDataFromClassesWithAppliedFunctions(new CompositeIterable<Class<?>>(), "1.0.2", null));
  }

  @Test
  public void testGeneratePureModelContextDataFromClassesWithAppliedFunctions2() throws RuntimeException {
    // Arrange and Act
    PureModelContextData actualGeneratePureModelContextDataFromClassesWithAppliedFunctionsResult = PureModelContextDataGenerator
        .generatePureModelContextDataFromClassesWithAppliedFunctions(new CompositeIterable<Class<?>>(), "vX_X_X", null);

    // Assert
    assertNull(actualGeneratePureModelContextDataFromClassesWithAppliedFunctionsResult.getOrigin());
    assertNull(actualGeneratePureModelContextDataFromClassesWithAppliedFunctionsResult.getSerializer());
  }

  @Test
  public void testGeneratePureModelContextDataFromClassesWithAppliedFunctions3() throws RuntimeException {
    // Arrange and Act
    PureModelContextData actualGeneratePureModelContextDataFromClassesWithAppliedFunctionsResult = PureModelContextDataGenerator
        .generatePureModelContextDataFromClassesWithAppliedFunctions(new ConcurrentHashSet<Class<?>>(), "vX_X_X", null);

    // Assert
    assertNull(actualGeneratePureModelContextDataFromClassesWithAppliedFunctionsResult.getOrigin());
    assertNull(actualGeneratePureModelContextDataFromClassesWithAppliedFunctionsResult.getSerializer());
  }

  @Test
  public void testGeneratePureModelContextDataFromEnumerations() throws RuntimeException {
    // Arrange, Act and Assert
    assertThrows(RuntimeException.class,
        () -> PureModelContextDataGenerator.generatePureModelContextDataFromEnumerations(
            new CompositeIterable<? extends PackageableElement>(), "1.0.2", null));
  }

  @Test
  public void testGeneratePureModelContextDataFromEnumerations2() throws RuntimeException {
    // Arrange and Act
    PureModelContextData actualGeneratePureModelContextDataFromEnumerationsResult = PureModelContextDataGenerator
        .generatePureModelContextDataFromEnumerations(new CompositeIterable<? extends PackageableElement>(), "vX_X_X",
            null);

    // Assert
    assertNull(actualGeneratePureModelContextDataFromEnumerationsResult.getOrigin());
    assertNull(actualGeneratePureModelContextDataFromEnumerationsResult.getSerializer());
  }

  @Test
  public void testGeneratePureModelContextDataFromEnumerations3() throws RuntimeException {
    // Arrange and Act
    PureModelContextData actualGeneratePureModelContextDataFromEnumerationsResult = PureModelContextDataGenerator
        .generatePureModelContextDataFromEnumerations(new ConcurrentHashSet<? extends PackageableElement>(), "vX_X_X",
            null);

    // Assert
    assertNull(actualGeneratePureModelContextDataFromEnumerationsResult.getOrigin());
    assertNull(actualGeneratePureModelContextDataFromEnumerationsResult.getSerializer());
  }

  @Test
  public void testGeneratePureModelContextDataFromFunctions() throws RuntimeException {
    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> PureModelContextDataGenerator
        .generatePureModelContextDataFromFunctions(new CompositeIterable<FunctionDefinition<?>>(), "1.0.2", null));
  }

  @Test
  public void testGeneratePureModelContextDataFromFunctions2() throws RuntimeException {
    // Arrange and Act
    PureModelContextData actualGeneratePureModelContextDataFromFunctionsResult = PureModelContextDataGenerator
        .generatePureModelContextDataFromFunctions(new CompositeIterable<FunctionDefinition<?>>(), "vX_X_X", null);

    // Assert
    assertNull(actualGeneratePureModelContextDataFromFunctionsResult.getOrigin());
    assertNull(actualGeneratePureModelContextDataFromFunctionsResult.getSerializer());
  }

  @Test
  public void testGeneratePureModelContextDataFromFunctions3() throws RuntimeException {
    // Arrange and Act
    PureModelContextData actualGeneratePureModelContextDataFromFunctionsResult = PureModelContextDataGenerator
        .generatePureModelContextDataFromFunctions(new ConcurrentHashSet<FunctionDefinition<?>>(), "vX_X_X", null);

    // Assert
    assertNull(actualGeneratePureModelContextDataFromFunctionsResult.getOrigin());
    assertNull(actualGeneratePureModelContextDataFromFunctionsResult.getSerializer());
  }
}

