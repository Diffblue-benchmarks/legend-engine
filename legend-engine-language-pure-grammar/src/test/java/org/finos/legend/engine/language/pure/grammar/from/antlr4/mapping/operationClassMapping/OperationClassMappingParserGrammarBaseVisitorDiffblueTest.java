package org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.operationClassMapping;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class OperationClassMappingParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitFunctionPath() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitFunctionPath(new OperationClassMappingParserGrammar.FunctionPathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionPath2() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitFunctionPath(new OperationClassMappingParserGrammar.FunctionPathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionPath3() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    OperationClassMappingParserGrammar.FunctionPathContext functionPathContext = new OperationClassMappingParserGrammar.FunctionPathContext(
        new ParserRuleContext(), 1);
    functionPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor.visitFunctionPath(functionPathContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitIdentifier(new OperationClassMappingParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitIdentifier(new OperationClassMappingParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    OperationClassMappingParserGrammar.IdentifierContext identifierContext = new OperationClassMappingParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitOperationClassMapping() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor.visitOperationClassMapping(
        new OperationClassMappingParserGrammar.OperationClassMappingContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitOperationClassMapping2() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor.visitOperationClassMapping(
        new OperationClassMappingParserGrammar.OperationClassMappingContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitOperationClassMapping3() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    OperationClassMappingParserGrammar.OperationClassMappingContext operationClassMappingContext = new OperationClassMappingParserGrammar.OperationClassMappingContext(
        new ParserRuleContext(), 1);
    operationClassMappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor.visitOperationClassMapping(operationClassMappingContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitPackagePath(new OperationClassMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitPackagePath(new OperationClassMappingParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    OperationClassMappingParserGrammar.PackagePathContext packagePathContext = new OperationClassMappingParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitParameters() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitParameters(new OperationClassMappingParserGrammar.ParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitParameters2() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitParameters(new OperationClassMappingParserGrammar.ParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitParameters3() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    OperationClassMappingParserGrammar.ParametersContext parametersContext = new OperationClassMappingParserGrammar.ParametersContext(
        new ParserRuleContext(), 1);
    parametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor.visitParameters(parametersContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitQualifiedName(new OperationClassMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitQualifiedName(new OperationClassMappingParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    OperationClassMappingParserGrammar.QualifiedNameContext qualifiedNameContext = new OperationClassMappingParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitWord(new OperationClassMappingParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor
        .visitWord(new OperationClassMappingParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    OperationClassMappingParserGrammarBaseVisitor<Object> operationClassMappingParserGrammarBaseVisitor = new OperationClassMappingParserGrammarBaseVisitor<Object>();

    OperationClassMappingParserGrammar.WordContext wordContext = new OperationClassMappingParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(operationClassMappingParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

