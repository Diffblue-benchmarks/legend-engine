package org.finos.legend.engine.language.pure.grammar.from.antlr4.graphFetchTree;

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

public class GraphFetchTreeParserGrammarDiffblueTest {
  @Test
  public void testAlias() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.AliasContext actualAliasResult = graphFetchTreeParserGrammar.alias();

    // Assert
    RecognitionException recognitionException = actualAliasResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAliasResult.invokingState);
    assertNull(actualAliasResult.getParent());
    Token expectedStart = actualAliasResult.start;
    Token start = actualAliasResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAliasResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(67, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAliasResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAlias2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.AliasContext actualAliasResult = graphFetchTreeParserGrammar.alias();

    // Assert
    RecognitionException recognitionException = actualAliasResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAliasResult.children.size());
    assertNull(actualAliasResult.getParent());
    Token expectedStart = actualAliasResult.stop;
    Token start = actualAliasResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAliasResult.getStop());
    assertEquals("null", actualAliasResult.getText());
    assertEquals(1, actualAliasResult.getChildCount());
    assertTrue(actualAliasResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(67, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAliasResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAlias3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(6));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.AliasContext actualAliasResult = graphFetchTreeParserGrammar.alias();

    // Assert
    RecognitionException recognitionException = actualAliasResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(3, actualAliasResult.children.size());
    assertNull(actualAliasResult.getParent());
    Token expectedStart = actualAliasResult.start;
    Token start = actualAliasResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualAliasResult.stop;
    Token stop = actualAliasResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnullnull", actualAliasResult.getText());
    assertEquals(3, actualAliasResult.getChildCount());
    assertTrue(actualAliasResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(67, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(2, stop.getTokenIndex());
    assertSame(actualAliasResult, recognitionException.getCtx());
  }

  @Test
  public void testAlias4() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(
        new ConnectionLexerGrammar(new ANTLRInputStream()));
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.AliasContext actualAliasResult = graphFetchTreeParserGrammar.alias();

    // Assert
    RecognitionException recognitionException = actualAliasResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAliasResult.invokingState);
    assertNull(actualAliasResult.getParent());
    Token expectedStart = actualAliasResult.start;
    Token start = actualAliasResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAliasResult.getStop());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(67, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertSame(actualAliasResult, recognitionException.getCtx());
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
  public void testAlias5() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(6);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.AliasContext actualAliasResult = graphFetchTreeParserGrammar.alias();

    // Assert
    RecognitionException recognitionException = actualAliasResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(2, actualAliasResult.children.size());
    assertNull(actualAliasResult.getParent());
    Token expectedStart = actualAliasResult.start;
    Token start = actualAliasResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualAliasResult.stop;
    Token stop = actualAliasResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualAliasResult.getText());
    assertEquals(2, actualAliasResult.getChildCount());
    assertTrue(actualAliasResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(67, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualAliasResult, recognitionException.getCtx());
  }

  @Test
  public void testAlias6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(new CommonToken(1)));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));

    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);
    graphFetchTreeParserGrammar.setTrace(true);

    // Act
    GraphFetchTreeParserGrammar.AliasContext actualAliasResult = graphFetchTreeParserGrammar.alias();

    // Assert
    RecognitionException recognitionException = actualAliasResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAliasResult.children.size());
    assertNull(actualAliasResult.getParent());
    Token expectedStart = actualAliasResult.stop;
    Token start = actualAliasResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAliasResult.getStop());
    assertEquals("null", actualAliasResult.getText());
    assertEquals(1, actualAliasResult.getChildCount());
    assertTrue(actualAliasResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(67, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAliasResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAlias7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(6));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    graphFetchTreeParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.AliasContext actualAliasResult = graphFetchTreeParserGrammar.alias();

    // Assert
    RecognitionException recognitionException = actualAliasResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAliasResult.invokingState);
    assertNull(actualAliasResult.getParent());
    Token expectedStart = actualAliasResult.start;
    Token start = actualAliasResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAliasResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(67, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAliasResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAliasContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.AliasContext aliasContext = new GraphFetchTreeParserGrammar.AliasContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(aliasContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAliasContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.AliasContext aliasContext = new GraphFetchTreeParserGrammar.AliasContext(
        new ParserRuleContext(), 1);
    aliasContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aliasContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAliasContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.AliasContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testAliasContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.AliasContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testCollectionParameter() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.CollectionParameterContext actualCollectionParameterResult = graphFetchTreeParserGrammar
        .collectionParameter();

    // Assert
    RecognitionException recognitionException = actualCollectionParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualCollectionParameterResult.invokingState);
    assertNull(actualCollectionParameterResult.getParent());
    Token expectedStart = actualCollectionParameterResult.start;
    Token start = actualCollectionParameterResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualCollectionParameterResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(97, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualCollectionParameterResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testCollectionParameterContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.CollectionParameterContext collectionParameterContext = new GraphFetchTreeParserGrammar.CollectionParameterContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(collectionParameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCollectionParameterContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.CollectionParameterContext collectionParameterContext = new GraphFetchTreeParserGrammar.CollectionParameterContext(
        new ParserRuleContext(), 1);
    collectionParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(collectionParameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCollectionParameterContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull(
        (new GraphFetchTreeParserGrammar.CollectionParameterContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testCollectionParameterContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.CollectionParameterContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testCollectionParameterContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new GraphFetchTreeParserGrammar.CollectionParameterContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new GraphFetchTreeParserGrammar.CollectionParameterContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testCollectionParameterContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(10,
        (new GraphFetchTreeParserGrammar.CollectionParameterContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testCollectionParameterContextScalarParameter() {
    // Arrange, Act and Assert
    assertTrue(
        (new GraphFetchTreeParserGrammar.CollectionParameterContext(new ParserRuleContext(), 1)).scalarParameter()
            .isEmpty());
    assertNull(
        (new GraphFetchTreeParserGrammar.CollectionParameterContext(new ParserRuleContext(), 1)).scalarParameter(1));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    GraphFetchTreeParserGrammar actualGraphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(new ListTokenSource(new ArrayList<Token>())));

    // Assert
    assertNull(actualGraphFetchTreeParserGrammar.getParseInfo());
    assertEquals(0, actualGraphFetchTreeParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualGraphFetchTreeParserGrammar.isMatchedEOF());
    assertNull(actualGraphFetchTreeParserGrammar.getContext());
    assertTrue(
        actualGraphFetchTreeParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualGraphFetchTreeParserGrammar.getPrecedence());
    assertEquals("List", actualGraphFetchTreeParserGrammar.getSourceName());
    assertFalse(actualGraphFetchTreeParserGrammar.isTrace());
    assertTrue(actualGraphFetchTreeParserGrammar.getBuildParseTree());
    assertEquals(-1, actualGraphFetchTreeParserGrammar.getState());
    assertTrue(actualGraphFetchTreeParserGrammar
        .getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualGraphFetchTreeParserGrammar.getInterpreter();
    assertEquals(15, interpreter.decisionToDFA.length);
    assertSame(actualGraphFetchTreeParserGrammar, interpreter.getParser());
    assertSame(actualGraphFetchTreeParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualGraphFetchTreeParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testDefinition() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    GraphFetchTreeParserGrammar.DefinitionContext actualDefinitionResult = (new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] [38] [39] EOF)", actualDefinitionResult.toStringTree());
    assertNull(actualDefinitionResult.getParent());
    Token token = actualDefinitionResult.stop;
    Token start = actualDefinitionResult.getStart();
    assertSame(token, start);
    assertSame(token, actualDefinitionResult.getStop());
    assertEquals(3, actualDefinitionResult.getChildCount());
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
    assertTrue(((GraphFetchTreeParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(38, ((GraphFetchTreeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).invokingState);
    assertTrue(((GraphFetchTreeParserGrammar.GraphDefinitionContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    ParseTree getResult = parseTreeList.get(2);
    assertEquals("EOF", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    assertSame(actualDefinitionResult, getResult.getParent());
    assertEquals(2, ((GraphFetchTreeParserGrammar.GraphDefinitionContext) parseTreeList.get(1)).depth());
    assertSame(start, ((GraphFetchTreeParserGrammar.GraphDefinitionContext) parseTreeList.get(1)).getStart());
    assertEquals(39, ((GraphFetchTreeParserGrammar.GraphDefinitionContext) parseTreeList.get(1)).invokingState);
    assertNull(((GraphFetchTreeParserGrammar.GraphDefinitionContext) parseTreeList.get(1)).getStop());
  }

  @Test
  public void testDefinitionContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.DefinitionContext definitionContext = new GraphFetchTreeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.DefinitionContext definitionContext = new GraphFetchTreeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextEOF() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testDefinitionContextGraphDefinition() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).graphDefinition());
  }

  @Test
  public void testDefinitionContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testEnumReference() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.EnumReferenceContext actualEnumReferenceResult = graphFetchTreeParserGrammar
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
    assertNull(actualEnumReferenceResult.getStop());
    assertEquals(1, actualEnumReferenceResult.getChildCount());
    assertTrue(actualEnumReferenceResult.isEmpty());
    assertEquals("([] [130])", actualEnumReferenceResult.toStringTree());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(actualEnumReferenceResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(131, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertSame(listTokenSource, start.getTokenSource());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStopIndex());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, inputStream.index());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.size());
    assertEquals(130, ((GraphFetchTreeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).invokingState);
    assertTrue(((GraphFetchTreeParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals("", ((BufferedTokenStream) inputStream).getText());
  }

  @Test
  public void testEnumReferenceContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.EnumReferenceContext enumReferenceContext = new GraphFetchTreeParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(enumReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumReferenceContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.EnumReferenceContext enumReferenceContext = new GraphFetchTreeParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);
    enumReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumReferenceContextDOT() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).DOT());
  }

  @Test
  public void testEnumReferenceContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(14, (new GraphFetchTreeParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testEnumReferenceContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testEnumReferenceContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testGraphDefinition() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.GraphDefinitionContext actualGraphDefinitionResult = graphFetchTreeParserGrammar
        .graphDefinition();

    // Assert
    RecognitionException recognitionException = actualGraphDefinitionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualGraphDefinitionResult.invokingState);
    assertNull(actualGraphDefinitionResult.getParent());
    Token expectedStart = actualGraphDefinitionResult.start;
    Token start = actualGraphDefinitionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualGraphDefinitionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(42, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualGraphDefinitionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testGraphDefinitionContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.GraphDefinitionContext graphDefinitionContext = new GraphFetchTreeParserGrammar.GraphDefinitionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(graphDefinitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGraphDefinitionContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.GraphDefinitionContext graphDefinitionContext = new GraphFetchTreeParserGrammar.GraphDefinitionContext(
        new ParserRuleContext(), 1);
    graphDefinitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphDefinitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGraphDefinitionContextBRACE_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.GraphDefinitionContext(new ParserRuleContext(), 1)).BRACE_CLOSE());
  }

  @Test
  public void testGraphDefinitionContextBRACE_OPEN() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.GraphDefinitionContext(new ParserRuleContext(), 1)).BRACE_OPEN());
  }

  @Test
  public void testGraphDefinitionContextGraphPaths() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.GraphDefinitionContext(new ParserRuleContext(), 1)).graphPaths());
  }

  @Test
  public void testGraphPath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.GraphPathContext actualGraphPathResult = graphFetchTreeParserGrammar.graphPath();

    // Assert
    RecognitionException recognitionException = actualGraphPathResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualGraphPathResult.invokingState);
    assertNull(actualGraphPathResult.getParent());
    Token expectedStart = actualGraphPathResult.start;
    Token start = actualGraphPathResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualGraphPathResult.getStop());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualGraphPathResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(55, recognitionException.getOffendingState());
    assertNull(start.getInputStream());
    assertEquals("EOF", start.getText());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testGraphPathContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.GraphPathContext graphPathContext = new GraphFetchTreeParserGrammar.GraphPathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(graphPathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGraphPathContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.GraphPathContext graphPathContext = new GraphFetchTreeParserGrammar.GraphPathContext(
        new ParserRuleContext(), 1);
    graphPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphPathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGraphPathContextAlias() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.GraphPathContext(new ParserRuleContext(), 1)).alias());
  }

  @Test
  public void testGraphPathContextGraphDefinition() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.GraphPathContext(new ParserRuleContext(), 1)).graphDefinition());
  }

  @Test
  public void testGraphPathContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.GraphPathContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testGraphPathContextPropertyParameters() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.GraphPathContext(new ParserRuleContext(), 1)).propertyParameters());
  }

  @Test
  public void testGraphPathContextSubtype() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.GraphPathContext(new ParserRuleContext(), 1)).subtype());
  }

  @Test
  public void testGraphPaths() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    GraphFetchTreeParserGrammar.GraphPathsContext actualGraphPathsResult = (new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(listTokenSource))).graphPaths();

    // Assert
    assertEquals(-1, actualGraphPathsResult.invokingState);
    List<ParseTree> parseTreeList = actualGraphPathsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualGraphPathsResult.getParent());
    Token expectedStart = actualGraphPathsResult.start;
    Token start = actualGraphPathsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualGraphPathsResult.getStop());
    assertEquals(1, actualGraphPathsResult.getChildCount());
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
    assertSame(start, ((GraphFetchTreeParserGrammar.GraphPathContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((GraphFetchTreeParserGrammar.GraphPathContext) parseTreeList.get(0)).depth());
    assertFalse(((GraphFetchTreeParserGrammar.GraphPathContext) parseTreeList.get(0)).isEmpty());
    assertNull(((GraphFetchTreeParserGrammar.GraphPathContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    assertTrue(((GraphFetchTreeParserGrammar.GraphPathContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testGraphPathsContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.GraphPathsContext graphPathsContext = new GraphFetchTreeParserGrammar.GraphPathsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(graphPathsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGraphPathsContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.GraphPathsContext graphPathsContext = new GraphFetchTreeParserGrammar.GraphPathsContext(
        new ParserRuleContext(), 1);
    graphPathsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(graphPathsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGraphPathsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new GraphFetchTreeParserGrammar.GraphPathsContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new GraphFetchTreeParserGrammar.GraphPathsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testGraphPathsContextGraphPath() {
    // Arrange, Act and Assert
    assertTrue((new GraphFetchTreeParserGrammar.GraphPathsContext(new ParserRuleContext(), 1)).graphPath().isEmpty());
    assertNull((new GraphFetchTreeParserGrammar.GraphPathsContext(new ParserRuleContext(), 1)).graphPath(1));
  }

  @Test
  public void testIdentifier() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    GraphFetchTreeParserGrammar.IdentifierContext actualIdentifierResult = graphFetchTreeParserGrammar.identifier();

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
    assertNull(graphFetchTreeParserGrammar.getRuleContext());
    assertEquals(-1, graphFetchTreeParserGrammar.getState());
  }

  @Test
  public void testIdentifier2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.IdentifierContext actualIdentifierResult = graphFetchTreeParserGrammar.identifier();

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
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(36, recognitionException.getOffendingState());
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
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.IdentifierContext actualIdentifierResult = graphFetchTreeParserGrammar.identifier();

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
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(36, recognitionException.getOffendingState());
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
    GraphFetchTreeParserGrammar.IdentifierContext actualIdentifierResult = (new GraphFetchTreeParserGrammar(
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

    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);
    graphFetchTreeParserGrammar.setTrace(true);

    // Act
    GraphFetchTreeParserGrammar.IdentifierContext actualIdentifierResult = graphFetchTreeParserGrammar.identifier();

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
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(36, recognitionException.getOffendingState());
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

    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(listTokenSource));
    graphFetchTreeParserGrammar.setTrace(true);

    // Act
    GraphFetchTreeParserGrammar.IdentifierContext actualIdentifierResult = graphFetchTreeParserGrammar.identifier();

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
    assertNull(graphFetchTreeParserGrammar.getRuleContext());
    assertEquals(-1, graphFetchTreeParserGrammar.getState());
  }

  @Test
  public void testIdentifierContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.IdentifierContext identifierContext = new GraphFetchTreeParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.IdentifierContext identifierContext = new GraphFetchTreeParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testIdentifierContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testInstanceLiteral() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.InstanceLiteralContext actualInstanceLiteralResult = graphFetchTreeParserGrammar
        .instanceLiteral();

    // Assert
    RecognitionException recognitionException = actualInstanceLiteralResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualInstanceLiteralResult.invokingState);
    assertNull(actualInstanceLiteralResult.getParent());
    Token expectedStart = actualInstanceLiteralResult.start;
    Token start = actualInstanceLiteralResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceLiteralResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(123, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualInstanceLiteralResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testInstanceLiteralContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.InstanceLiteralContext instanceLiteralContext = new GraphFetchTreeParserGrammar.InstanceLiteralContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceLiteralContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceLiteralContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.InstanceLiteralContext instanceLiteralContext = new GraphFetchTreeParserGrammar.InstanceLiteralContext(
        new ParserRuleContext(), 1);
    instanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceLiteralContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceLiteralContextDECIMAL() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).DECIMAL());
  }

  @Test
  public void testInstanceLiteralContextFLOAT() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).FLOAT());
  }

  @Test
  public void testInstanceLiteralContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(11,
        (new GraphFetchTreeParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testInstanceLiteralContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testInstanceLiteralContextInstanceLiteralToken() {
    // Arrange, Act and Assert
    assertNull(
        (new GraphFetchTreeParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).instanceLiteralToken());
  }

  @Test
  public void testInstanceLiteralContextMINUS() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void testInstanceLiteralContextPLUS() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).PLUS());
  }

  @Test
  public void testInstanceLiteralToken() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    GraphFetchTreeParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = graphFetchTreeParserGrammar
        .instanceLiteralToken();

    // Assert
    assertEquals(-1, actualInstanceLiteralTokenResult.invokingState);
    assertNull(actualInstanceLiteralTokenResult.getParent());
    Token expectedStart = actualInstanceLiteralTokenResult.start;
    Token start = actualInstanceLiteralTokenResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceLiteralTokenResult.getStop());
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
    assertNull(graphFetchTreeParserGrammar.getRuleContext());
    assertEquals(-1, graphFetchTreeParserGrammar.getState());
  }

  @Test
  public void testInstanceLiteralToken2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = graphFetchTreeParserGrammar
        .instanceLiteralToken();

    // Assert
    RecognitionException recognitionException = actualInstanceLiteralTokenResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualInstanceLiteralTokenResult.children.size());
    assertNull(actualInstanceLiteralTokenResult.getParent());
    Token expectedStart = actualInstanceLiteralTokenResult.stop;
    Token start = actualInstanceLiteralTokenResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualInstanceLiteralTokenResult.getStop());
    assertEquals("null", actualInstanceLiteralTokenResult.getText());
    assertEquals(1, actualInstanceLiteralTokenResult.getChildCount());
    assertTrue(actualInstanceLiteralTokenResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(125, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualInstanceLiteralTokenResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testInstanceLiteralToken3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = graphFetchTreeParserGrammar
        .instanceLiteralToken();

    // Assert
    RecognitionException recognitionException = actualInstanceLiteralTokenResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualInstanceLiteralTokenResult.children.size());
    assertNull(actualInstanceLiteralTokenResult.getParent());
    Token expectedStart = actualInstanceLiteralTokenResult.stop;
    Token start = actualInstanceLiteralTokenResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualInstanceLiteralTokenResult.getStop());
    assertEquals("Input", actualInstanceLiteralTokenResult.getText());
    assertEquals(1, actualInstanceLiteralTokenResult.getChildCount());
    assertTrue(actualInstanceLiteralTokenResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(125, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualInstanceLiteralTokenResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testInstanceLiteralToken4() throws RecognitionException {
    // Arrange and Act
    GraphFetchTreeParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = (new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).instanceLiteralToken();

    // Assert
    assertEquals(-1, actualInstanceLiteralTokenResult.invokingState);
    assertNull(actualInstanceLiteralTokenResult.getParent());
    Token expectedStart = actualInstanceLiteralTokenResult.start;
    Token start = actualInstanceLiteralTokenResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceLiteralTokenResult.getStop());
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
  public void testInstanceLiteralToken5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);
    graphFetchTreeParserGrammar.setTrace(true);

    // Act
    GraphFetchTreeParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = graphFetchTreeParserGrammar
        .instanceLiteralToken();

    // Assert
    RecognitionException recognitionException = actualInstanceLiteralTokenResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualInstanceLiteralTokenResult.children.size());
    assertNull(actualInstanceLiteralTokenResult.getParent());
    Token expectedStart = actualInstanceLiteralTokenResult.stop;
    Token start = actualInstanceLiteralTokenResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualInstanceLiteralTokenResult.getStop());
    assertEquals("Input", actualInstanceLiteralTokenResult.getText());
    assertEquals(1, actualInstanceLiteralTokenResult.getChildCount());
    assertTrue(actualInstanceLiteralTokenResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(125, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualInstanceLiteralTokenResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testInstanceLiteralToken6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(listTokenSource));
    graphFetchTreeParserGrammar.setTrace(true);

    // Act
    GraphFetchTreeParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = graphFetchTreeParserGrammar
        .instanceLiteralToken();

    // Assert
    assertEquals(-1, actualInstanceLiteralTokenResult.invokingState);
    assertNull(actualInstanceLiteralTokenResult.getParent());
    Token expectedStart = actualInstanceLiteralTokenResult.start;
    Token start = actualInstanceLiteralTokenResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceLiteralTokenResult.getStop());
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
    assertNull(graphFetchTreeParserGrammar.getRuleContext());
    assertEquals(-1, graphFetchTreeParserGrammar.getState());
  }

  @Test
  public void testInstanceLiteralTokenContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.InstanceLiteralTokenContext instanceLiteralTokenContext = new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceLiteralTokenContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceLiteralTokenContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.InstanceLiteralTokenContext instanceLiteralTokenContext = new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(
        new ParserRuleContext(), 1);
    instanceLiteralTokenContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceLiteralTokenContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceLiteralTokenContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testInstanceLiteralTokenContextDATE() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).DATE());
  }

  @Test
  public void testInstanceLiteralTokenContextDECIMAL() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).DECIMAL());
  }

  @Test
  public void testInstanceLiteralTokenContextFLOAT() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).FLOAT());
  }

  @Test
  public void testInstanceLiteralTokenContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(12,
        (new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testInstanceLiteralTokenContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testInstanceLiteralTokenContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testPackagePath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    GraphFetchTreeParserGrammar.PackagePathContext actualPackagePathResult = (new GraphFetchTreeParserGrammar(
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
    assertSame(start, ((GraphFetchTreeParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((GraphFetchTreeParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((GraphFetchTreeParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((GraphFetchTreeParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePath2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    GraphFetchTreeParserGrammar.PackagePathContext actualPackagePathResult = (new GraphFetchTreeParserGrammar(
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
    assertSame(start, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((GraphFetchTreeParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(36, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath3() throws RecognitionException {
    // Arrange and Act
    GraphFetchTreeParserGrammar.PackagePathContext actualPackagePathResult = (new GraphFetchTreeParserGrammar(
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
    assertSame(start, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((GraphFetchTreeParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(36, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath4() throws RecognitionException {
    // Arrange and Act
    GraphFetchTreeParserGrammar.PackagePathContext actualPackagePathResult = (new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("([] [141])", actualPackagePathResult.toStringTree());
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
    assertEquals(141, ((GraphFetchTreeParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testPackagePath5() throws RecognitionException {
    // Arrange
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    graphFetchTreeParserGrammar.setTrace(true);

    // Act
    GraphFetchTreeParserGrammar.PackagePathContext actualPackagePathResult = graphFetchTreeParserGrammar.packagePath();

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
    assertSame(start, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((GraphFetchTreeParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((GraphFetchTreeParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(36, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(listTokenSource));
    graphFetchTreeParserGrammar.setTrace(true);

    // Act
    GraphFetchTreeParserGrammar.PackagePathContext actualPackagePathResult = graphFetchTreeParserGrammar.packagePath();

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
    assertSame(start, ((GraphFetchTreeParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((GraphFetchTreeParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((GraphFetchTreeParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((GraphFetchTreeParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePathContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.PackagePathContext packagePathContext = new GraphFetchTreeParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.PackagePathContext packagePathContext = new GraphFetchTreeParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(16, (new GraphFetchTreeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPackagePathContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue((new GraphFetchTreeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new GraphFetchTreeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPackagePathContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertTrue(
        (new GraphFetchTreeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR().isEmpty());
    assertNull((new GraphFetchTreeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR(1));
  }

  @Test
  public void testParameter() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.ParameterContext actualParameterResult = graphFetchTreeParserGrammar.parameter();

    // Assert
    RecognitionException recognitionException = actualParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualParameterResult.invokingState);
    assertNull(actualParameterResult.getParent());
    Token expectedStart = actualParameterResult.start;
    Token start = actualParameterResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualParameterResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(89, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualParameterResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testParameterContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.ParameterContext parameterContext = new GraphFetchTreeParserGrammar.ParameterContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(parameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testParameterContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.ParameterContext parameterContext = new GraphFetchTreeParserGrammar.ParameterContext(
        new ParserRuleContext(), 1);
    parameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(parameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testParameterContextCollectionParameter() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.ParameterContext(new ParserRuleContext(), 1)).collectionParameter());
  }

  @Test
  public void testParameterContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(8, (new GraphFetchTreeParserGrammar.ParameterContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testParameterContextScalarParameter() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.ParameterContext(new ParserRuleContext(), 1)).scalarParameter());
  }

  @Test
  public void testPropertyParameters() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.PropertyParametersContext actualPropertyParametersResult = graphFetchTreeParserGrammar
        .propertyParameters();

    // Assert
    RecognitionException recognitionException = actualPropertyParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualPropertyParametersResult.invokingState);
    assertNull(actualPropertyParametersResult.getParent());
    Token expectedStart = actualPropertyParametersResult.start;
    Token start = actualPropertyParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPropertyParametersResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(70, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualPropertyParametersResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testPropertyParametersContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.PropertyParametersContext propertyParametersContext = new GraphFetchTreeParserGrammar.PropertyParametersContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(propertyParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyParametersContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.PropertyParametersContext propertyParametersContext = new GraphFetchTreeParserGrammar.PropertyParametersContext(
        new ParserRuleContext(), 1);
    propertyParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(propertyParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyParametersContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new GraphFetchTreeParserGrammar.PropertyParametersContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new GraphFetchTreeParserGrammar.PropertyParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testPropertyParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(6,
        (new GraphFetchTreeParserGrammar.PropertyParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPropertyParametersContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.PropertyParametersContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testPropertyParametersContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.PropertyParametersContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testPropertyParametersContextParameter() {
    // Arrange, Act and Assert
    assertTrue(
        (new GraphFetchTreeParserGrammar.PropertyParametersContext(new ParserRuleContext(), 1)).parameter().isEmpty());
    assertNull((new GraphFetchTreeParserGrammar.PropertyParametersContext(new ParserRuleContext(), 1)).parameter(1));
  }

  @Test
  public void testQualifiedName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.QualifiedNameContext actualQualifiedNameResult = graphFetchTreeParserGrammar
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
    assertEquals(137, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
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
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.QualifiedNameContext actualQualifiedNameResult = graphFetchTreeParserGrammar
        .qualifiedName();

    // Assert
    RecognitionException recognitionException = actualQualifiedNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    Token expectedStart = actualQualifiedNameResult.stop;
    Token start = actualQualifiedNameResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualQualifiedNameResult.getStop());
    assertEquals("null", actualQualifiedNameResult.getText());
    assertEquals(1, actualQualifiedNameResult.getChildCount());
    assertTrue(actualQualifiedNameResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(137, recognitionException.getOffendingState());
    assertSame(actualQualifiedNameResult, recognitionException.getCtx());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(1, inputStream.index());
    assertEquals("List", inputStream.getSourceName());
  }

  @Test
  public void testQualifiedNameContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.QualifiedNameContext qualifiedNameContext = new GraphFetchTreeParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.QualifiedNameContext qualifiedNameContext = new GraphFetchTreeParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(15, (new GraphFetchTreeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testQualifiedNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testQualifiedNameContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testQualifiedNameContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testScalarParameter() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.ScalarParameterContext actualScalarParameterResult = graphFetchTreeParserGrammar
        .scalarParameter();

    // Assert
    RecognitionException recognitionException = actualScalarParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualScalarParameterResult.invokingState);
    assertNull(actualScalarParameterResult.getParent());
    Token expectedStart = actualScalarParameterResult.start;
    Token start = actualScalarParameterResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualScalarParameterResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(95, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualScalarParameterResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testScalarParameterContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.ScalarParameterContext scalarParameterContext = new GraphFetchTreeParserGrammar.ScalarParameterContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(scalarParameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testScalarParameterContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.ScalarParameterContext scalarParameterContext = new GraphFetchTreeParserGrammar.ScalarParameterContext(
        new ParserRuleContext(), 1);
    scalarParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(scalarParameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testScalarParameterContextEnumReference() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.ScalarParameterContext(new ParserRuleContext(), 1)).enumReference());
  }

  @Test
  public void testScalarParameterContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(9,
        (new GraphFetchTreeParserGrammar.ScalarParameterContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testScalarParameterContextInstanceLiteral() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.ScalarParameterContext(new ParserRuleContext(), 1)).instanceLiteral());
  }

  @Test
  public void testScalarParameterContextLATEST_DATE() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.ScalarParameterContext(new ParserRuleContext(), 1)).LATEST_DATE());
  }

  @Test
  public void testScalarParameterContextVariable() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.ScalarParameterContext(new ParserRuleContext(), 1)).variable());
  }

  @Test
  public void testSubtype() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.SubtypeContext actualSubtypeResult = graphFetchTreeParserGrammar.subtype();

    // Assert
    RecognitionException recognitionException = actualSubtypeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualSubtypeResult.invokingState);
    assertNull(actualSubtypeResult.getParent());
    Token expectedStart = actualSubtypeResult.start;
    Token start = actualSubtypeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSubtypeResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(83, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualSubtypeResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testSubtype2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));

    // Act
    GraphFetchTreeParserGrammar.SubtypeContext actualSubtypeResult = (new GraphFetchTreeParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).subtype();

    // Assert
    assertEquals(-1, actualSubtypeResult.invokingState);
    List<ParseTree> parseTreeList = actualSubtypeResult.children;
    assertEquals(3, parseTreeList.size());
    assertNull(actualSubtypeResult.getParent());
    Token token = actualSubtypeResult.stop;
    Token start = actualSubtypeResult.getStart();
    assertSame(token, start);
    assertSame(token, actualSubtypeResult.getStop());
    assertEquals("<EOF><missing ')'>", actualSubtypeResult.getText());
    assertEquals(3, actualSubtypeResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, ((GraphFetchTreeParserGrammar.QualifiedNameContext) parseTreeList.get(1)).getStop());
    assertTrue(((GraphFetchTreeParserGrammar.QualifiedNameContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    ParseTree getResult = parseTreeList.get(2);
    assertEquals("<missing ')'>", getResult.getText());
    assertEquals("<missing ')'>", getResult.toString());
    assertSame(actualSubtypeResult, getResult.getParent());
    assertTrue(
        ((GraphFetchTreeParserGrammar.QualifiedNameContext) parseTreeList.get(1)).getStart() instanceof CommonToken);
    assertEquals(84, ((GraphFetchTreeParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
    assertEquals(2, ((GraphFetchTreeParserGrammar.QualifiedNameContext) parseTreeList.get(1)).depth());
  }

  @Test
  public void testSubtypeContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.SubtypeContext subtypeContext = new GraphFetchTreeParserGrammar.SubtypeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(subtypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSubtypeContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.SubtypeContext subtypeContext = new GraphFetchTreeParserGrammar.SubtypeContext(
        new ParserRuleContext(), 1);
    subtypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(subtypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSubtypeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(7, (new GraphFetchTreeParserGrammar.SubtypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSubtypeContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.SubtypeContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testSubtypeContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.SubtypeContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testSubtypeContextSUBTYPE_START() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.SubtypeContext(new ParserRuleContext(), 1)).SUBTYPE_START());
  }

  @Test
  public void testVariable() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.VariableContext actualVariableResult = graphFetchTreeParserGrammar.variable();

    // Assert
    RecognitionException recognitionException = actualVariableResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualVariableResult.invokingState);
    assertNull(actualVariableResult.getParent());
    Token expectedStart = actualVariableResult.start;
    Token start = actualVariableResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualVariableResult.getStop());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(127, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualVariableResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testVariableContextAccept() {
    // Arrange
    GraphFetchTreeParserGrammar.VariableContext variableContext = new GraphFetchTreeParserGrammar.VariableContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(variableContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testVariableContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.VariableContext variableContext = new GraphFetchTreeParserGrammar.VariableContext(
        new ParserRuleContext(), 1);
    variableContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(variableContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testVariableContextDOLLAR() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.VariableContext(new ParserRuleContext(), 1)).DOLLAR());
  }

  @Test
  public void testVariableContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(13, (new GraphFetchTreeParserGrammar.VariableContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testVariableContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.VariableContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testWord() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    GraphFetchTreeParserGrammar graphFetchTreeParserGrammar = new GraphFetchTreeParserGrammar(bufferedTokenStream);

    // Act
    GraphFetchTreeParserGrammar.WordContext actualWordResult = graphFetchTreeParserGrammar.word();

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
    assertEquals(152, recognitionException.getOffendingState());
    assertSame(graphFetchTreeParserGrammar, recognitionException.getRecognizer());
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
    GraphFetchTreeParserGrammar.WordContext wordContext = new GraphFetchTreeParserGrammar.WordContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextAccept2() {
    // Arrange
    GraphFetchTreeParserGrammar.WordContext wordContext = new GraphFetchTreeParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.WordContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testWordContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(17, (new GraphFetchTreeParserGrammar.WordContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testWordContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.WordContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testWordContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new GraphFetchTreeParserGrammar.WordContext(new ParserRuleContext(), 1)).identifier());
  }
}

