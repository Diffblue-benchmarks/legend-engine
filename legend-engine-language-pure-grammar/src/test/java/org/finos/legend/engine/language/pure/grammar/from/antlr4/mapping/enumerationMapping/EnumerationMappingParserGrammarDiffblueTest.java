package org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.enumerationMapping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.InterpreterRuleContext;
import org.antlr.v4.runtime.ListTokenSource;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPathLexer;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.CodeParserGrammarBaseVisitor;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.ConnectionLexerGrammar;
import org.junit.Test;

public class EnumerationMappingParserGrammarDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    EnumerationMappingParserGrammar actualEnumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(new ArrayList<Token>())));

    // Assert
    assertNull(actualEnumerationMappingParserGrammar.getParseInfo());
    assertEquals(0, actualEnumerationMappingParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualEnumerationMappingParserGrammar.isMatchedEOF());
    assertNull(actualEnumerationMappingParserGrammar.getContext());
    assertTrue(
        actualEnumerationMappingParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualEnumerationMappingParserGrammar.getPrecedence());
    assertEquals("List", actualEnumerationMappingParserGrammar.getSourceName());
    assertFalse(actualEnumerationMappingParserGrammar.isTrace());
    assertTrue(actualEnumerationMappingParserGrammar.getBuildParseTree());
    assertEquals(-1, actualEnumerationMappingParserGrammar.getState());
    assertTrue(actualEnumerationMappingParserGrammar
        .getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualEnumerationMappingParserGrammar.getInterpreter();
    assertEquals(8, interpreter.decisionToDFA.length);
    assertSame(actualEnumerationMappingParserGrammar, interpreter.getParser());
    assertSame(actualEnumerationMappingParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualEnumerationMappingParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    EnumerationMappingParserGrammar actualEnumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Assert
    assertNull(actualEnumerationMappingParserGrammar.getParseInfo());
    assertEquals(0, actualEnumerationMappingParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualEnumerationMappingParserGrammar.isMatchedEOF());
    assertNull(actualEnumerationMappingParserGrammar.getContext());
    assertTrue(
        actualEnumerationMappingParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualEnumerationMappingParserGrammar.getPrecedence());
    assertEquals("List", actualEnumerationMappingParserGrammar.getSourceName());
    assertFalse(actualEnumerationMappingParserGrammar.isTrace());
    assertTrue(actualEnumerationMappingParserGrammar.getBuildParseTree());
    assertEquals(-1, actualEnumerationMappingParserGrammar.getState());
    assertTrue(actualEnumerationMappingParserGrammar
        .getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualEnumerationMappingParserGrammar.getInterpreter();
    assertEquals(8, interpreter.decisionToDFA.length);
    assertSame(actualEnumerationMappingParserGrammar, interpreter.getParser());
    assertSame(actualEnumerationMappingParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualEnumerationMappingParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testEnumMultipleSourceValue() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.EnumMultipleSourceValueContext actualEnumMultipleSourceValueResult = enumerationMappingParserGrammar
        .enumMultipleSourceValue();

    // Assert
    RecognitionException recognitionException = actualEnumMultipleSourceValueResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualEnumMultipleSourceValueResult.invokingState);
    assertNull(actualEnumMultipleSourceValueResult.getParent());
    Token expectedStart = actualEnumMultipleSourceValueResult.start;
    Token start = actualEnumMultipleSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEnumMultipleSourceValueResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(40, recognitionException.getOffendingState());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualEnumMultipleSourceValueResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testEnumMultipleSourceValue2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.EnumMultipleSourceValueContext actualEnumMultipleSourceValueResult = enumerationMappingParserGrammar
        .enumMultipleSourceValue();

    // Assert
    RecognitionException recognitionException = actualEnumMultipleSourceValueResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualEnumMultipleSourceValueResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualEnumMultipleSourceValueResult.getParent());
    Token expectedStart = actualEnumMultipleSourceValueResult.stop;
    Token start = actualEnumMultipleSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEnumMultipleSourceValueResult.getStop());
    assertEquals("<missing '['><EOF>", actualEnumMultipleSourceValueResult.getText());
    assertEquals(2, actualEnumMultipleSourceValueResult.getChildCount());
    assertTrue(actualEnumMultipleSourceValueResult.isEmpty());
    assertEquals("([] <missing '['> ([41] <EOF>))", actualEnumMultipleSourceValueResult.toStringTree());
    assertEquals(0, start.getTokenIndex());
    Token offendingToken = recognitionException.getOffendingToken();
    assertTrue(offendingToken instanceof CommonToken);
    assertEquals(46, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(actualEnumMultipleSourceValueResult, recognitionException.getCtx());
    assertSame(listTokenSource, offendingToken.getTokenSource());
    assertEquals(-1, offendingToken.getType());
    assertEquals(0, offendingToken.getChannel());
    assertEquals(2, offendingToken.getStartIndex());
    assertEquals(1, offendingToken.getStopIndex());
    assertEquals(41, ((EnumerationMappingParserGrammar.EnumSourceValueContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testEnumMultipleSourceValueContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.EnumMultipleSourceValueContext enumMultipleSourceValueContext = new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(enumMultipleSourceValueContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumMultipleSourceValueContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.EnumMultipleSourceValueContext enumMultipleSourceValueContext = new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(
        new ParserRuleContext(), 1);
    enumMultipleSourceValueContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumMultipleSourceValueContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumMultipleSourceValueContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(new ParserRuleContext(), 1))
        .BRACKET_CLOSE());
  }

  @Test
  public void testEnumMultipleSourceValueContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(new ParserRuleContext(), 1))
        .BRACKET_OPEN());
  }

  @Test
  public void testEnumMultipleSourceValueContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(new ParserRuleContext(), 1)).COMMA()
        .isEmpty());
    assertNull(
        (new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testEnumMultipleSourceValueContextEnumSourceValue() {
    // Arrange, Act and Assert
    assertTrue((new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(new ParserRuleContext(), 1))
        .enumSourceValue()
        .isEmpty());
    assertNull((new EnumerationMappingParserGrammar.EnumMultipleSourceValueContext(new ParserRuleContext(), 1))
        .enumSourceValue(1));
  }

  @Test
  public void testEnumName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    EnumerationMappingParserGrammar.EnumNameContext actualEnumNameResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource))).enumName();

    // Assert
    assertEquals(-1, actualEnumNameResult.invokingState);
    assertEquals(1, actualEnumNameResult.children.size());
    assertNull(actualEnumNameResult.getParent());
    Token expectedStart = actualEnumNameResult.start;
    Token start = actualEnumNameResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualEnumNameResult.getChildCount());
    assertNull(actualEnumNameResult.getStop());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    EnumerationMappingParserGrammar.IdentifierContext identifierResult = actualEnumNameResult.identifier();
    assertEquals(51, identifierResult.invokingState);
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertNull(identifierResult.getStop());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testEnumName2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    EnumerationMappingParserGrammar.EnumNameContext actualEnumNameResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).enumName();

    // Assert
    assertEquals(-1, actualEnumNameResult.invokingState);
    assertEquals(1, actualEnumNameResult.children.size());
    assertNull(actualEnumNameResult.getParent());
    Token expectedStart = actualEnumNameResult.stop;
    Token start = actualEnumNameResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualEnumNameResult.getChildCount());
    assertSame(start, actualEnumNameResult.getStop());
    EnumerationMappingParserGrammar.IdentifierContext identifierResult = actualEnumNameResult.identifier();
    assertEquals(51, identifierResult.invokingState);
    assertEquals(1, identifierResult.children.size());
    assertEquals("null", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    RecognitionException recognitionException = identifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(20, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(identifierResult, recognitionException.getCtx());
  }

  @Test
  public void testEnumName3() throws RecognitionException {
    // Arrange and Act
    EnumerationMappingParserGrammar.EnumNameContext actualEnumNameResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))))).enumName();

    // Assert
    assertEquals(-1, actualEnumNameResult.invokingState);
    assertEquals(1, actualEnumNameResult.children.size());
    assertNull(actualEnumNameResult.getParent());
    Token expectedStart = actualEnumNameResult.stop;
    Token start = actualEnumNameResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualEnumNameResult.getChildCount());
    assertSame(start, actualEnumNameResult.getStop());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    EnumerationMappingParserGrammar.IdentifierContext identifierResult = actualEnumNameResult.identifier();
    assertEquals(51, identifierResult.invokingState);
    assertEquals(1, identifierResult.children.size());
    assertEquals(1, start.getLine());
    assertEquals("Input", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertSame(start, identifierResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertEquals("Input", start.getText());
    RecognitionException recognitionException = identifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, identifierResult.getChildCount());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(20, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(identifierResult, recognitionException.getCtx());
  }

  @Test
  public void testEnumName4() throws RecognitionException {
    // Arrange and Act
    EnumerationMappingParserGrammar.EnumNameContext actualEnumNameResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).enumName();

    // Assert
    assertEquals(-1, actualEnumNameResult.invokingState);
    assertEquals(1, actualEnumNameResult.children.size());
    assertNull(actualEnumNameResult.getParent());
    Token expectedStart = actualEnumNameResult.start;
    Token start = actualEnumNameResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualEnumNameResult.getChildCount());
    assertNull(actualEnumNameResult.getStop());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    EnumerationMappingParserGrammar.IdentifierContext identifierResult = actualEnumNameResult.identifier();
    assertNull(identifierResult.getStop());
    assertFalse(identifierResult.isEmpty());
    assertEquals(2, identifierResult.depth());
    assertSame(start, identifierResult.getStart());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
  }

  @Test
  public void testEnumName5() throws RecognitionException {
    // Arrange
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.EnumNameContext actualEnumNameResult = enumerationMappingParserGrammar.enumName();

    // Assert
    assertEquals(-1, actualEnumNameResult.invokingState);
    assertEquals(1, actualEnumNameResult.children.size());
    assertNull(actualEnumNameResult.getParent());
    Token expectedStart = actualEnumNameResult.stop;
    Token start = actualEnumNameResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualEnumNameResult.getChildCount());
    assertSame(start, actualEnumNameResult.getStop());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    EnumerationMappingParserGrammar.IdentifierContext identifierResult = actualEnumNameResult.identifier();
    assertEquals(51, identifierResult.invokingState);
    assertEquals(1, identifierResult.children.size());
    assertEquals(1, start.getLine());
    assertEquals("Input", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertSame(start, identifierResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertEquals("Input", start.getText());
    RecognitionException recognitionException = identifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, identifierResult.getChildCount());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(20, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(identifierResult, recognitionException.getCtx());
  }

  @Test
  public void testEnumName6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.EnumNameContext actualEnumNameResult = enumerationMappingParserGrammar.enumName();

    // Assert
    assertEquals(-1, actualEnumNameResult.invokingState);
    assertEquals(1, actualEnumNameResult.children.size());
    assertNull(actualEnumNameResult.getParent());
    Token expectedStart = actualEnumNameResult.start;
    Token start = actualEnumNameResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualEnumNameResult.getChildCount());
    assertNull(actualEnumNameResult.getStop());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    EnumerationMappingParserGrammar.IdentifierContext identifierResult = actualEnumNameResult.identifier();
    assertEquals(51, identifierResult.invokingState);
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertNull(identifierResult.getStop());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testEnumNameContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.EnumNameContext enumNameContext = new EnumerationMappingParserGrammar.EnumNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(enumNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumNameContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.EnumNameContext enumNameContext = new EnumerationMappingParserGrammar.EnumNameContext(
        new ParserRuleContext(), 1);
    enumNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testEnumReference() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.EnumReferenceContext actualEnumReferenceResult = enumerationMappingParserGrammar
        .enumReference();

    // Assert
    RecognitionException recognitionException = actualEnumReferenceResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualEnumReferenceResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEnumReferenceResult.getParent());
    Token expectedStart = actualEnumReferenceResult.start;
    Token start = actualEnumReferenceResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEnumReferenceResult.identifier());
    assertNull(actualEnumReferenceResult.getStop());
    assertTrue(actualEnumReferenceResult.isEmpty());
    assertEquals("([] [58])", actualEnumReferenceResult.toStringTree());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(actualEnumReferenceResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(59, recognitionException.getOffendingState());
    assertEquals(-1, start.getStopIndex());
    assertNull(start.getInputStream());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("", ((BufferedTokenStream) inputStream).getText());
    assertEquals(1, tokenSource.getLine());
    assertEquals(58, ((EnumerationMappingParserGrammar.QualifiedNameContext) parseTreeList.get(0)).invokingState);
    assertTrue(((EnumerationMappingParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testEnumReferenceContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.EnumReferenceContext enumReferenceContext = new EnumerationMappingParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(enumReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumReferenceContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.EnumReferenceContext enumReferenceContext = new EnumerationMappingParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);
    enumReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumReferenceContextDOT() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).DOT());
  }

  @Test
  public void testEnumReferenceContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(6,
        (new EnumerationMappingParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testEnumReferenceContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testEnumReferenceContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testEnumSingleEntryMapping() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.EnumSingleEntryMappingContext actualEnumSingleEntryMappingResult = enumerationMappingParserGrammar
        .enumSingleEntryMapping();

    // Assert
    RecognitionException recognitionException = actualEnumSingleEntryMappingResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualEnumSingleEntryMappingResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEnumSingleEntryMappingResult.getParent());
    Token expectedStart = actualEnumSingleEntryMappingResult.start;
    Token start = actualEnumSingleEntryMappingResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEnumSingleEntryMappingResult.getStop());
    assertEquals("", actualEnumSingleEntryMappingResult.getText());
    assertEquals(1, actualEnumSingleEntryMappingResult.getChildCount());
    assertTrue(actualEnumSingleEntryMappingResult.isEmpty());
    assertEquals("([] ([34] [51 34]))", actualEnumSingleEntryMappingResult.toStringTree());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(35, recognitionException.getOffendingState());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertSame(actualEnumSingleEntryMappingResult, recognitionException.getCtx());
    assertEquals(0, tokenSource.getCharPositionInLine());
    assertEquals(0, inputStream.index());
    assertEquals("", ((BufferedTokenStream) inputStream).getText());
    assertEquals(34, ((EnumerationMappingParserGrammar.EnumNameContext) parseTreeList.get(0)).invokingState);
  }

  @Test
  public void testEnumSingleEntryMappingContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.EnumSingleEntryMappingContext enumSingleEntryMappingContext = new EnumerationMappingParserGrammar.EnumSingleEntryMappingContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(enumSingleEntryMappingContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumSingleEntryMappingContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.EnumSingleEntryMappingContext enumSingleEntryMappingContext = new EnumerationMappingParserGrammar.EnumSingleEntryMappingContext(
        new ParserRuleContext(), 1);
    enumSingleEntryMappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumSingleEntryMappingContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumSingleEntryMappingContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumSingleEntryMappingContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testEnumSingleEntryMappingContextEnumMultipleSourceValue() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumSingleEntryMappingContext(new ParserRuleContext(), 1))
        .enumMultipleSourceValue());
  }

  @Test
  public void testEnumSingleEntryMappingContextEnumName() {
    // Arrange, Act and Assert
    assertNull(
        (new EnumerationMappingParserGrammar.EnumSingleEntryMappingContext(new ParserRuleContext(), 1)).enumName());
  }

  @Test
  public void testEnumSingleEntryMappingContextEnumSourceValue() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumSingleEntryMappingContext(new ParserRuleContext(), 1))
        .enumSourceValue());
  }

  @Test
  public void testEnumSourceValue() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.EnumSourceValueContext actualEnumSourceValueResult = enumerationMappingParserGrammar
        .enumSourceValue();

    // Assert
    RecognitionException recognitionException = actualEnumSourceValueResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualEnumSourceValueResult.invokingState);
    assertNull(actualEnumSourceValueResult.getParent());
    Token expectedStart = actualEnumSourceValueResult.start;
    Token start = actualEnumSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEnumSourceValueResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(56, recognitionException.getOffendingState());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualEnumSourceValueResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testEnumSourceValue2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    EnumerationMappingParserGrammar.EnumSourceValueContext actualEnumSourceValueResult = enumerationMappingParserGrammar
        .enumSourceValue();

    // Assert
    assertEquals(-1, actualEnumSourceValueResult.invokingState);
    List<ParseTree> parseTreeList = actualEnumSourceValueResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEnumSourceValueResult.getParent());
    Token expectedStart = actualEnumSourceValueResult.stop;
    Token start = actualEnumSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEnumSourceValueResult.getStop());
    assertEquals(1, actualEnumSourceValueResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualEnumSourceValueResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testEnumSourceValue3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    EnumerationMappingParserGrammar.EnumSourceValueContext actualEnumSourceValueResult = enumerationMappingParserGrammar
        .enumSourceValue();

    // Assert
    assertEquals(-1, actualEnumSourceValueResult.invokingState);
    List<ParseTree> parseTreeList = actualEnumSourceValueResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEnumSourceValueResult.getParent());
    Token expectedStart = actualEnumSourceValueResult.stop;
    Token start = actualEnumSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEnumSourceValueResult.getStop());
    assertEquals(1, actualEnumSourceValueResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualEnumSourceValueResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testEnumSourceValue4() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    EnumerationMappingParserGrammar.EnumSourceValueContext actualEnumSourceValueResult = enumerationMappingParserGrammar
        .enumSourceValue();

    // Assert
    assertEquals(-1, actualEnumSourceValueResult.invokingState);
    List<ParseTree> parseTreeList = actualEnumSourceValueResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEnumSourceValueResult.getParent());
    Token expectedStart = actualEnumSourceValueResult.stop;
    Token start = actualEnumSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEnumSourceValueResult.getStop());
    assertEquals(1, actualEnumSourceValueResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualEnumSourceValueResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testEnumSourceValue5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    enumerationMappingParserGrammar.setBuildParseTree(true);

    // Act
    EnumerationMappingParserGrammar.EnumSourceValueContext actualEnumSourceValueResult = enumerationMappingParserGrammar
        .enumSourceValue();

    // Assert
    assertEquals(-1, actualEnumSourceValueResult.invokingState);
    List<ParseTree> parseTreeList = actualEnumSourceValueResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEnumSourceValueResult.getParent());
    Token expectedStart = actualEnumSourceValueResult.stop;
    Token start = actualEnumSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEnumSourceValueResult.getStop());
    assertEquals(1, actualEnumSourceValueResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualEnumSourceValueResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testEnumSourceValue6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.EnumSourceValueContext actualEnumSourceValueResult = enumerationMappingParserGrammar
        .enumSourceValue();

    // Assert
    assertEquals(-1, actualEnumSourceValueResult.invokingState);
    List<ParseTree> parseTreeList = actualEnumSourceValueResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEnumSourceValueResult.getParent());
    Token expectedStart = actualEnumSourceValueResult.stop;
    Token start = actualEnumSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEnumSourceValueResult.getStop());
    assertEquals(1, actualEnumSourceValueResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualEnumSourceValueResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testEnumSourceValue7() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CommonTokenStream commonTokenStream = new CommonTokenStream(listTokenSource);

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        commonTokenStream);
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.EnumSourceValueContext actualEnumSourceValueResult = enumerationMappingParserGrammar
        .enumSourceValue();

    // Assert
    RecognitionException recognitionException = actualEnumSourceValueResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualEnumSourceValueResult.invokingState);
    assertNull(actualEnumSourceValueResult.getParent());
    Token expectedStart = actualEnumSourceValueResult.start;
    Token start = actualEnumSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEnumSourceValueResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(56, recognitionException.getOffendingState());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(commonTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualEnumSourceValueResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testEnumSourceValue8() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setLine(2);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    enumerationMappingParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.EnumSourceValueContext actualEnumSourceValueResult = enumerationMappingParserGrammar
        .enumSourceValue();

    // Assert
    RecognitionException recognitionException = actualEnumSourceValueResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualEnumSourceValueResult.invokingState);
    assertNull(actualEnumSourceValueResult.getParent());
    Token expectedStart = actualEnumSourceValueResult.start;
    Token start = actualEnumSourceValueResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEnumSourceValueResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(56, recognitionException.getOffendingState());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualEnumSourceValueResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testEnumSourceValueContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.EnumSourceValueContext enumSourceValueContext = new EnumerationMappingParserGrammar.EnumSourceValueContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(enumSourceValueContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumSourceValueContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.EnumSourceValueContext enumSourceValueContext = new EnumerationMappingParserGrammar.EnumSourceValueContext(
        new ParserRuleContext(), 1);
    enumSourceValueContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumSourceValueContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumSourceValueContextEnumReference() {
    // Arrange, Act and Assert
    assertNull(
        (new EnumerationMappingParserGrammar.EnumSourceValueContext(new ParserRuleContext(), 1)).enumReference());
  }

  @Test
  public void testEnumSourceValueContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumSourceValueContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testEnumSourceValueContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumSourceValueContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testEnumerationMapping() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    EnumerationMappingParserGrammar.EnumerationMappingContext actualEnumerationMappingResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource))).enumerationMapping();

    // Assert
    assertEquals(-1, actualEnumerationMappingResult.invokingState);
    List<ParseTree> parseTreeList = actualEnumerationMappingResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEnumerationMappingResult.getParent());
    Token expectedStart = actualEnumerationMappingResult.stop;
    Token start = actualEnumerationMappingResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEnumerationMappingResult.getStop());
    assertEquals(1, actualEnumerationMappingResult.getChildCount());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(actualEnumerationMappingResult, getResult.getParent());
    assertEquals(0, tokenSource.getCharPositionInLine());
    assertEquals("EOF", getResult.getText());
  }

  @Test
  public void testEnumerationMapping2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    EnumerationMappingParserGrammar.EnumerationMappingContext actualEnumerationMappingResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource))).enumerationMapping();

    // Assert
    assertEquals(-1, actualEnumerationMappingResult.invokingState);
    List<ParseTree> parseTreeList = actualEnumerationMappingResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualEnumerationMappingResult.getParent());
    Token expectedStart = actualEnumerationMappingResult.start;
    Token start = actualEnumerationMappingResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualEnumerationMappingResult.stop;
    Token stop = actualEnumerationMappingResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullEOF", actualEnumerationMappingResult.getText());
    assertEquals(2, actualEnumerationMappingResult.getChildCount());
    assertEquals(0, stop.getLine());
    assertEquals(1, stop.getTokenIndex());
    assertEquals("EOF", stop.getText());
    assertNull(stop.getInputStream());
    assertEquals(0, stop.getCharPositionInLine());
    assertEquals(1, stop.getStartIndex());
    assertEquals(0, stop.getStopIndex());
    TokenSource tokenSource = stop.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, stop.getChannel());
    assertEquals(-1, stop.getType());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(1);
    assertEquals("<EOF>", getResult.toString());
    assertSame(actualEnumerationMappingResult, getResult.getParent());
    assertEquals(0, tokenSource.getLine());
  }

  @Test
  public void testEnumerationMapping3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.EnumerationMappingContext actualEnumerationMappingResult = enumerationMappingParserGrammar
        .enumerationMapping();

    // Assert
    RecognitionException recognitionException = actualEnumerationMappingResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(2, actualEnumerationMappingResult.children.size());
    assertNull(actualEnumerationMappingResult.getParent());
    Token expectedStart = actualEnumerationMappingResult.start;
    Token start = actualEnumerationMappingResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualEnumerationMappingResult.stop;
    Token stop = actualEnumerationMappingResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualEnumerationMappingResult.getText());
    assertEquals(2, actualEnumerationMappingResult.getChildCount());
    assertTrue(actualEnumerationMappingResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(30, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualEnumerationMappingResult, recognitionException.getCtx());
  }

  @Test
  public void testEnumerationMapping4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(6));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    EnumerationMappingParserGrammar.EnumerationMappingContext actualEnumerationMappingResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource))).enumerationMapping();

    // Assert
    assertEquals(-1, actualEnumerationMappingResult.invokingState);
    List<ParseTree> parseTreeList = actualEnumerationMappingResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualEnumerationMappingResult.getParent());
    Token expectedStart = actualEnumerationMappingResult.start;
    Token start = actualEnumerationMappingResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualEnumerationMappingResult.stop;
    Token stop = actualEnumerationMappingResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullEOF", actualEnumerationMappingResult.getText());
    assertEquals(2, actualEnumerationMappingResult.getChildCount());
    assertEquals(0, stop.getLine());
    assertEquals(1, stop.getTokenIndex());
    assertEquals("EOF", stop.getText());
    assertNull(stop.getInputStream());
    assertEquals(0, stop.getCharPositionInLine());
    assertEquals(1, stop.getStartIndex());
    assertEquals(0, stop.getStopIndex());
    TokenSource tokenSource = stop.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, stop.getChannel());
    assertEquals(-1, stop.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
    ParseTree getResult = parseTreeList.get(1);
    assertEquals("<EOF>", getResult.toString());
    assertTrue(((EnumerationMappingParserGrammar.EnumSingleEntryMappingContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(22,
        ((EnumerationMappingParserGrammar.EnumSingleEntryMappingContext) parseTreeList.get(0)).invokingState);
    assertSame(actualEnumerationMappingResult, getResult.getParent());
  }

  @Test
  public void testEnumerationMapping5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(50));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    EnumerationMappingParserGrammar.EnumerationMappingContext actualEnumerationMappingResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource))).enumerationMapping();

    // Assert
    assertEquals(-1, actualEnumerationMappingResult.invokingState);
    List<ParseTree> parseTreeList = actualEnumerationMappingResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualEnumerationMappingResult.getParent());
    Token expectedStart = actualEnumerationMappingResult.start;
    Token start = actualEnumerationMappingResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualEnumerationMappingResult.stop;
    Token stop = actualEnumerationMappingResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullEOF", actualEnumerationMappingResult.getText());
    assertEquals(2, actualEnumerationMappingResult.getChildCount());
    assertEquals(0, stop.getLine());
    assertEquals(1, stop.getTokenIndex());
    assertEquals("EOF", stop.getText());
    assertNull(stop.getInputStream());
    assertEquals(0, stop.getCharPositionInLine());
    assertEquals(1, stop.getStartIndex());
    assertEquals(0, stop.getStopIndex());
    TokenSource tokenSource = stop.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, stop.getChannel());
    assertEquals(-1, stop.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
    ParseTree getResult = parseTreeList.get(1);
    assertEquals("<EOF>", getResult.toString());
    assertTrue(((EnumerationMappingParserGrammar.EnumSingleEntryMappingContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(22,
        ((EnumerationMappingParserGrammar.EnumSingleEntryMappingContext) parseTreeList.get(0)).invokingState);
    assertSame(actualEnumerationMappingResult, getResult.getParent());
  }

  @Test
  public void testEnumerationMappingContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.EnumerationMappingContext enumerationMappingContext = new EnumerationMappingParserGrammar.EnumerationMappingContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(enumerationMappingContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumerationMappingContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.EnumerationMappingContext enumerationMappingContext = new EnumerationMappingParserGrammar.EnumerationMappingContext(
        new ParserRuleContext(), 1);
    enumerationMappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumerationMappingContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumerationMappingContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new EnumerationMappingParserGrammar.EnumerationMappingContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new EnumerationMappingParserGrammar.EnumerationMappingContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testEnumerationMappingContextEOF() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.EnumerationMappingContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testEnumerationMappingContextEnumSingleEntryMapping() {
    // Arrange, Act and Assert
    assertTrue((new EnumerationMappingParserGrammar.EnumerationMappingContext(new ParserRuleContext(), 1))
        .enumSingleEntryMapping()
        .isEmpty());
    assertNull((new EnumerationMappingParserGrammar.EnumerationMappingContext(new ParserRuleContext(), 1))
        .enumSingleEntryMapping(1));
  }

  @Test
  public void testIdentifier() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    EnumerationMappingParserGrammar.IdentifierContext actualIdentifierResult = enumerationMappingParserGrammar
        .identifier();

    // Assert
    assertEquals(-1, actualIdentifierResult.invokingState);
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = actualIdentifierResult.start;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualIdentifierResult.getStop());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, tokenSource.getLine());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testIdentifier2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.IdentifierContext actualIdentifierResult = enumerationMappingParserGrammar
        .identifier();

    // Assert
    RecognitionException recognitionException = actualIdentifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualIdentifierResult.children.size());
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = actualIdentifierResult.stop;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualIdentifierResult.getStop());
    assertEquals("null", actualIdentifierResult.getText());
    assertEquals(1, actualIdentifierResult.getChildCount());
    assertTrue(actualIdentifierResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(20, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualIdentifierResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testIdentifier3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.IdentifierContext actualIdentifierResult = enumerationMappingParserGrammar
        .identifier();

    // Assert
    RecognitionException recognitionException = actualIdentifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualIdentifierResult.children.size());
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = actualIdentifierResult.stop;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualIdentifierResult.getStop());
    assertEquals("Input", actualIdentifierResult.getText());
    assertEquals(1, actualIdentifierResult.getChildCount());
    assertTrue(actualIdentifierResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(20, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualIdentifierResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testIdentifier4() throws RecognitionException {
    // Arrange and Act
    EnumerationMappingParserGrammar.IdentifierContext actualIdentifierResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).identifier();

    // Assert
    assertEquals(-1, actualIdentifierResult.invokingState);
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = actualIdentifierResult.start;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualIdentifierResult.getStop());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getTokenIndex());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getChannel());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
  }

  @Test
  public void testIdentifier5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.IdentifierContext actualIdentifierResult = enumerationMappingParserGrammar
        .identifier();

    // Assert
    RecognitionException recognitionException = actualIdentifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualIdentifierResult.children.size());
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = actualIdentifierResult.stop;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualIdentifierResult.getStop());
    assertEquals("Input", actualIdentifierResult.getText());
    assertEquals(1, actualIdentifierResult.getChildCount());
    assertTrue(actualIdentifierResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(20, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualIdentifierResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testIdentifier6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.IdentifierContext actualIdentifierResult = enumerationMappingParserGrammar
        .identifier();

    // Assert
    assertEquals(-1, actualIdentifierResult.invokingState);
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = actualIdentifierResult.start;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualIdentifierResult.getStop());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, tokenSource.getLine());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testIdentifierContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.IdentifierContext identifierContext = new EnumerationMappingParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.IdentifierContext identifierContext = new EnumerationMappingParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testIdentifierContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testPackagePath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    EnumerationMappingParserGrammar.PackagePathContext actualPackagePathResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualPackagePathResult.getParent());
    Token expectedStart = actualPackagePathResult.start;
    Token start = actualPackagePathResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPackagePathResult.getStop());
    assertEquals(1, actualPackagePathResult.getChildCount());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertNull(start.getInputStream());
    assertEquals("EOF", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, ((EnumerationMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((EnumerationMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((EnumerationMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((EnumerationMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePath2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    EnumerationMappingParserGrammar.PackagePathContext actualPackagePathResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualPackagePathResult.getParent());
    Token expectedStart = actualPackagePathResult.stop;
    Token start = actualPackagePathResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualPackagePathResult.getStop());
    assertEquals(1, actualPackagePathResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((EnumerationMappingParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((EnumerationMappingParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(20, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath3() throws RecognitionException {
    // Arrange and Act
    EnumerationMappingParserGrammar.PackagePathContext actualPackagePathResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualPackagePathResult.getParent());
    Token expectedStart = actualPackagePathResult.stop;
    Token start = actualPackagePathResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualPackagePathResult.getStop());
    assertEquals(1, actualPackagePathResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    assertEquals("Input", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("Input", getResult.getText());
    assertSame(start, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((EnumerationMappingParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((EnumerationMappingParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(20, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath4() throws RecognitionException {
    // Arrange and Act
    EnumerationMappingParserGrammar.PackagePathContext actualPackagePathResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("([] [69])", actualPackagePathResult.toStringTree());
    assertNull(actualPackagePathResult.getParent());
    Token expectedStart = actualPackagePathResult.start;
    Token start = actualPackagePathResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPackagePathResult.getStop());
    assertEquals(1, actualPackagePathResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(69, ((EnumerationMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testPackagePath5() throws RecognitionException {
    // Arrange
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.PackagePathContext actualPackagePathResult = enumerationMappingParserGrammar
        .packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualPackagePathResult.getParent());
    Token expectedStart = actualPackagePathResult.stop;
    Token start = actualPackagePathResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualPackagePathResult.getStop());
    assertEquals(1, actualPackagePathResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    assertEquals("Input", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("Input", getResult.getText());
    assertSame(start, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((EnumerationMappingParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((EnumerationMappingParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((EnumerationMappingParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(20, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.PackagePathContext actualPackagePathResult = enumerationMappingParserGrammar
        .packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualPackagePathResult.getParent());
    Token expectedStart = actualPackagePathResult.start;
    Token start = actualPackagePathResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPackagePathResult.getStop());
    assertEquals(1, actualPackagePathResult.getChildCount());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertNull(start.getInputStream());
    assertEquals("EOF", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, ((EnumerationMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((EnumerationMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((EnumerationMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((EnumerationMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePathContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.PackagePathContext packagePathContext = new EnumerationMappingParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.PackagePathContext packagePathContext = new EnumerationMappingParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(8,
        (new EnumerationMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPackagePathContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue(
        (new EnumerationMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new EnumerationMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPackagePathContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertTrue((new EnumerationMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR()
        .isEmpty());
    assertNull((new EnumerationMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR(1));
  }

  @Test
  public void testQualifiedName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.QualifiedNameContext actualQualifiedNameResult = enumerationMappingParserGrammar
        .qualifiedName();

    // Assert
    RecognitionException recognitionException = actualQualifiedNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertNull(actualQualifiedNameResult.getParent());
    Token expectedStart = actualQualifiedNameResult.start;
    Token start = actualQualifiedNameResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualQualifiedNameResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(65, recognitionException.getOffendingState());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualQualifiedNameResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testQualifiedName2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.QualifiedNameContext actualQualifiedNameResult = enumerationMappingParserGrammar
        .qualifiedName();

    // Assert
    RecognitionException recognitionException = actualQualifiedNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    Token expectedStart = actualQualifiedNameResult.stop;
    Token start = actualQualifiedNameResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualQualifiedNameResult.identifier());
    assertSame(start, actualQualifiedNameResult.getStop());
    assertEquals("null", actualQualifiedNameResult.getText());
    assertTrue(actualQualifiedNameResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(65, recognitionException.getOffendingState());
    assertSame(actualQualifiedNameResult, recognitionException.getCtx());
    assertEquals(0, start.getTokenIndex());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(1, inputStream.index());
    assertEquals("List", inputStream.getSourceName());
  }

  @Test
  public void testQualifiedNameContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.QualifiedNameContext qualifiedNameContext = new EnumerationMappingParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.QualifiedNameContext qualifiedNameContext = new EnumerationMappingParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(7,
        (new EnumerationMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testQualifiedNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testQualifiedNameContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testQualifiedNameContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testWord() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = enumerationMappingParserGrammar.word();

    // Assert
    RecognitionException recognitionException = actualWordResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualWordResult.invokingState);
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.start;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(80, recognitionException.getOffendingState());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualWordResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testWord10() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CommonTokenStream commonTokenStream = new CommonTokenStream(listTokenSource);

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        commonTokenStream);
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = enumerationMappingParserGrammar.word();

    // Assert
    RecognitionException recognitionException = actualWordResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualWordResult.invokingState);
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.start;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(80, recognitionException.getOffendingState());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(commonTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualWordResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testWord11() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setLine(2);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    enumerationMappingParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = enumerationMappingParserGrammar.word();

    // Assert
    RecognitionException recognitionException = actualWordResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualWordResult.invokingState);
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.start;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(80, recognitionException.getOffendingState());
    assertSame(enumerationMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualWordResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testWord2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = enumerationMappingParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.identifier());
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testWord3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(6));

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.children.size());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualWordResult.getChildCount());
    assertSame(start, actualWordResult.getStop());
    EnumerationMappingParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertEquals(77, identifierResult.invokingState);
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testWord4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(7));
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = enumerationMappingParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.identifier());
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testWord5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(50));

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = (new EnumerationMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.children.size());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualWordResult.getChildCount());
    assertSame(start, actualWordResult.getStop());
    EnumerationMappingParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertEquals(77, identifierResult.invokingState);
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testWord6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = enumerationMappingParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.identifier());
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testWord7() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = enumerationMappingParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.identifier());
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testWord8() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    enumerationMappingParserGrammar.setBuildParseTree(true);

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = enumerationMappingParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.identifier());
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testWord9() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    EnumerationMappingParserGrammar enumerationMappingParserGrammar = new EnumerationMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    enumerationMappingParserGrammar.setTrace(true);

    // Act
    EnumerationMappingParserGrammar.WordContext actualWordResult = enumerationMappingParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.identifier());
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(enumerationMappingParserGrammar.getRuleContext());
    assertEquals(-1, enumerationMappingParserGrammar.getState());
  }

  @Test
  public void testWordContextAccept() {
    // Arrange
    EnumerationMappingParserGrammar.WordContext wordContext = new EnumerationMappingParserGrammar.WordContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextAccept2() {
    // Arrange
    EnumerationMappingParserGrammar.WordContext wordContext = new EnumerationMappingParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.WordContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testWordContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(9, (new EnumerationMappingParserGrammar.WordContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testWordContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.WordContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testWordContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new EnumerationMappingParserGrammar.WordContext(new ParserRuleContext(), 1)).identifier());
  }
}

