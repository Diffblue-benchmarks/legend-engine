package org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.aggregationAware;

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
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPathLexer;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.CodeParserGrammarBaseVisitor;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.ConnectionLexerGrammar;
import org.junit.Test;

public class AggregationAwareParserGrammarDiffblueTest {
  @Test
  public void testAggregateSpecification() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AggregateSpecificationContext actualAggregateSpecificationResult = aggregationAwareParserGrammar
        .aggregateSpecification();

    // Assert
    RecognitionException recognitionException = actualAggregateSpecificationResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAggregateSpecificationResult.invokingState);
    assertNull(actualAggregateSpecificationResult.getParent());
    Token expectedStart = actualAggregateSpecificationResult.start;
    Token start = actualAggregateSpecificationResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAggregateSpecificationResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(166, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAggregateSpecificationResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAggregateSpecification2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AggregateSpecificationContext actualAggregateSpecificationResult = aggregationAwareParserGrammar
        .aggregateSpecification();

    // Assert
    RecognitionException recognitionException = actualAggregateSpecificationResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAggregateSpecificationResult.children.size());
    assertNull(actualAggregateSpecificationResult.getParent());
    Token expectedStart = actualAggregateSpecificationResult.stop;
    Token start = actualAggregateSpecificationResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAggregateSpecificationResult.getStop());
    assertEquals("null", actualAggregateSpecificationResult.getText());
    assertEquals(1, actualAggregateSpecificationResult.getChildCount());
    assertTrue(actualAggregateSpecificationResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(167, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualAggregateSpecificationResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAggregateSpecification3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AggregateSpecificationContext actualAggregateSpecificationResult = aggregationAwareParserGrammar
        .aggregateSpecification();

    // Assert
    RecognitionException recognitionException = actualAggregateSpecificationResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(2, actualAggregateSpecificationResult.children.size());
    assertNull(actualAggregateSpecificationResult.getParent());
    Token expectedStart = actualAggregateSpecificationResult.start;
    Token start = actualAggregateSpecificationResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualAggregateSpecificationResult.stop;
    Token stop = actualAggregateSpecificationResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualAggregateSpecificationResult.getText());
    assertEquals(2, actualAggregateSpecificationResult.getChildCount());
    assertTrue(actualAggregateSpecificationResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(167, recognitionException.getOffendingState());
    assertSame(stop, recognitionException.getOffendingToken());
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualAggregateSpecificationResult, recognitionException.getCtx());
  }

  @Test
  public void testAggregateSpecification4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(16));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AggregateSpecificationContext actualAggregateSpecificationResult = aggregationAwareParserGrammar
        .aggregateSpecification();

    // Assert
    RecognitionException recognitionException = actualAggregateSpecificationResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(2, actualAggregateSpecificationResult.children.size());
    assertNull(actualAggregateSpecificationResult.getParent());
    Token expectedStart = actualAggregateSpecificationResult.start;
    Token start = actualAggregateSpecificationResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualAggregateSpecificationResult.stop;
    Token stop = actualAggregateSpecificationResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualAggregateSpecificationResult.getText());
    assertEquals(2, actualAggregateSpecificationResult.getChildCount());
    assertTrue(actualAggregateSpecificationResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(168, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualAggregateSpecificationResult, recognitionException.getCtx());
  }

  @Test
  public void testAggregateSpecification5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(16));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.AggregateSpecificationContext actualAggregateSpecificationResult = aggregationAwareParserGrammar
        .aggregateSpecification();

    // Assert
    RecognitionException recognitionException = actualAggregateSpecificationResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(2, actualAggregateSpecificationResult.children.size());
    assertNull(actualAggregateSpecificationResult.getParent());
    Token expectedStart = actualAggregateSpecificationResult.start;
    Token start = actualAggregateSpecificationResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualAggregateSpecificationResult.stop;
    Token stop = actualAggregateSpecificationResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualAggregateSpecificationResult.getText());
    assertEquals(2, actualAggregateSpecificationResult.getChildCount());
    assertTrue(actualAggregateSpecificationResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(168, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualAggregateSpecificationResult, recognitionException.getCtx());
  }

  @Test
  public void testAggregateSpecificationContextAGGREGATE_VALUES() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1))
        .AGGREGATE_VALUES());
  }

  @Test
  public void testAggregateSpecificationContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.AggregateSpecificationContext aggregateSpecificationContext = new AggregationAwareParserGrammar.AggregateSpecificationContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(aggregateSpecificationContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAggregateSpecificationContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.AggregateSpecificationContext aggregateSpecificationContext = new AggregationAwareParserGrammar.AggregateSpecificationContext(
        new ParserRuleContext(), 1);
    aggregateSpecificationContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregateSpecificationContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAggregateSpecificationContextAggregationFunctionSpecifications() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1))
        .aggregationFunctionSpecifications());
  }

  @Test
  public void testAggregateSpecificationContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testAggregateSpecificationContextCAN_AGGREGATE() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1)).CAN_AGGREGATE());
  }

  @Test
  public void testAggregateSpecificationContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1)).COMMA()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testAggregateSpecificationContextGROUP_BY_FUNCTIONS() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1))
        .GROUP_BY_FUNCTIONS());
  }

  @Test
  public void testAggregateSpecificationContextGroupByFunctionSpecifications() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1))
        .groupByFunctionSpecifications());
  }

  @Test
  public void testAggregateSpecificationContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1)).PAREN_CLOSE()
            .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1)).PAREN_CLOSE(1));
  }

  @Test
  public void testAggregateSpecificationContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1)).PAREN_OPEN()
            .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.AggregateSpecificationContext(new ParserRuleContext(), 1)).PAREN_OPEN(1));
  }

  @Test
  public void testAggregationFunctionSpecification() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AggregationFunctionSpecificationContext actualAggregationFunctionSpecificationResult = aggregationAwareParserGrammar
        .aggregationFunctionSpecification();

    // Assert
    RecognitionException recognitionException = actualAggregationFunctionSpecificationResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAggregationFunctionSpecificationResult.invokingState);
    assertNull(actualAggregationFunctionSpecificationResult.getParent());
    Token expectedStart = actualAggregationFunctionSpecificationResult.start;
    Token start = actualAggregationFunctionSpecificationResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAggregationFunctionSpecificationResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(201, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAggregationFunctionSpecificationResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAggregationFunctionSpecification2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AggregationFunctionSpecificationContext actualAggregationFunctionSpecificationResult = aggregationAwareParserGrammar
        .aggregationFunctionSpecification();

    // Assert
    RecognitionException recognitionException = actualAggregationFunctionSpecificationResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAggregationFunctionSpecificationResult.children.size());
    assertNull(actualAggregationFunctionSpecificationResult.getParent());
    Token expectedStart = actualAggregationFunctionSpecificationResult.stop;
    Token start = actualAggregationFunctionSpecificationResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAggregationFunctionSpecificationResult.getStop());
    assertEquals("null", actualAggregationFunctionSpecificationResult.getText());
    assertEquals(1, actualAggregationFunctionSpecificationResult.getChildCount());
    assertTrue(actualAggregationFunctionSpecificationResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(201, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAggregationFunctionSpecificationResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAggregationFunctionSpecification3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(41));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AggregationFunctionSpecificationContext actualAggregationFunctionSpecificationResult = aggregationAwareParserGrammar
        .aggregationFunctionSpecification();

    // Assert
    RecognitionException recognitionException = actualAggregationFunctionSpecificationResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAggregationFunctionSpecificationResult.children.size());
    assertNull(actualAggregationFunctionSpecificationResult.getParent());
    Token expectedStart = actualAggregationFunctionSpecificationResult.stop;
    Token start = actualAggregationFunctionSpecificationResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAggregationFunctionSpecificationResult.getStop());
    assertEquals("null", actualAggregationFunctionSpecificationResult.getText());
    assertEquals(1, actualAggregationFunctionSpecificationResult.getChildCount());
    assertTrue(actualAggregationFunctionSpecificationResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(202, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualAggregationFunctionSpecificationResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAggregationFunctionSpecificationContextAGGREGATE_FN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1))
        .AGGREGATE_FN());
  }

  @Test
  public void testAggregationFunctionSpecificationContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.AggregationFunctionSpecificationContext aggregationFunctionSpecificationContext = new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(aggregationFunctionSpecificationContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAggregationFunctionSpecificationContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.AggregationFunctionSpecificationContext aggregationFunctionSpecificationContext = new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(
        new ParserRuleContext(), 1);
    aggregationFunctionSpecificationContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationFunctionSpecificationContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAggregationFunctionSpecificationContextCOLON() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1)).COLON()
            .isEmpty());
    assertNull((new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1))
        .COLON(1));
  }

  @Test
  public void testAggregationFunctionSpecificationContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1))
        .COMMA());
  }

  @Test
  public void testAggregationFunctionSpecificationContextCombinedExpression() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1))
        .combinedExpression()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1))
        .combinedExpression(1));
  }

  @Test
  public void testAggregationFunctionSpecificationContextMAP_FN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1))
        .MAP_FN());
  }

  @Test
  public void testAggregationFunctionSpecificationContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1))
        .PAREN_CLOSE());
  }

  @Test
  public void testAggregationFunctionSpecificationContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AggregationFunctionSpecificationContext(new ParserRuleContext(), 1))
        .PAREN_OPEN());
  }

  @Test
  public void testAggregationFunctionSpecifications() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext actualAggregationFunctionSpecificationsResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).aggregationFunctionSpecifications();

    // Assert
    assertEquals(-1, actualAggregationFunctionSpecificationsResult.invokingState);
    List<ParseTree> parseTreeList = actualAggregationFunctionSpecificationsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualAggregationFunctionSpecificationsResult.getParent());
    Token expectedStart = actualAggregationFunctionSpecificationsResult.start;
    Token start = actualAggregationFunctionSpecificationsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAggregationFunctionSpecificationsResult.getStop());
    assertEquals(1, actualAggregationFunctionSpecificationsResult.getChildCount());
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
    assertSame(start,
        ((AggregationAwareParserGrammar.AggregationFunctionSpecificationContext) parseTreeList.get(0)).getStart());
    assertEquals(2,
        ((AggregationAwareParserGrammar.AggregationFunctionSpecificationContext) parseTreeList.get(0)).depth());
    assertFalse(
        ((AggregationAwareParserGrammar.AggregationFunctionSpecificationContext) parseTreeList.get(0)).isEmpty());
    assertNull(
        ((AggregationAwareParserGrammar.AggregationFunctionSpecificationContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    RecognitionException recognitionException = ((AggregationAwareParserGrammar.AggregationFunctionSpecificationContext) parseTreeList
        .get(0)).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(parseTreeList.get(0), recognitionException.getCtx());
  }

  @Test
  public void testAggregationFunctionSpecificationsContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext aggregationFunctionSpecificationsContext = new AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(aggregationFunctionSpecificationsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAggregationFunctionSpecificationsContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext aggregationFunctionSpecificationsContext = new AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext(
        new ParserRuleContext(), 1);
    aggregationFunctionSpecificationsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(aggregationFunctionSpecificationsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAggregationFunctionSpecificationsContextAggregationFunctionSpecification() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext(new ParserRuleContext(), 1))
        .aggregationFunctionSpecification()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext(new ParserRuleContext(), 1))
        .aggregationFunctionSpecification(1));
  }

  @Test
  public void testAggregationFunctionSpecificationsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext(new ParserRuleContext(), 1)).COMMA()
            .isEmpty());
    assertNull((new AggregationAwareParserGrammar.AggregationFunctionSpecificationsContext(new ParserRuleContext(), 1))
        .COMMA(1));
  }

  @Test
  public void testAllFunction() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllFunctionContext actualAllFunctionResult = aggregationAwareParserGrammar
        .allFunction();

    // Assert
    RecognitionException recognitionException = actualAllFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAllFunctionResult.invokingState);
    assertNull(actualAllFunctionResult.getParent());
    Token expectedStart = actualAllFunctionResult.start;
    Token start = actualAllFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAllFunctionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(489, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAllFunctionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAllFunction2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllFunctionContext actualAllFunctionResult = aggregationAwareParserGrammar
        .allFunction();

    // Assert
    RecognitionException recognitionException = actualAllFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAllFunctionResult.children.size());
    assertNull(actualAllFunctionResult.getParent());
    Token expectedStart = actualAllFunctionResult.stop;
    Token start = actualAllFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAllFunctionResult.getStop());
    assertEquals("null", actualAllFunctionResult.getText());
    assertEquals(1, actualAllFunctionResult.getChildCount());
    assertTrue(actualAllFunctionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(489, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAllFunctionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAllFunction3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(44));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllFunctionContext actualAllFunctionResult = aggregationAwareParserGrammar
        .allFunction();

    // Assert
    RecognitionException recognitionException = actualAllFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAllFunctionResult.children.size());
    assertNull(actualAllFunctionResult.getParent());
    Token expectedStart = actualAllFunctionResult.stop;
    Token start = actualAllFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAllFunctionResult.getStop());
    assertEquals("null", actualAllFunctionResult.getText());
    assertEquals(1, actualAllFunctionResult.getChildCount());
    assertTrue(actualAllFunctionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(490, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualAllFunctionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAllFunctionContextALL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllFunctionContext(new ParserRuleContext(), 1)).ALL());
  }

  @Test
  public void testAllFunctionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.AllFunctionContext allFunctionContext = new AggregationAwareParserGrammar.AllFunctionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(allFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllFunctionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.AllFunctionContext allFunctionContext = new AggregationAwareParserGrammar.AllFunctionContext(
        new ParserRuleContext(), 1);
    allFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(allFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllFunctionContextDOT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllFunctionContext(new ParserRuleContext(), 1)).DOT());
  }

  @Test
  public void testAllFunctionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(39, (new AggregationAwareParserGrammar.AllFunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testAllFunctionContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllFunctionContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testAllFunctionContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllFunctionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testAllFunctionWithMilestoning() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllFunctionWithMilestoningContext actualAllFunctionWithMilestoningResult = aggregationAwareParserGrammar
        .allFunctionWithMilestoning();

    // Assert
    RecognitionException recognitionException = actualAllFunctionWithMilestoningResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAllFunctionWithMilestoningResult.invokingState);
    assertNull(actualAllFunctionWithMilestoningResult.getParent());
    Token expectedStart = actualAllFunctionWithMilestoningResult.start;
    Token start = actualAllFunctionWithMilestoningResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAllFunctionWithMilestoningResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(507, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAllFunctionWithMilestoningResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAllFunctionWithMilestoning2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllFunctionWithMilestoningContext actualAllFunctionWithMilestoningResult = aggregationAwareParserGrammar
        .allFunctionWithMilestoning();

    // Assert
    RecognitionException recognitionException = actualAllFunctionWithMilestoningResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAllFunctionWithMilestoningResult.children.size());
    assertNull(actualAllFunctionWithMilestoningResult.getParent());
    Token expectedStart = actualAllFunctionWithMilestoningResult.stop;
    Token start = actualAllFunctionWithMilestoningResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAllFunctionWithMilestoningResult.getStop());
    assertEquals("null", actualAllFunctionWithMilestoningResult.getText());
    assertEquals(1, actualAllFunctionWithMilestoningResult.getChildCount());
    assertTrue(actualAllFunctionWithMilestoningResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(507, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAllFunctionWithMilestoningResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAllFunctionWithMilestoning3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(44));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllFunctionWithMilestoningContext actualAllFunctionWithMilestoningResult = aggregationAwareParserGrammar
        .allFunctionWithMilestoning();

    // Assert
    RecognitionException recognitionException = actualAllFunctionWithMilestoningResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAllFunctionWithMilestoningResult.children.size());
    assertNull(actualAllFunctionWithMilestoningResult.getParent());
    Token expectedStart = actualAllFunctionWithMilestoningResult.stop;
    Token start = actualAllFunctionWithMilestoningResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAllFunctionWithMilestoningResult.getStop());
    assertEquals("null", actualAllFunctionWithMilestoningResult.getText());
    assertEquals(1, actualAllFunctionWithMilestoningResult.getChildCount());
    assertTrue(actualAllFunctionWithMilestoningResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(508, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualAllFunctionWithMilestoningResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAllFunctionWithMilestoningContextALL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1)).ALL());
  }

  @Test
  public void testAllFunctionWithMilestoningContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.AllFunctionWithMilestoningContext allFunctionWithMilestoningContext = new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(allFunctionWithMilestoningContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllFunctionWithMilestoningContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.AllFunctionWithMilestoningContext allFunctionWithMilestoningContext = new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(
        new ParserRuleContext(), 1);
    allFunctionWithMilestoningContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(allFunctionWithMilestoningContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllFunctionWithMilestoningContextBuildMilestoningVariableExpression() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1))
        .buildMilestoningVariableExpression()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1))
        .buildMilestoningVariableExpression(1));
  }

  @Test
  public void testAllFunctionWithMilestoningContextCOMMA() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1)).COMMA());
  }

  @Test
  public void testAllFunctionWithMilestoningContextDOT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1)).DOT());
  }

  @Test
  public void testAllFunctionWithMilestoningContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(42, (new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testAllFunctionWithMilestoningContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1))
        .PAREN_CLOSE());
  }

  @Test
  public void testAllFunctionWithMilestoningContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AllFunctionWithMilestoningContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testAllOrFunction() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllOrFunctionContext actualAllOrFunctionResult = aggregationAwareParserGrammar
        .allOrFunction();

    // Assert
    RecognitionException recognitionException = actualAllOrFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAllOrFunctionResult.invokingState);
    assertNull(actualAllOrFunctionResult.getParent());
    Token expectedStart = actualAllOrFunctionResult.start;
    Token start = actualAllOrFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAllOrFunctionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(487, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAllOrFunctionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAllOrFunctionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.AllOrFunctionContext allOrFunctionContext = new AggregationAwareParserGrammar.AllOrFunctionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(allOrFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllOrFunctionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.AllOrFunctionContext allOrFunctionContext = new AggregationAwareParserGrammar.AllOrFunctionContext(
        new ParserRuleContext(), 1);
    allOrFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(allOrFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllOrFunctionContextAllFunction() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1)).allFunction());
  }

  @Test
  public void testAllOrFunctionContextAllFunctionWithMilestoning() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1))
        .allFunctionWithMilestoning());
  }

  @Test
  public void testAllOrFunctionContextAllVersionsFunction() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1)).allVersionsFunction());
  }

  @Test
  public void testAllOrFunctionContextAllVersionsInRangeFunction() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1))
        .allVersionsInRangeFunction());
  }

  @Test
  public void testAllOrFunctionContextFunctionExpressionParameters() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1))
        .functionExpressionParameters());
  }

  @Test
  public void testAllOrFunctionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(38,
        (new AggregationAwareParserGrammar.AllOrFunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testAllVersionsFunction() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllVersionsFunctionContext actualAllVersionsFunctionResult = aggregationAwareParserGrammar
        .allVersionsFunction();

    // Assert
    RecognitionException recognitionException = actualAllVersionsFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAllVersionsFunctionResult.invokingState);
    assertNull(actualAllVersionsFunctionResult.getParent());
    Token expectedStart = actualAllVersionsFunctionResult.start;
    Token start = actualAllVersionsFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAllVersionsFunctionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(494, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAllVersionsFunctionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAllVersionsFunction2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllVersionsFunctionContext actualAllVersionsFunctionResult = aggregationAwareParserGrammar
        .allVersionsFunction();

    // Assert
    RecognitionException recognitionException = actualAllVersionsFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAllVersionsFunctionResult.children.size());
    assertNull(actualAllVersionsFunctionResult.getParent());
    Token expectedStart = actualAllVersionsFunctionResult.stop;
    Token start = actualAllVersionsFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAllVersionsFunctionResult.getStop());
    assertEquals("null", actualAllVersionsFunctionResult.getText());
    assertEquals(1, actualAllVersionsFunctionResult.getChildCount());
    assertTrue(actualAllVersionsFunctionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(494, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAllVersionsFunctionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAllVersionsFunction3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(44));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllVersionsFunctionContext actualAllVersionsFunctionResult = aggregationAwareParserGrammar
        .allVersionsFunction();

    // Assert
    RecognitionException recognitionException = actualAllVersionsFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAllVersionsFunctionResult.children.size());
    assertNull(actualAllVersionsFunctionResult.getParent());
    Token expectedStart = actualAllVersionsFunctionResult.stop;
    Token start = actualAllVersionsFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAllVersionsFunctionResult.getStop());
    assertEquals("null", actualAllVersionsFunctionResult.getText());
    assertEquals(1, actualAllVersionsFunctionResult.getChildCount());
    assertTrue(actualAllVersionsFunctionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(495, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualAllVersionsFunctionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAllVersionsFunctionContextALL_VERSIONS() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AllVersionsFunctionContext(new ParserRuleContext(), 1)).ALL_VERSIONS());
  }

  @Test
  public void testAllVersionsFunctionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.AllVersionsFunctionContext allVersionsFunctionContext = new AggregationAwareParserGrammar.AllVersionsFunctionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(allVersionsFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllVersionsFunctionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.AllVersionsFunctionContext allVersionsFunctionContext = new AggregationAwareParserGrammar.AllVersionsFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(allVersionsFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllVersionsFunctionContextDOT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllVersionsFunctionContext(new ParserRuleContext(), 1)).DOT());
  }

  @Test
  public void testAllVersionsFunctionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(40,
        (new AggregationAwareParserGrammar.AllVersionsFunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testAllVersionsFunctionContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AllVersionsFunctionContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testAllVersionsFunctionContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllVersionsFunctionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testAllVersionsInRangeFunction() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext actualAllVersionsInRangeFunctionResult = aggregationAwareParserGrammar
        .allVersionsInRangeFunction();

    // Assert
    RecognitionException recognitionException = actualAllVersionsInRangeFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAllVersionsInRangeFunctionResult.invokingState);
    assertNull(actualAllVersionsInRangeFunctionResult.getParent());
    Token expectedStart = actualAllVersionsInRangeFunctionResult.start;
    Token start = actualAllVersionsInRangeFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAllVersionsInRangeFunctionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(499, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAllVersionsInRangeFunctionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAllVersionsInRangeFunction2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext actualAllVersionsInRangeFunctionResult = aggregationAwareParserGrammar
        .allVersionsInRangeFunction();

    // Assert
    RecognitionException recognitionException = actualAllVersionsInRangeFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAllVersionsInRangeFunctionResult.children.size());
    assertNull(actualAllVersionsInRangeFunctionResult.getParent());
    Token expectedStart = actualAllVersionsInRangeFunctionResult.stop;
    Token start = actualAllVersionsInRangeFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAllVersionsInRangeFunctionResult.getStop());
    assertEquals("null", actualAllVersionsInRangeFunctionResult.getText());
    assertEquals(1, actualAllVersionsInRangeFunctionResult.getChildCount());
    assertTrue(actualAllVersionsInRangeFunctionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(499, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualAllVersionsInRangeFunctionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAllVersionsInRangeFunction3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(44));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext actualAllVersionsInRangeFunctionResult = aggregationAwareParserGrammar
        .allVersionsInRangeFunction();

    // Assert
    RecognitionException recognitionException = actualAllVersionsInRangeFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualAllVersionsInRangeFunctionResult.children.size());
    assertNull(actualAllVersionsInRangeFunctionResult.getParent());
    Token expectedStart = actualAllVersionsInRangeFunctionResult.stop;
    Token start = actualAllVersionsInRangeFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualAllVersionsInRangeFunctionResult.getStop());
    assertEquals("null", actualAllVersionsInRangeFunctionResult.getText());
    assertEquals(1, actualAllVersionsInRangeFunctionResult.getChildCount());
    assertTrue(actualAllVersionsInRangeFunctionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(500, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualAllVersionsInRangeFunctionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testAllVersionsInRangeFunctionContextALL_VERSIONS_IN_RANGE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1))
        .ALL_VERSIONS_IN_RANGE());
  }

  @Test
  public void testAllVersionsInRangeFunctionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext allVersionsInRangeFunctionContext = new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(allVersionsInRangeFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllVersionsInRangeFunctionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext allVersionsInRangeFunctionContext = new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(
        new ParserRuleContext(), 1);
    allVersionsInRangeFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(allVersionsInRangeFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAllVersionsInRangeFunctionContextBuildMilestoningVariableExpression() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1))
        .buildMilestoningVariableExpression()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1))
        .buildMilestoningVariableExpression(1));
  }

  @Test
  public void testAllVersionsInRangeFunctionContextCOMMA() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1)).COMMA());
  }

  @Test
  public void testAllVersionsInRangeFunctionContextDOT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1)).DOT());
  }

  @Test
  public void testAllVersionsInRangeFunctionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(41, (new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testAllVersionsInRangeFunctionContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1))
        .PAREN_CLOSE());
  }

  @Test
  public void testAllVersionsInRangeFunctionContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AllVersionsInRangeFunctionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testArithmeticPart() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ArithmeticPartContext actualArithmeticPartResult = aggregationAwareParserGrammar
        .arithmeticPart();

    // Assert
    RecognitionException recognitionException = actualArithmeticPartResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualArithmeticPartResult.invokingState);
    assertNull(actualArithmeticPartResult.getParent());
    Token expectedStart = actualArithmeticPartResult.start;
    Token start = actualArithmeticPartResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualArithmeticPartResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(690, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualArithmeticPartResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testArithmeticPartContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ArithmeticPartContext arithmeticPartContext = new AggregationAwareParserGrammar.ArithmeticPartContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(arithmeticPartContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testArithmeticPartContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ArithmeticPartContext arithmeticPartContext = new AggregationAwareParserGrammar.ArithmeticPartContext(
        new ParserRuleContext(), 1);
    arithmeticPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(arithmeticPartContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testArithmeticPartContextDIVIDE() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).DIVIDE().isEmpty());
    assertNull((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).DIVIDE(1));
  }

  @Test
  public void testArithmeticPartContextExpression() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).expression().isEmpty());
    assertNull((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testArithmeticPartContextGREATER_OR_EQUAL() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).GREATER_OR_EQUAL());
  }

  @Test
  public void testArithmeticPartContextGREATER_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).GREATER_THAN());
  }

  @Test
  public void testArithmeticPartContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(57,
        (new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testArithmeticPartContextLESS_OR_EQUAL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).LESS_OR_EQUAL());
  }

  @Test
  public void testArithmeticPartContextLESS_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).LESS_THAN());
  }

  @Test
  public void testArithmeticPartContextMINUS() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).MINUS().isEmpty());
    assertNull((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).MINUS(1));
  }

  @Test
  public void testArithmeticPartContextPLUS() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).PLUS().isEmpty());
    assertNull((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).PLUS(1));
  }

  @Test
  public void testArithmeticPartContextSTAR() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).STAR().isEmpty());
    assertNull((new AggregationAwareParserGrammar.ArithmeticPartContext(new ParserRuleContext(), 1)).STAR(1));
  }

  @Test
  public void testAtomicExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.AtomicExpressionContext actualAtomicExpressionResult = aggregationAwareParserGrammar
        .atomicExpression();

    // Assert
    RecognitionException recognitionException = actualAtomicExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualAtomicExpressionResult.invokingState);
    assertNull(actualAtomicExpressionResult.getParent());
    Token expectedStart = actualAtomicExpressionResult.start;
    Token start = actualAtomicExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualAtomicExpressionResult.getStop());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualAtomicExpressionResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(455, recognitionException.getOffendingState());
    assertNull(start.getInputStream());
    assertEquals("EOF", start.getText());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testAtomicExpressionContextAT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).AT());
  }

  @Test
  public void testAtomicExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.AtomicExpressionContext atomicExpressionContext = new AggregationAwareParserGrammar.AtomicExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(atomicExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAtomicExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.AtomicExpressionContext atomicExpressionContext = new AggregationAwareParserGrammar.AtomicExpressionContext(
        new ParserRuleContext(), 1);
    atomicExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(atomicExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testAtomicExpressionContextDsl() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).dsl());
  }

  @Test
  public void testAtomicExpressionContextExpressionInstance() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).expressionInstance());
  }

  @Test
  public void testAtomicExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(34,
        (new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testAtomicExpressionContextInstanceLiteralToken() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).instanceLiteralToken());
  }

  @Test
  public void testAtomicExpressionContextInstanceReference() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).instanceReference());
  }

  @Test
  public void testAtomicExpressionContextLambdaFunction() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).lambdaFunction());
  }

  @Test
  public void testAtomicExpressionContextLambdaParam() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).lambdaParam());
  }

  @Test
  public void testAtomicExpressionContextLambdaPipe() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).lambdaPipe());
  }

  @Test
  public void testAtomicExpressionContextType() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void testAtomicExpressionContextUnitInstance() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).unitInstance());
  }

  @Test
  public void testAtomicExpressionContextVariable() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.AtomicExpressionContext(new ParserRuleContext(), 1)).variable());
  }

  @Test
  public void testBooleanPart() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.BooleanPartContext actualBooleanPartResult = aggregationAwareParserGrammar
        .booleanPart();

    // Assert
    RecognitionException recognitionException = actualBooleanPartResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualBooleanPartResult.invokingState);
    assertNull(actualBooleanPartResult.getParent());
    Token expectedStart = actualBooleanPartResult.start;
    Token start = actualBooleanPartResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualBooleanPartResult.getStop());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(697, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualBooleanPartResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testBooleanPartContextAND() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.BooleanPartContext(new ParserRuleContext(), 1)).AND());
  }

  @Test
  public void testBooleanPartContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.BooleanPartContext booleanPartContext = new AggregationAwareParserGrammar.BooleanPartContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(booleanPartContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testBooleanPartContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.BooleanPartContext booleanPartContext = new AggregationAwareParserGrammar.BooleanPartContext(
        new ParserRuleContext(), 1);
    booleanPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(booleanPartContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testBooleanPartContextEqualNotEqual() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.BooleanPartContext(new ParserRuleContext(), 1)).equalNotEqual());
  }

  @Test
  public void testBooleanPartContextExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.BooleanPartContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void testBooleanPartContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(58, (new AggregationAwareParserGrammar.BooleanPartContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testBooleanPartContextOR() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.BooleanPartContext(new ParserRuleContext(), 1)).OR());
  }

  @Test
  public void testBuildMilestoningVariableExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext actualBuildMilestoningVariableExpressionResult = aggregationAwareParserGrammar
        .buildMilestoningVariableExpression();

    // Assert
    RecognitionException recognitionException = actualBuildMilestoningVariableExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualBuildMilestoningVariableExpressionResult.invokingState);
    assertNull(actualBuildMilestoningVariableExpressionResult.getParent());
    Token expectedStart = actualBuildMilestoningVariableExpressionResult.start;
    Token start = actualBuildMilestoningVariableExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualBuildMilestoningVariableExpressionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(520, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualBuildMilestoningVariableExpressionResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testBuildMilestoningVariableExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext buildMilestoningVariableExpressionContext = new AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(buildMilestoningVariableExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testBuildMilestoningVariableExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext buildMilestoningVariableExpressionContext = new AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext(
        new ParserRuleContext(), 1);
    buildMilestoningVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(buildMilestoningVariableExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testBuildMilestoningVariableExpressionContextDATE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext(new ParserRuleContext(), 1))
        .DATE());
  }

  @Test
  public void testBuildMilestoningVariableExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(43,
        (new AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext(new ParserRuleContext(), 1))
            .getRuleIndex());
  }

  @Test
  public void testBuildMilestoningVariableExpressionContextLATEST_DATE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext(new ParserRuleContext(), 1))
        .LATEST_DATE());
  }

  @Test
  public void testBuildMilestoningVariableExpressionContextVariable() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.BuildMilestoningVariableExpressionContext(new ParserRuleContext(), 1))
        .variable());
  }

  @Test
  public void testCodeBlock() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.CodeBlockContext actualCodeBlockResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).codeBlock();

    // Assert
    assertEquals(-1, actualCodeBlockResult.invokingState);
    List<ParseTree> parseTreeList = actualCodeBlockResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualCodeBlockResult.getParent());
    Token expectedStart = actualCodeBlockResult.start;
    Token start = actualCodeBlockResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualCodeBlockResult.getStop());
    assertEquals(1, actualCodeBlockResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.ProgramLineContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.ProgramLineContext) parseTreeList.get(0)).depth());
    assertFalse(((AggregationAwareParserGrammar.ProgramLineContext) parseTreeList.get(0)).isEmpty());
    assertNull(((AggregationAwareParserGrammar.ProgramLineContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    RecognitionException recognitionException = ((AggregationAwareParserGrammar.ProgramLineContext) parseTreeList
        .get(0)).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(parseTreeList.get(0), recognitionException.getCtx());
  }

  @Test
  public void testCodeBlockContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.CodeBlockContext codeBlockContext = new AggregationAwareParserGrammar.CodeBlockContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(codeBlockContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCodeBlockContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.CodeBlockContext codeBlockContext = new AggregationAwareParserGrammar.CodeBlockContext(
        new ParserRuleContext(), 1);
    codeBlockContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(codeBlockContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCodeBlockContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(19, (new AggregationAwareParserGrammar.CodeBlockContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testCodeBlockContextProgramLine() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.CodeBlockContext(new ParserRuleContext(), 1)).programLine().isEmpty());
    assertNull((new AggregationAwareParserGrammar.CodeBlockContext(new ParserRuleContext(), 1)).programLine(1));
  }

  @Test
  public void testCodeBlockContextSEMI_COLON() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.CodeBlockContext(new ParserRuleContext(), 1)).SEMI_COLON().isEmpty());
    assertNull((new AggregationAwareParserGrammar.CodeBlockContext(new ParserRuleContext(), 1)).SEMI_COLON(1));
  }

  @Test
  public void testCombinedArithmeticOnly() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.CombinedArithmeticOnlyContext actualCombinedArithmeticOnlyResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).combinedArithmeticOnly();

    // Assert
    assertEquals(-1, actualCombinedArithmeticOnlyResult.invokingState);
    List<ParseTree> parseTreeList = actualCombinedArithmeticOnlyResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualCombinedArithmeticOnlyResult.getParent());
    Token expectedStart = actualCombinedArithmeticOnlyResult.start;
    Token start = actualCombinedArithmeticOnlyResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualCombinedArithmeticOnlyResult.getStop());
    assertEquals(1, actualCombinedArithmeticOnlyResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).isEmpty());
    assertNull(((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals(1, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).children.size());
    assertEquals(1, tokenSource.getLine());
    assertEquals("([356] [379 356])", getResult.toStringTree());
    AggregationAwareParserGrammar.ExpressionContext expressionResult = ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult)
        .expression();
    assertTrue(expressionResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(379, expressionResult.invokingState);
  }

  @Test
  public void testCombinedArithmeticOnlyContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.CombinedArithmeticOnlyContext combinedArithmeticOnlyContext = new AggregationAwareParserGrammar.CombinedArithmeticOnlyContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(combinedArithmeticOnlyContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCombinedArithmeticOnlyContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.CombinedArithmeticOnlyContext combinedArithmeticOnlyContext = new AggregationAwareParserGrammar.CombinedArithmeticOnlyContext(
        new ParserRuleContext(), 1);
    combinedArithmeticOnlyContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(combinedArithmeticOnlyContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCombinedArithmeticOnlyContextArithmeticPart() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.CombinedArithmeticOnlyContext(new ParserRuleContext(), 1)).arithmeticPart()
            .isEmpty());
    assertNull((new AggregationAwareParserGrammar.CombinedArithmeticOnlyContext(new ParserRuleContext(), 1))
        .arithmeticPart(1));
  }

  @Test
  public void testCombinedArithmeticOnlyContextExpressionOrExpressionGroup() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.CombinedArithmeticOnlyContext(new ParserRuleContext(), 1))
        .expressionOrExpressionGroup());
  }

  @Test
  public void testCombinedArithmeticOnlyContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(22,
        (new AggregationAwareParserGrammar.CombinedArithmeticOnlyContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testCombinedExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.CombinedExpressionContext actualCombinedExpressionResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).combinedExpression();

    // Assert
    assertEquals(-1, actualCombinedExpressionResult.invokingState);
    List<ParseTree> parseTreeList = actualCombinedExpressionResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualCombinedExpressionResult.getParent());
    Token expectedStart = actualCombinedExpressionResult.start;
    Token start = actualCombinedExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualCombinedExpressionResult.getStop());
    assertEquals(1, actualCombinedExpressionResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).isEmpty());
    assertNull(((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals(1, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult).children.size());
    assertEquals(1, tokenSource.getLine());
    assertEquals("([372] [379 372])", getResult.toStringTree());
    AggregationAwareParserGrammar.ExpressionContext expressionResult = ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult)
        .expression();
    assertTrue(expressionResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(379, expressionResult.invokingState);
  }

  @Test
  public void testCombinedExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.CombinedExpressionContext combinedExpressionContext = new AggregationAwareParserGrammar.CombinedExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(combinedExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCombinedExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.CombinedExpressionContext combinedExpressionContext = new AggregationAwareParserGrammar.CombinedExpressionContext(
        new ParserRuleContext(), 1);
    combinedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(combinedExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testCombinedExpressionContextExpressionOrExpressionGroup() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.CombinedExpressionContext(new ParserRuleContext(), 1))
        .expressionOrExpressionGroup());
  }

  @Test
  public void testCombinedExpressionContextExpressionPart() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.CombinedExpressionContext(new ParserRuleContext(), 1)).expressionPart()
            .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.CombinedExpressionContext(new ParserRuleContext(), 1)).expressionPart(1));
  }

  @Test
  public void testCombinedExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(25,
        (new AggregationAwareParserGrammar.CombinedExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    AggregationAwareParserGrammar actualAggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(new ArrayList<Token>())));

    // Assert
    assertNull(actualAggregationAwareParserGrammar.getParseInfo());
    assertEquals(0, actualAggregationAwareParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualAggregationAwareParserGrammar.isMatchedEOF());
    assertNull(actualAggregationAwareParserGrammar.getContext());
    assertTrue(
        actualAggregationAwareParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualAggregationAwareParserGrammar.getPrecedence());
    assertEquals("List", actualAggregationAwareParserGrammar.getSourceName());
    assertFalse(actualAggregationAwareParserGrammar.isTrace());
    assertTrue(actualAggregationAwareParserGrammar.getBuildParseTree());
    assertEquals(-1, actualAggregationAwareParserGrammar.getState());
    assertTrue(actualAggregationAwareParserGrammar
        .getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualAggregationAwareParserGrammar.getInterpreter();
    assertSame(actualAggregationAwareParserGrammar, interpreter.getParser());
    assertEquals(88, interpreter.decisionToDFA.length);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    assertSame(actualAggregationAwareParserGrammar.getATN(), interpreter.atn);
    PredictionContextCache expectedSharedContextCache = actualAggregationAwareParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    AggregationAwareParserGrammar actualAggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Assert
    assertNull(actualAggregationAwareParserGrammar.getParseInfo());
    assertEquals(0, actualAggregationAwareParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualAggregationAwareParserGrammar.isMatchedEOF());
    assertNull(actualAggregationAwareParserGrammar.getContext());
    assertTrue(
        actualAggregationAwareParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualAggregationAwareParserGrammar.getPrecedence());
    assertEquals("List", actualAggregationAwareParserGrammar.getSourceName());
    assertFalse(actualAggregationAwareParserGrammar.isTrace());
    assertTrue(actualAggregationAwareParserGrammar.getBuildParseTree());
    assertEquals(-1, actualAggregationAwareParserGrammar.getState());
    assertTrue(actualAggregationAwareParserGrammar
        .getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualAggregationAwareParserGrammar.getInterpreter();
    assertSame(actualAggregationAwareParserGrammar, interpreter.getParser());
    assertEquals(88, interpreter.decisionToDFA.length);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    assertSame(actualAggregationAwareParserGrammar.getATN(), interpreter.atn);
    PredictionContextCache expectedSharedContextCache = actualAggregationAwareParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testContravarianceTypeParameter() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ContravarianceTypeParameterContext actualContravarianceTypeParameterResult = aggregationAwareParserGrammar
        .contravarianceTypeParameter();

    // Assert
    RecognitionException recognitionException = actualContravarianceTypeParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualContravarianceTypeParameterResult.invokingState);
    assertEquals(1, actualContravarianceTypeParameterResult.depth());
    Token expectedStart = actualContravarianceTypeParameterResult.start;
    Token start = actualContravarianceTypeParameterResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualContravarianceTypeParameterResult.getStop());
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(800, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualContravarianceTypeParameterResult, recognitionException.getCtx());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testContravarianceTypeParameterContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ContravarianceTypeParameterContext contravarianceTypeParameterContext = new AggregationAwareParserGrammar.ContravarianceTypeParameterContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(contravarianceTypeParameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testContravarianceTypeParameterContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ContravarianceTypeParameterContext contravarianceTypeParameterContext = new AggregationAwareParserGrammar.ContravarianceTypeParameterContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(contravarianceTypeParameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testContravarianceTypeParameterContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(74, (new AggregationAwareParserGrammar.ContravarianceTypeParameterContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testContravarianceTypeParameterContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ContravarianceTypeParameterContext(new ParserRuleContext(), 1))
        .identifier());
  }

  @Test
  public void testContravarianceTypeParameterContextMINUS() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.ContravarianceTypeParameterContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void testContravarianceTypeParameters() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.ContravarianceTypeParametersContext actualContravarianceTypeParametersResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).contravarianceTypeParameters();

    // Assert
    assertEquals(-1, actualContravarianceTypeParametersResult.invokingState);
    List<ParseTree> parseTreeList = actualContravarianceTypeParametersResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualContravarianceTypeParametersResult.getParent());
    Token expectedStart = actualContravarianceTypeParametersResult.start;
    Token start = actualContravarianceTypeParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualContravarianceTypeParametersResult.getStop());
    assertEquals(1, actualContravarianceTypeParametersResult.getChildCount());
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
    assertSame(start,
        ((AggregationAwareParserGrammar.ContravarianceTypeParameterContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.ContravarianceTypeParameterContext) parseTreeList.get(0)).depth());
    assertFalse(((AggregationAwareParserGrammar.ContravarianceTypeParameterContext) parseTreeList.get(0)).isEmpty());
    assertNull(((AggregationAwareParserGrammar.ContravarianceTypeParameterContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    RecognitionException recognitionException = ((AggregationAwareParserGrammar.ContravarianceTypeParameterContext) parseTreeList
        .get(0)).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertSame(parseTreeList.get(0), recognitionException.getCtx());
  }

  @Test
  public void testContravarianceTypeParametersContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ContravarianceTypeParametersContext contravarianceTypeParametersContext = new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(contravarianceTypeParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testContravarianceTypeParametersContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ContravarianceTypeParametersContext contravarianceTypeParametersContext = new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(
        new ParserRuleContext(), 1);
    contravarianceTypeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(contravarianceTypeParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testContravarianceTypeParametersContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(new ParserRuleContext(), 1)).COMMA()
            .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testContravarianceTypeParametersContextContravarianceTypeParameter() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(new ParserRuleContext(), 1))
        .contravarianceTypeParameter()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(new ParserRuleContext(), 1))
        .contravarianceTypeParameter(1));
  }

  @Test
  public void testContravarianceTypeParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(73, (new AggregationAwareParserGrammar.ContravarianceTypeParametersContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testDsl() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.DslContext actualDslResult = aggregationAwareParserGrammar.dsl();

    // Assert
    RecognitionException recognitionException = actualDslResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualDslResult.invokingState);
    assertNull(actualDslResult.getParent());
    Token expectedStart = actualDslResult.start;
    Token start = actualDslResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(706, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualDslResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testDslContent() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    AggregationAwareParserGrammar.DslContentContext actualDslContentResult = aggregationAwareParserGrammar.dslContent();

    // Assert
    assertEquals(-1, actualDslContentResult.invokingState);
    assertNull(actualDslContentResult.getParent());
    Token expectedStart = actualDslContentResult.start;
    Token start = actualDslContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslContentResult.getStop());
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
    assertNull(aggregationAwareParserGrammar.getRuleContext());
    assertEquals(-1, aggregationAwareParserGrammar.getState());
  }

  @Test
  public void testDslContent2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.DslContentContext actualDslContentResult = aggregationAwareParserGrammar.dslContent();

    // Assert
    RecognitionException recognitionException = actualDslContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualDslContentResult.children.size());
    assertNull(actualDslContentResult.getParent());
    Token expectedStart = actualDslContentResult.stop;
    Token start = actualDslContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDslContentResult.getStop());
    assertEquals("null", actualDslContentResult.getText());
    assertEquals(1, actualDslContentResult.getChildCount());
    assertTrue(actualDslContentResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(717, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualDslContentResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testDslContent3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.DslContentContext actualDslContentResult = aggregationAwareParserGrammar.dslContent();

    // Assert
    RecognitionException recognitionException = actualDslContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualDslContentResult.children.size());
    assertNull(actualDslContentResult.getParent());
    Token expectedStart = actualDslContentResult.stop;
    Token start = actualDslContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDslContentResult.getStop());
    assertEquals("Input", actualDslContentResult.getText());
    assertEquals(1, actualDslContentResult.getChildCount());
    assertTrue(actualDslContentResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(717, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualDslContentResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testDslContent4() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.DslContentContext actualDslContentResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).dslContent();

    // Assert
    assertEquals(-1, actualDslContentResult.invokingState);
    assertNull(actualDslContentResult.getParent());
    Token expectedStart = actualDslContentResult.start;
    Token start = actualDslContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslContentResult.getStop());
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
  public void testDslContent5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.DslContentContext actualDslContentResult = aggregationAwareParserGrammar.dslContent();

    // Assert
    RecognitionException recognitionException = actualDslContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualDslContentResult.children.size());
    assertNull(actualDslContentResult.getParent());
    Token expectedStart = actualDslContentResult.stop;
    Token start = actualDslContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDslContentResult.getStop());
    assertEquals("Input", actualDslContentResult.getText());
    assertEquals(1, actualDslContentResult.getChildCount());
    assertTrue(actualDslContentResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(717, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualDslContentResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testDslContent6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.DslContentContext actualDslContentResult = aggregationAwareParserGrammar.dslContent();

    // Assert
    assertEquals(-1, actualDslContentResult.invokingState);
    assertNull(actualDslContentResult.getParent());
    Token expectedStart = actualDslContentResult.start;
    Token start = actualDslContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslContentResult.getStop());
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
    assertNull(aggregationAwareParserGrammar.getRuleContext());
    assertEquals(-1, aggregationAwareParserGrammar.getState());
  }

  @Test
  public void testDslContentContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.DslContentContext dslContentContext = new AggregationAwareParserGrammar.DslContentContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(dslContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDslContentContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.DslContentContext dslContentContext = new AggregationAwareParserGrammar.DslContentContext(
        new ParserRuleContext(), 1);
    dslContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(dslContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDslContentContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(63, (new AggregationAwareParserGrammar.DslContentContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testDslContentContextISLAND_BRACE_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslContentContext(new ParserRuleContext(), 1)).ISLAND_BRACE_CLOSE());
  }

  @Test
  public void testDslContentContextISLAND_BRACE_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslContentContext(new ParserRuleContext(), 1)).ISLAND_BRACE_OPEN());
  }

  @Test
  public void testDslContentContextISLAND_CONTENT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslContentContext(new ParserRuleContext(), 1)).ISLAND_CONTENT());
  }

  @Test
  public void testDslContentContextISLAND_END() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslContentContext(new ParserRuleContext(), 1)).ISLAND_END());
  }

  @Test
  public void testDslContentContextISLAND_HASH() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslContentContext(new ParserRuleContext(), 1)).ISLAND_HASH());
  }

  @Test
  public void testDslContentContextISLAND_START() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslContentContext(new ParserRuleContext(), 1)).ISLAND_START());
  }

  @Test
  public void testDslContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.DslContext dslContext = new AggregationAwareParserGrammar.DslContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(dslContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDslContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.DslContext dslContext = new AggregationAwareParserGrammar.DslContext(
        new ParserRuleContext(), 1);
    dslContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(dslContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDslContextDslGraphFetch() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslContext(new ParserRuleContext(), 1)).dslGraphFetch());
  }

  @Test
  public void testDslContextDslNavigationPath() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslContext(new ParserRuleContext(), 1)).dslNavigationPath());
  }

  @Test
  public void testDslContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(60, (new AggregationAwareParserGrammar.DslContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testDslGraphFetch() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.DslGraphFetchContext actualDslGraphFetchResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).dslGraphFetch();

    // Assert
    assertEquals(-1, actualDslGraphFetchResult.invokingState);
    List<ParseTree> parseTreeList = actualDslGraphFetchResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualDslGraphFetchResult.getParent());
    Token expectedStart = actualDslGraphFetchResult.start;
    Token start = actualDslGraphFetchResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslGraphFetchResult.getStop());
    assertEquals(1, actualDslGraphFetchResult.getChildCount());
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
    assertSame(actualDslGraphFetchResult, getResult.getParent());
    assertEquals("<missing ISLAND_OPEN>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing ISLAND_OPEN>',<14>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(14, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing ISLAND_OPEN>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testDslGraphFetch2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.DslGraphFetchContext actualDslGraphFetchResult = aggregationAwareParserGrammar
        .dslGraphFetch();

    // Assert
    RecognitionException recognitionException = actualDslGraphFetchResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualDslGraphFetchResult.children.size());
    assertNull(actualDslGraphFetchResult.getParent());
    Token expectedStart = actualDslGraphFetchResult.stop;
    Token start = actualDslGraphFetchResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDslGraphFetchResult.getStop());
    assertEquals("null", actualDslGraphFetchResult.getText());
    assertEquals(1, actualDslGraphFetchResult.getChildCount());
    assertTrue(actualDslGraphFetchResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(710, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualDslGraphFetchResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testDslGraphFetch3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.DslGraphFetchContext actualDslGraphFetchResult = aggregationAwareParserGrammar
        .dslGraphFetch();

    // Assert
    RecognitionException recognitionException = actualDslGraphFetchResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualDslGraphFetchResult.children.size());
    assertNull(actualDslGraphFetchResult.getParent());
    Token expectedStart = actualDslGraphFetchResult.stop;
    Token start = actualDslGraphFetchResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDslGraphFetchResult.getStop());
    assertEquals("Input", actualDslGraphFetchResult.getText());
    assertEquals(1, actualDslGraphFetchResult.getChildCount());
    assertTrue(actualDslGraphFetchResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(710, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualDslGraphFetchResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testDslGraphFetch4() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.DslGraphFetchContext actualDslGraphFetchResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).dslGraphFetch();

    // Assert
    assertEquals(-1, actualDslGraphFetchResult.invokingState);
    assertEquals(1, actualDslGraphFetchResult.children.size());
    assertNull(actualDslGraphFetchResult.getParent());
    Token expectedStart = actualDslGraphFetchResult.start;
    Token start = actualDslGraphFetchResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslGraphFetchResult.getStop());
    assertEquals("<missing ISLAND_OPEN>", actualDslGraphFetchResult.getText());
    assertEquals(1, actualDslGraphFetchResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
  }

  @Test
  public void testDslGraphFetch5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.DslGraphFetchContext actualDslGraphFetchResult = aggregationAwareParserGrammar
        .dslGraphFetch();

    // Assert
    RecognitionException recognitionException = actualDslGraphFetchResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualDslGraphFetchResult.children.size());
    assertNull(actualDslGraphFetchResult.getParent());
    Token expectedStart = actualDslGraphFetchResult.stop;
    Token start = actualDslGraphFetchResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDslGraphFetchResult.getStop());
    assertEquals("Input", actualDslGraphFetchResult.getText());
    assertEquals(1, actualDslGraphFetchResult.getChildCount());
    assertTrue(actualDslGraphFetchResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(710, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualDslGraphFetchResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testDslGraphFetch6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.DslGraphFetchContext actualDslGraphFetchResult = aggregationAwareParserGrammar
        .dslGraphFetch();

    // Assert
    assertEquals(-1, actualDslGraphFetchResult.invokingState);
    List<ParseTree> parseTreeList = actualDslGraphFetchResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualDslGraphFetchResult.getParent());
    Token expectedStart = actualDslGraphFetchResult.start;
    Token start = actualDslGraphFetchResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslGraphFetchResult.getStop());
    assertEquals(1, actualDslGraphFetchResult.getChildCount());
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
    assertSame(actualDslGraphFetchResult, getResult.getParent());
    assertEquals("<missing ISLAND_OPEN>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing ISLAND_OPEN>',<14>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(14, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing ISLAND_OPEN>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testDslGraphFetchContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.DslGraphFetchContext dslGraphFetchContext = new AggregationAwareParserGrammar.DslGraphFetchContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(dslGraphFetchContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDslGraphFetchContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.DslGraphFetchContext dslGraphFetchContext = new AggregationAwareParserGrammar.DslGraphFetchContext(
        new ParserRuleContext(), 1);
    dslGraphFetchContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(dslGraphFetchContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDslGraphFetchContextDslContent() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.DslGraphFetchContext(new ParserRuleContext(), 1)).dslContent().isEmpty());
    assertNull((new AggregationAwareParserGrammar.DslGraphFetchContext(new ParserRuleContext(), 1)).dslContent(1));
  }

  @Test
  public void testDslGraphFetchContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(62,
        (new AggregationAwareParserGrammar.DslGraphFetchContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testDslGraphFetchContextISLAND_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslGraphFetchContext(new ParserRuleContext(), 1)).ISLAND_OPEN());
  }

  @Test
  public void testDslNavigationPath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.DslNavigationPathContext actualDslNavigationPathResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).dslNavigationPath();

    // Assert
    assertEquals(-1, actualDslNavigationPathResult.invokingState);
    List<ParseTree> parseTreeList = actualDslNavigationPathResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualDslNavigationPathResult.getParent());
    Token expectedStart = actualDslNavigationPathResult.start;
    Token start = actualDslNavigationPathResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslNavigationPathResult.getStop());
    assertEquals(1, actualDslNavigationPathResult.getChildCount());
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
    assertSame(actualDslNavigationPathResult, getResult.getParent());
    assertEquals("<missing NAVIGATION_PATH_BLOCK>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing NAVIGATION_PATH_BLOCK>',<10>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(10, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing NAVIGATION_PATH_BLOCK>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testDslNavigationPath2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.DslNavigationPathContext actualDslNavigationPathResult = aggregationAwareParserGrammar
        .dslNavigationPath();

    // Assert
    RecognitionException recognitionException = actualDslNavigationPathResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualDslNavigationPathResult.children.size());
    assertNull(actualDslNavigationPathResult.getParent());
    Token expectedStart = actualDslNavigationPathResult.stop;
    Token start = actualDslNavigationPathResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDslNavigationPathResult.getStop());
    assertEquals("null", actualDslNavigationPathResult.getText());
    assertEquals(1, actualDslNavigationPathResult.getChildCount());
    assertTrue(actualDslNavigationPathResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(708, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualDslNavigationPathResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testDslNavigationPath3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.DslNavigationPathContext actualDslNavigationPathResult = aggregationAwareParserGrammar
        .dslNavigationPath();

    // Assert
    RecognitionException recognitionException = actualDslNavigationPathResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualDslNavigationPathResult.children.size());
    assertNull(actualDslNavigationPathResult.getParent());
    Token expectedStart = actualDslNavigationPathResult.stop;
    Token start = actualDslNavigationPathResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDslNavigationPathResult.getStop());
    assertEquals("Input", actualDslNavigationPathResult.getText());
    assertEquals(1, actualDslNavigationPathResult.getChildCount());
    assertTrue(actualDslNavigationPathResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(708, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualDslNavigationPathResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testDslNavigationPath4() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.DslNavigationPathContext actualDslNavigationPathResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).dslNavigationPath();

    // Assert
    assertEquals(-1, actualDslNavigationPathResult.invokingState);
    assertEquals(1, actualDslNavigationPathResult.children.size());
    assertNull(actualDslNavigationPathResult.getParent());
    Token expectedStart = actualDslNavigationPathResult.start;
    Token start = actualDslNavigationPathResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslNavigationPathResult.getStop());
    assertEquals("<missing NAVIGATION_PATH_BLOCK>", actualDslNavigationPathResult.getText());
    assertEquals(1, actualDslNavigationPathResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
  }

  @Test
  public void testDslNavigationPath5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.DslNavigationPathContext actualDslNavigationPathResult = aggregationAwareParserGrammar
        .dslNavigationPath();

    // Assert
    RecognitionException recognitionException = actualDslNavigationPathResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualDslNavigationPathResult.children.size());
    assertNull(actualDslNavigationPathResult.getParent());
    Token expectedStart = actualDslNavigationPathResult.stop;
    Token start = actualDslNavigationPathResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDslNavigationPathResult.getStop());
    assertEquals("Input", actualDslNavigationPathResult.getText());
    assertEquals(1, actualDslNavigationPathResult.getChildCount());
    assertTrue(actualDslNavigationPathResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(708, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualDslNavigationPathResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testDslNavigationPath6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.DslNavigationPathContext actualDslNavigationPathResult = aggregationAwareParserGrammar
        .dslNavigationPath();

    // Assert
    assertEquals(-1, actualDslNavigationPathResult.invokingState);
    List<ParseTree> parseTreeList = actualDslNavigationPathResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualDslNavigationPathResult.getParent());
    Token expectedStart = actualDslNavigationPathResult.start;
    Token start = actualDslNavigationPathResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualDslNavigationPathResult.getStop());
    assertEquals(1, actualDslNavigationPathResult.getChildCount());
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
    assertSame(actualDslNavigationPathResult, getResult.getParent());
    assertEquals("<missing NAVIGATION_PATH_BLOCK>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing NAVIGATION_PATH_BLOCK>',<10>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(10, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing NAVIGATION_PATH_BLOCK>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testDslNavigationPathContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.DslNavigationPathContext dslNavigationPathContext = new AggregationAwareParserGrammar.DslNavigationPathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(dslNavigationPathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDslNavigationPathContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.DslNavigationPathContext dslNavigationPathContext = new AggregationAwareParserGrammar.DslNavigationPathContext(
        new ParserRuleContext(), 1);
    dslNavigationPathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(dslNavigationPathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDslNavigationPathContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(61,
        (new AggregationAwareParserGrammar.DslNavigationPathContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testDslNavigationPathContextNAVIGATION_PATH_BLOCK() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.DslNavigationPathContext(new ParserRuleContext(), 1))
        .NAVIGATION_PATH_BLOCK());
  }

  @Test
  public void testEnumReference() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.EnumReferenceContext actualEnumReferenceResult = aggregationAwareParserGrammar
        .enumReference();

    // Assert
    assertNull(actualEnumReferenceResult.identifier());
    RecognitionException recognitionException = actualEnumReferenceResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualEnumReferenceResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, actualEnumReferenceResult.depth());
    Token expectedStart = actualEnumReferenceResult.start;
    Token start = actualEnumReferenceResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEnumReferenceResult.getStop());
    assertTrue(actualEnumReferenceResult.isEmpty());
    assertEquals("([] [322])", actualEnumReferenceResult.toStringTree());
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
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(actualEnumReferenceResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(323, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(1, start.getLine());
    assertEquals("", ((BufferedTokenStream) inputStream).getText());
    assertTrue(((AggregationAwareParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, tokenSource.getLine());
    assertEquals(322, ((AggregationAwareParserGrammar.QualifiedNameContext) parseTreeList.get(0)).invokingState);
  }

  @Test
  public void testEnumReferenceContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.EnumReferenceContext enumReferenceContext = new AggregationAwareParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(enumReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumReferenceContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.EnumReferenceContext enumReferenceContext = new AggregationAwareParserGrammar.EnumReferenceContext(
        new ParserRuleContext(), 1);
    enumReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(enumReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEnumReferenceContextDOT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).DOT());
  }

  @Test
  public void testEnumReferenceContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(15,
        (new AggregationAwareParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testEnumReferenceContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testEnumReferenceContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.EnumReferenceContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testEqualNotEqual() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.EqualNotEqualContext actualEqualNotEqualResult = aggregationAwareParserGrammar
        .equalNotEqual();

    // Assert
    RecognitionException recognitionException = actualEqualNotEqualResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualEqualNotEqualResult.invokingState);
    assertNull(actualEqualNotEqualResult.getParent());
    Token expectedStart = actualEqualNotEqualResult.start;
    Token start = actualEqualNotEqualResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEqualNotEqualResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(353, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualEqualNotEqualResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testEqualNotEqualContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.EqualNotEqualContext equalNotEqualContext = new AggregationAwareParserGrammar.EqualNotEqualContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(equalNotEqualContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEqualNotEqualContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.EqualNotEqualContext equalNotEqualContext = new AggregationAwareParserGrammar.EqualNotEqualContext(
        new ParserRuleContext(), 1);
    equalNotEqualContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(equalNotEqualContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEqualNotEqualContextCombinedArithmeticOnly() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.EqualNotEqualContext(new ParserRuleContext(), 1)).combinedArithmeticOnly());
  }

  @Test
  public void testEqualNotEqualContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(21,
        (new AggregationAwareParserGrammar.EqualNotEqualContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testEqualNotEqualContextTEST_EQUAL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.EqualNotEqualContext(new ParserRuleContext(), 1)).TEST_EQUAL());
  }

  @Test
  public void testEqualNotEqualContextTEST_NOT_EQUAL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.EqualNotEqualContext(new ParserRuleContext(), 1)).TEST_NOT_EQUAL());
  }

  @Test
  public void testExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ExpressionContext actualExpressionResult = aggregationAwareParserGrammar.expression();

    // Assert
    RecognitionException recognitionException = actualExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualExpressionResult.invokingState);
    assertNull(actualExpressionResult.getParent());
    Token expectedStart = actualExpressionResult.start;
    Token start = actualExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExpressionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(231, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualExpressionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testExpression2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ExpressionContext actualExpressionResult = aggregationAwareParserGrammar.expression();

    // Assert
    RecognitionException recognitionException = actualExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualExpressionResult.children.size());
    assertNull(actualExpressionResult.getParent());
    Token expectedStart = actualExpressionResult.stop;
    Token start = actualExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualExpressionResult.getStop());
    assertEquals("null", actualExpressionResult.getText());
    assertEquals(1, actualExpressionResult.getChildCount());
    assertTrue(actualExpressionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(231, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualExpressionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testExpression3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(6));

    // Act
    AggregationAwareParserGrammar.ExpressionContext actualExpressionResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).expression();

    // Assert
    assertEquals(-1, actualExpressionResult.invokingState);
    List<ParseTree> parseTreeList = actualExpressionResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualExpressionResult.getParent());
    Token expectedStart = actualExpressionResult.stop;
    Token start = actualExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualExpressionResult.getStop());
    assertEquals(1, actualExpressionResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).depth());
    assertNull(((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).variable());
    assertFalse(((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).isEmpty());
    assertSame(start, ((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).getStop());
    List<ParseTree> parseTreeList1 = ((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertEquals("[451 212]", getResult1.toString());
    assertEquals(451, ((AggregationAwareParserGrammar.InstanceReferenceContext) getResult1).invokingState);
    assertSame(start, ((AggregationAwareParserGrammar.InstanceReferenceContext) getResult1).getStop());
    assertEquals(1, getResult1.getChildCount());
    Interval expectedSourceInterval = actualExpressionResult.getSourceInterval();
    assertSame(expectedSourceInterval, getResult1.getSourceInterval());
  }

  @Test
  public void testExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionContext expressionContext = new AggregationAwareParserGrammar.ExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(expressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionContext expressionContext = new AggregationAwareParserGrammar.ExpressionContext(
        new ParserRuleContext(), 1);
    expressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(expressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionContextAtomicExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).atomicExpression());
  }

  @Test
  public void testExpressionContextCombinedExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).combinedExpression());
  }

  @Test
  public void testExpressionContextEqualNotEqual() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).equalNotEqual());
  }

  @Test
  public void testExpressionContextExpressionsArray() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).expressionsArray());
  }

  @Test
  public void testExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(6, (new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testExpressionContextNotExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).notExpression());
  }

  @Test
  public void testExpressionContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testExpressionContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testExpressionContextPropertyOrFunctionExpression() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).propertyOrFunctionExpression()
            .isEmpty());
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1))
        .propertyOrFunctionExpression(1));
  }

  @Test
  public void testExpressionContextSignedExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).signedExpression());
  }

  @Test
  public void testExpressionContextSliceExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionContext(new ParserRuleContext(), 1)).sliceExpression());
  }

  @Test
  public void testExpressionInstance() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ExpressionInstanceContext actualExpressionInstanceResult = aggregationAwareParserGrammar
        .expressionInstance();

    // Assert
    RecognitionException recognitionException = actualExpressionInstanceResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualExpressionInstanceResult.invokingState);
    assertEquals(1, actualExpressionInstanceResult.depth());
    Token expectedStart = actualExpressionInstanceResult.start;
    Token start = actualExpressionInstanceResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExpressionInstanceResult.getStop());
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(actualExpressionInstanceResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(522, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testExpressionInstanceAtomicRightSide() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext actualExpressionInstanceAtomicRightSideResult = aggregationAwareParserGrammar
        .expressionInstanceAtomicRightSide();

    // Assert
    RecognitionException recognitionException = actualExpressionInstanceAtomicRightSideResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualExpressionInstanceAtomicRightSideResult.invokingState);
    assertNull(actualExpressionInstanceAtomicRightSideResult.getParent());
    Token expectedStart = actualExpressionInstanceAtomicRightSideResult.start;
    Token start = actualExpressionInstanceAtomicRightSideResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExpressionInstanceAtomicRightSideResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(559, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualExpressionInstanceAtomicRightSideResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testExpressionInstanceAtomicRightSideContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext expressionInstanceAtomicRightSideContext = new AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(expressionInstanceAtomicRightSideContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionInstanceAtomicRightSideContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext expressionInstanceAtomicRightSideContext = new AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(expressionInstanceAtomicRightSideContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionInstanceAtomicRightSideContextCombinedExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext(new ParserRuleContext(), 1))
        .combinedExpression());
  }

  @Test
  public void testExpressionInstanceAtomicRightSideContextExpressionInstance() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext(new ParserRuleContext(), 1))
        .expressionInstance());
  }

  @Test
  public void testExpressionInstanceAtomicRightSideContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(46,
        (new AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext(new ParserRuleContext(), 1))
            .getRuleIndex());
  }

  @Test
  public void testExpressionInstanceAtomicRightSideContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext(new ParserRuleContext(), 1))
        .qualifiedName());
  }

  @Test
  public void testExpressionInstanceContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionInstanceContext expressionInstanceContext = new AggregationAwareParserGrammar.ExpressionInstanceContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(expressionInstanceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionInstanceContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionInstanceContext expressionInstanceContext = new AggregationAwareParserGrammar.ExpressionInstanceContext(
        new ParserRuleContext(), 1);
    expressionInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(expressionInstanceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionInstanceContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testExpressionInstanceContextExpressionInstanceParserPropertyAssignment() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1))
        .expressionInstanceParserPropertyAssignment()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1))
        .expressionInstanceParserPropertyAssignment(1));
  }

  @Test
  public void testExpressionInstanceContextGREATER_THAN() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).GREATER_THAN());
  }

  @Test
  public void testExpressionInstanceContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(44,
        (new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testExpressionInstanceContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testExpressionInstanceContextLESS_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).LESS_THAN());
  }

  @Test
  public void testExpressionInstanceContextMultiplicityArguments() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1))
        .multiplicityArguments());
  }

  @Test
  public void testExpressionInstanceContextNEW_SYMBOL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).NEW_SYMBOL());
  }

  @Test
  public void testExpressionInstanceContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testExpressionInstanceContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testExpressionInstanceContextPIPE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).PIPE());
  }

  @Test
  public void testExpressionInstanceContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testExpressionInstanceContextTypeArguments() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).typeArguments());
  }

  @Test
  public void testExpressionInstanceContextVariable() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceContext(new ParserRuleContext(), 1)).variable());
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignment() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext actualExpressionInstanceParserPropertyAssignmentResult = aggregationAwareParserGrammar
        .expressionInstanceParserPropertyAssignment();

    // Assert
    RecognitionException recognitionException = actualExpressionInstanceParserPropertyAssignmentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualExpressionInstanceParserPropertyAssignmentResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualExpressionInstanceParserPropertyAssignmentResult.getParent());
    Token expectedStart = actualExpressionInstanceParserPropertyAssignmentResult.start;
    Token start = actualExpressionInstanceParserPropertyAssignmentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExpressionInstanceParserPropertyAssignmentResult.getStop());
    assertEquals(1, actualExpressionInstanceParserPropertyAssignmentResult.getChildCount());
    assertTrue(actualExpressionInstanceParserPropertyAssignmentResult.isEmpty());
    assertEquals("([] [561])", actualExpressionInstanceParserPropertyAssignmentResult.toStringTree());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(actualExpressionInstanceParserPropertyAssignmentResult, recognitionException.getCtx());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(572, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertSame(listTokenSource, start.getTokenSource());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals("", ((BufferedTokenStream) inputStream).getText());
    assertEquals(561, ((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.size());
    assertTrue(((AggregationAwareParserGrammar.IdentifierContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(0, inputStream.index());
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignment2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext actualExpressionInstanceParserPropertyAssignmentResult = aggregationAwareParserGrammar
        .expressionInstanceParserPropertyAssignment();

    // Assert
    RecognitionException recognitionException = actualExpressionInstanceParserPropertyAssignmentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualExpressionInstanceParserPropertyAssignmentResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualExpressionInstanceParserPropertyAssignmentResult.getParent());
    Token expectedStart = actualExpressionInstanceParserPropertyAssignmentResult.stop;
    Token start = actualExpressionInstanceParserPropertyAssignmentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualExpressionInstanceParserPropertyAssignmentResult.getStop());
    assertEquals("null", actualExpressionInstanceParserPropertyAssignmentResult.getText());
    assertEquals(1, actualExpressionInstanceParserPropertyAssignmentResult.getChildCount());
    assertTrue(actualExpressionInstanceParserPropertyAssignmentResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(0, start.getTokenIndex());
    assertEquals(572, recognitionException.getOffendingState());
    assertSame(actualExpressionInstanceParserPropertyAssignmentResult, recognitionException.getCtx());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(561, ((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals(2, inputStream.size());
    assertTrue(((AggregationAwareParserGrammar.IdentifierContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignmentContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext expressionInstanceParserPropertyAssignmentContext = new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(
        expressionInstanceParserPropertyAssignmentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignmentContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext expressionInstanceParserPropertyAssignmentContext = new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(
        new ParserRuleContext(), 1);
    expressionInstanceParserPropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(
        expressionInstanceParserPropertyAssignmentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignmentContextDOT() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(),
            1)).DOT().isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(),
            1)).DOT(1));
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignmentContextEQUAL() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(),
            1)).EQUAL());
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignmentContextExpressionInstanceRightSide() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(),
            1)).expressionInstanceRightSide());
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignmentContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(47,
        (new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(),
            1)).getRuleIndex());
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignmentContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(),
            1)).identifier().isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(),
            1)).identifier(1));
  }

  @Test
  public void testExpressionInstanceParserPropertyAssignmentContextPLUS() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.ExpressionInstanceParserPropertyAssignmentContext(new ParserRuleContext(),
            1)).PLUS());
  }

  @Test
  public void testExpressionInstanceRightSide() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.ExpressionInstanceRightSideContext actualExpressionInstanceRightSideResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).expressionInstanceRightSide();

    // Assert
    assertEquals(-1, actualExpressionInstanceRightSideResult.invokingState);
    List<ParseTree> parseTreeList = actualExpressionInstanceRightSideResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualExpressionInstanceRightSideResult.getParent());
    Token expectedStart = actualExpressionInstanceRightSideResult.start;
    Token start = actualExpressionInstanceRightSideResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExpressionInstanceRightSideResult.getStop());
    assertEquals(1, actualExpressionInstanceRightSideResult.getChildCount());
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
    assertSame(start,
        ((AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext) parseTreeList.get(0)).getStart());
    assertEquals(2,
        ((AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext) parseTreeList.get(0)).depth());
    assertFalse(
        ((AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext) parseTreeList.get(0)).isEmpty());
    assertNull(
        ((AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    RecognitionException recognitionException = ((AggregationAwareParserGrammar.ExpressionInstanceAtomicRightSideContext) parseTreeList
        .get(0)).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(parseTreeList.get(0), recognitionException.getCtx());
  }

  @Test
  public void testExpressionInstanceRightSideContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionInstanceRightSideContext expressionInstanceRightSideContext = new AggregationAwareParserGrammar.ExpressionInstanceRightSideContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(expressionInstanceRightSideContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionInstanceRightSideContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionInstanceRightSideContext expressionInstanceRightSideContext = new AggregationAwareParserGrammar.ExpressionInstanceRightSideContext(
        new ParserRuleContext(), 1);
    expressionInstanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(expressionInstanceRightSideContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionInstanceRightSideContextExpressionInstanceAtomicRightSide() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionInstanceRightSideContext(new ParserRuleContext(), 1))
        .expressionInstanceAtomicRightSide());
  }

  @Test
  public void testExpressionInstanceRightSideContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(45, (new AggregationAwareParserGrammar.ExpressionInstanceRightSideContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testExpressionOrExpressionGroup() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext actualExpressionOrExpressionGroupResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).expressionOrExpressionGroup();

    // Assert
    assertEquals(-1, actualExpressionOrExpressionGroupResult.invokingState);
    assertEquals(1, actualExpressionOrExpressionGroupResult.children.size());
    assertNull(actualExpressionOrExpressionGroupResult.getParent());
    Token expectedStart = actualExpressionOrExpressionGroupResult.start;
    Token start = actualExpressionOrExpressionGroupResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExpressionOrExpressionGroupResult.getStop());
    assertEquals(1, actualExpressionOrExpressionGroupResult.getChildCount());
    AggregationAwareParserGrammar.ExpressionContext expressionResult = actualExpressionOrExpressionGroupResult
        .expression();
    assertEquals(2, expressionResult.depth());
    assertEquals(1, start.getLine());
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
    RecognitionException recognitionException = expressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(379, expressionResult.invokingState);
    assertNull(expressionResult.getStop());
    assertSame(start, expressionResult.getStart());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(1, tokenSource.getLine());
    assertSame(expressionResult, recognitionException.getCtx());
    assertEquals(231, recognitionException.getOffendingState());
  }

  @Test
  public void testExpressionOrExpressionGroup2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext actualExpressionOrExpressionGroupResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).expressionOrExpressionGroup();

    // Assert
    assertEquals(-1, actualExpressionOrExpressionGroupResult.invokingState);
    assertEquals(1, actualExpressionOrExpressionGroupResult.children.size());
    assertNull(actualExpressionOrExpressionGroupResult.getParent());
    Token token = actualExpressionOrExpressionGroupResult.stop;
    assertSame(token, actualExpressionOrExpressionGroupResult.getStart());
    Token stop = actualExpressionOrExpressionGroupResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualExpressionOrExpressionGroupResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    AggregationAwareParserGrammar.ExpressionContext expressionResult = actualExpressionOrExpressionGroupResult
        .expression();
    assertSame(stop, expressionResult.getStart());
    assertEquals(2, expressionResult.depth());
    assertFalse(expressionResult.isEmpty());
    assertSame(stop, expressionResult.getStop());
    assertEquals(1, expressionResult.children.size());
    assertEquals(1, expressionResult.getChildCount());
    RecognitionException recognitionException = expressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals("null", expressionResult.getText());
    assertEquals(231, recognitionException.getOffendingState());
    assertSame(stop, recognitionException.getOffendingToken());
    assertSame(expressionResult, recognitionException.getCtx());
  }

  @Test
  public void testExpressionOrExpressionGroup3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(52));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));

    // Act
    AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext actualExpressionOrExpressionGroupResult = (new AggregationAwareParserGrammar(
        bufferedTokenStream)).expressionOrExpressionGroup();

    // Assert
    assertEquals(-1, actualExpressionOrExpressionGroupResult.invokingState);
    assertEquals(1, actualExpressionOrExpressionGroupResult.children.size());
    assertNull(actualExpressionOrExpressionGroupResult.getParent());
    Token token = actualExpressionOrExpressionGroupResult.stop;
    assertSame(token, actualExpressionOrExpressionGroupResult.getStart());
    Token stop = actualExpressionOrExpressionGroupResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualExpressionOrExpressionGroupResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    AggregationAwareParserGrammar.ExpressionContext expressionResult = actualExpressionOrExpressionGroupResult
        .expression();
    assertSame(stop, expressionResult.getStart());
    assertEquals(2, expressionResult.depth());
    assertFalse(expressionResult.isEmpty());
    assertSame(stop, expressionResult.getStop());
    assertEquals(1, expressionResult.children.size());
    assertEquals(1, expressionResult.getChildCount());
    RecognitionException recognitionException = expressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.NoViableAltException);
    assertEquals("null", expressionResult.getText());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(expressionResult, recognitionException.getCtx());
  }

  @Test
  public void testExpressionOrExpressionGroup4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(26));

    // Act
    AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext actualExpressionOrExpressionGroupResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).expressionOrExpressionGroup();

    // Assert
    assertEquals(-1, actualExpressionOrExpressionGroupResult.invokingState);
    assertEquals(1, actualExpressionOrExpressionGroupResult.children.size());
    assertNull(actualExpressionOrExpressionGroupResult.getParent());
    Token token = actualExpressionOrExpressionGroupResult.stop;
    assertSame(token, actualExpressionOrExpressionGroupResult.getStart());
    Token stop = actualExpressionOrExpressionGroupResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualExpressionOrExpressionGroupResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    AggregationAwareParserGrammar.ExpressionContext expressionResult = actualExpressionOrExpressionGroupResult
        .expression();
    assertSame(stop, expressionResult.getStart());
    assertEquals(2, expressionResult.depth());
    assertFalse(expressionResult.isEmpty());
    assertSame(stop, expressionResult.getStop());
    List<ParseTree> parseTreeList = expressionResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, expressionResult.getChildCount());
    assertEquals("null", expressionResult.getText());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("[212 379]", getResult.toString());
    assertEquals(212, ((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).invokingState);
    assertSame(stop, ((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).getStop());
    assertNull(((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).dsl());
    Interval expectedSourceInterval = actualExpressionOrExpressionGroupResult.getSourceInterval();
    assertSame(expectedSourceInterval, getResult.getSourceInterval());
  }

  @Test
  public void testExpressionOrExpressionGroup5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(6));

    // Act
    AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext actualExpressionOrExpressionGroupResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).expressionOrExpressionGroup();

    // Assert
    assertEquals(-1, actualExpressionOrExpressionGroupResult.invokingState);
    assertEquals(1, actualExpressionOrExpressionGroupResult.children.size());
    assertNull(actualExpressionOrExpressionGroupResult.getParent());
    Token token = actualExpressionOrExpressionGroupResult.stop;
    assertSame(token, actualExpressionOrExpressionGroupResult.getStart());
    Token stop = actualExpressionOrExpressionGroupResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualExpressionOrExpressionGroupResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    AggregationAwareParserGrammar.ExpressionContext expressionResult = actualExpressionOrExpressionGroupResult
        .expression();
    assertSame(stop, expressionResult.getStart());
    assertEquals(2, expressionResult.depth());
    assertFalse(expressionResult.isEmpty());
    assertSame(stop, expressionResult.getStop());
    List<ParseTree> parseTreeList = expressionResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, expressionResult.getChildCount());
    assertEquals("null", expressionResult.getText());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("[212 379]", getResult.toString());
    assertEquals(212, ((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).invokingState);
    assertSame(stop, ((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).getStop());
    assertNull(((AggregationAwareParserGrammar.AtomicExpressionContext) getResult).dsl());
    Interval expectedSourceInterval = actualExpressionOrExpressionGroupResult.getSourceInterval();
    assertSame(expectedSourceInterval, getResult.getSourceInterval());
  }

  @Test
  public void testExpressionOrExpressionGroupContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext expressionOrExpressionGroupContext = new AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(expressionOrExpressionGroupContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionOrExpressionGroupContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext expressionOrExpressionGroupContext = new AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext(
        new ParserRuleContext(), 1);
    expressionOrExpressionGroupContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(expressionOrExpressionGroupContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionOrExpressionGroupContextExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext(new ParserRuleContext(), 1))
        .expression());
  }

  @Test
  public void testExpressionOrExpressionGroupContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(26, (new AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testExpressionPart() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ExpressionPartContext actualExpressionPartResult = aggregationAwareParserGrammar
        .expressionPart();

    // Assert
    RecognitionException recognitionException = actualExpressionPartResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualExpressionPartResult.invokingState);
    assertNull(actualExpressionPartResult.getParent());
    Token expectedStart = actualExpressionPartResult.start;
    Token start = actualExpressionPartResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExpressionPartResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(365, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualExpressionPartResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testExpressionPartContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionPartContext expressionPartContext = new AggregationAwareParserGrammar.ExpressionPartContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(expressionPartContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionPartContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionPartContext expressionPartContext = new AggregationAwareParserGrammar.ExpressionPartContext(
        new ParserRuleContext(), 1);
    expressionPartContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(expressionPartContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionPartContextArithmeticPart() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionPartContext(new ParserRuleContext(), 1)).arithmeticPart());
  }

  @Test
  public void testExpressionPartContextBooleanPart() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionPartContext(new ParserRuleContext(), 1)).booleanPart());
  }

  @Test
  public void testExpressionPartContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(23,
        (new AggregationAwareParserGrammar.ExpressionPartContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testExpressionsArray() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ExpressionsArrayContext actualExpressionsArrayResult = aggregationAwareParserGrammar
        .expressionsArray();

    // Assert
    RecognitionException recognitionException = actualExpressionsArrayResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualExpressionsArrayResult.invokingState);
    assertNull(actualExpressionsArrayResult.getParent());
    Token expectedStart = actualExpressionsArrayResult.start;
    Token start = actualExpressionsArrayResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExpressionsArrayResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(381, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualExpressionsArrayResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testExpressionsArrayContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionsArrayContext expressionsArrayContext = new AggregationAwareParserGrammar.ExpressionsArrayContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(expressionsArrayContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionsArrayContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ExpressionsArrayContext expressionsArrayContext = new AggregationAwareParserGrammar.ExpressionsArrayContext(
        new ParserRuleContext(), 1);
    expressionsArrayContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(expressionsArrayContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testExpressionsArrayContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testExpressionsArrayContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testExpressionsArrayContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new AggregationAwareParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testExpressionsArrayContextExpression() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)).expression().isEmpty());
    assertNull((new AggregationAwareParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testExpressionsArrayContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(27,
        (new AggregationAwareParserGrammar.ExpressionsArrayContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testFromMultiplicity() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.FromMultiplicityContext actualFromMultiplicityResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).fromMultiplicity();

    // Assert
    assertEquals(-1, actualFromMultiplicityResult.invokingState);
    List<ParseTree> parseTreeList = actualFromMultiplicityResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualFromMultiplicityResult.getParent());
    Token expectedStart = actualFromMultiplicityResult.start;
    Token start = actualFromMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFromMultiplicityResult.getStop());
    assertEquals(1, actualFromMultiplicityResult.getChildCount());
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
    assertSame(actualFromMultiplicityResult, getResult.getParent());
    assertEquals("<missing INTEGER>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing INTEGER>',<19>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(19, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing INTEGER>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testFromMultiplicity2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.FromMultiplicityContext actualFromMultiplicityResult = aggregationAwareParserGrammar
        .fromMultiplicity();

    // Assert
    RecognitionException recognitionException = actualFromMultiplicityResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualFromMultiplicityResult.children.size());
    assertNull(actualFromMultiplicityResult.getParent());
    Token expectedStart = actualFromMultiplicityResult.stop;
    Token start = actualFromMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualFromMultiplicityResult.getStop());
    assertEquals("null", actualFromMultiplicityResult.getText());
    assertEquals(1, actualFromMultiplicityResult.getChildCount());
    assertTrue(actualFromMultiplicityResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(754, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualFromMultiplicityResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testFromMultiplicity3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.FromMultiplicityContext actualFromMultiplicityResult = aggregationAwareParserGrammar
        .fromMultiplicity();

    // Assert
    RecognitionException recognitionException = actualFromMultiplicityResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualFromMultiplicityResult.children.size());
    assertNull(actualFromMultiplicityResult.getParent());
    Token expectedStart = actualFromMultiplicityResult.stop;
    Token start = actualFromMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualFromMultiplicityResult.getStop());
    assertEquals("Input", actualFromMultiplicityResult.getText());
    assertEquals(1, actualFromMultiplicityResult.getChildCount());
    assertTrue(actualFromMultiplicityResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(754, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualFromMultiplicityResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testFromMultiplicity4() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.FromMultiplicityContext actualFromMultiplicityResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).fromMultiplicity();

    // Assert
    assertEquals(-1, actualFromMultiplicityResult.invokingState);
    assertEquals(1, actualFromMultiplicityResult.children.size());
    assertNull(actualFromMultiplicityResult.getParent());
    Token expectedStart = actualFromMultiplicityResult.start;
    Token start = actualFromMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFromMultiplicityResult.getStop());
    assertEquals("<missing INTEGER>", actualFromMultiplicityResult.getText());
    assertEquals(1, actualFromMultiplicityResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
  }

  @Test
  public void testFromMultiplicity5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.FromMultiplicityContext actualFromMultiplicityResult = aggregationAwareParserGrammar
        .fromMultiplicity();

    // Assert
    RecognitionException recognitionException = actualFromMultiplicityResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualFromMultiplicityResult.children.size());
    assertNull(actualFromMultiplicityResult.getParent());
    Token expectedStart = actualFromMultiplicityResult.stop;
    Token start = actualFromMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualFromMultiplicityResult.getStop());
    assertEquals("Input", actualFromMultiplicityResult.getText());
    assertEquals(1, actualFromMultiplicityResult.getChildCount());
    assertTrue(actualFromMultiplicityResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(754, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualFromMultiplicityResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testFromMultiplicity6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.FromMultiplicityContext actualFromMultiplicityResult = aggregationAwareParserGrammar
        .fromMultiplicity();

    // Assert
    assertEquals(-1, actualFromMultiplicityResult.invokingState);
    List<ParseTree> parseTreeList = actualFromMultiplicityResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualFromMultiplicityResult.getParent());
    Token expectedStart = actualFromMultiplicityResult.start;
    Token start = actualFromMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFromMultiplicityResult.getStop());
    assertEquals(1, actualFromMultiplicityResult.getChildCount());
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
    assertSame(actualFromMultiplicityResult, getResult.getParent());
    assertEquals("<missing INTEGER>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing INTEGER>',<19>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(19, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing INTEGER>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testFromMultiplicityContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.FromMultiplicityContext fromMultiplicityContext = new AggregationAwareParserGrammar.FromMultiplicityContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(fromMultiplicityContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFromMultiplicityContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.FromMultiplicityContext fromMultiplicityContext = new AggregationAwareParserGrammar.FromMultiplicityContext(
        new ParserRuleContext(), 1);
    fromMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(fromMultiplicityContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFromMultiplicityContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(66,
        (new AggregationAwareParserGrammar.FromMultiplicityContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testFromMultiplicityContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.FromMultiplicityContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testFunctionExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.FunctionExpressionContext actualFunctionExpressionResult = aggregationAwareParserGrammar
        .functionExpression();

    // Assert
    RecognitionException recognitionException = actualFunctionExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualFunctionExpressionResult.invokingState);
    assertNull(actualFunctionExpressionResult.getParent());
    Token expectedStart = actualFunctionExpressionResult.start;
    Token start = actualFunctionExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFunctionExpressionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(409, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualFunctionExpressionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testFunctionExpressionContextARROW() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1)).ARROW().isEmpty());
    assertNull((new AggregationAwareParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1)).ARROW(1));
  }

  @Test
  public void testFunctionExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.FunctionExpressionContext functionExpressionContext = new AggregationAwareParserGrammar.FunctionExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(functionExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.FunctionExpressionContext functionExpressionContext = new AggregationAwareParserGrammar.FunctionExpressionContext(
        new ParserRuleContext(), 1);
    functionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(functionExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionExpressionContextFunctionExpressionParameters() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1))
        .functionExpressionParameters()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1))
        .functionExpressionParameters(1));
  }

  @Test
  public void testFunctionExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(31,
        (new AggregationAwareParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testFunctionExpressionContextQualifiedName() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1)).qualifiedName()
        .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.FunctionExpressionContext(new ParserRuleContext(), 1)).qualifiedName(1));
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameter() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext actualFunctionExpressionLatestMilestoningDateParameterResult = aggregationAwareParserGrammar
        .functionExpressionLatestMilestoningDateParameter();

    // Assert
    RecognitionException recognitionException = actualFunctionExpressionLatestMilestoningDateParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualFunctionExpressionLatestMilestoningDateParameterResult.invokingState);
    assertNull(actualFunctionExpressionLatestMilestoningDateParameterResult.getParent());
    Token expectedStart = actualFunctionExpressionLatestMilestoningDateParameterResult.start;
    Token start = actualFunctionExpressionLatestMilestoningDateParameterResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFunctionExpressionLatestMilestoningDateParameterResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(421, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualFunctionExpressionLatestMilestoningDateParameterResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameter2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext actualFunctionExpressionLatestMilestoningDateParameterResult = aggregationAwareParserGrammar
        .functionExpressionLatestMilestoningDateParameter();

    // Assert
    RecognitionException recognitionException = actualFunctionExpressionLatestMilestoningDateParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualFunctionExpressionLatestMilestoningDateParameterResult.children.size());
    assertNull(actualFunctionExpressionLatestMilestoningDateParameterResult.getParent());
    Token expectedStart = actualFunctionExpressionLatestMilestoningDateParameterResult.stop;
    Token start = actualFunctionExpressionLatestMilestoningDateParameterResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualFunctionExpressionLatestMilestoningDateParameterResult.getStop());
    assertEquals("null", actualFunctionExpressionLatestMilestoningDateParameterResult.getText());
    assertEquals(1, actualFunctionExpressionLatestMilestoningDateParameterResult.getChildCount());
    assertTrue(actualFunctionExpressionLatestMilestoningDateParameterResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(421, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualFunctionExpressionLatestMilestoningDateParameterResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameter3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(41));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext actualFunctionExpressionLatestMilestoningDateParameterResult = aggregationAwareParserGrammar
        .functionExpressionLatestMilestoningDateParameter();

    // Assert
    RecognitionException recognitionException = actualFunctionExpressionLatestMilestoningDateParameterResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualFunctionExpressionLatestMilestoningDateParameterResult.children.size());
    assertNull(actualFunctionExpressionLatestMilestoningDateParameterResult.getParent());
    Token expectedStart = actualFunctionExpressionLatestMilestoningDateParameterResult.stop;
    Token start = actualFunctionExpressionLatestMilestoningDateParameterResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualFunctionExpressionLatestMilestoningDateParameterResult.getStop());
    assertEquals("null", actualFunctionExpressionLatestMilestoningDateParameterResult.getText());
    assertEquals(1, actualFunctionExpressionLatestMilestoningDateParameterResult.getChildCount());
    assertTrue(actualFunctionExpressionLatestMilestoningDateParameterResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(422, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualFunctionExpressionLatestMilestoningDateParameterResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameterContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext functionExpressionLatestMilestoningDateParameterContext = new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(functionExpressionLatestMilestoningDateParameterContext
        .<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameterContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext functionExpressionLatestMilestoningDateParameterContext = new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1);
    functionExpressionLatestMilestoningDateParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(functionExpressionLatestMilestoningDateParameterContext
        .<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameterContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1)).COMMA());
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameterContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(32, (new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameterContextLATEST_DATE() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1)).LATEST_DATE().isEmpty());
    assertNull((new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1)).LATEST_DATE(1));
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameterContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testFunctionExpressionLatestMilestoningDateParameterContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.FunctionExpressionLatestMilestoningDateParameterContext(
        new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testFunctionExpressionParameters() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.FunctionExpressionParametersContext actualFunctionExpressionParametersResult = aggregationAwareParserGrammar
        .functionExpressionParameters();

    // Assert
    RecognitionException recognitionException = actualFunctionExpressionParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualFunctionExpressionParametersResult.invokingState);
    assertNull(actualFunctionExpressionParametersResult.getParent());
    Token expectedStart = actualFunctionExpressionParametersResult.start;
    Token start = actualFunctionExpressionParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFunctionExpressionParametersResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(429, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualFunctionExpressionParametersResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testFunctionExpressionParametersContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.FunctionExpressionParametersContext functionExpressionParametersContext = new AggregationAwareParserGrammar.FunctionExpressionParametersContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(functionExpressionParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionExpressionParametersContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.FunctionExpressionParametersContext functionExpressionParametersContext = new AggregationAwareParserGrammar.FunctionExpressionParametersContext(
        new ParserRuleContext(), 1);
    functionExpressionParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(functionExpressionParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionExpressionParametersContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1)).COMMA()
            .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testFunctionExpressionParametersContextCombinedExpression() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1))
        .combinedExpression()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1))
        .combinedExpression(1));
  }

  @Test
  public void testFunctionExpressionParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(33, (new AggregationAwareParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testFunctionExpressionParametersContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1))
        .PAREN_CLOSE());
  }

  @Test
  public void testFunctionExpressionParametersContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.FunctionExpressionParametersContext(new ParserRuleContext(), 1))
        .PAREN_OPEN());
  }

  @Test
  public void testFunctionTypePureType() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.FunctionTypePureTypeContext actualFunctionTypePureTypeResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).functionTypePureType();

    // Assert
    assertEquals(-1, actualFunctionTypePureTypeResult.invokingState);
    assertEquals(2, actualFunctionTypePureTypeResult.children.size());
    assertNull(actualFunctionTypePureTypeResult.getParent());
    Token expectedStart = actualFunctionTypePureTypeResult.start;
    Token start = actualFunctionTypePureTypeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFunctionTypePureTypeResult.getStop());
    assertEquals(2, actualFunctionTypePureTypeResult.getChildCount());
    AggregationAwareParserGrammar.MultiplicityContext multiplicityResult = actualFunctionTypePureTypeResult
        .multiplicity();
    assertTrue(multiplicityResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(759, multiplicityResult.invokingState);
    assertNull(multiplicityResult.getStop());
    assertEquals("[759]", multiplicityResult.toString());
    assertEquals(1, start.getLine());
    AggregationAwareParserGrammar.TypeContext typeResult = actualFunctionTypePureTypeResult.type();
    assertEquals(758, typeResult.invokingState);
    assertEquals(-1, start.getType());
    assertSame(start, typeResult.getStart());
    assertEquals(2, typeResult.depth());
    assertNull(typeResult.getStop());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertSame(listTokenSource, start.getTokenSource());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertTrue(typeResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(start.getInputStream());
  }

  @Test
  public void testFunctionTypePureTypeContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.FunctionTypePureTypeContext functionTypePureTypeContext = new AggregationAwareParserGrammar.FunctionTypePureTypeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(functionTypePureTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionTypePureTypeContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.FunctionTypePureTypeContext functionTypePureTypeContext = new AggregationAwareParserGrammar.FunctionTypePureTypeContext(
        new ParserRuleContext(), 1);
    functionTypePureTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(functionTypePureTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionTypePureTypeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(68,
        (new AggregationAwareParserGrammar.FunctionTypePureTypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testFunctionTypePureTypeContextMultiplicity() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.FunctionTypePureTypeContext(new ParserRuleContext(), 1)).multiplicity());
  }

  @Test
  public void testFunctionTypePureTypeContextType() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.FunctionTypePureTypeContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void testFunctionVariableExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.FunctionVariableExpressionContext actualFunctionVariableExpressionResult = aggregationAwareParserGrammar
        .functionVariableExpression();

    // Assert
    RecognitionException recognitionException = actualFunctionVariableExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualFunctionVariableExpressionResult.getChildCount());
    assertEquals(1, actualFunctionVariableExpressionResult.depth());
    assertEquals(-1, actualFunctionVariableExpressionResult.invokingState);
    Token expectedStart = actualFunctionVariableExpressionResult.start;
    Token start = actualFunctionVariableExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFunctionVariableExpressionResult.getStop());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(700, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualFunctionVariableExpressionResult, recognitionException.getCtx());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualFunctionVariableExpressionResult
        .identifier();
    assertEquals(699, identifierResult.invokingState);
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertNull(identifierResult.getStop());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertTrue(identifierResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, start.getStartIndex());
    assertEquals("[@0,-1:-1='EOF',<-1>,1:0]", start.toString());
    assertEquals(-1, start.getStopIndex());
    assertNull(start.getInputStream());
    assertSame(listTokenSource, start.getTokenSource());
  }

  @Test
  public void testFunctionVariableExpression2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.FunctionVariableExpressionContext actualFunctionVariableExpressionResult = aggregationAwareParserGrammar
        .functionVariableExpression();

    // Assert
    RecognitionException recognitionException = actualFunctionVariableExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualFunctionVariableExpressionResult.getChildCount());
    assertEquals(1, actualFunctionVariableExpressionResult.depth());
    assertEquals(-1, actualFunctionVariableExpressionResult.invokingState);
    Token expectedStart = actualFunctionVariableExpressionResult.stop;
    Token start = actualFunctionVariableExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualFunctionVariableExpressionResult.children.size());
    assertSame(start, actualFunctionVariableExpressionResult.getStop());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(700, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualFunctionVariableExpressionResult, recognitionException.getCtx());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualFunctionVariableExpressionResult
        .identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    assertEquals("null", identifierResult.getText());
    assertTrue(identifierResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals("[@0,0:0='<no text>',<1>,0:-1]", start.toString());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
  }

  @Test
  public void testFunctionVariableExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.FunctionVariableExpressionContext functionVariableExpressionContext = new AggregationAwareParserGrammar.FunctionVariableExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(functionVariableExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionVariableExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.FunctionVariableExpressionContext functionVariableExpressionContext = new AggregationAwareParserGrammar.FunctionVariableExpressionContext(
        new ParserRuleContext(), 1);
    functionVariableExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(functionVariableExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testFunctionVariableExpressionContextCOLON() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.FunctionVariableExpressionContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testFunctionVariableExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(59, (new AggregationAwareParserGrammar.FunctionVariableExpressionContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testFunctionVariableExpressionContextIdentifier() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.FunctionVariableExpressionContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testFunctionVariableExpressionContextMultiplicity() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.FunctionVariableExpressionContext(new ParserRuleContext(), 1))
        .multiplicity());
  }

  @Test
  public void testFunctionVariableExpressionContextType() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.FunctionVariableExpressionContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void testGroupByFunctionSpecification() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.GroupByFunctionSpecificationContext actualGroupByFunctionSpecificationResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).groupByFunctionSpecification();

    // Assert
    assertEquals(-1, actualGroupByFunctionSpecificationResult.invokingState);
    List<ParseTree> parseTreeList = actualGroupByFunctionSpecificationResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualGroupByFunctionSpecificationResult.getParent());
    Token expectedStart = actualGroupByFunctionSpecificationResult.start;
    Token start = actualGroupByFunctionSpecificationResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualGroupByFunctionSpecificationResult.getStop());
    assertEquals(1, actualGroupByFunctionSpecificationResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).isEmpty());
    assertNull(((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    assertEquals(1, tokenSource.getLine());
    assertEquals("", getResult.getText());
    assertEquals("([191] ([372 191] [379 372 191]))", getResult.toStringTree());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertEquals("[372 191]", getResult1.toString());
    assertEquals(372, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult1).invokingState);
  }

  @Test
  public void testGroupByFunctionSpecificationContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.GroupByFunctionSpecificationContext groupByFunctionSpecificationContext = new AggregationAwareParserGrammar.GroupByFunctionSpecificationContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(groupByFunctionSpecificationContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGroupByFunctionSpecificationContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.GroupByFunctionSpecificationContext groupByFunctionSpecificationContext = new AggregationAwareParserGrammar.GroupByFunctionSpecificationContext(
        new ParserRuleContext(), 1);
    groupByFunctionSpecificationContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(groupByFunctionSpecificationContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGroupByFunctionSpecificationContextCombinedExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.GroupByFunctionSpecificationContext(new ParserRuleContext(), 1))
        .combinedExpression());
  }

  @Test
  public void testGroupByFunctionSpecifications() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext actualGroupByFunctionSpecificationsResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).groupByFunctionSpecifications();

    // Assert
    assertEquals(-1, actualGroupByFunctionSpecificationsResult.invokingState);
    List<ParseTree> parseTreeList = actualGroupByFunctionSpecificationsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualGroupByFunctionSpecificationsResult.getParent());
    Token expectedStart = actualGroupByFunctionSpecificationsResult.start;
    Token start = actualGroupByFunctionSpecificationsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualGroupByFunctionSpecificationsResult.getStop());
    assertEquals(1, actualGroupByFunctionSpecificationsResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.GroupByFunctionSpecificationContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.GroupByFunctionSpecificationContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.GroupByFunctionSpecificationContext) getResult).isEmpty());
    assertNull(((AggregationAwareParserGrammar.GroupByFunctionSpecificationContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((AggregationAwareParserGrammar.GroupByFunctionSpecificationContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    assertEquals(1, tokenSource.getLine());
    assertEquals("", getResult.getText());
    assertEquals("([183] ([191 183] ([372 191 183] [379 372 191 183])))", getResult.toStringTree());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertEquals("[191 183]", getResult1.toString());
    assertEquals(191, ((AggregationAwareParserGrammar.CombinedExpressionContext) getResult1).invokingState);
  }

  @Test
  public void testGroupByFunctionSpecificationsContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext groupByFunctionSpecificationsContext = new AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(groupByFunctionSpecificationsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGroupByFunctionSpecificationsContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext groupByFunctionSpecificationsContext = new AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext(
        new ParserRuleContext(), 1);
    groupByFunctionSpecificationsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(groupByFunctionSpecificationsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testGroupByFunctionSpecificationsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext(new ParserRuleContext(), 1)).COMMA()
            .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testGroupByFunctionSpecificationsContextGroupByFunctionSpecification() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext(new ParserRuleContext(), 1))
        .groupByFunctionSpecification()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.GroupByFunctionSpecificationsContext(new ParserRuleContext(), 1))
        .groupByFunctionSpecification(1));
  }

  @Test
  public void testIdentifier() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    AggregationAwareParserGrammar.IdentifierContext actualIdentifierResult = aggregationAwareParserGrammar.identifier();

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
    assertNull(aggregationAwareParserGrammar.getRuleContext());
    assertEquals(-1, aggregationAwareParserGrammar.getState());
  }

  @Test
  public void testIdentifier2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.IdentifierContext actualIdentifierResult = aggregationAwareParserGrammar.identifier();

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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(164, recognitionException.getOffendingState());
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
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.IdentifierContext actualIdentifierResult = aggregationAwareParserGrammar.identifier();

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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(164, recognitionException.getOffendingState());
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
    AggregationAwareParserGrammar.IdentifierContext actualIdentifierResult = (new AggregationAwareParserGrammar(
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

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.IdentifierContext actualIdentifierResult = aggregationAwareParserGrammar.identifier();

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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(164, recognitionException.getOffendingState());
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

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.IdentifierContext actualIdentifierResult = aggregationAwareParserGrammar.identifier();

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
    assertNull(aggregationAwareParserGrammar.getRuleContext());
    assertEquals(-1, aggregationAwareParserGrammar.getState());
  }

  @Test
  public void testIdentifierContextALL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).ALL());
  }

  @Test
  public void testIdentifierContextALL_VERSIONS() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).ALL_VERSIONS());
  }

  @Test
  public void testIdentifierContextALL_VERSIONS_IN_RANGE() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).ALL_VERSIONS_IN_RANGE());
  }

  @Test
  public void testIdentifierContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.IdentifierContext identifierContext = new AggregationAwareParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.IdentifierContext identifierContext = new AggregationAwareParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextLET() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).LET());
  }

  @Test
  public void testIdentifierContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testIdentifierContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testInstance() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstanceContext actualInstanceResult = aggregationAwareParserGrammar.instance();

    // Assert
    RecognitionException recognitionException = actualInstanceResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualInstanceResult.invokingState);
    assertEquals(1, actualInstanceResult.depth());
    Token expectedStart = actualInstanceResult.start;
    Token start = actualInstanceResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceResult.getStop());
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(233, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualInstanceResult, recognitionException.getCtx());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testInstanceAtomicRightSide() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstanceAtomicRightSideContext actualInstanceAtomicRightSideResult = aggregationAwareParserGrammar
        .instanceAtomicRightSide();

    // Assert
    RecognitionException recognitionException = actualInstanceAtomicRightSideResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualInstanceAtomicRightSideResult.invokingState);
    assertEquals(1, actualInstanceAtomicRightSideResult.depth());
    Token expectedStart = actualInstanceAtomicRightSideResult.start;
    Token start = actualInstanceAtomicRightSideResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceAtomicRightSideResult.getStop());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(actualInstanceAtomicRightSideResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(320, recognitionException.getOffendingState());
    assertEquals(0, start.getTokenIndex());
    assertNull(start.getInputStream());
    assertEquals("EOF", start.getText());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testInstanceAtomicRightSideContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.InstanceAtomicRightSideContext instanceAtomicRightSideContext = new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceAtomicRightSideContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceAtomicRightSideContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.InstanceAtomicRightSideContext instanceAtomicRightSideContext = new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceAtomicRightSideContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceAtomicRightSideContextEnumReference() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)).enumReference());
  }

  @Test
  public void testInstanceAtomicRightSideContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(14,
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testInstanceAtomicRightSideContextIdentifier() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testInstanceAtomicRightSideContextInstance() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)).instance());
  }

  @Test
  public void testInstanceAtomicRightSideContextInstanceLiteral() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1))
        .instanceLiteral());
  }

  @Test
  public void testInstanceAtomicRightSideContextLATEST_DATE() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)).LATEST_DATE());
  }

  @Test
  public void testInstanceAtomicRightSideContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testInstanceAtomicRightSideContextStereotypeReference() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1))
        .stereotypeReference());
  }

  @Test
  public void testInstanceAtomicRightSideContextTagReference() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideContext(new ParserRuleContext(), 1)).tagReference());
  }

  @Test
  public void testInstanceAtomicRightSideScalar() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext actualInstanceAtomicRightSideScalarResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).instanceAtomicRightSideScalar();

    // Assert
    assertEquals(-1, actualInstanceAtomicRightSideScalarResult.invokingState);
    List<ParseTree> parseTreeList = actualInstanceAtomicRightSideScalarResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualInstanceAtomicRightSideScalarResult.getParent());
    Token expectedStart = actualInstanceAtomicRightSideScalarResult.start;
    Token start = actualInstanceAtomicRightSideScalarResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceAtomicRightSideScalarResult.getStop());
    assertEquals(1, actualInstanceAtomicRightSideScalarResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.InstanceAtomicRightSideContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.InstanceAtomicRightSideContext) parseTreeList.get(0)).depth());
    assertFalse(((AggregationAwareParserGrammar.InstanceAtomicRightSideContext) parseTreeList.get(0)).isEmpty());
    assertNull(((AggregationAwareParserGrammar.InstanceAtomicRightSideContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    assertTrue(((AggregationAwareParserGrammar.InstanceAtomicRightSideContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testInstanceAtomicRightSideScalarContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext instanceAtomicRightSideScalarContext = new AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceAtomicRightSideScalarContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceAtomicRightSideScalarContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext instanceAtomicRightSideScalarContext = new AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideScalarContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceAtomicRightSideScalarContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceAtomicRightSideScalarContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(12,
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext(new ParserRuleContext(), 1))
            .getRuleIndex());
  }

  @Test
  public void testInstanceAtomicRightSideScalarContextInstanceAtomicRightSide() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceAtomicRightSideScalarContext(new ParserRuleContext(), 1))
        .instanceAtomicRightSide());
  }

  @Test
  public void testInstanceAtomicRightSideVector() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext actualInstanceAtomicRightSideVectorResult = aggregationAwareParserGrammar
        .instanceAtomicRightSideVector();

    // Assert
    RecognitionException recognitionException = actualInstanceAtomicRightSideVectorResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualInstanceAtomicRightSideVectorResult.invokingState);
    assertNull(actualInstanceAtomicRightSideVectorResult.getParent());
    Token expectedStart = actualInstanceAtomicRightSideVectorResult.start;
    Token start = actualInstanceAtomicRightSideVectorResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceAtomicRightSideVectorResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(299, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualInstanceAtomicRightSideVectorResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testInstanceAtomicRightSideVectorContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext instanceAtomicRightSideVectorContext = new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceAtomicRightSideVectorContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceAtomicRightSideVectorContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext instanceAtomicRightSideVectorContext = new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(
        new ParserRuleContext(), 1);
    instanceAtomicRightSideVectorContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceAtomicRightSideVectorContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceAtomicRightSideVectorContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1))
        .BRACKET_CLOSE());
  }

  @Test
  public void testInstanceAtomicRightSideVectorContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1))
        .BRACKET_OPEN());
  }

  @Test
  public void testInstanceAtomicRightSideVectorContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1)).COMMA()
            .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testInstanceAtomicRightSideVectorContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(13,
        (new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1))
            .getRuleIndex());
  }

  @Test
  public void testInstanceAtomicRightSideVectorContextInstanceAtomicRightSide() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1))
        .instanceAtomicRightSide()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.InstanceAtomicRightSideVectorContext(new ParserRuleContext(), 1))
        .instanceAtomicRightSide(1));
  }

  @Test
  public void testInstanceContextAT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).AT());
  }

  @Test
  public void testInstanceContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.InstanceContext instanceContext = new AggregationAwareParserGrammar.InstanceContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.InstanceContext instanceContext = new AggregationAwareParserGrammar.InstanceContext(
        new ParserRuleContext(), 1);
    instanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testInstanceContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testInstanceContextFILE_NAME() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).FILE_NAME());
  }

  @Test
  public void testInstanceContextFILE_NAME_END() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).FILE_NAME_END());
  }

  @Test
  public void testInstanceContextGREATER_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).GREATER_THAN());
  }

  @Test
  public void testInstanceContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(7, (new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testInstanceContextINTEGER() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).INTEGER().isEmpty());
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).INTEGER(1));
  }

  @Test
  public void testInstanceContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testInstanceContextInstancePropertyAssignment() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).instancePropertyAssignment()
            .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).instancePropertyAssignment(1));
  }

  @Test
  public void testInstanceContextLESS_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).LESS_THAN());
  }

  @Test
  public void testInstanceContextMultiplicityArguments() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).multiplicityArguments());
  }

  @Test
  public void testInstanceContextNEW_SYMBOL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).NEW_SYMBOL());
  }

  @Test
  public void testInstanceContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testInstanceContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testInstanceContextPIPE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).PIPE());
  }

  @Test
  public void testInstanceContextQualifiedName() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).qualifiedName().isEmpty());
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).qualifiedName(1));
  }

  @Test
  public void testInstanceContextTypeArguments() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceContext(new ParserRuleContext(), 1)).typeArguments());
  }

  @Test
  public void testInstanceLiteral() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstanceLiteralContext actualInstanceLiteralResult = aggregationAwareParserGrammar
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
    assertEquals(622, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
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
    AggregationAwareParserGrammar.InstanceLiteralContext instanceLiteralContext = new AggregationAwareParserGrammar.InstanceLiteralContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceLiteralContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceLiteralContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.InstanceLiteralContext instanceLiteralContext = new AggregationAwareParserGrammar.InstanceLiteralContext(
        new ParserRuleContext(), 1);
    instanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceLiteralContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceLiteralContextDECIMAL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).DECIMAL());
  }

  @Test
  public void testInstanceLiteralContextFLOAT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).FLOAT());
  }

  @Test
  public void testInstanceLiteralContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(54,
        (new AggregationAwareParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testInstanceLiteralContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testInstanceLiteralContextInstanceLiteralToken() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).instanceLiteralToken());
  }

  @Test
  public void testInstanceLiteralContextMINUS() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void testInstanceLiteralContextPLUS() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralContext(new ParserRuleContext(), 1)).PLUS());
  }

  @Test
  public void testInstanceLiteralToken() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    AggregationAwareParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = aggregationAwareParserGrammar
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
    assertNull(aggregationAwareParserGrammar.getRuleContext());
    assertEquals(-1, aggregationAwareParserGrammar.getState());
  }

  @Test
  public void testInstanceLiteralToken2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = aggregationAwareParserGrammar
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(624, recognitionException.getOffendingState());
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
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = aggregationAwareParserGrammar
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(624, recognitionException.getOffendingState());
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
    AggregationAwareParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = (new AggregationAwareParserGrammar(
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

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = aggregationAwareParserGrammar
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(624, recognitionException.getOffendingState());
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

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.InstanceLiteralTokenContext actualInstanceLiteralTokenResult = aggregationAwareParserGrammar
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
    assertNull(aggregationAwareParserGrammar.getRuleContext());
    assertEquals(-1, aggregationAwareParserGrammar.getState());
  }

  @Test
  public void testInstanceLiteralTokenContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.InstanceLiteralTokenContext instanceLiteralTokenContext = new AggregationAwareParserGrammar.InstanceLiteralTokenContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceLiteralTokenContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceLiteralTokenContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.InstanceLiteralTokenContext instanceLiteralTokenContext = new AggregationAwareParserGrammar.InstanceLiteralTokenContext(
        new ParserRuleContext(), 1);
    instanceLiteralTokenContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceLiteralTokenContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceLiteralTokenContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testInstanceLiteralTokenContextDATE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).DATE());
  }

  @Test
  public void testInstanceLiteralTokenContextDECIMAL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).DECIMAL());
  }

  @Test
  public void testInstanceLiteralTokenContextFLOAT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).FLOAT());
  }

  @Test
  public void testInstanceLiteralTokenContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(55,
        (new AggregationAwareParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testInstanceLiteralTokenContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testInstanceLiteralTokenContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceLiteralTokenContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testInstancePropertyAssignment() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstancePropertyAssignmentContext actualInstancePropertyAssignmentResult = aggregationAwareParserGrammar
        .instancePropertyAssignment();

    // Assert
    RecognitionException recognitionException = actualInstancePropertyAssignmentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualInstancePropertyAssignmentResult.getChildCount());
    assertEquals(1, actualInstancePropertyAssignmentResult.depth());
    assertEquals(1, actualInstancePropertyAssignmentResult.children.size());
    Token expectedStart = actualInstancePropertyAssignmentResult.start;
    Token start = actualInstancePropertyAssignmentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstancePropertyAssignmentResult.getStop());
    assertTrue(actualInstancePropertyAssignmentResult.isEmpty());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertSame(listTokenSource, start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(290, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualInstancePropertyAssignmentResult, recognitionException.getCtx());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualInstancePropertyAssignmentResult
        .identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertNull(identifierResult.getStop());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertTrue(identifierResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(start.getInputStream());
    assertEquals("EOF", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals("[@0,-1:-1='EOF',<-1>,1:0]", start.toString());
  }

  @Test
  public void testInstancePropertyAssignment2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstancePropertyAssignmentContext actualInstancePropertyAssignmentResult = aggregationAwareParserGrammar
        .instancePropertyAssignment();

    // Assert
    RecognitionException recognitionException = actualInstancePropertyAssignmentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualInstancePropertyAssignmentResult.getChildCount());
    assertEquals(1, actualInstancePropertyAssignmentResult.depth());
    Token expectedStart = actualInstancePropertyAssignmentResult.stop;
    Token start = actualInstancePropertyAssignmentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualInstancePropertyAssignmentResult.getStop());
    assertTrue(actualInstancePropertyAssignmentResult.isEmpty());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualInstancePropertyAssignmentResult
        .identifier();
    assertSame(start, identifierResult.getStop());
    assertEquals(290, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualInstancePropertyAssignmentResult, recognitionException.getCtx());
    assertEquals(289, identifierResult.invokingState);
    assertEquals("null", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(0, start.getTokenIndex());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertTrue(identifierResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, identifierResult.getChildCount());
  }

  @Test
  public void testInstancePropertyAssignmentContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.InstancePropertyAssignmentContext instancePropertyAssignmentContext = new AggregationAwareParserGrammar.InstancePropertyAssignmentContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instancePropertyAssignmentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstancePropertyAssignmentContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.InstancePropertyAssignmentContext instancePropertyAssignmentContext = new AggregationAwareParserGrammar.InstancePropertyAssignmentContext(
        new ParserRuleContext(), 1);
    instancePropertyAssignmentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instancePropertyAssignmentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstancePropertyAssignmentContextEQUAL() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstancePropertyAssignmentContext(new ParserRuleContext(), 1)).EQUAL());
  }

  @Test
  public void testInstancePropertyAssignmentContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(10, (new AggregationAwareParserGrammar.InstancePropertyAssignmentContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testInstancePropertyAssignmentContextIdentifier() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstancePropertyAssignmentContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testInstancePropertyAssignmentContextInstanceRightSide() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstancePropertyAssignmentContext(new ParserRuleContext(), 1))
        .instanceRightSide());
  }

  @Test
  public void testInstanceReference() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstanceReferenceContext actualInstanceReferenceResult = aggregationAwareParserGrammar
        .instanceReference();

    // Assert
    RecognitionException recognitionException = actualInstanceReferenceResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualInstanceReferenceResult.invokingState);
    assertNull(actualInstanceReferenceResult.getParent());
    Token expectedStart = actualInstanceReferenceResult.start;
    Token start = actualInstanceReferenceResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceReferenceResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(460, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualInstanceReferenceResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testInstanceReference2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstanceReferenceContext actualInstanceReferenceResult = aggregationAwareParserGrammar
        .instanceReference();

    // Assert
    RecognitionException recognitionException = actualInstanceReferenceResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualInstanceReferenceResult.children.size());
    assertNull(actualInstanceReferenceResult.getParent());
    Token expectedStart = actualInstanceReferenceResult.stop;
    Token start = actualInstanceReferenceResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualInstanceReferenceResult.getStop());
    assertEquals("null", actualInstanceReferenceResult.getText());
    assertEquals(1, actualInstanceReferenceResult.getChildCount());
    assertTrue(actualInstanceReferenceResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(460, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualInstanceReferenceResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testInstanceReferenceContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.InstanceReferenceContext instanceReferenceContext = new AggregationAwareParserGrammar.InstanceReferenceContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceReferenceContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.InstanceReferenceContext instanceReferenceContext = new AggregationAwareParserGrammar.InstanceReferenceContext(
        new ParserRuleContext(), 1);
    instanceReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceReferenceContextAllOrFunction() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceReferenceContext(new ParserRuleContext(), 1)).allOrFunction());
  }

  @Test
  public void testInstanceReferenceContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(35,
        (new AggregationAwareParserGrammar.InstanceReferenceContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testInstanceReferenceContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceReferenceContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testInstanceReferenceContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.InstanceReferenceContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testInstanceReferenceContextUnitName() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceReferenceContext(new ParserRuleContext(), 1)).unitName());
  }

  @Test
  public void testInstanceRightSide() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.InstanceRightSideContext actualInstanceRightSideResult = aggregationAwareParserGrammar
        .instanceRightSide();

    // Assert
    RecognitionException recognitionException = actualInstanceRightSideResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualInstanceRightSideResult.invokingState);
    assertNull(actualInstanceRightSideResult.getParent());
    Token expectedStart = actualInstanceRightSideResult.start;
    Token start = actualInstanceRightSideResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualInstanceRightSideResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(295, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualInstanceRightSideResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testInstanceRightSideContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.InstanceRightSideContext instanceRightSideContext = new AggregationAwareParserGrammar.InstanceRightSideContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(instanceRightSideContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceRightSideContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.InstanceRightSideContext instanceRightSideContext = new AggregationAwareParserGrammar.InstanceRightSideContext(
        new ParserRuleContext(), 1);
    instanceRightSideContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(instanceRightSideContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testInstanceRightSideContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(11,
        (new AggregationAwareParserGrammar.InstanceRightSideContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testInstanceRightSideContextInstanceAtomicRightSideScalar() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceRightSideContext(new ParserRuleContext(), 1))
        .instanceAtomicRightSideScalar());
  }

  @Test
  public void testInstanceRightSideContextInstanceAtomicRightSideVector() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.InstanceRightSideContext(new ParserRuleContext(), 1))
        .instanceAtomicRightSideVector());
  }

  @Test
  public void testLambdaFunction() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.LambdaFunctionContext actualLambdaFunctionResult = aggregationAwareParserGrammar
        .lambdaFunction();

    // Assert
    RecognitionException recognitionException = actualLambdaFunctionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualLambdaFunctionResult.invokingState);
    assertNull(actualLambdaFunctionResult.getParent());
    Token expectedStart = actualLambdaFunctionResult.start;
    Token start = actualLambdaFunctionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualLambdaFunctionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(465, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualLambdaFunctionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testLambdaFunctionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.LambdaFunctionContext lambdaFunctionContext = new AggregationAwareParserGrammar.LambdaFunctionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(lambdaFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLambdaFunctionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.LambdaFunctionContext lambdaFunctionContext = new AggregationAwareParserGrammar.LambdaFunctionContext(
        new ParserRuleContext(), 1);
    lambdaFunctionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(lambdaFunctionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLambdaFunctionContextBRACE_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)).BRACE_CLOSE());
  }

  @Test
  public void testLambdaFunctionContextBRACE_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)).BRACE_OPEN());
  }

  @Test
  public void testLambdaFunctionContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new AggregationAwareParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testLambdaFunctionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(36,
        (new AggregationAwareParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testLambdaFunctionContextLambdaParam() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)).lambdaParam().isEmpty());
    assertNull((new AggregationAwareParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)).lambdaParam(1));
  }

  @Test
  public void testLambdaFunctionContextLambdaPipe() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaFunctionContext(new ParserRuleContext(), 1)).lambdaPipe());
  }

  @Test
  public void testLambdaParam() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.LambdaParamContext actualLambdaParamResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).lambdaParam();

    // Assert
    assertEquals(1, actualLambdaParamResult.getChildCount());
    assertEquals(1, actualLambdaParamResult.depth());
    Token expectedStart = actualLambdaParamResult.start;
    Token start = actualLambdaParamResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualLambdaParamResult.children.size());
    assertNull(actualLambdaParamResult.getStop());
    assertTrue(actualLambdaParamResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualLambdaParamResult.identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertNull(identifierResult.getStop());
    assertEquals(1, start.getLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testLambdaParam2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    AggregationAwareParserGrammar.LambdaParamContext actualLambdaParamResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).lambdaParam();

    // Assert
    assertEquals(1, actualLambdaParamResult.getChildCount());
    assertEquals(1, actualLambdaParamResult.depth());
    Token expectedStart = actualLambdaParamResult.stop;
    Token start = actualLambdaParamResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualLambdaParamResult.getStop());
    assertTrue(actualLambdaParamResult.isEmpty());
    assertEquals(1, actualLambdaParamResult.children.size());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualLambdaParamResult.identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    RecognitionException recognitionException = identifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals("null", identifierResult.getText());
    assertEquals(0, start.getTokenIndex());
    assertEquals(164, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(identifierResult, recognitionException.getCtx());
  }

  @Test
  public void testLambdaParam3() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.LambdaParamContext actualLambdaParamResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))))).lambdaParam();

    // Assert
    assertEquals(1, actualLambdaParamResult.getChildCount());
    assertEquals(1, actualLambdaParamResult.depth());
    Token expectedStart = actualLambdaParamResult.stop;
    Token start = actualLambdaParamResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualLambdaParamResult.children.size());
    assertSame(start, actualLambdaParamResult.getStop());
    assertTrue(actualLambdaParamResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualLambdaParamResult.identifier();
    assertEquals("Input", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    RecognitionException recognitionException = identifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals("Input", start.getText());
    assertEquals(164, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(identifierResult, recognitionException.getCtx());
  }

  @Test
  public void testLambdaParam4() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.LambdaParamContext actualLambdaParamResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).lambdaParam();

    // Assert
    assertEquals(1, actualLambdaParamResult.getChildCount());
    assertEquals(1, actualLambdaParamResult.depth());
    Token expectedStart = actualLambdaParamResult.start;
    Token start = actualLambdaParamResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualLambdaParamResult.children.size());
    assertNull(actualLambdaParamResult.getStop());
    assertTrue(actualLambdaParamResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualLambdaParamResult.identifier();
    assertEquals(601, identifierResult.invokingState);
    assertEquals(1, start.getLine());
    assertNull(identifierResult.getStop());
    assertEquals(2, identifierResult.depth());
    assertEquals("<EOF>", start.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
  }

  @Test
  public void testLambdaParam5() throws RecognitionException {
    // Arrange
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.LambdaParamContext actualLambdaParamResult = aggregationAwareParserGrammar
        .lambdaParam();

    // Assert
    assertEquals(1, actualLambdaParamResult.getChildCount());
    assertEquals(1, actualLambdaParamResult.depth());
    Token expectedStart = actualLambdaParamResult.stop;
    Token start = actualLambdaParamResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualLambdaParamResult.children.size());
    assertSame(start, actualLambdaParamResult.getStop());
    assertTrue(actualLambdaParamResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualLambdaParamResult.identifier();
    assertEquals("Input", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    RecognitionException recognitionException = identifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals("Input", start.getText());
    assertEquals(164, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(identifierResult, recognitionException.getCtx());
  }

  @Test
  public void testLambdaParam6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.LambdaParamContext actualLambdaParamResult = aggregationAwareParserGrammar
        .lambdaParam();

    // Assert
    assertEquals(1, actualLambdaParamResult.getChildCount());
    assertEquals(1, actualLambdaParamResult.depth());
    Token expectedStart = actualLambdaParamResult.start;
    Token start = actualLambdaParamResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualLambdaParamResult.children.size());
    assertNull(actualLambdaParamResult.getStop());
    assertTrue(actualLambdaParamResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualLambdaParamResult.identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertNull(identifierResult.getStop());
    assertEquals(1, start.getLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testLambdaParamContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.LambdaParamContext lambdaParamContext = new AggregationAwareParserGrammar.LambdaParamContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(lambdaParamContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLambdaParamContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.LambdaParamContext lambdaParamContext = new AggregationAwareParserGrammar.LambdaParamContext(
        new ParserRuleContext(), 1);
    lambdaParamContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(lambdaParamContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLambdaParamContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(52, (new AggregationAwareParserGrammar.LambdaParamContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testLambdaParamContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaParamContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testLambdaParamContextLambdaParamType() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaParamContext(new ParserRuleContext(), 1)).lambdaParamType());
  }

  @Test
  public void testLambdaParamType() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.LambdaParamTypeContext actualLambdaParamTypeResult = aggregationAwareParserGrammar
        .lambdaParamType();

    // Assert
    RecognitionException recognitionException = actualLambdaParamTypeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualLambdaParamTypeResult.invokingState);
    assertNull(actualLambdaParamTypeResult.getParent());
    Token expectedStart = actualLambdaParamTypeResult.start;
    Token start = actualLambdaParamTypeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualLambdaParamTypeResult.getStop());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(aggregationAwareParserGrammar, recognizer);
    assertEquals(0, start.getTokenIndex());
    assertSame(actualLambdaParamTypeResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(605, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertEquals("EOF", start.getText());
    assertSame(listTokenSource, start.getTokenSource());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void testLambdaParamTypeContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.LambdaParamTypeContext lambdaParamTypeContext = new AggregationAwareParserGrammar.LambdaParamTypeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(lambdaParamTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLambdaParamTypeContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.LambdaParamTypeContext lambdaParamTypeContext = new AggregationAwareParserGrammar.LambdaParamTypeContext(
        new ParserRuleContext(), 1);
    lambdaParamTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(lambdaParamTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLambdaParamTypeContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaParamTypeContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testLambdaParamTypeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(53,
        (new AggregationAwareParserGrammar.LambdaParamTypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testLambdaParamTypeContextMultiplicity() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaParamTypeContext(new ParserRuleContext(), 1)).multiplicity());
  }

  @Test
  public void testLambdaParamTypeContextType() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaParamTypeContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void testLambdaPipe() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.LambdaPipeContext actualLambdaPipeResult = aggregationAwareParserGrammar.lambdaPipe();

    // Assert
    RecognitionException recognitionException = actualLambdaPipeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualLambdaPipeResult.invokingState);
    assertNull(actualLambdaPipeResult.getParent());
    Token expectedStart = actualLambdaPipeResult.start;
    Token start = actualLambdaPipeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualLambdaPipeResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(598, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualLambdaPipeResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testLambdaPipeContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.LambdaPipeContext lambdaPipeContext = new AggregationAwareParserGrammar.LambdaPipeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(lambdaPipeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLambdaPipeContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.LambdaPipeContext lambdaPipeContext = new AggregationAwareParserGrammar.LambdaPipeContext(
        new ParserRuleContext(), 1);
    lambdaPipeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(lambdaPipeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLambdaPipeContextCodeBlock() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaPipeContext(new ParserRuleContext(), 1)).codeBlock());
  }

  @Test
  public void testLambdaPipeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(51, (new AggregationAwareParserGrammar.LambdaPipeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testLambdaPipeContextPIPE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LambdaPipeContext(new ParserRuleContext(), 1)).PIPE());
  }

  @Test
  public void testLetExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.LetExpressionContext actualLetExpressionResult = aggregationAwareParserGrammar
        .letExpression();

    // Assert
    RecognitionException recognitionException = actualLetExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualLetExpressionResult.invokingState);
    assertEquals(1, actualLetExpressionResult.depth());
    Token expectedStart = actualLetExpressionResult.start;
    Token start = actualLetExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualLetExpressionResult.getStop());
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(367, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualLetExpressionResult, recognitionException.getCtx());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testLetExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.LetExpressionContext letExpressionContext = new AggregationAwareParserGrammar.LetExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(letExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLetExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.LetExpressionContext letExpressionContext = new AggregationAwareParserGrammar.LetExpressionContext(
        new ParserRuleContext(), 1);
    letExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(letExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testLetExpressionContextCombinedExpression() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.LetExpressionContext(new ParserRuleContext(), 1)).combinedExpression());
  }

  @Test
  public void testLetExpressionContextEQUAL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LetExpressionContext(new ParserRuleContext(), 1)).EQUAL());
  }

  @Test
  public void testLetExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(24,
        (new AggregationAwareParserGrammar.LetExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testLetExpressionContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LetExpressionContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testLetExpressionContextLET() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.LetExpressionContext(new ParserRuleContext(), 1)).LET());
  }

  @Test
  public void testMultiplicity() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.MultiplicityContext actualMultiplicityResult = aggregationAwareParserGrammar
        .multiplicity();

    // Assert
    RecognitionException recognitionException = actualMultiplicityResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualMultiplicityResult.invokingState);
    assertNull(actualMultiplicityResult.getParent());
    Token expectedStart = actualMultiplicityResult.start;
    Token start = actualMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualMultiplicityResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(750, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualMultiplicityResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testMultiplicityArgument() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.MultiplicityArgumentContext actualMultiplicityArgumentResult = aggregationAwareParserGrammar
        .multiplicityArgument();

    // Assert
    RecognitionException recognitionException = actualMultiplicityArgumentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualMultiplicityArgumentResult.invokingState);
    assertEquals(1, actualMultiplicityArgumentResult.depth());
    Token expectedStart = actualMultiplicityArgumentResult.start;
    Token start = actualMultiplicityArgumentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualMultiplicityArgumentResult.getStop());
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(actualMultiplicityArgumentResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(819, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testMultiplicityArgumentContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.MultiplicityArgumentContext multiplicityArgumentContext = new AggregationAwareParserGrammar.MultiplicityArgumentContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(multiplicityArgumentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMultiplicityArgumentContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.MultiplicityArgumentContext multiplicityArgumentContext = new AggregationAwareParserGrammar.MultiplicityArgumentContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(multiplicityArgumentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMultiplicityArgumentContextDOT_DOT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.MultiplicityArgumentContext(new ParserRuleContext(), 1)).DOT_DOT());
  }

  @Test
  public void testMultiplicityArgumentContextFromMultiplicity() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.MultiplicityArgumentContext(new ParserRuleContext(), 1)).fromMultiplicity());
  }

  @Test
  public void testMultiplicityArgumentContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(76,
        (new AggregationAwareParserGrammar.MultiplicityArgumentContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testMultiplicityArgumentContextIdentifier() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.MultiplicityArgumentContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testMultiplicityArgumentContextToMultiplicity() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.MultiplicityArgumentContext(new ParserRuleContext(), 1)).toMultiplicity());
  }

  @Test
  public void testMultiplicityArguments() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.MultiplicityArgumentsContext actualMultiplicityArgumentsResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).multiplicityArguments();

    // Assert
    assertEquals(-1, actualMultiplicityArgumentsResult.invokingState);
    List<ParseTree> parseTreeList = actualMultiplicityArgumentsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualMultiplicityArgumentsResult.getParent());
    Token expectedStart = actualMultiplicityArgumentsResult.start;
    Token start = actualMultiplicityArgumentsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualMultiplicityArgumentsResult.getStop());
    assertEquals(1, actualMultiplicityArgumentsResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.MultiplicityArgumentContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.MultiplicityArgumentContext) parseTreeList.get(0)).depth());
    assertFalse(((AggregationAwareParserGrammar.MultiplicityArgumentContext) parseTreeList.get(0)).isEmpty());
    assertNull(((AggregationAwareParserGrammar.MultiplicityArgumentContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    assertTrue(((AggregationAwareParserGrammar.MultiplicityArgumentContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testMultiplicityArgumentsContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.MultiplicityArgumentsContext multiplicityArgumentsContext = new AggregationAwareParserGrammar.MultiplicityArgumentsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(multiplicityArgumentsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMultiplicityArgumentsContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.MultiplicityArgumentsContext multiplicityArgumentsContext = new AggregationAwareParserGrammar.MultiplicityArgumentsContext(
        new ParserRuleContext(), 1);
    multiplicityArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(multiplicityArgumentsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMultiplicityArgumentsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.MultiplicityArgumentsContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new AggregationAwareParserGrammar.MultiplicityArgumentsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testMultiplicityArgumentsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(75,
        (new AggregationAwareParserGrammar.MultiplicityArgumentsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testMultiplicityArgumentsContextMultiplicityArgument() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.MultiplicityArgumentsContext(new ParserRuleContext(), 1))
        .multiplicityArgument()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.MultiplicityArgumentsContext(new ParserRuleContext(), 1))
        .multiplicityArgument(1));
  }

  @Test
  public void testMultiplicityContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.MultiplicityContext multiplicityContext = new AggregationAwareParserGrammar.MultiplicityContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(multiplicityContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMultiplicityContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.MultiplicityContext multiplicityContext = new AggregationAwareParserGrammar.MultiplicityContext(
        new ParserRuleContext(), 1);
    multiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(multiplicityContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMultiplicityContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.MultiplicityContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testMultiplicityContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.MultiplicityContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testMultiplicityContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(65,
        (new AggregationAwareParserGrammar.MultiplicityContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testMultiplicityContextMultiplicityArgument() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.MultiplicityContext(new ParserRuleContext(), 1)).multiplicityArgument());
  }

  @Test
  public void testMultiplictyParameters() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.MultiplictyParametersContext actualMultiplictyParametersResult = aggregationAwareParserGrammar
        .multiplictyParameters();

    // Assert
    RecognitionException recognitionException = actualMultiplictyParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualMultiplictyParametersResult.invokingState);
    assertNull(actualMultiplictyParametersResult.getParent());
    Token expectedStart = actualMultiplictyParametersResult.start;
    Token start = actualMultiplictyParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualMultiplictyParametersResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(829, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualMultiplictyParametersResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testMultiplictyParametersContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.MultiplictyParametersContext multiplictyParametersContext = new AggregationAwareParserGrammar.MultiplictyParametersContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(multiplictyParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMultiplictyParametersContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.MultiplictyParametersContext multiplictyParametersContext = new AggregationAwareParserGrammar.MultiplictyParametersContext(
        new ParserRuleContext(), 1);
    multiplictyParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(multiplictyParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMultiplictyParametersContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new AggregationAwareParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testMultiplictyParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(78,
        (new AggregationAwareParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testMultiplictyParametersContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)).identifier()
        .isEmpty());
    assertNull(
        (new AggregationAwareParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testMultiplictyParametersContextPIPE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.MultiplictyParametersContext(new ParserRuleContext(), 1)).PIPE());
  }

  @Test
  public void testNotExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.NotExpressionContext actualNotExpressionResult = aggregationAwareParserGrammar
        .notExpression();

    // Assert
    RecognitionException recognitionException = actualNotExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualNotExpressionResult.invokingState);
    assertNull(actualNotExpressionResult.getParent());
    Token expectedStart = actualNotExpressionResult.start;
    Token start = actualNotExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualNotExpressionResult.getStop());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(592, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualNotExpressionResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testNotExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.NotExpressionContext notExpressionContext = new AggregationAwareParserGrammar.NotExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(notExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testNotExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.NotExpressionContext notExpressionContext = new AggregationAwareParserGrammar.NotExpressionContext(
        new ParserRuleContext(), 1);
    notExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(notExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testNotExpressionContextExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.NotExpressionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void testNotExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(49,
        (new AggregationAwareParserGrammar.NotExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testNotExpressionContextNOT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.NotExpressionContext(new ParserRuleContext(), 1)).NOT());
  }

  @Test
  public void testPackagePath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.PackagePathContext actualPackagePathResult = (new AggregationAwareParserGrammar(
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
    assertSame(start, ((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePath2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    AggregationAwareParserGrammar.PackagePathContext actualPackagePathResult = (new AggregationAwareParserGrammar(
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
    assertSame(start, ((AggregationAwareParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((AggregationAwareParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((AggregationAwareParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((AggregationAwareParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(164, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath3() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.PackagePathContext actualPackagePathResult = (new AggregationAwareParserGrammar(
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
    assertSame(start, ((AggregationAwareParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((AggregationAwareParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((AggregationAwareParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((AggregationAwareParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(164, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath4() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.PackagePathContext actualPackagePathResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("([] [845])", actualPackagePathResult.toStringTree());
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
    assertEquals(845, ((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testPackagePath5() throws RecognitionException {
    // Arrange
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.PackagePathContext actualPackagePathResult = aggregationAwareParserGrammar
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
    assertSame(start, ((AggregationAwareParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((AggregationAwareParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    RecognitionException recognitionException = ((AggregationAwareParserGrammar.IdentifierContext) getResult).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, ((AggregationAwareParserGrammar.IdentifierContext) getResult).children.size());
    assertEquals(164, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(getResult, recognitionException.getCtx());
  }

  @Test
  public void testPackagePath6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.PackagePathContext actualPackagePathResult = aggregationAwareParserGrammar
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
    assertSame(start, ((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((AggregationAwareParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePathContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.PackagePathContext packagePathContext = new AggregationAwareParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.PackagePathContext packagePathContext = new AggregationAwareParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(80, (new AggregationAwareParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPackagePathContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new AggregationAwareParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPackagePathContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR().isEmpty());
    assertNull((new AggregationAwareParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR(1));
  }

  @Test
  public void testProgramLine() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ProgramLineContext actualProgramLineResult = aggregationAwareParserGrammar
        .programLine();

    // Assert
    RecognitionException recognitionException = actualProgramLineResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualProgramLineResult.invokingState);
    assertNull(actualProgramLineResult.getParent());
    Token expectedStart = actualProgramLineResult.start;
    Token start = actualProgramLineResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualProgramLineResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(351, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualProgramLineResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testProgramLine2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ProgramLineContext actualProgramLineResult = aggregationAwareParserGrammar
        .programLine();

    // Assert
    RecognitionException recognitionException = actualProgramLineResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualProgramLineResult.children.size());
    assertNull(actualProgramLineResult.getParent());
    Token expectedStart = actualProgramLineResult.stop;
    Token start = actualProgramLineResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualProgramLineResult.getStop());
    assertEquals("null", actualProgramLineResult.getText());
    assertEquals(1, actualProgramLineResult.getChildCount());
    assertTrue(actualProgramLineResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(351, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualProgramLineResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testProgramLine3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(20));

    // Act
    AggregationAwareParserGrammar.ProgramLineContext actualProgramLineResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).programLine();

    // Assert
    assertEquals(-1, actualProgramLineResult.invokingState);
    List<ParseTree> parseTreeList = actualProgramLineResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualProgramLineResult.getParent());
    Token expectedStart = actualProgramLineResult.stop;
    Token start = actualProgramLineResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualProgramLineResult.getStop());
    assertEquals(1, actualProgramLineResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).isEmpty());
    assertSame(start, ((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((AggregationAwareParserGrammar.CombinedExpressionContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertEquals(372, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult1).invokingState);
    assertSame(start, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult1).getStart());
    assertEquals(3, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult1).depth());
    assertSame(start, ((AggregationAwareParserGrammar.ExpressionOrExpressionGroupContext) getResult1).getStop());
    assertEquals(1, getResult1.getChildCount());
  }

  @Test
  public void testProgramLineContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ProgramLineContext programLineContext = new AggregationAwareParserGrammar.ProgramLineContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(programLineContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testProgramLineContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ProgramLineContext programLineContext = new AggregationAwareParserGrammar.ProgramLineContext(
        new ParserRuleContext(), 1);
    programLineContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(programLineContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testProgramLineContextCombinedExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ProgramLineContext(new ParserRuleContext(), 1)).combinedExpression());
  }

  @Test
  public void testProgramLineContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(20, (new AggregationAwareParserGrammar.ProgramLineContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testProgramLineContextLetExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ProgramLineContext(new ParserRuleContext(), 1)).letExpression());
  }

  @Test
  public void testPropertyBracketExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.PropertyBracketExpressionContext actualPropertyBracketExpressionResult = aggregationAwareParserGrammar
        .propertyBracketExpression();

    // Assert
    RecognitionException recognitionException = actualPropertyBracketExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualPropertyBracketExpressionResult.invokingState);
    assertNull(actualPropertyBracketExpressionResult.getParent());
    Token expectedStart = actualPropertyBracketExpressionResult.start;
    Token start = actualPropertyBracketExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPropertyBracketExpressionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(405, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualPropertyBracketExpressionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPropertyBracketExpression2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.PropertyBracketExpressionContext actualPropertyBracketExpressionResult = aggregationAwareParserGrammar
        .propertyBracketExpression();

    // Assert
    RecognitionException recognitionException = actualPropertyBracketExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualPropertyBracketExpressionResult.children.size());
    assertNull(actualPropertyBracketExpressionResult.getParent());
    Token expectedStart = actualPropertyBracketExpressionResult.stop;
    Token start = actualPropertyBracketExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualPropertyBracketExpressionResult.getStop());
    assertEquals("null", actualPropertyBracketExpressionResult.getText());
    assertEquals(1, actualPropertyBracketExpressionResult.getChildCount());
    assertTrue(actualPropertyBracketExpressionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(405, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualPropertyBracketExpressionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testPropertyBracketExpression3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(39));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.PropertyBracketExpressionContext actualPropertyBracketExpressionResult = aggregationAwareParserGrammar
        .propertyBracketExpression();

    // Assert
    RecognitionException recognitionException = actualPropertyBracketExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualPropertyBracketExpressionResult.children.size());
    assertNull(actualPropertyBracketExpressionResult.getParent());
    Token expectedStart = actualPropertyBracketExpressionResult.stop;
    Token start = actualPropertyBracketExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualPropertyBracketExpressionResult.getStop());
    assertEquals("null", actualPropertyBracketExpressionResult.getText());
    assertEquals(1, actualPropertyBracketExpressionResult.getChildCount());
    assertTrue(actualPropertyBracketExpressionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(406, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualPropertyBracketExpressionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testPropertyBracketExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.PropertyBracketExpressionContext propertyBracketExpressionContext = new AggregationAwareParserGrammar.PropertyBracketExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(propertyBracketExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyBracketExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.PropertyBracketExpressionContext propertyBracketExpressionContext = new AggregationAwareParserGrammar.PropertyBracketExpressionContext(
        new ParserRuleContext(), 1);
    propertyBracketExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(propertyBracketExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyBracketExpressionContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyBracketExpressionContext(new ParserRuleContext(), 1))
        .BRACKET_CLOSE());
  }

  @Test
  public void testPropertyBracketExpressionContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyBracketExpressionContext(new ParserRuleContext(), 1))
        .BRACKET_OPEN());
  }

  @Test
  public void testPropertyBracketExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(30, (new AggregationAwareParserGrammar.PropertyBracketExpressionContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testPropertyBracketExpressionContextINTEGER() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.PropertyBracketExpressionContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testPropertyBracketExpressionContextSTRING() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.PropertyBracketExpressionContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testPropertyExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.PropertyExpressionContext actualPropertyExpressionResult = aggregationAwareParserGrammar
        .propertyExpression();

    // Assert
    RecognitionException recognitionException = actualPropertyExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualPropertyExpressionResult.invokingState);
    assertEquals(1, actualPropertyExpressionResult.depth());
    Token expectedStart = actualPropertyExpressionResult.start;
    Token start = actualPropertyExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPropertyExpressionResult.getStop());
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(399, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualPropertyExpressionResult, recognitionException.getCtx());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testPropertyExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.PropertyExpressionContext propertyExpressionContext = new AggregationAwareParserGrammar.PropertyExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(propertyExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.PropertyExpressionContext propertyExpressionContext = new AggregationAwareParserGrammar.PropertyExpressionContext(
        new ParserRuleContext(), 1);
    propertyExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(propertyExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyExpressionContextDOT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyExpressionContext(new ParserRuleContext(), 1)).DOT());
  }

  @Test
  public void testPropertyExpressionContextFunctionExpressionLatestMilestoningDateParameter() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyExpressionContext(new ParserRuleContext(), 1))
        .functionExpressionLatestMilestoningDateParameter());
  }

  @Test
  public void testPropertyExpressionContextFunctionExpressionParameters() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyExpressionContext(new ParserRuleContext(), 1))
        .functionExpressionParameters());
  }

  @Test
  public void testPropertyExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(29,
        (new AggregationAwareParserGrammar.PropertyExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPropertyExpressionContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyExpressionContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testPropertyOrFunctionExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext actualPropertyOrFunctionExpressionResult = aggregationAwareParserGrammar
        .propertyOrFunctionExpression();

    // Assert
    RecognitionException recognitionException = actualPropertyOrFunctionExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualPropertyOrFunctionExpressionResult.invokingState);
    assertNull(actualPropertyOrFunctionExpressionResult.getParent());
    Token expectedStart = actualPropertyOrFunctionExpressionResult.start;
    Token start = actualPropertyOrFunctionExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPropertyOrFunctionExpressionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(397, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualPropertyOrFunctionExpressionResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPropertyOrFunctionExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext propertyOrFunctionExpressionContext = new AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(propertyOrFunctionExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyOrFunctionExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext propertyOrFunctionExpressionContext = new AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext(
        new ParserRuleContext(), 1);
    propertyOrFunctionExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(propertyOrFunctionExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyOrFunctionExpressionContextFunctionExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext(new ParserRuleContext(), 1))
        .functionExpression());
  }

  @Test
  public void testPropertyOrFunctionExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(28, (new AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext(new ParserRuleContext(), 1))
        .getRuleIndex());
  }

  @Test
  public void testPropertyOrFunctionExpressionContextPropertyBracketExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext(new ParserRuleContext(), 1))
        .propertyBracketExpression());
  }

  @Test
  public void testPropertyOrFunctionExpressionContextPropertyExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyOrFunctionExpressionContext(new ParserRuleContext(), 1))
        .propertyExpression());
  }

  @Test
  public void testPropertyReturnType() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.PropertyReturnTypeContext actualPropertyReturnTypeResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).propertyReturnType();

    // Assert
    assertEquals(-1, actualPropertyReturnTypeResult.invokingState);
    assertEquals(2, actualPropertyReturnTypeResult.children.size());
    assertNull(actualPropertyReturnTypeResult.getParent());
    Token expectedStart = actualPropertyReturnTypeResult.start;
    Token start = actualPropertyReturnTypeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPropertyReturnTypeResult.getStop());
    assertEquals(2, actualPropertyReturnTypeResult.getChildCount());
    AggregationAwareParserGrammar.MultiplicityContext multiplicityResult = actualPropertyReturnTypeResult
        .multiplicity();
    assertTrue(multiplicityResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(335, multiplicityResult.invokingState);
    assertNull(multiplicityResult.getStop());
    assertEquals("[335]", multiplicityResult.toString());
    assertEquals(1, start.getLine());
    AggregationAwareParserGrammar.TypeContext typeResult = actualPropertyReturnTypeResult.type();
    assertEquals(334, typeResult.invokingState);
    assertEquals(-1, start.getType());
    assertSame(start, typeResult.getStart());
    assertEquals(2, typeResult.depth());
    assertNull(typeResult.getStop());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertSame(listTokenSource, start.getTokenSource());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertTrue(typeResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(start.getInputStream());
  }

  @Test
  public void testPropertyReturnTypeContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.PropertyReturnTypeContext propertyReturnTypeContext = new AggregationAwareParserGrammar.PropertyReturnTypeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(propertyReturnTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyReturnTypeContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.PropertyReturnTypeContext propertyReturnTypeContext = new AggregationAwareParserGrammar.PropertyReturnTypeContext(
        new ParserRuleContext(), 1);
    propertyReturnTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(propertyReturnTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPropertyReturnTypeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(18,
        (new AggregationAwareParserGrammar.PropertyReturnTypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPropertyReturnTypeContextMultiplicity() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.PropertyReturnTypeContext(new ParserRuleContext(), 1)).multiplicity());
  }

  @Test
  public void testPropertyReturnTypeContextType() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.PropertyReturnTypeContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void testQualifiedName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.QualifiedNameContext actualQualifiedNameResult = aggregationAwareParserGrammar
        .qualifiedName();

    // Assert
    RecognitionException recognitionException = actualQualifiedNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertEquals(1, actualQualifiedNameResult.depth());
    Token expectedStart = actualQualifiedNameResult.start;
    Token start = actualQualifiedNameResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualQualifiedNameResult.getStop());
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(841, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualQualifiedNameResult, recognitionException.getCtx());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testQualifiedName2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.QualifiedNameContext actualQualifiedNameResult = aggregationAwareParserGrammar
        .qualifiedName();

    // Assert
    assertNull(actualQualifiedNameResult.identifier());
    RecognitionException recognitionException = actualQualifiedNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertEquals(1, actualQualifiedNameResult.depth());
    Token expectedStart = actualQualifiedNameResult.stop;
    Token start = actualQualifiedNameResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualQualifiedNameResult.getStop());
    assertEquals("null", actualQualifiedNameResult.getText());
    assertTrue(actualQualifiedNameResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertEquals(841, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualQualifiedNameResult, recognitionException.getCtx());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(aggregationAwareParserGrammar, recognizer);
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void testQualifiedNameContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.QualifiedNameContext qualifiedNameContext = new AggregationAwareParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.QualifiedNameContext qualifiedNameContext = new AggregationAwareParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(79,
        (new AggregationAwareParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testQualifiedNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testQualifiedNameContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testQualifiedNameContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testSignedExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.SignedExpressionContext actualSignedExpressionResult = aggregationAwareParserGrammar
        .signedExpression();

    // Assert
    RecognitionException recognitionException = actualSignedExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualSignedExpressionResult.invokingState);
    assertNull(actualSignedExpressionResult.getParent());
    Token expectedStart = actualSignedExpressionResult.start;
    Token start = actualSignedExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSignedExpressionResult.getStop());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(595, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualSignedExpressionResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testSignedExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.SignedExpressionContext signedExpressionContext = new AggregationAwareParserGrammar.SignedExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(signedExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSignedExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.SignedExpressionContext signedExpressionContext = new AggregationAwareParserGrammar.SignedExpressionContext(
        new ParserRuleContext(), 1);
    signedExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(signedExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSignedExpressionContextExpression() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.SignedExpressionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void testSignedExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(50,
        (new AggregationAwareParserGrammar.SignedExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSignedExpressionContextMINUS() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.SignedExpressionContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void testSignedExpressionContextPLUS() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.SignedExpressionContext(new ParserRuleContext(), 1)).PLUS());
  }

  @Test
  public void testSliceExpression() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.SliceExpressionContext actualSliceExpressionResult = aggregationAwareParserGrammar
        .sliceExpression();

    // Assert
    RecognitionException recognitionException = actualSliceExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualSliceExpressionResult.invokingState);
    assertNull(actualSliceExpressionResult.getParent());
    Token expectedStart = actualSliceExpressionResult.start;
    Token start = actualSliceExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSliceExpressionResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(575, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualSliceExpressionResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testSliceExpressionContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.SliceExpressionContext sliceExpressionContext = new AggregationAwareParserGrammar.SliceExpressionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(sliceExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSliceExpressionContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.SliceExpressionContext sliceExpressionContext = new AggregationAwareParserGrammar.SliceExpressionContext(
        new ParserRuleContext(), 1);
    sliceExpressionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(sliceExpressionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSliceExpressionContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testSliceExpressionContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testSliceExpressionContextCOLON() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)).COLON().isEmpty());
    assertNull((new AggregationAwareParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)).COLON(1));
  }

  @Test
  public void testSliceExpressionContextExpression() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)).expression().isEmpty());
    assertNull((new AggregationAwareParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testSliceExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(48,
        (new AggregationAwareParserGrammar.SliceExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testStereotypeReference() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.StereotypeReferenceContext actualStereotypeReferenceResult = aggregationAwareParserGrammar
        .stereotypeReference();

    // Assert
    assertNull(actualStereotypeReferenceResult.identifier());
    RecognitionException recognitionException = actualStereotypeReferenceResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualStereotypeReferenceResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, actualStereotypeReferenceResult.depth());
    Token expectedStart = actualStereotypeReferenceResult.start;
    Token start = actualStereotypeReferenceResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualStereotypeReferenceResult.getStop());
    assertTrue(actualStereotypeReferenceResult.isEmpty());
    assertEquals("([] [326])", actualStereotypeReferenceResult.toStringTree());
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
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(actualStereotypeReferenceResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(327, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(1, start.getLine());
    assertEquals("", ((BufferedTokenStream) inputStream).getText());
    assertTrue(((AggregationAwareParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, tokenSource.getLine());
    assertEquals(326, ((AggregationAwareParserGrammar.QualifiedNameContext) parseTreeList.get(0)).invokingState);
  }

  @Test
  public void testStereotypeReferenceContextAT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.StereotypeReferenceContext(new ParserRuleContext(), 1)).AT());
  }

  @Test
  public void testStereotypeReferenceContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.StereotypeReferenceContext stereotypeReferenceContext = new AggregationAwareParserGrammar.StereotypeReferenceContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(stereotypeReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testStereotypeReferenceContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.StereotypeReferenceContext stereotypeReferenceContext = new AggregationAwareParserGrammar.StereotypeReferenceContext(
        new ParserRuleContext(), 1);
    stereotypeReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(stereotypeReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testStereotypeReferenceContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(16,
        (new AggregationAwareParserGrammar.StereotypeReferenceContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testStereotypeReferenceContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.StereotypeReferenceContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testStereotypeReferenceContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.StereotypeReferenceContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testTagReference() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.TagReferenceContext actualTagReferenceResult = aggregationAwareParserGrammar
        .tagReference();

    // Assert
    assertNull(actualTagReferenceResult.identifier());
    RecognitionException recognitionException = actualTagReferenceResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualTagReferenceResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, actualTagReferenceResult.depth());
    Token expectedStart = actualTagReferenceResult.start;
    Token start = actualTagReferenceResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualTagReferenceResult.getStop());
    assertTrue(actualTagReferenceResult.isEmpty());
    assertEquals("([] [330])", actualTagReferenceResult.toStringTree());
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
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(actualTagReferenceResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(331, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(1, start.getLine());
    assertEquals("", ((BufferedTokenStream) inputStream).getText());
    assertTrue(((AggregationAwareParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, tokenSource.getLine());
    assertEquals(330, ((AggregationAwareParserGrammar.QualifiedNameContext) parseTreeList.get(0)).invokingState);
  }

  @Test
  public void testTagReferenceContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.TagReferenceContext tagReferenceContext = new AggregationAwareParserGrammar.TagReferenceContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(tagReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTagReferenceContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.TagReferenceContext tagReferenceContext = new AggregationAwareParserGrammar.TagReferenceContext(
        new ParserRuleContext(), 1);
    tagReferenceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(tagReferenceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTagReferenceContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(17,
        (new AggregationAwareParserGrammar.TagReferenceContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTagReferenceContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TagReferenceContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testTagReferenceContextPERCENT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TagReferenceContext(new ParserRuleContext(), 1)).PERCENT());
  }

  @Test
  public void testTagReferenceContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TagReferenceContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testToMultiplicity() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    AggregationAwareParserGrammar.ToMultiplicityContext actualToMultiplicityResult = aggregationAwareParserGrammar
        .toMultiplicity();

    // Assert
    assertEquals(-1, actualToMultiplicityResult.invokingState);
    assertNull(actualToMultiplicityResult.getParent());
    Token expectedStart = actualToMultiplicityResult.start;
    Token start = actualToMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualToMultiplicityResult.getStop());
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
    assertNull(aggregationAwareParserGrammar.getRuleContext());
    assertEquals(-1, aggregationAwareParserGrammar.getState());
  }

  @Test
  public void testToMultiplicity2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ToMultiplicityContext actualToMultiplicityResult = aggregationAwareParserGrammar
        .toMultiplicity();

    // Assert
    RecognitionException recognitionException = actualToMultiplicityResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualToMultiplicityResult.children.size());
    assertNull(actualToMultiplicityResult.getParent());
    Token expectedStart = actualToMultiplicityResult.stop;
    Token start = actualToMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualToMultiplicityResult.getStop());
    assertEquals("null", actualToMultiplicityResult.getText());
    assertEquals(1, actualToMultiplicityResult.getChildCount());
    assertTrue(actualToMultiplicityResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(756, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualToMultiplicityResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testToMultiplicity3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.ToMultiplicityContext actualToMultiplicityResult = aggregationAwareParserGrammar
        .toMultiplicity();

    // Assert
    RecognitionException recognitionException = actualToMultiplicityResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualToMultiplicityResult.children.size());
    assertNull(actualToMultiplicityResult.getParent());
    Token expectedStart = actualToMultiplicityResult.stop;
    Token start = actualToMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualToMultiplicityResult.getStop());
    assertEquals("Input", actualToMultiplicityResult.getText());
    assertEquals(1, actualToMultiplicityResult.getChildCount());
    assertTrue(actualToMultiplicityResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(756, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualToMultiplicityResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testToMultiplicity4() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.ToMultiplicityContext actualToMultiplicityResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).toMultiplicity();

    // Assert
    assertEquals(-1, actualToMultiplicityResult.invokingState);
    assertNull(actualToMultiplicityResult.getParent());
    Token expectedStart = actualToMultiplicityResult.start;
    Token start = actualToMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualToMultiplicityResult.getStop());
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
  public void testToMultiplicity5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.ToMultiplicityContext actualToMultiplicityResult = aggregationAwareParserGrammar
        .toMultiplicity();

    // Assert
    RecognitionException recognitionException = actualToMultiplicityResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualToMultiplicityResult.children.size());
    assertNull(actualToMultiplicityResult.getParent());
    Token expectedStart = actualToMultiplicityResult.stop;
    Token start = actualToMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualToMultiplicityResult.getStop());
    assertEquals("Input", actualToMultiplicityResult.getText());
    assertEquals(1, actualToMultiplicityResult.getChildCount());
    assertTrue(actualToMultiplicityResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(756, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualToMultiplicityResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testToMultiplicity6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.ToMultiplicityContext actualToMultiplicityResult = aggregationAwareParserGrammar
        .toMultiplicity();

    // Assert
    assertEquals(-1, actualToMultiplicityResult.invokingState);
    assertNull(actualToMultiplicityResult.getParent());
    Token expectedStart = actualToMultiplicityResult.start;
    Token start = actualToMultiplicityResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualToMultiplicityResult.getStop());
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
    assertNull(aggregationAwareParserGrammar.getRuleContext());
    assertEquals(-1, aggregationAwareParserGrammar.getState());
  }

  @Test
  public void testToMultiplicityContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.ToMultiplicityContext toMultiplicityContext = new AggregationAwareParserGrammar.ToMultiplicityContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(toMultiplicityContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testToMultiplicityContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.ToMultiplicityContext toMultiplicityContext = new AggregationAwareParserGrammar.ToMultiplicityContext(
        new ParserRuleContext(), 1);
    toMultiplicityContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(toMultiplicityContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testToMultiplicityContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(67,
        (new AggregationAwareParserGrammar.ToMultiplicityContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testToMultiplicityContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ToMultiplicityContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testToMultiplicityContextSTAR() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.ToMultiplicityContext(new ParserRuleContext(), 1)).STAR());
  }

  @Test
  public void testType() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.TypeContext actualTypeResult = aggregationAwareParserGrammar.type();

    // Assert
    RecognitionException recognitionException = actualTypeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualTypeResult.invokingState);
    assertNull(actualTypeResult.getParent());
    Token expectedStart = actualTypeResult.start;
    Token start = actualTypeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualTypeResult.getStop());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(aggregationAwareParserGrammar, recognizer);
    assertEquals(0, start.getTokenIndex());
    assertSame(actualTypeResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(748, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertEquals("EOF", start.getText());
    assertSame(listTokenSource, start.getTokenSource());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void testType2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.TypeContext actualTypeResult = aggregationAwareParserGrammar.type();

    // Assert
    RecognitionException recognitionException = actualTypeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualTypeResult.children.size());
    assertNull(actualTypeResult.getParent());
    Token expectedStart = actualTypeResult.stop;
    Token start = actualTypeResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualTypeResult.getStop());
    assertEquals("null", actualTypeResult.getText());
    assertEquals(1, actualTypeResult.getChildCount());
    assertTrue(actualTypeResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(actualTypeResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(748, recognitionException.getOffendingState());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(1, inputStream.index());
    assertEquals("List", inputStream.getSourceName());
  }

  @Test
  public void testTypeAndMultiplicityParameters() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext actualTypeAndMultiplicityParametersResult = aggregationAwareParserGrammar
        .typeAndMultiplicityParameters();

    // Assert
    RecognitionException recognitionException = actualTypeAndMultiplicityParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualTypeAndMultiplicityParametersResult.invokingState);
    assertNull(actualTypeAndMultiplicityParametersResult.getParent());
    Token expectedStart = actualTypeAndMultiplicityParametersResult.start;
    Token start = actualTypeAndMultiplicityParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualTypeAndMultiplicityParametersResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(761, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualTypeAndMultiplicityParametersResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testTypeAndMultiplicityParametersContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext typeAndMultiplicityParametersContext = new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(typeAndMultiplicityParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeAndMultiplicityParametersContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext typeAndMultiplicityParametersContext = new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeAndMultiplicityParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(typeAndMultiplicityParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeAndMultiplicityParametersContextGREATER_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(new ParserRuleContext(), 1))
        .GREATER_THAN());
  }

  @Test
  public void testTypeAndMultiplicityParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(69,
        (new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(new ParserRuleContext(), 1))
            .getRuleIndex());
  }

  @Test
  public void testTypeAndMultiplicityParametersContextLESS_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(new ParserRuleContext(), 1))
        .LESS_THAN());
  }

  @Test
  public void testTypeAndMultiplicityParametersContextMultiplictyParameters() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(new ParserRuleContext(), 1))
        .multiplictyParameters());
  }

  @Test
  public void testTypeAndMultiplicityParametersContextTypeParameters() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeAndMultiplicityParametersContext(new ParserRuleContext(), 1))
        .typeParameters());
  }

  @Test
  public void testTypeArguments() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.TypeArgumentsContext actualTypeArgumentsResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).typeArguments();

    // Assert
    assertEquals(-1, actualTypeArgumentsResult.invokingState);
    List<ParseTree> parseTreeList = actualTypeArgumentsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualTypeArgumentsResult.getParent());
    Token expectedStart = actualTypeArgumentsResult.start;
    Token start = actualTypeArgumentsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualTypeArgumentsResult.getStop());
    assertEquals(1, actualTypeArgumentsResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.TypeContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.TypeContext) parseTreeList.get(0)).depth());
    assertFalse(((AggregationAwareParserGrammar.TypeContext) parseTreeList.get(0)).isEmpty());
    assertNull(((AggregationAwareParserGrammar.TypeContext) parseTreeList.get(0)).getStop());
    assertEquals(0, tokenSource.getCharPositionInLine());
    assertTrue(((AggregationAwareParserGrammar.TypeContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testTypeArgumentsContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.TypeArgumentsContext typeArgumentsContext = new AggregationAwareParserGrammar.TypeArgumentsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(typeArgumentsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeArgumentsContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.TypeArgumentsContext typeArgumentsContext = new AggregationAwareParserGrammar.TypeArgumentsContext(
        new ParserRuleContext(), 1);
    typeArgumentsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(typeArgumentsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeArgumentsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.TypeArgumentsContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new AggregationAwareParserGrammar.TypeArgumentsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testTypeArgumentsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(77,
        (new AggregationAwareParserGrammar.TypeArgumentsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTypeArgumentsContextType() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.TypeArgumentsContext(new ParserRuleContext(), 1)).type().isEmpty());
    assertNull((new AggregationAwareParserGrammar.TypeArgumentsContext(new ParserRuleContext(), 1)).type(1));
  }

  @Test
  public void testTypeContextARROW() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).ARROW());
  }

  @Test
  public void testTypeContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.TypeContext typeContext = new AggregationAwareParserGrammar.TypeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(typeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.TypeContext typeContext = new AggregationAwareParserGrammar.TypeContext(
        new ParserRuleContext(), 1);
    typeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(typeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeContextBRACE_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).BRACE_CLOSE());
  }

  @Test
  public void testTypeContextBRACE_OPEN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).BRACE_OPEN());
  }

  @Test
  public void testTypeContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testTypeContextFunctionTypePureType() {
    // Arrange, Act and Assert
    assertTrue(
        (new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).functionTypePureType().isEmpty());
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).functionTypePureType(1));
  }

  @Test
  public void testTypeContextGREATER_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).GREATER_THAN());
  }

  @Test
  public void testTypeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(64, (new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTypeContextLESS_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).LESS_THAN());
  }

  @Test
  public void testTypeContextMultiplicity() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).multiplicity());
  }

  @Test
  public void testTypeContextMultiplicityArguments() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).multiplicityArguments());
  }

  @Test
  public void testTypeContextPIPE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).PIPE());
  }

  @Test
  public void testTypeContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testTypeContextType() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void testTypeContextTypeArguments() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).typeArguments());
  }

  @Test
  public void testTypeContextUnitName() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeContext(new ParserRuleContext(), 1)).unitName());
  }

  @Test
  public void testTypeParameter() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.TypeParameterContext actualTypeParameterResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).typeParameter();

    // Assert
    assertEquals(1, actualTypeParameterResult.getChildCount());
    assertEquals(1, actualTypeParameterResult.depth());
    Token expectedStart = actualTypeParameterResult.start;
    Token start = actualTypeParameterResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualTypeParameterResult.children.size());
    assertNull(actualTypeParameterResult.getStop());
    assertTrue(actualTypeParameterResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualTypeParameterResult.identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertNull(identifierResult.getStop());
    assertEquals(1, start.getLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testTypeParameter2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    AggregationAwareParserGrammar.TypeParameterContext actualTypeParameterResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).typeParameter();

    // Assert
    assertEquals(1, actualTypeParameterResult.getChildCount());
    assertEquals(1, actualTypeParameterResult.depth());
    Token expectedStart = actualTypeParameterResult.stop;
    Token start = actualTypeParameterResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualTypeParameterResult.getStop());
    assertTrue(actualTypeParameterResult.isEmpty());
    assertEquals(1, actualTypeParameterResult.children.size());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualTypeParameterResult.identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    RecognitionException recognitionException = identifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals("null", identifierResult.getText());
    assertEquals(0, start.getTokenIndex());
    assertEquals(164, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(identifierResult, recognitionException.getCtx());
  }

  @Test
  public void testTypeParameter3() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.TypeParameterContext actualTypeParameterResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))))).typeParameter();

    // Assert
    assertEquals(1, actualTypeParameterResult.getChildCount());
    assertEquals(1, actualTypeParameterResult.depth());
    Token expectedStart = actualTypeParameterResult.stop;
    Token start = actualTypeParameterResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualTypeParameterResult.children.size());
    assertSame(start, actualTypeParameterResult.getStop());
    assertTrue(actualTypeParameterResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualTypeParameterResult.identifier();
    assertEquals("Input", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    RecognitionException recognitionException = identifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals("Input", start.getText());
    assertEquals(164, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(identifierResult, recognitionException.getCtx());
  }

  @Test
  public void testTypeParameter4() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.TypeParameterContext actualTypeParameterResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).typeParameter();

    // Assert
    assertEquals(1, actualTypeParameterResult.getChildCount());
    assertEquals(1, actualTypeParameterResult.depth());
    Token expectedStart = actualTypeParameterResult.start;
    Token start = actualTypeParameterResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualTypeParameterResult.children.size());
    assertNull(actualTypeParameterResult.getStop());
    assertTrue(actualTypeParameterResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualTypeParameterResult.identifier();
    assertEquals(789, identifierResult.invokingState);
    assertEquals(1, start.getLine());
    assertNull(identifierResult.getStop());
    assertEquals(2, identifierResult.depth());
    assertEquals("<EOF>", start.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
  }

  @Test
  public void testTypeParameter5() throws RecognitionException {
    // Arrange
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.TypeParameterContext actualTypeParameterResult = aggregationAwareParserGrammar
        .typeParameter();

    // Assert
    assertEquals(1, actualTypeParameterResult.getChildCount());
    assertEquals(1, actualTypeParameterResult.depth());
    Token expectedStart = actualTypeParameterResult.stop;
    Token start = actualTypeParameterResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualTypeParameterResult.children.size());
    assertSame(start, actualTypeParameterResult.getStop());
    assertTrue(actualTypeParameterResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualTypeParameterResult.identifier();
    assertEquals("Input", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    RecognitionException recognitionException = identifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals("Input", start.getText());
    assertEquals(164, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(identifierResult, recognitionException.getCtx());
  }

  @Test
  public void testTypeParameter6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.TypeParameterContext actualTypeParameterResult = aggregationAwareParserGrammar
        .typeParameter();

    // Assert
    assertEquals(1, actualTypeParameterResult.getChildCount());
    assertEquals(1, actualTypeParameterResult.depth());
    Token expectedStart = actualTypeParameterResult.start;
    Token start = actualTypeParameterResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualTypeParameterResult.children.size());
    assertNull(actualTypeParameterResult.getStop());
    assertTrue(actualTypeParameterResult.isEmpty());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = actualTypeParameterResult.identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertNull(identifierResult.getStop());
    assertEquals(1, start.getLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testTypeParameterContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.TypeParameterContext typeParameterContext = new AggregationAwareParserGrammar.TypeParameterContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(typeParameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeParameterContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.TypeParameterContext typeParameterContext = new AggregationAwareParserGrammar.TypeParameterContext(
        new ParserRuleContext(), 1);
    typeParameterContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(typeParameterContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeParameterContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(72,
        (new AggregationAwareParserGrammar.TypeParameterContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTypeParameterContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeParameterContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testTypeParameters() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.TypeParametersContext actualTypeParametersResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).typeParameters();

    // Assert
    assertEquals(-1, actualTypeParametersResult.invokingState);
    List<ParseTree> parseTreeList = actualTypeParametersResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualTypeParametersResult.getParent());
    Token expectedStart = actualTypeParametersResult.start;
    Token start = actualTypeParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualTypeParametersResult.getStop());
    assertEquals(1, actualTypeParametersResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.TypeParameterContext) getResult).isEmpty());
    assertNull(((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals(1, tokenSource.getLine());
    assertEquals(1, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).children.size());
    assertEquals("([781] [789 781])", getResult.toStringTree());
    assertEquals(789, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).identifier().invokingState);
  }

  @Test
  public void testTypeParameters2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    AggregationAwareParserGrammar.TypeParametersContext actualTypeParametersResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).typeParameters();

    // Assert
    assertEquals(-1, actualTypeParametersResult.invokingState);
    List<ParseTree> parseTreeList = actualTypeParametersResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualTypeParametersResult.getParent());
    Token expectedStart = actualTypeParametersResult.stop;
    Token start = actualTypeParametersResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualTypeParametersResult.getStop());
    assertEquals(1, actualTypeParametersResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.TypeParameterContext) getResult).isEmpty());
    assertSame(start, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = ((AggregationAwareParserGrammar.TypeParameterContext) getResult)
        .identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(3, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertTrue(identifierResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, identifierResult.getChildCount());
  }

  @Test
  public void testTypeParameters3() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.TypeParametersContext actualTypeParametersResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))))).typeParameters();

    // Assert
    assertEquals(-1, actualTypeParametersResult.invokingState);
    List<ParseTree> parseTreeList = actualTypeParametersResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualTypeParametersResult.getParent());
    Token expectedStart = actualTypeParametersResult.stop;
    Token start = actualTypeParametersResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualTypeParametersResult.getStop());
    assertEquals(1, actualTypeParametersResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.TypeParameterContext) getResult).isEmpty());
    assertSame(start, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = ((AggregationAwareParserGrammar.TypeParameterContext) getResult)
        .identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(3, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertTrue(identifierResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, identifierResult.getChildCount());
  }

  @Test
  public void testTypeParameters4() throws RecognitionException {
    // Arrange and Act
    AggregationAwareParserGrammar.TypeParametersContext actualTypeParametersResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).typeParameters();

    // Assert
    assertEquals(-1, actualTypeParametersResult.invokingState);
    List<ParseTree> parseTreeList = actualTypeParametersResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("([] ([781] [789 781]))", actualTypeParametersResult.toStringTree());
    assertNull(actualTypeParametersResult.getParent());
    Token expectedStart = actualTypeParametersResult.start;
    Token start = actualTypeParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualTypeParametersResult.getStop());
    assertEquals("", actualTypeParametersResult.getText());
    assertEquals(1, actualTypeParametersResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(781, ((AggregationAwareParserGrammar.TypeParameterContext) parseTreeList.get(0)).invokingState);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
  }

  @Test
  public void testTypeParameters5() throws RecognitionException {
    // Arrange
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.TypeParametersContext actualTypeParametersResult = aggregationAwareParserGrammar
        .typeParameters();

    // Assert
    assertEquals(-1, actualTypeParametersResult.invokingState);
    List<ParseTree> parseTreeList = actualTypeParametersResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualTypeParametersResult.getParent());
    Token expectedStart = actualTypeParametersResult.stop;
    Token start = actualTypeParametersResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualTypeParametersResult.getStop());
    assertEquals(1, actualTypeParametersResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.TypeParameterContext) getResult).isEmpty());
    assertSame(start, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    AggregationAwareParserGrammar.IdentifierContext identifierResult = ((AggregationAwareParserGrammar.TypeParameterContext) getResult)
        .identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(3, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertTrue(identifierResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, identifierResult.getChildCount());
  }

  @Test
  public void testTypeParameters6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource));
    aggregationAwareParserGrammar.setTrace(true);

    // Act
    AggregationAwareParserGrammar.TypeParametersContext actualTypeParametersResult = aggregationAwareParserGrammar
        .typeParameters();

    // Assert
    assertEquals(-1, actualTypeParametersResult.invokingState);
    List<ParseTree> parseTreeList = actualTypeParametersResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualTypeParametersResult.getParent());
    Token expectedStart = actualTypeParametersResult.start;
    Token start = actualTypeParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualTypeParametersResult.getStop());
    assertEquals(1, actualTypeParametersResult.getChildCount());
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
    assertSame(start, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).depth());
    assertFalse(((AggregationAwareParserGrammar.TypeParameterContext) getResult).isEmpty());
    assertNull(((AggregationAwareParserGrammar.TypeParameterContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals(1, tokenSource.getLine());
    assertEquals(1, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).children.size());
    assertEquals("([781] [789 781])", getResult.toStringTree());
    assertEquals(789, ((AggregationAwareParserGrammar.TypeParameterContext) getResult).identifier().invokingState);
  }

  @Test
  public void testTypeParametersContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.TypeParametersContext typeParametersContext = new AggregationAwareParserGrammar.TypeParametersContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(typeParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeParametersContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.TypeParametersContext typeParametersContext = new AggregationAwareParserGrammar.TypeParametersContext(
        new ParserRuleContext(), 1);
    typeParametersContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(typeParametersContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeParametersContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.TypeParametersContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new AggregationAwareParserGrammar.TypeParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testTypeParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(71,
        (new AggregationAwareParserGrammar.TypeParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTypeParametersContextTypeParameter() {
    // Arrange, Act and Assert
    assertTrue((new AggregationAwareParserGrammar.TypeParametersContext(new ParserRuleContext(), 1)).typeParameter()
        .isEmpty());
    assertNull((new AggregationAwareParserGrammar.TypeParametersContext(new ParserRuleContext(), 1)).typeParameter(1));
  }

  @Test
  public void testTypeParametersWithContravarianceAndMultiplicityParameters() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext actualTypeParametersWithContravarianceAndMultiplicityParametersResult = aggregationAwareParserGrammar
        .typeParametersWithContravarianceAndMultiplicityParameters();

    // Assert
    RecognitionException recognitionException = actualTypeParametersWithContravarianceAndMultiplicityParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualTypeParametersWithContravarianceAndMultiplicityParametersResult.invokingState);
    assertNull(actualTypeParametersWithContravarianceAndMultiplicityParametersResult.getParent());
    Token expectedStart = actualTypeParametersWithContravarianceAndMultiplicityParametersResult.start;
    Token start = actualTypeParametersWithContravarianceAndMultiplicityParametersResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualTypeParametersWithContravarianceAndMultiplicityParametersResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(771, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualTypeParametersWithContravarianceAndMultiplicityParametersResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testTypeParametersWithContravarianceAndMultiplicityParametersContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext typeParametersWithContravarianceAndMultiplicityParametersContext = new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(typeParametersWithContravarianceAndMultiplicityParametersContext
        .<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeParametersWithContravarianceAndMultiplicityParametersContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext typeParametersWithContravarianceAndMultiplicityParametersContext = new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1);
    typeParametersWithContravarianceAndMultiplicityParametersContext
        .<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(typeParametersWithContravarianceAndMultiplicityParametersContext
        .<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testTypeParametersWithContravarianceAndMultiplicityParametersContextContravarianceTypeParameters() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1)).contravarianceTypeParameters());
  }

  @Test
  public void testTypeParametersWithContravarianceAndMultiplicityParametersContextGREATER_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1)).GREATER_THAN());
  }

  @Test
  public void testTypeParametersWithContravarianceAndMultiplicityParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(70,
        (new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
            new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTypeParametersWithContravarianceAndMultiplicityParametersContextLESS_THAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1)).LESS_THAN());
  }

  @Test
  public void testTypeParametersWithContravarianceAndMultiplicityParametersContextMultiplictyParameters() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.TypeParametersWithContravarianceAndMultiplicityParametersContext(
        new ParserRuleContext(), 1)).multiplictyParameters());
  }

  @Test
  public void testUnitInstance() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    AggregationAwareParserGrammar.UnitInstanceContext actualUnitInstanceResult = (new AggregationAwareParserGrammar(
        new BufferedTokenStream(listTokenSource))).unitInstance();

    // Assert
    assertEquals(-1, actualUnitInstanceResult.invokingState);
    List<ParseTree> parseTreeList = actualUnitInstanceResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualUnitInstanceResult.getParent());
    Token expectedStart = actualUnitInstanceResult.start;
    Token start = actualUnitInstanceResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualUnitInstanceResult.getStop());
    assertEquals(2, actualUnitInstanceResult.getChildCount());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertNull(start.getInputStream());
    ParseTree getResult = parseTreeList.get(1);
    assertEquals(283, ((AggregationAwareParserGrammar.UnitNameContext) getResult).invokingState);
    assertEquals("([283] [285 283])", getResult.toStringTree());
    assertSame(start, ((AggregationAwareParserGrammar.UnitNameContext) getResult).getStart());
    assertEquals(2, ((AggregationAwareParserGrammar.UnitNameContext) getResult).depth());
    assertNull(((AggregationAwareParserGrammar.UnitNameContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals(1, tokenSource.getLine());
    ParseTree getResult1 = parseTreeList.get(0);
    assertEquals(282, ((AggregationAwareParserGrammar.UnitInstanceLiteralContext) getResult1).invokingState);
    assertTrue(
        ((AggregationAwareParserGrammar.UnitNameContext) getResult).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals("[282]", getResult1.toString());
    assertTrue(
        ((AggregationAwareParserGrammar.UnitInstanceLiteralContext) getResult1).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testUnitInstanceContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.UnitInstanceContext unitInstanceContext = new AggregationAwareParserGrammar.UnitInstanceContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(unitInstanceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testUnitInstanceContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.UnitInstanceContext unitInstanceContext = new AggregationAwareParserGrammar.UnitInstanceContext(
        new ParserRuleContext(), 1);
    unitInstanceContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(unitInstanceContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testUnitInstanceContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(8, (new AggregationAwareParserGrammar.UnitInstanceContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testUnitInstanceContextUnitInstanceLiteral() {
    // Arrange, Act and Assert
    assertNull(
        (new AggregationAwareParserGrammar.UnitInstanceContext(new ParserRuleContext(), 1)).unitInstanceLiteral());
  }

  @Test
  public void testUnitInstanceContextUnitName() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.UnitInstanceContext(new ParserRuleContext(), 1)).unitName());
  }

  @Test
  public void testUnitInstanceLiteral() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.UnitInstanceLiteralContext actualUnitInstanceLiteralResult = aggregationAwareParserGrammar
        .unitInstanceLiteral();

    // Assert
    RecognitionException recognitionException = actualUnitInstanceLiteralResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualUnitInstanceLiteralResult.invokingState);
    assertNull(actualUnitInstanceLiteralResult.getParent());
    Token expectedStart = actualUnitInstanceLiteralResult.start;
    Token start = actualUnitInstanceLiteralResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualUnitInstanceLiteralResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(644, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualUnitInstanceLiteralResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testUnitInstanceLiteral2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.UnitInstanceLiteralContext actualUnitInstanceLiteralResult = aggregationAwareParserGrammar
        .unitInstanceLiteral();

    // Assert
    RecognitionException recognitionException = actualUnitInstanceLiteralResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualUnitInstanceLiteralResult.children.size());
    assertNull(actualUnitInstanceLiteralResult.getParent());
    Token expectedStart = actualUnitInstanceLiteralResult.stop;
    Token start = actualUnitInstanceLiteralResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualUnitInstanceLiteralResult.getStop());
    assertEquals("null", actualUnitInstanceLiteralResult.getText());
    assertEquals(1, actualUnitInstanceLiteralResult.getChildCount());
    assertTrue(actualUnitInstanceLiteralResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(644, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualUnitInstanceLiteralResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testUnitInstanceLiteralContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.UnitInstanceLiteralContext unitInstanceLiteralContext = new AggregationAwareParserGrammar.UnitInstanceLiteralContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(unitInstanceLiteralContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testUnitInstanceLiteralContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.UnitInstanceLiteralContext unitInstanceLiteralContext = new AggregationAwareParserGrammar.UnitInstanceLiteralContext(
        new ParserRuleContext(), 1);
    unitInstanceLiteralContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(unitInstanceLiteralContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testUnitInstanceLiteralContextDECIMAL() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)).DECIMAL());
  }

  @Test
  public void testUnitInstanceLiteralContextFLOAT() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)).FLOAT());
  }

  @Test
  public void testUnitInstanceLiteralContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(56,
        (new AggregationAwareParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testUnitInstanceLiteralContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testUnitInstanceLiteralContextMINUS() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void testUnitInstanceLiteralContextPLUS() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.UnitInstanceLiteralContext(new ParserRuleContext(), 1)).PLUS());
  }

  @Test
  public void testUnitName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.UnitNameContext actualUnitNameResult = aggregationAwareParserGrammar.unitName();

    // Assert
    assertNull(actualUnitNameResult.identifier());
    RecognitionException recognitionException = actualUnitNameResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualUnitNameResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(1, actualUnitNameResult.depth());
    Token expectedStart = actualUnitNameResult.start;
    Token start = actualUnitNameResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualUnitNameResult.getStop());
    assertTrue(actualUnitNameResult.isEmpty());
    assertEquals("([] [285])", actualUnitNameResult.toStringTree());
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
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(actualUnitNameResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(286, recognitionException.getOffendingState());
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertEquals(1, start.getLine());
    assertEquals("", ((BufferedTokenStream) inputStream).getText());
    assertTrue(((AggregationAwareParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, tokenSource.getLine());
    assertEquals(285, ((AggregationAwareParserGrammar.QualifiedNameContext) parseTreeList.get(0)).invokingState);
  }

  @Test
  public void testUnitNameContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.UnitNameContext unitNameContext = new AggregationAwareParserGrammar.UnitNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(unitNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testUnitNameContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.UnitNameContext unitNameContext = new AggregationAwareParserGrammar.UnitNameContext(
        new ParserRuleContext(), 1);
    unitNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(unitNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testUnitNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(9, (new AggregationAwareParserGrammar.UnitNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testUnitNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.UnitNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testUnitNameContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.UnitNameContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testUnitNameContextTILDE() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.UnitNameContext(new ParserRuleContext(), 1)).TILDE());
  }

  @Test
  public void testVariable() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.VariableContext actualVariableResult = aggregationAwareParserGrammar.variable();

    // Assert
    RecognitionException recognitionException = actualVariableResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualVariableResult.invokingState);
    assertEquals(1, actualVariableResult.depth());
    Token expectedStart = actualVariableResult.start;
    Token start = actualVariableResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualVariableResult.getStop());
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(479, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualVariableResult, recognitionException.getCtx());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testVariableContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.VariableContext variableContext = new AggregationAwareParserGrammar.VariableContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(variableContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testVariableContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.VariableContext variableContext = new AggregationAwareParserGrammar.VariableContext(
        new ParserRuleContext(), 1);
    variableContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(variableContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testVariableContextDOLLAR() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.VariableContext(new ParserRuleContext(), 1)).DOLLAR());
  }

  @Test
  public void testVariableContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(37, (new AggregationAwareParserGrammar.VariableContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testVariableContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.VariableContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testWord() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    AggregationAwareParserGrammar aggregationAwareParserGrammar = new AggregationAwareParserGrammar(
        bufferedTokenStream);

    // Act
    AggregationAwareParserGrammar.WordContext actualWordResult = aggregationAwareParserGrammar.word();

    // Assert
    RecognitionException recognitionException = actualWordResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.depth());
    Token expectedStart = actualWordResult.start;
    Token start = actualWordResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualWordResult.getStop());
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
    assertSame(aggregationAwareParserGrammar, recognitionException.getRecognizer());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(856, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualWordResult, recognitionException.getCtx());
    assertEquals(1, start.getLine());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testWordContextAccept() {
    // Arrange
    AggregationAwareParserGrammar.WordContext wordContext = new AggregationAwareParserGrammar.WordContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextAccept2() {
    // Arrange
    AggregationAwareParserGrammar.WordContext wordContext = new AggregationAwareParserGrammar.WordContext(
        new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.WordContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testWordContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(81, (new AggregationAwareParserGrammar.WordContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testWordContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.WordContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testWordContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new AggregationAwareParserGrammar.WordContext(new ParserRuleContext(), 1)).identifier());
  }
}

