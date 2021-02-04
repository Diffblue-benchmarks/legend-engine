package org.finos.legend.engine.language.pure.grammar.from.antlr4.navigation;

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
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPathLexer;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.CodeLexerGrammar;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.CodeParserGrammarBaseVisitor;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.ConnectionLexerGrammar;
import org.junit.Test;

public class NavigationParserGrammarDiffblueTest {
  @Test
  public void testAtomic() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    NavigationParserGrammar.AtomicContext actualAtomicResult = navigationParserGrammar.atomic();

    // Assert
    assertEquals(-1, actualAtomicResult.invokingState);
    assertNull(actualAtomicResult.getParent());
    Token expectedStart = actualAtomicResult.start;
    Token start = actualAtomicResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAtomicResult.getStop());
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
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testAtomic2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    NavigationParserGrammar.AtomicContext actualAtomicResult = navigationParserGrammar.atomic();

    // Assert
    assertEquals(-1, actualAtomicResult.invokingState);
    List<ParseTree> parseTreeList = actualAtomicResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualAtomicResult.getParent());
    Token expectedStart = actualAtomicResult.stop;
    Token start = actualAtomicResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAtomicResult.getStop());
    assertEquals(1, actualAtomicResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualAtomicResult, getResult.getParent());
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testAtomic3() throws RecognitionException {
    // Arrange
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));

    // Act
    NavigationParserGrammar.AtomicContext actualAtomicResult = navigationParserGrammar.atomic();

    // Assert
    assertEquals(-1, actualAtomicResult.invokingState);
    List<ParseTree> parseTreeList = actualAtomicResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualAtomicResult.getParent());
    Token expectedStart = actualAtomicResult.stop;
    Token start = actualAtomicResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAtomicResult.getStop());
    assertEquals(1, actualAtomicResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    assertEquals("Input", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("Input", getResult.getText());
    assertSame(actualAtomicResult, getResult.getParent());
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testAtomic4() throws RecognitionException {
    // Arrange and Act
    NavigationParserGrammar.AtomicContext actualAtomicResult = (new NavigationParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).atomic();

    // Assert
    assertEquals(-1, actualAtomicResult.invokingState);
    assertNull(actualAtomicResult.getParent());
    Token expectedStart = actualAtomicResult.start;
    Token start = actualAtomicResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAtomicResult.getStop());
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
  public void testAtomic5() throws RecognitionException {
    // Arrange
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.AtomicContext actualAtomicResult = navigationParserGrammar.atomic();

    // Assert
    assertEquals(-1, actualAtomicResult.invokingState);
    List<ParseTree> parseTreeList = actualAtomicResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualAtomicResult.getParent());
    Token expectedStart = actualAtomicResult.stop;
    Token start = actualAtomicResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAtomicResult.getStop());
    assertEquals(1, actualAtomicResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    assertEquals("Input", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("Input", getResult.getText());
    assertSame(actualAtomicResult, getResult.getParent());
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testAtomicContextAccept() {
    // Arrange
    NavigationParserGrammar.AtomicContext atomicContext = new NavigationParserGrammar.AtomicContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(atomicContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAtomicContextAccept2() {
    // Arrange
    NavigationParserGrammar.AtomicContext atomicContext = new NavigationParserGrammar.AtomicContext(
        new ParserRuleContext(), 1);
    atomicContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(atomicContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAtomicContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.AtomicContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testAtomicContextDATE() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.AtomicContext(new ParserRuleContext(), 1)).DATE());
  }

  @Test
  public void testAtomicContextFLOAT() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.AtomicContext(new ParserRuleContext(), 1)).FLOAT());
  }

  @Test
  public void testAtomicContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(7, (new NavigationParserGrammar.AtomicContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testAtomicContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.AtomicContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testAtomicContextLATEST_DATE() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.AtomicContext(new ParserRuleContext(), 1)).LATEST_DATE());
  }

  @Test
  public void testAtomicContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.AtomicContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testCollection() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.CollectionContext actualCollectionResult = navigationParserGrammar.collection();

    // Assert
    RecognitionException recognitionException = actualCollectionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualCollectionResult.invokingState);
    assertNull(actualCollectionResult.getParent());
    Token expectedStart = actualCollectionResult.start;
    Token start = actualCollectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualCollectionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(63, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualCollectionResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testCollection2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.CollectionContext actualCollectionResult = navigationParserGrammar.collection();

    // Assert
    RecognitionException recognitionException = actualCollectionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualCollectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualCollectionResult.getParent());
    Token expectedStart = actualCollectionResult.stop;
    Token start = actualCollectionResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(2, actualCollectionResult.getChildCount());
    assertSame(start, actualCollectionResult.getStop());
    assertEquals("<missing '['><EOF>", actualCollectionResult.getText());
    assertTrue(actualCollectionResult.isEmpty());
    assertEquals("([] <missing '['> ([64] ([76 64] <EOF>)))", actualCollectionResult.toStringTree());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(0, start.getTokenIndex());
    assertSame(actualCollectionResult, recognitionException.getCtx());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(69, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(actualCollectionResult, getResult.getParent());
    assertEquals("<missing '['>", getResult.toString());
    assertEquals(64, ((NavigationParserGrammar.ScalarContext) parseTreeList.get(1)).invokingState);
    assertEquals("<missing '['>", getResult.getText());
  }

  @Test
  public void testCollectionContextAccept() {
    // Arrange
    NavigationParserGrammar.CollectionContext collectionContext = new NavigationParserGrammar.CollectionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(collectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCollectionContextAccept2() {
    // Arrange
    NavigationParserGrammar.CollectionContext collectionContext = new NavigationParserGrammar.CollectionContext(
        new ParserRuleContext(), 1);
    collectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(collectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCollectionContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.CollectionContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testCollectionContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.CollectionContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testCollectionContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new NavigationParserGrammar.CollectionContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new NavigationParserGrammar.CollectionContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testCollectionContextScalar() {
    // Arrange, Act and Assert
    assertTrue((new NavigationParserGrammar.CollectionContext(new ParserRuleContext(), 1)).scalar().isEmpty());
    assertNull((new NavigationParserGrammar.CollectionContext(new ParserRuleContext(), 1)).scalar(1));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    NavigationParserGrammar actualNavigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(new ListTokenSource(new ArrayList<Token>())));

    // Assert
    assertNull(actualNavigationParserGrammar.getParseInfo());
    assertEquals(0, actualNavigationParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualNavigationParserGrammar.isMatchedEOF());
    assertNull(actualNavigationParserGrammar.getContext());
    assertTrue(actualNavigationParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualNavigationParserGrammar.getPrecedence());
    assertEquals("List", actualNavigationParserGrammar.getSourceName());
    assertFalse(actualNavigationParserGrammar.isTrace());
    assertTrue(actualNavigationParserGrammar.getBuildParseTree());
    assertEquals(-1, actualNavigationParserGrammar.getState());
    assertTrue(
        actualNavigationParserGrammar.getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualNavigationParserGrammar.getInterpreter();
    assertEquals(14, interpreter.decisionToDFA.length);
    assertSame(actualNavigationParserGrammar, interpreter.getParser());
    assertSame(actualNavigationParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualNavigationParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    NavigationParserGrammar actualNavigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Assert
    assertNull(actualNavigationParserGrammar.getParseInfo());
    assertEquals(0, actualNavigationParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualNavigationParserGrammar.isMatchedEOF());
    assertNull(actualNavigationParserGrammar.getContext());
    assertTrue(actualNavigationParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualNavigationParserGrammar.getPrecedence());
    assertEquals("List", actualNavigationParserGrammar.getSourceName());
    assertFalse(actualNavigationParserGrammar.isTrace());
    assertTrue(actualNavigationParserGrammar.getBuildParseTree());
    assertEquals(-1, actualNavigationParserGrammar.getState());
    assertTrue(
        actualNavigationParserGrammar.getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualNavigationParserGrammar.getInterpreter();
    assertEquals(14, interpreter.decisionToDFA.length);
    assertSame(actualNavigationParserGrammar, interpreter.getParser());
    assertSame(actualNavigationParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualNavigationParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testDefinition() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.DefinitionContext actualDefinitionResult = navigationParserGrammar.definition();

    // Assert
    RecognitionException recognitionException = actualDefinitionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualDefinitionResult.invokingState);
    assertNull(actualDefinitionResult.getParent());
    Token expectedStart = actualDefinitionResult.start;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDefinitionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(30, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualDefinitionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testDefinitionContextAccept() {
    // Arrange
    NavigationParserGrammar.DefinitionContext definitionContext = new NavigationParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextAccept2() {
    // Arrange
    NavigationParserGrammar.DefinitionContext definitionContext = new NavigationParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextDIVIDE() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).DIVIDE());
  }

  @Test
  public void testDefinitionContextEOF() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testDefinitionContextGenericType() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).genericType());
  }

  @Test
  public void testDefinitionContextName() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).name());
  }

  @Test
  public void testDefinitionContextPropertyWithParameters() {
    // Arrange, Act and Assert
    assertTrue(
        (new NavigationParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).propertyWithParameters().isEmpty());
    assertNull((new NavigationParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).propertyWithParameters(1));
  }

  @Test
  public void testEnumStub() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.EnumStubContext actualEnumStubResult = navigationParserGrammar.enumStub();

    // Assert
    RecognitionException recognitionException = actualEnumStubResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualEnumStubResult.invokingState);
    assertNull(actualEnumStubResult.getParent());
    Token expectedStart = actualEnumStubResult.start;
    Token start = actualEnumStubResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEnumStubResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(80, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualEnumStubResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testEnumStub2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.EnumStubContext actualEnumStubResult = navigationParserGrammar.enumStub();

    // Assert
    RecognitionException recognitionException = actualEnumStubResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualEnumStubResult.children.size());
    assertNull(actualEnumStubResult.getParent());
    Token expectedStart = actualEnumStubResult.stop;
    Token start = actualEnumStubResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEnumStubResult.getStop());
    assertEquals("null", actualEnumStubResult.getText());
    assertEquals(1, actualEnumStubResult.getChildCount());
    assertTrue(actualEnumStubResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(80, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualEnumStubResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testEnumStub3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(3));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.EnumStubContext actualEnumStubResult = navigationParserGrammar.enumStub();

    // Assert
    RecognitionException recognitionException = actualEnumStubResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualEnumStubResult.children.size());
    assertNull(actualEnumStubResult.getParent());
    Token expectedStart = actualEnumStubResult.stop;
    Token start = actualEnumStubResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEnumStubResult.getStop());
    assertEquals("null", actualEnumStubResult.getText());
    assertEquals(1, actualEnumStubResult.getChildCount());
    assertTrue(actualEnumStubResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(81, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualEnumStubResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testEnumStubContextAccept() {
    // Arrange
    NavigationParserGrammar.EnumStubContext enumStubContext = new NavigationParserGrammar.EnumStubContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(enumStubContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumStubContextAccept2() {
    // Arrange
    NavigationParserGrammar.EnumStubContext enumStubContext = new NavigationParserGrammar.EnumStubContext(
        new ParserRuleContext(), 1);
    enumStubContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumStubContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumStubContextDOT() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.EnumStubContext(new ParserRuleContext(), 1)).DOT());
  }

  @Test
  public void testEnumStubContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(6, (new NavigationParserGrammar.EnumStubContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testEnumStubContextVALID_STRING() {
    // Arrange, Act and Assert
    assertTrue((new NavigationParserGrammar.EnumStubContext(new ParserRuleContext(), 1)).VALID_STRING().isEmpty());
    assertNull((new NavigationParserGrammar.EnumStubContext(new ParserRuleContext(), 1)).VALID_STRING(1));
  }

  @Test
  public void testGenericType() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.GenericTypeContext actualGenericTypeResult = navigationParserGrammar.genericType();

    // Assert
    RecognitionException recognitionException = actualGenericTypeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualGenericTypeResult.invokingState);
    assertNull(actualGenericTypeResult.getParent());
    Token expectedStart = actualGenericTypeResult.start;
    Token start = actualGenericTypeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualGenericTypeResult.getStop());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(actualGenericTypeResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(90, recognitionException.getOffendingState());
    assertEquals(-1, start.getStopIndex());
    assertNull(start.getInputStream());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testGenericTypeContextAccept() {
    // Arrange
    NavigationParserGrammar.GenericTypeContext genericTypeContext = new NavigationParserGrammar.GenericTypeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(genericTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGenericTypeContextAccept2() {
    // Arrange
    NavigationParserGrammar.GenericTypeContext genericTypeContext = new NavigationParserGrammar.GenericTypeContext(
        new ParserRuleContext(), 1);
    genericTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(genericTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGenericTypeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(9, (new NavigationParserGrammar.GenericTypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testGenericTypeContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.GenericTypeContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testGenericTypeContextPath() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.GenericTypeContext(new ParserRuleContext(), 1)).path());
  }

  @Test
  public void testIdentifier() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    NavigationParserGrammar.IdentifierContext actualIdentifierResult = navigationParserGrammar.identifier();

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
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testIdentifier2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.IdentifierContext actualIdentifierResult = navigationParserGrammar.identifier();

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
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(28, recognitionException.getOffendingState());
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
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.IdentifierContext actualIdentifierResult = navigationParserGrammar.identifier();

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
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(28, recognitionException.getOffendingState());
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
    NavigationParserGrammar.IdentifierContext actualIdentifierResult = (new NavigationParserGrammar(
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

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.IdentifierContext actualIdentifierResult = navigationParserGrammar.identifier();

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
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(28, recognitionException.getOffendingState());
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

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.IdentifierContext actualIdentifierResult = navigationParserGrammar.identifier();

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
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testIdentifierContextAccept() {
    // Arrange
    NavigationParserGrammar.IdentifierContext identifierContext = new NavigationParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextAccept2() {
    // Arrange
    NavigationParserGrammar.IdentifierContext identifierContext = new NavigationParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testIdentifierContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testIdentifierContextVALID_STRING_TYPE() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).VALID_STRING_TYPE());
  }

  @Test
  public void testName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.NameContext actualNameResult = navigationParserGrammar.name();

    // Assert
    RecognitionException recognitionException = actualNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualNameResult.invokingState);
    assertNull(actualNameResult.getParent());
    Token expectedStart = actualNameResult.start;
    Token start = actualNameResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualNameResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(86, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualNameResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testName2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.NameContext actualNameResult = navigationParserGrammar.name();

    // Assert
    RecognitionException recognitionException = actualNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualNameResult.children.size());
    assertNull(actualNameResult.getParent());
    Token expectedStart = actualNameResult.stop;
    Token start = actualNameResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualNameResult.getStop());
    assertEquals("null", actualNameResult.getText());
    assertEquals(1, actualNameResult.getChildCount());
    assertTrue(actualNameResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(86, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualNameResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testName3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(22));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.NameContext actualNameResult = navigationParserGrammar.name();

    // Assert
    RecognitionException recognitionException = actualNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(3, actualNameResult.children.size());
    assertNull(actualNameResult.getParent());
    Token expectedStart = actualNameResult.start;
    Token start = actualNameResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualNameResult.stop;
    Token stop = actualNameResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnullnull", actualNameResult.getText());
    assertEquals(3, actualNameResult.getChildCount());
    assertTrue(actualNameResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(86, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(2, stop.getTokenIndex());
    assertSame(actualNameResult, recognitionException.getCtx());
  }

  @Test
  public void testName4() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(
        new ConnectionLexerGrammar(new ANTLRInputStream()));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.NameContext actualNameResult = navigationParserGrammar.name();

    // Assert
    RecognitionException recognitionException = actualNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualNameResult.invokingState);
    assertNull(actualNameResult.getParent());
    Token expectedStart = actualNameResult.start;
    Token start = actualNameResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualNameResult.getStop());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(86, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertSame(actualNameResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
  }

  @Test
  public void testName5() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(22);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.NameContext actualNameResult = navigationParserGrammar.name();

    // Assert
    RecognitionException recognitionException = actualNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(2, actualNameResult.children.size());
    assertNull(actualNameResult.getParent());
    Token expectedStart = actualNameResult.start;
    Token start = actualNameResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualNameResult.stop;
    Token stop = actualNameResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualNameResult.getText());
    assertEquals(2, actualNameResult.getChildCount());
    assertTrue(actualNameResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(86, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualNameResult, recognitionException.getCtx());
  }

  @Test
  public void testName6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(new CommonToken(1)));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.NameContext actualNameResult = navigationParserGrammar.name();

    // Assert
    RecognitionException recognitionException = actualNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualNameResult.children.size());
    assertNull(actualNameResult.getParent());
    Token expectedStart = actualNameResult.stop;
    Token start = actualNameResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualNameResult.getStop());
    assertEquals("null", actualNameResult.getText());
    assertEquals(1, actualNameResult.getChildCount());
    assertTrue(actualNameResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(86, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualNameResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testName7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(22));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    navigationParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    NavigationParserGrammar.NameContext actualNameResult = navigationParserGrammar.name();

    // Assert
    RecognitionException recognitionException = actualNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualNameResult.invokingState);
    assertNull(actualNameResult.getParent());
    Token expectedStart = actualNameResult.start;
    Token start = actualNameResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualNameResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(86, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualNameResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testNameContextAccept() {
    // Arrange
    NavigationParserGrammar.NameContext nameContext = new NavigationParserGrammar.NameContext(new ParserRuleContext(),
        1);

    // Act and Assert
    assertNull(nameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testNameContextAccept2() {
    // Arrange
    NavigationParserGrammar.NameContext nameContext = new NavigationParserGrammar.NameContext(new ParserRuleContext(),
        1);
    nameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(nameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(8, (new NavigationParserGrammar.NameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testNameContextNOT() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.NameContext(new ParserRuleContext(), 1)).NOT());
  }

  @Test
  public void testNameContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.NameContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testPackagePath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    NavigationParserGrammar.PackagePathContext actualPackagePathResult = (new NavigationParserGrammar(
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
    assertSame(start, ((NavigationParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((NavigationParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((NavigationParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((NavigationParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePath2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    NavigationParserGrammar.PackagePathContext actualPackagePathResult = (new NavigationParserGrammar(
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
    assertSame(start, ((NavigationParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((NavigationParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((NavigationParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((NavigationParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((NavigationParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((NavigationParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(28, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath3() throws RecognitionException {
    // Arrange and Act
    NavigationParserGrammar.PackagePathContext actualPackagePathResult = (new NavigationParserGrammar(
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
    assertSame(start, ((NavigationParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((NavigationParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((NavigationParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((NavigationParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((NavigationParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((NavigationParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(28, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath4() throws RecognitionException {
    // Arrange and Act
    NavigationParserGrammar.PackagePathContext actualPackagePathResult = (new NavigationParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("([] [108])", actualPackagePathResult.toStringTree());
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
    assertEquals(108, ((NavigationParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testPackagePath5() throws RecognitionException {
    // Arrange
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.PackagePathContext actualPackagePathResult = navigationParserGrammar.packagePath();

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
    assertSame(start, ((NavigationParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((NavigationParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((NavigationParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((NavigationParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((NavigationParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((NavigationParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(28, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.PackagePathContext actualPackagePathResult = navigationParserGrammar.packagePath();

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
    assertSame(start, ((NavigationParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((NavigationParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((NavigationParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((NavigationParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePathContextAccept() {
    // Arrange
    NavigationParserGrammar.PackagePathContext packagePathContext = new NavigationParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextAccept2() {
    // Arrange
    NavigationParserGrammar.PackagePathContext packagePathContext = new NavigationParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(12, (new NavigationParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPackagePathContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue((new NavigationParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new NavigationParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPackagePathContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertTrue((new NavigationParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR().isEmpty());
    assertNull((new NavigationParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR(1));
  }

  @Test
  public void testParameter() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.ParameterContext actualParameterResult = navigationParserGrammar.parameter();

    // Assert
    RecognitionException recognitionException = actualParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualParameterResult.invokingState);
    assertEquals(1, actualParameterResult.depth());
    Token expectedStart = actualParameterResult.start;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualParameterResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(actualParameterResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(61, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testParameter2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    NavigationParserGrammar.ParameterContext actualParameterResult = (new NavigationParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).parameter();

    // Assert
    assertEquals(-1, actualParameterResult.invokingState);
    assertEquals(1, actualParameterResult.children.size());
    assertNull(actualParameterResult.collection());
    assertEquals(1, actualParameterResult.depth());
    Token expectedStart = actualParameterResult.stop;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualParameterResult.getStop());
    NavigationParserGrammar.ScalarContext scalarResult = actualParameterResult.scalar();
    assertSame(start, scalarResult.getStart());
    assertEquals(2, scalarResult.depth());
    assertFalse(scalarResult.isEmpty());
    assertSame(start, scalarResult.getStop());
    assertEquals(1, scalarResult.getChildCount());
    assertEquals("null", scalarResult.getText());
    assertEquals(0, start.getTokenIndex());
    NavigationParserGrammar.AtomicContext atomicResult = scalarResult.atomic();
    assertFalse(atomicResult.isEmpty());
    Interval expectedSourceInterval = actualParameterResult.getSourceInterval();
    assertSame(expectedSourceInterval, atomicResult.getSourceInterval());
    assertEquals("[76 59]", atomicResult.toString());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
  }

  @Test
  public void testParameter3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(3));

    // Act
    NavigationParserGrammar.ParameterContext actualParameterResult = (new NavigationParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).parameter();

    // Assert
    assertEquals(-1, actualParameterResult.invokingState);
    assertEquals(1, actualParameterResult.children.size());
    assertNull(actualParameterResult.collection());
    assertEquals(1, actualParameterResult.depth());
    Token expectedStart = actualParameterResult.stop;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualParameterResult.getStop());
    NavigationParserGrammar.ScalarContext scalarResult = actualParameterResult.scalar();
    assertSame(start, scalarResult.getStart());
    assertEquals(2, scalarResult.depth());
    assertFalse(scalarResult.isEmpty());
    assertSame(start, scalarResult.getStop());
    assertEquals(1, scalarResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    assertEquals("null", scalarResult.getText());
    List<ParseTree> parseTreeList = scalarResult.children;
    assertEquals(1, parseTreeList.size());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("[77 59]", getResult.toString());
    assertTrue(
        ((NavigationParserGrammar.EnumStubContext) getResult).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(77, ((NavigationParserGrammar.EnumStubContext) getResult).invokingState);
    assertSame(start, ((NavigationParserGrammar.EnumStubContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    Interval expectedSourceInterval = actualParameterResult.getSourceInterval();
    assertSame(expectedSourceInterval, getResult.getSourceInterval());
  }

  @Test
  public void testParameter4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    NavigationParserGrammar.ParameterContext actualParameterResult = (new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource))).parameter();

    // Assert
    assertEquals(-1, actualParameterResult.invokingState);
    assertEquals(1, actualParameterResult.children.size());
    assertNull(actualParameterResult.collection());
    assertEquals(1, actualParameterResult.depth());
    Token expectedStart = actualParameterResult.stop;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualParameterResult.getStop());
    NavigationParserGrammar.ScalarContext scalarResult = actualParameterResult.scalar();
    assertSame(start, scalarResult.getStart());
    assertEquals(2, scalarResult.depth());
    assertFalse(scalarResult.isEmpty());
    assertSame(start, scalarResult.getStop());
    assertEquals(1, scalarResult.getChildCount());
    assertEquals("null", scalarResult.getText());
    assertEquals(0, start.getTokenIndex());
    NavigationParserGrammar.AtomicContext atomicResult = scalarResult.atomic();
    assertFalse(atomicResult.isEmpty());
    Interval expectedSourceInterval = actualParameterResult.getSourceInterval();
    assertSame(expectedSourceInterval, atomicResult.getSourceInterval());
    assertEquals("[76 59]", atomicResult.toString());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
  }

  @Test
  public void testParameter5() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    NavigationParserGrammar.ParameterContext actualParameterResult = (new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource))).parameter();

    // Assert
    assertEquals(-1, actualParameterResult.invokingState);
    assertEquals(1, actualParameterResult.children.size());
    assertNull(actualParameterResult.collection());
    assertEquals(1, actualParameterResult.depth());
    Token expectedStart = actualParameterResult.stop;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualParameterResult.getStop());
    NavigationParserGrammar.ScalarContext scalarResult = actualParameterResult.scalar();
    assertSame(start, scalarResult.getStart());
    assertEquals(2, scalarResult.depth());
    assertFalse(scalarResult.isEmpty());
    assertSame(start, scalarResult.getStop());
    assertEquals(1, scalarResult.getChildCount());
    assertEquals("null", scalarResult.getText());
    assertEquals(0, start.getTokenIndex());
    NavigationParserGrammar.AtomicContext atomicResult = scalarResult.atomic();
    assertFalse(atomicResult.isEmpty());
    Interval expectedSourceInterval = actualParameterResult.getSourceInterval();
    assertSame(expectedSourceInterval, atomicResult.getSourceInterval());
    assertEquals("[76 59]", atomicResult.toString());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
  }

  @Test
  public void testParameter6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    navigationParserGrammar.setBuildParseTree(true);

    // Act
    NavigationParserGrammar.ParameterContext actualParameterResult = navigationParserGrammar.parameter();

    // Assert
    assertEquals(-1, actualParameterResult.invokingState);
    assertEquals(1, actualParameterResult.children.size());
    assertNull(actualParameterResult.collection());
    assertEquals(1, actualParameterResult.depth());
    Token expectedStart = actualParameterResult.stop;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualParameterResult.getStop());
    NavigationParserGrammar.ScalarContext scalarResult = actualParameterResult.scalar();
    assertSame(start, scalarResult.getStart());
    assertEquals(2, scalarResult.depth());
    assertFalse(scalarResult.isEmpty());
    assertSame(start, scalarResult.getStop());
    assertEquals(1, scalarResult.getChildCount());
    assertEquals("null", scalarResult.getText());
    assertEquals(0, start.getTokenIndex());
    NavigationParserGrammar.AtomicContext atomicResult = scalarResult.atomic();
    assertFalse(atomicResult.isEmpty());
    Interval expectedSourceInterval = actualParameterResult.getSourceInterval();
    assertSame(expectedSourceInterval, atomicResult.getSourceInterval());
    assertEquals("[76 59]", atomicResult.toString());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
  }

  @Test
  public void testParameter7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.ParameterContext actualParameterResult = navigationParserGrammar.parameter();

    // Assert
    assertEquals(-1, actualParameterResult.invokingState);
    assertEquals(1, actualParameterResult.children.size());
    assertNull(actualParameterResult.collection());
    assertEquals(1, actualParameterResult.depth());
    Token expectedStart = actualParameterResult.stop;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualParameterResult.getStop());
    NavigationParserGrammar.ScalarContext scalarResult = actualParameterResult.scalar();
    assertSame(start, scalarResult.getStart());
    assertEquals(2, scalarResult.depth());
    assertFalse(scalarResult.isEmpty());
    assertSame(start, scalarResult.getStop());
    assertEquals(1, scalarResult.getChildCount());
    assertEquals("null", scalarResult.getText());
    assertEquals(0, start.getTokenIndex());
    NavigationParserGrammar.AtomicContext atomicResult = scalarResult.atomic();
    assertFalse(atomicResult.isEmpty());
    Interval expectedSourceInterval = actualParameterResult.getSourceInterval();
    assertSame(expectedSourceInterval, atomicResult.getSourceInterval());
    assertEquals("[76 59]", atomicResult.toString());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
  }

  @Test
  public void testParameter8() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CommonTokenStream commonTokenStream = new CommonTokenStream(listTokenSource);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(commonTokenStream);
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.ParameterContext actualParameterResult = navigationParserGrammar.parameter();

    // Assert
    RecognitionException recognitionException = actualParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualParameterResult.invokingState);
    assertEquals(1, actualParameterResult.depth());
    Token expectedStart = actualParameterResult.start;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualParameterResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(actualParameterResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(commonTokenStream, recognitionException.getInputStream());
    assertEquals(61, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testParameter9() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setLine(2);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    navigationParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    NavigationParserGrammar.ParameterContext actualParameterResult = navigationParserGrammar.parameter();

    // Assert
    RecognitionException recognitionException = actualParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualParameterResult.invokingState);
    assertEquals(1, actualParameterResult.depth());
    Token expectedStart = actualParameterResult.start;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualParameterResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(actualParameterResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(61, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testParameterContextAccept() {
    // Arrange
    NavigationParserGrammar.ParameterContext parameterContext = new NavigationParserGrammar.ParameterContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(parameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testParameterContextAccept2() {
    // Arrange
    NavigationParserGrammar.ParameterContext parameterContext = new NavigationParserGrammar.ParameterContext(
        new ParserRuleContext(), 1);
    parameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(parameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testParameterContextCollection() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.ParameterContext(new ParserRuleContext(), 1)).collection());
  }

  @Test
  public void testParameterContextScalar() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.ParameterContext(new ParserRuleContext(), 1)).scalar());
  }

  @Test
  public void testPath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.PathContext actualPathResult = navigationParserGrammar.path();

    // Assert
    RecognitionException recognitionException = actualPathResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualPathResult.invokingState);
    assertNull(actualPathResult.getParent());
    Token expectedStart = actualPathResult.start;
    Token start = actualPathResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPathResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(97, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualPathResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testPathContextAccept() {
    // Arrange
    NavigationParserGrammar.PathContext pathContext = new NavigationParserGrammar.PathContext(new ParserRuleContext(),
        1);

    // Act and Assert
    assertNull(pathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPathContextAccept2() {
    // Arrange
    NavigationParserGrammar.PathContext pathContext = new NavigationParserGrammar.PathContext(new ParserRuleContext(),
        1);
    pathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(pathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPathContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(10, (new NavigationParserGrammar.PathContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPathContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue((new NavigationParserGrammar.PathContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new NavigationParserGrammar.PathContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPathContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertTrue((new NavigationParserGrammar.PathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR().isEmpty());
    assertNull((new NavigationParserGrammar.PathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR(1));
  }

  @Test
  public void testPropertyWithParameters() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.PropertyWithParametersContext actualPropertyWithParametersResult = navigationParserGrammar
        .propertyWithParameters();

    // Assert
    RecognitionException recognitionException = actualPropertyWithParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualPropertyWithParametersResult.invokingState);
    assertNull(actualPropertyWithParametersResult.getParent());
    Token expectedStart = actualPropertyWithParametersResult.start;
    Token start = actualPropertyWithParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPropertyWithParametersResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(43, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualPropertyWithParametersResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testPropertyWithParameters2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.PropertyWithParametersContext actualPropertyWithParametersResult = navigationParserGrammar
        .propertyWithParameters();

    // Assert
    RecognitionException recognitionException = actualPropertyWithParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualPropertyWithParametersResult.children.size());
    assertNull(actualPropertyWithParametersResult.getParent());
    Token expectedStart = actualPropertyWithParametersResult.stop;
    Token start = actualPropertyWithParametersResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualPropertyWithParametersResult.getStop());
    assertEquals("null", actualPropertyWithParametersResult.getText());
    assertEquals(1, actualPropertyWithParametersResult.getChildCount());
    assertTrue(actualPropertyWithParametersResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(43, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualPropertyWithParametersResult, recognitionException.getCtx());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(1, inputStream.index());
    assertEquals("List", inputStream.getSourceName());
  }

  @Test
  public void testPropertyWithParameters3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(47));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.PropertyWithParametersContext actualPropertyWithParametersResult = navigationParserGrammar
        .propertyWithParameters();

    // Assert
    RecognitionException recognitionException = actualPropertyWithParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(3, actualPropertyWithParametersResult.children.size());
    assertNull(actualPropertyWithParametersResult.getParent());
    Token expectedStart = actualPropertyWithParametersResult.start;
    Token start = actualPropertyWithParametersResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualPropertyWithParametersResult.stop;
    Token stop = actualPropertyWithParametersResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnullnull", actualPropertyWithParametersResult.getText());
    assertEquals(3, actualPropertyWithParametersResult.getChildCount());
    assertTrue(actualPropertyWithParametersResult.isEmpty());
    assertEquals("[@0,0:0='<no text>',<1>,0:-1]", start.toString());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(43, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(2, stop.getTokenIndex());
    assertSame(actualPropertyWithParametersResult, recognitionException.getCtx());
  }

  @Test
  public void testPropertyWithParameters4() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(
        new ConnectionLexerGrammar(new ANTLRInputStream()));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.PropertyWithParametersContext actualPropertyWithParametersResult = navigationParserGrammar
        .propertyWithParameters();

    // Assert
    RecognitionException recognitionException = actualPropertyWithParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualPropertyWithParametersResult.invokingState);
    assertNull(actualPropertyWithParametersResult.getParent());
    Token expectedStart = actualPropertyWithParametersResult.start;
    Token start = actualPropertyWithParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPropertyWithParametersResult.getStop());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(43, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertSame(actualPropertyWithParametersResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testPropertyWithParameters5() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(47);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.PropertyWithParametersContext actualPropertyWithParametersResult = navigationParserGrammar
        .propertyWithParameters();

    // Assert
    RecognitionException recognitionException = actualPropertyWithParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(2, actualPropertyWithParametersResult.children.size());
    assertNull(actualPropertyWithParametersResult.getParent());
    Token expectedStart = actualPropertyWithParametersResult.start;
    Token start = actualPropertyWithParametersResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualPropertyWithParametersResult.stop;
    Token stop = actualPropertyWithParametersResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualPropertyWithParametersResult.getText());
    assertEquals(2, actualPropertyWithParametersResult.getChildCount());
    assertTrue(actualPropertyWithParametersResult.isEmpty());
    assertEquals("[@0,0:0='<no text>',<1>,0:-1]", start.toString());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(43, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualPropertyWithParametersResult, recognitionException.getCtx());
  }

  @Test
  public void testPropertyWithParameters6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(new CommonToken(1)));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.PropertyWithParametersContext actualPropertyWithParametersResult = navigationParserGrammar
        .propertyWithParameters();

    // Assert
    RecognitionException recognitionException = actualPropertyWithParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualPropertyWithParametersResult.children.size());
    assertNull(actualPropertyWithParametersResult.getParent());
    Token expectedStart = actualPropertyWithParametersResult.stop;
    Token start = actualPropertyWithParametersResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualPropertyWithParametersResult.getStop());
    assertEquals("null", actualPropertyWithParametersResult.getText());
    assertEquals(1, actualPropertyWithParametersResult.getChildCount());
    assertTrue(actualPropertyWithParametersResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(43, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualPropertyWithParametersResult, recognitionException.getCtx());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(1, inputStream.index());
    assertEquals("List", inputStream.getSourceName());
  }

  @Test
  public void testPropertyWithParameters7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(47));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    navigationParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    NavigationParserGrammar.PropertyWithParametersContext actualPropertyWithParametersResult = navigationParserGrammar
        .propertyWithParameters();

    // Assert
    RecognitionException recognitionException = actualPropertyWithParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualPropertyWithParametersResult.invokingState);
    assertNull(actualPropertyWithParametersResult.getParent());
    Token expectedStart = actualPropertyWithParametersResult.start;
    Token start = actualPropertyWithParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPropertyWithParametersResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(43, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualPropertyWithParametersResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testPropertyWithParametersContextAccept() {
    // Arrange
    NavigationParserGrammar.PropertyWithParametersContext propertyWithParametersContext = new NavigationParserGrammar.PropertyWithParametersContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(propertyWithParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyWithParametersContextAccept2() {
    // Arrange
    NavigationParserGrammar.PropertyWithParametersContext propertyWithParametersContext = new NavigationParserGrammar.PropertyWithParametersContext(
        new ParserRuleContext(), 1);
    propertyWithParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(propertyWithParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyWithParametersContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new NavigationParserGrammar.PropertyWithParametersContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new NavigationParserGrammar.PropertyWithParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testPropertyWithParametersContextDIVIDE() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.PropertyWithParametersContext(new ParserRuleContext(), 1)).DIVIDE());
  }

  @Test
  public void testPropertyWithParametersContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.PropertyWithParametersContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testPropertyWithParametersContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.PropertyWithParametersContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testPropertyWithParametersContextParameter() {
    // Arrange, Act and Assert
    assertTrue(
        (new NavigationParserGrammar.PropertyWithParametersContext(new ParserRuleContext(), 1)).parameter().isEmpty());
    assertNull((new NavigationParserGrammar.PropertyWithParametersContext(new ParserRuleContext(), 1)).parameter(1));
  }

  @Test
  public void testPropertyWithParametersContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.PropertyWithParametersContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testQualifiedName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.QualifiedNameContext actualQualifiedNameResult = navigationParserGrammar.qualifiedName();

    // Assert
    RecognitionException recognitionException = actualQualifiedNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertNull(actualQualifiedNameResult.getParent());
    Token expectedStart = actualQualifiedNameResult.start;
    Token start = actualQualifiedNameResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualQualifiedNameResult.getStop());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(104, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualQualifiedNameResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testQualifiedNameContextAccept() {
    // Arrange
    NavigationParserGrammar.QualifiedNameContext qualifiedNameContext = new NavigationParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextAccept2() {
    // Arrange
    NavigationParserGrammar.QualifiedNameContext qualifiedNameContext = new NavigationParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(11, (new NavigationParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testQualifiedNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testQualifiedNameContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testQualifiedNameContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testScalar() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = navigationParserGrammar.scalar();

    // Assert
    RecognitionException recognitionException = actualScalarResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualScalarResult.invokingState);
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.start;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualScalarResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(78, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualScalarResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testScalar10() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setLine(2);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    navigationParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = navigationParserGrammar.scalar();

    // Assert
    RecognitionException recognitionException = actualScalarResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualScalarResult.invokingState);
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.start;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualScalarResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(78, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualScalarResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testScalar2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = (new NavigationParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).scalar();

    // Assert
    assertEquals(-1, actualScalarResult.invokingState);
    assertEquals(1, actualScalarResult.children.size());
    assertEquals(1, actualScalarResult.getChildCount());
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.stop;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualScalarResult.getStop());
    NavigationParserGrammar.AtomicContext atomicResult = actualScalarResult.atomic();
    assertEquals(76, atomicResult.invokingState);
    List<ParseTree> parseTreeList = atomicResult.children;
    assertEquals(1, parseTreeList.size());
    assertSame(start, atomicResult.getStart());
    assertEquals(2, atomicResult.depth());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(atomicResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testScalar3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new CodeLexerGrammar(new ANTLRInputStream()));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = navigationParserGrammar.scalar();

    // Assert
    RecognitionException recognitionException = actualScalarResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualScalarResult.invokingState);
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.start;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualScalarResult.getStop());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(78, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getTokenIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualScalarResult, recognitionException.getCtx());
    assertEquals(0, ((CodeLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertNull(((CodeLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((CodeLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(0, ((CodeLexerGrammar) start.getTokenSource()).getChannel());
    assertTrue(((CodeLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(1, ((CodeLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, ((CodeLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testScalar4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(3));

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = (new NavigationParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).scalar();

    // Assert
    assertEquals(-1, actualScalarResult.invokingState);
    List<ParseTree> parseTreeList = actualScalarResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, actualScalarResult.getChildCount());
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.stop;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualScalarResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((NavigationParserGrammar.EnumStubContext) getResult).getStart());
    assertEquals(2, ((NavigationParserGrammar.EnumStubContext) getResult).depth());
    assertFalse(((NavigationParserGrammar.EnumStubContext) getResult).isEmpty());
    assertSame(start, ((NavigationParserGrammar.EnumStubContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((NavigationParserGrammar.EnumStubContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((NavigationParserGrammar.EnumStubContext) getResult).children.size());
    assertEquals(81, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testScalar5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = (new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource))).scalar();

    // Assert
    assertEquals(-1, actualScalarResult.invokingState);
    assertEquals(1, actualScalarResult.children.size());
    assertEquals(1, actualScalarResult.getChildCount());
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.stop;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualScalarResult.getStop());
    NavigationParserGrammar.AtomicContext atomicResult = actualScalarResult.atomic();
    assertEquals(76, atomicResult.invokingState);
    List<ParseTree> parseTreeList = atomicResult.children;
    assertEquals(1, parseTreeList.size());
    assertSame(start, atomicResult.getStart());
    assertEquals(2, atomicResult.depth());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(atomicResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testScalar6() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = (new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource))).scalar();

    // Assert
    assertEquals(-1, actualScalarResult.invokingState);
    assertEquals(1, actualScalarResult.children.size());
    assertEquals(1, actualScalarResult.getChildCount());
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.stop;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualScalarResult.getStop());
    NavigationParserGrammar.AtomicContext atomicResult = actualScalarResult.atomic();
    assertEquals(76, atomicResult.invokingState);
    List<ParseTree> parseTreeList = atomicResult.children;
    assertEquals(1, parseTreeList.size());
    assertSame(start, atomicResult.getStart());
    assertEquals(2, atomicResult.depth());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(atomicResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testScalar7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    navigationParserGrammar.setBuildParseTree(true);

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = navigationParserGrammar.scalar();

    // Assert
    assertEquals(-1, actualScalarResult.invokingState);
    assertEquals(1, actualScalarResult.children.size());
    assertEquals(1, actualScalarResult.getChildCount());
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.stop;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualScalarResult.getStop());
    NavigationParserGrammar.AtomicContext atomicResult = actualScalarResult.atomic();
    assertEquals(76, atomicResult.invokingState);
    List<ParseTree> parseTreeList = atomicResult.children;
    assertEquals(1, parseTreeList.size());
    assertSame(start, atomicResult.getStart());
    assertEquals(2, atomicResult.depth());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(atomicResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testScalar8() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = navigationParserGrammar.scalar();

    // Assert
    assertEquals(-1, actualScalarResult.invokingState);
    assertEquals(1, actualScalarResult.children.size());
    assertEquals(1, actualScalarResult.getChildCount());
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.stop;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualScalarResult.getStop());
    NavigationParserGrammar.AtomicContext atomicResult = actualScalarResult.atomic();
    assertEquals(76, atomicResult.invokingState);
    List<ParseTree> parseTreeList = atomicResult.children;
    assertEquals(1, parseTreeList.size());
    assertSame(start, atomicResult.getStart());
    assertEquals(2, atomicResult.depth());
    assertSame(start, atomicResult.getStop());
    assertEquals(1, atomicResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(atomicResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testScalar9() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CommonTokenStream commonTokenStream = new CommonTokenStream(listTokenSource);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(commonTokenStream);
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.ScalarContext actualScalarResult = navigationParserGrammar.scalar();

    // Assert
    RecognitionException recognitionException = actualScalarResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualScalarResult.invokingState);
    assertEquals(1, actualScalarResult.depth());
    Token expectedStart = actualScalarResult.start;
    Token start = actualScalarResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualScalarResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(78, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(commonTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualScalarResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testScalarContextAccept() {
    // Arrange
    NavigationParserGrammar.ScalarContext scalarContext = new NavigationParserGrammar.ScalarContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(scalarContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testScalarContextAccept2() {
    // Arrange
    NavigationParserGrammar.ScalarContext scalarContext = new NavigationParserGrammar.ScalarContext(
        new ParserRuleContext(), 1);
    scalarContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(scalarContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testScalarContextAtomic() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.ScalarContext(new ParserRuleContext(), 1)).atomic());
  }

  @Test
  public void testScalarContextEnumStub() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.ScalarContext(new ParserRuleContext(), 1)).enumStub());
  }

  @Test
  public void testWord() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(bufferedTokenStream);

    // Act
    NavigationParserGrammar.WordContext actualWordResult = navigationParserGrammar.word();

    // Assert
    RecognitionException recognitionException = actualWordResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualWordResult.invokingState);
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.start;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.getStop());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(119, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualWordResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testWord2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    NavigationParserGrammar.WordContext actualWordResult = navigationParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.identifier());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testWord3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(3));

    // Act
    NavigationParserGrammar.WordContext actualWordResult = (new NavigationParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.children.size());
    assertNull(actualWordResult.getParent());
    Token token = actualWordResult.stop;
    assertSame(token, actualWordResult.getStart());
    Token stop = actualWordResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualWordResult.getChildCount());
    NavigationParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testWord4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    NavigationParserGrammar.WordContext actualWordResult = navigationParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.identifier());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testWord5() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    NavigationParserGrammar.WordContext actualWordResult = navigationParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.identifier());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testWord6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    navigationParserGrammar.setBuildParseTree(true);

    // Act
    NavigationParserGrammar.WordContext actualWordResult = navigationParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.identifier());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testWord7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.WordContext actualWordResult = navigationParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    List<ParseTree> parseTreeList = actualWordResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualWordResult.identifier());
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.stop;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualWordResult.getStop());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualWordResult, getResult.getParent());
    assertNull(navigationParserGrammar.getRuleContext());
    assertEquals(-1, navigationParserGrammar.getState());
  }

  @Test
  public void testWord8() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CommonTokenStream commonTokenStream = new CommonTokenStream(listTokenSource);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(commonTokenStream);
    navigationParserGrammar.setTrace(true);

    // Act
    NavigationParserGrammar.WordContext actualWordResult = navigationParserGrammar.word();

    // Assert
    RecognitionException recognitionException = actualWordResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualWordResult.invokingState);
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.start;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.getStop());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(119, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(commonTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualWordResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testWord9() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setLine(2);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    NavigationParserGrammar navigationParserGrammar = new NavigationParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    navigationParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    NavigationParserGrammar.WordContext actualWordResult = navigationParserGrammar.word();

    // Assert
    RecognitionException recognitionException = actualWordResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualWordResult.invokingState);
    assertNull(actualWordResult.getParent());
    Token expectedStart = actualWordResult.start;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.getStop());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(119, recognitionException.getOffendingState());
    assertSame(navigationParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualWordResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testWordContextAccept() {
    // Arrange
    NavigationParserGrammar.WordContext wordContext = new NavigationParserGrammar.WordContext(new ParserRuleContext(),
        1);

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextAccept2() {
    // Arrange
    NavigationParserGrammar.WordContext wordContext = new NavigationParserGrammar.WordContext(new ParserRuleContext(),
        1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.WordContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testWordContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(13, (new NavigationParserGrammar.WordContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testWordContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.WordContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testWordContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new NavigationParserGrammar.WordContext(new ParserRuleContext(), 1)).identifier());
  }
}

