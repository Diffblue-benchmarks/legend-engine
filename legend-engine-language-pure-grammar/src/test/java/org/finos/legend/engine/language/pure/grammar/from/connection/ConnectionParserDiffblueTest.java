package org.finos.legend.engine.language.pure.grammar.from.connection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.finos.legend.engine.language.pure.grammar.from.SourceCodeParserInfo;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.ConnectionLexerGrammar;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.connection.ConnectionParserGrammar;
import org.finos.legend.engine.protocol.pure.v1.model.SourceInformation;
import org.junit.Test;

public class ConnectionParserDiffblueTest {
  @Test
  public void testGetParserInfo() {
    // Arrange
    ConnectionParser newInstanceResult = ConnectionParser.newInstance();

    // Act
    SourceCodeParserInfo actualParserInfo = newInstanceResult.getParserInfo("", new SourceInformation(), null);

    // Assert
    Parser parser = actualParserInfo.parser;
    assertTrue(parser instanceof ConnectionParserGrammar);
    assertEquals("", actualParserInfo.code);
    assertNull(actualParserInfo.walkerSourceInformation);
    ParserRuleContext parserRuleContext = actualParserInfo.rootContext;
    assertTrue(parserRuleContext instanceof ConnectionParserGrammar.DefinitionContext);
    Lexer lexer = actualParserInfo.lexer;
    assertTrue(lexer instanceof ConnectionLexerGrammar);
    assertEquals(0, ((ConnectionLexerGrammar) lexer)._mode);
    assertTrue(((ConnectionLexerGrammar) lexer)._hitEOF);
    assertEquals(0, ((ConnectionLexerGrammar) lexer)._tokenStartCharPositionInLine);
    assertNull(((ConnectionLexerGrammar) lexer)._text);
    assertEquals(0, ((ConnectionLexerGrammar) lexer)._tokenStartCharIndex);
    assertEquals(1, ((ConnectionLexerGrammar) lexer)._tokenStartLine);
    assertEquals(-1, lexer.getType());
    assertEquals(-1, ((ConnectionParserGrammar.DefinitionContext) parserRuleContext).invokingState);
    assertEquals("([] [28] <EOF>)", parserRuleContext.toStringTree());
    assertEquals("<EOF>", parserRuleContext.getText());
    assertNull(parserRuleContext.getParent());
    Token start = parserRuleContext.getStart();
    assertTrue(start instanceof CommonToken);
    assertSame(start, parserRuleContext.getStop());
    assertEquals(2, parserRuleContext.getChildCount());
    assertEquals(-1, parser.getState());
    assertTrue(parser.isMatchedEOF());
    assertSame(start, parser.getCurrentToken());
    String expectedSourceName = String.join("", "<", System.getProperty("sun.os.patch.level"), ">");
    assertEquals(expectedSourceName, parser.getSourceName());
    assertTrue(parser.getTokenFactory() instanceof org.antlr.v4.runtime.CommonTokenFactory);
    assertTrue(parser.getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    assertEquals(0, parser.getPrecedence());
    assertFalse(parser.isTrace());
    assertNull(parser.getRuleContext());
    assertEquals(0, parser.getNumberOfSyntaxErrors());
    assertNull(parser.getParseInfo());
    assertTrue(parser.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertTrue(parser.getBuildParseTree());
    ParserATNSimulator interpreter = parser.getInterpreter();
    assertEquals(7, interpreter.decisionToDFA.length);
    assertSame(parser.getATN(), interpreter.atn);
  }
}

