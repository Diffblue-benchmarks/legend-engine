package org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.operationClassMapping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonToken;
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
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPathLexer;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.CodeParserGrammarBaseVisitor;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.ConnectionLexerGrammar;
import org.junit.Test;

public class OperationClassMappingParserGrammarDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    OperationClassMappingParserGrammar actualOperationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(new ArrayList<Token>())));

    // Assert
    assertNull(actualOperationClassMappingParserGrammar.getParseInfo());
    assertEquals(0, actualOperationClassMappingParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualOperationClassMappingParserGrammar.isMatchedEOF());
    assertNull(actualOperationClassMappingParserGrammar.getContext());
    assertTrue(actualOperationClassMappingParserGrammar
        .getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualOperationClassMappingParserGrammar.getPrecedence());
    assertEquals("List", actualOperationClassMappingParserGrammar.getSourceName());
    assertFalse(actualOperationClassMappingParserGrammar.isTrace());
    assertTrue(actualOperationClassMappingParserGrammar.getBuildParseTree());
    assertEquals(-1, actualOperationClassMappingParserGrammar.getState());
    assertTrue(actualOperationClassMappingParserGrammar
        .getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualOperationClassMappingParserGrammar.getInterpreter();
    assertEquals(6, interpreter.decisionToDFA.length);
    assertSame(actualOperationClassMappingParserGrammar, interpreter.getParser());
    assertSame(actualOperationClassMappingParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualOperationClassMappingParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    OperationClassMappingParserGrammar actualOperationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Assert
    assertNull(actualOperationClassMappingParserGrammar.getParseInfo());
    assertEquals(0, actualOperationClassMappingParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualOperationClassMappingParserGrammar.isMatchedEOF());
    assertNull(actualOperationClassMappingParserGrammar.getContext());
    assertTrue(actualOperationClassMappingParserGrammar
        .getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualOperationClassMappingParserGrammar.getPrecedence());
    assertEquals("List", actualOperationClassMappingParserGrammar.getSourceName());
    assertFalse(actualOperationClassMappingParserGrammar.isTrace());
    assertTrue(actualOperationClassMappingParserGrammar.getBuildParseTree());
    assertEquals(-1, actualOperationClassMappingParserGrammar.getState());
    assertTrue(actualOperationClassMappingParserGrammar
        .getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualOperationClassMappingParserGrammar.getInterpreter();
    assertEquals(6, interpreter.decisionToDFA.length);
    assertSame(actualOperationClassMappingParserGrammar, interpreter.getParser());
    assertSame(actualOperationClassMappingParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualOperationClassMappingParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testFunctionPath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    OperationClassMappingParserGrammar.FunctionPathContext actualFunctionPathResult = (new OperationClassMappingParserGrammar(
        new BufferedTokenStream(listTokenSource))).functionPath();

    // Assert
    assertEquals(-1, actualFunctionPathResult.invokingState);
    List<ParseTree> parseTreeList = actualFunctionPathResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualFunctionPathResult.getParent());
    Token expectedStart = actualFunctionPathResult.start;
    Token start = actualFunctionPathResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFunctionPathResult.getStop());
    assertEquals(1, actualFunctionPathResult.getChildCount());
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
    assertSame(start, ((OperationClassMappingParserGrammar.QualifiedNameContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((OperationClassMappingParserGrammar.QualifiedNameContext) parseTreeList.get(0)).depth());
    assertFalse(((OperationClassMappingParserGrammar.QualifiedNameContext) parseTreeList.get(0)).isEmpty());
    assertNull(((OperationClassMappingParserGrammar.QualifiedNameContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    RecognitionException recognitionException = ((OperationClassMappingParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertSame(parseTreeList.get(0), recognitionException.getCtx());
  }

  @Test
  public void testFunctionPathContextAccept() {
    // Arrange
    OperationClassMappingParserGrammar.FunctionPathContext functionPathContext = new OperationClassMappingParserGrammar.FunctionPathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(functionPathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionPathContextAccept2() {
    // Arrange
    OperationClassMappingParserGrammar.FunctionPathContext functionPathContext = new OperationClassMappingParserGrammar.FunctionPathContext(
        new ParserRuleContext(), 1);
    functionPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(functionPathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionPathContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull(
        (new OperationClassMappingParserGrammar.FunctionPathContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testIdentifier() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    OperationClassMappingParserGrammar.IdentifierContext actualIdentifierResult = operationClassMappingParserGrammar
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
    assertNull(operationClassMappingParserGrammar.getRuleContext());
    assertEquals(-1, operationClassMappingParserGrammar.getState());
  }

  @Test
  public void testIdentifier2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        bufferedTokenStream);

    // Act
    OperationClassMappingParserGrammar.IdentifierContext actualIdentifierResult = operationClassMappingParserGrammar
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
    assertSame(operationClassMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(14, recognitionException.getOffendingState());
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
    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        bufferedTokenStream);

    // Act
    OperationClassMappingParserGrammar.IdentifierContext actualIdentifierResult = operationClassMappingParserGrammar
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
    assertSame(operationClassMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(14, recognitionException.getOffendingState());
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
    OperationClassMappingParserGrammar.IdentifierContext actualIdentifierResult = (new OperationClassMappingParserGrammar(
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

    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        bufferedTokenStream);
    operationClassMappingParserGrammar.setTrace(true);

    // Act
    OperationClassMappingParserGrammar.IdentifierContext actualIdentifierResult = operationClassMappingParserGrammar
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
    assertSame(operationClassMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(14, recognitionException.getOffendingState());
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

    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    operationClassMappingParserGrammar.setTrace(true);

    // Act
    OperationClassMappingParserGrammar.IdentifierContext actualIdentifierResult = operationClassMappingParserGrammar
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
    assertNull(operationClassMappingParserGrammar.getRuleContext());
    assertEquals(-1, operationClassMappingParserGrammar.getState());
  }

  @Test
  public void testIdentifierContextAccept() {
    // Arrange
    OperationClassMappingParserGrammar.IdentifierContext identifierContext = new OperationClassMappingParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextAccept2() {
    // Arrange
    OperationClassMappingParserGrammar.IdentifierContext identifierContext = new OperationClassMappingParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testIdentifierContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testOperationClassMapping() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    OperationClassMappingParserGrammar.OperationClassMappingContext actualOperationClassMappingResult = (new OperationClassMappingParserGrammar(
        new BufferedTokenStream(listTokenSource))).operationClassMapping();

    // Assert
    assertEquals(-1, actualOperationClassMappingResult.invokingState);
    List<ParseTree> parseTreeList = actualOperationClassMappingResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] ([16] [36 16]) [17] EOF)", actualOperationClassMappingResult.toStringTree());
    assertNull(actualOperationClassMappingResult.getParent());
    Token token = actualOperationClassMappingResult.stop;
    Token start = actualOperationClassMappingResult.getStart();
    assertSame(token, start);
    assertSame(token, actualOperationClassMappingResult.getStop());
    assertEquals(3, actualOperationClassMappingResult.getChildCount());
    assertEquals("EOF", actualOperationClassMappingResult.getText());
    OperationClassMappingParserGrammar.ParametersContext parametersResult = actualOperationClassMappingResult
        .parameters();
    assertSame(start, parametersResult.getStart());
    assertEquals(2, parametersResult.depth());
    assertFalse(parametersResult.isEmpty());
    assertNull(parametersResult.getStop());
    RecognitionException recognitionException = parametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, start.getType());
    assertEquals(0, start.getChannel());
    assertSame(listTokenSource, start.getTokenSource());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(-1, start.getStartIndex());
    assertEquals(16, ((OperationClassMappingParserGrammar.FunctionPathContext) parseTreeList.get(0)).invokingState);
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(23, recognitionException.getOffendingState());
    assertSame(parametersResult, recognitionException.getCtx());
  }

  @Test
  public void testOperationClassMappingContextAccept() {
    // Arrange
    OperationClassMappingParserGrammar.OperationClassMappingContext operationClassMappingContext = new OperationClassMappingParserGrammar.OperationClassMappingContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(operationClassMappingContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testOperationClassMappingContextAccept2() {
    // Arrange
    OperationClassMappingParserGrammar.OperationClassMappingContext operationClassMappingContext = new OperationClassMappingParserGrammar.OperationClassMappingContext(
        new ParserRuleContext(), 1);
    operationClassMappingContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(operationClassMappingContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testOperationClassMappingContextEOF() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.OperationClassMappingContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testOperationClassMappingContextFunctionPath() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.OperationClassMappingContext(new ParserRuleContext(), 1))
        .functionPath());
  }

  @Test
  public void testOperationClassMappingContextParameters() {
    // Arrange, Act and Assert
    assertNull(
        (new OperationClassMappingParserGrammar.OperationClassMappingContext(new ParserRuleContext(), 1)).parameters());
  }

  @Test
  public void testOperationClassMappingContextSEMI_COLON() {
    // Arrange, Act and Assert
    assertNull(
        (new OperationClassMappingParserGrammar.OperationClassMappingContext(new ParserRuleContext(), 1)).SEMI_COLON());
  }

  @Test
  public void testPackagePath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    OperationClassMappingParserGrammar.PackagePathContext actualPackagePathResult = (new OperationClassMappingParserGrammar(
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
    assertSame(start, ((OperationClassMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((OperationClassMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((OperationClassMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((OperationClassMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePath2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    OperationClassMappingParserGrammar.PackagePathContext actualPackagePathResult = (new OperationClassMappingParserGrammar(
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
    assertSame(start, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((OperationClassMappingParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((OperationClassMappingParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(14, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath3() throws RecognitionException {
    // Arrange and Act
    OperationClassMappingParserGrammar.PackagePathContext actualPackagePathResult = (new OperationClassMappingParserGrammar(
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
    assertSame(start, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((OperationClassMappingParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((OperationClassMappingParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(14, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath4() throws RecognitionException {
    // Arrange and Act
    OperationClassMappingParserGrammar.PackagePathContext actualPackagePathResult = (new OperationClassMappingParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("([] [45])", actualPackagePathResult.toStringTree());
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
    assertEquals(45, ((OperationClassMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testPackagePath5() throws RecognitionException {
    // Arrange
    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    operationClassMappingParserGrammar.setTrace(true);

    // Act
    OperationClassMappingParserGrammar.PackagePathContext actualPackagePathResult = operationClassMappingParserGrammar
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
    assertSame(start, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((OperationClassMappingParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((OperationClassMappingParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((OperationClassMappingParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(14, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        new BufferedTokenStream(listTokenSource));
    operationClassMappingParserGrammar.setTrace(true);

    // Act
    OperationClassMappingParserGrammar.PackagePathContext actualPackagePathResult = operationClassMappingParserGrammar
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
    assertSame(start, ((OperationClassMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((OperationClassMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((OperationClassMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((OperationClassMappingParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePathContextAccept() {
    // Arrange
    OperationClassMappingParserGrammar.PackagePathContext packagePathContext = new OperationClassMappingParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextAccept2() {
    // Arrange
    OperationClassMappingParserGrammar.PackagePathContext packagePathContext = new OperationClassMappingParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue(
        (new OperationClassMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new OperationClassMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPackagePathContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertTrue((new OperationClassMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR()
        .isEmpty());
    assertNull(
        (new OperationClassMappingParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR(1));
  }

  @Test
  public void testParameters() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        bufferedTokenStream);

    // Act
    OperationClassMappingParserGrammar.ParametersContext actualParametersResult = operationClassMappingParserGrammar
        .parameters();

    // Assert
    RecognitionException recognitionException = actualParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualParametersResult.invokingState);
    assertNull(actualParametersResult.getParent());
    Token expectedStart = actualParametersResult.start;
    Token start = actualParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualParametersResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(23, recognitionException.getOffendingState());
    assertSame(operationClassMappingParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualParametersResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testParametersContextAccept() {
    // Arrange
    OperationClassMappingParserGrammar.ParametersContext parametersContext = new OperationClassMappingParserGrammar.ParametersContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(parametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testParametersContextAccept2() {
    // Arrange
    OperationClassMappingParserGrammar.ParametersContext parametersContext = new OperationClassMappingParserGrammar.ParametersContext(
        new ParserRuleContext(), 1);
    parametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(parametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testParametersContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new OperationClassMappingParserGrammar.ParametersContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new OperationClassMappingParserGrammar.ParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testParametersContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue(
        (new OperationClassMappingParserGrammar.ParametersContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new OperationClassMappingParserGrammar.ParametersContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testParametersContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.ParametersContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testParametersContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.ParametersContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testQualifiedName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        bufferedTokenStream);

    // Act
    OperationClassMappingParserGrammar.QualifiedNameContext actualQualifiedNameResult = operationClassMappingParserGrammar
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
    assertEquals(41, recognitionException.getOffendingState());
    assertSame(operationClassMappingParserGrammar, recognitionException.getRecognizer());
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
    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        bufferedTokenStream);

    // Act
    OperationClassMappingParserGrammar.QualifiedNameContext actualQualifiedNameResult = operationClassMappingParserGrammar
        .qualifiedName();

    // Assert
    RecognitionException recognitionException = actualQualifiedNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    assertNull(actualQualifiedNameResult.identifier());
    Token token = actualQualifiedNameResult.stop;
    Token start = actualQualifiedNameResult.getStart();
    assertSame(token, start);
    assertSame(token, actualQualifiedNameResult.getStop());
    assertTrue(actualQualifiedNameResult.isEmpty());
    assertEquals("null", actualQualifiedNameResult.getText());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(operationClassMappingParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(41, recognitionException.getOffendingState());
    assertSame(actualQualifiedNameResult, recognitionException.getCtx());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(1, inputStream.index());
    assertEquals("List", inputStream.getSourceName());
  }

  @Test
  public void testQualifiedNameContextAccept() {
    // Arrange
    OperationClassMappingParserGrammar.QualifiedNameContext qualifiedNameContext = new OperationClassMappingParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextAccept2() {
    // Arrange
    OperationClassMappingParserGrammar.QualifiedNameContext qualifiedNameContext = new OperationClassMappingParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testQualifiedNameContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull(
        (new OperationClassMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testQualifiedNameContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testWord() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    OperationClassMappingParserGrammar operationClassMappingParserGrammar = new OperationClassMappingParserGrammar(
        bufferedTokenStream);

    // Act
    OperationClassMappingParserGrammar.WordContext actualWordResult = operationClassMappingParserGrammar.word();

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
    assertEquals(56, recognitionException.getOffendingState());
    assertSame(operationClassMappingParserGrammar, recognitionException.getRecognizer());
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
  public void testWordContextAccept() {
    // Arrange
    OperationClassMappingParserGrammar.WordContext wordContext = new OperationClassMappingParserGrammar.WordContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextAccept2() {
    // Arrange
    OperationClassMappingParserGrammar.WordContext wordContext = new OperationClassMappingParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.WordContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testWordContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(6, (new OperationClassMappingParserGrammar.WordContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testWordContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.WordContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testWordContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new OperationClassMappingParserGrammar.WordContext(new ParserRuleContext(), 1)).identifier());
  }
}

