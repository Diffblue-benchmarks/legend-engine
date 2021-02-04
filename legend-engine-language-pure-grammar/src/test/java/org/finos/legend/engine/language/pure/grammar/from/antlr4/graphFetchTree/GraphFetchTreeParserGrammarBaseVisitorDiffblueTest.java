package org.finos.legend.engine.language.pure.grammar.from.antlr4.graphFetchTree;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class GraphFetchTreeParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitAlias() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitAlias(new GraphFetchTreeParserGrammar.AliasContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAlias2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitAlias(new GraphFetchTreeParserGrammar.AliasContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAlias3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.AliasContext aliasContext = new GraphFetchTreeParserGrammar.AliasContext(
        new ParserRuleContext(), 1);
    aliasContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitAlias(aliasContext));
  }

  @Test
  public void testVisitCollectionParameter() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitCollectionParameter(
        new GraphFetchTreeParserGrammar.CollectionParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCollectionParameter2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitCollectionParameter(new GraphFetchTreeParserGrammar.CollectionParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCollectionParameter3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.CollectionParameterContext collectionParameterContext = new GraphFetchTreeParserGrammar.CollectionParameterContext(
        new ParserRuleContext(), 1);
    collectionParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitCollectionParameter(collectionParameterContext));
  }

  @Test
  public void testVisitDefinition() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitDefinition(new GraphFetchTreeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefinition2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitDefinition(new GraphFetchTreeParserGrammar.DefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefinition3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.DefinitionContext definitionContext = new GraphFetchTreeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitEnumReference() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitEnumReference(new GraphFetchTreeParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumReference2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitEnumReference(new GraphFetchTreeParserGrammar.EnumReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumReference3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.EnumReferenceContext enumReferenceContext = new GraphFetchTreeParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);
    enumReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitEnumReference(enumReferenceContext));
  }

  @Test
  public void testVisitGraphDefinition() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitGraphDefinition(new GraphFetchTreeParserGrammar.GraphDefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitGraphDefinition2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitGraphDefinition(new GraphFetchTreeParserGrammar.GraphDefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitGraphDefinition3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.GraphDefinitionContext graphDefinitionContext = new GraphFetchTreeParserGrammar.GraphDefinitionContext(
        new ParserRuleContext(), 1);
    graphDefinitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitGraphDefinition(graphDefinitionContext));
  }

  @Test
  public void testVisitGraphPath() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitGraphPath(new GraphFetchTreeParserGrammar.GraphPathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitGraphPath2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitGraphPath(new GraphFetchTreeParserGrammar.GraphPathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitGraphPath3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.GraphPathContext graphPathContext = new GraphFetchTreeParserGrammar.GraphPathContext(
        new ParserRuleContext(), 1);
    graphPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitGraphPath(graphPathContext));
  }

  @Test
  public void testVisitGraphPaths() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitGraphPaths(new GraphFetchTreeParserGrammar.GraphPathsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitGraphPaths2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitGraphPaths(new GraphFetchTreeParserGrammar.GraphPathsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitGraphPaths3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.GraphPathsContext graphPathsContext = new GraphFetchTreeParserGrammar.GraphPathsContext(
        new ParserRuleContext(), 1);
    graphPathsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitGraphPaths(graphPathsContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitIdentifier(new GraphFetchTreeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitIdentifier(new GraphFetchTreeParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.IdentifierContext identifierContext = new GraphFetchTreeParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitInstanceLiteral() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitInstanceLiteral(new GraphFetchTreeParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteral2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitInstanceLiteral(new GraphFetchTreeParserGrammar.InstanceLiteralContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteral3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.InstanceLiteralContext instanceLiteralContext = new GraphFetchTreeParserGrammar.InstanceLiteralContext(
        new ParserRuleContext(), 1);
    instanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitInstanceLiteral(instanceLiteralContext));
  }

  @Test
  public void testVisitInstanceLiteralToken() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitInstanceLiteralToken(
        new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitInstanceLiteralToken(new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.InstanceLiteralTokenContext instanceLiteralTokenContext = new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(
        new ParserRuleContext(), 1);
    instanceLiteralTokenContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitInstanceLiteralToken(instanceLiteralTokenContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitPackagePath(new GraphFetchTreeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitPackagePath(new GraphFetchTreeParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.PackagePathContext packagePathContext = new GraphFetchTreeParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitParameter() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitParameter(new GraphFetchTreeParserGrammar.ParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitParameter2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitParameter(new GraphFetchTreeParserGrammar.ParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitParameter3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.ParameterContext parameterContext = new GraphFetchTreeParserGrammar.ParameterContext(
        new ParserRuleContext(), 1);
    parameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitParameter(parameterContext));
  }

  @Test
  public void testVisitPropertyParameters() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitPropertyParameters(
        new GraphFetchTreeParserGrammar.PropertyParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyParameters2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitPropertyParameters(new GraphFetchTreeParserGrammar.PropertyParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyParameters3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.PropertyParametersContext propertyParametersContext = new GraphFetchTreeParserGrammar.PropertyParametersContext(
        new ParserRuleContext(), 1);
    propertyParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitPropertyParameters(propertyParametersContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitQualifiedName(new GraphFetchTreeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitQualifiedName(new GraphFetchTreeParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.QualifiedNameContext qualifiedNameContext = new GraphFetchTreeParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitScalarParameter() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitScalarParameter(new GraphFetchTreeParserGrammar.ScalarParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitScalarParameter2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitScalarParameter(new GraphFetchTreeParserGrammar.ScalarParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitScalarParameter3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.ScalarParameterContext scalarParameterContext = new GraphFetchTreeParserGrammar.ScalarParameterContext(
        new ParserRuleContext(), 1);
    scalarParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitScalarParameter(scalarParameterContext));
  }

  @Test
  public void testVisitSubtype() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitSubtype(new GraphFetchTreeParserGrammar.SubtypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSubtype2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitSubtype(new GraphFetchTreeParserGrammar.SubtypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSubtype3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.SubtypeContext subtypeContext = new GraphFetchTreeParserGrammar.SubtypeContext(
        new ParserRuleContext(), 1);
    subtypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitSubtype(subtypeContext));
  }

  @Test
  public void testVisitVariable() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitVariable(new GraphFetchTreeParserGrammar.VariableContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitVariable2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitVariable(new GraphFetchTreeParserGrammar.VariableContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitVariable3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.VariableContext variableContext = new GraphFetchTreeParserGrammar.VariableContext(
        new ParserRuleContext(), 1);
    variableContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitVariable(variableContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitWord(new GraphFetchTreeParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor
        .visitWord(new GraphFetchTreeParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    GraphFetchTreeParserGrammarBaseVisitor<Object> graphFetchTreeParserGrammarBaseVisitor = new GraphFetchTreeParserGrammarBaseVisitor<Object>();

    GraphFetchTreeParserGrammar.WordContext wordContext = new GraphFetchTreeParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphFetchTreeParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

