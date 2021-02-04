package org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.aggregationAware;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class AggregationAwareParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitAggregateSpecification() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAggregateSpecification(
        new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAggregateSpecification2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAggregateSpecification(
        new AggregationAwareParserGrammar.AggregateSpecificationContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAggregateSpecification3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.AggregateSpecificationContext aggregateSpecificationContext = new AggregationAwareParserGrammar.AggregateSpecificationContext(
        new ParserRuleContext(), 1);
    aggregateSpecificationContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAggregateSpecification(aggregateSpecificationContext));
  }

  @Test
  public void testVisitAggregationFunctionSpecification() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAggregationFunctionSpecification(
        new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAggregationFunctionSpecification2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAggregationFunctionSpecification(
        new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAggregationFunctionSpecification3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.AggregationFunctionSpecificationContext aggregationFunctionSpecificationContext = new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(
        new ParserRuleContext(), 1);
    aggregationFunctionSpecificationContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitAggregationFunctionSpecification(aggregationFunctionSpecificationContext));
  }

  @Test
  public void testVisitAggregationFunctionSpecifications() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAggregationFunctionSpecifications(
        new AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAggregationFunctionSpecifications2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAggregationFunctionSpecifications(
        new AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAggregationFunctionSpecifications3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext aggregationFunctionSpecificationsContext = new AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext(
        new ParserRuleContext(), 1);
    aggregationFunctionSpecificationsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitAggregationFunctionSpecifications(aggregationFunctionSpecificationsContext));
  }

  @Test
  public void testVisitAllFunction() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitAllFunction(new AggregationAwareParserGrammar.AllFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllFunction2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitAllFunction(new AggregationAwareParserGrammar.AllFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllFunction3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.AllFunctionContext allFunctionContext = new AggregationAwareParserGrammar.AllFunctionContext(
        new ParserRuleContext(), 1);
    allFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAllFunction(allFunctionContext));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(
        new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(
        new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.AllFunctionWithMilestoningContext allFunctionWithMilestoningContext = new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(
        new ParserRuleContext(), 1);
    allFunctionWithMilestoningContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        aggregationAwareParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(allFunctionWithMilestoningContext));
  }

  @Test
  public void testVisitAllOrFunction() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitAllOrFunction(new AggregationAwareParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllOrFunction2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitAllOrFunction(new AggregationAwareParserGrammar.AllOrFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllOrFunction3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.AllOrFunctionContext allOrFunctionContext = new AggregationAwareParserGrammar.AllOrFunctionContext(
        new ParserRuleContext(), 1);
    allOrFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAllOrFunction(allOrFunctionContext));
  }

  @Test
  public void testVisitAllVersionsFunction() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAllVersionsFunction(
        new AggregationAwareParserGrammar.AllVersionsFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllVersionsFunction2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitAllVersionsFunction(new AggregationAwareParserGrammar.AllVersionsFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllVersionsFunction3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.AllVersionsFunctionContext allVersionsFunctionContext = new AggregationAwareParserGrammar.AllVersionsFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAllVersionsFunction(allVersionsFunctionContext));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(
        new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(
        new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext allVersionsInRangeFunctionContext = new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsInRangeFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        aggregationAwareParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(allVersionsInRangeFunctionContext));
  }

  @Test
  public void testVisitArithmeticPart() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitArithmeticPart(new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitArithmeticPart2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitArithmeticPart(new AggregationAwareParserGrammar.ArithmeticPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitArithmeticPart3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ArithmeticPartContext arithmeticPartContext = new AggregationAwareParserGrammar.ArithmeticPartContext(
        new ParserRuleContext(), 1);
    arithmeticPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitArithmeticPart(arithmeticPartContext));
  }

  @Test
  public void testVisitAtomicExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitAtomicExpression(new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAtomicExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitAtomicExpression(new AggregationAwareParserGrammar.AtomicExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAtomicExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.AtomicExpressionContext atomicExpressionContext = new AggregationAwareParserGrammar.AtomicExpressionContext(
        new ParserRuleContext(), 1);
    atomicExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitAtomicExpression(atomicExpressionContext));
  }

  @Test
  public void testVisitBooleanPart() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitBooleanPart(new AggregationAwareParserGrammar.BooleanPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitBooleanPart2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitBooleanPart(new AggregationAwareParserGrammar.BooleanPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitBooleanPart3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.BooleanPartContext booleanPartContext = new AggregationAwareParserGrammar.BooleanPartContext(
        new ParserRuleContext(), 1);
    booleanPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitBooleanPart(booleanPartContext));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitBuildMilestoningVariableExpression(
        new AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitBuildMilestoningVariableExpression(
        new AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext buildMilestoningVariableExpressionContext = new AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext(
        new ParserRuleContext(), 1);
    buildMilestoningVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitBuildMilestoningVariableExpression(buildMilestoningVariableExpressionContext));
  }

  @Test
  public void testVisitCodeBlock() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitCodeBlock(new AggregationAwareParserGrammar.CodeBlockContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCodeBlock2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitCodeBlock(new AggregationAwareParserGrammar.CodeBlockContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCodeBlock3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.CodeBlockContext codeBlockContext = new AggregationAwareParserGrammar.CodeBlockContext(
        new ParserRuleContext(), 1);
    codeBlockContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitCodeBlock(codeBlockContext));
  }

  @Test
  public void testVisitCombinedArithmeticOnly() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitCombinedArithmeticOnly(
        new AggregationAwareParserGrammar.CombinedArithmeticOnlyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCombinedArithmeticOnly2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitCombinedArithmeticOnly(
        new AggregationAwareParserGrammar.CombinedArithmeticOnlyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCombinedArithmeticOnly3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.CombinedArithmeticOnlyContext combinedArithmeticOnlyContext = new AggregationAwareParserGrammar.CombinedArithmeticOnlyContext(
        new ParserRuleContext(), 1);
    combinedArithmeticOnlyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitCombinedArithmeticOnly(combinedArithmeticOnlyContext));
  }

  @Test
  public void testVisitCombinedExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitCombinedExpression(
        new AggregationAwareParserGrammar.CombinedExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCombinedExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitCombinedExpression(new AggregationAwareParserGrammar.CombinedExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCombinedExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.CombinedExpressionContext combinedExpressionContext = new AggregationAwareParserGrammar.CombinedExpressionContext(
        new ParserRuleContext(), 1);
    combinedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitCombinedExpression(combinedExpressionContext));
  }

  @Test
  public void testVisitContravarianceTypeParameter() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitContravarianceTypeParameter(
        new AggregationAwareParserGrammar.ContravarianceTypeParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameter2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitContravarianceTypeParameter(
        new AggregationAwareParserGrammar.ContravarianceTypeParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameter3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ContravarianceTypeParameterContext contravarianceTypeParameterContext = new AggregationAwareParserGrammar.ContravarianceTypeParameterContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        aggregationAwareParserGrammarBaseVisitor.visitContravarianceTypeParameter(contravarianceTypeParameterContext));
  }

  @Test
  public void testVisitContravarianceTypeParameters() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitContravarianceTypeParameters(
        new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameters2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitContravarianceTypeParameters(
        new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameters3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ContravarianceTypeParametersContext contravarianceTypeParametersContext = new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitContravarianceTypeParameters(contravarianceTypeParametersContext));
  }

  @Test
  public void testVisitDsl() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitDsl(new AggregationAwareParserGrammar.DslContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDsl2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitDsl(new AggregationAwareParserGrammar.DslContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDsl3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.DslContext dslContext = new AggregationAwareParserGrammar.DslContext(
        new ParserRuleContext(), 1);
    dslContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitDsl(dslContext));
  }

  @Test
  public void testVisitDslContent() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitDslContent(new AggregationAwareParserGrammar.DslContentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslContent2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitDslContent(new AggregationAwareParserGrammar.DslContentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslContent3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.DslContentContext dslContentContext = new AggregationAwareParserGrammar.DslContentContext(
        new ParserRuleContext(), 1);
    dslContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitDslContent(dslContentContext));
  }

  @Test
  public void testVisitDslGraphFetch() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitDslGraphFetch(new AggregationAwareParserGrammar.DslGraphFetchContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslGraphFetch2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitDslGraphFetch(new AggregationAwareParserGrammar.DslGraphFetchContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslGraphFetch3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.DslGraphFetchContext dslGraphFetchContext = new AggregationAwareParserGrammar.DslGraphFetchContext(
        new ParserRuleContext(), 1);
    dslGraphFetchContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitDslGraphFetch(dslGraphFetchContext));
  }

  @Test
  public void testVisitDslNavigationPath() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitDslNavigationPath(
        new AggregationAwareParserGrammar.DslNavigationPathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslNavigationPath2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitDslNavigationPath(new AggregationAwareParserGrammar.DslNavigationPathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslNavigationPath3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.DslNavigationPathContext dslNavigationPathContext = new AggregationAwareParserGrammar.DslNavigationPathContext(
        new ParserRuleContext(), 1);
    dslNavigationPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitDslNavigationPath(dslNavigationPathContext));
  }

  @Test
  public void testVisitEnumReference() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitEnumReference(new AggregationAwareParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumReference2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitEnumReference(new AggregationAwareParserGrammar.EnumReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumReference3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.EnumReferenceContext enumReferenceContext = new AggregationAwareParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);
    enumReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitEnumReference(enumReferenceContext));
  }

  @Test
  public void testVisitEqualNotEqual() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitEqualNotEqual(new AggregationAwareParserGrammar.EqualNotEqualContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEqualNotEqual2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitEqualNotEqual(new AggregationAwareParserGrammar.EqualNotEqualContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEqualNotEqual3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.EqualNotEqualContext equalNotEqualContext = new AggregationAwareParserGrammar.EqualNotEqualContext(
        new ParserRuleContext(), 1);
    equalNotEqualContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitEqualNotEqual(equalNotEqualContext));
  }

  @Test
  public void testVisitExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitExpression(new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitExpression(new AggregationAwareParserGrammar.ExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ExpressionContext expressionContext = new AggregationAwareParserGrammar.ExpressionContext(
        new ParserRuleContext(), 1);
    expressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpression(expressionContext));
  }

  @Test
  public void testVisitExpressionInstance() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionInstance(
        new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstance2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitExpressionInstance(new AggregationAwareParserGrammar.ExpressionInstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstance3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ExpressionInstanceContext expressionInstanceContext = new AggregationAwareParserGrammar.ExpressionInstanceContext(
        new ParserRuleContext(), 1);
    expressionInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionInstance(expressionInstanceContext));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionInstanceAtomicRightSide(
        new AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionInstanceAtomicRightSide(
        new AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext expressionInstanceAtomicRightSideContext = new AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitExpressionInstanceAtomicRightSide(expressionInstanceAtomicRightSideContext));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionInstanceParserPropertyAssignment(
        new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(),
            1)));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionInstanceParserPropertyAssignment(
        new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext expressionInstanceParserPropertyAssignmentContext = new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(
        new ParserRuleContext(), 1);
    expressionInstanceParserPropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitExpressionInstanceParserPropertyAssignment(expressionInstanceParserPropertyAssignmentContext));
  }

  @Test
  public void testVisitExpressionInstanceRightSide() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionInstanceRightSide(
        new AggregationAwareParserGrammar.ExpressionInstanceRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceRightSide2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionInstanceRightSide(
        new AggregationAwareParserGrammar.ExpressionInstanceRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceRightSide3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ExpressionInstanceRightSideContext expressionInstanceRightSideContext = new AggregationAwareParserGrammar.ExpressionInstanceRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        aggregationAwareParserGrammarBaseVisitor.visitExpressionInstanceRightSide(expressionInstanceRightSideContext));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(
        new AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(
        new AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext expressionOrExpressionGroupContext = new AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext(
        new ParserRuleContext(), 1);
    expressionOrExpressionGroupContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        aggregationAwareParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(expressionOrExpressionGroupContext));
  }

  @Test
  public void testVisitExpressionPart() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitExpressionPart(new AggregationAwareParserGrammar.ExpressionPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionPart2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitExpressionPart(new AggregationAwareParserGrammar.ExpressionPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionPart3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ExpressionPartContext expressionPartContext = new AggregationAwareParserGrammar.ExpressionPartContext(
        new ParserRuleContext(), 1);
    expressionPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionPart(expressionPartContext));
  }

  @Test
  public void testVisitExpressionsArray() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitExpressionsArray(new AggregationAwareParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionsArray2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitExpressionsArray(new AggregationAwareParserGrammar.ExpressionsArrayContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionsArray3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ExpressionsArrayContext expressionsArrayContext = new AggregationAwareParserGrammar.ExpressionsArrayContext(
        new ParserRuleContext(), 1);
    expressionsArrayContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitExpressionsArray(expressionsArrayContext));
  }

  @Test
  public void testVisitFromMultiplicity() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitFromMultiplicity(new AggregationAwareParserGrammar.FromMultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFromMultiplicity2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitFromMultiplicity(new AggregationAwareParserGrammar.FromMultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFromMultiplicity3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.FromMultiplicityContext fromMultiplicityContext = new AggregationAwareParserGrammar.FromMultiplicityContext(
        new ParserRuleContext(), 1);
    fromMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFromMultiplicity(fromMultiplicityContext));
  }

  @Test
  public void testVisitFunctionExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionExpression(
        new AggregationAwareParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitFunctionExpression(new AggregationAwareParserGrammar.FunctionExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.FunctionExpressionContext functionExpressionContext = new AggregationAwareParserGrammar.FunctionExpressionContext(
        new ParserRuleContext(), 1);
    functionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionExpression(functionExpressionContext));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
            new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(parserRuleContext,
            1)));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext functionExpressionLatestMilestoningDateParameterContext = new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1);
    functionExpressionLatestMilestoningDateParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        functionExpressionLatestMilestoningDateParameterContext));
  }

  @Test
  public void testVisitFunctionExpressionParameters() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionExpressionParameters(
        new AggregationAwareParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpressionParameters2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionExpressionParameters(
        new AggregationAwareParserGrammar.FunctionExpressionParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpressionParameters3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.FunctionExpressionParametersContext functionExpressionParametersContext = new AggregationAwareParserGrammar.FunctionExpressionParametersContext(
        new ParserRuleContext(), 1);
    functionExpressionParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitFunctionExpressionParameters(functionExpressionParametersContext));
  }

  @Test
  public void testVisitFunctionTypePureType() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionTypePureType(
        new AggregationAwareParserGrammar.FunctionTypePureTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionTypePureType2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionTypePureType(
        new AggregationAwareParserGrammar.FunctionTypePureTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionTypePureType3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.FunctionTypePureTypeContext functionTypePureTypeContext = new AggregationAwareParserGrammar.FunctionTypePureTypeContext(
        new ParserRuleContext(), 1);
    functionTypePureTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionTypePureType(functionTypePureTypeContext));
  }

  @Test
  public void testVisitFunctionVariableExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionVariableExpression(
        new AggregationAwareParserGrammar.FunctionVariableExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionVariableExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitFunctionVariableExpression(
        new AggregationAwareParserGrammar.FunctionVariableExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionVariableExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.FunctionVariableExpressionContext functionVariableExpressionContext = new AggregationAwareParserGrammar.FunctionVariableExpressionContext(
        new ParserRuleContext(), 1);
    functionVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        aggregationAwareParserGrammarBaseVisitor.visitFunctionVariableExpression(functionVariableExpressionContext));
  }

  @Test
  public void testVisitGroupByFunctionSpecification() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitGroupByFunctionSpecification(
        new AggregationAwareParserGrammar.GroupByFunctionSpecificationContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitGroupByFunctionSpecification2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitGroupByFunctionSpecification(
        new AggregationAwareParserGrammar.GroupByFunctionSpecificationContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitGroupByFunctionSpecification3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.GroupByFunctionSpecificationContext groupByFunctionSpecificationContext = new AggregationAwareParserGrammar.GroupByFunctionSpecificationContext(
        new ParserRuleContext(), 1);
    groupByFunctionSpecificationContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitGroupByFunctionSpecification(groupByFunctionSpecificationContext));
  }

  @Test
  public void testVisitGroupByFunctionSpecifications() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitGroupByFunctionSpecifications(
        new AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitGroupByFunctionSpecifications2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitGroupByFunctionSpecifications(
        new AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitGroupByFunctionSpecifications3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext groupByFunctionSpecificationsContext = new AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext(
        new ParserRuleContext(), 1);
    groupByFunctionSpecificationsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitGroupByFunctionSpecifications(groupByFunctionSpecificationsContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitIdentifier(new AggregationAwareParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitIdentifier(new AggregationAwareParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.IdentifierContext identifierContext = new AggregationAwareParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitInstance() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitInstance(new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstance2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitInstance(new AggregationAwareParserGrammar.InstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstance3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.InstanceContext instanceContext = new AggregationAwareParserGrammar.InstanceContext(
        new ParserRuleContext(), 1);
    instanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstance(instanceContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSide() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceAtomicRightSide(
        new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSide2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceAtomicRightSide(
        new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSide3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.InstanceAtomicRightSideContext instanceAtomicRightSideContext = new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceAtomicRightSide(instanceAtomicRightSideContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(
        new AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(
        new AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext instanceAtomicRightSideScalarContext = new AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideScalarContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitInstanceAtomicRightSideScalar(instanceAtomicRightSideScalarContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(
        new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(
        new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext instanceAtomicRightSideVectorContext = new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideVectorContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitInstanceAtomicRightSideVector(instanceAtomicRightSideVectorContext));
  }

  @Test
  public void testVisitInstanceLiteral() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitInstanceLiteral(new AggregationAwareParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteral2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitInstanceLiteral(new AggregationAwareParserGrammar.InstanceLiteralContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteral3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.InstanceLiteralContext instanceLiteralContext = new AggregationAwareParserGrammar.InstanceLiteralContext(
        new ParserRuleContext(), 1);
    instanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceLiteral(instanceLiteralContext));
  }

  @Test
  public void testVisitInstanceLiteralToken() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceLiteralToken(
        new AggregationAwareParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceLiteralToken(
        new AggregationAwareParserGrammar.InstanceLiteralTokenContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.InstanceLiteralTokenContext instanceLiteralTokenContext = new AggregationAwareParserGrammar.InstanceLiteralTokenContext(
        new ParserRuleContext(), 1);
    instanceLiteralTokenContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceLiteralToken(instanceLiteralTokenContext));
  }

  @Test
  public void testVisitInstancePropertyAssignment() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstancePropertyAssignment(
        new AggregationAwareParserGrammar.InstancePropertyAssignmentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstancePropertyAssignment2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstancePropertyAssignment(
        new AggregationAwareParserGrammar.InstancePropertyAssignmentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstancePropertyAssignment3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.InstancePropertyAssignmentContext instancePropertyAssignmentContext = new AggregationAwareParserGrammar.InstancePropertyAssignmentContext(
        new ParserRuleContext(), 1);
    instancePropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        aggregationAwareParserGrammarBaseVisitor.visitInstancePropertyAssignment(instancePropertyAssignmentContext));
  }

  @Test
  public void testVisitInstanceReference() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceReference(
        new AggregationAwareParserGrammar.InstanceReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceReference2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitInstanceReference(new AggregationAwareParserGrammar.InstanceReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceReference3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.InstanceReferenceContext instanceReferenceContext = new AggregationAwareParserGrammar.InstanceReferenceContext(
        new ParserRuleContext(), 1);
    instanceReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceReference(instanceReferenceContext));
  }

  @Test
  public void testVisitInstanceRightSide() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceRightSide(
        new AggregationAwareParserGrammar.InstanceRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceRightSide2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitInstanceRightSide(new AggregationAwareParserGrammar.InstanceRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceRightSide3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.InstanceRightSideContext instanceRightSideContext = new AggregationAwareParserGrammar.InstanceRightSideContext(
        new ParserRuleContext(), 1);
    instanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitInstanceRightSide(instanceRightSideContext));
  }

  @Test
  public void testVisitLambdaFunction() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLambdaFunction(new AggregationAwareParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaFunction2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLambdaFunction(new AggregationAwareParserGrammar.LambdaFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaFunction3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.LambdaFunctionContext lambdaFunctionContext = new AggregationAwareParserGrammar.LambdaFunctionContext(
        new ParserRuleContext(), 1);
    lambdaFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitLambdaFunction(lambdaFunctionContext));
  }

  @Test
  public void testVisitLambdaParam() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLambdaParam(new AggregationAwareParserGrammar.LambdaParamContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaParam2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLambdaParam(new AggregationAwareParserGrammar.LambdaParamContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaParam3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.LambdaParamContext lambdaParamContext = new AggregationAwareParserGrammar.LambdaParamContext(
        new ParserRuleContext(), 1);
    lambdaParamContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitLambdaParam(lambdaParamContext));
  }

  @Test
  public void testVisitLambdaParamType() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLambdaParamType(new AggregationAwareParserGrammar.LambdaParamTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaParamType2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLambdaParamType(new AggregationAwareParserGrammar.LambdaParamTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaParamType3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.LambdaParamTypeContext lambdaParamTypeContext = new AggregationAwareParserGrammar.LambdaParamTypeContext(
        new ParserRuleContext(), 1);
    lambdaParamTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitLambdaParamType(lambdaParamTypeContext));
  }

  @Test
  public void testVisitLambdaPipe() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLambdaPipe(new AggregationAwareParserGrammar.LambdaPipeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaPipe2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLambdaPipe(new AggregationAwareParserGrammar.LambdaPipeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaPipe3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.LambdaPipeContext lambdaPipeContext = new AggregationAwareParserGrammar.LambdaPipeContext(
        new ParserRuleContext(), 1);
    lambdaPipeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitLambdaPipe(lambdaPipeContext));
  }

  @Test
  public void testVisitLetExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLetExpression(new AggregationAwareParserGrammar.LetExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLetExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitLetExpression(new AggregationAwareParserGrammar.LetExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLetExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.LetExpressionContext letExpressionContext = new AggregationAwareParserGrammar.LetExpressionContext(
        new ParserRuleContext(), 1);
    letExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitLetExpression(letExpressionContext));
  }

  @Test
  public void testVisitMultiplicity() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitMultiplicity(new AggregationAwareParserGrammar.MultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicity2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitMultiplicity(new AggregationAwareParserGrammar.MultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicity3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.MultiplicityContext multiplicityContext = new AggregationAwareParserGrammar.MultiplicityContext(
        new ParserRuleContext(), 1);
    multiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplicity(multiplicityContext));
  }

  @Test
  public void testVisitMultiplicityArgument() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplicityArgument(
        new AggregationAwareParserGrammar.MultiplicityArgumentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicityArgument2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplicityArgument(
        new AggregationAwareParserGrammar.MultiplicityArgumentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicityArgument3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.MultiplicityArgumentContext multiplicityArgumentContext = new AggregationAwareParserGrammar.MultiplicityArgumentContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplicityArgument(multiplicityArgumentContext));
  }

  @Test
  public void testVisitMultiplicityArguments() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplicityArguments(
        new AggregationAwareParserGrammar.MultiplicityArgumentsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicityArguments2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplicityArguments(
        new AggregationAwareParserGrammar.MultiplicityArgumentsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicityArguments3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.MultiplicityArgumentsContext multiplicityArgumentsContext = new AggregationAwareParserGrammar.MultiplicityArgumentsContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplicityArguments(multiplicityArgumentsContext));
  }

  @Test
  public void testVisitMultiplictyParameters() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplictyParameters(
        new AggregationAwareParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplictyParameters2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplictyParameters(
        new AggregationAwareParserGrammar.MultiplictyParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplictyParameters3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.MultiplictyParametersContext multiplictyParametersContext = new AggregationAwareParserGrammar.MultiplictyParametersContext(
        new ParserRuleContext(), 1);
    multiplictyParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitMultiplictyParameters(multiplictyParametersContext));
  }

  @Test
  public void testVisitNotExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitNotExpression(new AggregationAwareParserGrammar.NotExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitNotExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitNotExpression(new AggregationAwareParserGrammar.NotExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitNotExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.NotExpressionContext notExpressionContext = new AggregationAwareParserGrammar.NotExpressionContext(
        new ParserRuleContext(), 1);
    notExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitNotExpression(notExpressionContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitPackagePath(new AggregationAwareParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitPackagePath(new AggregationAwareParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.PackagePathContext packagePathContext = new AggregationAwareParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitProgramLine() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitProgramLine(new AggregationAwareParserGrammar.ProgramLineContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitProgramLine2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitProgramLine(new AggregationAwareParserGrammar.ProgramLineContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitProgramLine3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ProgramLineContext programLineContext = new AggregationAwareParserGrammar.ProgramLineContext(
        new ParserRuleContext(), 1);
    programLineContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitProgramLine(programLineContext));
  }

  @Test
  public void testVisitPropertyBracketExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitPropertyBracketExpression(
        new AggregationAwareParserGrammar.PropertyBracketExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyBracketExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitPropertyBracketExpression(
        new AggregationAwareParserGrammar.PropertyBracketExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyBracketExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.PropertyBracketExpressionContext propertyBracketExpressionContext = new AggregationAwareParserGrammar.PropertyBracketExpressionContext(
        new ParserRuleContext(), 1);
    propertyBracketExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        aggregationAwareParserGrammarBaseVisitor.visitPropertyBracketExpression(propertyBracketExpressionContext));
  }

  @Test
  public void testVisitPropertyExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitPropertyExpression(
        new AggregationAwareParserGrammar.PropertyExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitPropertyExpression(new AggregationAwareParserGrammar.PropertyExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.PropertyExpressionContext propertyExpressionContext = new AggregationAwareParserGrammar.PropertyExpressionContext(
        new ParserRuleContext(), 1);
    propertyExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitPropertyExpression(propertyExpressionContext));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(
        new AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(
        new AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext propertyOrFunctionExpressionContext = new AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext(
        new ParserRuleContext(), 1);
    propertyOrFunctionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitPropertyOrFunctionExpression(propertyOrFunctionExpressionContext));
  }

  @Test
  public void testVisitPropertyReturnType() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitPropertyReturnType(
        new AggregationAwareParserGrammar.PropertyReturnTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyReturnType2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitPropertyReturnType(new AggregationAwareParserGrammar.PropertyReturnTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyReturnType3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.PropertyReturnTypeContext propertyReturnTypeContext = new AggregationAwareParserGrammar.PropertyReturnTypeContext(
        new ParserRuleContext(), 1);
    propertyReturnTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitPropertyReturnType(propertyReturnTypeContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitQualifiedName(new AggregationAwareParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitQualifiedName(new AggregationAwareParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.QualifiedNameContext qualifiedNameContext = new AggregationAwareParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitSignedExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitSignedExpression(new AggregationAwareParserGrammar.SignedExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSignedExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitSignedExpression(new AggregationAwareParserGrammar.SignedExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSignedExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.SignedExpressionContext signedExpressionContext = new AggregationAwareParserGrammar.SignedExpressionContext(
        new ParserRuleContext(), 1);
    signedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitSignedExpression(signedExpressionContext));
  }

  @Test
  public void testVisitSliceExpression() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitSliceExpression(new AggregationAwareParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSliceExpression2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitSliceExpression(new AggregationAwareParserGrammar.SliceExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSliceExpression3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.SliceExpressionContext sliceExpressionContext = new AggregationAwareParserGrammar.SliceExpressionContext(
        new ParserRuleContext(), 1);
    sliceExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitSliceExpression(sliceExpressionContext));
  }

  @Test
  public void testVisitStereotypeReference() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitStereotypeReference(
        new AggregationAwareParserGrammar.StereotypeReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitStereotypeReference2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitStereotypeReference(new AggregationAwareParserGrammar.StereotypeReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitStereotypeReference3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.StereotypeReferenceContext stereotypeReferenceContext = new AggregationAwareParserGrammar.StereotypeReferenceContext(
        new ParserRuleContext(), 1);
    stereotypeReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitStereotypeReference(stereotypeReferenceContext));
  }

  @Test
  public void testVisitTagReference() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitTagReference(new AggregationAwareParserGrammar.TagReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTagReference2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitTagReference(new AggregationAwareParserGrammar.TagReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTagReference3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.TagReferenceContext tagReferenceContext = new AggregationAwareParserGrammar.TagReferenceContext(
        new ParserRuleContext(), 1);
    tagReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitTagReference(tagReferenceContext));
  }

  @Test
  public void testVisitToMultiplicity() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitToMultiplicity(new AggregationAwareParserGrammar.ToMultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitToMultiplicity2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitToMultiplicity(new AggregationAwareParserGrammar.ToMultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitToMultiplicity3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.ToMultiplicityContext toMultiplicityContext = new AggregationAwareParserGrammar.ToMultiplicityContext(
        new ParserRuleContext(), 1);
    toMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitToMultiplicity(toMultiplicityContext));
  }

  @Test
  public void testVisitType() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitType(new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitType2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitType(new AggregationAwareParserGrammar.TypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitType3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.TypeContext typeContext = new AggregationAwareParserGrammar.TypeContext(
        new ParserRuleContext(), 1);
    typeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitType(typeContext));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(
        new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(
        new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext typeAndMultiplicityParametersContext = new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeAndMultiplicityParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitTypeAndMultiplicityParameters(typeAndMultiplicityParametersContext));
  }

  @Test
  public void testVisitTypeArguments() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitTypeArguments(new AggregationAwareParserGrammar.TypeArgumentsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeArguments2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitTypeArguments(new AggregationAwareParserGrammar.TypeArgumentsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeArguments3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.TypeArgumentsContext typeArgumentsContext = new AggregationAwareParserGrammar.TypeArgumentsContext(
        new ParserRuleContext(), 1);
    typeArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitTypeArguments(typeArgumentsContext));
  }

  @Test
  public void testVisitTypeParameter() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitTypeParameter(new AggregationAwareParserGrammar.TypeParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParameter2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitTypeParameter(new AggregationAwareParserGrammar.TypeParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParameter3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.TypeParameterContext typeParameterContext = new AggregationAwareParserGrammar.TypeParameterContext(
        new ParserRuleContext(), 1);
    typeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitTypeParameter(typeParameterContext));
  }

  @Test
  public void testVisitTypeParameters() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitTypeParameters(new AggregationAwareParserGrammar.TypeParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParameters2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitTypeParameters(new AggregationAwareParserGrammar.TypeParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParameters3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.TypeParametersContext typeParametersContext = new AggregationAwareParserGrammar.TypeParametersContext(
        new ParserRuleContext(), 1);
    typeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitTypeParameters(typeParametersContext));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
        new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
            new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
        new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
            parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext typeParametersWithContravarianceAndMultiplicityParametersContext = new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeParametersWithContravarianceAndMultiplicityParametersContext
        .<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
        typeParametersWithContravarianceAndMultiplicityParametersContext));
  }

  @Test
  public void testVisitUnitInstance() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitUnitInstance(new AggregationAwareParserGrammar.UnitInstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitInstance2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitUnitInstance(new AggregationAwareParserGrammar.UnitInstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitInstance3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.UnitInstanceContext unitInstanceContext = new AggregationAwareParserGrammar.UnitInstanceContext(
        new ParserRuleContext(), 1);
    unitInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitUnitInstance(unitInstanceContext));
  }

  @Test
  public void testVisitUnitInstanceLiteral() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitUnitInstanceLiteral(
        new AggregationAwareParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitInstanceLiteral2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitUnitInstanceLiteral(new AggregationAwareParserGrammar.UnitInstanceLiteralContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitInstanceLiteral3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.UnitInstanceLiteralContext unitInstanceLiteralContext = new AggregationAwareParserGrammar.UnitInstanceLiteralContext(
        new ParserRuleContext(), 1);
    unitInstanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitUnitInstanceLiteral(unitInstanceLiteralContext));
  }

  @Test
  public void testVisitUnitName() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitUnitName(new AggregationAwareParserGrammar.UnitNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitName2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitUnitName(new AggregationAwareParserGrammar.UnitNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitName3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.UnitNameContext unitNameContext = new AggregationAwareParserGrammar.UnitNameContext(
        new ParserRuleContext(), 1);
    unitNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitUnitName(unitNameContext));
  }

  @Test
  public void testVisitVariable() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitVariable(new AggregationAwareParserGrammar.VariableContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitVariable2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitVariable(new AggregationAwareParserGrammar.VariableContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitVariable3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.VariableContext variableContext = new AggregationAwareParserGrammar.VariableContext(
        new ParserRuleContext(), 1);
    variableContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitVariable(variableContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitWord(new AggregationAwareParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor
        .visitWord(new AggregationAwareParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    AggregationAwareParserGrammarBaseVisitor<Object> aggregationAwareParserGrammarBaseVisitor = new AggregationAwareParserGrammarBaseVisitor<Object>();

    AggregationAwareParserGrammar.WordContext wordContext = new AggregationAwareParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationAwareParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

