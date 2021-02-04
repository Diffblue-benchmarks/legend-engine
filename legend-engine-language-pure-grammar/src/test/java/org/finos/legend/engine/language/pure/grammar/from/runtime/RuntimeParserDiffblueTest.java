package org.finos.legend.engine.language.pure.grammar.from.runtime;

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
import org.finos.legend.engine.language.pure.grammar.from.antlr4.runtime.RuntimeLexerGrammar;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.runtime.RuntimeParserGrammar;
import org.finos.legend.engine.protocol.pure.v1.model.SourceInformation;
import org.junit.Test;

public class RuntimeParserDiffblueTest {
  @Test
  public void testGetParserInfo() {
    // Arrange
    RuntimeParser runtimeParser = new RuntimeParser();

    // Act
    SourceCodeParserInfo actualParserInfo = runtimeParser.getParserInfo("", new SourceInformation(), null);

    // Assert
    Parser parser = actualParserInfo.parser;
    assertTrue(parser instanceof RuntimeParserGrammar);
    assertEquals("", actualParserInfo.code);
    assertNull(actualParserInfo.walkerSourceInformation);
    ParserRuleContext parserRuleContext = actualParserInfo.rootContext;
    assertTrue(parserRuleContext instanceof RuntimeParserGrammar.DefinitionContext);
    Lexer lexer = actualParserInfo.lexer;
    assertTrue(lexer instanceof RuntimeLexerGrammar);
    assertEquals(0, ((RuntimeLexerGrammar) lexer)._mode);
    assertTrue(((RuntimeLexerGrammar) lexer)._hitEOF);
    assertEquals(0, ((RuntimeLexerGrammar) lexer)._tokenStartCharPositionInLine);
    assertNull(((RuntimeLexerGrammar) lexer)._text);
    assertEquals(0, ((RuntimeLexerGrammar) lexer)._tokenStartCharIndex);
    assertEquals(1, ((RuntimeLexerGrammar) lexer)._tokenStartLine);
    assertEquals(-1, lexer.getType());
    assertEquals(-1, ((RuntimeParserGrammar.DefinitionContext) parserRuleContext).invokingState);
    assertEquals("([] [34] <EOF>)", parserRuleContext.toStringTree());
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
    assertEquals(17, interpreter.decisionToDFA.length);
    assertSame(parser.getATN(), interpreter.atn);
  }
}

