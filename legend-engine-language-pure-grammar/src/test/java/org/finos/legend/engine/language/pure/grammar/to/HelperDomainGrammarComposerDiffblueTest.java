package org.finos.legend.engine.language.pure.grammar.to;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.EnumValue;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Multiplicity;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.StereotypePtr;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.TaggedValue;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Unit;
import org.junit.Test;

public class HelperDomainGrammarComposerDiffblueTest {
  @Test
  public void testRenderAnnotations() {
    // Arrange
    ArrayList<StereotypePtr> stereotypes = new ArrayList<StereotypePtr>();

    // Act and Assert
    assertEquals("", HelperDomainGrammarComposer.renderAnnotations(stereotypes, new ArrayList<TaggedValue>()));
  }

  @Test
  public void testRenderEnumValue() {
    // Arrange, Act and Assert
    assertEquals("", HelperDomainGrammarComposer.renderEnumValue(new EnumValue()));
  }

  @Test
  public void testRenderUnit() {
    // Arrange, Act and Assert
    assertEquals(";", HelperDomainGrammarComposer.renderUnit(new Unit(), null));
  }

  @Test
  public void testRenderMultiplicity() {
    // Arrange, Act and Assert
    assertEquals("*", HelperDomainGrammarComposer.renderMultiplicity(new Multiplicity()));
    assertEquals("1", HelperDomainGrammarComposer.renderMultiplicity(new Multiplicity(1, 1)));
    assertEquals("0..1", HelperDomainGrammarComposer.renderMultiplicity(new Multiplicity(0, 1)));
    assertEquals("1..*", HelperDomainGrammarComposer.renderMultiplicity(new Multiplicity(1, 2147483647)));
  }
}

