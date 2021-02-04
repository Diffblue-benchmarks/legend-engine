package org.finos.legend.engine.language.pure.grammar.to;

import static org.junit.Assert.assertEquals;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.MappingInclude;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.OperationClassMapping;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.aggregationAware.AggregationAwareClassMapping;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.xStore.XStoreAssociationMapping;
import org.junit.Test;

public class HelperMappingGrammarComposerDiffblueTest {
  @Test
  public void testRenderMappingInclude() {
    // Arrange, Act and Assert
    assertEquals("include null::null", HelperMappingGrammarComposer.renderMappingInclude(new MappingInclude()));
  }

  @Test
  public void testRenderMappingInclude2() {
    // Arrange
    MappingInclude mappingInclude = new MappingInclude();
    mappingInclude.setIncludedMapping("include ");

    // Act and Assert
    assertEquals("include include ", HelperMappingGrammarComposer.renderMappingInclude(mappingInclude));
  }

  @Test
  public void testRenderAssociationMapping() {
    // Arrange
    XStoreAssociationMapping associationMapping = new XStoreAssociationMapping();

    // Act and Assert
    assertEquals(
        "/* Unsupported transformation for 'org.finos.legend.engine.protocol.pure.v1.model.packageableElement"
            + ".mapping.xStore.XStoreAssociationMapping' */",
        HelperMappingGrammarComposer.renderAssociationMapping(associationMapping,
            new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance())));
  }

  @Test
  public void testRenderClassMappingId() {
    // Arrange, Act and Assert
    assertEquals("", HelperMappingGrammarComposer.renderClassMappingId(new OperationClassMapping()));
    assertEquals("", HelperMappingGrammarComposer.renderClassMappingId(new AggregationAwareClassMapping()));
  }
}

