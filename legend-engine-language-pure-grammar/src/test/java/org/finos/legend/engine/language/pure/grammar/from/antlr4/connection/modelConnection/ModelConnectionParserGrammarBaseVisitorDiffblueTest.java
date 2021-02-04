package org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.modelConnection;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class ModelConnectionParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitConnectionUrl() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitConnectionUrl(new ModelConnectionParserGrammar.ConnectionUrlContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConnectionUrl2() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitConnectionUrl(new ModelConnectionParserGrammar.ConnectionUrlContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConnectionUrl3() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ModelConnectionParserGrammar.ConnectionUrlContext connectionUrlContext = new ModelConnectionParserGrammar.ConnectionUrlContext(
        new ParserRuleContext(), 1);
    connectionUrlContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitConnectionUrl(connectionUrlContext));
  }

  @Test
  public void testVisitDefinition() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitDefinition(new ModelConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefinition2() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitDefinition(new ModelConnectionParserGrammar.DefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefinition3() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ModelConnectionParserGrammar.DefinitionContext definitionContext = new ModelConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitIdentifier(new ModelConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitIdentifier(new ModelConnectionParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ModelConnectionParserGrammar.IdentifierContext identifierContext = new ModelConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitMappings() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitMappings(new ModelConnectionParserGrammar.MappingsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMappings2() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitMappings(new ModelConnectionParserGrammar.MappingsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMappings3() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ModelConnectionParserGrammar.MappingsContext mappingsContext = new ModelConnectionParserGrammar.MappingsContext(
        new ParserRuleContext(), 1);
    mappingsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitMappings(mappingsContext));
  }

  @Test
  public void testVisitModelChainMappings() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitModelChainMappings(
        new ModelConnectionParserGrammar.ModelChainMappingsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitModelChainMappings2() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitModelChainMappings(new ModelConnectionParserGrammar.ModelChainMappingsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitModelChainMappings3() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ModelConnectionParserGrammar.ModelChainMappingsContext modelChainMappingsContext = new ModelConnectionParserGrammar.ModelChainMappingsContext(
        new ParserRuleContext(), 1);
    modelChainMappingsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitModelChainMappings(modelChainMappingsContext));
  }

  @Test
  public void testVisitModelConnectionClass() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitModelConnectionClass(
        new ModelConnectionParserGrammar.ModelConnectionClassContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitModelConnectionClass2() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitModelConnectionClass(new ModelConnectionParserGrammar.ModelConnectionClassContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitModelConnectionClass3() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ModelConnectionParserGrammar.ModelConnectionClassContext modelConnectionClassContext = new ModelConnectionParserGrammar.ModelConnectionClassContext(
        new ParserRuleContext(), 1);
    modelConnectionClassContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitModelConnectionClass(modelConnectionClassContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitPackagePath(new ModelConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitPackagePath(new ModelConnectionParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ModelConnectionParserGrammar.PackagePathContext packagePathContext = new ModelConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitQualifiedName(new ModelConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitQualifiedName(new ModelConnectionParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ModelConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ModelConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitWord(new ModelConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor
        .visitWord(new ModelConnectionParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    ModelConnectionParserGrammarBaseVisitor<Object> modelConnectionParserGrammarBaseVisitor = new ModelConnectionParserGrammarBaseVisitor<Object>();

    ModelConnectionParserGrammar.WordContext wordContext = new ModelConnectionParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

