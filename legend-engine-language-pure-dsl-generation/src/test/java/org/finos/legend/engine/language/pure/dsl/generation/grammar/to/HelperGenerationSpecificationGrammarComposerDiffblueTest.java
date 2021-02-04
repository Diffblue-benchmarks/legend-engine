package org.finos.legend.engine.language.pure.dsl.generation.grammar.to;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.finos.legend.engine.protocol.pure.v1.model.context.PackageableElementPointer;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.generationSpecification.GenerationTreeNode;
import org.junit.Test;

public class HelperGenerationSpecificationGrammarComposerDiffblueTest {
  @Test
  public void testRenderGenerationNode() {
    // Arrange, Act and Assert
    assertEquals("    {\n      generationElement: null;\n    }",
        HelperGenerationSpecificationGrammarComposer.renderGenerationNode(new GenerationTreeNode()));
  }

  @Test
  public void testRenderFileGenerationNode() {
    // Arrange, Act and Assert
    assertEquals("", HelperGenerationSpecificationGrammarComposer
        .renderFileGenerationNode(new ArrayList<PackageableElementPointer>()));
  }

  @Test
  public void testRenderFileGenerationNode2() {
    // Arrange
    ArrayList<PackageableElementPointer> packageableElementPointerList = new ArrayList<PackageableElementPointer>();
    packageableElementPointerList.add(new PackageableElementPointer());

    // Act and Assert
    assertEquals("  fileGenerations: [\n    null\n  ];",
        HelperGenerationSpecificationGrammarComposer.renderFileGenerationNode(packageableElementPointerList));
  }

  @Test
  public void testRenderFileGenerationNode3() {
    // Arrange
    ArrayList<PackageableElementPointer> packageableElementPointerList = new ArrayList<PackageableElementPointer>();
    packageableElementPointerList.add(new PackageableElementPointer());
    packageableElementPointerList.add(new PackageableElementPointer());

    // Act and Assert
    assertEquals("  fileGenerations: [\n    null,\n    null\n  ];",
        HelperGenerationSpecificationGrammarComposer.renderFileGenerationNode(packageableElementPointerList));
  }
}

