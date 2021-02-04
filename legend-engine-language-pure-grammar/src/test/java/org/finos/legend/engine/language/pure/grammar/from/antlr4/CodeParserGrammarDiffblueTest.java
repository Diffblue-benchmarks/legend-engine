package org.finos.legend.engine.language.pure.grammar.from.antlr4;

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
import org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.ConnectionLexerGrammar;
import org.junit.Test;

public class CodeParserGrammarDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    CodeParserGrammar actualCodeParserGrammar = new CodeParserGrammar(
        new BufferedTokenStream(new ListTokenSource(new ArrayList<Token>())));

    // Assert
    assertNull(actualCodeParserGrammar.getParseInfo());
    assertEquals(0, actualCodeParserGrammar.getNumberOfSyntaxErrors());
    assertFalse(actualCodeParserGrammar.isMatchedEOF());
    assertNull(actualCodeParserGrammar.getContext());
    assertTrue(actualCodeParserGrammar.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertEquals(0, actualCodeParserGrammar.getPrecedence());
    assertEquals("List", actualCodeParserGrammar.getSourceName());
    assertFalse(actualCodeParserGrammar.isTrace());
    assertTrue(actualCodeParserGrammar.getBuildParseTree());
    assertEquals(-1, actualCodeParserGrammar.getState());
    assertTrue(actualCodeParserGrammar.getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    ParserATNSimulator interpreter = actualCodeParserGrammar.getInterpreter();
    assertEquals(2, interpreter.decisionToDFA.length);
    assertSame(actualCodeParserGrammar, interpreter.getParser());
    assertSame(actualCodeParserGrammar.getATN(), interpreter.atn);
    assertEquals(PredictionMode.LL, interpreter.getPredictionMode());
    PredictionContextCache expectedSharedContextCache = actualCodeParserGrammar._sharedContextCache;
    assertSame(expectedSharedContextCache, interpreter.getSharedContextCache());
  }

  @Test
  public void testDefinition() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    CodeParserGrammar.DefinitionContext actualDefinitionResult = (new CodeParserGrammar(
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
    CodeParserGrammar.DefinitionContext actualDefinitionResult = (new CodeParserGrammar(
        new BufferedTokenStream(listTokenSource))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    List<ParseTree> parseTreeList = actualDefinitionResult.children;
    assertEquals(2, parseTreeList.size());
    assertNull(actualDefinitionResult.getParent());
    Token expectedStart = actualDefinitionResult.start;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(2, actualDefinitionResult.getChildCount());
    Token expectedStop = actualDefinitionResult.stop;
    Token stop = actualDefinitionResult.getStop();
    assertSame(expectedStop, stop);
    assertEquals("nullEOF", actualDefinitionResult.getText());
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
    assertSame(actualDefinitionResult, getResult.getParent());
    assertEquals(6, ((CodeParserGrammar.SectionContext) parseTreeList.get(0)).invokingState);
    assertEquals("<EOF>", getResult.toString());
    assertEquals(0, tokenSource.getLine());
  }

  @Test
  public void testDefinition3() throws RecognitionException {
    // Arrange and Act
    CodeParserGrammar.DefinitionContext actualDefinitionResult = (new CodeParserGrammar(
        new BufferedTokenStream(new CodeLexerGrammar(new ANTLRInputStream())))).definition();

    // Assert
    assertEquals(-1, actualDefinitionResult.invokingState);
    assertEquals(1, actualDefinitionResult.children.size());
    assertNull(actualDefinitionResult.getParent());
    Token expectedStart = actualDefinitionResult.stop;
    Token start = actualDefinitionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualDefinitionResult.getStop());
    assertEquals("<EOF>", actualDefinitionResult.getText());
    assertEquals(1, actualDefinitionResult.getChildCount());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(-1, ((CodeLexerGrammar) start.getTokenSource()).getType());
    assertEquals(1, ((CodeLexerGrammar) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((CodeLexerGrammar) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((CodeLexerGrammar) start.getTokenSource())._hitEOF);
    assertNull(((CodeLexerGrammar) start.getTokenSource())._text);
    assertEquals(0, ((CodeLexerGrammar) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(0, ((CodeLexerGrammar) start.getTokenSource()).getChannel());
  }

  @Test
  public void testDefinition4() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(0));
    ListTokenSource listTokenSource = new ListTokenSource(tokenList);

    // Act
    CodeParserGrammar.DefinitionContext actualDefinitionResult = (new CodeParserGrammar(
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
    ParseTree getResult = parseTreeList.get(1);
    assertEquals("<EOF>", getResult.toString());
    assertEquals(0, tokenSource.getLine());
    assertSame(actualDefinitionResult, getResult.getParent());
  }

  @Test
  public void testDefinitionContextAccept() {
    // Arrange
    CodeParserGrammar.DefinitionContext definitionContext = new CodeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextAccept2() {
    // Arrange
    CodeParserGrammar.DefinitionContext definitionContext = new CodeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextAccept3() {
    // Arrange
    CodeParserGrammar.DefinitionContext definitionContext = new CodeParserGrammar.DefinitionContext(
        new ParserRuleContext(), 1);
    definitionContext.<ParseTree>addAnyChild(new CodeParserGrammar.DefinitionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(definitionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testDefinitionContextEOF() {
    // Arrange, Act and Assert
    assertNull((new CodeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testDefinitionContextSection() {
    // Arrange, Act and Assert
    assertTrue((new CodeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).section().isEmpty());
    assertNull((new CodeParserGrammar.DefinitionContext(new ParserRuleContext(), 1)).section(1));
  }

  @Test
  public void testSection() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    // Act
    CodeParserGrammar.SectionContext actualSectionResult = (new CodeParserGrammar(
        new BufferedTokenStream(listTokenSource))).section();

    // Assert
    assertEquals(-1, actualSectionResult.invokingState);
    List<ParseTree> parseTreeList = actualSectionResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualSectionResult.getParent());
    Token expectedStart = actualSectionResult.start;
    Token start = actualSectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSectionResult.getStop());
    assertEquals(1, actualSectionResult.getChildCount());
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
    assertSame(actualSectionResult, getResult.getParent());
    assertEquals("<missing SECTION_START>", getResult.getText());
    assertEquals(1, tokenSource.getLine());
    Object payload = getResult.getPayload();
    assertEquals("[@-1,-1:-1='<missing SECTION_START>',<1>,1:0]", payload.toString());
    assertNull(((CommonToken) payload).getInputStream());
    assertEquals(0, ((CommonToken) payload).getCharPositionInLine());
    assertEquals(1, ((CommonToken) payload).getType());
    assertEquals(0, ((CommonToken) payload).getChannel());
    assertEquals(-1, ((CommonToken) payload).getStopIndex());
    assertEquals("<missing SECTION_START>", ((CommonToken) payload).getText());
    assertEquals(-1, ((CommonToken) payload).getStartIndex());
    assertSame(tokenSource, ((CommonToken) payload).getTokenSource());
  }

  @Test
  public void testSection2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    CodeParserGrammar codeParserGrammar = new CodeParserGrammar(
        new BufferedTokenStream(new ListTokenSource(tokenList)));

    // Act
    CodeParserGrammar.SectionContext actualSectionResult = codeParserGrammar.section();

    // Assert
    assertEquals(-1, actualSectionResult.invokingState);
    List<ParseTree> parseTreeList = actualSectionResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualSectionResult.getParent());
    Token expectedStart = actualSectionResult.stop;
    Token start = actualSectionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualSectionResult.getStop());
    assertEquals(1, actualSectionResult.getChildCount());
    assertEquals(0, start.getTokenIndex());
    ParseTree getResult = parseTreeList.get(0);
    assertNull(getResult.getText());
    assertSame(actualSectionResult, getResult.getParent());
    assertNull(codeParserGrammar.getRuleContext());
    assertEquals(-1, codeParserGrammar.getState());
  }

  @Test
  public void testSection3() throws RecognitionException {
    // Arrange
    CodeParserGrammar codeParserGrammar = new CodeParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));

    // Act
    CodeParserGrammar.SectionContext actualSectionResult = codeParserGrammar.section();

    // Assert
    assertEquals(-1, actualSectionResult.invokingState);
    List<ParseTree> parseTreeList = actualSectionResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualSectionResult.getParent());
    Token expectedStart = actualSectionResult.stop;
    Token start = actualSectionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualSectionResult.getStop());
    assertEquals(1, actualSectionResult.getChildCount());
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
    assertSame(actualSectionResult, getResult.getParent());
    assertNull(codeParserGrammar.getRuleContext());
    assertEquals(-1, codeParserGrammar.getState());
  }

  @Test
  public void testSection4() throws RecognitionException {
    // Arrange and Act
    CodeParserGrammar.SectionContext actualSectionResult = (new CodeParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).section();

    // Assert
    assertEquals(-1, actualSectionResult.invokingState);
    assertEquals(1, actualSectionResult.children.size());
    assertNull(actualSectionResult.getParent());
    Token expectedStart = actualSectionResult.start;
    Token start = actualSectionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSectionResult.getStop());
    assertEquals("<missing SECTION_START>", actualSectionResult.getText());
    assertEquals(1, actualSectionResult.getChildCount());
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
  public void testSection5() throws RecognitionException {
    // Arrange
    CodeParserGrammar codeParserGrammar = new CodeParserGrammar(
        new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input"))));
    codeParserGrammar.setTrace(true);

    // Act
    CodeParserGrammar.SectionContext actualSectionResult = codeParserGrammar.section();

    // Assert
    assertEquals(-1, actualSectionResult.invokingState);
    List<ParseTree> parseTreeList = actualSectionResult.children;
    assertEquals(1, parseTreeList.size());
    assertNull(actualSectionResult.getParent());
    Token expectedStart = actualSectionResult.stop;
    Token start = actualSectionResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualSectionResult.getStop());
    assertEquals(1, actualSectionResult.getChildCount());
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
    assertSame(actualSectionResult, getResult.getParent());
    assertNull(codeParserGrammar.getRuleContext());
    assertEquals(-1, codeParserGrammar.getState());
  }

  @Test
  public void testSectionContent() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());
    CodeParserGrammar codeParserGrammar = new CodeParserGrammar(new BufferedTokenStream(listTokenSource));

    // Act
    CodeParserGrammar.SectionContentContext actualSectionContentResult = codeParserGrammar.sectionContent();

    // Assert
    assertEquals(-1, actualSectionContentResult.invokingState);
    assertNull(actualSectionContentResult.getParent());
    Token expectedStart = actualSectionContentResult.start;
    Token start = actualSectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSectionContentResult.getStop());
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
    assertNull(codeParserGrammar.getRuleContext());
    assertEquals(-1, codeParserGrammar.getState());
  }

  @Test
  public void testSectionContent2() throws RecognitionException {
    // Arrange
    ArrayList<Token> tokenList = new ArrayList<Token>();
    tokenList.add(new CommonToken(1));
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new ListTokenSource(tokenList));
    CodeParserGrammar codeParserGrammar = new CodeParserGrammar(bufferedTokenStream);

    // Act
    CodeParserGrammar.SectionContentContext actualSectionContentResult = codeParserGrammar.sectionContent();

    // Assert
    RecognitionException recognitionException = actualSectionContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualSectionContentResult.children.size());
    assertNull(actualSectionContentResult.getParent());
    Token expectedStart = actualSectionContentResult.stop;
    Token start = actualSectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualSectionContentResult.getStop());
    assertEquals("null", actualSectionContentResult.getText());
    assertEquals(1, actualSectionContentResult.getChildCount());
    assertTrue(actualSectionContentResult.isEmpty());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(codeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertEquals(21, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualSectionContentResult, recognitionException.getCtx());
    assertEquals("List", inputStream.getSourceName());
    assertEquals(1, inputStream.index());
    assertEquals("null", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
  }

  @Test
  public void testSectionContent3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));
    CodeParserGrammar codeParserGrammar = new CodeParserGrammar(bufferedTokenStream);

    // Act
    CodeParserGrammar.SectionContentContext actualSectionContentResult = codeParserGrammar.sectionContent();

    // Assert
    RecognitionException recognitionException = actualSectionContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualSectionContentResult.children.size());
    assertNull(actualSectionContentResult.getParent());
    Token expectedStart = actualSectionContentResult.stop;
    Token start = actualSectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualSectionContentResult.getStop());
    assertEquals("Input", actualSectionContentResult.getText());
    assertEquals(1, actualSectionContentResult.getChildCount());
    assertTrue(actualSectionContentResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(codeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(21, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualSectionContentResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testSectionContent4() throws RecognitionException {
    // Arrange and Act
    CodeParserGrammar.SectionContentContext actualSectionContentResult = (new CodeParserGrammar(
        new BufferedTokenStream(new ConnectionLexerGrammar(new ANTLRInputStream())))).sectionContent();

    // Assert
    assertEquals(-1, actualSectionContentResult.invokingState);
    assertNull(actualSectionContentResult.getParent());
    Token expectedStart = actualSectionContentResult.start;
    Token start = actualSectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSectionContentResult.getStop());
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
  public void testSectionContent5() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new XPathLexer(new ANTLRInputStream("Input")));

    CodeParserGrammar codeParserGrammar = new CodeParserGrammar(bufferedTokenStream);
    codeParserGrammar.setTrace(true);

    // Act
    CodeParserGrammar.SectionContentContext actualSectionContentResult = codeParserGrammar.sectionContent();

    // Assert
    RecognitionException recognitionException = actualSectionContentResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualSectionContentResult.children.size());
    assertNull(actualSectionContentResult.getParent());
    Token expectedStart = actualSectionContentResult.stop;
    Token start = actualSectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertSame(start, actualSectionContentResult.getStop());
    assertEquals("Input", actualSectionContentResult.getText());
    assertEquals(1, actualSectionContentResult.getChildCount());
    assertTrue(actualSectionContentResult.isEmpty());
    assertNull(start.getTokenSource());
    assertEquals(0, start.getChannel());
    assertEquals(1, start.getType());
    IntStream inputStream = recognitionException.getInputStream();
    assertSame(bufferedTokenStream, inputStream);
    assertSame(codeParserGrammar, recognitionException.getRecognizer());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(21, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals("Input", start.getText());
    assertSame(actualSectionContentResult, recognitionException.getCtx());
    assertEquals(0, start.getStartIndex());
    assertEquals(1, inputStream.index());
    assertEquals("Input", ((BufferedTokenStream) inputStream).getText());
    assertEquals(2, inputStream.size());
    assertEquals(5, ((XPathLexer) ((BufferedTokenStream) inputStream).getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void testSectionContent6() throws RecognitionException {
    // Arrange
    ListTokenSource listTokenSource = new ListTokenSource(new ArrayList<Token>());

    CodeParserGrammar codeParserGrammar = new CodeParserGrammar(new BufferedTokenStream(listTokenSource));
    codeParserGrammar.setTrace(true);

    // Act
    CodeParserGrammar.SectionContentContext actualSectionContentResult = codeParserGrammar.sectionContent();

    // Assert
    assertEquals(-1, actualSectionContentResult.invokingState);
    assertNull(actualSectionContentResult.getParent());
    Token expectedStart = actualSectionContentResult.start;
    Token start = actualSectionContentResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSectionContentResult.getStop());
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
    assertNull(codeParserGrammar.getRuleContext());
    assertEquals(-1, codeParserGrammar.getState());
  }

  @Test
  public void testSectionContentContextAccept() {
    // Arrange
    CodeParserGrammar.SectionContentContext sectionContentContext = new CodeParserGrammar.SectionContentContext(
        new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(sectionContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSectionContentContextAccept2() {
    // Arrange
    CodeParserGrammar.SectionContentContext sectionContentContext = new CodeParserGrammar.SectionContentContext(
        new ParserRuleContext(), 1);
    sectionContentContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(sectionContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSectionContentContextAccept3() {
    // Arrange
    CodeParserGrammar.SectionContentContext sectionContentContext = new CodeParserGrammar.SectionContentContext(
        new ParserRuleContext(), 1);
    sectionContentContext
        .<ParseTree>addAnyChild(new CodeParserGrammar.SectionContentContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(sectionContentContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSectionContentContextHASH() {
    // Arrange, Act and Assert
    assertNull((new CodeParserGrammar.SectionContentContext(new ParserRuleContext(), 1)).HASH());
  }

  @Test
  public void testSectionContentContextNON_HASH() {
    // Arrange, Act and Assert
    assertNull((new CodeParserGrammar.SectionContentContext(new ParserRuleContext(), 1)).NON_HASH());
  }

  @Test
  public void testSectionContextAccept() {
    // Arrange
    CodeParserGrammar.SectionContext sectionContext = new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1);

    // Act and Assert
    assertNull(sectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSectionContextAccept2() {
    // Arrange
    CodeParserGrammar.SectionContext sectionContext = new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1);
    sectionContext.<ParseTree>addAnyChild(new InterpreterRuleContext());

    // Act and Assert
    assertNull(sectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSectionContextAccept3() {
    // Arrange
    CodeParserGrammar.SectionContext sectionContext = new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1);
    sectionContext.<ParseTree>addAnyChild(new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1));

    // Act and Assert
    assertNull(sectionContext.<Object>accept(new CodeParserGrammarBaseVisitor<Object>()));
  }

  @Test
  public void testSectionContextSECTION_START() {
    // Arrange, Act and Assert
    assertNull((new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1)).SECTION_START());
  }

  @Test
  public void testSectionContextSectionContent() {
    // Arrange, Act and Assert
    assertTrue((new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1)).sectionContent().isEmpty());
    assertNull((new CodeParserGrammar.SectionContext(new ParserRuleContext(), 1)).sectionContent(1));
  }
}

