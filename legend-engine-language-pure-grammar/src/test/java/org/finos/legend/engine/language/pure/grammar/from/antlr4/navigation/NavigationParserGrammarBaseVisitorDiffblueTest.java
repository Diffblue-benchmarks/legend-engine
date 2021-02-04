package org.finos.legend.engine.language.pure.grammar.from.antlr4.navigation;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class NavigationParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitAtomic() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitAtomic(new NavigationParserGrammar.AtomicContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAtomic2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitAtomic(new NavigationParserGrammar.AtomicContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAtomic3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.AtomicContext atomicContext = new NavigationParserGrammar.AtomicContext(
        new ParserRuleContext(), 1);
    atomicContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitAtomic(atomicContext));
  }

  @Test
  public void testVisitCollection() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitCollection(new NavigationParserGrammar.CollectionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCollection2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitCollection(new NavigationParserGrammar.CollectionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCollection3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.CollectionContext collectionContext = new NavigationParserGrammar.CollectionContext(
        new ParserRuleContext(), 1);
    collectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitCollection(collectionContext));
  }

  @Test
  public void testVisitDefinition() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitDefinition(new NavigationParserGrammar.DefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefinition2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitDefinition(new NavigationParserGrammar.DefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefinition3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.DefinitionContext definitionContext = new NavigationParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitEnumStub() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitEnumStub(new NavigationParserGrammar.EnumStubContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumStub2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitEnumStub(new NavigationParserGrammar.EnumStubContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumStub3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.EnumStubContext enumStubContext = new NavigationParserGrammar.EnumStubContext(
        new ParserRuleContext(), 1);
    enumStubContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitEnumStub(enumStubContext));
  }

  @Test
  public void testVisitGenericType() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitGenericType(new NavigationParserGrammar.GenericTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitGenericType2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitGenericType(new NavigationParserGrammar.GenericTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitGenericType3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.GenericTypeContext genericTypeContext = new NavigationParserGrammar.GenericTypeContext(
        new ParserRuleContext(), 1);
    genericTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitGenericType(genericTypeContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitIdentifier(new NavigationParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitIdentifier(new NavigationParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.IdentifierContext identifierContext = new NavigationParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitName() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitName(new NavigationParserGrammar.NameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitName2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        navigationParserGrammarBaseVisitor.visitName(new NavigationParserGrammar.NameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitName3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.NameContext nameContext = new NavigationParserGrammar.NameContext(new ParserRuleContext(),
        1);
    nameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitName(nameContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitPackagePath(new NavigationParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitPackagePath(new NavigationParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.PackagePathContext packagePathContext = new NavigationParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitParameter() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitParameter(new NavigationParserGrammar.ParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitParameter2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitParameter(new NavigationParserGrammar.ParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitParameter3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.ParameterContext parameterContext = new NavigationParserGrammar.ParameterContext(
        new ParserRuleContext(), 1);
    parameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitParameter(parameterContext));
  }

  @Test
  public void testVisitPath() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitPath(new NavigationParserGrammar.PathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPath2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        navigationParserGrammarBaseVisitor.visitPath(new NavigationParserGrammar.PathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPath3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.PathContext pathContext = new NavigationParserGrammar.PathContext(new ParserRuleContext(),
        1);
    pathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitPath(pathContext));
  }

  @Test
  public void testVisitPropertyWithParameters() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitPropertyWithParameters(
        new NavigationParserGrammar.PropertyWithParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyWithParameters2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitPropertyWithParameters(new NavigationParserGrammar.PropertyWithParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyWithParameters3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.PropertyWithParametersContext propertyWithParametersContext = new NavigationParserGrammar.PropertyWithParametersContext(
        new ParserRuleContext(), 1);
    propertyWithParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitPropertyWithParameters(propertyWithParametersContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitQualifiedName(new NavigationParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitQualifiedName(new NavigationParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.QualifiedNameContext qualifiedNameContext = new NavigationParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitScalar() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitScalar(new NavigationParserGrammar.ScalarContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitScalar2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitScalar(new NavigationParserGrammar.ScalarContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitScalar3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.ScalarContext scalarContext = new NavigationParserGrammar.ScalarContext(
        new ParserRuleContext(), 1);
    scalarContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitScalar(scalarContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor
        .visitWord(new NavigationParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        navigationParserGrammarBaseVisitor.visitWord(new NavigationParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    NavigationParserGrammarBaseVisitor<Object> navigationParserGrammarBaseVisitor = new NavigationParserGrammarBaseVisitor<Object>();

    NavigationParserGrammar.WordContext wordContext = new NavigationParserGrammar.WordContext(new ParserRuleContext(),
        1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(navigationParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

