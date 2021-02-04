package org.finos.legend.engine.language.pure.grammar.from.antlr4.domain;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class DomainParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitAggregation() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAggregation(new DomainParserGrammar.AggregationContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAggregation2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAggregation(new DomainParserGrammar.AggregationContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAggregation3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AggregationContext aggregationContext = new DomainParserGrammar.AggregationContext(
        new ParserRuleContext(), 1);
    aggregationContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAggregation(aggregationContext));
  }

  @Test
  public void testVisitAggregationType() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAggregationType(new DomainParserGrammar.AggregationTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAggregationType2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAggregationType(new DomainParserGrammar.AggregationTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAggregationType3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AggregationTypeContext aggregationTypeContext = new DomainParserGrammar.AggregationTypeContext(
        new ParserRuleContext(), 1);
    aggregationTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAggregationType(aggregationTypeContext));
  }

  @Test
  public void testVisitAlias() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitAlias(new DomainParserGrammar.AliasContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAlias2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAlias(new DomainParserGrammar.AliasContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAlias3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AliasContext aliasContext = new DomainParserGrammar.AliasContext(new ParserRuleContext(), 1);
    aliasContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAlias(aliasContext));
  }

  @Test
  public void testVisitAllFunction() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAllFunction(new DomainParserGrammar.AllFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllFunction2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAllFunction(new DomainParserGrammar.AllFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllFunction3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AllFunctionContext allFunctionContext = new DomainParserGrammar.AllFunctionContext(
        new ParserRuleContext(), 1);
    allFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAllFunction(allFunctionContext));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(
        new DomainParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(
        new DomainParserGrammar.AllFunctionWithMilestoningContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AllFunctionWithMilestoningContext allFunctionWithMilestoningContext = new DomainParserGrammar.AllFunctionWithMilestoningContext(
        new ParserRuleContext(), 1);
    allFunctionWithMilestoningContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(allFunctionWithMilestoningContext));
  }

  @Test
  public void testVisitAllOrFunction() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAllOrFunction(new DomainParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllOrFunction2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAllOrFunction(new DomainParserGrammar.AllOrFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllOrFunction3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AllOrFunctionContext allOrFunctionContext = new DomainParserGrammar.AllOrFunctionContext(
        new ParserRuleContext(), 1);
    allOrFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAllOrFunction(allOrFunctionContext));
  }

  @Test
  public void testVisitAllVersionsFunction() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAllVersionsFunction(new DomainParserGrammar.AllVersionsFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllVersionsFunction2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAllVersionsFunction(new DomainParserGrammar.AllVersionsFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllVersionsFunction3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AllVersionsFunctionContext allVersionsFunctionContext = new DomainParserGrammar.AllVersionsFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAllVersionsFunction(allVersionsFunctionContext));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(
        new DomainParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(
        new DomainParserGrammar.AllVersionsInRangeFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AllVersionsInRangeFunctionContext allVersionsInRangeFunctionContext = new DomainParserGrammar.AllVersionsInRangeFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsInRangeFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(allVersionsInRangeFunctionContext));
  }

  @Test
  public void testVisitArithmeticPart() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitArithmeticPart(new DomainParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitArithmeticPart2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitArithmeticPart(new DomainParserGrammar.ArithmeticPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitArithmeticPart3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ArithmeticPartContext arithmeticPartContext = new DomainParserGrammar.ArithmeticPartContext(
        new ParserRuleContext(), 1);
    arithmeticPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitArithmeticPart(arithmeticPartContext));
  }

  @Test
  public void testVisitAssociation() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAssociation(new DomainParserGrammar.AssociationContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAssociation2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAssociation(new DomainParserGrammar.AssociationContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAssociation3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AssociationContext associationContext = new DomainParserGrammar.AssociationContext(
        new ParserRuleContext(), 1);
    associationContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAssociation(associationContext));
  }

  @Test
  public void testVisitAssociationBody() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAssociationBody(new DomainParserGrammar.AssociationBodyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAssociationBody2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAssociationBody(new DomainParserGrammar.AssociationBodyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAssociationBody3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AssociationBodyContext associationBodyContext = new DomainParserGrammar.AssociationBodyContext(
        new ParserRuleContext(), 1);
    associationBodyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAssociationBody(associationBodyContext));
  }

  @Test
  public void testVisitAssociationProjection() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAssociationProjection(new DomainParserGrammar.AssociationProjectionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAssociationProjection2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAssociationProjection(new DomainParserGrammar.AssociationProjectionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAssociationProjection3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AssociationProjectionContext associationProjectionContext = new DomainParserGrammar.AssociationProjectionContext(
        new ParserRuleContext(), 1);
    associationProjectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAssociationProjection(associationProjectionContext));
  }

  @Test
  public void testVisitAtomicExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAtomicExpression(new DomainParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAtomicExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitAtomicExpression(new DomainParserGrammar.AtomicExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAtomicExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.AtomicExpressionContext atomicExpressionContext = new DomainParserGrammar.AtomicExpressionContext(
        new ParserRuleContext(), 1);
    atomicExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitAtomicExpression(atomicExpressionContext));
  }

  @Test
  public void testVisitBooleanPart() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitBooleanPart(new DomainParserGrammar.BooleanPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitBooleanPart2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitBooleanPart(new DomainParserGrammar.BooleanPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitBooleanPart3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.BooleanPartContext booleanPartContext = new DomainParserGrammar.BooleanPartContext(
        new ParserRuleContext(), 1);
    booleanPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitBooleanPart(booleanPartContext));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitBuildMilestoningVariableExpression(
        new DomainParserGrammar.BuildMilestoningVariableExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitBuildMilestoningVariableExpression(
        new DomainParserGrammar.BuildMilestoningVariableExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.BuildMilestoningVariableExpressionContext buildMilestoningVariableExpressionContext = new DomainParserGrammar.BuildMilestoningVariableExpressionContext(
        new ParserRuleContext(), 1);
    buildMilestoningVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitBuildMilestoningVariableExpression(buildMilestoningVariableExpressionContext));
  }

  @Test
  public void testVisitCanonicalExpr() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitCanonicalExpr(new DomainParserGrammar.CanonicalExprContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCanonicalExpr2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitCanonicalExpr(new DomainParserGrammar.CanonicalExprContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCanonicalExpr3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.CanonicalExprContext canonicalExprContext = new DomainParserGrammar.CanonicalExprContext(
        new ParserRuleContext(), 1);
    canonicalExprContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitCanonicalExpr(canonicalExprContext));
  }

  @Test
  public void testVisitClassBody() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitClassBody(new DomainParserGrammar.ClassBodyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitClassBody2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitClassBody(new DomainParserGrammar.ClassBodyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitClassBody3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ClassBodyContext classBodyContext = new DomainParserGrammar.ClassBodyContext(
        new ParserRuleContext(), 1);
    classBodyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitClassBody(classBodyContext));
  }

  @Test
  public void testVisitClassDefinition() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitClassDefinition(new DomainParserGrammar.ClassDefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitClassDefinition2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitClassDefinition(new DomainParserGrammar.ClassDefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitClassDefinition3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ClassDefinitionContext classDefinitionContext = new DomainParserGrammar.ClassDefinitionContext(
        new ParserRuleContext(), 1);
    classDefinitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitClassDefinition(classDefinitionContext));
  }

  @Test
  public void testVisitCodeBlock() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitCodeBlock(new DomainParserGrammar.CodeBlockContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCodeBlock2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitCodeBlock(new DomainParserGrammar.CodeBlockContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCodeBlock3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.CodeBlockContext codeBlockContext = new DomainParserGrammar.CodeBlockContext(
        new ParserRuleContext(), 1);
    codeBlockContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitCodeBlock(codeBlockContext));
  }

  @Test
  public void testVisitCombinedArithmeticOnly() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitCombinedArithmeticOnly(
        new DomainParserGrammar.CombinedArithmeticOnlyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCombinedArithmeticOnly2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitCombinedArithmeticOnly(new DomainParserGrammar.CombinedArithmeticOnlyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCombinedArithmeticOnly3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.CombinedArithmeticOnlyContext combinedArithmeticOnlyContext = new DomainParserGrammar.CombinedArithmeticOnlyContext(
        new ParserRuleContext(), 1);
    combinedArithmeticOnlyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitCombinedArithmeticOnly(combinedArithmeticOnlyContext));
  }

  @Test
  public void testVisitCombinedExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitCombinedExpression(new DomainParserGrammar.CombinedExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCombinedExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitCombinedExpression(new DomainParserGrammar.CombinedExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCombinedExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.CombinedExpressionContext combinedExpressionContext = new DomainParserGrammar.CombinedExpressionContext(
        new ParserRuleContext(), 1);
    combinedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitCombinedExpression(combinedExpressionContext));
  }

  @Test
  public void testVisitComplexConstraint() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitComplexConstraint(new DomainParserGrammar.ComplexConstraintContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitComplexConstraint2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitComplexConstraint(new DomainParserGrammar.ComplexConstraintContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitComplexConstraint3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ComplexConstraintContext complexConstraintContext = new DomainParserGrammar.ComplexConstraintContext(
        new ParserRuleContext(), 1);
    complexConstraintContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitComplexConstraint(complexConstraintContext));
  }

  @Test
  public void testVisitComplexProperty() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitComplexProperty(new DomainParserGrammar.ComplexPropertyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitComplexProperty2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitComplexProperty(new DomainParserGrammar.ComplexPropertyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitComplexProperty3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ComplexPropertyContext complexPropertyContext = new DomainParserGrammar.ComplexPropertyContext(
        new ParserRuleContext(), 1);
    complexPropertyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitComplexProperty(complexPropertyContext));
  }

  @Test
  public void testVisitConstraint() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraint(new DomainParserGrammar.ConstraintContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConstraint2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraint(new DomainParserGrammar.ConstraintContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConstraint3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ConstraintContext constraintContext = new DomainParserGrammar.ConstraintContext(
        new ParserRuleContext(), 1);
    constraintContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraint(constraintContext));
  }

  @Test
  public void testVisitConstraintEnforcementLevel() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintEnforcementLevel(
        new DomainParserGrammar.ConstraintEnforcementLevelContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConstraintEnforcementLevel2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintEnforcementLevel(
        new DomainParserGrammar.ConstraintEnforcementLevelContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConstraintEnforcementLevel3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ConstraintEnforcementLevelContext constraintEnforcementLevelContext = new DomainParserGrammar.ConstraintEnforcementLevelContext(
        new ParserRuleContext(), 1);
    constraintEnforcementLevelContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintEnforcementLevel(constraintEnforcementLevelContext));
  }

  @Test
  public void testVisitConstraintEnforcementLevelType() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintEnforcementLevelType(
        new DomainParserGrammar.ConstraintEnforcementLevelTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConstraintEnforcementLevelType2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintEnforcementLevelType(
        new DomainParserGrammar.ConstraintEnforcementLevelTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConstraintEnforcementLevelType3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ConstraintEnforcementLevelTypeContext constraintEnforcementLevelTypeContext = new DomainParserGrammar.ConstraintEnforcementLevelTypeContext(
        new ParserRuleContext(), 1);
    constraintEnforcementLevelTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitConstraintEnforcementLevelType(constraintEnforcementLevelTypeContext));
  }

  @Test
  public void testVisitConstraintExternalId() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintExternalId(new DomainParserGrammar.ConstraintExternalIdContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConstraintExternalId2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintExternalId(new DomainParserGrammar.ConstraintExternalIdContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConstraintExternalId3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ConstraintExternalIdContext constraintExternalIdContext = new DomainParserGrammar.ConstraintExternalIdContext(
        new ParserRuleContext(), 1);
    constraintExternalIdContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintExternalId(constraintExternalIdContext));
  }

  @Test
  public void testVisitConstraintFunction() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintFunction(new DomainParserGrammar.ConstraintFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConstraintFunction2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintFunction(new DomainParserGrammar.ConstraintFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConstraintFunction3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ConstraintFunctionContext constraintFunctionContext = new DomainParserGrammar.ConstraintFunctionContext(
        new ParserRuleContext(), 1);
    constraintFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintFunction(constraintFunctionContext));
  }

  @Test
  public void testVisitConstraintId() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintId(new DomainParserGrammar.ConstraintIdContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConstraintId2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintId(new DomainParserGrammar.ConstraintIdContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConstraintId3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ConstraintIdContext constraintIdContext = new DomainParserGrammar.ConstraintIdContext(
        new ParserRuleContext(), 1);
    constraintIdContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintId(constraintIdContext));
  }

  @Test
  public void testVisitConstraintMessage() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintMessage(new DomainParserGrammar.ConstraintMessageContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConstraintMessage2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintMessage(new DomainParserGrammar.ConstraintMessageContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConstraintMessage3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ConstraintMessageContext constraintMessageContext = new DomainParserGrammar.ConstraintMessageContext(
        new ParserRuleContext(), 1);
    constraintMessageContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintMessage(constraintMessageContext));
  }

  @Test
  public void testVisitConstraintOwner() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintOwner(new DomainParserGrammar.ConstraintOwnerContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConstraintOwner2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraintOwner(new DomainParserGrammar.ConstraintOwnerContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConstraintOwner3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ConstraintOwnerContext constraintOwnerContext = new DomainParserGrammar.ConstraintOwnerContext(
        new ParserRuleContext(), 1);
    constraintOwnerContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraintOwner(constraintOwnerContext));
  }

  @Test
  public void testVisitConstraints() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraints(new DomainParserGrammar.ConstraintsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitConstraints2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitConstraints(new DomainParserGrammar.ConstraintsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitConstraints3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ConstraintsContext constraintsContext = new DomainParserGrammar.ConstraintsContext(
        new ParserRuleContext(), 1);
    constraintsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitConstraints(constraintsContext));
  }

  @Test
  public void testVisitContravarianceTypeParameter() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitContravarianceTypeParameter(
        new DomainParserGrammar.ContravarianceTypeParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameter2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitContravarianceTypeParameter(
        new DomainParserGrammar.ContravarianceTypeParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameter3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ContravarianceTypeParameterContext contravarianceTypeParameterContext = new DomainParserGrammar.ContravarianceTypeParameterContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitContravarianceTypeParameter(contravarianceTypeParameterContext));
  }

  @Test
  public void testVisitContravarianceTypeParameters() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitContravarianceTypeParameters(
        new DomainParserGrammar.ContravarianceTypeParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameters2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitContravarianceTypeParameters(
        new DomainParserGrammar.ContravarianceTypeParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameters3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ContravarianceTypeParametersContext contravarianceTypeParametersContext = new DomainParserGrammar.ContravarianceTypeParametersContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitContravarianceTypeParameters(contravarianceTypeParametersContext));
  }

  @Test
  public void testVisitDefaultValue() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDefaultValue(new DomainParserGrammar.DefaultValueContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefaultValue2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDefaultValue(new DomainParserGrammar.DefaultValueContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefaultValue3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.DefaultValueContext defaultValueContext = new DomainParserGrammar.DefaultValueContext(
        new ParserRuleContext(), 1);
    defaultValueContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDefaultValue(defaultValueContext));
  }

  @Test
  public void testVisitDefaultValueExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDefaultValueExpression(
        new DomainParserGrammar.DefaultValueExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefaultValueExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDefaultValueExpression(new DomainParserGrammar.DefaultValueExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefaultValueExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.DefaultValueExpressionContext defaultValueExpressionContext = new DomainParserGrammar.DefaultValueExpressionContext(
        new ParserRuleContext(), 1);
    defaultValueExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDefaultValueExpression(defaultValueExpressionContext));
  }

  @Test
  public void testVisitDefaultValueExpressionsArray() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDefaultValueExpressionsArray(
        new DomainParserGrammar.DefaultValueExpressionsArrayContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefaultValueExpressionsArray2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDefaultValueExpressionsArray(
        new DomainParserGrammar.DefaultValueExpressionsArrayContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefaultValueExpressionsArray3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.DefaultValueExpressionsArrayContext defaultValueExpressionsArrayContext = new DomainParserGrammar.DefaultValueExpressionsArrayContext(
        new ParserRuleContext(), 1);
    defaultValueExpressionsArrayContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDefaultValueExpressionsArray(defaultValueExpressionsArrayContext));
  }

  @Test
  public void testVisitDefinition() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDefinition(new DomainParserGrammar.DefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefinition2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDefinition(new DomainParserGrammar.DefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefinition3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.DefinitionContext definitionContext = new DomainParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitDerivedProperty() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDerivedProperty(new DomainParserGrammar.DerivedPropertyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDerivedProperty2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDerivedProperty(new DomainParserGrammar.DerivedPropertyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDerivedProperty3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.DerivedPropertyContext derivedPropertyContext = new DomainParserGrammar.DerivedPropertyContext(
        new ParserRuleContext(), 1);
    derivedPropertyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDerivedProperty(derivedPropertyContext));
  }

  @Test
  public void testVisitDsl() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDsl(new DomainParserGrammar.DslContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDsl2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDsl(new DomainParserGrammar.DslContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDsl3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.DslContext dslContext = new DomainParserGrammar.DslContext(new ParserRuleContext(), 1);
    dslContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDsl(dslContext));
  }

  @Test
  public void testVisitDslContent() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDslContent(new DomainParserGrammar.DslContentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslContent2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDslContent(new DomainParserGrammar.DslContentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslContent3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.DslContentContext dslContentContext = new DomainParserGrammar.DslContentContext(
        new ParserRuleContext(), 1);
    dslContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDslContent(dslContentContext));
  }

  @Test
  public void testVisitDslGraphFetch() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDslGraphFetch(new DomainParserGrammar.DslGraphFetchContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslGraphFetch2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDslGraphFetch(new DomainParserGrammar.DslGraphFetchContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslGraphFetch3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.DslGraphFetchContext dslGraphFetchContext = new DomainParserGrammar.DslGraphFetchContext(
        new ParserRuleContext(), 1);
    dslGraphFetchContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDslGraphFetch(dslGraphFetchContext));
  }

  @Test
  public void testVisitDslNavigationPath() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDslNavigationPath(new DomainParserGrammar.DslNavigationPathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslNavigationPath2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitDslNavigationPath(new DomainParserGrammar.DslNavigationPathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslNavigationPath3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.DslNavigationPathContext dslNavigationPathContext = new DomainParserGrammar.DslNavigationPathContext(
        new ParserRuleContext(), 1);
    dslNavigationPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitDslNavigationPath(dslNavigationPathContext));
  }

  @Test
  public void testVisitElementDefinition() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitElementDefinition(new DomainParserGrammar.ElementDefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitElementDefinition2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitElementDefinition(new DomainParserGrammar.ElementDefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitElementDefinition3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ElementDefinitionContext elementDefinitionContext = new DomainParserGrammar.ElementDefinitionContext(
        new ParserRuleContext(), 1);
    elementDefinitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitElementDefinition(elementDefinitionContext));
  }

  @Test
  public void testVisitEnumDefinition() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitEnumDefinition(new DomainParserGrammar.EnumDefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumDefinition2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitEnumDefinition(new DomainParserGrammar.EnumDefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumDefinition3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.EnumDefinitionContext enumDefinitionContext = new DomainParserGrammar.EnumDefinitionContext(
        new ParserRuleContext(), 1);
    enumDefinitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitEnumDefinition(enumDefinitionContext));
  }

  @Test
  public void testVisitEnumReference() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitEnumReference(new DomainParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumReference2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitEnumReference(new DomainParserGrammar.EnumReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumReference3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.EnumReferenceContext enumReferenceContext = new DomainParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);
    enumReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitEnumReference(enumReferenceContext));
  }

  @Test
  public void testVisitEnumValue() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitEnumValue(new DomainParserGrammar.EnumValueContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumValue2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitEnumValue(new DomainParserGrammar.EnumValueContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumValue3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.EnumValueContext enumValueContext = new DomainParserGrammar.EnumValueContext(
        new ParserRuleContext(), 1);
    enumValueContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitEnumValue(enumValueContext));
  }

  @Test
  public void testVisitEqualNotEqual() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitEqualNotEqual(new DomainParserGrammar.EqualNotEqualContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEqualNotEqual2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitEqualNotEqual(new DomainParserGrammar.EqualNotEqualContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEqualNotEqual3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.EqualNotEqualContext equalNotEqualContext = new DomainParserGrammar.EqualNotEqualContext(
        new ParserRuleContext(), 1);
    equalNotEqualContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitEqualNotEqual(equalNotEqualContext));
  }

  @Test
  public void testVisitExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpression(new DomainParserGrammar.ExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpression(new DomainParserGrammar.ExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ExpressionContext expressionContext = new DomainParserGrammar.ExpressionContext(
        new ParserRuleContext(), 1);
    expressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpression(expressionContext));
  }

  @Test
  public void testVisitExpressionInstance() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpressionInstance(new DomainParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstance2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpressionInstance(new DomainParserGrammar.ExpressionInstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstance3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ExpressionInstanceContext expressionInstanceContext = new DomainParserGrammar.ExpressionInstanceContext(
        new ParserRuleContext(), 1);
    expressionInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionInstance(expressionInstanceContext));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionInstanceAtomicRightSide(
        new DomainParserGrammar.ExpressionInstanceAtomicRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionInstanceAtomicRightSide(
        new DomainParserGrammar.ExpressionInstanceAtomicRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ExpressionInstanceAtomicRightSideContext expressionInstanceAtomicRightSideContext = new DomainParserGrammar.ExpressionInstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpressionInstanceAtomicRightSide(expressionInstanceAtomicRightSideContext));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionInstanceParserPropertyAssignment(
        new DomainParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionInstanceParserPropertyAssignment(
        new DomainParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ExpressionInstanceParserPropertyAssignmentContext expressionInstanceParserPropertyAssignmentContext = new DomainParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(
        new ParserRuleContext(), 1);
    expressionInstanceParserPropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpressionInstanceParserPropertyAssignment(expressionInstanceParserPropertyAssignmentContext));
  }

  @Test
  public void testVisitExpressionInstanceRightSide() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionInstanceRightSide(
        new DomainParserGrammar.ExpressionInstanceRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceRightSide2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionInstanceRightSide(
        new DomainParserGrammar.ExpressionInstanceRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceRightSide3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ExpressionInstanceRightSideContext expressionInstanceRightSideContext = new DomainParserGrammar.ExpressionInstanceRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionInstanceRightSide(expressionInstanceRightSideContext));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(
        new DomainParserGrammar.ExpressionOrExpressionGroupContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(
        new DomainParserGrammar.ExpressionOrExpressionGroupContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ExpressionOrExpressionGroupContext expressionOrExpressionGroupContext = new DomainParserGrammar.ExpressionOrExpressionGroupContext(
        new ParserRuleContext(), 1);
    expressionOrExpressionGroupContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(expressionOrExpressionGroupContext));
  }

  @Test
  public void testVisitExpressionPart() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpressionPart(new DomainParserGrammar.ExpressionPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionPart2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpressionPart(new DomainParserGrammar.ExpressionPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionPart3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ExpressionPartContext expressionPartContext = new DomainParserGrammar.ExpressionPartContext(
        new ParserRuleContext(), 1);
    expressionPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionPart(expressionPartContext));
  }

  @Test
  public void testVisitExpressionsArray() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpressionsArray(new DomainParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionsArray2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitExpressionsArray(new DomainParserGrammar.ExpressionsArrayContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionsArray3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ExpressionsArrayContext expressionsArrayContext = new DomainParserGrammar.ExpressionsArrayContext(
        new ParserRuleContext(), 1);
    expressionsArrayContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitExpressionsArray(expressionsArrayContext));
  }

  @Test
  public void testVisitFromMultiplicity() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFromMultiplicity(new DomainParserGrammar.FromMultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFromMultiplicity2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFromMultiplicity(new DomainParserGrammar.FromMultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFromMultiplicity3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.FromMultiplicityContext fromMultiplicityContext = new DomainParserGrammar.FromMultiplicityContext(
        new ParserRuleContext(), 1);
    fromMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFromMultiplicity(fromMultiplicityContext));
  }

  @Test
  public void testVisitFunctionDefinition() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFunctionDefinition(new DomainParserGrammar.FunctionDefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionDefinition2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFunctionDefinition(new DomainParserGrammar.FunctionDefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionDefinition3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.FunctionDefinitionContext functionDefinitionContext = new DomainParserGrammar.FunctionDefinitionContext(
        new ParserRuleContext(), 1);
    functionDefinitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionDefinition(functionDefinitionContext));
  }

  @Test
  public void testVisitFunctionExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFunctionExpression(new DomainParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFunctionExpression(new DomainParserGrammar.FunctionExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.FunctionExpressionContext functionExpressionContext = new DomainParserGrammar.FunctionExpressionContext(
        new ParserRuleContext(), 1);
    functionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionExpression(functionExpressionContext));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        new DomainParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        new DomainParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext functionExpressionLatestMilestoningDateParameterContext = new DomainParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1);
    functionExpressionLatestMilestoningDateParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        functionExpressionLatestMilestoningDateParameterContext));
  }

  @Test
  public void testVisitFunctionExpressionParameters() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionExpressionParameters(
        new DomainParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpressionParameters2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionExpressionParameters(
        new DomainParserGrammar.FunctionExpressionParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpressionParameters3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.FunctionExpressionParametersContext functionExpressionParametersContext = new DomainParserGrammar.FunctionExpressionParametersContext(
        new ParserRuleContext(), 1);
    functionExpressionParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionExpressionParameters(functionExpressionParametersContext));
  }

  @Test
  public void testVisitFunctionTypePureType() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFunctionTypePureType(new DomainParserGrammar.FunctionTypePureTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionTypePureType2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFunctionTypePureType(new DomainParserGrammar.FunctionTypePureTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionTypePureType3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.FunctionTypePureTypeContext functionTypePureTypeContext = new DomainParserGrammar.FunctionTypePureTypeContext(
        new ParserRuleContext(), 1);
    functionTypePureTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionTypePureType(functionTypePureTypeContext));
  }

  @Test
  public void testVisitFunctionTypeSignature() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFunctionTypeSignature(new DomainParserGrammar.FunctionTypeSignatureContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionTypeSignature2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitFunctionTypeSignature(new DomainParserGrammar.FunctionTypeSignatureContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionTypeSignature3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.FunctionTypeSignatureContext functionTypeSignatureContext = new DomainParserGrammar.FunctionTypeSignatureContext(
        new ParserRuleContext(), 1);
    functionTypeSignatureContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionTypeSignature(functionTypeSignatureContext));
  }

  @Test
  public void testVisitFunctionVariableExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionVariableExpression(
        new DomainParserGrammar.FunctionVariableExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionVariableExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionVariableExpression(
        new DomainParserGrammar.FunctionVariableExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionVariableExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.FunctionVariableExpressionContext functionVariableExpressionContext = new DomainParserGrammar.FunctionVariableExpressionContext(
        new ParserRuleContext(), 1);
    functionVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitFunctionVariableExpression(functionVariableExpressionContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitIdentifier(new DomainParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitIdentifier(new DomainParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.IdentifierContext identifierContext = new DomainParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitImportStatement() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitImportStatement(new DomainParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitImportStatement2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitImportStatement(new DomainParserGrammar.ImportStatementContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitImportStatement3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ImportStatementContext importStatementContext = new DomainParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitImportStatement(importStatementContext));
  }

  @Test
  public void testVisitImports() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitImports(new DomainParserGrammar.ImportsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitImports2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitImports(new DomainParserGrammar.ImportsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitImports3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ImportsContext importsContext = new DomainParserGrammar.ImportsContext(new ParserRuleContext(),
        1);
    importsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitImports(importsContext));
  }

  @Test
  public void testVisitInstance() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstance(new DomainParserGrammar.InstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstance2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitInstance(new DomainParserGrammar.InstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstance3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.InstanceContext instanceContext = new DomainParserGrammar.InstanceContext(
        new ParserRuleContext(), 1);
    instanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstance(instanceContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSide() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceAtomicRightSide(
        new DomainParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSide2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstanceAtomicRightSide(new DomainParserGrammar.InstanceAtomicRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSide3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.InstanceAtomicRightSideContext instanceAtomicRightSideContext = new DomainParserGrammar.InstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceAtomicRightSide(instanceAtomicRightSideContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(
        new DomainParserGrammar.InstanceAtomicRightSideScalarContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(
        new DomainParserGrammar.InstanceAtomicRightSideScalarContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.InstanceAtomicRightSideScalarContext instanceAtomicRightSideScalarContext = new DomainParserGrammar.InstanceAtomicRightSideScalarContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideScalarContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(instanceAtomicRightSideScalarContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(
        new DomainParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(
        new DomainParserGrammar.InstanceAtomicRightSideVectorContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.InstanceAtomicRightSideVectorContext instanceAtomicRightSideVectorContext = new DomainParserGrammar.InstanceAtomicRightSideVectorContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideVectorContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(instanceAtomicRightSideVectorContext));
  }

  @Test
  public void testVisitInstanceLiteral() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstanceLiteral(new DomainParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteral2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstanceLiteral(new DomainParserGrammar.InstanceLiteralContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteral3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.InstanceLiteralContext instanceLiteralContext = new DomainParserGrammar.InstanceLiteralContext(
        new ParserRuleContext(), 1);
    instanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceLiteral(instanceLiteralContext));
  }

  @Test
  public void testVisitInstanceLiteralToken() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstanceLiteralToken(new DomainParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstanceLiteralToken(new DomainParserGrammar.InstanceLiteralTokenContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.InstanceLiteralTokenContext instanceLiteralTokenContext = new DomainParserGrammar.InstanceLiteralTokenContext(
        new ParserRuleContext(), 1);
    instanceLiteralTokenContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceLiteralToken(instanceLiteralTokenContext));
  }

  @Test
  public void testVisitInstancePropertyAssignment() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstancePropertyAssignment(
        new DomainParserGrammar.InstancePropertyAssignmentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstancePropertyAssignment2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstancePropertyAssignment(
        new DomainParserGrammar.InstancePropertyAssignmentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstancePropertyAssignment3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.InstancePropertyAssignmentContext instancePropertyAssignmentContext = new DomainParserGrammar.InstancePropertyAssignmentContext(
        new ParserRuleContext(), 1);
    instancePropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstancePropertyAssignment(instancePropertyAssignmentContext));
  }

  @Test
  public void testVisitInstanceReference() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstanceReference(new DomainParserGrammar.InstanceReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceReference2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstanceReference(new DomainParserGrammar.InstanceReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceReference3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.InstanceReferenceContext instanceReferenceContext = new DomainParserGrammar.InstanceReferenceContext(
        new ParserRuleContext(), 1);
    instanceReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceReference(instanceReferenceContext));
  }

  @Test
  public void testVisitInstanceRightSide() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstanceRightSide(new DomainParserGrammar.InstanceRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceRightSide2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitInstanceRightSide(new DomainParserGrammar.InstanceRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceRightSide3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.InstanceRightSideContext instanceRightSideContext = new DomainParserGrammar.InstanceRightSideContext(
        new ParserRuleContext(), 1);
    instanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitInstanceRightSide(instanceRightSideContext));
  }

  @Test
  public void testVisitLambdaFunction() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLambdaFunction(new DomainParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaFunction2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLambdaFunction(new DomainParserGrammar.LambdaFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaFunction3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.LambdaFunctionContext lambdaFunctionContext = new DomainParserGrammar.LambdaFunctionContext(
        new ParserRuleContext(), 1);
    lambdaFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitLambdaFunction(lambdaFunctionContext));
  }

  @Test
  public void testVisitLambdaParam() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLambdaParam(new DomainParserGrammar.LambdaParamContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaParam2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLambdaParam(new DomainParserGrammar.LambdaParamContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaParam3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.LambdaParamContext lambdaParamContext = new DomainParserGrammar.LambdaParamContext(
        new ParserRuleContext(), 1);
    lambdaParamContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitLambdaParam(lambdaParamContext));
  }

  @Test
  public void testVisitLambdaParamType() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLambdaParamType(new DomainParserGrammar.LambdaParamTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaParamType2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLambdaParamType(new DomainParserGrammar.LambdaParamTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaParamType3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.LambdaParamTypeContext lambdaParamTypeContext = new DomainParserGrammar.LambdaParamTypeContext(
        new ParserRuleContext(), 1);
    lambdaParamTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitLambdaParamType(lambdaParamTypeContext));
  }

  @Test
  public void testVisitLambdaPipe() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLambdaPipe(new DomainParserGrammar.LambdaPipeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaPipe2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLambdaPipe(new DomainParserGrammar.LambdaPipeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaPipe3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.LambdaPipeContext lambdaPipeContext = new DomainParserGrammar.LambdaPipeContext(
        new ParserRuleContext(), 1);
    lambdaPipeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitLambdaPipe(lambdaPipeContext));
  }

  @Test
  public void testVisitLetExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLetExpression(new DomainParserGrammar.LetExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLetExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitLetExpression(new DomainParserGrammar.LetExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLetExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.LetExpressionContext letExpressionContext = new DomainParserGrammar.LetExpressionContext(
        new ParserRuleContext(), 1);
    letExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitLetExpression(letExpressionContext));
  }

  @Test
  public void testVisitMeasureBody() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMeasureBody(new DomainParserGrammar.MeasureBodyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMeasureBody2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMeasureBody(new DomainParserGrammar.MeasureBodyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMeasureBody3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.MeasureBodyContext measureBodyContext = new DomainParserGrammar.MeasureBodyContext(
        new ParserRuleContext(), 1);
    measureBodyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitMeasureBody(measureBodyContext));
  }

  @Test
  public void testVisitMeasureDefinition() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMeasureDefinition(new DomainParserGrammar.MeasureDefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMeasureDefinition2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMeasureDefinition(new DomainParserGrammar.MeasureDefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMeasureDefinition3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.MeasureDefinitionContext measureDefinitionContext = new DomainParserGrammar.MeasureDefinitionContext(
        new ParserRuleContext(), 1);
    measureDefinitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitMeasureDefinition(measureDefinitionContext));
  }

  @Test
  public void testVisitMeasureExpr() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMeasureExpr(new DomainParserGrammar.MeasureExprContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMeasureExpr2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMeasureExpr(new DomainParserGrammar.MeasureExprContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMeasureExpr3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.MeasureExprContext measureExprContext = new DomainParserGrammar.MeasureExprContext(
        new ParserRuleContext(), 1);
    measureExprContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitMeasureExpr(measureExprContext));
  }

  @Test
  public void testVisitMultiplicity() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMultiplicity(new DomainParserGrammar.MultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicity2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMultiplicity(new DomainParserGrammar.MultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicity3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.MultiplicityContext multiplicityContext = new DomainParserGrammar.MultiplicityContext(
        new ParserRuleContext(), 1);
    multiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitMultiplicity(multiplicityContext));
  }

  @Test
  public void testVisitMultiplicityArgument() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMultiplicityArgument(new DomainParserGrammar.MultiplicityArgumentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicityArgument2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMultiplicityArgument(new DomainParserGrammar.MultiplicityArgumentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicityArgument3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.MultiplicityArgumentContext multiplicityArgumentContext = new DomainParserGrammar.MultiplicityArgumentContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitMultiplicityArgument(multiplicityArgumentContext));
  }

  @Test
  public void testVisitMultiplicityArguments() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMultiplicityArguments(new DomainParserGrammar.MultiplicityArgumentsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicityArguments2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMultiplicityArguments(new DomainParserGrammar.MultiplicityArgumentsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicityArguments3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.MultiplicityArgumentsContext multiplicityArgumentsContext = new DomainParserGrammar.MultiplicityArgumentsContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitMultiplicityArguments(multiplicityArgumentsContext));
  }

  @Test
  public void testVisitMultiplictyParameters() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMultiplictyParameters(new DomainParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplictyParameters2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitMultiplictyParameters(new DomainParserGrammar.MultiplictyParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplictyParameters3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.MultiplictyParametersContext multiplictyParametersContext = new DomainParserGrammar.MultiplictyParametersContext(
        new ParserRuleContext(), 1);
    multiplictyParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitMultiplictyParameters(multiplictyParametersContext));
  }

  @Test
  public void testVisitNativeFunction() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitNativeFunction(new DomainParserGrammar.NativeFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitNativeFunction2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitNativeFunction(new DomainParserGrammar.NativeFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitNativeFunction3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.NativeFunctionContext nativeFunctionContext = new DomainParserGrammar.NativeFunctionContext(
        new ParserRuleContext(), 1);
    nativeFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitNativeFunction(nativeFunctionContext));
  }

  @Test
  public void testVisitNonConvertibleMeasureExpr() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitNonConvertibleMeasureExpr(
        new DomainParserGrammar.NonConvertibleMeasureExprContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitNonConvertibleMeasureExpr2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitNonConvertibleMeasureExpr(
        new DomainParserGrammar.NonConvertibleMeasureExprContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitNonConvertibleMeasureExpr3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.NonConvertibleMeasureExprContext nonConvertibleMeasureExprContext = new DomainParserGrammar.NonConvertibleMeasureExprContext(
        new ParserRuleContext(), 1);
    nonConvertibleMeasureExprContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitNonConvertibleMeasureExpr(nonConvertibleMeasureExprContext));
  }

  @Test
  public void testVisitNotExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitNotExpression(new DomainParserGrammar.NotExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitNotExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitNotExpression(new DomainParserGrammar.NotExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitNotExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.NotExpressionContext notExpressionContext = new DomainParserGrammar.NotExpressionContext(
        new ParserRuleContext(), 1);
    notExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitNotExpression(notExpressionContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitPackagePath(new DomainParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitPackagePath(new DomainParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.PackagePathContext packagePathContext = new DomainParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitProfile() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitProfile(new DomainParserGrammar.ProfileContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitProfile2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitProfile(new DomainParserGrammar.ProfileContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitProfile3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ProfileContext profileContext = new DomainParserGrammar.ProfileContext(new ParserRuleContext(),
        1);
    profileContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitProfile(profileContext));
  }

  @Test
  public void testVisitProgramLine() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitProgramLine(new DomainParserGrammar.ProgramLineContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitProgramLine2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitProgramLine(new DomainParserGrammar.ProgramLineContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitProgramLine3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ProgramLineContext programLineContext = new DomainParserGrammar.ProgramLineContext(
        new ParserRuleContext(), 1);
    programLineContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitProgramLine(programLineContext));
  }

  @Test
  public void testVisitProjection() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitProjection(new DomainParserGrammar.ProjectionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitProjection2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitProjection(new DomainParserGrammar.ProjectionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitProjection3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ProjectionContext projectionContext = new DomainParserGrammar.ProjectionContext(
        new ParserRuleContext(), 1);
    projectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitProjection(projectionContext));
  }

  @Test
  public void testVisitProperties() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitProperties(new DomainParserGrammar.PropertiesContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitProperties2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitProperties(new DomainParserGrammar.PropertiesContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitProperties3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.PropertiesContext propertiesContext = new DomainParserGrammar.PropertiesContext(
        new ParserRuleContext(), 1);
    propertiesContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitProperties(propertiesContext));
  }

  @Test
  public void testVisitProperty() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitProperty(new DomainParserGrammar.PropertyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitProperty2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitProperty(new DomainParserGrammar.PropertyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitProperty3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.PropertyContext propertyContext = new DomainParserGrammar.PropertyContext(
        new ParserRuleContext(), 1);
    propertyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitProperty(propertyContext));
  }

  @Test
  public void testVisitPropertyBracketExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPropertyBracketExpression(
        new DomainParserGrammar.PropertyBracketExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyBracketExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPropertyBracketExpression(
        new DomainParserGrammar.PropertyBracketExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyBracketExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.PropertyBracketExpressionContext propertyBracketExpressionContext = new DomainParserGrammar.PropertyBracketExpressionContext(
        new ParserRuleContext(), 1);
    propertyBracketExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPropertyBracketExpression(propertyBracketExpressionContext));
  }

  @Test
  public void testVisitPropertyExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitPropertyExpression(new DomainParserGrammar.PropertyExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitPropertyExpression(new DomainParserGrammar.PropertyExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.PropertyExpressionContext propertyExpressionContext = new DomainParserGrammar.PropertyExpressionContext(
        new ParserRuleContext(), 1);
    propertyExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPropertyExpression(propertyExpressionContext));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(
        new DomainParserGrammar.PropertyOrFunctionExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(
        new DomainParserGrammar.PropertyOrFunctionExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.PropertyOrFunctionExpressionContext propertyOrFunctionExpressionContext = new DomainParserGrammar.PropertyOrFunctionExpressionContext(
        new ParserRuleContext(), 1);
    propertyOrFunctionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(propertyOrFunctionExpressionContext));
  }

  @Test
  public void testVisitPropertyRef() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitPropertyRef(new DomainParserGrammar.PropertyRefContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyRef2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitPropertyRef(new DomainParserGrammar.PropertyRefContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyRef3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.PropertyRefContext propertyRefContext = new DomainParserGrammar.PropertyRefContext(
        new ParserRuleContext(), 1);
    propertyRefContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPropertyRef(propertyRefContext));
  }

  @Test
  public void testVisitPropertyReturnType() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitPropertyReturnType(new DomainParserGrammar.PropertyReturnTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyReturnType2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitPropertyReturnType(new DomainParserGrammar.PropertyReturnTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyReturnType3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.PropertyReturnTypeContext propertyReturnTypeContext = new DomainParserGrammar.PropertyReturnTypeContext(
        new ParserRuleContext(), 1);
    propertyReturnTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitPropertyReturnType(propertyReturnTypeContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitQualifiedName(new DomainParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitQualifiedName(new DomainParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.QualifiedNameContext qualifiedNameContext = new DomainParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitQualifiedProperty() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitQualifiedProperty(new DomainParserGrammar.QualifiedPropertyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedProperty2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitQualifiedProperty(new DomainParserGrammar.QualifiedPropertyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedProperty3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.QualifiedPropertyContext qualifiedPropertyContext = new DomainParserGrammar.QualifiedPropertyContext(
        new ParserRuleContext(), 1);
    qualifiedPropertyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitQualifiedProperty(qualifiedPropertyContext));
  }

  @Test
  public void testVisitQualifiedPropertyBody() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitQualifiedPropertyBody(new DomainParserGrammar.QualifiedPropertyBodyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedPropertyBody2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitQualifiedPropertyBody(new DomainParserGrammar.QualifiedPropertyBodyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedPropertyBody3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.QualifiedPropertyBodyContext qualifiedPropertyBodyContext = new DomainParserGrammar.QualifiedPropertyBodyContext(
        new ParserRuleContext(), 1);
    qualifiedPropertyBodyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitQualifiedPropertyBody(qualifiedPropertyBodyContext));
  }

  @Test
  public void testVisitSignedExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSignedExpression(new DomainParserGrammar.SignedExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSignedExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSignedExpression(new DomainParserGrammar.SignedExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSignedExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.SignedExpressionContext signedExpressionContext = new DomainParserGrammar.SignedExpressionContext(
        new ParserRuleContext(), 1);
    signedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitSignedExpression(signedExpressionContext));
  }

  @Test
  public void testVisitSimpleConstraint() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSimpleConstraint(new DomainParserGrammar.SimpleConstraintContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSimpleConstraint2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSimpleConstraint(new DomainParserGrammar.SimpleConstraintContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSimpleConstraint3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.SimpleConstraintContext simpleConstraintContext = new DomainParserGrammar.SimpleConstraintContext(
        new ParserRuleContext(), 1);
    simpleConstraintContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitSimpleConstraint(simpleConstraintContext));
  }

  @Test
  public void testVisitSimpleProperty() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSimpleProperty(new DomainParserGrammar.SimplePropertyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSimpleProperty2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSimpleProperty(new DomainParserGrammar.SimplePropertyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSimpleProperty3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.SimplePropertyContext simplePropertyContext = new DomainParserGrammar.SimplePropertyContext(
        new ParserRuleContext(), 1);
    simplePropertyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitSimpleProperty(simplePropertyContext));
  }

  @Test
  public void testVisitSimplePropertyFilter() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSimplePropertyFilter(new DomainParserGrammar.SimplePropertyFilterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSimplePropertyFilter2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSimplePropertyFilter(new DomainParserGrammar.SimplePropertyFilterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSimplePropertyFilter3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.SimplePropertyFilterContext simplePropertyFilterContext = new DomainParserGrammar.SimplePropertyFilterContext(
        new ParserRuleContext(), 1);
    simplePropertyFilterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitSimplePropertyFilter(simplePropertyFilterContext));
  }

  @Test
  public void testVisitSliceExpression() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSliceExpression(new DomainParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSliceExpression2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitSliceExpression(new DomainParserGrammar.SliceExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSliceExpression3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.SliceExpressionContext sliceExpressionContext = new DomainParserGrammar.SliceExpressionContext(
        new ParserRuleContext(), 1);
    sliceExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitSliceExpression(sliceExpressionContext));
  }

  @Test
  public void testVisitStereotype() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitStereotype(new DomainParserGrammar.StereotypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitStereotype2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitStereotype(new DomainParserGrammar.StereotypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitStereotype3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.StereotypeContext stereotypeContext = new DomainParserGrammar.StereotypeContext(
        new ParserRuleContext(), 1);
    stereotypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitStereotype(stereotypeContext));
  }

  @Test
  public void testVisitStereotypeDefinitions() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitStereotypeDefinitions(new DomainParserGrammar.StereotypeDefinitionsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitStereotypeDefinitions2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitStereotypeDefinitions(new DomainParserGrammar.StereotypeDefinitionsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitStereotypeDefinitions3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.StereotypeDefinitionsContext stereotypeDefinitionsContext = new DomainParserGrammar.StereotypeDefinitionsContext(
        new ParserRuleContext(), 1);
    stereotypeDefinitionsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitStereotypeDefinitions(stereotypeDefinitionsContext));
  }

  @Test
  public void testVisitStereotypeReference() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitStereotypeReference(new DomainParserGrammar.StereotypeReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitStereotypeReference2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitStereotypeReference(new DomainParserGrammar.StereotypeReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitStereotypeReference3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.StereotypeReferenceContext stereotypeReferenceContext = new DomainParserGrammar.StereotypeReferenceContext(
        new ParserRuleContext(), 1);
    stereotypeReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitStereotypeReference(stereotypeReferenceContext));
  }

  @Test
  public void testVisitStereotypes() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitStereotypes(new DomainParserGrammar.StereotypesContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitStereotypes2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitStereotypes(new DomainParserGrammar.StereotypesContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitStereotypes3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.StereotypesContext stereotypesContext = new DomainParserGrammar.StereotypesContext(
        new ParserRuleContext(), 1);
    stereotypesContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitStereotypes(stereotypesContext));
  }

  @Test
  public void testVisitTagDefinitions() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTagDefinitions(new DomainParserGrammar.TagDefinitionsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTagDefinitions2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTagDefinitions(new DomainParserGrammar.TagDefinitionsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTagDefinitions3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TagDefinitionsContext tagDefinitionsContext = new DomainParserGrammar.TagDefinitionsContext(
        new ParserRuleContext(), 1);
    tagDefinitionsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTagDefinitions(tagDefinitionsContext));
  }

  @Test
  public void testVisitTagReference() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTagReference(new DomainParserGrammar.TagReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTagReference2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTagReference(new DomainParserGrammar.TagReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTagReference3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TagReferenceContext tagReferenceContext = new DomainParserGrammar.TagReferenceContext(
        new ParserRuleContext(), 1);
    tagReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTagReference(tagReferenceContext));
  }

  @Test
  public void testVisitTaggedValue() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTaggedValue(new DomainParserGrammar.TaggedValueContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTaggedValue2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTaggedValue(new DomainParserGrammar.TaggedValueContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTaggedValue3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TaggedValueContext taggedValueContext = new DomainParserGrammar.TaggedValueContext(
        new ParserRuleContext(), 1);
    taggedValueContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTaggedValue(taggedValueContext));
  }

  @Test
  public void testVisitTaggedValues() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTaggedValues(new DomainParserGrammar.TaggedValuesContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTaggedValues2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTaggedValues(new DomainParserGrammar.TaggedValuesContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTaggedValues3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TaggedValuesContext taggedValuesContext = new DomainParserGrammar.TaggedValuesContext(
        new ParserRuleContext(), 1);
    taggedValuesContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTaggedValues(taggedValuesContext));
  }

  @Test
  public void testVisitToMultiplicity() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitToMultiplicity(new DomainParserGrammar.ToMultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitToMultiplicity2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitToMultiplicity(new DomainParserGrammar.ToMultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitToMultiplicity3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.ToMultiplicityContext toMultiplicityContext = new DomainParserGrammar.ToMultiplicityContext(
        new ParserRuleContext(), 1);
    toMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitToMultiplicity(toMultiplicityContext));
  }

  @Test
  public void testVisitTreePath() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTreePath(new DomainParserGrammar.TreePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTreePath2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitTreePath(new DomainParserGrammar.TreePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTreePath3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TreePathContext treePathContext = new DomainParserGrammar.TreePathContext(
        new ParserRuleContext(), 1);
    treePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTreePath(treePathContext));
  }

  @Test
  public void testVisitTreePathClassBody() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTreePathClassBody(new DomainParserGrammar.TreePathClassBodyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTreePathClassBody2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTreePathClassBody(new DomainParserGrammar.TreePathClassBodyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTreePathClassBody3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TreePathClassBodyContext treePathClassBodyContext = new DomainParserGrammar.TreePathClassBodyContext(
        new ParserRuleContext(), 1);
    treePathClassBodyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTreePathClassBody(treePathClassBodyContext));
  }

  @Test
  public void testVisitTreePathPropertyParameterType() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTreePathPropertyParameterType(
        new DomainParserGrammar.TreePathPropertyParameterTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTreePathPropertyParameterType2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTreePathPropertyParameterType(
        new DomainParserGrammar.TreePathPropertyParameterTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTreePathPropertyParameterType3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TreePathPropertyParameterTypeContext treePathPropertyParameterTypeContext = new DomainParserGrammar.TreePathPropertyParameterTypeContext(
        new ParserRuleContext(), 1);
    treePathPropertyParameterTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTreePathPropertyParameterType(treePathPropertyParameterTypeContext));
  }

  @Test
  public void testVisitType() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitType(new DomainParserGrammar.TypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitType2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitType(new DomainParserGrammar.TypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitType3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TypeContext typeContext = new DomainParserGrammar.TypeContext(new ParserRuleContext(), 1);
    typeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitType(typeContext));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(
        new DomainParserGrammar.TypeAndMultiplicityParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(
        new DomainParserGrammar.TypeAndMultiplicityParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TypeAndMultiplicityParametersContext typeAndMultiplicityParametersContext = new DomainParserGrammar.TypeAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeAndMultiplicityParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(typeAndMultiplicityParametersContext));
  }

  @Test
  public void testVisitTypeArguments() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTypeArguments(new DomainParserGrammar.TypeArgumentsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeArguments2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTypeArguments(new DomainParserGrammar.TypeArgumentsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeArguments3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TypeArgumentsContext typeArgumentsContext = new DomainParserGrammar.TypeArgumentsContext(
        new ParserRuleContext(), 1);
    typeArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTypeArguments(typeArgumentsContext));
  }

  @Test
  public void testVisitTypeParameter() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTypeParameter(new DomainParserGrammar.TypeParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParameter2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTypeParameter(new DomainParserGrammar.TypeParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParameter3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TypeParameterContext typeParameterContext = new DomainParserGrammar.TypeParameterContext(
        new ParserRuleContext(), 1);
    typeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTypeParameter(typeParameterContext));
  }

  @Test
  public void testVisitTypeParameters() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTypeParameters(new DomainParserGrammar.TypeParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParameters2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitTypeParameters(new DomainParserGrammar.TypeParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParameters3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TypeParametersContext typeParametersContext = new DomainParserGrammar.TypeParametersContext(
        new ParserRuleContext(), 1);
    typeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTypeParameters(typeParametersContext));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
        new DomainParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
            new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
        new DomainParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(parserRuleContext,
            1)));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext typeParametersWithContravarianceAndMultiplicityParametersContext = new DomainParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeParametersWithContravarianceAndMultiplicityParametersContext
        .<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
        typeParametersWithContravarianceAndMultiplicityParametersContext));
  }

  @Test
  public void testVisitUnitExpr() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitUnitExpr(new DomainParserGrammar.UnitExprContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitExpr2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitUnitExpr(new DomainParserGrammar.UnitExprContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitExpr3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.UnitExprContext unitExprContext = new DomainParserGrammar.UnitExprContext(
        new ParserRuleContext(), 1);
    unitExprContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitUnitExpr(unitExprContext));
  }

  @Test
  public void testVisitUnitInstance() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitUnitInstance(new DomainParserGrammar.UnitInstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitInstance2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitUnitInstance(new DomainParserGrammar.UnitInstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitInstance3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.UnitInstanceContext unitInstanceContext = new DomainParserGrammar.UnitInstanceContext(
        new ParserRuleContext(), 1);
    unitInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitUnitInstance(unitInstanceContext));
  }

  @Test
  public void testVisitUnitInstanceLiteral() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitUnitInstanceLiteral(new DomainParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitInstanceLiteral2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitUnitInstanceLiteral(new DomainParserGrammar.UnitInstanceLiteralContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitInstanceLiteral3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.UnitInstanceLiteralContext unitInstanceLiteralContext = new DomainParserGrammar.UnitInstanceLiteralContext(
        new ParserRuleContext(), 1);
    unitInstanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitUnitInstanceLiteral(unitInstanceLiteralContext));
  }

  @Test
  public void testVisitUnitName() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitUnitName(new DomainParserGrammar.UnitNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitName2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitUnitName(new DomainParserGrammar.UnitNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitName3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.UnitNameContext unitNameContext = new DomainParserGrammar.UnitNameContext(
        new ParserRuleContext(), 1);
    unitNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitUnitName(unitNameContext));
  }

  @Test
  public void testVisitVariable() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor
        .visitVariable(new DomainParserGrammar.VariableContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitVariable2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitVariable(new DomainParserGrammar.VariableContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitVariable3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.VariableContext variableContext = new DomainParserGrammar.VariableContext(
        new ParserRuleContext(), 1);
    variableContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitVariable(variableContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        domainParserGrammarBaseVisitor.visitWord(new DomainParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitWord(new DomainParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    DomainParserGrammarBaseVisitor<Object> domainParserGrammarBaseVisitor = new DomainParserGrammarBaseVisitor<Object>();

    DomainParserGrammar.WordContext wordContext = new DomainParserGrammar.WordContext(new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(domainParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

