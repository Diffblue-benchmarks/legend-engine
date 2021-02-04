package org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.pureInstanceClassMapping;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class PureInstanceClassMappingParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitAllFunction() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitAllFunction(new PureInstanceClassMappingParserGrammar.AllFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllFunction2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitAllFunction(new PureInstanceClassMappingParserGrammar.AllFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllFunction3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.AllFunctionContext allFunctionContext = new PureInstanceClassMappingParserGrammar.AllFunctionContext(
        new ParserRuleContext(), 1);
    allFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllFunction(allFunctionContext));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(
        new PureInstanceClassMappingParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(
        new PureInstanceClassMappingParserGrammar.AllFunctionWithMilestoningContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.AllFunctionWithMilestoningContext allFunctionWithMilestoningContext = new PureInstanceClassMappingParserGrammar.AllFunctionWithMilestoningContext(
        new ParserRuleContext(), 1);
    allFunctionWithMilestoningContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitAllFunctionWithMilestoning(allFunctionWithMilestoningContext));
  }

  @Test
  public void testVisitAllOrFunction() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllOrFunction(
        new PureInstanceClassMappingParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllOrFunction2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitAllOrFunction(new PureInstanceClassMappingParserGrammar.AllOrFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllOrFunction3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.AllOrFunctionContext allOrFunctionContext = new PureInstanceClassMappingParserGrammar.AllOrFunctionContext(
        new ParserRuleContext(), 1);
    allOrFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllOrFunction(allOrFunctionContext));
  }

  @Test
  public void testVisitAllVersionsFunction() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllVersionsFunction(
        new PureInstanceClassMappingParserGrammar.AllVersionsFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllVersionsFunction2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllVersionsFunction(
        new PureInstanceClassMappingParserGrammar.AllVersionsFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllVersionsFunction3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.AllVersionsFunctionContext allVersionsFunctionContext = new PureInstanceClassMappingParserGrammar.AllVersionsFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllVersionsFunction(allVersionsFunctionContext));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(
        new PureInstanceClassMappingParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(
        new PureInstanceClassMappingParserGrammar.AllVersionsInRangeFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.AllVersionsInRangeFunctionContext allVersionsInRangeFunctionContext = new PureInstanceClassMappingParserGrammar.AllVersionsInRangeFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsInRangeFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitAllVersionsInRangeFunction(allVersionsInRangeFunctionContext));
  }

  @Test
  public void testVisitArithmeticPart() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitArithmeticPart(
        new PureInstanceClassMappingParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitArithmeticPart2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitArithmeticPart(new PureInstanceClassMappingParserGrammar.ArithmeticPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitArithmeticPart3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ArithmeticPartContext arithmeticPartContext = new PureInstanceClassMappingParserGrammar.ArithmeticPartContext(
        new ParserRuleContext(), 1);
    arithmeticPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitArithmeticPart(arithmeticPartContext));
  }

  @Test
  public void testVisitAtomicExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAtomicExpression(
        new PureInstanceClassMappingParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAtomicExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAtomicExpression(
        new PureInstanceClassMappingParserGrammar.AtomicExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAtomicExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.AtomicExpressionContext atomicExpressionContext = new PureInstanceClassMappingParserGrammar.AtomicExpressionContext(
        new ParserRuleContext(), 1);
    atomicExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitAtomicExpression(atomicExpressionContext));
  }

  @Test
  public void testVisitBooleanPart() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitBooleanPart(new PureInstanceClassMappingParserGrammar.BooleanPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitBooleanPart2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitBooleanPart(new PureInstanceClassMappingParserGrammar.BooleanPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitBooleanPart3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.BooleanPartContext booleanPartContext = new PureInstanceClassMappingParserGrammar.BooleanPartContext(
        new ParserRuleContext(), 1);
    booleanPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitBooleanPart(booleanPartContext));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitBuildMilestoningVariableExpression(
        new PureInstanceClassMappingParserGrammar.BuildMilestoningVariableExpressionContext(new ParserRuleContext(),
            1)));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitBuildMilestoningVariableExpression(
        new PureInstanceClassMappingParserGrammar.BuildMilestoningVariableExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.BuildMilestoningVariableExpressionContext buildMilestoningVariableExpressionContext = new PureInstanceClassMappingParserGrammar.BuildMilestoningVariableExpressionContext(
        new ParserRuleContext(), 1);
    buildMilestoningVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitBuildMilestoningVariableExpression(buildMilestoningVariableExpressionContext));
  }

  @Test
  public void testVisitCodeBlock() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitCodeBlock(new PureInstanceClassMappingParserGrammar.CodeBlockContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCodeBlock2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitCodeBlock(new PureInstanceClassMappingParserGrammar.CodeBlockContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCodeBlock3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.CodeBlockContext codeBlockContext = new PureInstanceClassMappingParserGrammar.CodeBlockContext(
        new ParserRuleContext(), 1);
    codeBlockContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitCodeBlock(codeBlockContext));
  }

  @Test
  public void testVisitCombinedArithmeticOnly() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitCombinedArithmeticOnly(
        new PureInstanceClassMappingParserGrammar.CombinedArithmeticOnlyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCombinedArithmeticOnly2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitCombinedArithmeticOnly(
        new PureInstanceClassMappingParserGrammar.CombinedArithmeticOnlyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCombinedArithmeticOnly3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.CombinedArithmeticOnlyContext combinedArithmeticOnlyContext = new PureInstanceClassMappingParserGrammar.CombinedArithmeticOnlyContext(
        new ParserRuleContext(), 1);
    combinedArithmeticOnlyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        pureInstanceClassMappingParserGrammarBaseVisitor.visitCombinedArithmeticOnly(combinedArithmeticOnlyContext));
  }

  @Test
  public void testVisitCombinedExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitCombinedExpression(
        new PureInstanceClassMappingParserGrammar.CombinedExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCombinedExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitCombinedExpression(
        new PureInstanceClassMappingParserGrammar.CombinedExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCombinedExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.CombinedExpressionContext combinedExpressionContext = new PureInstanceClassMappingParserGrammar.CombinedExpressionContext(
        new ParserRuleContext(), 1);
    combinedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitCombinedExpression(combinedExpressionContext));
  }

  @Test
  public void testVisitContravarianceTypeParameter() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitContravarianceTypeParameter(
        new PureInstanceClassMappingParserGrammar.ContravarianceTypeParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameter2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitContravarianceTypeParameter(
        new PureInstanceClassMappingParserGrammar.ContravarianceTypeParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameter3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ContravarianceTypeParameterContext contravarianceTypeParameterContext = new PureInstanceClassMappingParserGrammar.ContravarianceTypeParameterContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitContravarianceTypeParameter(contravarianceTypeParameterContext));
  }

  @Test
  public void testVisitContravarianceTypeParameters() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitContravarianceTypeParameters(
        new PureInstanceClassMappingParserGrammar.ContravarianceTypeParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameters2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitContravarianceTypeParameters(
        new PureInstanceClassMappingParserGrammar.ContravarianceTypeParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameters3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ContravarianceTypeParametersContext contravarianceTypeParametersContext = new PureInstanceClassMappingParserGrammar.ContravarianceTypeParametersContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitContravarianceTypeParameters(contravarianceTypeParametersContext));
  }

  @Test
  public void testVisitDsl() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitDsl(new PureInstanceClassMappingParserGrammar.DslContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDsl2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitDsl(new PureInstanceClassMappingParserGrammar.DslContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDsl3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.DslContext dslContext = new PureInstanceClassMappingParserGrammar.DslContext(
        new ParserRuleContext(), 1);
    dslContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitDsl(dslContext));
  }

  @Test
  public void testVisitDslContent() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitDslContent(new PureInstanceClassMappingParserGrammar.DslContentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslContent2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitDslContent(new PureInstanceClassMappingParserGrammar.DslContentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslContent3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.DslContentContext dslContentContext = new PureInstanceClassMappingParserGrammar.DslContentContext(
        new ParserRuleContext(), 1);
    dslContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitDslContent(dslContentContext));
  }

  @Test
  public void testVisitDslGraphFetch() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitDslGraphFetch(
        new PureInstanceClassMappingParserGrammar.DslGraphFetchContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslGraphFetch2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitDslGraphFetch(new PureInstanceClassMappingParserGrammar.DslGraphFetchContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslGraphFetch3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.DslGraphFetchContext dslGraphFetchContext = new PureInstanceClassMappingParserGrammar.DslGraphFetchContext(
        new ParserRuleContext(), 1);
    dslGraphFetchContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitDslGraphFetch(dslGraphFetchContext));
  }

  @Test
  public void testVisitDslNavigationPath() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitDslNavigationPath(
        new PureInstanceClassMappingParserGrammar.DslNavigationPathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslNavigationPath2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitDslNavigationPath(
        new PureInstanceClassMappingParserGrammar.DslNavigationPathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslNavigationPath3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.DslNavigationPathContext dslNavigationPathContext = new PureInstanceClassMappingParserGrammar.DslNavigationPathContext(
        new ParserRuleContext(), 1);
    dslNavigationPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitDslNavigationPath(dslNavigationPathContext));
  }

  @Test
  public void testVisitEnumReference() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitEnumReference(
        new PureInstanceClassMappingParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumReference2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitEnumReference(new PureInstanceClassMappingParserGrammar.EnumReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumReference3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.EnumReferenceContext enumReferenceContext = new PureInstanceClassMappingParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);
    enumReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitEnumReference(enumReferenceContext));
  }

  @Test
  public void testVisitEqualNotEqual() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitEqualNotEqual(
        new PureInstanceClassMappingParserGrammar.EqualNotEqualContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEqualNotEqual2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitEqualNotEqual(new PureInstanceClassMappingParserGrammar.EqualNotEqualContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEqualNotEqual3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.EqualNotEqualContext equalNotEqualContext = new PureInstanceClassMappingParserGrammar.EqualNotEqualContext(
        new ParserRuleContext(), 1);
    equalNotEqualContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitEqualNotEqual(equalNotEqualContext));
  }

  @Test
  public void testVisitExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitExpression(new PureInstanceClassMappingParserGrammar.ExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitExpression(new PureInstanceClassMappingParserGrammar.ExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ExpressionContext expressionContext = new PureInstanceClassMappingParserGrammar.ExpressionContext(
        new ParserRuleContext(), 1);
    expressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpression(expressionContext));
  }

  @Test
  public void testVisitExpressionInstance() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionInstance(
        new PureInstanceClassMappingParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstance2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionInstance(
        new PureInstanceClassMappingParserGrammar.ExpressionInstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstance3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ExpressionInstanceContext expressionInstanceContext = new PureInstanceClassMappingParserGrammar.ExpressionInstanceContext(
        new ParserRuleContext(), 1);
    expressionInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionInstance(expressionInstanceContext));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionInstanceAtomicRightSide(
        new PureInstanceClassMappingParserGrammar.ExpressionInstanceAtomicRightSideContext(new ParserRuleContext(),
            1)));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionInstanceAtomicRightSide(
        new PureInstanceClassMappingParserGrammar.ExpressionInstanceAtomicRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ExpressionInstanceAtomicRightSideContext expressionInstanceAtomicRightSideContext = new PureInstanceClassMappingParserGrammar.ExpressionInstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitExpressionInstanceAtomicRightSide(expressionInstanceAtomicRightSideContext));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionInstanceParserPropertyAssignment(
        new PureInstanceClassMappingParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(
            new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionInstanceParserPropertyAssignment(
        new PureInstanceClassMappingParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(parserRuleContext,
            1)));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ExpressionInstanceParserPropertyAssignmentContext expressionInstanceParserPropertyAssignmentContext = new PureInstanceClassMappingParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(
        new ParserRuleContext(), 1);
    expressionInstanceParserPropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitExpressionInstanceParserPropertyAssignment(expressionInstanceParserPropertyAssignmentContext));
  }

  @Test
  public void testVisitExpressionInstanceRightSide() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionInstanceRightSide(
        new PureInstanceClassMappingParserGrammar.ExpressionInstanceRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceRightSide2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionInstanceRightSide(
        new PureInstanceClassMappingParserGrammar.ExpressionInstanceRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceRightSide3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ExpressionInstanceRightSideContext expressionInstanceRightSideContext = new PureInstanceClassMappingParserGrammar.ExpressionInstanceRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitExpressionInstanceRightSide(expressionInstanceRightSideContext));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(
        new PureInstanceClassMappingParserGrammar.ExpressionOrExpressionGroupContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(
        new PureInstanceClassMappingParserGrammar.ExpressionOrExpressionGroupContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ExpressionOrExpressionGroupContext expressionOrExpressionGroupContext = new PureInstanceClassMappingParserGrammar.ExpressionOrExpressionGroupContext(
        new ParserRuleContext(), 1);
    expressionOrExpressionGroupContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitExpressionOrExpressionGroup(expressionOrExpressionGroupContext));
  }

  @Test
  public void testVisitExpressionPart() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionPart(
        new PureInstanceClassMappingParserGrammar.ExpressionPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionPart2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitExpressionPart(new PureInstanceClassMappingParserGrammar.ExpressionPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionPart3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ExpressionPartContext expressionPartContext = new PureInstanceClassMappingParserGrammar.ExpressionPartContext(
        new ParserRuleContext(), 1);
    expressionPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionPart(expressionPartContext));
  }

  @Test
  public void testVisitExpressionsArray() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionsArray(
        new PureInstanceClassMappingParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionsArray2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionsArray(
        new PureInstanceClassMappingParserGrammar.ExpressionsArrayContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionsArray3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ExpressionsArrayContext expressionsArrayContext = new PureInstanceClassMappingParserGrammar.ExpressionsArrayContext(
        new ParserRuleContext(), 1);
    expressionsArrayContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitExpressionsArray(expressionsArrayContext));
  }

  @Test
  public void testVisitFromMultiplicity() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFromMultiplicity(
        new PureInstanceClassMappingParserGrammar.FromMultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFromMultiplicity2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFromMultiplicity(
        new PureInstanceClassMappingParserGrammar.FromMultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFromMultiplicity3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.FromMultiplicityContext fromMultiplicityContext = new PureInstanceClassMappingParserGrammar.FromMultiplicityContext(
        new ParserRuleContext(), 1);
    fromMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFromMultiplicity(fromMultiplicityContext));
  }

  @Test
  public void testVisitFunctionExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionExpression(
        new PureInstanceClassMappingParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionExpression(
        new PureInstanceClassMappingParserGrammar.FunctionExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.FunctionExpressionContext functionExpressionContext = new PureInstanceClassMappingParserGrammar.FunctionExpressionContext(
        new ParserRuleContext(), 1);
    functionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionExpression(functionExpressionContext));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        new PureInstanceClassMappingParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
            new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        new PureInstanceClassMappingParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
            parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext functionExpressionLatestMilestoningDateParameterContext = new PureInstanceClassMappingParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1);
    functionExpressionLatestMilestoningDateParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        functionExpressionLatestMilestoningDateParameterContext));
  }

  @Test
  public void testVisitFunctionExpressionParameters() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionExpressionParameters(
        new PureInstanceClassMappingParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpressionParameters2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionExpressionParameters(
        new PureInstanceClassMappingParserGrammar.FunctionExpressionParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpressionParameters3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.FunctionExpressionParametersContext functionExpressionParametersContext = new PureInstanceClassMappingParserGrammar.FunctionExpressionParametersContext(
        new ParserRuleContext(), 1);
    functionExpressionParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitFunctionExpressionParameters(functionExpressionParametersContext));
  }

  @Test
  public void testVisitFunctionTypePureType() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionTypePureType(
        new PureInstanceClassMappingParserGrammar.FunctionTypePureTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionTypePureType2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionTypePureType(
        new PureInstanceClassMappingParserGrammar.FunctionTypePureTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionTypePureType3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.FunctionTypePureTypeContext functionTypePureTypeContext = new PureInstanceClassMappingParserGrammar.FunctionTypePureTypeContext(
        new ParserRuleContext(), 1);
    functionTypePureTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionTypePureType(functionTypePureTypeContext));
  }

  @Test
  public void testVisitFunctionVariableExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionVariableExpression(
        new PureInstanceClassMappingParserGrammar.FunctionVariableExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionVariableExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitFunctionVariableExpression(
        new PureInstanceClassMappingParserGrammar.FunctionVariableExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionVariableExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.FunctionVariableExpressionContext functionVariableExpressionContext = new PureInstanceClassMappingParserGrammar.FunctionVariableExpressionContext(
        new ParserRuleContext(), 1);
    functionVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitFunctionVariableExpression(functionVariableExpressionContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitIdentifier(new PureInstanceClassMappingParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitIdentifier(new PureInstanceClassMappingParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.IdentifierContext identifierContext = new PureInstanceClassMappingParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitInstance() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitInstance(new PureInstanceClassMappingParserGrammar.InstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstance2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitInstance(new PureInstanceClassMappingParserGrammar.InstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstance3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.InstanceContext instanceContext = new PureInstanceClassMappingParserGrammar.InstanceContext(
        new ParserRuleContext(), 1);
    instanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstance(instanceContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSide() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceAtomicRightSide(
        new PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSide2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceAtomicRightSide(
        new PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSide3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideContext instanceAtomicRightSideContext = new PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceAtomicRightSide(instanceAtomicRightSideContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(
        new PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideScalarContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(
        new PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideScalarContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideScalarContext instanceAtomicRightSideScalarContext = new PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideScalarContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideScalarContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitInstanceAtomicRightSideScalar(instanceAtomicRightSideScalarContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(
        new PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(
        new PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideVectorContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideVectorContext instanceAtomicRightSideVectorContext = new PureInstanceClassMappingParserGrammar.InstanceAtomicRightSideVectorContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideVectorContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitInstanceAtomicRightSideVector(instanceAtomicRightSideVectorContext));
  }

  @Test
  public void testVisitInstanceLiteral() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceLiteral(
        new PureInstanceClassMappingParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteral2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitInstanceLiteral(new PureInstanceClassMappingParserGrammar.InstanceLiteralContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteral3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.InstanceLiteralContext instanceLiteralContext = new PureInstanceClassMappingParserGrammar.InstanceLiteralContext(
        new ParserRuleContext(), 1);
    instanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceLiteral(instanceLiteralContext));
  }

  @Test
  public void testVisitInstanceLiteralToken() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceLiteralToken(
        new PureInstanceClassMappingParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceLiteralToken(
        new PureInstanceClassMappingParserGrammar.InstanceLiteralTokenContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.InstanceLiteralTokenContext instanceLiteralTokenContext = new PureInstanceClassMappingParserGrammar.InstanceLiteralTokenContext(
        new ParserRuleContext(), 1);
    instanceLiteralTokenContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceLiteralToken(instanceLiteralTokenContext));
  }

  @Test
  public void testVisitInstancePropertyAssignment() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstancePropertyAssignment(
        new PureInstanceClassMappingParserGrammar.InstancePropertyAssignmentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstancePropertyAssignment2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstancePropertyAssignment(
        new PureInstanceClassMappingParserGrammar.InstancePropertyAssignmentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstancePropertyAssignment3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.InstancePropertyAssignmentContext instancePropertyAssignmentContext = new PureInstanceClassMappingParserGrammar.InstancePropertyAssignmentContext(
        new ParserRuleContext(), 1);
    instancePropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitInstancePropertyAssignment(instancePropertyAssignmentContext));
  }

  @Test
  public void testVisitInstanceReference() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceReference(
        new PureInstanceClassMappingParserGrammar.InstanceReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceReference2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceReference(
        new PureInstanceClassMappingParserGrammar.InstanceReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceReference3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.InstanceReferenceContext instanceReferenceContext = new PureInstanceClassMappingParserGrammar.InstanceReferenceContext(
        new ParserRuleContext(), 1);
    instanceReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceReference(instanceReferenceContext));
  }

  @Test
  public void testVisitInstanceRightSide() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceRightSide(
        new PureInstanceClassMappingParserGrammar.InstanceRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceRightSide2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceRightSide(
        new PureInstanceClassMappingParserGrammar.InstanceRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceRightSide3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.InstanceRightSideContext instanceRightSideContext = new PureInstanceClassMappingParserGrammar.InstanceRightSideContext(
        new ParserRuleContext(), 1);
    instanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitInstanceRightSide(instanceRightSideContext));
  }

  @Test
  public void testVisitLambdaFunction() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitLambdaFunction(
        new PureInstanceClassMappingParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaFunction2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitLambdaFunction(new PureInstanceClassMappingParserGrammar.LambdaFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaFunction3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.LambdaFunctionContext lambdaFunctionContext = new PureInstanceClassMappingParserGrammar.LambdaFunctionContext(
        new ParserRuleContext(), 1);
    lambdaFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitLambdaFunction(lambdaFunctionContext));
  }

  @Test
  public void testVisitLambdaParam() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitLambdaParam(new PureInstanceClassMappingParserGrammar.LambdaParamContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaParam2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitLambdaParam(new PureInstanceClassMappingParserGrammar.LambdaParamContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaParam3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.LambdaParamContext lambdaParamContext = new PureInstanceClassMappingParserGrammar.LambdaParamContext(
        new ParserRuleContext(), 1);
    lambdaParamContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitLambdaParam(lambdaParamContext));
  }

  @Test
  public void testVisitLambdaParamType() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitLambdaParamType(
        new PureInstanceClassMappingParserGrammar.LambdaParamTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaParamType2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitLambdaParamType(new PureInstanceClassMappingParserGrammar.LambdaParamTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaParamType3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.LambdaParamTypeContext lambdaParamTypeContext = new PureInstanceClassMappingParserGrammar.LambdaParamTypeContext(
        new ParserRuleContext(), 1);
    lambdaParamTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitLambdaParamType(lambdaParamTypeContext));
  }

  @Test
  public void testVisitLambdaPipe() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitLambdaPipe(new PureInstanceClassMappingParserGrammar.LambdaPipeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaPipe2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitLambdaPipe(new PureInstanceClassMappingParserGrammar.LambdaPipeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaPipe3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.LambdaPipeContext lambdaPipeContext = new PureInstanceClassMappingParserGrammar.LambdaPipeContext(
        new ParserRuleContext(), 1);
    lambdaPipeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitLambdaPipe(lambdaPipeContext));
  }

  @Test
  public void testVisitLetExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitLetExpression(
        new PureInstanceClassMappingParserGrammar.LetExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLetExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitLetExpression(new PureInstanceClassMappingParserGrammar.LetExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLetExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.LetExpressionContext letExpressionContext = new PureInstanceClassMappingParserGrammar.LetExpressionContext(
        new ParserRuleContext(), 1);
    letExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitLetExpression(letExpressionContext));
  }

  @Test
  public void testVisitMappingFilter() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMappingFilter(
        new PureInstanceClassMappingParserGrammar.MappingFilterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMappingFilter2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitMappingFilter(new PureInstanceClassMappingParserGrammar.MappingFilterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMappingFilter3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.MappingFilterContext mappingFilterContext = new PureInstanceClassMappingParserGrammar.MappingFilterContext(
        new ParserRuleContext(), 1);
    mappingFilterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMappingFilter(mappingFilterContext));
  }

  @Test
  public void testVisitMappingSrc() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitMappingSrc(new PureInstanceClassMappingParserGrammar.MappingSrcContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMappingSrc2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitMappingSrc(new PureInstanceClassMappingParserGrammar.MappingSrcContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMappingSrc3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.MappingSrcContext mappingSrcContext = new PureInstanceClassMappingParserGrammar.MappingSrcContext(
        new ParserRuleContext(), 1);
    mappingSrcContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMappingSrc(mappingSrcContext));
  }

  @Test
  public void testVisitMultiplicity() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitMultiplicity(new PureInstanceClassMappingParserGrammar.MultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicity2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitMultiplicity(new PureInstanceClassMappingParserGrammar.MultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicity3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.MultiplicityContext multiplicityContext = new PureInstanceClassMappingParserGrammar.MultiplicityContext(
        new ParserRuleContext(), 1);
    multiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplicity(multiplicityContext));
  }

  @Test
  public void testVisitMultiplicityArgument() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplicityArgument(
        new PureInstanceClassMappingParserGrammar.MultiplicityArgumentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicityArgument2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplicityArgument(
        new PureInstanceClassMappingParserGrammar.MultiplicityArgumentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicityArgument3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.MultiplicityArgumentContext multiplicityArgumentContext = new PureInstanceClassMappingParserGrammar.MultiplicityArgumentContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplicityArgument(multiplicityArgumentContext));
  }

  @Test
  public void testVisitMultiplicityArguments() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplicityArguments(
        new PureInstanceClassMappingParserGrammar.MultiplicityArgumentsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicityArguments2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplicityArguments(
        new PureInstanceClassMappingParserGrammar.MultiplicityArgumentsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicityArguments3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.MultiplicityArgumentsContext multiplicityArgumentsContext = new PureInstanceClassMappingParserGrammar.MultiplicityArgumentsContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplicityArguments(multiplicityArgumentsContext));
  }

  @Test
  public void testVisitMultiplictyParameters() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplictyParameters(
        new PureInstanceClassMappingParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplictyParameters2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplictyParameters(
        new PureInstanceClassMappingParserGrammar.MultiplictyParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplictyParameters3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.MultiplictyParametersContext multiplictyParametersContext = new PureInstanceClassMappingParserGrammar.MultiplictyParametersContext(
        new ParserRuleContext(), 1);
    multiplictyParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        pureInstanceClassMappingParserGrammarBaseVisitor.visitMultiplictyParameters(multiplictyParametersContext));
  }

  @Test
  public void testVisitNotExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitNotExpression(
        new PureInstanceClassMappingParserGrammar.NotExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitNotExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitNotExpression(new PureInstanceClassMappingParserGrammar.NotExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitNotExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.NotExpressionContext notExpressionContext = new PureInstanceClassMappingParserGrammar.NotExpressionContext(
        new ParserRuleContext(), 1);
    notExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitNotExpression(notExpressionContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitPackagePath(new PureInstanceClassMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitPackagePath(new PureInstanceClassMappingParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.PackagePathContext packagePathContext = new PureInstanceClassMappingParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitProgramLine() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitProgramLine(new PureInstanceClassMappingParserGrammar.ProgramLineContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitProgramLine2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitProgramLine(new PureInstanceClassMappingParserGrammar.ProgramLineContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitProgramLine3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ProgramLineContext programLineContext = new PureInstanceClassMappingParserGrammar.ProgramLineContext(
        new ParserRuleContext(), 1);
    programLineContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitProgramLine(programLineContext));
  }

  @Test
  public void testVisitPropertyBracketExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyBracketExpression(
        new PureInstanceClassMappingParserGrammar.PropertyBracketExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyBracketExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyBracketExpression(
        new PureInstanceClassMappingParserGrammar.PropertyBracketExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyBracketExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.PropertyBracketExpressionContext propertyBracketExpressionContext = new PureInstanceClassMappingParserGrammar.PropertyBracketExpressionContext(
        new ParserRuleContext(), 1);
    propertyBracketExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitPropertyBracketExpression(propertyBracketExpressionContext));
  }

  @Test
  public void testVisitPropertyExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyExpression(
        new PureInstanceClassMappingParserGrammar.PropertyExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyExpression(
        new PureInstanceClassMappingParserGrammar.PropertyExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.PropertyExpressionContext propertyExpressionContext = new PureInstanceClassMappingParserGrammar.PropertyExpressionContext(
        new ParserRuleContext(), 1);
    propertyExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyExpression(propertyExpressionContext));
  }

  @Test
  public void testVisitPropertyMapping() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyMapping(
        new PureInstanceClassMappingParserGrammar.PropertyMappingContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyMapping2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitPropertyMapping(new PureInstanceClassMappingParserGrammar.PropertyMappingContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyMapping3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.PropertyMappingContext propertyMappingContext = new PureInstanceClassMappingParserGrammar.PropertyMappingContext(
        new ParserRuleContext(), 1);
    propertyMappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyMapping(propertyMappingContext));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(
        new PureInstanceClassMappingParserGrammar.PropertyOrFunctionExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(
        new PureInstanceClassMappingParserGrammar.PropertyOrFunctionExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.PropertyOrFunctionExpressionContext propertyOrFunctionExpressionContext = new PureInstanceClassMappingParserGrammar.PropertyOrFunctionExpressionContext(
        new ParserRuleContext(), 1);
    propertyOrFunctionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitPropertyOrFunctionExpression(propertyOrFunctionExpressionContext));
  }

  @Test
  public void testVisitPropertyReturnType() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyReturnType(
        new PureInstanceClassMappingParserGrammar.PropertyReturnTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyReturnType2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyReturnType(
        new PureInstanceClassMappingParserGrammar.PropertyReturnTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyReturnType3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.PropertyReturnTypeContext propertyReturnTypeContext = new PureInstanceClassMappingParserGrammar.PropertyReturnTypeContext(
        new ParserRuleContext(), 1);
    propertyReturnTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPropertyReturnType(propertyReturnTypeContext));
  }

  @Test
  public void testVisitPureInstanceClassMapping() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPureInstanceClassMapping(
        new PureInstanceClassMappingParserGrammar.PureInstanceClassMappingContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPureInstanceClassMapping2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitPureInstanceClassMapping(
        new PureInstanceClassMappingParserGrammar.PureInstanceClassMappingContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPureInstanceClassMapping3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.PureInstanceClassMappingContext pureInstanceClassMappingContext = new PureInstanceClassMappingParserGrammar.PureInstanceClassMappingContext(
        new ParserRuleContext(), 1);
    pureInstanceClassMappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitPureInstanceClassMapping(pureInstanceClassMappingContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitQualifiedName(
        new PureInstanceClassMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitQualifiedName(new PureInstanceClassMappingParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.QualifiedNameContext qualifiedNameContext = new PureInstanceClassMappingParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitSignedExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitSignedExpression(
        new PureInstanceClassMappingParserGrammar.SignedExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSignedExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitSignedExpression(
        new PureInstanceClassMappingParserGrammar.SignedExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSignedExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.SignedExpressionContext signedExpressionContext = new PureInstanceClassMappingParserGrammar.SignedExpressionContext(
        new ParserRuleContext(), 1);
    signedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitSignedExpression(signedExpressionContext));
  }

  @Test
  public void testVisitSliceExpression() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitSliceExpression(
        new PureInstanceClassMappingParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSliceExpression2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitSliceExpression(new PureInstanceClassMappingParserGrammar.SliceExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSliceExpression3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.SliceExpressionContext sliceExpressionContext = new PureInstanceClassMappingParserGrammar.SliceExpressionContext(
        new ParserRuleContext(), 1);
    sliceExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitSliceExpression(sliceExpressionContext));
  }

  @Test
  public void testVisitSourceAndTargetMappingId() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitSourceAndTargetMappingId(
        new PureInstanceClassMappingParserGrammar.SourceAndTargetMappingIdContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSourceAndTargetMappingId2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitSourceAndTargetMappingId(
        new PureInstanceClassMappingParserGrammar.SourceAndTargetMappingIdContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSourceAndTargetMappingId3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.SourceAndTargetMappingIdContext sourceAndTargetMappingIdContext = new PureInstanceClassMappingParserGrammar.SourceAndTargetMappingIdContext(
        new ParserRuleContext(), 1);
    sourceAndTargetMappingIdContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitSourceAndTargetMappingId(sourceAndTargetMappingIdContext));
  }

  @Test
  public void testVisitSourceId() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitSourceId(new PureInstanceClassMappingParserGrammar.SourceIdContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSourceId2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitSourceId(new PureInstanceClassMappingParserGrammar.SourceIdContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSourceId3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.SourceIdContext sourceIdContext = new PureInstanceClassMappingParserGrammar.SourceIdContext(
        new ParserRuleContext(), 1);
    sourceIdContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitSourceId(sourceIdContext));
  }

  @Test
  public void testVisitStereotypeReference() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitStereotypeReference(
        new PureInstanceClassMappingParserGrammar.StereotypeReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitStereotypeReference2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitStereotypeReference(
        new PureInstanceClassMappingParserGrammar.StereotypeReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitStereotypeReference3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.StereotypeReferenceContext stereotypeReferenceContext = new PureInstanceClassMappingParserGrammar.StereotypeReferenceContext(
        new ParserRuleContext(), 1);
    stereotypeReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitStereotypeReference(stereotypeReferenceContext));
  }

  @Test
  public void testVisitTagReference() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitTagReference(new PureInstanceClassMappingParserGrammar.TagReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTagReference2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitTagReference(new PureInstanceClassMappingParserGrammar.TagReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTagReference3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.TagReferenceContext tagReferenceContext = new PureInstanceClassMappingParserGrammar.TagReferenceContext(
        new ParserRuleContext(), 1);
    tagReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTagReference(tagReferenceContext));
  }

  @Test
  public void testVisitTargetId() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitTargetId(new PureInstanceClassMappingParserGrammar.TargetIdContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTargetId2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitTargetId(new PureInstanceClassMappingParserGrammar.TargetIdContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTargetId3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.TargetIdContext targetIdContext = new PureInstanceClassMappingParserGrammar.TargetIdContext(
        new ParserRuleContext(), 1);
    targetIdContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTargetId(targetIdContext));
  }

  @Test
  public void testVisitToMultiplicity() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitToMultiplicity(
        new PureInstanceClassMappingParserGrammar.ToMultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitToMultiplicity2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitToMultiplicity(new PureInstanceClassMappingParserGrammar.ToMultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitToMultiplicity3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.ToMultiplicityContext toMultiplicityContext = new PureInstanceClassMappingParserGrammar.ToMultiplicityContext(
        new ParserRuleContext(), 1);
    toMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitToMultiplicity(toMultiplicityContext));
  }

  @Test
  public void testVisitType() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitType(new PureInstanceClassMappingParserGrammar.TypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitType2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitType(new PureInstanceClassMappingParserGrammar.TypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitType3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.TypeContext typeContext = new PureInstanceClassMappingParserGrammar.TypeContext(
        new ParserRuleContext(), 1);
    typeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitType(typeContext));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(
        new PureInstanceClassMappingParserGrammar.TypeAndMultiplicityParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(
        new PureInstanceClassMappingParserGrammar.TypeAndMultiplicityParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.TypeAndMultiplicityParametersContext typeAndMultiplicityParametersContext = new PureInstanceClassMappingParserGrammar.TypeAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeAndMultiplicityParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitTypeAndMultiplicityParameters(typeAndMultiplicityParametersContext));
  }

  @Test
  public void testVisitTypeArguments() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeArguments(
        new PureInstanceClassMappingParserGrammar.TypeArgumentsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeArguments2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitTypeArguments(new PureInstanceClassMappingParserGrammar.TypeArgumentsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeArguments3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.TypeArgumentsContext typeArgumentsContext = new PureInstanceClassMappingParserGrammar.TypeArgumentsContext(
        new ParserRuleContext(), 1);
    typeArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeArguments(typeArgumentsContext));
  }

  @Test
  public void testVisitTypeParameter() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeParameter(
        new PureInstanceClassMappingParserGrammar.TypeParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParameter2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitTypeParameter(new PureInstanceClassMappingParserGrammar.TypeParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParameter3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.TypeParameterContext typeParameterContext = new PureInstanceClassMappingParserGrammar.TypeParameterContext(
        new ParserRuleContext(), 1);
    typeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeParameter(typeParameterContext));
  }

  @Test
  public void testVisitTypeParameters() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeParameters(
        new PureInstanceClassMappingParserGrammar.TypeParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParameters2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitTypeParameters(new PureInstanceClassMappingParserGrammar.TypeParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParameters3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.TypeParametersContext typeParametersContext = new PureInstanceClassMappingParserGrammar.TypeParametersContext(
        new ParserRuleContext(), 1);
    typeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeParameters(typeParametersContext));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
            new PureInstanceClassMappingParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
                new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
            new PureInstanceClassMappingParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
                parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext typeParametersWithContravarianceAndMultiplicityParametersContext = new PureInstanceClassMappingParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeParametersWithContravarianceAndMultiplicityParametersContext
        .<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        pureInstanceClassMappingParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
            typeParametersWithContravarianceAndMultiplicityParametersContext));
  }

  @Test
  public void testVisitUnitInstance() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitUnitInstance(new PureInstanceClassMappingParserGrammar.UnitInstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitInstance2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitUnitInstance(new PureInstanceClassMappingParserGrammar.UnitInstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitInstance3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.UnitInstanceContext unitInstanceContext = new PureInstanceClassMappingParserGrammar.UnitInstanceContext(
        new ParserRuleContext(), 1);
    unitInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitUnitInstance(unitInstanceContext));
  }

  @Test
  public void testVisitUnitInstanceLiteral() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitUnitInstanceLiteral(
        new PureInstanceClassMappingParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitInstanceLiteral2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitUnitInstanceLiteral(
        new PureInstanceClassMappingParserGrammar.UnitInstanceLiteralContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitInstanceLiteral3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.UnitInstanceLiteralContext unitInstanceLiteralContext = new PureInstanceClassMappingParserGrammar.UnitInstanceLiteralContext(
        new ParserRuleContext(), 1);
    unitInstanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitUnitInstanceLiteral(unitInstanceLiteralContext));
  }

  @Test
  public void testVisitUnitName() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitUnitName(new PureInstanceClassMappingParserGrammar.UnitNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitName2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitUnitName(new PureInstanceClassMappingParserGrammar.UnitNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitName3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.UnitNameContext unitNameContext = new PureInstanceClassMappingParserGrammar.UnitNameContext(
        new ParserRuleContext(), 1);
    unitNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitUnitName(unitNameContext));
  }

  @Test
  public void testVisitVariable() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitVariable(new PureInstanceClassMappingParserGrammar.VariableContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitVariable2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitVariable(new PureInstanceClassMappingParserGrammar.VariableContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitVariable3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.VariableContext variableContext = new PureInstanceClassMappingParserGrammar.VariableContext(
        new ParserRuleContext(), 1);
    variableContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitVariable(variableContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitWord(new PureInstanceClassMappingParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor
        .visitWord(new PureInstanceClassMappingParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    PureInstanceClassMappingParserGrammarBaseVisitor<Object> pureInstanceClassMappingParserGrammarBaseVisitor = new PureInstanceClassMappingParserGrammarBaseVisitor<Object>();

    PureInstanceClassMappingParserGrammar.WordContext wordContext = new PureInstanceClassMappingParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pureInstanceClassMappingParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

