package org.finos.legend.engine.language.pure.grammar.to;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.Set;
import org.eclipse.collections.api.block.function.Function2;
import org.eclipse.collections.api.block.function.Function3;
import org.eclipse.collections.api.tuple.Pair;
import org.finos.legend.engine.language.pure.grammar.to.extension.PureGrammarComposerExtension;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.PackageableElement;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.Connection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.AssociationMapping;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.ClassMapping;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.mappingTest.InputData;
import org.junit.Test;

public class PureGrammarComposerContextDiffblueTest {
  @Test
  public void testBuilderBuild() {
    // Arrange and Act
    PureGrammarComposerContext actualBuildResult = PureGrammarComposerContext.Builder.newInstance().build();

    // Assert
    assertEquals(PureGrammarComposerContext.RenderStyle.STANDARD, actualBuildResult.getRenderStyle());
    List<Function3<List<PackageableElement>, PureGrammarComposerContext, String, String>> function3List = actualBuildResult.extraSectionComposers;
    assertTrue(function3List instanceof org.eclipse.collections.impl.list.mutable.FastList);
    List<Function3<Set<PackageableElement>, PureGrammarComposerContext, List<String>, PureGrammarComposerExtension.PureFreeSectionGrammarComposerResult>> function3List1 = actualBuildResult.extraFreeSectionComposers;
    assertTrue(function3List1 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(function3List.isEmpty());
    assertTrue(function3List1.isEmpty());
    List<PureGrammarComposerExtension> pureGrammarComposerExtensionList = actualBuildResult.extensions;
    assertTrue(pureGrammarComposerExtensionList instanceof org.eclipse.collections.impl.list.mutable.FastList);
    List<Function2<Connection, PureGrammarComposerContext, Pair<String, String>>> function2List = actualBuildResult.extraConnectionValueComposers;
    assertTrue(function2List instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertEquals(1, pureGrammarComposerExtensionList.size());
    assertTrue(function2List.isEmpty());
    List<Function2<ClassMapping, PureGrammarComposerContext, String>> function2List1 = actualBuildResult.extraClassMappingComposers;
    assertTrue(function2List1 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    List<Function2<InputData, PureGrammarComposerContext, String>> function2List2 = actualBuildResult.extraMappingTestInputDataComposers;
    assertTrue(function2List2 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(function2List1.isEmpty());
    assertTrue(function2List2.isEmpty());
    List<Function2<AssociationMapping, PureGrammarComposerContext, String>> function2List3 = actualBuildResult.extraAssociationMappingComposers;
    assertTrue(function2List3 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertFalse(actualBuildResult.isFlatDataMappingProcessingModeEnabled());
    assertTrue(function2List3.isEmpty());
    assertFalse(actualBuildResult.isVariableInFunctionSignature());
    assertEquals("", actualBuildResult.getIndentationString());
    assertFalse(actualBuildResult.isValueSpecificationExternalParameter());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    PureGrammarComposerContext actualPureGrammarComposerContext = new PureGrammarComposerContext(
        PureGrammarComposerContext.Builder.newInstance());

    // Assert
    assertEquals(PureGrammarComposerContext.RenderStyle.STANDARD, actualPureGrammarComposerContext.getRenderStyle());
    List<Function3<List<PackageableElement>, PureGrammarComposerContext, String, String>> function3List = actualPureGrammarComposerContext.extraSectionComposers;
    assertTrue(function3List instanceof org.eclipse.collections.impl.list.mutable.FastList);
    List<Function3<Set<PackageableElement>, PureGrammarComposerContext, List<String>, PureGrammarComposerExtension.PureFreeSectionGrammarComposerResult>> function3List1 = actualPureGrammarComposerContext.extraFreeSectionComposers;
    assertTrue(function3List1 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(function3List.isEmpty());
    assertTrue(function3List1.isEmpty());
    List<PureGrammarComposerExtension> pureGrammarComposerExtensionList = actualPureGrammarComposerContext.extensions;
    assertTrue(pureGrammarComposerExtensionList instanceof org.eclipse.collections.impl.list.mutable.FastList);
    List<Function2<Connection, PureGrammarComposerContext, Pair<String, String>>> function2List = actualPureGrammarComposerContext.extraConnectionValueComposers;
    assertTrue(function2List instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertEquals(1, pureGrammarComposerExtensionList.size());
    assertTrue(function2List.isEmpty());
    List<Function2<ClassMapping, PureGrammarComposerContext, String>> function2List1 = actualPureGrammarComposerContext.extraClassMappingComposers;
    assertTrue(function2List1 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    List<Function2<InputData, PureGrammarComposerContext, String>> function2List2 = actualPureGrammarComposerContext.extraMappingTestInputDataComposers;
    assertTrue(function2List2 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(function2List1.isEmpty());
    assertTrue(function2List2.isEmpty());
    List<Function2<AssociationMapping, PureGrammarComposerContext, String>> function2List3 = actualPureGrammarComposerContext.extraAssociationMappingComposers;
    assertTrue(function2List3 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertFalse(actualPureGrammarComposerContext.isFlatDataMappingProcessingModeEnabled());
    assertTrue(function2List3.isEmpty());
    assertFalse(actualPureGrammarComposerContext.isVariableInFunctionSignature());
    assertEquals("", actualPureGrammarComposerContext.getIndentationString());
    assertFalse(actualPureGrammarComposerContext.isValueSpecificationExternalParameter());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    PureGrammarComposerContext.Builder newInstanceResult = PureGrammarComposerContext.Builder.newInstance();
    newInstanceResult.withRenderStyle(PureGrammarComposerContext.RenderStyle.STANDARD);

    // Act
    PureGrammarComposerContext actualPureGrammarComposerContext = new PureGrammarComposerContext(newInstanceResult);

    // Assert
    assertEquals(PureGrammarComposerContext.RenderStyle.STANDARD, actualPureGrammarComposerContext.getRenderStyle());
    List<Function3<List<PackageableElement>, PureGrammarComposerContext, String, String>> function3List = actualPureGrammarComposerContext.extraSectionComposers;
    assertTrue(function3List instanceof org.eclipse.collections.impl.list.mutable.FastList);
    List<Function3<Set<PackageableElement>, PureGrammarComposerContext, List<String>, PureGrammarComposerExtension.PureFreeSectionGrammarComposerResult>> function3List1 = actualPureGrammarComposerContext.extraFreeSectionComposers;
    assertTrue(function3List1 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(function3List.isEmpty());
    assertTrue(function3List1.isEmpty());
    List<PureGrammarComposerExtension> pureGrammarComposerExtensionList = actualPureGrammarComposerContext.extensions;
    assertTrue(pureGrammarComposerExtensionList instanceof org.eclipse.collections.impl.list.mutable.FastList);
    List<Function2<Connection, PureGrammarComposerContext, Pair<String, String>>> function2List = actualPureGrammarComposerContext.extraConnectionValueComposers;
    assertTrue(function2List instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertEquals(1, pureGrammarComposerExtensionList.size());
    assertTrue(function2List.isEmpty());
    List<Function2<ClassMapping, PureGrammarComposerContext, String>> function2List1 = actualPureGrammarComposerContext.extraClassMappingComposers;
    assertTrue(function2List1 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    List<Function2<InputData, PureGrammarComposerContext, String>> function2List2 = actualPureGrammarComposerContext.extraMappingTestInputDataComposers;
    assertTrue(function2List2 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertTrue(function2List1.isEmpty());
    assertTrue(function2List2.isEmpty());
    List<Function2<AssociationMapping, PureGrammarComposerContext, String>> function2List3 = actualPureGrammarComposerContext.extraAssociationMappingComposers;
    assertTrue(function2List3 instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertFalse(actualPureGrammarComposerContext.isFlatDataMappingProcessingModeEnabled());
    assertTrue(function2List3.isEmpty());
    assertFalse(actualPureGrammarComposerContext.isVariableInFunctionSignature());
    assertEquals("", actualPureGrammarComposerContext.getIndentationString());
    assertFalse(actualPureGrammarComposerContext.isValueSpecificationExternalParameter());
  }

  @Test
  public void testComputeIndentationString() {
    // Arrange, Act and Assert
    assertEquals("", PureGrammarComposerContext
        .computeIndentationString(new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance()), 3));
    assertEquals("", PureGrammarComposerContext
        .computeIndentationString(new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance()), 0));
  }

  @Test
  public void testIsRenderingPretty() {
    // Arrange, Act and Assert
    assertFalse((new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance())).isRenderingPretty());
  }

  @Test
  public void testIsRenderingPretty2() {
    // Arrange
    PureGrammarComposerContext.Builder newInstanceResult = PureGrammarComposerContext.Builder.newInstance();
    newInstanceResult.withRenderStyle(PureGrammarComposerContext.RenderStyle.PRETTY);

    // Act and Assert
    assertTrue((new PureGrammarComposerContext(newInstanceResult)).isRenderingPretty());
  }

  @Test
  public void testIsRenderingPretty3() {
    // Arrange
    PureGrammarComposerContext.Builder newInstanceResult = PureGrammarComposerContext.Builder.newInstance();
    newInstanceResult.withRenderStyle(PureGrammarComposerContext.RenderStyle.PRETTY_HTML);

    // Act and Assert
    assertTrue((new PureGrammarComposerContext(newInstanceResult)).isRenderingPretty());
  }

  @Test
  public void testIsRenderingHTML() {
    // Arrange, Act and Assert
    assertFalse((new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance())).isRenderingHTML());
  }

  @Test
  public void testIsRenderingHTML2() {
    // Arrange
    PureGrammarComposerContext.Builder newInstanceResult = PureGrammarComposerContext.Builder.newInstance();
    newInstanceResult.withRenderStyle(PureGrammarComposerContext.RenderStyle.PRETTY_HTML);

    // Act and Assert
    assertTrue((new PureGrammarComposerContext(newInstanceResult)).isRenderingHTML());
  }

  @Test
  public void testReturnChar() {
    // Arrange, Act and Assert
    assertEquals("\n", (new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance())).returnChar());
  }

  @Test
  public void testReturnChar2() {
    // Arrange
    PureGrammarComposerContext.Builder newInstanceResult = PureGrammarComposerContext.Builder.newInstance();
    newInstanceResult.withRenderStyle(PureGrammarComposerContext.RenderStyle.PRETTY_HTML);

    // Act and Assert
    assertEquals("</BR>\n", (new PureGrammarComposerContext(newInstanceResult)).returnChar());
  }
}

