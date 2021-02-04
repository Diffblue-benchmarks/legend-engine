package org.finos.legend.engine.language.pure.grammar.from.mapping;

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
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.finos.legend.engine.language.pure.grammar.from.SourceCodeParserInfo;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.MappingLexerGrammar;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.mapping.MappingParserGrammar;
import org.finos.legend.engine.protocol.pure.v1.model.SourceInformation;
import org.junit.Test;

public class MappingParserDiffblueTest {
  @Test
  public void testGetParserInfo() {
    // Arrange
    MappingParser newInstanceResult = MappingParser.newInstance();

    // Act
    SourceCodeParserInfo actualParserInfo = newInstanceResult.getParserInfo("", new SourceInformation(), null);

    // Assert
    Parser parser = actualParserInfo.parser;
    assertTrue(parser instanceof MappingParserGrammar);
    assertEquals("", actualParserInfo.code);
    assertNull(actualParserInfo.walkerSourceInformation);
    ParserRuleContext parserRuleContext = actualParserInfo.rootContext;
    assertTrue(parserRuleContext instanceof MappingParserGrammar.DefinitionContext);
    Lexer lexer = actualParserInfo.lexer;
    assertTrue(lexer instanceof MappingLexerGrammar);
    assertTrue(parser.getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    assertEquals(0, ((MappingLexerGrammar) lexer)._mode);
    assertTrue(((MappingLexerGrammar) lexer)._hitEOF);
    assertEquals(0, ((MappingLexerGrammar) lexer)._tokenStartCharPositionInLine);
    assertNull(((MappingLexerGrammar) lexer)._text);
    assertEquals(0, ((MappingLexerGrammar) lexer)._tokenStartCharIndex);
    assertEquals(1, ((MappingLexerGrammar) lexer)._tokenStartLine);
    assertEquals(-1, lexer.getType());
    assertEquals(-1, ((MappingParserGrammar.DefinitionContext) parserRuleContext).invokingState);
    assertEquals("([] [210] <EOF>)", parserRuleContext.toStringTree());
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
    assertEquals(0, parser.getPrecedence());
    assertFalse(parser.isTrace());
    assertNull(parser.getRuleContext());
    assertEquals(0, parser.getNumberOfSyntaxErrors());
    assertNull(parser.getParseInfo());
    assertTrue(parser.getErrorHandler() instanceof org.antlr.v4.runtime.DefaultErrorStrategy);
    assertTrue(parser.getBuildParseTree());
    ATN expectedAtn = parser.getATN();
    ParserATNSimulator interpreter = parser.getInterpreter();
    assertSame(expectedAtn, interpreter.atn);
    assertEquals(105, interpreter.decisionToDFA.length);
  }
}

