package org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.modelConnection;

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
import org.antlr.v4.runtime.Recognizer;
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

public class ModelConnectionParserGrammarDiffblueTest {
  @Test
  public void testConnectionUrl() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.ConnectionUrlContext actualConnectionUrlResult = modelConnectionParserGrammar
        .connectionUrl();

    // Assert
    RecognitionException recognitionException = actualConnectionUrlResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualConnectionUrlResult.invokingState);
    assertNull(actualConnectionUrlResult.getParent());
    Token expectedStart = actualConnectionUrlResult.start;
    Token start = actualConnectionUrlResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionUrlResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(30, recognitionException.getOffendingState());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualConnectionUrlResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testConnectionUrl2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.ConnectionUrlContext actualConnectionUrlResult = modelConnectionParserGrammar
        .connectionUrl();

    // Assert
    RecognitionException recognitionException = actualConnectionUrlResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionUrlResult.children.size());
    assertNull(actualConnectionUrlResult.getParent());
    Token expectedStart = actualConnectionUrlResult.stop;
    Token start = actualConnectionUrlResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionUrlResult.getStop());
    assertEquals("null", actualConnectionUrlResult.getText());
    assertEquals(1, actualConnectionUrlResult.getChildCount());
    assertTrue(actualConnectionUrlResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(30, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualConnectionUrlResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testConnectionUrl3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(2));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.ConnectionUrlContext actualConnectionUrlResult = modelConnectionParserGrammar
        .connectionUrl();

    // Assert
    RecognitionException recognitionException = actualConnectionUrlResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionUrlResult.children.size());
    assertNull(actualConnectionUrlResult.getParent());
    Token expectedStart = actualConnectionUrlResult.stop;
    Token start = actualConnectionUrlResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionUrlResult.getStop());
    assertEquals("null", actualConnectionUrlResult.getText());
    assertEquals(1, actualConnectionUrlResult.getChildCount());
    assertTrue(actualConnectionUrlResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(31, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualConnectionUrlResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testConnectionUrlContextAccept() {
    // Arrange
    ModelConnectionParserGrammar.ConnectionUrlContext connectionUrlContext = new ModelConnectionParserGrammar.ConnectionUrlContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(connectionUrlContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionUrlContextAccept2() {
    // Arrange
    ModelConnectionParserGrammar.ConnectionUrlContext connectionUrlContext = new ModelConnectionParserGrammar.ConnectionUrlContext(
        new ParserRuleContext(), 1);
    connectionUrlContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionUrlContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionUrlContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ConnectionUrlContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testConnectionUrlContextSEMI_COLON() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ConnectionUrlContext(new ParserRuleContext(), 1)).SEMI_COLON());
  }

  @Test
  public void testConnectionUrlContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ConnectionUrlContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testConnectionUrlContextURL() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ConnectionUrlContext(new ParserRuleContext(), 1)).URL());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    ModelConnectionParserGrammar actualModelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(new ArrayList<Token>())));

    // Assert
    assertNull(actualModelConnectionParserGrammar.getParseInfo());
    assertEquals(0, actualModelConnectionParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualModelConnectionParserGrammar.isMatchedEOF());
    assertNull(actualModelConnectionParserGrammar.getContext());
    assertTrue(
        actualModelConnectionParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualModelConnectionParserGrammar.getPrecedence());
    assertEquals("List", actualModelConnectionParserGrammar.getSourceName());
    assertFalse(actualModelConnectionParserGrammar.isTrace());
    assertTrue(actualModelConnectionParserGrammar.getBuildParseTree());
    assertEquals(-1, actualModelConnectionParserGrammar.getState());
    assertTrue(actualModelConnectionParserGrammar
        .getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualModelConnectionParserGrammar.getInterpreter();
    assertEquals(7, interpreter.decisionToDFA.length);
    assertSame(actualModelConnectionParserGrammar, interpreter.getParser());
    assertSame(actualModelConnectionParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualModelConnectionParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testDefinition() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    ModelConnectionParserGrammar.DefinitionContext actualDefinitionResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualDefinitionResult.getParent());
    Token expectedStart = actualDefinitionResult.stop;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDefinitionResult.getStop());
    assertEquals(1, actualDefinitionResult.getChildCount());
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
    assertSame(actualDefinitionResult, getResult.getParent());
    assertEquals(0, tokenSource.getCharPositionInLine());
    assertEquals("EOF", getResult.getText());
  }

  @Test
  public void testDefinition2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    ModelConnectionParserGrammar.DefinitionContext actualDefinitionResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualDefinitionResult.getParent());
    Token expectedStart = actualDefinitionResult.start;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualDefinitionResult.stop;
    Token stop = actualDefinitionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullEOF", actualDefinitionResult.getText());
    assertEquals(2, actualDefinitionResult.getChildCount());
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
    assertTrue(((ModelConnectionParserGrammar.ModelConnectionClassContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(20, ((ModelConnectionParserGrammar.ModelConnectionClassContext) parseTreeList.get(0)).invokingState);
    assertSame(actualDefinitionResult, getResult.getParent());
  }

  @Test
  public void testDefinition3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    Pair<TokenSource, CharStream> pair = new Pair<TokenSource, CharStream>(a, new ANTLRInputStream());
    tokenList.add(new CommonToken(pair, 1, 1, 1, 1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    ModelConnectionParserGrammar.DefinitionContext actualDefinitionResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualDefinitionResult.getParent());
    Token expectedStart = actualDefinitionResult.start;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualDefinitionResult.stop;
    Token stop = actualDefinitionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("null<missing ':'><EOF><missing ';'>EOF", actualDefinitionResult.getText());
    assertEquals(2, actualDefinitionResult.getChildCount());
    assertEquals(1, stop.getLine());
    assertEquals(2, stop.getTokenIndex());
    assertEquals("EOF", stop.getText());
    CharStream expectedInputStream = pair.b;
    assertSame(expectedInputStream, stop.getInputStream());
    assertEquals(1, stop.getCharPositionInLine());
    assertEquals(2, stop.getStartIndex());
    assertEquals(-1, stop.getType());
    assertEquals(0, stop.getChannel());
    assertSame(listTokenSource, stop.getTokenSource());
    assertEquals(1, stop.getStopIndex());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(1);
    assertEquals("EOF", getResult.getText());
    assertEquals(20, ((ModelConnectionParserGrammar.ModelConnectionClassContext) parseTreeList.get(0)).invokingState);
    assertSame(actualDefinitionResult, getResult.getParent());
  }

  @Test
  public void testDefinitionContextAccept() {
    // Arrange
    ModelConnectionParserGrammar.DefinitionContext definitionContext = new ModelConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextAccept2() {
    // Arrange
    ModelConnectionParserGrammar.DefinitionContext definitionContext = new ModelConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextConnectionUrl() {
    // Arrange, Act and Assert
    assertTrue(
        (new ModelConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).connectionUrl().isEmpty());
    assertNull((new ModelConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).connectionUrl(1));
  }

  @Test
  public void testDefinitionContextEOF() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testDefinitionContextModelChainMappings() {
    // Arrange, Act and Assert
    assertTrue((new ModelConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).modelChainMappings()
        .isEmpty());
    assertNull((new ModelConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).modelChainMappings(1));
  }

  @Test
  public void testDefinitionContextModelConnectionClass() {
    // Arrange, Act and Assert
    assertTrue((new ModelConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).modelConnectionClass()
        .isEmpty());
    assertNull(
        (new ModelConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).modelConnectionClass(1));
  }

  @Test
  public void testIdentifier() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    ModelConnectionParserGrammar.IdentifierContext actualIdentifierResult = modelConnectionParserGrammar.identifier();

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
    assertNull(modelConnectionParserGrammar.getRuleContext());
    assertEquals(-1, modelConnectionParserGrammar.getState());
  }

  @Test
  public void testIdentifier2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    ModelConnectionParserGrammar.IdentifierContext actualIdentifierResult = modelConnectionParserGrammar.identifier();

    // Assert
    assertEquals(-1, actualIdentifierResult.invokingState);
    List<ParseTree> parseTreeList = actualIdentifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = actualIdentifierResult.stop;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualIdentifierResult.getStop());
    assertEquals(1, actualIdentifierResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualIdentifierResult, getResult.getParent());
    assertNull(modelConnectionParserGrammar.getRuleContext());
    assertEquals(-1, modelConnectionParserGrammar.getState());
  }

  @Test
  public void testIdentifier3() throws RecognitionException {
    // Arrange
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));

    // Act
    ModelConnectionParserGrammar.IdentifierContext actualIdentifierResult = modelConnectionParserGrammar.identifier();

    // Assert
    assertEquals(-1, actualIdentifierResult.invokingState);
    List<ParseTree> parseTreeList = actualIdentifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = actualIdentifierResult.stop;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualIdentifierResult.getStop());
    assertEquals(1, actualIdentifierResult.getChildCount());
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
    assertSame(actualIdentifierResult, getResult.getParent());
    assertNull(modelConnectionParserGrammar.getRuleContext());
    assertEquals(-1, modelConnectionParserGrammar.getState());
  }

  @Test
  public void testIdentifier4() throws RecognitionException {
    // Arrange and Act
    ModelConnectionParserGrammar.IdentifierContext actualIdentifierResult = (new ModelConnectionParserGrammar(
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
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    modelConnectionParserGrammar.setTrace(true);

    // Act
    ModelConnectionParserGrammar.IdentifierContext actualIdentifierResult = modelConnectionParserGrammar.identifier();

    // Assert
    assertEquals(-1, actualIdentifierResult.invokingState);
    List<ParseTree> parseTreeList = actualIdentifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = actualIdentifierResult.stop;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualIdentifierResult.getStop());
    assertEquals(1, actualIdentifierResult.getChildCount());
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
    assertSame(actualIdentifierResult, getResult.getParent());
    assertNull(modelConnectionParserGrammar.getRuleContext());
    assertEquals(-1, modelConnectionParserGrammar.getState());
  }

  @Test
  public void testIdentifierContextAccept() {
    // Arrange
    ModelConnectionParserGrammar.IdentifierContext identifierContext = new ModelConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextAccept2() {
    // Arrange
    ModelConnectionParserGrammar.IdentifierContext identifierContext = new ModelConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextMODEL_CHAIN_CONNECTION_MAPPINGS() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1))
        .MODEL_CHAIN_CONNECTION_MAPPINGS());
  }

  @Test
  public void testIdentifierContextMODEL_CONNECTION_CLASS() {
    // Arrange, Act and Assert
    assertNull(
        (new ModelConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).MODEL_CONNECTION_CLASS());
  }

  @Test
  public void testIdentifierContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testIdentifierContextURL() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).URL());
  }

  @Test
  public void testIdentifierContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testMappings() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.MappingsContext actualMappingsResult = modelConnectionParserGrammar.mappings();

    // Assert
    RecognitionException recognitionException = actualMappingsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualMappingsResult.invokingState);
    assertNull(actualMappingsResult.getParent());
    Token expectedStart = actualMappingsResult.start;
    Token start = actualMappingsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualMappingsResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(40, recognitionException.getOffendingState());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualMappingsResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testMappings2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.MappingsContext actualMappingsResult = modelConnectionParserGrammar.mappings();

    // Assert
    RecognitionException recognitionException = actualMappingsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualMappingsResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualMappingsResult.getParent());
    Token expectedStart = actualMappingsResult.stop;
    Token start = actualMappingsResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualMappingsResult.getStop());
    assertEquals("<missing '['><EOF>", actualMappingsResult.getText());
    assertEquals(2, actualMappingsResult.getChildCount());
    assertTrue(actualMappingsResult.isEmpty());
    assertEquals("([] <missing '['> ([41] ([63 41] <EOF>)))", actualMappingsResult.toStringTree());
    assertEquals(0, start.getTokenIndex());
    Token offendingToken = recognitionException.getOffendingToken();
    assertTrue(offendingToken instanceof CommonToken);
    assertEquals(46, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertSame(actualMappingsResult, recognitionException.getCtx());
    assertSame(listTokenSource, offendingToken.getTokenSource());
    assertEquals(-1, offendingToken.getType());
    assertEquals(0, offendingToken.getChannel());
    assertEquals(2, offendingToken.getStartIndex());
    assertEquals(1, offendingToken.getStopIndex());
    assertEquals(41, ((ModelConnectionParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testMappingsContextAccept() {
    // Arrange
    ModelConnectionParserGrammar.MappingsContext mappingsContext = new ModelConnectionParserGrammar.MappingsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(mappingsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMappingsContextAccept2() {
    // Arrange
    ModelConnectionParserGrammar.MappingsContext mappingsContext = new ModelConnectionParserGrammar.MappingsContext(
        new ParserRuleContext(), 1);
    mappingsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMappingsContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.MappingsContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testMappingsContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.MappingsContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testMappingsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new ModelConnectionParserGrammar.MappingsContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new ModelConnectionParserGrammar.MappingsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testMappingsContextQualifiedName() {
    // Arrange, Act and Assert
    assertTrue(
        (new ModelConnectionParserGrammar.MappingsContext(new ParserRuleContext(), 1)).qualifiedName().isEmpty());
    assertNull((new ModelConnectionParserGrammar.MappingsContext(new ParserRuleContext(), 1)).qualifiedName(1));
  }

  @Test
  public void testModelChainMappings() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.ModelChainMappingsContext actualModelChainMappingsResult = modelConnectionParserGrammar
        .modelChainMappings();

    // Assert
    RecognitionException recognitionException = actualModelChainMappingsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualModelChainMappingsResult.invokingState);
    assertEquals(1, actualModelChainMappingsResult.depth());
    Token expectedStart = actualModelChainMappingsResult.start;
    Token start = actualModelChainMappingsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualModelChainMappingsResult.getStop());
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
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(53, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualModelChainMappingsResult, recognitionException.getCtx());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testModelChainMappings2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.ModelChainMappingsContext actualModelChainMappingsResult = modelConnectionParserGrammar
        .modelChainMappings();

    // Assert
    assertNull(actualModelChainMappingsResult.mappings());
    RecognitionException recognitionException = actualModelChainMappingsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualModelChainMappingsResult.children.size());
    assertEquals(1, actualModelChainMappingsResult.depth());
    Token expectedStart = actualModelChainMappingsResult.stop;
    Token start = actualModelChainMappingsResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualModelChainMappingsResult.getStop());
    assertEquals("null", actualModelChainMappingsResult.getText());
    assertTrue(actualModelChainMappingsResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertEquals(53, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualModelChainMappingsResult, recognitionException.getCtx());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(modelConnectionParserGrammar, recognizer);
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void testModelChainMappings3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(3));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.ModelChainMappingsContext actualModelChainMappingsResult = modelConnectionParserGrammar
        .modelChainMappings();

    // Assert
    assertNull(actualModelChainMappingsResult.mappings());
    RecognitionException recognitionException = actualModelChainMappingsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualModelChainMappingsResult.children.size());
    assertEquals(1, actualModelChainMappingsResult.depth());
    Token expectedStart = actualModelChainMappingsResult.stop;
    Token start = actualModelChainMappingsResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualModelChainMappingsResult.getStop());
    assertEquals("null", actualModelChainMappingsResult.getText());
    assertTrue(actualModelChainMappingsResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertEquals(54, recognitionException.getOffendingState());
    Token offendingToken = recognitionException.getOffendingToken();
    assertTrue(offendingToken instanceof CommonToken);
    assertSame(actualModelChainMappingsResult, recognitionException.getCtx());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertEquals("[@1,1:0='EOF',<-1>,0:0]", offendingToken.toString());
    assertEquals(0, offendingToken.getCharPositionInLine());
    assertNull(offendingToken.getInputStream());
    assertEquals(0, offendingToken.getChannel());
    assertEquals(-1, offendingToken.getType());
    assertEquals(0, offendingToken.getStopIndex());
    assertEquals("EOF", offendingToken.getText());
    assertEquals(1, offendingToken.getStartIndex());
    assertSame(listTokenSource, offendingToken.getTokenSource());
  }

  @Test
  public void testModelChainMappingsContextAccept() {
    // Arrange
    ModelConnectionParserGrammar.ModelChainMappingsContext modelChainMappingsContext = new ModelConnectionParserGrammar.ModelChainMappingsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(modelChainMappingsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testModelChainMappingsContextAccept2() {
    // Arrange
    ModelConnectionParserGrammar.ModelChainMappingsContext modelChainMappingsContext = new ModelConnectionParserGrammar.ModelChainMappingsContext(
        new ParserRuleContext(), 1);
    modelChainMappingsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelChainMappingsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testModelChainMappingsContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ModelChainMappingsContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testModelChainMappingsContextMODEL_CHAIN_CONNECTION_MAPPINGS() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ModelChainMappingsContext(new ParserRuleContext(), 1))
        .MODEL_CHAIN_CONNECTION_MAPPINGS());
  }

  @Test
  public void testModelChainMappingsContextMappings() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ModelChainMappingsContext(new ParserRuleContext(), 1)).mappings());
  }

  @Test
  public void testModelChainMappingsContextSEMI_COLON() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ModelChainMappingsContext(new ParserRuleContext(), 1)).SEMI_COLON());
  }

  @Test
  public void testModelConnectionClass() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.ModelConnectionClassContext actualModelConnectionClassResult = modelConnectionParserGrammar
        .modelConnectionClass();

    // Assert
    RecognitionException recognitionException = actualModelConnectionClassResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualModelConnectionClassResult.invokingState);
    assertNull(actualModelConnectionClassResult.getParent());
    Token expectedStart = actualModelConnectionClassResult.start;
    Token start = actualModelConnectionClassResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualModelConnectionClassResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(35, recognitionException.getOffendingState());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualModelConnectionClassResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testModelConnectionClass2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.ModelConnectionClassContext actualModelConnectionClassResult = modelConnectionParserGrammar
        .modelConnectionClass();

    // Assert
    RecognitionException recognitionException = actualModelConnectionClassResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualModelConnectionClassResult.children.size());
    assertNull(actualModelConnectionClassResult.getParent());
    Token expectedStart = actualModelConnectionClassResult.stop;
    Token start = actualModelConnectionClassResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualModelConnectionClassResult.getStop());
    assertEquals("null", actualModelConnectionClassResult.getText());
    assertEquals(1, actualModelConnectionClassResult.getChildCount());
    assertTrue(actualModelConnectionClassResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(36, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualModelConnectionClassResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testModelConnectionClass3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));

    // Act
    ModelConnectionParserGrammar.ModelConnectionClassContext actualModelConnectionClassResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).modelConnectionClass();

    // Assert
    assertEquals(-1, actualModelConnectionClassResult.invokingState);
    List<ParseTree> parseTreeList = actualModelConnectionClassResult.children;
    assertEquals(4, parseTreeList.size());
    assertNull(actualModelConnectionClassResult.getParent());
    Token expectedStart = actualModelConnectionClassResult.start;
    Token start = actualModelConnectionClassResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualModelConnectionClassResult.stop;
    Token stop = actualModelConnectionClassResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("null<missing ':'><EOF><missing ';'>", actualModelConnectionClassResult.getText());
    assertEquals(4, actualModelConnectionClassResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, stop.getTokenIndex());
    ParseTree getResult = parseTreeList.get(3);
    assertEquals("<missing ';'>", getResult.getText());
    assertEquals("<missing ';'>", getResult.toString());
    assertEquals(37, ((ModelConnectionParserGrammar.QualifiedNameContext) parseTreeList.get(2)).invokingState);
    assertSame(actualModelConnectionClassResult, getResult.getParent());
  }

  @Test
  public void testModelConnectionClass4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.ModelConnectionClassContext actualModelConnectionClassResult = modelConnectionParserGrammar
        .modelConnectionClass();

    // Assert
    RecognitionException recognitionException = actualModelConnectionClassResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualModelConnectionClassResult.children;
    assertEquals(4, parseTreeList.size());
    assertNull(actualModelConnectionClassResult.getParent());
    Token expectedStart = actualModelConnectionClassResult.start;
    Token start = actualModelConnectionClassResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualModelConnectionClassResult.stop;
    Token stop = actualModelConnectionClassResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("null<missing ':'><EOF>null", actualModelConnectionClassResult.getText());
    assertEquals(4, actualModelConnectionClassResult.getChildCount());
    assertTrue(actualModelConnectionClassResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertEquals(2, stop.getTokenIndex());
    assertEquals(38, recognitionException.getOffendingState());
    assertSame(stop, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualModelConnectionClassResult, recognitionException.getCtx());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(37, ((ModelConnectionParserGrammar.QualifiedNameContext) parseTreeList.get(2)).invokingState);
  }

  @Test
  public void testModelConnectionClassContextAccept() {
    // Arrange
    ModelConnectionParserGrammar.ModelConnectionClassContext modelConnectionClassContext = new ModelConnectionParserGrammar.ModelConnectionClassContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(modelConnectionClassContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testModelConnectionClassContextAccept2() {
    // Arrange
    ModelConnectionParserGrammar.ModelConnectionClassContext modelConnectionClassContext = new ModelConnectionParserGrammar.ModelConnectionClassContext(
        new ParserRuleContext(), 1);
    modelConnectionClassContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(modelConnectionClassContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testModelConnectionClassContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ModelConnectionClassContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testModelConnectionClassContextMODEL_CONNECTION_CLASS() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ModelConnectionClassContext(new ParserRuleContext(), 1))
        .MODEL_CONNECTION_CLASS());
  }

  @Test
  public void testModelConnectionClassContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull(
        (new ModelConnectionParserGrammar.ModelConnectionClassContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testModelConnectionClassContextSEMI_COLON() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.ModelConnectionClassContext(new ParserRuleContext(), 1)).SEMI_COLON());
  }

  @Test
  public void testPackagePath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    ModelConnectionParserGrammar.PackagePathContext actualPackagePathResult = (new ModelConnectionParserGrammar(
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
    assertSame(start, ((ModelConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((ModelConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((ModelConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((ModelConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePath2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    ModelConnectionParserGrammar.PackagePathContext actualPackagePathResult = (new ModelConnectionParserGrammar(
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
    assertSame(start, ((ModelConnectionParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((ModelConnectionParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((ModelConnectionParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((ModelConnectionParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((ModelConnectionParserGrammar.IdentifierContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertSame(getResult, getResult1.getParent());
    assertNull(getResult1.toString());
  }

  @Test
  public void testPackagePath3() throws RecognitionException {
    // Arrange and Act
    ModelConnectionParserGrammar.PackagePathContext actualPackagePathResult = (new ModelConnectionParserGrammar(
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
    assertSame(start, ((ModelConnectionParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((ModelConnectionParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((ModelConnectionParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((ModelConnectionParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((ModelConnectionParserGrammar.IdentifierContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertSame(getResult, getResult1.getParent());
    assertEquals("Input", getResult1.toString());
  }

  @Test
  public void testPackagePath4() throws RecognitionException {
    // Arrange and Act
    ModelConnectionParserGrammar.PackagePathContext actualPackagePathResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("([] [65])", actualPackagePathResult.toStringTree());
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
    assertEquals(65, ((ModelConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testPackagePath5() throws RecognitionException {
    // Arrange
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    modelConnectionParserGrammar.setTrace(true);

    // Act
    ModelConnectionParserGrammar.PackagePathContext actualPackagePathResult = modelConnectionParserGrammar
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
    assertSame(start, ((ModelConnectionParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((ModelConnectionParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((ModelConnectionParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((ModelConnectionParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((ModelConnectionParserGrammar.IdentifierContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertSame(getResult, getResult1.getParent());
    assertEquals("Input", getResult1.toString());
  }

  @Test
  public void testPackagePathContextAccept() {
    // Arrange
    ModelConnectionParserGrammar.PackagePathContext packagePathContext = new ModelConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextAccept2() {
    // Arrange
    ModelConnectionParserGrammar.PackagePathContext packagePathContext = new ModelConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(7, (new ModelConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPackagePathContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue(
        (new ModelConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new ModelConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPackagePathContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertTrue(
        (new ModelConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR().isEmpty());
    assertNull((new ModelConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR(1));
  }

  @Test
  public void testQualifiedName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = modelConnectionParserGrammar
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
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(61, recognitionException.getOffendingState());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
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
  public void testQualifiedName2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    ModelConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).qualifiedName();

    // Assert
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    Token token = actualQualifiedNameResult.stop;
    assertSame(token, actualQualifiedNameResult.getStart());
    Token stop = actualQualifiedNameResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualQualifiedNameResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testQualifiedName3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    ModelConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).qualifiedName();

    // Assert
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    Token token = actualQualifiedNameResult.stop;
    assertSame(token, actualQualifiedNameResult.getStart());
    Token stop = actualQualifiedNameResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualQualifiedNameResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testQualifiedName4() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    ModelConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).qualifiedName();

    // Assert
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    Token token = actualQualifiedNameResult.stop;
    assertSame(token, actualQualifiedNameResult.getStart());
    Token stop = actualQualifiedNameResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualQualifiedNameResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testQualifiedName5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    modelConnectionParserGrammar.setBuildParseTree(true);

    // Act
    ModelConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = modelConnectionParserGrammar
        .qualifiedName();

    // Assert
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    Token token = actualQualifiedNameResult.stop;
    assertSame(token, actualQualifiedNameResult.getStart());
    Token stop = actualQualifiedNameResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualQualifiedNameResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testQualifiedName6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    modelConnectionParserGrammar.setTrace(true);

    // Act
    ModelConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = modelConnectionParserGrammar
        .qualifiedName();

    // Assert
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    Token token = actualQualifiedNameResult.stop;
    assertSame(token, actualQualifiedNameResult.getStart());
    Token stop = actualQualifiedNameResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualQualifiedNameResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testQualifiedName7() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CommonTokenStream commonTokenStream = new CommonTokenStream(listTokenSource);

    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(commonTokenStream);
    modelConnectionParserGrammar.setTrace(true);

    // Act
    ModelConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = modelConnectionParserGrammar
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
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(61, recognitionException.getOffendingState());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
    assertSame(commonTokenStream, recognitionException.getInputStream());
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
  public void testQualifiedName8() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setLine(2);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    modelConnectionParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = modelConnectionParserGrammar
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
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(61, recognitionException.getOffendingState());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
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
    ModelConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ModelConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextAccept2() {
    // Arrange
    ModelConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ModelConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(6, (new ModelConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testQualifiedNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testQualifiedNameContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testQualifiedNameContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testWord() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = modelConnectionParserGrammar.word();

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
    assertEquals(76, recognitionException.getOffendingState());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
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
  public void testWord10() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setLine(2);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    modelConnectionParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = modelConnectionParserGrammar.word();

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
    assertEquals(76, recognitionException.getOffendingState());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
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

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = (new ModelConnectionParserGrammar(
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
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testWord3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(9));
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = modelConnectionParserGrammar.word();

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
    assertNull(modelConnectionParserGrammar.getRuleContext());
    assertEquals(-1, modelConnectionParserGrammar.getState());
  }

  @Test
  public void testWord4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(12));
    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = modelConnectionParserGrammar.word();

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
    assertNull(modelConnectionParserGrammar.getRuleContext());
    assertEquals(-1, modelConnectionParserGrammar.getState());
  }

  @Test
  public void testWord5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.children.size());
    assertNull(actualWordResult.getParent());
    Token token = actualWordResult.stop;
    assertSame(token, actualWordResult.getStart());
    Token stop = actualWordResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualWordResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testWord6() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = (new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.children.size());
    assertNull(actualWordResult.getParent());
    Token token = actualWordResult.stop;
    assertSame(token, actualWordResult.getStart());
    Token stop = actualWordResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualWordResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testWord7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    modelConnectionParserGrammar.setBuildParseTree(true);

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = modelConnectionParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.children.size());
    assertNull(actualWordResult.getParent());
    Token token = actualWordResult.stop;
    assertSame(token, actualWordResult.getStart());
    Token stop = actualWordResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualWordResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testWord8() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    modelConnectionParserGrammar.setTrace(true);

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = modelConnectionParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.children.size());
    assertNull(actualWordResult.getParent());
    Token token = actualWordResult.stop;
    assertSame(token, actualWordResult.getStart());
    Token stop = actualWordResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualWordResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ModelConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, identifierResult.getChildCount());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertNull(getResult.getText());
  }

  @Test
  public void testWord9() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CommonTokenStream commonTokenStream = new CommonTokenStream(listTokenSource);

    ModelConnectionParserGrammar modelConnectionParserGrammar = new ModelConnectionParserGrammar(commonTokenStream);
    modelConnectionParserGrammar.setTrace(true);

    // Act
    ModelConnectionParserGrammar.WordContext actualWordResult = modelConnectionParserGrammar.word();

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
    assertEquals(76, recognitionException.getOffendingState());
    assertSame(modelConnectionParserGrammar, recognitionException.getRecognizer());
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
  public void testWordContextAccept() {
    // Arrange
    ModelConnectionParserGrammar.WordContext wordContext = new ModelConnectionParserGrammar.WordContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextAccept2() {
    // Arrange
    ModelConnectionParserGrammar.WordContext wordContext = new ModelConnectionParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testWordContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(8, (new ModelConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testWordContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testWordContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new ModelConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)).identifier());
  }
}

