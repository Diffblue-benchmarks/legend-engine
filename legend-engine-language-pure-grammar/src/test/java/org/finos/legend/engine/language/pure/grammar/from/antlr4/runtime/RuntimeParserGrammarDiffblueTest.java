package org.finos.legend.engine.language.pure.grammar.from.antlr4.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
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
import org.finos.legend.engine.language.pure.grammar.from.antlr4.CodeLexerGrammar;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.CodeParserGrammarBaseVisitor;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.ConnectionLexerGrammar;
import org.junit.Test;

public class RuntimeParserGrammarDiffblueTest {
  @Test
  public void testConnectionPointer() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    RuntimeParserGrammar.ConnectionPointerContext actualConnectionPointerResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(listTokenSource))).connectionPointer();

    // Assert
    assertEquals(-1, actualConnectionPointerResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionPointerResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionPointerResult.getParent());
    Token expectedStart = actualConnectionPointerResult.start;
    Token start = actualConnectionPointerResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionPointerResult.getStop());
    assertEquals(1, actualConnectionPointerResult.getChildCount());
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
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).depth());
    assertFalse(((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).isEmpty());
    assertNull(((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    RecognitionException recognitionException = ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertSame(parseTreeList.get(0), recognitionException.getCtx());
  }

  @Test
  public void testConnectionPointer2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    RuntimeParserGrammar.ConnectionPointerContext actualConnectionPointerResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).connectionPointer();

    // Assert
    assertEquals(-1, actualConnectionPointerResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionPointerResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionPointerResult.getParent());
    Token expectedStart = actualConnectionPointerResult.stop;
    Token start = actualConnectionPointerResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionPointerResult.getStop());
    assertEquals(1, actualConnectionPointerResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStart());
    assertEquals(2, ((RuntimeParserGrammar.QualifiedNameContext) getResult).depth());
    assertEquals(120, ((RuntimeParserGrammar.QualifiedNameContext) getResult).invokingState);
    assertEquals(1, getResult.getChildCount());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStop());
    RuntimeParserGrammar.IdentifierContext identifierResult = ((RuntimeParserGrammar.QualifiedNameContext) getResult)
        .identifier();
    assertEquals(3, identifierResult.depth());
    assertSame(start, identifierResult.getStart());
    assertEquals(143, identifierResult.invokingState);
    assertEquals(1, identifierResult.getChildCount());
    assertSame(start, identifierResult.getStop());
  }

  @Test
  public void testConnectionPointer3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    RuntimeParserGrammar.ConnectionPointerContext actualConnectionPointerResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(listTokenSource))).connectionPointer();

    // Assert
    assertEquals(-1, actualConnectionPointerResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionPointerResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionPointerResult.getParent());
    Token expectedStart = actualConnectionPointerResult.stop;
    Token start = actualConnectionPointerResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionPointerResult.getStop());
    assertEquals(1, actualConnectionPointerResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStart());
    assertEquals(2, ((RuntimeParserGrammar.QualifiedNameContext) getResult).depth());
    assertEquals(120, ((RuntimeParserGrammar.QualifiedNameContext) getResult).invokingState);
    assertEquals(1, getResult.getChildCount());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStop());
    RuntimeParserGrammar.IdentifierContext identifierResult = ((RuntimeParserGrammar.QualifiedNameContext) getResult)
        .identifier();
    assertEquals(3, identifierResult.depth());
    assertSame(start, identifierResult.getStart());
    assertEquals(143, identifierResult.invokingState);
    assertEquals(1, identifierResult.getChildCount());
    assertSame(start, identifierResult.getStop());
  }

  @Test
  public void testConnectionPointer4() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    RuntimeParserGrammar.ConnectionPointerContext actualConnectionPointerResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(listTokenSource))).connectionPointer();

    // Assert
    assertEquals(-1, actualConnectionPointerResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionPointerResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionPointerResult.getParent());
    Token expectedStart = actualConnectionPointerResult.stop;
    Token start = actualConnectionPointerResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionPointerResult.getStop());
    assertEquals(1, actualConnectionPointerResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStart());
    assertEquals(2, ((RuntimeParserGrammar.QualifiedNameContext) getResult).depth());
    assertEquals(120, ((RuntimeParserGrammar.QualifiedNameContext) getResult).invokingState);
    assertEquals(1, getResult.getChildCount());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStop());
    RuntimeParserGrammar.IdentifierContext identifierResult = ((RuntimeParserGrammar.QualifiedNameContext) getResult)
        .identifier();
    assertEquals(3, identifierResult.depth());
    assertSame(start, identifierResult.getStart());
    assertEquals(143, identifierResult.invokingState);
    assertEquals(1, identifierResult.getChildCount());
    assertSame(start, identifierResult.getStop());
  }

  @Test
  public void testConnectionPointer5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setBuildParseTree(true);

    // Act
    RuntimeParserGrammar.ConnectionPointerContext actualConnectionPointerResult = runtimeParserGrammar
        .connectionPointer();

    // Assert
    assertEquals(-1, actualConnectionPointerResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionPointerResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionPointerResult.getParent());
    Token expectedStart = actualConnectionPointerResult.stop;
    Token start = actualConnectionPointerResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionPointerResult.getStop());
    assertEquals(1, actualConnectionPointerResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStart());
    assertEquals(2, ((RuntimeParserGrammar.QualifiedNameContext) getResult).depth());
    assertEquals(120, ((RuntimeParserGrammar.QualifiedNameContext) getResult).invokingState);
    assertEquals(1, getResult.getChildCount());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStop());
    RuntimeParserGrammar.IdentifierContext identifierResult = ((RuntimeParserGrammar.QualifiedNameContext) getResult)
        .identifier();
    assertEquals(3, identifierResult.depth());
    assertSame(start, identifierResult.getStart());
    assertEquals(143, identifierResult.invokingState);
    assertEquals(1, identifierResult.getChildCount());
    assertSame(start, identifierResult.getStop());
  }

  @Test
  public void testConnectionPointer6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.ConnectionPointerContext actualConnectionPointerResult = runtimeParserGrammar
        .connectionPointer();

    // Assert
    assertEquals(-1, actualConnectionPointerResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionPointerResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionPointerResult.getParent());
    Token expectedStart = actualConnectionPointerResult.stop;
    Token start = actualConnectionPointerResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionPointerResult.getStop());
    assertEquals(1, actualConnectionPointerResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStart());
    assertEquals(2, ((RuntimeParserGrammar.QualifiedNameContext) getResult).depth());
    assertEquals(120, ((RuntimeParserGrammar.QualifiedNameContext) getResult).invokingState);
    assertEquals(1, getResult.getChildCount());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) getResult).getStop());
    RuntimeParserGrammar.IdentifierContext identifierResult = ((RuntimeParserGrammar.QualifiedNameContext) getResult)
        .identifier();
    assertEquals(3, identifierResult.depth());
    assertSame(start, identifierResult.getStart());
    assertEquals(143, identifierResult.invokingState);
    assertEquals(1, identifierResult.getChildCount());
    assertSame(start, identifierResult.getStop());
  }

  @Test
  public void testConnectionPointer7() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new CommonTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.ConnectionPointerContext actualConnectionPointerResult = runtimeParserGrammar
        .connectionPointer();

    // Assert
    assertEquals(-1, actualConnectionPointerResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionPointerResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionPointerResult.getParent());
    Token expectedStart = actualConnectionPointerResult.start;
    Token start = actualConnectionPointerResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionPointerResult.getStop());
    assertEquals(1, actualConnectionPointerResult.getChildCount());
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
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).depth());
    assertFalse(((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).isEmpty());
    assertNull(((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    RecognitionException recognitionException = ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertSame(parseTreeList.get(0), recognitionException.getCtx());
  }

  @Test
  public void testConnectionPointer8() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setLine(2);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    runtimeParserGrammar.setTokenStream(new BufferedTokenStream(listTokenSource1));

    // Act
    RuntimeParserGrammar.ConnectionPointerContext actualConnectionPointerResult = runtimeParserGrammar
        .connectionPointer();

    // Assert
    assertEquals(-1, actualConnectionPointerResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionPointerResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionPointerResult.getParent());
    Token expectedStart = actualConnectionPointerResult.start;
    Token start = actualConnectionPointerResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionPointerResult.getStop());
    assertEquals(1, actualConnectionPointerResult.getChildCount());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertSame(start, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).depth());
    assertFalse(((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).isEmpty());
    assertNull(((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
    RecognitionException recognitionException = ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertSame(parseTreeList.get(0), recognitionException.getCtx());
  }

  @Test
  public void testConnectionPointerContextAccept() {
    // Arrange
    RuntimeParserGrammar.ConnectionPointerContext connectionPointerContext = new RuntimeParserGrammar.ConnectionPointerContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(connectionPointerContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionPointerContextAccept2() {
    // Arrange
    RuntimeParserGrammar.ConnectionPointerContext connectionPointerContext = new RuntimeParserGrammar.ConnectionPointerContext(
        new ParserRuleContext(), 1);
    connectionPointerContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionPointerContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionPointerContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(9, (new RuntimeParserGrammar.ConnectionPointerContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testConnectionPointerContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ConnectionPointerContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testConnections() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.ConnectionsContext actualConnectionsResult = runtimeParserGrammar.connections();

    // Assert
    RecognitionException recognitionException = actualConnectionsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualConnectionsResult.invokingState);
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.start;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionsResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(83, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualConnectionsResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testConnections2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.ConnectionsContext actualConnectionsResult = runtimeParserGrammar.connections();

    // Assert
    RecognitionException recognitionException = actualConnectionsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionsResult.children.size());
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.stop;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionsResult.getStop());
    assertEquals("null", actualConnectionsResult.getText());
    assertEquals(1, actualConnectionsResult.getChildCount());
    assertTrue(actualConnectionsResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(83, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualConnectionsResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testConnections3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(4));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.ConnectionsContext actualConnectionsResult = runtimeParserGrammar.connections();

    // Assert
    RecognitionException recognitionException = actualConnectionsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionsResult.children.size());
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.stop;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionsResult.getStop());
    assertEquals("null", actualConnectionsResult.getText());
    assertEquals(1, actualConnectionsResult.getChildCount());
    assertTrue(actualConnectionsResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(84, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualConnectionsResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testConnectionsContextAccept() {
    // Arrange
    RuntimeParserGrammar.ConnectionsContext connectionsContext = new RuntimeParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(connectionsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionsContextAccept2() {
    // Arrange
    RuntimeParserGrammar.ConnectionsContext connectionsContext = new RuntimeParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);
    connectionsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionsContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testConnectionsContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testConnectionsContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testConnectionsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testConnectionsContextCONNECTIONS() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).CONNECTIONS());
  }

  @Test
  public void testConnectionsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(6, (new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testConnectionsContextSEMI_COLON() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).SEMI_COLON());
  }

  @Test
  public void testConnectionsContextStoreConnections() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).storeConnections().isEmpty());
    assertNull((new RuntimeParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).storeConnections(1));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    RuntimeParserGrammar actualRuntimeParserGrammar = new RuntimeParserGrammar(
        new BufferedTokenStream(new ListTokenSource(new ArrayList<Token>())));

    // Assert
    assertNull(actualRuntimeParserGrammar.getParseInfo());
    assertEquals(0, actualRuntimeParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualRuntimeParserGrammar.isMatchedEOF());
    assertNull(actualRuntimeParserGrammar.getContext());
    assertTrue(actualRuntimeParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualRuntimeParserGrammar.getPrecedence());
    assertEquals("List", actualRuntimeParserGrammar.getSourceName());
    assertFalse(actualRuntimeParserGrammar.isTrace());
    assertTrue(actualRuntimeParserGrammar.getBuildParseTree());
    assertEquals(-1, actualRuntimeParserGrammar.getState());
    assertTrue(
        actualRuntimeParserGrammar.getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualRuntimeParserGrammar.getInterpreter();
    assertEquals(17, interpreter.decisionToDFA.length);
    assertSame(actualRuntimeParserGrammar, interpreter.getParser());
    assertSame(actualRuntimeParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualRuntimeParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    RuntimeParserGrammar actualRuntimeParserGrammar = new RuntimeParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Assert
    assertNull(actualRuntimeParserGrammar.getParseInfo());
    assertEquals(0, actualRuntimeParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualRuntimeParserGrammar.isMatchedEOF());
    assertNull(actualRuntimeParserGrammar.getContext());
    assertTrue(actualRuntimeParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualRuntimeParserGrammar.getPrecedence());
    assertEquals("List", actualRuntimeParserGrammar.getSourceName());
    assertFalse(actualRuntimeParserGrammar.isTrace());
    assertTrue(actualRuntimeParserGrammar.getBuildParseTree());
    assertEquals(-1, actualRuntimeParserGrammar.getState());
    assertTrue(
        actualRuntimeParserGrammar.getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualRuntimeParserGrammar.getInterpreter();
    assertEquals(17, interpreter.decisionToDFA.length);
    assertSame(actualRuntimeParserGrammar, interpreter.getParser());
    assertSame(actualRuntimeParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualRuntimeParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testDefinition() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    RuntimeParserGrammar.DefinitionContext actualDefinitionResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualDefinitionResult.getParent());
    Token token = actualDefinitionResult.stop;
    Token start = actualDefinitionResult.getStart();
    assertSame(token, start);
    assertSame(token, actualDefinitionResult.getStop());
    assertEquals(2, actualDefinitionResult.getChildCount());
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
    ParseTree getResult = parseTreeList.get(1);
    assertEquals("<EOF>", getResult.toString());
    assertEquals(1, tokenSource.getLine());
    assertSame(actualDefinitionResult, getResult.getParent());
    assertEquals(2, ((RuntimeParserGrammar.ImportsContext) parseTreeList.get(0)).depth());
    assertEquals(34, ((RuntimeParserGrammar.ImportsContext) parseTreeList.get(0)).invokingState);
    assertNull(((RuntimeParserGrammar.ImportsContext) parseTreeList.get(0)).getStop());
    assertSame(start, ((RuntimeParserGrammar.ImportsContext) parseTreeList.get(0)).getStart());
  }

  @Test
  public void testDefinition2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    RuntimeParserGrammar.DefinitionContext actualDefinitionResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(3, parseTreeList.size());
    assertNull(actualDefinitionResult.getParent());
    Token expectedStart = actualDefinitionResult.start;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualDefinitionResult.stop;
    Token stop = actualDefinitionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals(3, actualDefinitionResult.getChildCount());
    assertEquals("nullEOF", actualDefinitionResult.getText());
    assertEquals(1, stop.getStartIndex());
    assertEquals(0, stop.getStopIndex());
    TokenSource tokenSource = stop.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, stop.getChannel());
    assertEquals(-1, stop.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(0, stop.getCharPositionInLine());
    assertEquals("EOF", stop.getText());
    assertEquals(0, stop.getLine());
    assertEquals(1, stop.getTokenIndex());
    assertNull(stop.getInputStream());
    assertEquals(35, ((RuntimeParserGrammar.RuntimeContext) parseTreeList.get(1)).invokingState);
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("[34]", getResult.toString());
    assertTrue(((RuntimeParserGrammar.RuntimeContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(34, ((RuntimeParserGrammar.ImportsContext) getResult).invokingState);
    assertEquals(0, tokenSource.getLine());
  }

  @Test
  public void testDefinition3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    RuntimeParserGrammar.DefinitionContext actualDefinitionResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(3, parseTreeList.size());
    assertNull(actualDefinitionResult.getParent());
    Token expectedStart = actualDefinitionResult.start;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualDefinitionResult.stop;
    Token stop = actualDefinitionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals(3, actualDefinitionResult.getChildCount());
    assertEquals("nullnullEOF", actualDefinitionResult.getText());
    assertEquals(1, stop.getStartIndex());
    assertEquals(0, stop.getStopIndex());
    TokenSource tokenSource = stop.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, stop.getChannel());
    assertEquals(-1, stop.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(0, stop.getCharPositionInLine());
    assertEquals("EOF", stop.getText());
    assertEquals(0, stop.getLine());
    assertEquals(2, stop.getTokenIndex());
    assertNull(stop.getInputStream());
    assertEquals(35, ((RuntimeParserGrammar.RuntimeContext) parseTreeList.get(1)).invokingState);
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("[34]", getResult.toString());
    assertTrue(((RuntimeParserGrammar.RuntimeContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(34, ((RuntimeParserGrammar.ImportsContext) getResult).invokingState);
    assertEquals(0, tokenSource.getLine());
  }

  @Test
  public void testDefinition4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(2));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    RuntimeParserGrammar.DefinitionContext actualDefinitionResult = (new RuntimeParserGrammar(
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
    assertSame(actualDefinitionResult, getResult.getParent());
    assertEquals("<EOF>", getResult.toString());
    assertEquals(34, ((RuntimeParserGrammar.ImportsContext) parseTreeList.get(0)).invokingState);
  }

  @Test
  public void testDefinition5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(2));
    tokenList.add(new CommonToken(1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    RuntimeParserGrammar.DefinitionContext actualDefinitionResult = (new RuntimeParserGrammar(
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
    assertEquals("nullnullEOF", actualDefinitionResult.getText());
    assertEquals(2, actualDefinitionResult.getChildCount());
    assertEquals(0, stop.getLine());
    assertEquals(2, stop.getTokenIndex());
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
    assertSame(actualDefinitionResult, getResult.getParent());
    assertEquals("<EOF>", getResult.toString());
    assertEquals(34, ((RuntimeParserGrammar.ImportsContext) parseTreeList.get(0)).invokingState);
  }

  @Test
  public void testDefinitionContextAccept() {
    // Arrange
    RuntimeParserGrammar.DefinitionContext definitionContext = new RuntimeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextAccept2() {
    // Arrange
    RuntimeParserGrammar.DefinitionContext definitionContext = new RuntimeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextEOF() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testDefinitionContextImports() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).imports());
  }

  @Test
  public void testDefinitionContextRuntime() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).runtime().isEmpty());
    assertNull((new RuntimeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).runtime(1));
  }

  @Test
  public void testEmbeddedConnection() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContext actualEmbeddedConnectionResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(listTokenSource))).embeddedConnection();

    // Assert
    assertEquals(-1, actualEmbeddedConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedConnectionResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEmbeddedConnectionResult.getParent());
    Token expectedStart = actualEmbeddedConnectionResult.start;
    Token start = actualEmbeddedConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedConnectionResult.getStop());
    assertEquals(1, actualEmbeddedConnectionResult.getChildCount());
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
    assertSame(actualEmbeddedConnectionResult, getResult.getParent());
    assertEquals("<missing ISLAND_OPEN>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing ISLAND_OPEN>',<8>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(8, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing ISLAND_OPEN>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testEmbeddedConnection2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContext actualEmbeddedConnectionResult = runtimeParserGrammar
        .embeddedConnection();

    // Assert
    RecognitionException recognitionException = actualEmbeddedConnectionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualEmbeddedConnectionResult.children.size());
    assertNull(actualEmbeddedConnectionResult.getParent());
    Token expectedStart = actualEmbeddedConnectionResult.stop;
    Token start = actualEmbeddedConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEmbeddedConnectionResult.getStop());
    assertEquals("null", actualEmbeddedConnectionResult.getText());
    assertEquals(1, actualEmbeddedConnectionResult.getChildCount());
    assertTrue(actualEmbeddedConnectionResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(122, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualEmbeddedConnectionResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testEmbeddedConnection3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContext actualEmbeddedConnectionResult = runtimeParserGrammar
        .embeddedConnection();

    // Assert
    RecognitionException recognitionException = actualEmbeddedConnectionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualEmbeddedConnectionResult.children.size());
    assertNull(actualEmbeddedConnectionResult.getParent());
    Token expectedStart = actualEmbeddedConnectionResult.stop;
    Token start = actualEmbeddedConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEmbeddedConnectionResult.getStop());
    assertEquals("Input", actualEmbeddedConnectionResult.getText());
    assertEquals(1, actualEmbeddedConnectionResult.getChildCount());
    assertTrue(actualEmbeddedConnectionResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(122, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualEmbeddedConnectionResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testEmbeddedConnection4() throws RecognitionException {
    // Arrange and Act
    RuntimeParserGrammar.EmbeddedConnectionContext actualEmbeddedConnectionResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).embeddedConnection();

    // Assert
    assertEquals(-1, actualEmbeddedConnectionResult.invokingState);
    assertEquals(1, actualEmbeddedConnectionResult.children.size());
    assertNull(actualEmbeddedConnectionResult.getParent());
    Token expectedStart = actualEmbeddedConnectionResult.start;
    Token start = actualEmbeddedConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedConnectionResult.getStop());
    assertEquals("<missing ISLAND_OPEN>", actualEmbeddedConnectionResult.getText());
    assertEquals(1, actualEmbeddedConnectionResult.getChildCount());
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
  public void testEmbeddedConnection5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContext actualEmbeddedConnectionResult = runtimeParserGrammar
        .embeddedConnection();

    // Assert
    RecognitionException recognitionException = actualEmbeddedConnectionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualEmbeddedConnectionResult.children.size());
    assertNull(actualEmbeddedConnectionResult.getParent());
    Token expectedStart = actualEmbeddedConnectionResult.stop;
    Token start = actualEmbeddedConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEmbeddedConnectionResult.getStop());
    assertEquals("Input", actualEmbeddedConnectionResult.getText());
    assertEquals(1, actualEmbeddedConnectionResult.getChildCount());
    assertTrue(actualEmbeddedConnectionResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(122, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualEmbeddedConnectionResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testEmbeddedConnection6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContext actualEmbeddedConnectionResult = runtimeParserGrammar
        .embeddedConnection();

    // Assert
    assertEquals(-1, actualEmbeddedConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedConnectionResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualEmbeddedConnectionResult.getParent());
    Token expectedStart = actualEmbeddedConnectionResult.start;
    Token start = actualEmbeddedConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedConnectionResult.getStop());
    assertEquals(1, actualEmbeddedConnectionResult.getChildCount());
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
    assertSame(actualEmbeddedConnectionResult, getResult.getParent());
    assertEquals("<missing ISLAND_OPEN>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing ISLAND_OPEN>',<8>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(8, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing ISLAND_OPEN>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testEmbeddedConnectionContent() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContentContext actualEmbeddedConnectionContentResult = runtimeParserGrammar
        .embeddedConnectionContent();

    // Assert
    assertEquals(-1, actualEmbeddedConnectionContentResult.invokingState);
    assertNull(actualEmbeddedConnectionContentResult.getParent());
    Token expectedStart = actualEmbeddedConnectionContentResult.start;
    Token start = actualEmbeddedConnectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedConnectionContentResult.getStop());
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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedConnectionContent2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContentContext actualEmbeddedConnectionContentResult = runtimeParserGrammar
        .embeddedConnectionContent();

    // Assert
    RecognitionException recognitionException = actualEmbeddedConnectionContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualEmbeddedConnectionContentResult.children.size());
    assertNull(actualEmbeddedConnectionContentResult.getParent());
    Token expectedStart = actualEmbeddedConnectionContentResult.stop;
    Token start = actualEmbeddedConnectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEmbeddedConnectionContentResult.getStop());
    assertEquals("null", actualEmbeddedConnectionContentResult.getText());
    assertEquals(1, actualEmbeddedConnectionContentResult.getChildCount());
    assertTrue(actualEmbeddedConnectionContentResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(129, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualEmbeddedConnectionContentResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testEmbeddedConnectionContent3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContentContext actualEmbeddedConnectionContentResult = runtimeParserGrammar
        .embeddedConnectionContent();

    // Assert
    RecognitionException recognitionException = actualEmbeddedConnectionContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualEmbeddedConnectionContentResult.children.size());
    assertNull(actualEmbeddedConnectionContentResult.getParent());
    Token expectedStart = actualEmbeddedConnectionContentResult.stop;
    Token start = actualEmbeddedConnectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEmbeddedConnectionContentResult.getStop());
    assertEquals("Input", actualEmbeddedConnectionContentResult.getText());
    assertEquals(1, actualEmbeddedConnectionContentResult.getChildCount());
    assertTrue(actualEmbeddedConnectionContentResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(129, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualEmbeddedConnectionContentResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testEmbeddedConnectionContent4() throws RecognitionException {
    // Arrange and Act
    RuntimeParserGrammar.EmbeddedConnectionContentContext actualEmbeddedConnectionContentResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).embeddedConnectionContent();

    // Assert
    assertEquals(-1, actualEmbeddedConnectionContentResult.invokingState);
    assertNull(actualEmbeddedConnectionContentResult.getParent());
    Token expectedStart = actualEmbeddedConnectionContentResult.start;
    Token start = actualEmbeddedConnectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedConnectionContentResult.getStop());
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
  public void testEmbeddedConnectionContent5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContentContext actualEmbeddedConnectionContentResult = runtimeParserGrammar
        .embeddedConnectionContent();

    // Assert
    RecognitionException recognitionException = actualEmbeddedConnectionContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualEmbeddedConnectionContentResult.children.size());
    assertNull(actualEmbeddedConnectionContentResult.getParent());
    Token expectedStart = actualEmbeddedConnectionContentResult.stop;
    Token start = actualEmbeddedConnectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualEmbeddedConnectionContentResult.getStop());
    assertEquals("Input", actualEmbeddedConnectionContentResult.getText());
    assertEquals(1, actualEmbeddedConnectionContentResult.getChildCount());
    assertTrue(actualEmbeddedConnectionContentResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(129, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualEmbeddedConnectionContentResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testEmbeddedConnectionContent6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.EmbeddedConnectionContentContext actualEmbeddedConnectionContentResult = runtimeParserGrammar
        .embeddedConnectionContent();

    // Assert
    assertEquals(-1, actualEmbeddedConnectionContentResult.invokingState);
    assertNull(actualEmbeddedConnectionContentResult.getParent());
    Token expectedStart = actualEmbeddedConnectionContentResult.start;
    Token start = actualEmbeddedConnectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedConnectionContentResult.getStop());
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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedConnectionContentContextAccept() {
    // Arrange
    RuntimeParserGrammar.EmbeddedConnectionContentContext embeddedConnectionContentContext = new RuntimeParserGrammar.EmbeddedConnectionContentContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(embeddedConnectionContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEmbeddedConnectionContentContextAccept2() {
    // Arrange
    RuntimeParserGrammar.EmbeddedConnectionContentContext embeddedConnectionContentContext = new RuntimeParserGrammar.EmbeddedConnectionContentContext(
        new ParserRuleContext(), 1);
    embeddedConnectionContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(embeddedConnectionContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEmbeddedConnectionContentContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(11,
        (new RuntimeParserGrammar.EmbeddedConnectionContentContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testEmbeddedConnectionContentContextISLAND_BRACE_CLOSE() {
    // Arrange, Act and Assert
    assertNull(
        (new RuntimeParserGrammar.EmbeddedConnectionContentContext(new ParserRuleContext(), 1)).ISLAND_BRACE_CLOSE());
  }

  @Test
  public void testEmbeddedConnectionContentContextISLAND_BRACE_OPEN() {
    // Arrange, Act and Assert
    assertNull(
        (new RuntimeParserGrammar.EmbeddedConnectionContentContext(new ParserRuleContext(), 1)).ISLAND_BRACE_OPEN());
  }

  @Test
  public void testEmbeddedConnectionContentContextISLAND_CONTENT() {
    // Arrange, Act and Assert
    assertNull(
        (new RuntimeParserGrammar.EmbeddedConnectionContentContext(new ParserRuleContext(), 1)).ISLAND_CONTENT());
  }

  @Test
  public void testEmbeddedConnectionContentContextISLAND_END() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.EmbeddedConnectionContentContext(new ParserRuleContext(), 1)).ISLAND_END());
  }

  @Test
  public void testEmbeddedConnectionContentContextISLAND_HASH() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.EmbeddedConnectionContentContext(new ParserRuleContext(), 1)).ISLAND_HASH());
  }

  @Test
  public void testEmbeddedConnectionContentContextISLAND_START() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.EmbeddedConnectionContentContext(new ParserRuleContext(), 1)).ISLAND_START());
  }

  @Test
  public void testEmbeddedConnectionContextAccept() {
    // Arrange
    RuntimeParserGrammar.EmbeddedConnectionContext embeddedConnectionContext = new RuntimeParserGrammar.EmbeddedConnectionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(embeddedConnectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEmbeddedConnectionContextAccept2() {
    // Arrange
    RuntimeParserGrammar.EmbeddedConnectionContext embeddedConnectionContext = new RuntimeParserGrammar.EmbeddedConnectionContext(
        new ParserRuleContext(), 1);
    embeddedConnectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(embeddedConnectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEmbeddedConnectionContextEmbeddedConnectionContent() {
    // Arrange, Act and Assert
    assertTrue(
        (new RuntimeParserGrammar.EmbeddedConnectionContext(new ParserRuleContext(), 1)).embeddedConnectionContent()
            .isEmpty());
    assertNull(
        (new RuntimeParserGrammar.EmbeddedConnectionContext(new ParserRuleContext(), 1)).embeddedConnectionContent(1));
  }

  @Test
  public void testEmbeddedConnectionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(10, (new RuntimeParserGrammar.EmbeddedConnectionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testEmbeddedConnectionContextISLAND_OPEN() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.EmbeddedConnectionContext(new ParserRuleContext(), 1)).ISLAND_OPEN());
  }

  @Test
  public void testEmbeddedRuntime() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime10() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(3));
    tokenList.add(new CommonToken(3));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime11() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(3));
    tokenList.add(new CommonToken(3));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime3() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setErrorHandler(new BailErrorStrategy());

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime4() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(3));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(3));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setErrorHandler(new BailErrorStrategy());

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(3));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setBuildParseTree(true);

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime8() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(4));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntime9() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(4));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.EmbeddedRuntimeContext actualEmbeddedRuntimeResult = runtimeParserGrammar.embeddedRuntime();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeResult.invokingState);
    assertNull(actualEmbeddedRuntimeResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeResult.start;
    Token start = actualEmbeddedRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testEmbeddedRuntimeContextAccept() {
    // Arrange
    RuntimeParserGrammar.EmbeddedRuntimeContext embeddedRuntimeContext = new RuntimeParserGrammar.EmbeddedRuntimeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(embeddedRuntimeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEmbeddedRuntimeContextAccept2() {
    // Arrange
    RuntimeParserGrammar.EmbeddedRuntimeContext embeddedRuntimeContext = new RuntimeParserGrammar.EmbeddedRuntimeContext(
        new ParserRuleContext(), 1);
    embeddedRuntimeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(embeddedRuntimeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEmbeddedRuntimeContextConnections() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.EmbeddedRuntimeContext(new ParserRuleContext(), 1)).connections().isEmpty());
    assertNull((new RuntimeParserGrammar.EmbeddedRuntimeContext(new ParserRuleContext(), 1)).connections(1));
  }

  @Test
  public void testEmbeddedRuntimeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(12, (new RuntimeParserGrammar.EmbeddedRuntimeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testEmbeddedRuntimeContextMappings() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.EmbeddedRuntimeContext(new ParserRuleContext(), 1)).mappings().isEmpty());
    assertNull((new RuntimeParserGrammar.EmbeddedRuntimeContext(new ParserRuleContext(), 1)).mappings(1));
  }

  @Test
  public void testIdentifiedConnection() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.IdentifiedConnectionContext actualIdentifiedConnectionResult = runtimeParserGrammar
        .identifiedConnection();

    // Assert
    RecognitionException recognitionException = actualIdentifiedConnectionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualIdentifiedConnectionResult.children.size());
    assertNull(actualIdentifiedConnectionResult.getParent());
    Token expectedStart = actualIdentifiedConnectionResult.start;
    Token start = actualIdentifiedConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualIdentifiedConnectionResult.getStop());
    assertEquals(1, actualIdentifiedConnectionResult.getChildCount());
    assertTrue(actualIdentifiedConnectionResult.isEmpty());
    assertEquals(-1, start.getType());
    RuntimeParserGrammar.IdentifierContext identifierResult = actualIdentifiedConnectionResult.identifier();
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertNull(identifierResult.getStop());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertTrue(identifierResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(115, recognitionException.getOffendingState());
    assertSame(actualIdentifiedConnectionResult, recognitionException.getCtx());
    assertEquals(-1, start.getStopIndex());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(listTokenSource, start.getTokenSource());
    assertEquals("[@0,-1:-1='EOF',<-1>,1:0]", start.toString());
    assertEquals(0, start.getChannel());
  }

  @Test
  public void testIdentifiedConnection2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.IdentifiedConnectionContext actualIdentifiedConnectionResult = runtimeParserGrammar
        .identifiedConnection();

    // Assert
    RecognitionException recognitionException = actualIdentifiedConnectionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualIdentifiedConnectionResult.children.size());
    assertNull(actualIdentifiedConnectionResult.getParent());
    Token token = actualIdentifiedConnectionResult.stop;
    Token start = actualIdentifiedConnectionResult.getStart();
    assertSame(token, start);
    assertSame(token, actualIdentifiedConnectionResult.getStop());
    assertEquals(1, actualIdentifiedConnectionResult.getChildCount());
    assertTrue(actualIdentifiedConnectionResult.isEmpty());
    RuntimeParserGrammar.IdentifierContext identifierResult = actualIdentifiedConnectionResult.identifier();
    assertEquals("null", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(115, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualIdentifiedConnectionResult, recognitionException.getCtx());
    assertEquals("[@0,0:0='<no text>',<1>,0:-1]", start.toString());
  }

  @Test
  public void testIdentifiedConnection3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));

    // Act
    RuntimeParserGrammar.IdentifiedConnectionContext actualIdentifiedConnectionResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).identifiedConnection();

    // Assert
    assertEquals(-1, actualIdentifiedConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualIdentifiedConnectionResult.children;
    assertEquals(3, parseTreeList.size());
    assertNull(actualIdentifiedConnectionResult.getParent());
    Token expectedStart = actualIdentifiedConnectionResult.start;
    Token start = actualIdentifiedConnectionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualIdentifiedConnectionResult.stop;
    Token stop = actualIdentifiedConnectionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals(3, actualIdentifiedConnectionResult.getChildCount());
    assertEquals("null<missing ':'><EOF>", actualIdentifiedConnectionResult.getText());
    assertEquals("[@0,0:0='<no text>',<1>,0:-1]", start.toString());
    RuntimeParserGrammar.IdentifierContext identifierResult = actualIdentifiedConnectionResult.identifier();
    assertEquals(114, identifierResult.invokingState);
    assertEquals("null", identifierResult.getText());
    assertSame(start, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertSame(start, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    assertEquals(1, stop.getTokenIndex());
    assertEquals(116, ((RuntimeParserGrammar.ConnectionPointerContext) parseTreeList.get(2)).invokingState);
  }

  @Test
  public void testIdentifiedConnectionContextAccept() {
    // Arrange
    RuntimeParserGrammar.IdentifiedConnectionContext identifiedConnectionContext = new RuntimeParserGrammar.IdentifiedConnectionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(identifiedConnectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifiedConnectionContextAccept2() {
    // Arrange
    RuntimeParserGrammar.IdentifiedConnectionContext identifiedConnectionContext = new RuntimeParserGrammar.IdentifiedConnectionContext(
        new ParserRuleContext(), 1);
    identifiedConnectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(identifiedConnectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifiedConnectionContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifiedConnectionContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testIdentifiedConnectionContextConnectionPointer() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifiedConnectionContext(new ParserRuleContext(), 1)).connectionPointer());
  }

  @Test
  public void testIdentifiedConnectionContextEmbeddedConnection() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifiedConnectionContext(new ParserRuleContext(), 1)).embeddedConnection());
  }

  @Test
  public void testIdentifiedConnectionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(8, (new RuntimeParserGrammar.IdentifiedConnectionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testIdentifiedConnectionContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifiedConnectionContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testIdentifier() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.IdentifierContext actualIdentifierResult = runtimeParserGrammar.identifier();

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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testIdentifier2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    RuntimeParserGrammar.IdentifierContext actualIdentifierResult = runtimeParserGrammar.identifier();

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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testIdentifier3() throws RecognitionException {
    // Arrange
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));

    // Act
    RuntimeParserGrammar.IdentifierContext actualIdentifierResult = runtimeParserGrammar.identifier();

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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testIdentifier4() throws RecognitionException {
    // Arrange and Act
    RuntimeParserGrammar.IdentifierContext actualIdentifierResult = (new RuntimeParserGrammar(
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
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.IdentifierContext actualIdentifierResult = runtimeParserGrammar.identifier();

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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testIdentifierContextAccept() {
    // Arrange
    RuntimeParserGrammar.IdentifierContext identifierContext = new RuntimeParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextAccept2() {
    // Arrange
    RuntimeParserGrammar.IdentifierContext identifierContext = new RuntimeParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextCONNECTIONS() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).CONNECTIONS());
  }

  @Test
  public void testIdentifierContextIMPORT() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).IMPORT());
  }

  @Test
  public void testIdentifierContextMAPPINGS() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).MAPPINGS());
  }

  @Test
  public void testIdentifierContextRUNTIME() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).RUNTIME());
  }

  @Test
  public void testIdentifierContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testIdentifierContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testImportStatement() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.ImportStatementContext actualImportStatementResult = runtimeParserGrammar.importStatement();

    // Assert
    RecognitionException recognitionException = actualImportStatementResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualImportStatementResult.invokingState);
    assertNull(actualImportStatementResult.getParent());
    Token expectedStart = actualImportStatementResult.start;
    Token start = actualImportStatementResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportStatementResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(49, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualImportStatementResult, recognitionException.getCtx());
    assertNull(start.getInputStream());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testImportStatement2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.ImportStatementContext actualImportStatementResult = runtimeParserGrammar.importStatement();

    // Assert
    RecognitionException recognitionException = actualImportStatementResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualImportStatementResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualImportStatementResult.getParent());
    Token expectedStart = actualImportStatementResult.stop;
    Token start = actualImportStatementResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualImportStatementResult.getStop());
    assertEquals("<missing 'import'><EOF>", actualImportStatementResult.getText());
    assertEquals(2, actualImportStatementResult.getChildCount());
    assertTrue(actualImportStatementResult.isEmpty());
    assertEquals("([] <missing 'import'> ([50] ([145 50] <EOF>)))", actualImportStatementResult.toStringTree());
    assertEquals(0, start.getTokenIndex());
    Token offendingToken = recognitionException.getOffendingToken();
    assertTrue(offendingToken instanceof CommonToken);
    assertEquals(150, recognitionException.getOffendingState());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertSame(parseTreeList.get(1), recognitionException.getCtx());
    assertSame(listTokenSource, offendingToken.getTokenSource());
    assertEquals(-1, offendingToken.getType());
    assertEquals(0, offendingToken.getChannel());
    assertEquals(2, offendingToken.getStartIndex());
    assertEquals(1, offendingToken.getStopIndex());
    assertEquals(50, ((RuntimeParserGrammar.PackagePathContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testImportStatementContextAccept() {
    // Arrange
    RuntimeParserGrammar.ImportStatementContext importStatementContext = new RuntimeParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(importStatementContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testImportStatementContextAccept2() {
    // Arrange
    RuntimeParserGrammar.ImportStatementContext importStatementContext = new RuntimeParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(importStatementContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testImportStatementContextIMPORT() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).IMPORT());
  }

  @Test
  public void testImportStatementContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testImportStatementContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testImportStatementContextSEMI_COLON() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).SEMI_COLON());
  }

  @Test
  public void testImportStatementContextSTAR() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).STAR());
  }

  @Test
  public void testImports() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.ImportsContext actualImportsResult = runtimeParserGrammar.imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testImports2() throws RecognitionException {
    // Arrange and Act
    RuntimeParserGrammar.ImportsContext actualImportsResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(new CodeLexerGrammar(new ANTLRInputStream())))).imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getTokenIndex());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getChannel());
    assertEquals(0, ((CodeLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((CodeLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, ((CodeLexerGrammar) start.getTokenSource()).getType());
    assertNull(((CodeLexerGrammar) start.getTokenSource())._text);
    assertTrue(((CodeLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(0, ((CodeLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(0, ((CodeLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
  }

  @Test
  public void testImports3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.ImportsContext actualImportsResult = runtimeParserGrammar.imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testImports4() throws RecognitionException {
    // Arrange and Act
    RuntimeParserGrammar.ImportsContext actualImportsResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(new CodeLexerGrammar(new ANTLRInputStream("Input"))))).imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    List<ParseTree> parseTreeList = actualImportsResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] ([43] I ([50 43] ([145 50 43] n))) ([43] p ([50 43] ([145 50 43] u))) ([43] t ([50 43] [145"
        + " 50 43])))", actualImportsResult.toStringTree());
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualImportsResult.stop;
    Token stop = actualImportsResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("Input", actualImportsResult.getText());
    assertEquals(3, actualImportsResult.getChildCount());
    assertEquals(4, stop.getCharPositionInLine());
    assertEquals(4, stop.getStartIndex());
    assertEquals(4, stop.getStopIndex());
    assertEquals(0, stop.getChannel());
    assertEquals(2, stop.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(2, start.getType());
    assertEquals(0, start.getChannel());
    assertEquals(0, start.getStopIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(4, stop.getTokenIndex());
    assertEquals(1, stop.getLine());
    assertEquals("I", start.getText());
    assertEquals("t", stop.getText());
    assertTrue(((RuntimeParserGrammar.ImportStatementContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(43, ((RuntimeParserGrammar.ImportStatementContext) parseTreeList.get(0)).invokingState);
    assertEquals(2, ((CodeLexerGrammar) stop.getTokenSource()).getType());
    assertEquals(43, ((RuntimeParserGrammar.ImportStatementContext) parseTreeList.get(1)).invokingState);
    assertEquals(4, ((CodeLexerGrammar) stop.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(4, ((CodeLexerGrammar) stop.getTokenSource())._tokenStartCharIndex);
    assertTrue(((CodeLexerGrammar) stop.getTokenSource())._hitEOF);
    assertNull(((CodeLexerGrammar) stop.getTokenSource())._text);
    assertTrue(((RuntimeParserGrammar.ImportStatementContext) parseTreeList
        .get(2)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertTrue(((RuntimeParserGrammar.ImportStatementContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(43, ((RuntimeParserGrammar.ImportStatementContext) parseTreeList.get(2)).invokingState);
    assertEquals(1, ((CodeLexerGrammar) stop.getTokenSource())._tokenStartLine);
    assertEquals(0, ((CodeLexerGrammar) stop.getTokenSource()).getChannel());
  }

  @Test
  public void testImports5() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setErrorHandler(new BailErrorStrategy());

    // Act
    RuntimeParserGrammar.ImportsContext actualImportsResult = runtimeParserGrammar.imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testImports6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.ImportsContext actualImportsResult = runtimeParserGrammar.imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
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
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testImports7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(46));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    RuntimeParserGrammar.ImportsContext actualImportsResult = runtimeParserGrammar.imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testImports8() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(2));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.ImportsContext actualImportsResult = runtimeParserGrammar.imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(runtimeParserGrammar.getRuleContext());
    assertEquals(-1, runtimeParserGrammar.getState());
  }

  @Test
  public void testImportsContextAccept() {
    // Arrange
    RuntimeParserGrammar.ImportsContext importsContext = new RuntimeParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(importsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testImportsContextAccept2() {
    // Arrange
    RuntimeParserGrammar.ImportsContext importsContext = new RuntimeParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);
    importsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(importsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testImportsContextImportStatement() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.ImportsContext(new ParserRuleContext(), 1)).importStatement().isEmpty());
    assertNull((new RuntimeParserGrammar.ImportsContext(new ParserRuleContext(), 1)).importStatement(1));
  }

  @Test
  public void testMappings() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.MappingsContext actualMappingsResult = runtimeParserGrammar.mappings();

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
    assertEquals(67, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
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
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.MappingsContext actualMappingsResult = runtimeParserGrammar.mappings();

    // Assert
    RecognitionException recognitionException = actualMappingsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualMappingsResult.children.size());
    assertNull(actualMappingsResult.getParent());
    Token expectedStart = actualMappingsResult.stop;
    Token start = actualMappingsResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualMappingsResult.getStop());
    assertEquals("null", actualMappingsResult.getText());
    assertEquals(1, actualMappingsResult.getChildCount());
    assertTrue(actualMappingsResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(67, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualMappingsResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testMappings3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(3));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.MappingsContext actualMappingsResult = runtimeParserGrammar.mappings();

    // Assert
    RecognitionException recognitionException = actualMappingsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualMappingsResult.children.size());
    assertNull(actualMappingsResult.getParent());
    Token expectedStart = actualMappingsResult.stop;
    Token start = actualMappingsResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualMappingsResult.getStop());
    assertEquals("null", actualMappingsResult.getText());
    assertEquals(1, actualMappingsResult.getChildCount());
    assertTrue(actualMappingsResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(68, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertSame(actualMappingsResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testMappingsContextAccept() {
    // Arrange
    RuntimeParserGrammar.MappingsContext mappingsContext = new RuntimeParserGrammar.MappingsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(mappingsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMappingsContextAccept2() {
    // Arrange
    RuntimeParserGrammar.MappingsContext mappingsContext = new RuntimeParserGrammar.MappingsContext(
        new ParserRuleContext(), 1);
    mappingsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(mappingsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testMappingsContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testMappingsContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testMappingsContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testMappingsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testMappingsContextMAPPINGS() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)).MAPPINGS());
  }

  @Test
  public void testMappingsContextQualifiedName() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)).qualifiedName().isEmpty());
    assertNull((new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)).qualifiedName(1));
  }

  @Test
  public void testMappingsContextSEMI_COLON() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.MappingsContext(new ParserRuleContext(), 1)).SEMI_COLON());
  }

  @Test
  public void testPackagePath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    RuntimeParserGrammar.PackagePathContext actualPackagePathResult = (new RuntimeParserGrammar(
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
    assertSame(start, ((RuntimeParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((RuntimeParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((RuntimeParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((RuntimeParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePath2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    RuntimeParserGrammar.PackagePathContext actualPackagePathResult = (new RuntimeParserGrammar(
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
    assertSame(start, ((RuntimeParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((RuntimeParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((RuntimeParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((RuntimeParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((RuntimeParserGrammar.IdentifierContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertSame(getResult, getResult1.getParent());
    assertNull(getResult1.toString());
  }

  @Test
  public void testPackagePath3() throws RecognitionException {
    // Arrange and Act
    RuntimeParserGrammar.PackagePathContext actualPackagePathResult = (new RuntimeParserGrammar(
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
    assertSame(start, ((RuntimeParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((RuntimeParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((RuntimeParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((RuntimeParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((RuntimeParserGrammar.IdentifierContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertSame(getResult, getResult1.getParent());
    assertEquals("Input", getResult1.toString());
  }

  @Test
  public void testPackagePath4() throws RecognitionException {
    // Arrange and Act
    RuntimeParserGrammar.PackagePathContext actualPackagePathResult = (new RuntimeParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("([] [145])", actualPackagePathResult.toStringTree());
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
    assertEquals(145, ((RuntimeParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testPackagePath5() throws RecognitionException {
    // Arrange
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.PackagePathContext actualPackagePathResult = runtimeParserGrammar.packagePath();

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
    assertSame(start, ((RuntimeParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((RuntimeParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((RuntimeParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((RuntimeParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((RuntimeParserGrammar.IdentifierContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertSame(getResult, getResult1.getParent());
    assertEquals("Input", getResult1.toString());
  }

  @Test
  public void testPackagePathContextAccept() {
    // Arrange
    RuntimeParserGrammar.PackagePathContext packagePathContext = new RuntimeParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextAccept2() {
    // Arrange
    RuntimeParserGrammar.PackagePathContext packagePathContext = new RuntimeParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(14, (new RuntimeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPackagePathContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new RuntimeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPackagePathContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR().isEmpty());
    assertNull((new RuntimeParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR(1));
  }

  @Test
  public void testQualifiedName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.QualifiedNameContext actualQualifiedNameResult = runtimeParserGrammar.qualifiedName();

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
    assertEquals(141, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
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

    // Act
    RuntimeParserGrammar.QualifiedNameContext actualQualifiedNameResult = (new RuntimeParserGrammar(
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
    RuntimeParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertEquals(143, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
  public void testQualifiedName3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    RuntimeParserGrammar.QualifiedNameContext actualQualifiedNameResult = (new RuntimeParserGrammar(
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
    RuntimeParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertEquals(143, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
    RuntimeParserGrammar.QualifiedNameContext actualQualifiedNameResult = (new RuntimeParserGrammar(
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
    RuntimeParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertEquals(143, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
  public void testQualifiedName5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setBuildParseTree(true);

    // Act
    RuntimeParserGrammar.QualifiedNameContext actualQualifiedNameResult = runtimeParserGrammar.qualifiedName();

    // Assert
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    Token token = actualQualifiedNameResult.stop;
    assertSame(token, actualQualifiedNameResult.getStart());
    Token stop = actualQualifiedNameResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualQualifiedNameResult.getChildCount());
    RuntimeParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertEquals(143, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
  public void testQualifiedName6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.QualifiedNameContext actualQualifiedNameResult = runtimeParserGrammar.qualifiedName();

    // Assert
    assertEquals(-1, actualQualifiedNameResult.invokingState);
    assertEquals(1, actualQualifiedNameResult.children.size());
    assertNull(actualQualifiedNameResult.getParent());
    Token token = actualQualifiedNameResult.stop;
    assertSame(token, actualQualifiedNameResult.getStart());
    Token stop = actualQualifiedNameResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualQualifiedNameResult.getChildCount());
    RuntimeParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
    assertEquals(143, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
  public void testQualifiedName7() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CommonTokenStream commonTokenStream = new CommonTokenStream(listTokenSource);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(commonTokenStream);
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.QualifiedNameContext actualQualifiedNameResult = runtimeParserGrammar.qualifiedName();

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
    assertEquals(141, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertSame(commonTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertNull(start.getInputStream());
    assertSame(actualQualifiedNameResult, recognitionException.getCtx());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("EOF", start.getText());
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

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    runtimeParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.QualifiedNameContext actualQualifiedNameResult = runtimeParserGrammar.qualifiedName();

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
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(141, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
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
  public void testQualifiedNameContextAccept() {
    // Arrange
    RuntimeParserGrammar.QualifiedNameContext qualifiedNameContext = new RuntimeParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextAccept2() {
    // Arrange
    RuntimeParserGrammar.QualifiedNameContext qualifiedNameContext = new RuntimeParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(13, (new RuntimeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testQualifiedNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testQualifiedNameContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testQualifiedNameContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testRuntime() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.RuntimeContext actualRuntimeResult = runtimeParserGrammar.runtime();

    // Assert
    RecognitionException recognitionException = actualRuntimeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualRuntimeResult.invokingState);
    assertNull(actualRuntimeResult.getParent());
    Token expectedStart = actualRuntimeResult.start;
    Token start = actualRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualRuntimeResult.getStop());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(55, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualRuntimeResult, recognitionException.getCtx());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(0, tokenSource.getCharPositionInLine());
  }

  @Test
  public void testRuntime2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.RuntimeContext actualRuntimeResult = runtimeParserGrammar.runtime();

    // Assert
    RecognitionException recognitionException = actualRuntimeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualRuntimeResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualRuntimeResult.getParent());
    Token token = actualRuntimeResult.stop;
    assertSame(token, actualRuntimeResult.getStart());
    Token stop = actualRuntimeResult.getStop();
    assertSame(token, stop);
    assertEquals(2, actualRuntimeResult.getChildCount());
    assertTrue(actualRuntimeResult.isEmpty());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(57, recognitionException.getOffendingState());
    assertSame(actualRuntimeResult, recognitionException.getCtx());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, stop.getTokenIndex());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(56, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
    ParseTree getResult = parseTreeList.get(0);
    assertSame(actualRuntimeResult, getResult.getParent());
    assertNull(getResult.getText());
    assertTrue(((RuntimeParserGrammar.QualifiedNameContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testRuntime3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.RuntimeContext actualRuntimeResult = runtimeParserGrammar.runtime();

    // Assert
    RecognitionException recognitionException = actualRuntimeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualRuntimeResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualRuntimeResult.getParent());
    Token expectedStart = actualRuntimeResult.start;
    Token start = actualRuntimeResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualRuntimeResult.stop;
    Token stop = actualRuntimeResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualRuntimeResult.getText());
    assertEquals(2, actualRuntimeResult.getChildCount());
    assertTrue(actualRuntimeResult.isEmpty());
    assertEquals("[@0,0:0='<no text>',<1>,0:-1]", start.toString());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(57, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualRuntimeResult, recognitionException.getCtx());
    assertEquals(56, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testRuntime4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(55));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.RuntimeContext actualRuntimeResult = runtimeParserGrammar.runtime();

    // Assert
    RecognitionException recognitionException = actualRuntimeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualRuntimeResult.children.size());
    assertNull(actualRuntimeResult.getParent());
    Token expectedStart = actualRuntimeResult.stop;
    Token start = actualRuntimeResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualRuntimeResult.getStop());
    assertEquals("null", actualRuntimeResult.getText());
    assertEquals(1, actualRuntimeResult.getChildCount());
    assertTrue(actualRuntimeResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(55, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualRuntimeResult, recognitionException.getCtx());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(1, inputStream.index());
    assertEquals("List", inputStream.getSourceName());
  }

  @Test
  public void testRuntime5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(4));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.RuntimeContext actualRuntimeResult = runtimeParserGrammar.runtime();

    // Assert
    RecognitionException recognitionException = actualRuntimeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualRuntimeResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualRuntimeResult.getParent());
    Token expectedStart = actualRuntimeResult.start;
    Token start = actualRuntimeResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualRuntimeResult.stop;
    Token stop = actualRuntimeResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualRuntimeResult.getText());
    assertEquals(2, actualRuntimeResult.getChildCount());
    assertTrue(actualRuntimeResult.isEmpty());
    assertEquals("[@0,0:0='<no text>',<1>,0:-1]", start.toString());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(57, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualRuntimeResult, recognitionException.getCtx());
    assertEquals(56, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testRuntime6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(new CommonToken(1)));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.RuntimeContext actualRuntimeResult = runtimeParserGrammar.runtime();

    // Assert
    RecognitionException recognitionException = actualRuntimeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualRuntimeResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualRuntimeResult.getParent());
    Token token = actualRuntimeResult.stop;
    assertSame(token, actualRuntimeResult.getStart());
    Token stop = actualRuntimeResult.getStop();
    assertSame(token, stop);
    assertEquals(2, actualRuntimeResult.getChildCount());
    assertTrue(actualRuntimeResult.isEmpty());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(57, recognitionException.getOffendingState());
    assertSame(actualRuntimeResult, recognitionException.getCtx());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, stop.getTokenIndex());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(56, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
    ParseTree getResult = parseTreeList.get(0);
    assertSame(actualRuntimeResult, getResult.getParent());
    assertNull(getResult.getText());
    assertTrue(((RuntimeParserGrammar.QualifiedNameContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testRuntime7() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    CommonToken commonToken = new CommonToken(1);
    tokenList.add(commonToken);
    tokenList.add(new CommonToken(4));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.RuntimeContext actualRuntimeResult = runtimeParserGrammar.runtime();

    // Assert
    RecognitionException recognitionException = actualRuntimeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualRuntimeResult.children;
    assertEquals(4, parseTreeList.size());
    assertNull(actualRuntimeResult.getParent());
    Token expectedStart = actualRuntimeResult.start;
    Token start = actualRuntimeResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualRuntimeResult.stop;
    Token stop = actualRuntimeResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnullnullnull", actualRuntimeResult.getText());
    assertEquals(4, actualRuntimeResult.getChildCount());
    assertTrue(actualRuntimeResult.isEmpty());
    assertEquals("[@0,0:0='<no text>',<1>,0:-1]", start.toString());
    assertEquals(3, stop.getTokenIndex());
    assertEquals(57, recognitionException.getOffendingState());
    assertSame(actualRuntimeResult, recognitionException.getCtx());
    assertSame(commonToken, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(56, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testRuntimeContextAccept() {
    // Arrange
    RuntimeParserGrammar.RuntimeContext runtimeContext = new RuntimeParserGrammar.RuntimeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(runtimeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testRuntimeContextAccept2() {
    // Arrange
    RuntimeParserGrammar.RuntimeContext runtimeContext = new RuntimeParserGrammar.RuntimeContext(
        new ParserRuleContext(), 1);
    runtimeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(runtimeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testRuntimeContextBRACE_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.RuntimeContext(new ParserRuleContext(), 1)).BRACE_CLOSE());
  }

  @Test
  public void testRuntimeContextBRACE_OPEN() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.RuntimeContext(new ParserRuleContext(), 1)).BRACE_OPEN());
  }

  @Test
  public void testRuntimeContextConnections() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.RuntimeContext(new ParserRuleContext(), 1)).connections().isEmpty());
    assertNull((new RuntimeParserGrammar.RuntimeContext(new ParserRuleContext(), 1)).connections(1));
  }

  @Test
  public void testRuntimeContextMappings() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.RuntimeContext(new ParserRuleContext(), 1)).mappings().isEmpty());
    assertNull((new RuntimeParserGrammar.RuntimeContext(new ParserRuleContext(), 1)).mappings(1));
  }

  @Test
  public void testRuntimeContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.RuntimeContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testRuntimeContextRUNTIME() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.RuntimeContext(new ParserRuleContext(), 1)).RUNTIME());
  }

  @Test
  public void testStoreConnections() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.StoreConnectionsContext actualStoreConnectionsResult = runtimeParserGrammar.storeConnections();

    // Assert
    RecognitionException recognitionException = actualStoreConnectionsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualStoreConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualStoreConnectionsResult.getParent());
    Token expectedStart = actualStoreConnectionsResult.start;
    Token start = actualStoreConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualStoreConnectionsResult.getStop());
    assertEquals(1, actualStoreConnectionsResult.getChildCount());
    assertTrue(actualStoreConnectionsResult.isEmpty());
    assertEquals("([] [99])", actualStoreConnectionsResult.toStringTree());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(100, recognitionException.getOffendingState());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(1, start.getLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertNull(start.getInputStream());
    assertEquals(-1, start.getStartIndex());
    assertSame(actualStoreConnectionsResult, recognitionException.getCtx());
    assertEquals(0, tokenSource.getCharPositionInLine());
    assertTrue(((RuntimeParserGrammar.QualifiedNameContext) parseTreeList
        .get(0)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(0, inputStream.index());
    assertEquals("", ((BufferedTokenStream) inputStream).getText());
    assertEquals(99, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).invokingState);
  }

  @Test
  public void testStoreConnections2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.StoreConnectionsContext actualStoreConnectionsResult = runtimeParserGrammar.storeConnections();

    // Assert
    RecognitionException recognitionException = actualStoreConnectionsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualStoreConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualStoreConnectionsResult.getParent());
    Token expectedStart = actualStoreConnectionsResult.stop;
    Token start = actualStoreConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualStoreConnectionsResult.getStop());
    assertEquals("null", actualStoreConnectionsResult.getText());
    assertEquals(1, actualStoreConnectionsResult.getChildCount());
    assertTrue(actualStoreConnectionsResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(100, recognitionException.getOffendingState());
    assertSame(actualStoreConnectionsResult, recognitionException.getCtx());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(2, inputStream.size());
    assertEquals(99, ((RuntimeParserGrammar.QualifiedNameContext) parseTreeList.get(0)).invokingState);
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals("List", inputStream.getSourceName());
  }

  @Test
  public void testStoreConnectionsContextAccept() {
    // Arrange
    RuntimeParserGrammar.StoreConnectionsContext storeConnectionsContext = new RuntimeParserGrammar.StoreConnectionsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(storeConnectionsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testStoreConnectionsContextAccept2() {
    // Arrange
    RuntimeParserGrammar.StoreConnectionsContext storeConnectionsContext = new RuntimeParserGrammar.StoreConnectionsContext(
        new ParserRuleContext(), 1);
    storeConnectionsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(storeConnectionsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testStoreConnectionsContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testStoreConnectionsContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testStoreConnectionsContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testStoreConnectionsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testStoreConnectionsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(7, (new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testStoreConnectionsContextIdentifiedConnection() {
    // Arrange, Act and Assert
    assertTrue((new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)).identifiedConnection()
        .isEmpty());
    assertNull((new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)).identifiedConnection(1));
  }

  @Test
  public void testStoreConnectionsContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.StoreConnectionsContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testWord() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.WordContext actualWordResult = runtimeParserGrammar.word();

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
    assertEquals(156, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
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

    // Act
    RuntimeParserGrammar.WordContext actualWordResult = (new RuntimeParserGrammar(
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
    RuntimeParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertEquals(153, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
  public void testWord3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    RuntimeParserGrammar.WordContext actualWordResult = (new RuntimeParserGrammar(
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
    RuntimeParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertEquals(153, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    // Act
    RuntimeParserGrammar.WordContext actualWordResult = (new RuntimeParserGrammar(
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
    RuntimeParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertEquals(153, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
  public void testWord5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setBuildParseTree(true);

    // Act
    RuntimeParserGrammar.WordContext actualWordResult = runtimeParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.children.size());
    assertNull(actualWordResult.getParent());
    Token token = actualWordResult.stop;
    assertSame(token, actualWordResult.getStart());
    Token stop = actualWordResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualWordResult.getChildCount());
    RuntimeParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertEquals(153, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
  public void testWord6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.WordContext actualWordResult = runtimeParserGrammar.word();

    // Assert
    assertEquals(-1, actualWordResult.invokingState);
    assertEquals(1, actualWordResult.children.size());
    assertNull(actualWordResult.getParent());
    Token token = actualWordResult.stop;
    assertSame(token, actualWordResult.getStart());
    Token stop = actualWordResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualWordResult.getChildCount());
    RuntimeParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
    assertEquals(153, identifierResult.invokingState);
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
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
  public void testWord7() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CommonTokenStream commonTokenStream = new CommonTokenStream(listTokenSource);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(commonTokenStream);
    runtimeParserGrammar.setTrace(true);

    // Act
    RuntimeParserGrammar.WordContext actualWordResult = runtimeParserGrammar.word();

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
    assertEquals(156, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
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
  public void testWord8() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setLine(2);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    RuntimeParserGrammar runtimeParserGrammar = new RuntimeParserGrammar(new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    runtimeParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    RuntimeParserGrammar.WordContext actualWordResult = runtimeParserGrammar.word();

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
    assertEquals(156, recognitionException.getOffendingState());
    assertSame(runtimeParserGrammar, recognitionException.getRecognizer());
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
    RuntimeParserGrammar.WordContext wordContext = new RuntimeParserGrammar.WordContext(new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextAccept2() {
    // Arrange
    RuntimeParserGrammar.WordContext wordContext = new RuntimeParserGrammar.WordContext(new ParserRuleContext(), 1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.WordContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testWordContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(15, (new RuntimeParserGrammar.WordContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testWordContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.WordContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testWordContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new RuntimeParserGrammar.WordContext(new ParserRuleContext(), 1)).identifier());
  }
}

