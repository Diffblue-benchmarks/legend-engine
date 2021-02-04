package org.finos.legend.engine.language.pure.grammar.to;

import static org.junit.Assert.assertEquals;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.ConnectionPointer;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.store.modelToModel.connection.JsonModelConnection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.store.modelToModel.connection.ModelChainConnection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.store.modelToModel.connection.XmlModelConnection;
import org.junit.Test;

public class HelperConnectionGrammarComposerDiffblueTest {
  @Test
  public void testGetConnectionValueName() {
    // Arrange
    ConnectionPointer connection = new ConnectionPointer();

    // Act and Assert
    assertEquals(
        "/* Unsupported transformation for connection type 'org.finos.legend.engine.protocol.pure.v1.model"
            + ".packageableElement.connection.ConnectionPointer' */",
        HelperConnectionGrammarComposer.getConnectionValueName(connection,
            new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance())));
  }

  @Test
  public void testGetConnectionValueName2() {
    // Arrange
    JsonModelConnection connection = new JsonModelConnection();

    // Act and Assert
    assertEquals("JsonModelConnection", HelperConnectionGrammarComposer.getConnectionValueName(connection,
        new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance())));
  }

  @Test
  public void testGetConnectionValueName3() {
    // Arrange
    XmlModelConnection connection = new XmlModelConnection();

    // Act and Assert
    assertEquals("XmlModelConnection", HelperConnectionGrammarComposer.getConnectionValueName(connection,
        new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance())));
  }

  @Test
  public void testGetConnectionValueName4() {
    // Arrange
    ModelChainConnection connection = new ModelChainConnection();

    // Act and Assert
    assertEquals("ModelChainConnection", HelperConnectionGrammarComposer.getConnectionValueName(connection,
        new PureGrammarComposerContext(PureGrammarComposerContext.Builder.newInstance())));
  }
}

