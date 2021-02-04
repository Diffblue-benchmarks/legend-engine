package org.finos.legend.engine.language.pure.grammar.from.antlr4.connection;

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
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPathLexer;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.CodeParserGrammarBaseVisitor;
import org.junit.Test;

public class ConnectionParserGrammarDiffblueTest {
  @Test
  public void testConnection() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    ConnectionParserGrammar.ConnectionContext actualConnectionResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).connection();

    // Assert
    assertEquals(-1, actualConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] ([57] [61 57]) [58] ([59] <missing BRACE_OPEN>))", actualConnectionResult.toStringTree());
    assertNull(actualConnectionResult.getParent());
    Token expectedStart = actualConnectionResult.start;
    Token start = actualConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionResult.getStop());
    assertEquals("<missing BRACE_OPEN>", actualConnectionResult.getText());
    assertEquals(3, actualConnectionResult.getChildCount());
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
    ParseTree getResult = parseTreeList.get(2);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) getResult).invokingState);
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList.get(0)).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionValueContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    ParseTree getResult1 = parseTreeList.get(1);
    assertTrue(
        ((ConnectionParserGrammar.QualifiedNameContext) getResult1).exception instanceof org.antlr.v4.runtime.NoViableAltException);
    assertEquals(1, tokenSource.getLine());
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) getResult1).invokingState);
    assertEquals("[58]", getResult1.toString());
  }

  @Test
  public void testConnection2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    // Act
    ConnectionParserGrammar.ConnectionContext actualConnectionResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).connection();

    // Assert
    assertEquals(-1, actualConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionResult.children;
    assertEquals(3, parseTreeList.size());
    assertNull(actualConnectionResult.getParent());
    Token expectedStart = actualConnectionResult.start;
    Token start = actualConnectionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualConnectionResult.stop;
    Token stop = actualConnectionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnullnull", actualConnectionResult.getText());
    assertEquals(3, actualConnectionResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    assertEquals(2, stop.getTokenIndex());
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList.get(2)).invokingState);
    ParseTree getResult = parseTreeList.get(0);
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).depth());
    assertFalse(((ConnectionParserGrammar.ConnectionTypeContext) getResult).isEmpty());
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals("null", getResult.getText());
    assertTrue(((ConnectionParserGrammar.ConnectionValueContext) parseTreeList
        .get(2)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testConnection3() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.ConnectionContext actualConnectionResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).connection();

    // Assert
    assertEquals(-1, actualConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] ([57] [61 57]) [58] ([59] <missing BRACE_OPEN>))", actualConnectionResult.toStringTree());
    assertNull(actualConnectionResult.getParent());
    Token expectedStart = actualConnectionResult.start;
    Token start = actualConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionResult.getStop());
    assertEquals("<missing BRACE_OPEN>", actualConnectionResult.getText());
    assertEquals(3, actualConnectionResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList.get(0)).invokingState);
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertTrue(((ConnectionParserGrammar.QualifiedNameContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.NoViableAltException);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList.get(2)).invokingState);
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testConnection4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    connectionParserGrammar.setTokenStream(new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.ConnectionContext actualConnectionResult = connectionParserGrammar.connection();

    // Assert
    assertEquals(-1, actualConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] ([57] [61 57]) [58] ([59] <missing BRACE_OPEN>))", actualConnectionResult.toStringTree());
    assertNull(actualConnectionResult.getParent());
    Token expectedStart = actualConnectionResult.start;
    Token start = actualConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionResult.getStop());
    assertEquals("<missing BRACE_OPEN>", actualConnectionResult.getText());
    assertEquals(3, actualConnectionResult.getChildCount());
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
    ParseTree getResult = parseTreeList.get(2);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) getResult).invokingState);
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList.get(0)).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionValueContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    ParseTree getResult1 = parseTreeList.get(1);
    assertTrue(
        ((ConnectionParserGrammar.QualifiedNameContext) getResult1).exception instanceof org.antlr.v4.runtime.NoViableAltException);
    assertEquals(1, tokenSource.getLine());
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) getResult1).invokingState);
    assertEquals("[58]", getResult1.toString());
  }

  @Test
  public void testConnection5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    connectionParserGrammar.setTokenStream(new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.ConnectionContext actualConnectionResult = connectionParserGrammar.connection();

    // Assert
    assertEquals(-1, actualConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] ([57] [61 57]) [58] ([59] <missing BRACE_OPEN>))", actualConnectionResult.toStringTree());
    assertNull(actualConnectionResult.getParent());
    Token expectedStart = actualConnectionResult.start;
    Token start = actualConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionResult.getStop());
    assertEquals("<missing BRACE_OPEN>", actualConnectionResult.getText());
    assertEquals(3, actualConnectionResult.getChildCount());
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
    ParseTree getResult = parseTreeList.get(2);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) getResult).invokingState);
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList.get(0)).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionValueContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    ParseTree getResult1 = parseTreeList.get(1);
    assertTrue(
        ((ConnectionParserGrammar.QualifiedNameContext) getResult1).exception instanceof org.antlr.v4.runtime.NoViableAltException);
    assertEquals(1, tokenSource.getLine());
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) getResult1).invokingState);
    assertEquals("[58]", getResult1.toString());
  }

  @Test
  public void testConnection6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionContext actualConnectionResult = connectionParserGrammar.connection();

    // Assert
    assertEquals(-1, actualConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] ([57] ([61 57] <EOF>)) [58] ([59] <missing BRACE_OPEN>))", actualConnectionResult.toStringTree());
    assertNull(actualConnectionResult.getParent());
    Token token = actualConnectionResult.stop;
    Token start = actualConnectionResult.getStart();
    assertSame(token, start);
    assertSame(token, actualConnectionResult.getStop());
    assertEquals("<EOF><missing BRACE_OPEN>", actualConnectionResult.getText());
    assertEquals(3, actualConnectionResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList.get(0)).invokingState);
    ParseTree getResult = parseTreeList.get(1);
    assertEquals("[58]", getResult.toString());
    ParseTree getResult1 = parseTreeList.get(2);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) getResult1).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult1.getText());
    assertTrue(((ConnectionParserGrammar.ConnectionValueContext) getResult1).getStart() instanceof CommonToken);
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult1).depth());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult1).getStop());
    assertEquals(1, getResult1.getChildCount());
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) getResult).invokingState);
    assertTrue(
        ((ConnectionParserGrammar.QualifiedNameContext) getResult).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testConnection7() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>(), "Source Name");

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionContext actualConnectionResult = connectionParserGrammar.connection();

    // Assert
    assertEquals(-1, actualConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] ([57] [61 57]) [58] ([59] <missing BRACE_OPEN>))", actualConnectionResult.toStringTree());
    assertNull(actualConnectionResult.getParent());
    Token expectedStart = actualConnectionResult.start;
    Token start = actualConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionResult.getStop());
    assertEquals("<missing BRACE_OPEN>", actualConnectionResult.getText());
    assertEquals(3, actualConnectionResult.getChildCount());
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
    ParseTree getResult = parseTreeList.get(2);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) getResult).invokingState);
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList.get(0)).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionValueContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    ParseTree getResult1 = parseTreeList.get(1);
    assertTrue(
        ((ConnectionParserGrammar.QualifiedNameContext) getResult1).exception instanceof org.antlr.v4.runtime.NoViableAltException);
    assertEquals(1, tokenSource.getLine());
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) getResult1).invokingState);
    assertEquals("[58]", getResult1.toString());
  }

  @Test
  public void testConnection8() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionContext actualConnectionResult = connectionParserGrammar.connection();

    // Assert
    assertEquals(-1, actualConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionResult.children;
    assertEquals(3, parseTreeList.size());
    assertNull(actualConnectionResult.getParent());
    Token expectedStart = actualConnectionResult.start;
    Token start = actualConnectionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualConnectionResult.stop;
    Token stop = actualConnectionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnullnull", actualConnectionResult.getText());
    assertEquals(3, actualConnectionResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    assertEquals(2, stop.getTokenIndex());
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) parseTreeList.get(1)).invokingState);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList.get(2)).invokingState);
    ParseTree getResult = parseTreeList.get(0);
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).depth());
    assertFalse(((ConnectionParserGrammar.ConnectionTypeContext) getResult).isEmpty());
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals("null", getResult.getText());
    assertTrue(((ConnectionParserGrammar.ConnectionValueContext) parseTreeList
        .get(2)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void testConnectionContextAccept() {
    // Arrange
    ConnectionParserGrammar.ConnectionContext connectionContext = new ConnectionParserGrammar.ConnectionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(connectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionContextAccept2() {
    // Arrange
    ConnectionParserGrammar.ConnectionContext connectionContext = new ConnectionParserGrammar.ConnectionContext(
        new ParserRuleContext(), 1);
    connectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionContextAccept3() {
    // Arrange
    ConnectionParserGrammar.ConnectionContext connectionContext = new ConnectionParserGrammar.ConnectionContext(
        new ParserRuleContext(), 1);
    connectionContext.<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionContextConnectionType() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1)).connectionType());
  }

  @Test
  public void testConnectionContextConnectionValue() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1)).connectionValue());
  }

  @Test
  public void testConnectionContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ConnectionContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testConnectionType() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    ConnectionParserGrammar.ConnectionTypeContext actualConnectionTypeResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).connectionType();

    // Assert
    assertEquals(-1, actualConnectionTypeResult.invokingState);
    assertEquals(1, actualConnectionTypeResult.children.size());
    assertNull(actualConnectionTypeResult.getParent());
    Token expectedStart = actualConnectionTypeResult.start;
    Token start = actualConnectionTypeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionTypeResult.getStop());
    assertEquals(1, actualConnectionTypeResult.getChildCount());
    ConnectionParserGrammar.IdentifierContext identifierResult = actualConnectionTypeResult.identifier();
    assertEquals(2, identifierResult.depth());
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
    assertFalse(identifierResult.isEmpty());
    assertNull(identifierResult.getStop());
    assertSame(start, identifierResult.getStart());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testConnectionType2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    ConnectionParserGrammar.ConnectionTypeContext actualConnectionTypeResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).connectionType();

    // Assert
    assertEquals(-1, actualConnectionTypeResult.invokingState);
    assertEquals(1, actualConnectionTypeResult.children.size());
    assertNull(actualConnectionTypeResult.getParent());
    Token token = actualConnectionTypeResult.stop;
    assertSame(token, actualConnectionTypeResult.getStart());
    Token stop = actualConnectionTypeResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualConnectionTypeResult.getChildCount());
    assertEquals(0, stop.getTokenIndex());
    ConnectionParserGrammar.IdentifierContext identifierResult = actualConnectionTypeResult.identifier();
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
  public void testConnectionType3() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.ConnectionTypeContext actualConnectionTypeResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))))).connectionType();

    // Assert
    assertEquals(-1, actualConnectionTypeResult.invokingState);
    assertEquals(1, actualConnectionTypeResult.children.size());
    assertNull(actualConnectionTypeResult.getParent());
    Token token = actualConnectionTypeResult.stop;
    assertSame(token, actualConnectionTypeResult.getStart());
    Token stop = actualConnectionTypeResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualConnectionTypeResult.getChildCount());
    assertEquals(0, stop.getStartIndex());
    assertNull(stop.getTokenSource());
    assertEquals(0, stop.getChannel());
    assertEquals(1, stop.getType());
    ConnectionParserGrammar.IdentifierContext identifierResult = actualConnectionTypeResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    assertEquals("Input", stop.getText());
    assertEquals(1, stop.getLine());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(0, stop.getTokenIndex());
    assertEquals(0, stop.getCharPositionInLine());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertEquals("Input", getResult.getText());
  }

  @Test
  public void testConnectionType4() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.ConnectionTypeContext actualConnectionTypeResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).connectionType();

    // Assert
    assertEquals(-1, actualConnectionTypeResult.invokingState);
    assertEquals(1, actualConnectionTypeResult.children.size());
    assertNull(actualConnectionTypeResult.getParent());
    Token expectedStart = actualConnectionTypeResult.start;
    Token start = actualConnectionTypeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionTypeResult.getStop());
    assertEquals(1, actualConnectionTypeResult.getChildCount());
    ConnectionParserGrammar.IdentifierContext identifierResult = actualConnectionTypeResult.identifier();
    assertEquals(2, identifierResult.depth());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(61, identifierResult.invokingState);
    assertNull(identifierResult.getStop());
    assertSame(start, identifierResult.getStart());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
  }

  @Test
  public void testConnectionType5() throws RecognitionException {
    // Arrange
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionTypeContext actualConnectionTypeResult = connectionParserGrammar.connectionType();

    // Assert
    assertEquals(-1, actualConnectionTypeResult.invokingState);
    assertEquals(1, actualConnectionTypeResult.children.size());
    assertNull(actualConnectionTypeResult.getParent());
    Token token = actualConnectionTypeResult.stop;
    assertSame(token, actualConnectionTypeResult.getStart());
    Token stop = actualConnectionTypeResult.getStop();
    assertSame(token, stop);
    assertEquals(1, actualConnectionTypeResult.getChildCount());
    assertEquals(0, stop.getStartIndex());
    assertNull(stop.getTokenSource());
    assertEquals(0, stop.getChannel());
    assertEquals(1, stop.getType());
    ConnectionParserGrammar.IdentifierContext identifierResult = actualConnectionTypeResult.identifier();
    assertSame(stop, identifierResult.getStart());
    assertEquals(2, identifierResult.depth());
    assertFalse(identifierResult.isEmpty());
    assertSame(stop, identifierResult.getStop());
    assertEquals(1, identifierResult.getChildCount());
    assertEquals("Input", stop.getText());
    assertEquals(1, stop.getLine());
    List<ParseTree> parseTreeList = identifierResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals(0, stop.getTokenIndex());
    assertEquals(0, stop.getCharPositionInLine());
    ParseTree getResult = parseTreeList.get(0);
    assertSame(identifierResult, getResult.getParent());
    assertEquals("Input", getResult.getText());
  }

  @Test
  public void testConnectionTypeContextAccept() {
    // Arrange
    ConnectionParserGrammar.ConnectionTypeContext connectionTypeContext = new ConnectionParserGrammar.ConnectionTypeContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(connectionTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionTypeContextAccept2() {
    // Arrange
    ConnectionParserGrammar.ConnectionTypeContext connectionTypeContext = new ConnectionParserGrammar.ConnectionTypeContext(
        new ParserRuleContext(), 1);
    connectionTypeContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionTypeContextAccept3() {
    // Arrange
    ConnectionParserGrammar.ConnectionTypeContext connectionTypeContext = new ConnectionParserGrammar.ConnectionTypeContext(
        new ParserRuleContext(), 1);
    connectionTypeContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionTypeContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionTypeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(6, (new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testConnectionTypeContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ConnectionTypeContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testConnectionValue() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    ConnectionParserGrammar.ConnectionValueContext actualConnectionValueResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).connectionValue();

    // Assert
    assertEquals(-1, actualConnectionValueResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionValueResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionValueResult.getParent());
    Token expectedStart = actualConnectionValueResult.start;
    Token start = actualConnectionValueResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionValueResult.getStop());
    assertEquals(1, actualConnectionValueResult.getChildCount());
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
    assertSame(actualConnectionValueResult, getResult.getParent());
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing BRACE_OPEN>',<2>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(2, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing BRACE_OPEN>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testConnectionValue2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.ConnectionValueContext actualConnectionValueResult = connectionParserGrammar
        .connectionValue();

    // Assert
    RecognitionException recognitionException = actualConnectionValueResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionValueResult.children.size());
    assertNull(actualConnectionValueResult.getParent());
    Token expectedStart = actualConnectionValueResult.stop;
    Token start = actualConnectionValueResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionValueResult.getStop());
    assertEquals("null", actualConnectionValueResult.getText());
    assertEquals(1, actualConnectionValueResult.getChildCount());
    assertTrue(actualConnectionValueResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(63, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualConnectionValueResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testConnectionValue3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.ConnectionValueContext actualConnectionValueResult = connectionParserGrammar
        .connectionValue();

    // Assert
    RecognitionException recognitionException = actualConnectionValueResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionValueResult.children.size());
    assertNull(actualConnectionValueResult.getParent());
    Token expectedStart = actualConnectionValueResult.stop;
    Token start = actualConnectionValueResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionValueResult.getStop());
    assertEquals("Input", actualConnectionValueResult.getText());
    assertEquals(1, actualConnectionValueResult.getChildCount());
    assertTrue(actualConnectionValueResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(63, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualConnectionValueResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testConnectionValue4() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.ConnectionValueContext actualConnectionValueResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).connectionValue();

    // Assert
    assertEquals(-1, actualConnectionValueResult.invokingState);
    assertEquals(1, actualConnectionValueResult.children.size());
    assertNull(actualConnectionValueResult.getParent());
    Token expectedStart = actualConnectionValueResult.start;
    Token start = actualConnectionValueResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionValueResult.getStop());
    assertEquals("<missing BRACE_OPEN>", actualConnectionValueResult.getText());
    assertEquals(1, actualConnectionValueResult.getChildCount());
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
  public void testConnectionValue5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionValueContext actualConnectionValueResult = connectionParserGrammar
        .connectionValue();

    // Assert
    RecognitionException recognitionException = actualConnectionValueResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionValueResult.children.size());
    assertNull(actualConnectionValueResult.getParent());
    Token expectedStart = actualConnectionValueResult.stop;
    Token start = actualConnectionValueResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionValueResult.getStop());
    assertEquals("Input", actualConnectionValueResult.getText());
    assertEquals(1, actualConnectionValueResult.getChildCount());
    assertTrue(actualConnectionValueResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(63, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualConnectionValueResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testConnectionValue6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionValueContext actualConnectionValueResult = connectionParserGrammar
        .connectionValue();

    // Assert
    assertEquals(-1, actualConnectionValueResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionValueResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionValueResult.getParent());
    Token expectedStart = actualConnectionValueResult.start;
    Token start = actualConnectionValueResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionValueResult.getStop());
    assertEquals(1, actualConnectionValueResult.getChildCount());
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
    assertSame(actualConnectionValueResult, getResult.getParent());
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing BRACE_OPEN>',<2>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(2, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing BRACE_OPEN>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testConnectionValueContent() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.ConnectionValueContentContext actualConnectionValueContentResult = connectionParserGrammar
        .connectionValueContent();

    // Assert
    assertEquals(-1, actualConnectionValueContentResult.invokingState);
    assertNull(actualConnectionValueContentResult.getParent());
    Token expectedStart = actualConnectionValueContentResult.start;
    Token start = actualConnectionValueContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionValueContentResult.getStop());
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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testConnectionValueContent2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.ConnectionValueContentContext actualConnectionValueContentResult = connectionParserGrammar
        .connectionValueContent();

    // Assert
    RecognitionException recognitionException = actualConnectionValueContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionValueContentResult.children.size());
    assertNull(actualConnectionValueContentResult.getParent());
    Token expectedStart = actualConnectionValueContentResult.stop;
    Token start = actualConnectionValueContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionValueContentResult.getStop());
    assertEquals("null", actualConnectionValueContentResult.getText());
    assertEquals(1, actualConnectionValueContentResult.getChildCount());
    assertTrue(actualConnectionValueContentResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(70, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualConnectionValueContentResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testConnectionValueContent3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.ConnectionValueContentContext actualConnectionValueContentResult = connectionParserGrammar
        .connectionValueContent();

    // Assert
    RecognitionException recognitionException = actualConnectionValueContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionValueContentResult.children.size());
    assertNull(actualConnectionValueContentResult.getParent());
    Token expectedStart = actualConnectionValueContentResult.stop;
    Token start = actualConnectionValueContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionValueContentResult.getStop());
    assertEquals("Input", actualConnectionValueContentResult.getText());
    assertEquals(1, actualConnectionValueContentResult.getChildCount());
    assertTrue(actualConnectionValueContentResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(70, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualConnectionValueContentResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testConnectionValueContent4() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.ConnectionValueContentContext actualConnectionValueContentResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).connectionValueContent();

    // Assert
    assertEquals(-1, actualConnectionValueContentResult.invokingState);
    assertNull(actualConnectionValueContentResult.getParent());
    Token expectedStart = actualConnectionValueContentResult.start;
    Token start = actualConnectionValueContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionValueContentResult.getStop());
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
  public void testConnectionValueContent5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionValueContentContext actualConnectionValueContentResult = connectionParserGrammar
        .connectionValueContent();

    // Assert
    RecognitionException recognitionException = actualConnectionValueContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualConnectionValueContentResult.children.size());
    assertNull(actualConnectionValueContentResult.getParent());
    Token expectedStart = actualConnectionValueContentResult.stop;
    Token start = actualConnectionValueContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualConnectionValueContentResult.getStop());
    assertEquals("Input", actualConnectionValueContentResult.getText());
    assertEquals(1, actualConnectionValueContentResult.getChildCount());
    assertTrue(actualConnectionValueContentResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(70, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualConnectionValueContentResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testConnectionValueContent6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionValueContentContext actualConnectionValueContentResult = connectionParserGrammar
        .connectionValueContent();

    // Assert
    assertEquals(-1, actualConnectionValueContentResult.invokingState);
    assertNull(actualConnectionValueContentResult.getParent());
    Token expectedStart = actualConnectionValueContentResult.start;
    Token start = actualConnectionValueContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualConnectionValueContentResult.getStop());
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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testConnectionValueContentContextAccept() {
    // Arrange
    ConnectionParserGrammar.ConnectionValueContentContext connectionValueContentContext = new ConnectionParserGrammar.ConnectionValueContentContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(connectionValueContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionValueContentContextAccept2() {
    // Arrange
    ConnectionParserGrammar.ConnectionValueContentContext connectionValueContentContext = new ConnectionParserGrammar.ConnectionValueContentContext(
        new ParserRuleContext(), 1);
    connectionValueContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionValueContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionValueContentContextAccept3() {
    // Arrange
    ConnectionParserGrammar.ConnectionValueContentContext connectionValueContentContext = new ConnectionParserGrammar.ConnectionValueContentContext(
        new ParserRuleContext(), 1);
    connectionValueContentContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionValueContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionValueContentContextCONNECTION_ISLAND_BRACE_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1))
        .CONNECTION_ISLAND_BRACE_CLOSE());
  }

  @Test
  public void testConnectionValueContentContextCONNECTION_ISLAND_BRACE_OPEN() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1))
        .CONNECTION_ISLAND_BRACE_OPEN());
  }

  @Test
  public void testConnectionValueContentContextCONNECTION_ISLAND_CONTENT() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1))
        .CONNECTION_ISLAND_CONTENT());
  }

  @Test
  public void testConnectionValueContentContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(8,
        (new ConnectionParserGrammar.ConnectionValueContentContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testConnectionValueContextAccept() {
    // Arrange
    ConnectionParserGrammar.ConnectionValueContext connectionValueContext = new ConnectionParserGrammar.ConnectionValueContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(connectionValueContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionValueContextAccept2() {
    // Arrange
    ConnectionParserGrammar.ConnectionValueContext connectionValueContext = new ConnectionParserGrammar.ConnectionValueContext(
        new ParserRuleContext(), 1);
    connectionValueContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionValueContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionValueContextAccept3() {
    // Arrange
    ConnectionParserGrammar.ConnectionValueContext connectionValueContext = new ConnectionParserGrammar.ConnectionValueContext(
        new ParserRuleContext(), 1);
    connectionValueContext
        .<ParseTree>addAnyChild(new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(connectionValueContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionValueContextBRACE_OPEN() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1)).BRACE_OPEN());
  }

  @Test
  public void testConnectionValueContextConnectionValueContent() {
    // Arrange, Act and Assert
    assertTrue((new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1)).connectionValueContent()
        .isEmpty());
    assertNull(
        (new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1)).connectionValueContent(1));
  }

  @Test
  public void testConnectionValueContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(7, (new ConnectionParserGrammar.ConnectionValueContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testConnections() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    ConnectionParserGrammar.ConnectionsContext actualConnectionsResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).connections();

    // Assert
    assertEquals(-1, actualConnectionsResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.start;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualConnectionsResult.getChildCount());
    assertNull(actualConnectionsResult.getStop());
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
    ParseTree getResult = parseTreeList.get(0);
    assertEquals(49, ((ConnectionParserGrammar.ConnectionContext) getResult).invokingState);
    List<ParseTree> parseTreeList1 = ((ConnectionParserGrammar.ConnectionContext) getResult).children;
    assertEquals(3, parseTreeList1.size());
    assertEquals("([49] ([57 49] [61 57 49]) [58 49] ([59 49] <missing BRACE_OPEN>))", getResult.toStringTree());
    assertEquals(1, tokenSource.getLine());
    assertEquals(3, getResult.getChildCount());
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionContext) getResult).getStop());
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList1.get(0)).invokingState);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList1.get(2)).invokingState);
    assertTrue(((ConnectionParserGrammar.QualifiedNameContext) parseTreeList1
        .get(1)).exception instanceof org.antlr.v4.runtime.NoViableAltException);
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) parseTreeList1.get(1)).invokingState);
  }

  @Test
  public void testConnections2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    // Act
    ConnectionParserGrammar.ConnectionsContext actualConnectionsResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).connections();

    // Assert
    assertEquals(-1, actualConnectionsResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("nullnullnull", actualConnectionsResult.getText());
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.start;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualConnectionsResult.getChildCount());
    Token expectedStop = actualConnectionsResult.stop;
    Token stop = actualConnectionsResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals(0, start.getTokenIndex());
    assertEquals(2, stop.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals(49, ((ConnectionParserGrammar.ConnectionContext) getResult).invokingState);
    assertSame(start, ((ConnectionParserGrammar.ConnectionContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionContext) getResult).depth());
    assertSame(stop, ((ConnectionParserGrammar.ConnectionContext) getResult).getStop());
    assertEquals(3, getResult.getChildCount());
  }

  @Test
  public void testConnections3() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.ConnectionsContext actualConnectionsResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).connections();

    // Assert
    assertEquals(-1, actualConnectionsResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.start;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualConnectionsResult.getChildCount());
    assertNull(actualConnectionsResult.getStop());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals(49, ((ConnectionParserGrammar.ConnectionContext) getResult).invokingState);
    assertEquals("([49] ([57 49] [61 57 49]) [58 49] ([59 49] <missing BRACE_OPEN>))", getResult.toStringTree());
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionContext) getResult).getStop());
    assertEquals(3, getResult.getChildCount());
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
  }

  @Test
  public void testConnections4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    connectionParserGrammar.setTokenStream(new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.ConnectionsContext actualConnectionsResult = connectionParserGrammar.connections();

    // Assert
    assertEquals(-1, actualConnectionsResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.start;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualConnectionsResult.getChildCount());
    assertNull(actualConnectionsResult.getStop());
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
    ParseTree getResult = parseTreeList.get(0);
    assertEquals(49, ((ConnectionParserGrammar.ConnectionContext) getResult).invokingState);
    List<ParseTree> parseTreeList1 = ((ConnectionParserGrammar.ConnectionContext) getResult).children;
    assertEquals(3, parseTreeList1.size());
    assertEquals("([49] ([57 49] [61 57 49]) [58 49] ([59 49] <missing BRACE_OPEN>))", getResult.toStringTree());
    assertEquals(1, tokenSource.getLine());
    assertEquals(3, getResult.getChildCount());
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionContext) getResult).getStop());
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList1.get(0)).invokingState);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList1.get(2)).invokingState);
    assertTrue(((ConnectionParserGrammar.QualifiedNameContext) parseTreeList1
        .get(1)).exception instanceof org.antlr.v4.runtime.NoViableAltException);
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) parseTreeList1.get(1)).invokingState);
  }

  @Test
  public void testConnections5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    connectionParserGrammar.setTokenStream(new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.ConnectionsContext actualConnectionsResult = connectionParserGrammar.connections();

    // Assert
    assertEquals(-1, actualConnectionsResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.start;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualConnectionsResult.getChildCount());
    assertNull(actualConnectionsResult.getStop());
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
    ParseTree getResult = parseTreeList.get(0);
    assertEquals(49, ((ConnectionParserGrammar.ConnectionContext) getResult).invokingState);
    List<ParseTree> parseTreeList1 = ((ConnectionParserGrammar.ConnectionContext) getResult).children;
    assertEquals(3, parseTreeList1.size());
    assertEquals("([49] ([57 49] [61 57 49]) [58 49] ([59 49] <missing BRACE_OPEN>))", getResult.toStringTree());
    assertEquals(1, tokenSource.getLine());
    assertEquals(3, getResult.getChildCount());
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionContext) getResult).getStop());
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList1.get(0)).invokingState);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList1.get(2)).invokingState);
    assertTrue(((ConnectionParserGrammar.QualifiedNameContext) parseTreeList1
        .get(1)).exception instanceof org.antlr.v4.runtime.NoViableAltException);
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) parseTreeList1.get(1)).invokingState);
  }

  @Test
  public void testConnections6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionsContext actualConnectionsResult = connectionParserGrammar.connections();

    // Assert
    assertEquals(-1, actualConnectionsResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionsResult.getParent());
    Token token = actualConnectionsResult.stop;
    assertSame(token, actualConnectionsResult.getStart());
    assertEquals(1, actualConnectionsResult.getChildCount());
    Token stop = actualConnectionsResult.getStop();
    assertSame(token, stop);
    assertEquals(0, stop.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("<EOF><missing BRACE_OPEN>", getResult.getText());
    assertSame(stop, ((ConnectionParserGrammar.ConnectionContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionContext) getResult).depth());
    assertFalse(((ConnectionParserGrammar.ConnectionContext) getResult).isEmpty());
    assertSame(stop, ((ConnectionParserGrammar.ConnectionContext) getResult).getStop());
    assertEquals(3, getResult.getChildCount());
    assertEquals("([49] ([57 49] ([61 57 49] <EOF>)) [58 49] ([59 49] <missing BRACE_OPEN>))",
        getResult.toStringTree());
  }

  @Test
  public void testConnections7() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>(), "Source Name");

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionsContext actualConnectionsResult = connectionParserGrammar.connections();

    // Assert
    assertEquals(-1, actualConnectionsResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.start;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualConnectionsResult.getChildCount());
    assertNull(actualConnectionsResult.getStop());
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
    ParseTree getResult = parseTreeList.get(0);
    assertEquals(49, ((ConnectionParserGrammar.ConnectionContext) getResult).invokingState);
    List<ParseTree> parseTreeList1 = ((ConnectionParserGrammar.ConnectionContext) getResult).children;
    assertEquals(3, parseTreeList1.size());
    assertEquals("([49] ([57 49] [61 57 49]) [58 49] ([59 49] <missing BRACE_OPEN>))", getResult.toStringTree());
    assertEquals(1, tokenSource.getLine());
    assertEquals(3, getResult.getChildCount());
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionContext) getResult).getStop());
    assertEquals(57, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList1.get(0)).invokingState);
    assertEquals(59, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList1.get(2)).invokingState);
    assertTrue(((ConnectionParserGrammar.QualifiedNameContext) parseTreeList1
        .get(1)).exception instanceof org.antlr.v4.runtime.NoViableAltException);
    assertEquals(58, ((ConnectionParserGrammar.QualifiedNameContext) parseTreeList1.get(1)).invokingState);
  }

  @Test
  public void testConnections8() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ConnectionsContext actualConnectionsResult = connectionParserGrammar.connections();

    // Assert
    assertEquals(-1, actualConnectionsResult.invokingState);
    List<ParseTree> parseTreeList = actualConnectionsResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("nullnullnull", actualConnectionsResult.getText());
    assertNull(actualConnectionsResult.getParent());
    Token expectedStart = actualConnectionsResult.start;
    Token start = actualConnectionsResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualConnectionsResult.getChildCount());
    Token expectedStop = actualConnectionsResult.stop;
    Token stop = actualConnectionsResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals(0, start.getTokenIndex());
    assertEquals(2, stop.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals(49, ((ConnectionParserGrammar.ConnectionContext) getResult).invokingState);
    assertSame(start, ((ConnectionParserGrammar.ConnectionContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionContext) getResult).depth());
    assertSame(stop, ((ConnectionParserGrammar.ConnectionContext) getResult).getStop());
    assertEquals(3, getResult.getChildCount());
  }

  @Test
  public void testConnectionsContextAccept() {
    // Arrange
    ConnectionParserGrammar.ConnectionsContext connectionsContext = new ConnectionParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(connectionsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionsContextAccept2() {
    // Arrange
    ConnectionParserGrammar.ConnectionsContext connectionsContext = new ConnectionParserGrammar.ConnectionsContext(
        new ParserRuleContext(), 1);
    connectionsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(connectionsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testConnectionsContextCOMMA() {
    // Arrange, Act and Assert
    assertTrue((new ConnectionParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).COMMA().isEmpty());
    assertNull((new ConnectionParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testConnectionsContextConnection() {
    // Arrange, Act and Assert
    assertTrue((new ConnectionParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).connection().isEmpty());
    assertNull((new ConnectionParserGrammar.ConnectionsContext(new ParserRuleContext(), 1)).connection(1));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    ConnectionParserGrammar actualConnectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(new ArrayList<Token>())));

    // Assert
    assertNull(actualConnectionParserGrammar.getParseInfo());
    assertEquals(0, actualConnectionParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualConnectionParserGrammar.isMatchedEOF());
    assertNull(actualConnectionParserGrammar.getContext());
    assertTrue(actualConnectionParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualConnectionParserGrammar.getPrecedence());
    assertEquals("List", actualConnectionParserGrammar.getSourceName());
    assertFalse(actualConnectionParserGrammar.isTrace());
    assertTrue(actualConnectionParserGrammar.getBuildParseTree());
    assertEquals(-1, actualConnectionParserGrammar.getState());
    assertTrue(
        actualConnectionParserGrammar.getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualConnectionParserGrammar.getInterpreter();
    assertEquals(7, interpreter.decisionToDFA.length);
    assertSame(actualConnectionParserGrammar, interpreter.getParser());
    assertSame(actualConnectionParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualConnectionParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testDefinition() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    ConnectionParserGrammar.DefinitionContext actualDefinitionResult = (new ConnectionParserGrammar(
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
    assertEquals(2, ((ConnectionParserGrammar.ImportsContext) parseTreeList.get(0)).depth());
    assertEquals(28, ((ConnectionParserGrammar.ImportsContext) parseTreeList.get(0)).invokingState);
    assertNull(((ConnectionParserGrammar.ImportsContext) parseTreeList.get(0)).getStop());
    assertSame(start, ((ConnectionParserGrammar.ImportsContext) parseTreeList.get(0)).getStart());
  }

  @Test
  public void testDefinition2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    Pair<TokenSource, CharStream> pair = new Pair<TokenSource, CharStream>(a, new ANTLRInputStream());
    tokenList.add(new CommonToken(pair, 1, 1, 1, 1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    ConnectionParserGrammar.DefinitionContext actualDefinitionResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(3, parseTreeList.size());
    assertEquals("([] [28] ([29] ([57 29] ([61 57 29] <EOF>)) [58 29] ([59 29] <missing BRACE_OPEN>)) EOF)",
        actualDefinitionResult.toStringTree());
    assertEquals(3, actualDefinitionResult.getChildCount());
    assertEquals(1, actualDefinitionResult.depth());
    assertEquals("<EOF><missing BRACE_OPEN>EOF", actualDefinitionResult.getText());
    Token expectedStart = actualDefinitionResult.start;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualDefinitionResult.stop;
    Token stop = actualDefinitionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals(1, stop.getLine());
    assertEquals(1, stop.getTokenIndex());
    assertEquals("EOF", stop.getText());
    CharStream expectedInputStream = pair.b;
    assertSame(expectedInputStream, stop.getInputStream());
    assertEquals(1, stop.getCharPositionInLine());
    assertEquals(2, stop.getStartIndex());
    assertEquals(1, stop.getStopIndex());
    assertEquals(-1, stop.getType());
    assertEquals(0, stop.getChannel());
    assertSame(listTokenSource, stop.getTokenSource());
    assertEquals(0, start.getTokenIndex());
    assertEquals(29, ((ConnectionParserGrammar.ConnectionContext) parseTreeList.get(1)).invokingState);
    assertEquals(28, ((ConnectionParserGrammar.ImportsContext) parseTreeList.get(0)).invokingState);
    ParseTree getResult = parseTreeList.get(2);
    assertEquals("<EOF>", getResult.toString());
    assertSame(actualDefinitionResult, getResult.getParent());
  }

  @Test
  public void testDefinition3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    CommonToken commonToken = new CommonToken(1);
    tokenList.add(commonToken);
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    Pair<TokenSource, CharStream> pair = new Pair<TokenSource, CharStream>(a, new ANTLRInputStream());
    tokenList.add(new CommonToken(pair, 1, 1, 1, 1));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    ConnectionParserGrammar.DefinitionContext actualDefinitionResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(4, parseTreeList.size());
    assertEquals(4, actualDefinitionResult.getChildCount());
    assertEquals(1, actualDefinitionResult.depth());
    Token expectedStart = actualDefinitionResult.start;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    assertEquals("nullnull<missing BRACE_OPEN><EOF><missing BRACE_OPEN>EOF", actualDefinitionResult.getText());
    Token expectedStop = actualDefinitionResult.stop;
    Token stop = actualDefinitionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals(1, stop.getLine());
    assertEquals(3, stop.getTokenIndex());
    assertEquals("EOF", stop.getText());
    CharStream expectedInputStream = pair.b;
    assertSame(expectedInputStream, stop.getInputStream());
    assertEquals(1, stop.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals(-1, stop.getType());
    assertEquals(0, stop.getChannel());
    assertSame(listTokenSource, stop.getTokenSource());
    assertEquals(1, stop.getStopIndex());
    assertEquals(2, stop.getStartIndex());
    assertEquals(29, ((ConnectionParserGrammar.ConnectionContext) parseTreeList.get(2)).invokingState);
    ParseTree getResult = parseTreeList.get(1);
    assertEquals(3, getResult.getChildCount());
    assertEquals("[29]", getResult.toString());
    assertEquals(29, ((ConnectionParserGrammar.ConnectionContext) getResult).invokingState);
    assertEquals(28, ((ConnectionParserGrammar.ImportsContext) parseTreeList.get(0)).invokingState);
    assertSame(commonToken, ((ConnectionParserGrammar.ConnectionContext) getResult).getStop());
  }

  @Test
  public void testDefinitionContextAccept() {
    // Arrange
    ConnectionParserGrammar.DefinitionContext definitionContext = new ConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextAccept2() {
    // Arrange
    ConnectionParserGrammar.DefinitionContext definitionContext = new ConnectionParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextConnection() {
    // Arrange, Act and Assert
    assertTrue((new ConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).connection().isEmpty());
    assertNull((new ConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).connection(1));
  }

  @Test
  public void testDefinitionContextEOF() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testDefinitionContextImports() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).imports());
  }

  @Test
  public void testEmbeddedRuntimeConnection() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext actualEmbeddedRuntimeConnectionResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource))).embeddedRuntimeConnection();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedRuntimeConnectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertEquals("([] ([72] [61 72]) ([73] <missing BRACE_OPEN>))",
        actualEmbeddedRuntimeConnectionResult.toStringTree());
    assertNull(actualEmbeddedRuntimeConnectionResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeConnectionResult.start;
    Token start = actualEmbeddedRuntimeConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeConnectionResult.getStop());
    assertEquals(2, actualEmbeddedRuntimeConnectionResult.getChildCount());
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
    assertEquals(73, ((ConnectionParserGrammar.ConnectionValueContext) getResult).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionValueContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals(1, tokenSource.getLine());
    ParseTree getResult1 = parseTreeList.get(0);
    assertEquals(72, ((ConnectionParserGrammar.ConnectionTypeContext) getResult1).invokingState);
    assertEquals("[72]", getResult1.toString());
    assertEquals(1, getResult1.getChildCount());
  }

  @Test
  public void testEmbeddedRuntimeConnection2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    // Act
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext actualEmbeddedRuntimeConnectionResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).embeddedRuntimeConnection();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedRuntimeConnectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualEmbeddedRuntimeConnectionResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeConnectionResult.start;
    Token start = actualEmbeddedRuntimeConnectionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualEmbeddedRuntimeConnectionResult.stop;
    Token stop = actualEmbeddedRuntimeConnectionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualEmbeddedRuntimeConnectionResult.getText());
    assertEquals(2, actualEmbeddedRuntimeConnectionResult.getChildCount());
    assertEquals(1, stop.getTokenIndex());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).depth());
    assertFalse(((ConnectionParserGrammar.ConnectionTypeContext) getResult).isEmpty());
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertTrue(((ConnectionParserGrammar.ConnectionValueContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(73, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testEmbeddedRuntimeConnection3() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext actualEmbeddedRuntimeConnectionResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).embeddedRuntimeConnection();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedRuntimeConnectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertEquals("([] ([72] [61 72]) ([73] <missing BRACE_OPEN>))",
        actualEmbeddedRuntimeConnectionResult.toStringTree());
    assertNull(actualEmbeddedRuntimeConnectionResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeConnectionResult.start;
    Token start = actualEmbeddedRuntimeConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeConnectionResult.getStop());
    assertEquals("<missing BRACE_OPEN>", actualEmbeddedRuntimeConnectionResult.getText());
    assertEquals(2, actualEmbeddedRuntimeConnectionResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource()).getChannel());
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((ConnectionLexerGrammar) start.getTokenSource())._hitEOF);
    assertNull(((ConnectionLexerGrammar) start.getTokenSource())._text);
    assertEquals(73, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList.get(1)).invokingState);
    assertEquals(72, ((ConnectionParserGrammar.ConnectionTypeContext) parseTreeList.get(0)).invokingState);
    assertEquals(0, ((ConnectionLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testEmbeddedRuntimeConnection4() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(commonToken);

    // Act
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext actualEmbeddedRuntimeConnectionResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)))).embeddedRuntimeConnection();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedRuntimeConnectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualEmbeddedRuntimeConnectionResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeConnectionResult.start;
    Token start = actualEmbeddedRuntimeConnectionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualEmbeddedRuntimeConnectionResult.stop;
    Token stop = actualEmbeddedRuntimeConnectionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualEmbeddedRuntimeConnectionResult.getText());
    assertEquals(2, actualEmbeddedRuntimeConnectionResult.getChildCount());
    assertEquals(1, stop.getTokenIndex());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).depth());
    assertFalse(((ConnectionParserGrammar.ConnectionTypeContext) getResult).isEmpty());
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertTrue(((ConnectionParserGrammar.ConnectionValueContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(73, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testEmbeddedRuntimeConnection5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext actualEmbeddedRuntimeConnectionResult = connectionParserGrammar
        .embeddedRuntimeConnection();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedRuntimeConnectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualEmbeddedRuntimeConnectionResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeConnectionResult.start;
    Token start = actualEmbeddedRuntimeConnectionResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualEmbeddedRuntimeConnectionResult.stop;
    Token stop = actualEmbeddedRuntimeConnectionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualEmbeddedRuntimeConnectionResult.getText());
    assertEquals(2, actualEmbeddedRuntimeConnectionResult.getChildCount());
    assertEquals(1, stop.getTokenIndex());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("null", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).depth());
    assertFalse(((ConnectionParserGrammar.ConnectionTypeContext) getResult).isEmpty());
    assertSame(start, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertTrue(((ConnectionParserGrammar.ConnectionValueContext) parseTreeList
        .get(1)).exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(73, ((ConnectionParserGrammar.ConnectionValueContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testEmbeddedRuntimeConnection6() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    ListTokenSource a = new ListTokenSource(new ArrayList<Token>());
    tokenList.add(new CommonToken(new Pair<TokenSource, CharStream>(a, new ANTLRInputStream()), 1, 1, 1, 1));

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext actualEmbeddedRuntimeConnectionResult = connectionParserGrammar
        .embeddedRuntimeConnection();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedRuntimeConnectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertEquals("([] ([72] ([61 72] <EOF>)) ([73] <missing BRACE_OPEN>))",
        actualEmbeddedRuntimeConnectionResult.toStringTree());
    assertNull(actualEmbeddedRuntimeConnectionResult.getParent());
    Token token = actualEmbeddedRuntimeConnectionResult.stop;
    Token start = actualEmbeddedRuntimeConnectionResult.getStart();
    assertSame(token, start);
    assertSame(token, actualEmbeddedRuntimeConnectionResult.getStop());
    assertEquals("<EOF><missing BRACE_OPEN>", actualEmbeddedRuntimeConnectionResult.getText());
    assertEquals(2, actualEmbeddedRuntimeConnectionResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertEquals("[72]", getResult.toString());
    ParseTree getResult1 = parseTreeList.get(1);
    assertEquals(73, ((ConnectionParserGrammar.ConnectionValueContext) getResult1).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult1.getText());
    assertTrue(((ConnectionParserGrammar.ConnectionValueContext) getResult1).getStart() instanceof CommonToken);
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult1).depth());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult1).getStop());
    assertEquals(1, getResult1.getChildCount());
    assertEquals(1, getResult.getChildCount());
    assertEquals(72, ((ConnectionParserGrammar.ConnectionTypeContext) getResult).invokingState);
    Interval expectedSourceInterval = actualEmbeddedRuntimeConnectionResult.getSourceInterval();
    assertSame(expectedSourceInterval, getResult.getSourceInterval());
  }

  @Test
  public void testEmbeddedRuntimeConnection7() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>(), "Source Name");

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext actualEmbeddedRuntimeConnectionResult = connectionParserGrammar
        .embeddedRuntimeConnection();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedRuntimeConnectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertEquals("([] ([72] [61 72]) ([73] <missing BRACE_OPEN>))",
        actualEmbeddedRuntimeConnectionResult.toStringTree());
    assertNull(actualEmbeddedRuntimeConnectionResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeConnectionResult.start;
    Token start = actualEmbeddedRuntimeConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeConnectionResult.getStop());
    assertEquals(2, actualEmbeddedRuntimeConnectionResult.getChildCount());
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
    assertEquals(73, ((ConnectionParserGrammar.ConnectionValueContext) getResult).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionValueContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals(1, tokenSource.getLine());
    ParseTree getResult1 = parseTreeList.get(0);
    assertEquals(72, ((ConnectionParserGrammar.ConnectionTypeContext) getResult1).invokingState);
    assertEquals("[72]", getResult1.toString());
    assertEquals(1, getResult1.getChildCount());
  }

  @Test
  public void testEmbeddedRuntimeConnection8() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    connectionParserGrammar.setTokenStream(new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext actualEmbeddedRuntimeConnectionResult = connectionParserGrammar
        .embeddedRuntimeConnection();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedRuntimeConnectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertEquals("([] ([72] [61 72]) ([73] <missing BRACE_OPEN>))",
        actualEmbeddedRuntimeConnectionResult.toStringTree());
    assertNull(actualEmbeddedRuntimeConnectionResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeConnectionResult.start;
    Token start = actualEmbeddedRuntimeConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeConnectionResult.getStop());
    assertEquals(2, actualEmbeddedRuntimeConnectionResult.getChildCount());
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
    assertEquals(73, ((ConnectionParserGrammar.ConnectionValueContext) getResult).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionValueContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals(1, tokenSource.getLine());
    ParseTree getResult1 = parseTreeList.get(0);
    assertEquals(72, ((ConnectionParserGrammar.ConnectionTypeContext) getResult1).invokingState);
    assertEquals("[72]", getResult1.toString());
    assertEquals(1, getResult1.getChildCount());
  }

  @Test
  public void testEmbeddedRuntimeConnection9() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    connectionParserGrammar.setTokenStream(new BufferedTokenStream(listTokenSource1));

    // Act
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext actualEmbeddedRuntimeConnectionResult = connectionParserGrammar
        .embeddedRuntimeConnection();

    // Assert
    assertEquals(-1, actualEmbeddedRuntimeConnectionResult.invokingState);
    List<ParseTree> parseTreeList = actualEmbeddedRuntimeConnectionResult.children;
    assertEquals(2, parseTreeList.size());
    assertEquals("([] ([72] [61 72]) ([73] <missing BRACE_OPEN>))",
        actualEmbeddedRuntimeConnectionResult.toStringTree());
    assertNull(actualEmbeddedRuntimeConnectionResult.getParent());
    Token expectedStart = actualEmbeddedRuntimeConnectionResult.start;
    Token start = actualEmbeddedRuntimeConnectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualEmbeddedRuntimeConnectionResult.getStop());
    assertEquals(2, actualEmbeddedRuntimeConnectionResult.getChildCount());
    assertEquals(-1, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(listTokenSource1, tokenSource);
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("EOF", start.getText());
    assertEquals(0, start.getTokenIndex());
    assertNull(start.getInputStream());
    ParseTree getResult = parseTreeList.get(1);
    assertEquals(73, ((ConnectionParserGrammar.ConnectionValueContext) getResult).invokingState);
    assertEquals("<missing BRACE_OPEN>", getResult.getText());
    assertSame(start, ((ConnectionParserGrammar.ConnectionValueContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.ConnectionValueContext) getResult).depth());
    assertNull(((ConnectionParserGrammar.ConnectionValueContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    assertEquals(1, tokenSource.getLine());
    ParseTree getResult1 = parseTreeList.get(0);
    assertEquals(72, ((ConnectionParserGrammar.ConnectionTypeContext) getResult1).invokingState);
    assertEquals("[72]", getResult1.toString());
    assertEquals(1, getResult1.getChildCount());
  }

  @Test
  public void testEmbeddedRuntimeConnectionContextAccept() {
    // Arrange
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext embeddedRuntimeConnectionContext = new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(embeddedRuntimeConnectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEmbeddedRuntimeConnectionContextAccept2() {
    // Arrange
    ConnectionParserGrammar.EmbeddedRuntimeConnectionContext embeddedRuntimeConnectionContext = new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(
        new ParserRuleContext(), 1);
    embeddedRuntimeConnectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(embeddedRuntimeConnectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testEmbeddedRuntimeConnectionContextConnectionType() {
    // Arrange, Act and Assert
    assertNull(
        (new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(new ParserRuleContext(), 1)).connectionType());
  }

  @Test
  public void testEmbeddedRuntimeConnectionContextConnectionValue() {
    // Arrange, Act and Assert
    assertNull(
        (new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(new ParserRuleContext(), 1)).connectionValue());
  }

  @Test
  public void testEmbeddedRuntimeConnectionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(9,
        (new ConnectionParserGrammar.EmbeddedRuntimeConnectionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testIdentifier() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.IdentifierContext actualIdentifierResult = connectionParserGrammar.identifier();

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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testIdentifier2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    ConnectionParserGrammar.IdentifierContext actualIdentifierResult = connectionParserGrammar.identifier();

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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testIdentifier3() throws RecognitionException {
    // Arrange
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));

    // Act
    ConnectionParserGrammar.IdentifierContext actualIdentifierResult = connectionParserGrammar.identifier();

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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testIdentifier4() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.IdentifierContext actualIdentifierResult = (new ConnectionParserGrammar(
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
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.IdentifierContext actualIdentifierResult = connectionParserGrammar.identifier();

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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testIdentifierContextAccept() {
    // Arrange
    ConnectionParserGrammar.IdentifierContext identifierContext = new ConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextAccept2() {
    // Arrange
    ConnectionParserGrammar.IdentifierContext identifierContext = new ConnectionParserGrammar.IdentifierContext(
        new ParserRuleContext(), 1);
    identifierContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(identifierContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testIdentifierContextIMPORT() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).IMPORT());
  }

  @Test
  public void testIdentifierContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testIdentifierContextVALID_STRING() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.IdentifierContext(new ParserRuleContext(), 1)).VALID_STRING());
  }

  @Test
  public void testImportStatement() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.ImportStatementContext actualImportStatementResult = connectionParserGrammar
        .importStatement();

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
    assertEquals(43, recognitionException.getOffendingState());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
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
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.ImportStatementContext actualImportStatementResult = connectionParserGrammar
        .importStatement();

    // Assert
    RecognitionException recognitionException = actualImportStatementResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualImportStatementResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualImportStatementResult.getParent());
    Token token = actualImportStatementResult.stop;
    assertSame(token, actualImportStatementResult.getStart());
    Token stop = actualImportStatementResult.getStop();
    assertSame(token, stop);
    assertEquals("null", actualImportStatementResult.getText());
    assertEquals(2, actualImportStatementResult.getChildCount());
    assertTrue(actualImportStatementResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertEquals(45, recognitionException.getOffendingState());
    assertSame(actualImportStatementResult, recognitionException.getCtx());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, stop.getTokenIndex());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    ParseTree getResult = parseTreeList.get(0);
    assertSame(actualImportStatementResult, getResult.getParent());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(44, ((ConnectionParserGrammar.PackagePathContext) parseTreeList.get(1)).invokingState);
    assertNull(getResult.getText());
  }

  @Test
  public void testImportStatement3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.ImportStatementContext actualImportStatementResult = connectionParserGrammar
        .importStatement();

    // Assert
    RecognitionException recognitionException = actualImportStatementResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(2, actualImportStatementResult.children.size());
    assertNull(actualImportStatementResult.getParent());
    Token expectedStart = actualImportStatementResult.start;
    Token start = actualImportStatementResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualImportStatementResult.stop;
    Token stop = actualImportStatementResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualImportStatementResult.getText());
    assertEquals(2, actualImportStatementResult.getChildCount());
    assertTrue(actualImportStatementResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(87, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(1, stop.getTokenIndex());
    RuleContext ctx = recognitionException.getCtx();
    assertTrue(ctx instanceof ConnectionParserGrammar.PackagePathContext);
    assertEquals(44, ((ConnectionParserGrammar.PackagePathContext) ctx).invokingState);
  }

  @Test
  public void testImportStatement4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(0));
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.ImportStatementContext actualImportStatementResult = connectionParserGrammar
        .importStatement();

    // Assert
    RecognitionException recognitionException = actualImportStatementResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualImportStatementResult.children;
    assertEquals(3, parseTreeList.size());
    assertNull(actualImportStatementResult.getParent());
    Token expectedStart = actualImportStatementResult.start;
    Token start = actualImportStatementResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualImportStatementResult.stop;
    Token stop = actualImportStatementResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualImportStatementResult.getText());
    assertEquals(3, actualImportStatementResult.getChildCount());
    assertTrue(actualImportStatementResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(45, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualImportStatementResult, recognitionException.getCtx());
    assertEquals(44, ((ConnectionParserGrammar.PackagePathContext) parseTreeList.get(2)).invokingState);
  }

  @Test
  public void testImportStatement5() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(0));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.ImportStatementContext actualImportStatementResult = connectionParserGrammar
        .importStatement();

    // Assert
    RecognitionException recognitionException = actualImportStatementResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    List<ParseTree> parseTreeList = actualImportStatementResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualImportStatementResult.getParent());
    Token expectedStart = actualImportStatementResult.start;
    Token start = actualImportStatementResult.getStart();
    assertSame(expectedStart, start);
    Token expectedStop = actualImportStatementResult.stop;
    Token stop = actualImportStatementResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullnull", actualImportStatementResult.getText());
    assertEquals(2, actualImportStatementResult.getChildCount());
    assertTrue(actualImportStatementResult.isEmpty());
    assertEquals(0, start.getTokenIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
    assertEquals(45, recognitionException.getOffendingState());
    assertTrue(recognitionException.getOffendingToken() instanceof CommonToken);
    assertEquals(1, stop.getTokenIndex());
    assertSame(actualImportStatementResult, recognitionException.getCtx());
    assertEquals(44, ((ConnectionParserGrammar.PackagePathContext) parseTreeList.get(1)).invokingState);
  }

  @Test
  public void testImportStatementContextAccept() {
    // Arrange
    ConnectionParserGrammar.ImportStatementContext importStatementContext = new ConnectionParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(importStatementContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testImportStatementContextAccept2() {
    // Arrange
    ConnectionParserGrammar.ImportStatementContext importStatementContext = new ConnectionParserGrammar.ImportStatementContext(
        new ParserRuleContext(), 1);
    importStatementContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(importStatementContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testImportStatementContextIMPORT() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).IMPORT());
  }

  @Test
  public void testImportStatementContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testImportStatementContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testImportStatementContextSEMI_COLON() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).SEMI_COLON());
  }

  @Test
  public void testImportStatementContextSTAR() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.ImportStatementContext(new ParserRuleContext(), 1)).STAR());
  }

  @Test
  public void testImports() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.ImportsContext actualImportsResult = connectionParserGrammar.imports();

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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testImports2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    ConnectionParserGrammar.ImportsContext actualImportsResult = connectionParserGrammar.imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testImports3() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.ImportsContext actualImportsResult = connectionParserGrammar.imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testImports4() throws RecognitionException {
    // Arrange
    CommonToken commonToken = new CommonToken(1);
    commonToken.setType(0);

    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(commonToken);
    tokenList.add(new CommonToken(1));

    ListTokenSource listTokenSource = new ListTokenSource(tokenList);
    listTokenSource.setTokenFactory(null);
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));

    // Act
    ConnectionParserGrammar.ImportsContext actualImportsResult = connectionParserGrammar.imports();

    // Assert
    assertEquals(-1, actualImportsResult.invokingState);
    assertNull(actualImportsResult.getParent());
    Token expectedStart = actualImportsResult.start;
    Token start = actualImportsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualImportsResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testImports5() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new CommonTokenStream(listTokenSource));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.ImportsContext actualImportsResult = connectionParserGrammar.imports();

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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testImportsContextAccept() {
    // Arrange
    ConnectionParserGrammar.ImportsContext importsContext = new ConnectionParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(importsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testImportsContextAccept2() {
    // Arrange
    ConnectionParserGrammar.ImportsContext importsContext = new ConnectionParserGrammar.ImportsContext(
        new ParserRuleContext(), 1);
    importsContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(importsContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testImportsContextImportStatement() {
    // Arrange, Act and Assert
    assertTrue((new ConnectionParserGrammar.ImportsContext(new ParserRuleContext(), 1)).importStatement().isEmpty());
    assertNull((new ConnectionParserGrammar.ImportsContext(new ParserRuleContext(), 1)).importStatement(1));
  }

  @Test
  public void testPackagePath() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    ConnectionParserGrammar.PackagePathContext actualPackagePathResult = (new ConnectionParserGrammar(
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
    assertSame(start, ((ConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).getStart());
    assertEquals(2, ((ConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).depth());
    assertFalse(((ConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).isEmpty());
    assertNull(((ConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).getStop());
    assertEquals(1, tokenSource.getLine());
  }

  @Test
  public void testPackagePath2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));

    // Act
    ConnectionParserGrammar.PackagePathContext actualPackagePathResult = (new ConnectionParserGrammar(
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
    assertSame(start, ((ConnectionParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((ConnectionParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((ConnectionParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((ConnectionParserGrammar.IdentifierContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertSame(getResult, getResult1.getParent());
    assertNull(getResult1.toString());
  }

  @Test
  public void testPackagePath3() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.PackagePathContext actualPackagePathResult = (new ConnectionParserGrammar(
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
    assertSame(start, ((ConnectionParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((ConnectionParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((ConnectionParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((ConnectionParserGrammar.IdentifierContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertSame(getResult, getResult1.getParent());
    assertEquals("Input", getResult1.toString());
  }

  @Test
  public void testPackagePath4() throws RecognitionException {
    // Arrange and Act
    ConnectionParserGrammar.PackagePathContext actualPackagePathResult = (new ConnectionParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).packagePath();

    // Assert
    assertEquals(-1, actualPackagePathResult.invokingState);
    List<ParseTree> parseTreeList = actualPackagePathResult.children;
    assertEquals(1, parseTreeList.size());
    assertEquals("([] [82])", actualPackagePathResult.toStringTree());
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
    assertEquals(82, ((ConnectionParserGrammar.IdentifierContext) parseTreeList.get(0)).invokingState);
    assertEquals(-1, ((ConnectionLexerGrammar) start.getTokenSource()).getType());
  }

  @Test
  public void testPackagePath5() throws RecognitionException {
    // Arrange
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.PackagePathContext actualPackagePathResult = connectionParserGrammar.packagePath();

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
    assertSame(start, ((ConnectionParserGrammar.IdentifierContext) getResult).getStart());
    assertEquals(2, ((ConnectionParserGrammar.IdentifierContext) getResult).depth());
    assertFalse(((ConnectionParserGrammar.IdentifierContext) getResult).isEmpty());
    assertSame(start, ((ConnectionParserGrammar.IdentifierContext) getResult).getStop());
    assertEquals(1, getResult.getChildCount());
    List<ParseTree> parseTreeList1 = ((ConnectionParserGrammar.IdentifierContext) getResult).children;
    assertEquals(1, parseTreeList1.size());
    ParseTree getResult1 = parseTreeList1.get(0);
    assertSame(getResult, getResult1.getParent());
    assertEquals("Input", getResult1.toString());
  }

  @Test
  public void testPackagePathContextAccept() {
    // Arrange
    ConnectionParserGrammar.PackagePathContext packagePathContext = new ConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextAccept2() {
    // Arrange
    ConnectionParserGrammar.PackagePathContext packagePathContext = new ConnectionParserGrammar.PackagePathContext(
        new ParserRuleContext(), 1);
    packagePathContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(packagePathContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testPackagePathContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(11, (new ConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPackagePathContextIdentifier() {
    // Arrange, Act and Assert
    assertTrue((new ConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier().isEmpty());
    assertNull((new ConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPackagePathContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertTrue((new ConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR().isEmpty());
    assertNull((new ConnectionParserGrammar.PackagePathContext(new ParserRuleContext(), 1)).PATH_SEPARATOR(1));
  }

  @Test
  public void testQualifiedName() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = connectionParserGrammar.qualifiedName();

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
    assertEquals(78, recognitionException.getOffendingState());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
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
    ConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = (new ConnectionParserGrammar(
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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
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
    ConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = (new ConnectionParserGrammar(
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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
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
    ConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = (new ConnectionParserGrammar(
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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
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

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    connectionParserGrammar.setBuildParseTree(true);

    // Act
    ConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = connectionParserGrammar.qualifiedName();

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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
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

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = connectionParserGrammar.qualifiedName();

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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualQualifiedNameResult.identifier();
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

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(commonTokenStream);
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = connectionParserGrammar.qualifiedName();

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
    assertEquals(78, recognitionException.getOffendingState());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
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

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    connectionParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.QualifiedNameContext actualQualifiedNameResult = connectionParserGrammar.qualifiedName();

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
    assertEquals(78, recognitionException.getOffendingState());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
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
    ConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextAccept2() {
    // Arrange
    ConnectionParserGrammar.QualifiedNameContext qualifiedNameContext = new ConnectionParserGrammar.QualifiedNameContext(
        new ParserRuleContext(), 1);
    qualifiedNameContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(qualifiedNameContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testQualifiedNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(10, (new ConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testQualifiedNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testQualifiedNameContextPATH_SEPARATOR() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).PATH_SEPARATOR());
  }

  @Test
  public void testQualifiedNameContextPackagePath() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.QualifiedNameContext(new ParserRuleContext(), 1)).packagePath());
  }

  @Test
  public void testWord() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource);
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.WordContext actualWordResult = connectionParserGrammar.word();

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
    assertEquals(93, recognitionException.getOffendingState());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
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

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    ListTokenSource listTokenSource1 = new ListTokenSource(new ArrayList<Token>());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(listTokenSource1);
    connectionParserGrammar.setTokenStream(bufferedTokenStream);

    // Act
    ConnectionParserGrammar.WordContext actualWordResult = connectionParserGrammar.word();

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
    assertEquals(93, recognitionException.getOffendingState());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
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
    ConnectionParserGrammar.WordContext actualWordResult = (new ConnectionParserGrammar(
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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
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
    tokenList.add(new CommonToken(8));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    ConnectionParserGrammar.WordContext actualWordResult = connectionParserGrammar.word();

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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
  }

  @Test
  public void testWord4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(11));
    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    ConnectionParserGrammar.WordContext actualWordResult = connectionParserGrammar.word();

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
    assertNull(connectionParserGrammar.getRuleContext());
    assertEquals(-1, connectionParserGrammar.getState());
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
    ConnectionParserGrammar.WordContext actualWordResult = (new ConnectionParserGrammar(
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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
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
    ConnectionParserGrammar.WordContext actualWordResult = (new ConnectionParserGrammar(
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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
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

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    connectionParserGrammar.setBuildParseTree(true);

    // Act
    ConnectionParserGrammar.WordContext actualWordResult = connectionParserGrammar.word();

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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
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

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(
        new BufferedTokenStream(listTokenSource));
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.WordContext actualWordResult = connectionParserGrammar.word();

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
    ConnectionParserGrammar.IdentifierContext identifierResult = actualWordResult.identifier();
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

    ConnectionParserGrammar connectionParserGrammar = new ConnectionParserGrammar(commonTokenStream);
    connectionParserGrammar.setTrace(true);

    // Act
    ConnectionParserGrammar.WordContext actualWordResult = connectionParserGrammar.word();

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
    assertEquals(93, recognitionException.getOffendingState());
    assertSame(connectionParserGrammar, recognitionException.getRecognizer());
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
    ConnectionParserGrammar.WordContext wordContext = new ConnectionParserGrammar.WordContext(new ParserRuleContext(),
        1);

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextAccept2() {
    // Arrange
    ConnectionParserGrammar.WordContext wordContext = new ConnectionParserGrammar.WordContext(new ParserRuleContext(),
        1);
    wordContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(wordContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testWordContextBOOLEAN() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)).BOOLEAN());
  }

  @Test
  public void testWordContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(12, (new ConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testWordContextINTEGER() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)).INTEGER());
  }

  @Test
  public void testWordContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new ConnectionParserGrammar.WordContext(new ParserRuleContext(), 1)).identifier());
  }
}

