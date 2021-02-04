package org.finos.legend.engine.language.pure.grammar.from.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.finos.legend.engine.language.pure.grammar.from.SourceCodeParserInfo;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.domain.DomainLexerGrammar;
import org.finos.legend.engine.language.pure.grammar.from.antlr4.domain.DomainParserGrammar;
import org.finos.legend.engine.protocol.pure.v1.model.SourceInformation;
import org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.ValueSpecification;
import org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw.Enum;
import org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw.Lambda;
import org.junit.Test;

public class DomainParserDiffblueTest {
  @Test
  public void testGetParserInfo() {
    // Arrange
    DomainParser domainParser = new DomainParser();

    // Act
    SourceCodeParserInfo actualParserInfo = domainParser.getParserInfo("", new SourceInformation(), null);

    // Assert
    Parser parser = actualParserInfo.parser;
    assertTrue(parser instanceof DomainParserGrammar);
    assertEquals("", actualParserInfo.code);
    assertNull(actualParserInfo.walkerSourceInformation);
    ParserRuleContext parserRuleContext = actualParserInfo.rootContext;
    assertTrue(parserRuleContext instanceof DomainParserGrammar.DefinitionContext);
    Lexer lexer = actualParserInfo.lexer;
    assertTrue(lexer instanceof DomainLexerGrammar);
    assertTrue(parser.getErrorListenerDispatch() instanceof org.antlr.v4.runtime.ProxyErrorListener);
    assertEquals(0, ((DomainLexerGrammar) lexer)._mode);
    assertTrue(((DomainLexerGrammar) lexer)._hitEOF);
    assertEquals(0, ((DomainLexerGrammar) lexer)._tokenStartCharPositionInLine);
    assertNull(((DomainLexerGrammar) lexer)._text);
    assertEquals(0, ((DomainLexerGrammar) lexer)._tokenStartCharIndex);
    assertEquals(1, ((DomainLexerGrammar) lexer)._tokenStartLine);
    assertEquals(-1, lexer.getType());
    assertEquals(-1, ((DomainParserGrammar.DefinitionContext) parserRuleContext).invokingState);
    assertEquals("([] [270] <EOF>)", parserRuleContext.toStringTree());
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
    assertEquals(164, interpreter.decisionToDFA.length);
  }

  @Test
  public void testParseLambda() {
    // Arrange and Act
    Lambda actualParseLambdaResult = (new DomainParser()).parseLambda("Code", "42");

    // Assert
    assertTrue(actualParseLambdaResult.parameters.isEmpty());
    List<ValueSpecification> valueSpecificationList = actualParseLambdaResult.body;
    assertEquals(1, valueSpecificationList.size());
    SourceInformation sourceInformation = actualParseLambdaResult.sourceInformation;
    assertEquals(1, sourceInformation.endLine);
    assertEquals("42", sourceInformation.sourceId);
    assertEquals(1, sourceInformation.startLine);
    assertEquals(1, sourceInformation.startColumn);
    assertEquals(4, sourceInformation.endColumn);
    assertEquals("Code", ((Enum) valueSpecificationList.get(0)).fullPath);
    SourceInformation sourceInformation1 = ((Enum) valueSpecificationList.get(0)).sourceInformation;
    assertEquals(4, sourceInformation1.endColumn);
    assertEquals(1, sourceInformation1.endLine);
    assertEquals("42", sourceInformation1.sourceId);
    assertEquals(1, sourceInformation1.startLine);
    assertEquals(1, sourceInformation1.startColumn);
  }
}

