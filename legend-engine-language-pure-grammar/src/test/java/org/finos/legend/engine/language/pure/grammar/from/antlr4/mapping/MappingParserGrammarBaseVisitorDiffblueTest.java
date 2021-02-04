package org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class MappingParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitAllFunction() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitAllFunction(new MappingParserGrammar.AllFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllFunction2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitAllFunction(new MappingParserGrammar.AllFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllFunction3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.AllFunctionContext allFunctionContext = new MappingParserGrammar.AllFunctionContext(
        new ParserRuleContext(), 1);
    allFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAllFunction(allFunctionContext));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(
        new MappingParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(
        new MappingParserGrammar.AllFunctionWithMilestoningContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllFunctionWithMilestoning3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.AllFunctionWithMilestoningContext allFunctionWithMilestoningContext = new MappingParserGrammar.AllFunctionWithMilestoningContext(
        new ParserRuleContext(), 1);
    allFunctionWithMilestoningContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAllFunctionWithMilestoning(allFunctionWithMilestoningContext));
  }

  @Test
  public void testVisitAllOrFunction() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitAllOrFunction(new MappingParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllOrFunction2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitAllOrFunction(new MappingParserGrammar.AllOrFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllOrFunction3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.AllOrFunctionContext allOrFunctionContext = new MappingParserGrammar.AllOrFunctionContext(
        new ParserRuleContext(), 1);
    allOrFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAllOrFunction(allOrFunctionContext));
  }

  @Test
  public void testVisitAllVersionsFunction() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitAllVersionsFunction(new MappingParserGrammar.AllVersionsFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllVersionsFunction2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitAllVersionsFunction(new MappingParserGrammar.AllVersionsFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllVersionsFunction3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.AllVersionsFunctionContext allVersionsFunctionContext = new MappingParserGrammar.AllVersionsFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAllVersionsFunction(allVersionsFunctionContext));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(
        new MappingParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(
        new MappingParserGrammar.AllVersionsInRangeFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAllVersionsInRangeFunction3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.AllVersionsInRangeFunctionContext allVersionsInRangeFunctionContext = new MappingParserGrammar.AllVersionsInRangeFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsInRangeFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAllVersionsInRangeFunction(allVersionsInRangeFunctionContext));
  }

  @Test
  public void testVisitArithmeticPart() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitArithmeticPart(new MappingParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitArithmeticPart2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitArithmeticPart(new MappingParserGrammar.ArithmeticPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitArithmeticPart3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ArithmeticPartContext arithmeticPartContext = new MappingParserGrammar.ArithmeticPartContext(
        new ParserRuleContext(), 1);
    arithmeticPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitArithmeticPart(arithmeticPartContext));
  }

  @Test
  public void testVisitAtomicExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitAtomicExpression(new MappingParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitAtomicExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitAtomicExpression(new MappingParserGrammar.AtomicExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitAtomicExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.AtomicExpressionContext atomicExpressionContext = new MappingParserGrammar.AtomicExpressionContext(
        new ParserRuleContext(), 1);
    atomicExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitAtomicExpression(atomicExpressionContext));
  }

  @Test
  public void testVisitBooleanPart() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitBooleanPart(new MappingParserGrammar.BooleanPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitBooleanPart2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitBooleanPart(new MappingParserGrammar.BooleanPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitBooleanPart3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.BooleanPartContext booleanPartContext = new MappingParserGrammar.BooleanPartContext(
        new ParserRuleContext(), 1);
    booleanPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitBooleanPart(booleanPartContext));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitBuildMilestoningVariableExpression(
        new MappingParserGrammar.BuildMilestoningVariableExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitBuildMilestoningVariableExpression(
        new MappingParserGrammar.BuildMilestoningVariableExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitBuildMilestoningVariableExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.BuildMilestoningVariableExpressionContext buildMilestoningVariableExpressionContext = new MappingParserGrammar.BuildMilestoningVariableExpressionContext(
        new ParserRuleContext(), 1);
    buildMilestoningVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitBuildMilestoningVariableExpression(buildMilestoningVariableExpressionContext));
  }

  @Test
  public void testVisitCodeBlock() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitCodeBlock(new MappingParserGrammar.CodeBlockContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCodeBlock2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitCodeBlock(new MappingParserGrammar.CodeBlockContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCodeBlock3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.CodeBlockContext codeBlockContext = new MappingParserGrammar.CodeBlockContext(
        new ParserRuleContext(), 1);
    codeBlockContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitCodeBlock(codeBlockContext));
  }

  @Test
  public void testVisitCombinedArithmeticOnly() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitCombinedArithmeticOnly(
        new MappingParserGrammar.CombinedArithmeticOnlyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCombinedArithmeticOnly2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitCombinedArithmeticOnly(new MappingParserGrammar.CombinedArithmeticOnlyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCombinedArithmeticOnly3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.CombinedArithmeticOnlyContext combinedArithmeticOnlyContext = new MappingParserGrammar.CombinedArithmeticOnlyContext(
        new ParserRuleContext(), 1);
    combinedArithmeticOnlyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitCombinedArithmeticOnly(combinedArithmeticOnlyContext));
  }

  @Test
  public void testVisitCombinedExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitCombinedExpression(new MappingParserGrammar.CombinedExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitCombinedExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitCombinedExpression(new MappingParserGrammar.CombinedExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitCombinedExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.CombinedExpressionContext combinedExpressionContext = new MappingParserGrammar.CombinedExpressionContext(
        new ParserRuleContext(), 1);
    combinedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitCombinedExpression(combinedExpressionContext));
  }

  @Test
  public void testVisitContravarianceTypeParameter() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitContravarianceTypeParameter(
        new MappingParserGrammar.ContravarianceTypeParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameter2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitContravarianceTypeParameter(
        new MappingParserGrammar.ContravarianceTypeParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameter3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ContravarianceTypeParameterContext contravarianceTypeParameterContext = new MappingParserGrammar.ContravarianceTypeParameterContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitContravarianceTypeParameter(contravarianceTypeParameterContext));
  }

  @Test
  public void testVisitContravarianceTypeParameters() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitContravarianceTypeParameters(
        new MappingParserGrammar.ContravarianceTypeParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameters2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitContravarianceTypeParameters(
        new MappingParserGrammar.ContravarianceTypeParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitContravarianceTypeParameters3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ContravarianceTypeParametersContext contravarianceTypeParametersContext = new MappingParserGrammar.ContravarianceTypeParametersContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitContravarianceTypeParameters(contravarianceTypeParametersContext));
  }

  @Test
  public void testVisitDefinition() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitDefinition(new MappingParserGrammar.DefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefinition2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitDefinition(new MappingParserGrammar.DefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefinition3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.DefinitionContext definitionContext = new MappingParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitDsl() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitDsl(new MappingParserGrammar.DslContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDsl2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitDsl(new MappingParserGrammar.DslContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDsl3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.DslContext dslContext = new MappingParserGrammar.DslContext(new ParserRuleContext(), 1);
    dslContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitDsl(dslContext));
  }

  @Test
  public void testVisitDslContent() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitDslContent(new MappingParserGrammar.DslContentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslContent2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitDslContent(new MappingParserGrammar.DslContentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslContent3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.DslContentContext dslContentContext = new MappingParserGrammar.DslContentContext(
        new ParserRuleContext(), 1);
    dslContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitDslContent(dslContentContext));
  }

  @Test
  public void testVisitDslGraphFetch() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitDslGraphFetch(new MappingParserGrammar.DslGraphFetchContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslGraphFetch2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitDslGraphFetch(new MappingParserGrammar.DslGraphFetchContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslGraphFetch3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.DslGraphFetchContext dslGraphFetchContext = new MappingParserGrammar.DslGraphFetchContext(
        new ParserRuleContext(), 1);
    dslGraphFetchContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitDslGraphFetch(dslGraphFetchContext));
  }

  @Test
  public void testVisitDslNavigationPath() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitDslNavigationPath(new MappingParserGrammar.DslNavigationPathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDslNavigationPath2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitDslNavigationPath(new MappingParserGrammar.DslNavigationPathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDslNavigationPath3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.DslNavigationPathContext dslNavigationPathContext = new MappingParserGrammar.DslNavigationPathContext(
        new ParserRuleContext(), 1);
    dslNavigationPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitDslNavigationPath(dslNavigationPathContext));
  }

  @Test
  public void testVisitEnumReference() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitEnumReference(new MappingParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumReference2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitEnumReference(new MappingParserGrammar.EnumReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumReference3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.EnumReferenceContext enumReferenceContext = new MappingParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);
    enumReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitEnumReference(enumReferenceContext));
  }

  @Test
  public void testVisitEqualNotEqual() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitEqualNotEqual(new MappingParserGrammar.EqualNotEqualContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEqualNotEqual2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitEqualNotEqual(new MappingParserGrammar.EqualNotEqualContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEqualNotEqual3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.EqualNotEqualContext equalNotEqualContext = new MappingParserGrammar.EqualNotEqualContext(
        new ParserRuleContext(), 1);
    equalNotEqualContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitEqualNotEqual(equalNotEqualContext));
  }

  @Test
  public void testVisitExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpression(new MappingParserGrammar.ExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpression(new MappingParserGrammar.ExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ExpressionContext expressionContext = new MappingParserGrammar.ExpressionContext(
        new ParserRuleContext(), 1);
    expressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpression(expressionContext));
  }

  @Test
  public void testVisitExpressionInstance() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpressionInstance(new MappingParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstance2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpressionInstance(new MappingParserGrammar.ExpressionInstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstance3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ExpressionInstanceContext expressionInstanceContext = new MappingParserGrammar.ExpressionInstanceContext(
        new ParserRuleContext(), 1);
    expressionInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionInstance(expressionInstanceContext));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionInstanceAtomicRightSide(
        new MappingParserGrammar.ExpressionInstanceAtomicRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionInstanceAtomicRightSide(
        new MappingParserGrammar.ExpressionInstanceAtomicRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceAtomicRightSide3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ExpressionInstanceAtomicRightSideContext expressionInstanceAtomicRightSideContext = new MappingParserGrammar.ExpressionInstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpressionInstanceAtomicRightSide(expressionInstanceAtomicRightSideContext));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionInstanceParserPropertyAssignment(
        new MappingParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionInstanceParserPropertyAssignment(
        new MappingParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceParserPropertyAssignment3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ExpressionInstanceParserPropertyAssignmentContext expressionInstanceParserPropertyAssignmentContext = new MappingParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(
        new ParserRuleContext(), 1);
    expressionInstanceParserPropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpressionInstanceParserPropertyAssignment(expressionInstanceParserPropertyAssignmentContext));
  }

  @Test
  public void testVisitExpressionInstanceRightSide() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionInstanceRightSide(
        new MappingParserGrammar.ExpressionInstanceRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionInstanceRightSide2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionInstanceRightSide(
        new MappingParserGrammar.ExpressionInstanceRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionInstanceRightSide3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ExpressionInstanceRightSideContext expressionInstanceRightSideContext = new MappingParserGrammar.ExpressionInstanceRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionInstanceRightSide(expressionInstanceRightSideContext));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(
        new MappingParserGrammar.ExpressionOrExpressionGroupContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(
        new MappingParserGrammar.ExpressionOrExpressionGroupContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionOrExpressionGroup3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ExpressionOrExpressionGroupContext expressionOrExpressionGroupContext = new MappingParserGrammar.ExpressionOrExpressionGroupContext(
        new ParserRuleContext(), 1);
    expressionOrExpressionGroupContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionOrExpressionGroup(expressionOrExpressionGroupContext));
  }

  @Test
  public void testVisitExpressionPart() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpressionPart(new MappingParserGrammar.ExpressionPartContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionPart2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpressionPart(new MappingParserGrammar.ExpressionPartContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionPart3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ExpressionPartContext expressionPartContext = new MappingParserGrammar.ExpressionPartContext(
        new ParserRuleContext(), 1);
    expressionPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionPart(expressionPartContext));
  }

  @Test
  public void testVisitExpressionsArray() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpressionsArray(new MappingParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitExpressionsArray2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitExpressionsArray(new MappingParserGrammar.ExpressionsArrayContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitExpressionsArray3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ExpressionsArrayContext expressionsArrayContext = new MappingParserGrammar.ExpressionsArrayContext(
        new ParserRuleContext(), 1);
    expressionsArrayContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitExpressionsArray(expressionsArrayContext));
  }

  @Test
  public void testVisitFromMultiplicity() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitFromMultiplicity(new MappingParserGrammar.FromMultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFromMultiplicity2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitFromMultiplicity(new MappingParserGrammar.FromMultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFromMultiplicity3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.FromMultiplicityContext fromMultiplicityContext = new MappingParserGrammar.FromMultiplicityContext(
        new ParserRuleContext(), 1);
    fromMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFromMultiplicity(fromMultiplicityContext));
  }

  @Test
  public void testVisitFunctionExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitFunctionExpression(new MappingParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitFunctionExpression(new MappingParserGrammar.FunctionExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.FunctionExpressionContext functionExpressionContext = new MappingParserGrammar.FunctionExpressionContext(
        new ParserRuleContext(), 1);
    functionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionExpression(functionExpressionContext));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        new MappingParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        new MappingParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpressionLatestMilestoningDateParameter3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext functionExpressionLatestMilestoningDateParameterContext = new MappingParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1);
    functionExpressionLatestMilestoningDateParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionExpressionLatestMilestoningDateParameter(
        functionExpressionLatestMilestoningDateParameterContext));
  }

  @Test
  public void testVisitFunctionExpressionParameters() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionExpressionParameters(
        new MappingParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionExpressionParameters2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionExpressionParameters(
        new MappingParserGrammar.FunctionExpressionParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionExpressionParameters3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.FunctionExpressionParametersContext functionExpressionParametersContext = new MappingParserGrammar.FunctionExpressionParametersContext(
        new ParserRuleContext(), 1);
    functionExpressionParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionExpressionParameters(functionExpressionParametersContext));
  }

  @Test
  public void testVisitFunctionTypePureType() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitFunctionTypePureType(new MappingParserGrammar.FunctionTypePureTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionTypePureType2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitFunctionTypePureType(new MappingParserGrammar.FunctionTypePureTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionTypePureType3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.FunctionTypePureTypeContext functionTypePureTypeContext = new MappingParserGrammar.FunctionTypePureTypeContext(
        new ParserRuleContext(), 1);
    functionTypePureTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionTypePureType(functionTypePureTypeContext));
  }

  @Test
  public void testVisitFunctionVariableExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionVariableExpression(
        new MappingParserGrammar.FunctionVariableExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitFunctionVariableExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionVariableExpression(
        new MappingParserGrammar.FunctionVariableExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitFunctionVariableExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.FunctionVariableExpressionContext functionVariableExpressionContext = new MappingParserGrammar.FunctionVariableExpressionContext(
        new ParserRuleContext(), 1);
    functionVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitFunctionVariableExpression(functionVariableExpressionContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitIdentifier(new MappingParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitIdentifier(new MappingParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.IdentifierContext identifierContext = new MappingParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitImportStatement() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitImportStatement(new MappingParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitImportStatement2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitImportStatement(new MappingParserGrammar.ImportStatementContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitImportStatement3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ImportStatementContext importStatementContext = new MappingParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitImportStatement(importStatementContext));
  }

  @Test
  public void testVisitImports() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitImports(new MappingParserGrammar.ImportsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitImports2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitImports(new MappingParserGrammar.ImportsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitImports3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ImportsContext importsContext = new MappingParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);
    importsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitImports(importsContext));
  }

  @Test
  public void testVisitIncludeMapping() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitIncludeMapping(new MappingParserGrammar.IncludeMappingContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIncludeMapping2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitIncludeMapping(new MappingParserGrammar.IncludeMappingContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIncludeMapping3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.IncludeMappingContext includeMappingContext = new MappingParserGrammar.IncludeMappingContext(
        new ParserRuleContext(), 1);
    includeMappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitIncludeMapping(includeMappingContext));
  }

  @Test
  public void testVisitInstance() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstance(new MappingParserGrammar.InstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstance2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitInstance(new MappingParserGrammar.InstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstance3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.InstanceContext instanceContext = new MappingParserGrammar.InstanceContext(
        new ParserRuleContext(), 1);
    instanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstance(instanceContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSide() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceAtomicRightSide(
        new MappingParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSide2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstanceAtomicRightSide(new MappingParserGrammar.InstanceAtomicRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSide3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.InstanceAtomicRightSideContext instanceAtomicRightSideContext = new MappingParserGrammar.InstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceAtomicRightSide(instanceAtomicRightSideContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(
        new MappingParserGrammar.InstanceAtomicRightSideScalarContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(
        new MappingParserGrammar.InstanceAtomicRightSideScalarContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideScalar3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.InstanceAtomicRightSideScalarContext instanceAtomicRightSideScalarContext = new MappingParserGrammar.InstanceAtomicRightSideScalarContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideScalarContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideScalar(instanceAtomicRightSideScalarContext));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(
        new MappingParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(
        new MappingParserGrammar.InstanceAtomicRightSideVectorContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceAtomicRightSideVector3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.InstanceAtomicRightSideVectorContext instanceAtomicRightSideVectorContext = new MappingParserGrammar.InstanceAtomicRightSideVectorContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideVectorContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitInstanceAtomicRightSideVector(instanceAtomicRightSideVectorContext));
  }

  @Test
  public void testVisitInstanceLiteral() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstanceLiteral(new MappingParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteral2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstanceLiteral(new MappingParserGrammar.InstanceLiteralContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteral3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.InstanceLiteralContext instanceLiteralContext = new MappingParserGrammar.InstanceLiteralContext(
        new ParserRuleContext(), 1);
    instanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceLiteral(instanceLiteralContext));
  }

  @Test
  public void testVisitInstanceLiteralToken() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstanceLiteralToken(new MappingParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstanceLiteralToken(new MappingParserGrammar.InstanceLiteralTokenContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceLiteralToken3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.InstanceLiteralTokenContext instanceLiteralTokenContext = new MappingParserGrammar.InstanceLiteralTokenContext(
        new ParserRuleContext(), 1);
    instanceLiteralTokenContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceLiteralToken(instanceLiteralTokenContext));
  }

  @Test
  public void testVisitInstancePropertyAssignment() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstancePropertyAssignment(
        new MappingParserGrammar.InstancePropertyAssignmentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstancePropertyAssignment2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstancePropertyAssignment(
        new MappingParserGrammar.InstancePropertyAssignmentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstancePropertyAssignment3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.InstancePropertyAssignmentContext instancePropertyAssignmentContext = new MappingParserGrammar.InstancePropertyAssignmentContext(
        new ParserRuleContext(), 1);
    instancePropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstancePropertyAssignment(instancePropertyAssignmentContext));
  }

  @Test
  public void testVisitInstanceReference() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstanceReference(new MappingParserGrammar.InstanceReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceReference2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstanceReference(new MappingParserGrammar.InstanceReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceReference3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.InstanceReferenceContext instanceReferenceContext = new MappingParserGrammar.InstanceReferenceContext(
        new ParserRuleContext(), 1);
    instanceReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceReference(instanceReferenceContext));
  }

  @Test
  public void testVisitInstanceRightSide() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstanceRightSide(new MappingParserGrammar.InstanceRightSideContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitInstanceRightSide2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitInstanceRightSide(new MappingParserGrammar.InstanceRightSideContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitInstanceRightSide3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.InstanceRightSideContext instanceRightSideContext = new MappingParserGrammar.InstanceRightSideContext(
        new ParserRuleContext(), 1);
    instanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitInstanceRightSide(instanceRightSideContext));
  }

  @Test
  public void testVisitLambdaFunction() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLambdaFunction(new MappingParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaFunction2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLambdaFunction(new MappingParserGrammar.LambdaFunctionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaFunction3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.LambdaFunctionContext lambdaFunctionContext = new MappingParserGrammar.LambdaFunctionContext(
        new ParserRuleContext(), 1);
    lambdaFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitLambdaFunction(lambdaFunctionContext));
  }

  @Test
  public void testVisitLambdaParam() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLambdaParam(new MappingParserGrammar.LambdaParamContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaParam2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLambdaParam(new MappingParserGrammar.LambdaParamContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaParam3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.LambdaParamContext lambdaParamContext = new MappingParserGrammar.LambdaParamContext(
        new ParserRuleContext(), 1);
    lambdaParamContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitLambdaParam(lambdaParamContext));
  }

  @Test
  public void testVisitLambdaParamType() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLambdaParamType(new MappingParserGrammar.LambdaParamTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaParamType2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLambdaParamType(new MappingParserGrammar.LambdaParamTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaParamType3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.LambdaParamTypeContext lambdaParamTypeContext = new MappingParserGrammar.LambdaParamTypeContext(
        new ParserRuleContext(), 1);
    lambdaParamTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitLambdaParamType(lambdaParamTypeContext));
  }

  @Test
  public void testVisitLambdaPipe() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLambdaPipe(new MappingParserGrammar.LambdaPipeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLambdaPipe2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLambdaPipe(new MappingParserGrammar.LambdaPipeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLambdaPipe3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.LambdaPipeContext lambdaPipeContext = new MappingParserGrammar.LambdaPipeContext(
        new ParserRuleContext(), 1);
    lambdaPipeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitLambdaPipe(lambdaPipeContext));
  }

  @Test
  public void testVisitLetExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLetExpression(new MappingParserGrammar.LetExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitLetExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitLetExpression(new MappingParserGrammar.LetExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitLetExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.LetExpressionContext letExpressionContext = new MappingParserGrammar.LetExpressionContext(
        new ParserRuleContext(), 1);
    letExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitLetExpression(letExpressionContext));
  }

  @Test
  public void testVisitMapping() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMapping(new MappingParserGrammar.MappingContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMapping2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitMapping(new MappingParserGrammar.MappingContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMapping3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MappingContext mappingContext = new MappingParserGrammar.MappingContext(
        new ParserRuleContext(), 1);
    mappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMapping(mappingContext));
  }

  @Test
  public void testVisitMappingElement() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMappingElement(new MappingParserGrammar.MappingElementContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMappingElement2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMappingElement(new MappingParserGrammar.MappingElementContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMappingElement3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MappingElementContext mappingElementContext = new MappingParserGrammar.MappingElementContext(
        new ParserRuleContext(), 1);
    mappingElementContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMappingElement(mappingElementContext));
  }

  @Test
  public void testVisitMappingElementBody() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMappingElementBody(new MappingParserGrammar.MappingElementBodyContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMappingElementBody2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMappingElementBody(new MappingParserGrammar.MappingElementBodyContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMappingElementBody3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MappingElementBodyContext mappingElementBodyContext = new MappingParserGrammar.MappingElementBodyContext(
        new ParserRuleContext(), 1);
    mappingElementBodyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMappingElementBody(mappingElementBodyContext));
  }

  @Test
  public void testVisitMappingElementBodyContent() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMappingElementBodyContent(
        new MappingParserGrammar.MappingElementBodyContentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMappingElementBodyContent2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMappingElementBodyContent(
        new MappingParserGrammar.MappingElementBodyContentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMappingElementBodyContent3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MappingElementBodyContentContext mappingElementBodyContentContext = new MappingParserGrammar.MappingElementBodyContentContext(
        new ParserRuleContext(), 1);
    mappingElementBodyContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMappingElementBodyContent(mappingElementBodyContentContext));
  }

  @Test
  public void testVisitMappingElementId() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMappingElementId(new MappingParserGrammar.MappingElementIdContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMappingElementId2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMappingElementId(new MappingParserGrammar.MappingElementIdContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMappingElementId3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MappingElementIdContext mappingElementIdContext = new MappingParserGrammar.MappingElementIdContext(
        new ParserRuleContext(), 1);
    mappingElementIdContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMappingElementId(mappingElementIdContext));
  }

  @Test
  public void testVisitMappingElementName() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMappingElementName(new MappingParserGrammar.MappingElementNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMappingElementName2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMappingElementName(new MappingParserGrammar.MappingElementNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMappingElementName3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MappingElementNameContext mappingElementNameContext = new MappingParserGrammar.MappingElementNameContext(
        new ParserRuleContext(), 1);
    mappingElementNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMappingElementName(mappingElementNameContext));
  }

  @Test
  public void testVisitMultiplicity() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMultiplicity(new MappingParserGrammar.MultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicity2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMultiplicity(new MappingParserGrammar.MultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicity3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MultiplicityContext multiplicityContext = new MappingParserGrammar.MultiplicityContext(
        new ParserRuleContext(), 1);
    multiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMultiplicity(multiplicityContext));
  }

  @Test
  public void testVisitMultiplicityArgument() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMultiplicityArgument(new MappingParserGrammar.MultiplicityArgumentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicityArgument2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMultiplicityArgument(new MappingParserGrammar.MultiplicityArgumentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicityArgument3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MultiplicityArgumentContext multiplicityArgumentContext = new MappingParserGrammar.MultiplicityArgumentContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMultiplicityArgument(multiplicityArgumentContext));
  }

  @Test
  public void testVisitMultiplicityArguments() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMultiplicityArguments(new MappingParserGrammar.MultiplicityArgumentsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplicityArguments2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMultiplicityArguments(new MappingParserGrammar.MultiplicityArgumentsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplicityArguments3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MultiplicityArgumentsContext multiplicityArgumentsContext = new MappingParserGrammar.MultiplicityArgumentsContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMultiplicityArguments(multiplicityArgumentsContext));
  }

  @Test
  public void testVisitMultiplictyParameters() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMultiplictyParameters(new MappingParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitMultiplictyParameters2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitMultiplictyParameters(new MappingParserGrammar.MultiplictyParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitMultiplictyParameters3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.MultiplictyParametersContext multiplictyParametersContext = new MappingParserGrammar.MultiplictyParametersContext(
        new ParserRuleContext(), 1);
    multiplictyParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitMultiplictyParameters(multiplictyParametersContext));
  }

  @Test
  public void testVisitNotExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitNotExpression(new MappingParserGrammar.NotExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitNotExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitNotExpression(new MappingParserGrammar.NotExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitNotExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.NotExpressionContext notExpressionContext = new MappingParserGrammar.NotExpressionContext(
        new ParserRuleContext(), 1);
    notExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitNotExpression(notExpressionContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitPackagePath(new MappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitPackagePath(new MappingParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.PackagePathContext packagePathContext = new MappingParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitParserName() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitParserName(new MappingParserGrammar.ParserNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitParserName2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitParserName(new MappingParserGrammar.ParserNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitParserName3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ParserNameContext parserNameContext = new MappingParserGrammar.ParserNameContext(
        new ParserRuleContext(), 1);
    parserNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitParserName(parserNameContext));
  }

  @Test
  public void testVisitProgramLine() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitProgramLine(new MappingParserGrammar.ProgramLineContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitProgramLine2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitProgramLine(new MappingParserGrammar.ProgramLineContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitProgramLine3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ProgramLineContext programLineContext = new MappingParserGrammar.ProgramLineContext(
        new ParserRuleContext(), 1);
    programLineContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitProgramLine(programLineContext));
  }

  @Test
  public void testVisitPropertyBracketExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitPropertyBracketExpression(
        new MappingParserGrammar.PropertyBracketExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyBracketExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitPropertyBracketExpression(
        new MappingParserGrammar.PropertyBracketExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyBracketExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.PropertyBracketExpressionContext propertyBracketExpressionContext = new MappingParserGrammar.PropertyBracketExpressionContext(
        new ParserRuleContext(), 1);
    propertyBracketExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitPropertyBracketExpression(propertyBracketExpressionContext));
  }

  @Test
  public void testVisitPropertyExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitPropertyExpression(new MappingParserGrammar.PropertyExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitPropertyExpression(new MappingParserGrammar.PropertyExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.PropertyExpressionContext propertyExpressionContext = new MappingParserGrammar.PropertyExpressionContext(
        new ParserRuleContext(), 1);
    propertyExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitPropertyExpression(propertyExpressionContext));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(
        new MappingParserGrammar.PropertyOrFunctionExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(
        new MappingParserGrammar.PropertyOrFunctionExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyOrFunctionExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.PropertyOrFunctionExpressionContext propertyOrFunctionExpressionContext = new MappingParserGrammar.PropertyOrFunctionExpressionContext(
        new ParserRuleContext(), 1);
    propertyOrFunctionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitPropertyOrFunctionExpression(propertyOrFunctionExpressionContext));
  }

  @Test
  public void testVisitPropertyReturnType() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitPropertyReturnType(new MappingParserGrammar.PropertyReturnTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPropertyReturnType2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitPropertyReturnType(new MappingParserGrammar.PropertyReturnTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPropertyReturnType3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.PropertyReturnTypeContext propertyReturnTypeContext = new MappingParserGrammar.PropertyReturnTypeContext(
        new ParserRuleContext(), 1);
    propertyReturnTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitPropertyReturnType(propertyReturnTypeContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitQualifiedName(new MappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitQualifiedName(new MappingParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.QualifiedNameContext qualifiedNameContext = new MappingParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitSignedExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitSignedExpression(new MappingParserGrammar.SignedExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSignedExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitSignedExpression(new MappingParserGrammar.SignedExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSignedExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.SignedExpressionContext signedExpressionContext = new MappingParserGrammar.SignedExpressionContext(
        new ParserRuleContext(), 1);
    signedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitSignedExpression(signedExpressionContext));
  }

  @Test
  public void testVisitSliceExpression() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitSliceExpression(new MappingParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSliceExpression2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitSliceExpression(new MappingParserGrammar.SliceExpressionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSliceExpression3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.SliceExpressionContext sliceExpressionContext = new MappingParserGrammar.SliceExpressionContext(
        new ParserRuleContext(), 1);
    sliceExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitSliceExpression(sliceExpressionContext));
  }

  @Test
  public void testVisitSourceStore() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitSourceStore(new MappingParserGrammar.SourceStoreContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSourceStore2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitSourceStore(new MappingParserGrammar.SourceStoreContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSourceStore3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.SourceStoreContext sourceStoreContext = new MappingParserGrammar.SourceStoreContext(
        new ParserRuleContext(), 1);
    sourceStoreContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitSourceStore(sourceStoreContext));
  }

  @Test
  public void testVisitStereotypeReference() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitStereotypeReference(new MappingParserGrammar.StereotypeReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitStereotypeReference2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitStereotypeReference(new MappingParserGrammar.StereotypeReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitStereotypeReference3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.StereotypeReferenceContext stereotypeReferenceContext = new MappingParserGrammar.StereotypeReferenceContext(
        new ParserRuleContext(), 1);
    stereotypeReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitStereotypeReference(stereotypeReferenceContext));
  }

  @Test
  public void testVisitStoreSubPath() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitStoreSubPath(new MappingParserGrammar.StoreSubPathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitStoreSubPath2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitStoreSubPath(new MappingParserGrammar.StoreSubPathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitStoreSubPath3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.StoreSubPathContext storeSubPathContext = new MappingParserGrammar.StoreSubPathContext(
        new ParserRuleContext(), 1);
    storeSubPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitStoreSubPath(storeSubPathContext));
  }

  @Test
  public void testVisitSuperClassMappingId() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitSuperClassMappingId(new MappingParserGrammar.SuperClassMappingIdContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSuperClassMappingId2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitSuperClassMappingId(new MappingParserGrammar.SuperClassMappingIdContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSuperClassMappingId3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.SuperClassMappingIdContext superClassMappingIdContext = new MappingParserGrammar.SuperClassMappingIdContext(
        new ParserRuleContext(), 1);
    superClassMappingIdContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitSuperClassMappingId(superClassMappingIdContext));
  }

  @Test
  public void testVisitTagReference() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTagReference(new MappingParserGrammar.TagReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTagReference2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTagReference(new MappingParserGrammar.TagReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTagReference3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TagReferenceContext tagReferenceContext = new MappingParserGrammar.TagReferenceContext(
        new ParserRuleContext(), 1);
    tagReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTagReference(tagReferenceContext));
  }

  @Test
  public void testVisitTargetStore() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTargetStore(new MappingParserGrammar.TargetStoreContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTargetStore2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTargetStore(new MappingParserGrammar.TargetStoreContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTargetStore3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TargetStoreContext targetStoreContext = new MappingParserGrammar.TargetStoreContext(
        new ParserRuleContext(), 1);
    targetStoreContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTargetStore(targetStoreContext));
  }

  @Test
  public void testVisitTest() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitTest(new MappingParserGrammar.TestContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTest2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTest(new MappingParserGrammar.TestContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTest3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestContext testContext = new MappingParserGrammar.TestContext(new ParserRuleContext(), 1);
    testContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTest(testContext));
  }

  @Test
  public void testVisitTestAssert() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestAssert(new MappingParserGrammar.TestAssertContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestAssert2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestAssert(new MappingParserGrammar.TestAssertContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestAssert3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestAssertContext testAssertContext = new MappingParserGrammar.TestAssertContext(
        new ParserRuleContext(), 1);
    testAssertContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestAssert(testAssertContext));
  }

  @Test
  public void testVisitTestInput() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInput(new MappingParserGrammar.TestInputContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestInput2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInput(new MappingParserGrammar.TestInputContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestInput3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestInputContext testInputContext = new MappingParserGrammar.TestInputContext(
        new ParserRuleContext(), 1);
    testInputContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestInput(testInputContext));
  }

  @Test
  public void testVisitTestInputData() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputData(new MappingParserGrammar.TestInputDataContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestInputData2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputData(new MappingParserGrammar.TestInputDataContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestInputData3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestInputDataContext testInputDataContext = new MappingParserGrammar.TestInputDataContext(
        new ParserRuleContext(), 1);
    testInputDataContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestInputData(testInputDataContext));
  }

  @Test
  public void testVisitTestInputDataContent() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputDataContent(new MappingParserGrammar.TestInputDataContentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestInputDataContent2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputDataContent(new MappingParserGrammar.TestInputDataContentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestInputDataContent3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestInputDataContentContext testInputDataContentContext = new MappingParserGrammar.TestInputDataContentContext(
        new ParserRuleContext(), 1);
    testInputDataContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestInputDataContent(testInputDataContentContext));
  }

  @Test
  public void testVisitTestInputElement() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputElement(new MappingParserGrammar.TestInputElementContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestInputElement2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputElement(new MappingParserGrammar.TestInputElementContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestInputElement3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestInputElementContext testInputElementContext = new MappingParserGrammar.TestInputElementContext(
        new ParserRuleContext(), 1);
    testInputElementContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestInputElement(testInputElementContext));
  }

  @Test
  public void testVisitTestInputFormat() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputFormat(new MappingParserGrammar.TestInputFormatContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestInputFormat2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputFormat(new MappingParserGrammar.TestInputFormatContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestInputFormat3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestInputFormatContext testInputFormatContext = new MappingParserGrammar.TestInputFormatContext(
        new ParserRuleContext(), 1);
    testInputFormatContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestInputFormat(testInputFormatContext));
  }

  @Test
  public void testVisitTestInputSrc() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputSrc(new MappingParserGrammar.TestInputSrcContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestInputSrc2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputSrc(new MappingParserGrammar.TestInputSrcContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestInputSrc3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestInputSrcContext testInputSrcContext = new MappingParserGrammar.TestInputSrcContext(
        new ParserRuleContext(), 1);
    testInputSrcContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestInputSrc(testInputSrcContext));
  }

  @Test
  public void testVisitTestInputType() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputType(new MappingParserGrammar.TestInputTypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestInputType2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestInputType(new MappingParserGrammar.TestInputTypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestInputType3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestInputTypeContext testInputTypeContext = new MappingParserGrammar.TestInputTypeContext(
        new ParserRuleContext(), 1);
    testInputTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestInputType(testInputTypeContext));
  }

  @Test
  public void testVisitTestName() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestName(new MappingParserGrammar.TestNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestName2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitTestName(new MappingParserGrammar.TestNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestName3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestNameContext testNameContext = new MappingParserGrammar.TestNameContext(
        new ParserRuleContext(), 1);
    testNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestName(testNameContext));
  }

  @Test
  public void testVisitTestQuery() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestQuery(new MappingParserGrammar.TestQueryContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTestQuery2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTestQuery(new MappingParserGrammar.TestQueryContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTestQuery3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestQueryContext testQueryContext = new MappingParserGrammar.TestQueryContext(
        new ParserRuleContext(), 1);
    testQueryContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTestQuery(testQueryContext));
  }

  @Test
  public void testVisitTests() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitTests(new MappingParserGrammar.TestsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTests2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTests(new MappingParserGrammar.TestsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTests3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TestsContext testsContext = new MappingParserGrammar.TestsContext(new ParserRuleContext(), 1);
    testsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTests(testsContext));
  }

  @Test
  public void testVisitToMultiplicity() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitToMultiplicity(new MappingParserGrammar.ToMultiplicityContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitToMultiplicity2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitToMultiplicity(new MappingParserGrammar.ToMultiplicityContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitToMultiplicity3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.ToMultiplicityContext toMultiplicityContext = new MappingParserGrammar.ToMultiplicityContext(
        new ParserRuleContext(), 1);
    toMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitToMultiplicity(toMultiplicityContext));
  }

  @Test
  public void testVisitType() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitType(new MappingParserGrammar.TypeContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitType2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitType(new MappingParserGrammar.TypeContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitType3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TypeContext typeContext = new MappingParserGrammar.TypeContext(new ParserRuleContext(), 1);
    typeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitType(typeContext));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(
        new MappingParserGrammar.TypeAndMultiplicityParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(
        new MappingParserGrammar.TypeAndMultiplicityParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeAndMultiplicityParameters3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TypeAndMultiplicityParametersContext typeAndMultiplicityParametersContext = new MappingParserGrammar.TypeAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeAndMultiplicityParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitTypeAndMultiplicityParameters(typeAndMultiplicityParametersContext));
  }

  @Test
  public void testVisitTypeArguments() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTypeArguments(new MappingParserGrammar.TypeArgumentsContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeArguments2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTypeArguments(new MappingParserGrammar.TypeArgumentsContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeArguments3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TypeArgumentsContext typeArgumentsContext = new MappingParserGrammar.TypeArgumentsContext(
        new ParserRuleContext(), 1);
    typeArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTypeArguments(typeArgumentsContext));
  }

  @Test
  public void testVisitTypeParameter() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTypeParameter(new MappingParserGrammar.TypeParameterContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParameter2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTypeParameter(new MappingParserGrammar.TypeParameterContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParameter3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TypeParameterContext typeParameterContext = new MappingParserGrammar.TypeParameterContext(
        new ParserRuleContext(), 1);
    typeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTypeParameter(typeParameterContext));
  }

  @Test
  public void testVisitTypeParameters() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTypeParameters(new MappingParserGrammar.TypeParametersContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParameters2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitTypeParameters(new MappingParserGrammar.TypeParametersContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitTypeParameters3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TypeParametersContext typeParametersContext = new MappingParserGrammar.TypeParametersContext(
        new ParserRuleContext(), 1);
    typeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTypeParameters(typeParametersContext));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
        new MappingParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
            new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
        new MappingParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(parserRuleContext,
            1)));
  }

  @Test
  public void testVisitTypeParametersWithContravarianceAndMultiplicityParameters3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext typeParametersWithContravarianceAndMultiplicityParametersContext = new MappingParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeParametersWithContravarianceAndMultiplicityParametersContext
        .<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitTypeParametersWithContravarianceAndMultiplicityParameters(
        typeParametersWithContravarianceAndMultiplicityParametersContext));
  }

  @Test
  public void testVisitUnitInstance() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitUnitInstance(new MappingParserGrammar.UnitInstanceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitInstance2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitUnitInstance(new MappingParserGrammar.UnitInstanceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitInstance3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.UnitInstanceContext unitInstanceContext = new MappingParserGrammar.UnitInstanceContext(
        new ParserRuleContext(), 1);
    unitInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitUnitInstance(unitInstanceContext));
  }

  @Test
  public void testVisitUnitInstanceLiteral() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitUnitInstanceLiteral(new MappingParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitInstanceLiteral2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitUnitInstanceLiteral(new MappingParserGrammar.UnitInstanceLiteralContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitInstanceLiteral3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.UnitInstanceLiteralContext unitInstanceLiteralContext = new MappingParserGrammar.UnitInstanceLiteralContext(
        new ParserRuleContext(), 1);
    unitInstanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitUnitInstanceLiteral(unitInstanceLiteralContext));
  }

  @Test
  public void testVisitUnitName() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitUnitName(new MappingParserGrammar.UnitNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitUnitName2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitUnitName(new MappingParserGrammar.UnitNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitUnitName3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.UnitNameContext unitNameContext = new MappingParserGrammar.UnitNameContext(
        new ParserRuleContext(), 1);
    unitNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitUnitName(unitNameContext));
  }

  @Test
  public void testVisitVariable() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor
        .visitVariable(new MappingParserGrammar.VariableContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitVariable2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitVariable(new MappingParserGrammar.VariableContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitVariable3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.VariableContext variableContext = new MappingParserGrammar.VariableContext(
        new ParserRuleContext(), 1);
    variableContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitVariable(variableContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        mappingParserGrammarBaseVisitor.visitWord(new MappingParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitWord(new MappingParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    MappingParserGrammarBaseVisitor<Object> mappingParserGrammarBaseVisitor = new MappingParserGrammarBaseVisitor<Object>();

    MappingParserGrammar.WordContext wordContext = new MappingParserGrammar.WordContext(new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

