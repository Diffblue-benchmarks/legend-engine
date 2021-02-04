package org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.enumerationMapping;

import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class EnumerationMappingParserGrammarBaseVisitorDiffblueTest {
  @Test
  public void testVisitEnumMultipleSourceValue() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumMultipleSourceValue(
        new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumMultipleSourceValue2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumMultipleSourceValue(
        new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumMultipleSourceValue3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.EnumMultipleSourceValueContext enumMultipleSourceValueContext = new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(
        new ParserRuleContext(), 1);
    enumMultipleSourceValueContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumMultipleSourceValue(enumMultipleSourceValueContext));
  }

  @Test
  public void testVisitEnumName() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitEnumName(new EnumerationMappingParserGrammar.EnumNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumName2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitEnumName(new EnumerationMappingParserGrammar.EnumNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumName3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.EnumNameContext enumNameContext = new EnumerationMappingParserGrammar.EnumNameContext(
        new ParserRuleContext(), 1);
    enumNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumName(enumNameContext));
  }

  @Test
  public void testVisitEnumReference() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitEnumReference(new EnumerationMappingParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumReference2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitEnumReference(new EnumerationMappingParserGrammar.EnumReferenceContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumReference3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.EnumReferenceContext enumReferenceContext = new EnumerationMappingParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);
    enumReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumReference(enumReferenceContext));
  }

  @Test
  public void testVisitEnumSingleEntryMapping() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumSingleEntryMapping(
        new EnumerationMappingParserGrammar.EnumSingleEntryMappingContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumSingleEntryMapping2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumSingleEntryMapping(
        new EnumerationMappingParserGrammar.EnumSingleEntryMappingContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumSingleEntryMapping3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.EnumSingleEntryMappingContext enumSingleEntryMappingContext = new EnumerationMappingParserGrammar.EnumSingleEntryMappingContext(
        new ParserRuleContext(), 1);
    enumSingleEntryMappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumSingleEntryMapping(enumSingleEntryMappingContext));
  }

  @Test
  public void testVisitEnumSourceValue() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitEnumSourceValue(new EnumerationMappingParserGrammar.EnumSourceValueContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumSourceValue2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitEnumSourceValue(new EnumerationMappingParserGrammar.EnumSourceValueContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumSourceValue3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.EnumSourceValueContext enumSourceValueContext = new EnumerationMappingParserGrammar.EnumSourceValueContext(
        new ParserRuleContext(), 1);
    enumSourceValueContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumSourceValue(enumSourceValueContext));
  }

  @Test
  public void testVisitEnumerationMapping() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumerationMapping(
        new EnumerationMappingParserGrammar.EnumerationMappingContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitEnumerationMapping2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitEnumerationMapping(new EnumerationMappingParserGrammar.EnumerationMappingContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitEnumerationMapping3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.EnumerationMappingContext enumerationMappingContext = new EnumerationMappingParserGrammar.EnumerationMappingContext(
        new ParserRuleContext(), 1);
    enumerationMappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitEnumerationMapping(enumerationMappingContext));
  }

  @Test
  public void testVisitIdentifier() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitIdentifier(new EnumerationMappingParserGrammar.IdentifierContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitIdentifier2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitIdentifier(new EnumerationMappingParserGrammar.IdentifierContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitIdentifier3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.IdentifierContext identifierContext = new EnumerationMappingParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitIdentifier(identifierContext));
  }

  @Test
  public void testVisitPackagePath() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitPackagePath(new EnumerationMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitPackagePath2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitPackagePath(new EnumerationMappingParserGrammar.PackagePathContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitPackagePath3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.PackagePathContext packagePathContext = new EnumerationMappingParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitPackagePath(packagePathContext));
  }

  @Test
  public void testVisitQualifiedName() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitQualifiedName(new EnumerationMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitQualifiedName2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitQualifiedName(new EnumerationMappingParserGrammar.QualifiedNameContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitQualifiedName3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.QualifiedNameContext qualifiedNameContext = new EnumerationMappingParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitQualifiedName(qualifiedNameContext));
  }

  @Test
  public void testVisitWord() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitWord(new EnumerationMappingParserGrammar.WordContext(new ParserRuleContext(), 1)));
  }

  @Test
  public void testVisitWord2() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor
        .visitWord(new EnumerationMappingParserGrammar.WordContext(parserRuleContext, 1)));
  }

  @Test
  public void testVisitWord3() {
    // Arrange
    EnumerationMappingParserGrammarBaseVisitor<Object> enumerationMappingParserGrammarBaseVisitor = new EnumerationMappingParserGrammarBaseVisitor<Object>();

    EnumerationMappingParserGrammar.WordContext wordContext = new EnumerationMappingParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingParserGrammarBaseVisitor.visitWord(wordContext));
  }
}

