package org.finos.legend.engine.language.pure.grammar.from.antlr4;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class CodeParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitDefinition() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor
        .visitDefinition(new CodeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitDefinition2() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(
        codeParserGrammarBaseVisitor.visitDefinition(new CodeParserGrammar.DefinitionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitDefinition3() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.DefinitionContext definitionContext = new CodeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitDefinition4() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.DefinitionContext definitionContext = new CodeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new CodeParserGrammar.DefinitionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitDefinition5() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.DefinitionContext definitionContext = new CodeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new CodeParserGrammar.SectionContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitDefinition6() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.DefinitionContext definitionContext = new CodeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitDefinition(definitionContext));
  }

  @Test
  public void testVisitSection() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(
        codeParserGrammarBaseVisitor.visitSection(new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSection2() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitSection(new CodeParserGrammar.SectionContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSection3() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.SectionContext sectionContext = new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1);
    sectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitSection(sectionContext));
  }

  @Test
  public void testVisitSection4() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.SectionContext sectionContext = new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1);
    sectionContext.<ParseTree>addAnyChild(new CodeParserGrammar.DefinitionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitSection(sectionContext));
  }

  @Test
  public void testVisitSection5() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.SectionContext sectionContext = new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1);
    sectionContext.<ParseTree>addAnyChild(new CodeParserGrammar.SectionContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitSection(sectionContext));
  }

  @Test
  public void testVisitSection6() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.SectionContext sectionContext = new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1);
    sectionContext.<ParseTree>addAnyChild(new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitSection(sectionContext));
  }

  @Test
  public void testVisitSectionContent() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor
        .visitSectionContent(new CodeParserGrammar.SectionContentContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitSectionContent2() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor
        .visitSectionContent(new CodeParserGrammar.SectionContentContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitSectionContent3() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.SectionContentContext sectionContentContext = new CodeParserGrammar.SectionContentContext(
        new ParserRuleContext(), 1);
    sectionContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitSectionContent(sectionContentContext));
  }

  @Test
  public void testVisitSectionContent4() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.SectionContentContext sectionContentContext = new CodeParserGrammar.SectionContentContext(
        new ParserRuleContext(), 1);
    sectionContentContext.<ParseTree>addAnyChild(new CodeParserGrammar.DefinitionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitSectionContent(sectionContentContext));
  }

  @Test
  public void testVisitSectionContent5() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.SectionContentContext sectionContentContext = new CodeParserGrammar.SectionContentContext(
        new ParserRuleContext(), 1);
    sectionContentContext
        .<ParseTree>addAnyChild(new CodeParserGrammar.SectionContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitSectionContent(sectionContentContext));
  }

  @Test
  public void testVisitSectionContent6() {
    // Arrange
    CodeParserGrammarBaseVisitor<Object> codeParserGrammarBaseVisitor = new CodeParserGrammarBaseVisitor<Object>();

    CodeParserGrammar.SectionContentContext sectionContentContext = new CodeParserGrammar.SectionContentContext(
        new ParserRuleContext(), 1);
    sectionContentContext.<ParseTree>addAnyChild(new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(codeParserGrammarBaseVisitor.visitSectionContent(sectionContentContext));
  }
}

