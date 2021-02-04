package org.finos.legend.engine.language.pure.grammar.from.antlr4.runtime;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class RuntimeParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitConnectionPointer() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitConnectionPointer(new RuntimeParserGrammar.ConnectionPointerContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConnectionPointer2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitConnectionPointer(new RuntimeParserGrammar.ConnectionPointerContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConnectionPointer3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.ConnectionPointerContext connectionPointerContext = new RuntimeParserGrammar.ConnectionPointerContext(
        new ParserRuleContext(), 1);
    connectionPointerContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitConnectionPointer(connectionPointerContext));
  }

  @Test
  public void testVisitConnections() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitConnections(new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConnections2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitConnections(new RuntimeParserGrammar.ConnectionsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConnections3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.ConnectionsContext connectionsContext = new RuntimeParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);
    connectionsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitConnections(connectionsContext));
  }

  @Test
  public void testVisitDefinition() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitDefinition(new RuntimeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefinition2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitDefinition(new RuntimeParserGrammar.DefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefinition3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.DefinitionContext definitionContext = new RuntimeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitEmbeddedConnection() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitEmbeddedConnection(new RuntimeParserGrammar.EmbeddedConnectionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEmbeddedConnection2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitEmbeddedConnection(new RuntimeParserGrammar.EmbeddedConnectionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEmbeddedConnection3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.EmbeddedConnectionContext embeddedConnectionContext = new RuntimeParserGrammar.EmbeddedConnectionContext(
        new ParserRuleContext(), 1);
    embeddedConnectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitEmbeddedConnection(embeddedConnectionContext));
  }

  @Test
  public void testVisitEmbeddedConnectionContent() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitEmbeddedConnectionContent(
        new RuntimeParserGrammar.EmbeddedConnectionContentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEmbeddedConnectionContent2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitEmbeddedConnectionContent(
        new RuntimeParserGrammar.EmbeddedConnectionContentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEmbeddedConnectionContent3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.EmbeddedConnectionContentContext embeddedConnectionContentContext = new RuntimeParserGrammar.EmbeddedConnectionContentContext(
        new ParserRuleContext(), 1);
    embeddedConnectionContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitEmbeddedConnectionContent(embeddedConnectionContentContext));
  }

  @Test
  public void testVisitEmbeddedRuntime() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitEmbeddedRuntime(new RuntimeParserGrammar.EmbeddedRuntimeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEmbeddedRuntime2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitEmbeddedRuntime(new RuntimeParserGrammar.EmbeddedRuntimeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEmbeddedRuntime3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.EmbeddedRuntimeContext embeddedRuntimeContext = new RuntimeParserGrammar.EmbeddedRuntimeContext(
        new ParserRuleContext(), 1);
    embeddedRuntimeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitEmbeddedRuntime(embeddedRuntimeContext));
  }

  @Test
  public void testVisitIdentifiedConnection() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitIdentifiedConnection(new RuntimeParserGrammar.IdentifiedConnectionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifiedConnection2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitIdentifiedConnection(new RuntimeParserGrammar.IdentifiedConnectionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifiedConnection3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.IdentifiedConnectionContext identifiedConnectionContext = new RuntimeParserGrammar.IdentifiedConnectionContext(
        new ParserRuleContext(), 1);
    identifiedConnectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitIdentifiedConnection(identifiedConnectionContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitIdentifier(new RuntimeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitIdentifier(new RuntimeParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.IdentifierContext identifierContext = new RuntimeParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitImportStatement() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitImportStatement(new RuntimeParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitImportStatement2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitImportStatement(new RuntimeParserGrammar.ImportStatementContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitImportStatement3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.ImportStatementContext importStatementContext = new RuntimeParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitImportStatement(importStatementContext));
  }

  @Test
  public void testVisitImports() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitImports(new RuntimeParserGrammar.ImportsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitImports2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        runtimeParserGrammarBaseVisitor.visitImports(new RuntimeParserGrammar.ImportsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitImports3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.ImportsContext importsContext = new RuntimeParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);
    importsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitImports(importsContext));
  }

  @Test
  public void testVisitMappings() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitMappings(new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMappings2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        runtimeParserGrammarBaseVisitor.visitMappings(new RuntimeParserGrammar.MappingsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMappings3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.MappingsContext mappingsContext = new RuntimeParserGrammar.MappingsContext(
        new ParserRuleContext(), 1);
    mappingsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitMappings(mappingsContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitPackagePath(new RuntimeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitPackagePath(new RuntimeParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.PackagePathContext packagePathContext = new RuntimeParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitQualifiedName(new RuntimeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitQualifiedName(new RuntimeParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.QualifiedNameContext qualifiedNameContext = new RuntimeParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitRuntime() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitRuntime(new RuntimeParserGrammar.RuntimeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitRuntime2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        runtimeParserGrammarBaseVisitor.visitRuntime(new RuntimeParserGrammar.RuntimeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitRuntime3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.RuntimeContext runtimeContext = new RuntimeParserGrammar.RuntimeContext(
        new ParserRuleContext(), 1);
    runtimeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitRuntime(runtimeContext));
  }

  @Test
  public void testVisitStoreConnections() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitStoreConnections(new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitStoreConnections2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor
        .visitStoreConnections(new RuntimeParserGrammar.StoreConnectionsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitStoreConnections3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.StoreConnectionsContext storeConnectionsContext = new RuntimeParserGrammar.StoreConnectionsContext(
        new ParserRuleContext(), 1);
    storeConnectionsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitStoreConnections(storeConnectionsContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        runtimeParserGrammarBaseVisitor.visitWord(new RuntimeParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitWord(new RuntimeParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    RuntimeParserGrammarBaseVisitor<Object> runtimeParserGrammarBaseVisitor = new RuntimeParserGrammarBaseVisitor<Object>();

    RuntimeParserGrammar.WordContext wordContext = new RuntimeParserGrammar.WordContext(new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

