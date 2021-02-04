package org.finos.legend.engine.language.pure.grammar.from.antlr4.connection;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class ConnectionParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitConnection() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitConnection(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConnection2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitConnection(new ConnectionParserGrammar.ConnectionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConnection3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionContext connectionContext = new ConnectionParserGrammar.ConnectionContext(
        new ParserRuleContext(), 1);
    connectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnection(connectionContext));
  }

  @Test
  public void testVisitConnection4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionContext connectionContext = new ConnectionParserGrammar.ConnectionContext(
        new ParserRuleContext(), 1);
    connectionContext.<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnection(connectionContext));
  }

  @Test
  public void testVisitConnection5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionContext connectionContext = new ConnectionParserGrammar.ConnectionContext(
        new ParserRuleContext(), 1);
    connectionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnection(connectionContext));
  }

  @Test
  public void testVisitConnection6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionContext connectionContext = new ConnectionParserGrammar.ConnectionContext(
        new ParserRuleContext(), 1);
    connectionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnection(connectionContext));
  }

  @Test
  public void testVisitConnection7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionContext connectionContext = new ConnectionParserGrammar.ConnectionContext(
        new ParserRuleContext(), 1);
    connectionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnection(connectionContext));
  }

  @Test
  public void testVisitConnectionType() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitConnectionType(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConnectionType2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitConnectionType(new ConnectionParserGrammar.ConnectionTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConnectionType3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionTypeContext connectionTypeContext = new ConnectionParserGrammar.ConnectionTypeContext(
        new ParserRuleContext(), 1);
    connectionTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionType(connectionTypeContext));
  }

  @Test
  public void testVisitConnectionType4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionTypeContext connectionTypeContext = new ConnectionParserGrammar.ConnectionTypeContext(
        new ParserRuleContext(), 1);
    connectionTypeContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionType(connectionTypeContext));
  }

  @Test
  public void testVisitConnectionType5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionTypeContext connectionTypeContext = new ConnectionParserGrammar.ConnectionTypeContext(
        new ParserRuleContext(), 1);
    connectionTypeContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionType(connectionTypeContext));
  }

  @Test
  public void testVisitConnectionType6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionTypeContext connectionTypeContext = new ConnectionParserGrammar.ConnectionTypeContext(
        new ParserRuleContext(), 1);
    connectionTypeContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionType(connectionTypeContext));
  }

  @Test
  public void testVisitConnectionType7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionTypeContext connectionTypeContext = new ConnectionParserGrammar.ConnectionTypeContext(
        new ParserRuleContext(), 1);
    connectionTypeContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionType(connectionTypeContext));
  }

  @Test
  public void testVisitConnectionValue() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitConnectionValue(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConnectionValue2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitConnectionValue(new ConnectionParserGrammar.ConnectionValueContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConnectionValue3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContext connectionValueContext = new ConnectionParserGrammar.ConnectionValueContext(
        new ParserRuleContext(), 1);
    connectionValueContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValue(connectionValueContext));
  }

  @Test
  public void testVisitConnectionValue4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContext connectionValueContext = new ConnectionParserGrammar.ConnectionValueContext(
        new ParserRuleContext(), 1);
    connectionValueContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValue(connectionValueContext));
  }

  @Test
  public void testVisitConnectionValue5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContext connectionValueContext = new ConnectionParserGrammar.ConnectionValueContext(
        new ParserRuleContext(), 1);
    connectionValueContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValue(connectionValueContext));
  }

  @Test
  public void testVisitConnectionValue6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContext connectionValueContext = new ConnectionParserGrammar.ConnectionValueContext(
        new ParserRuleContext(), 1);
    connectionValueContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValue(connectionValueContext));
  }

  @Test
  public void testVisitConnectionValue7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContext connectionValueContext = new ConnectionParserGrammar.ConnectionValueContext(
        new ParserRuleContext(), 1);
    connectionValueContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValue(connectionValueContext));
  }

  @Test
  public void testVisitConnectionValueContent() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValueContent(
        new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConnectionValueContent2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitConnectionValueContent(new ConnectionParserGrammar.ConnectionValueContentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConnectionValueContent3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContentContext connectionValueContentContext = new ConnectionParserGrammar.ConnectionValueContentContext(
        new ParserRuleContext(), 1);
    connectionValueContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValueContent(connectionValueContentContext));
  }

  @Test
  public void testVisitConnectionValueContent4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContentContext connectionValueContentContext = new ConnectionParserGrammar.ConnectionValueContentContext(
        new ParserRuleContext(), 1);
    connectionValueContentContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValueContent(connectionValueContentContext));
  }

  @Test
  public void testVisitConnectionValueContent5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContentContext connectionValueContentContext = new ConnectionParserGrammar.ConnectionValueContentContext(
        new ParserRuleContext(), 1);
    connectionValueContentContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValueContent(connectionValueContentContext));
  }

  @Test
  public void testVisitConnectionValueContent6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContentContext connectionValueContentContext = new ConnectionParserGrammar.ConnectionValueContentContext(
        new ParserRuleContext(), 1);
    connectionValueContentContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValueContent(connectionValueContentContext));
  }

  @Test
  public void testVisitConnectionValueContent7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionValueContentContext connectionValueContentContext = new ConnectionParserGrammar.ConnectionValueContentContext(
        new ParserRuleContext(), 1);
    connectionValueContentContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnectionValueContent(connectionValueContentContext));
  }

  @Test
  public void testVisitConnections() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitConnections(new ConnectionParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConnections2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitConnections(new ConnectionParserGrammar.ConnectionsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConnections3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionsContext connectionsContext = new ConnectionParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);
    connectionsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnections(connectionsContext));
  }

  @Test
  public void testVisitConnections4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionsContext connectionsContext = new ConnectionParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);
    connectionsContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnections(connectionsContext));
  }

  @Test
  public void testVisitConnections5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionsContext connectionsContext = new ConnectionParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);
    connectionsContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnections(connectionsContext));
  }

  @Test
  public void testVisitConnections6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionsContext connectionsContext = new ConnectionParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);
    connectionsContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnections(connectionsContext));
  }

  @Test
  public void testVisitConnections7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ConnectionsContext connectionsContext = new ConnectionParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);
    connectionsContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitConnections(connectionsContext));
  }

  @Test
  public void testVisitDefinition() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitDefinition(new ConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefinition2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitDefinition(new ConnectionParserGrammar.DefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefinition3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.DefinitionContext definitionContext = new ConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitDefinition4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.DefinitionContext definitionContext = new ConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitDefinition5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.DefinitionContext definitionContext = new ConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitDefinition6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.DefinitionContext definitionContext = new ConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitDefinition7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.DefinitionContext definitionContext = new ConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitEmbeddedRuntimeConnection() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitEmbeddedRuntimeConnection(
        new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEmbeddedRuntimeConnection2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitEmbeddedRuntimeConnection(
        new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEmbeddedRuntimeConnection3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext embeddedRuntimeConnectionContext = new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(
        new ParserRuleContext(), 1);
    embeddedRuntimeConnectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitEmbeddedRuntimeConnection(embeddedRuntimeConnectionContext));
  }

  @Test
  public void testVisitEmbeddedRuntimeConnection4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext embeddedRuntimeConnectionContext = new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(
        new ParserRuleContext(), 1);
    embeddedRuntimeConnectionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitEmbeddedRuntimeConnection(embeddedRuntimeConnectionContext));
  }

  @Test
  public void testVisitEmbeddedRuntimeConnection5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext embeddedRuntimeConnectionContext = new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(
        new ParserRuleContext(), 1);
    embeddedRuntimeConnectionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitEmbeddedRuntimeConnection(embeddedRuntimeConnectionContext));
  }

  @Test
  public void testVisitEmbeddedRuntimeConnection6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext embeddedRuntimeConnectionContext = new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(
        new ParserRuleContext(), 1);
    embeddedRuntimeConnectionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitEmbeddedRuntimeConnection(embeddedRuntimeConnectionContext));
  }

  @Test
  public void testVisitEmbeddedRuntimeConnection7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext embeddedRuntimeConnectionContext = new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(
        new ParserRuleContext(), 1);
    embeddedRuntimeConnectionContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitEmbeddedRuntimeConnection(embeddedRuntimeConnectionContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitIdentifier(new ConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitIdentifier(new ConnectionParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.IdentifierContext identifierContext = new ConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitIdentifier4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.IdentifierContext identifierContext = new ConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitIdentifier5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.IdentifierContext identifierContext = new ConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitIdentifier6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.IdentifierContext identifierContext = new ConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitIdentifier7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.IdentifierContext identifierContext = new ConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitImportStatement() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitImportStatement(new ConnectionParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitImportStatement2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitImportStatement(new ConnectionParserGrammar.ImportStatementContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitImportStatement3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportStatementContext importStatementContext = new ConnectionParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImportStatement(importStatementContext));
  }

  @Test
  public void testVisitImportStatement4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportStatementContext importStatementContext = new ConnectionParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImportStatement(importStatementContext));
  }

  @Test
  public void testVisitImportStatement5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportStatementContext importStatementContext = new ConnectionParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImportStatement(importStatementContext));
  }

  @Test
  public void testVisitImportStatement6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportStatementContext importStatementContext = new ConnectionParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImportStatement(importStatementContext));
  }

  @Test
  public void testVisitImportStatement7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportStatementContext importStatementContext = new ConnectionParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImportStatement(importStatementContext));
  }

  @Test
  public void testVisitImports() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitImports(new ConnectionParserGrammar.ImportsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitImports2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitImports(new ConnectionParserGrammar.ImportsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitImports3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportsContext importsContext = new ConnectionParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);
    importsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImports(importsContext));
  }

  @Test
  public void testVisitImports4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportsContext importsContext = new ConnectionParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);
    importsContext.<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImports(importsContext));
  }

  @Test
  public void testVisitImports5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportsContext importsContext = new ConnectionParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);
    importsContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImports(importsContext));
  }

  @Test
  public void testVisitImports6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportsContext importsContext = new ConnectionParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);
    importsContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImports(importsContext));
  }

  @Test
  public void testVisitImports7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.ImportsContext importsContext = new ConnectionParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);
    importsContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitImports(importsContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitPackagePath(new ConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitPackagePath(new ConnectionParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.PackagePathContext packagePathContext = new ConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitPackagePath4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.PackagePathContext packagePathContext = new ConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitPackagePath5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.PackagePathContext packagePathContext = new ConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitPackagePath6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.PackagePathContext packagePathContext = new ConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitPackagePath7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.PackagePathContext packagePathContext = new ConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitQualifiedName(new ConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitQualifiedName(new ConnectionParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitQualifiedName4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitQualifiedName5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitQualifiedName6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitQualifiedName7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor
        .visitWord(new ConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        connectionParserGrammarBaseVisitor.visitWord(new ConnectionParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.WordContext wordContext = new ConnectionParserGrammar.WordContext(new ParserRuleContext(),
        1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitWord(wordContext));
  }

  @Test
  public void testVisitWord4() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.WordContext wordContext = new ConnectionParserGrammar.WordContext(new ParserRuleContext(),
        1);
    wordContext.<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitWord(wordContext));
  }

  @Test
  public void testVisitWord5() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.WordContext wordContext = new ConnectionParserGrammar.WordContext(new ParserRuleContext(),
        1);
    wordContext.<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitWord(wordContext));
  }

  @Test
  public void testVisitWord6() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.WordContext wordContext = new ConnectionParserGrammar.WordContext(new ParserRuleContext(),
        1);
    wordContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitWord(wordContext));
  }

  @Test
  public void testVisitWord7() {
    // Arrange
    ConnectionParserGrammarBaseVisitor<Object> connectionParserGrammarBaseVisitor = new ConnectionParserGrammarBaseVisitor<Object>();

    ConnectionParserGrammar.WordContext wordContext = new ConnectionParserGrammar.WordContext(new ParserRuleContext(),
        1);
    wordContext.<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

