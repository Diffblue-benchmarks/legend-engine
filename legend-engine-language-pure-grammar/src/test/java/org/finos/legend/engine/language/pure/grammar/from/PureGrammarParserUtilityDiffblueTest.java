package org.finos.legend.engine.language.pure.grammar.from;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import java.util.ArrayList;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.finos.legend.engine.protocol.pure.v1.model.SourceInformation;
import org.finos.legend.engine.shared.core.operational.errorManagement.EngineException;
import org.junit.Test;

public class PureGrammarParserUtilityDiffblueTest {
  @Test
  public void testFromGrammarString() {
    // Arrange, Act and Assert
    assertEquals("a", PureGrammarParserUtility.fromGrammarString("Val", true));
    assertEquals("a", PureGrammarParserUtility.fromGrammarString("Val", false));
  }

  @Test
  public void testRemoveQuotes() {
    // Arrange, Act and Assert
    assertEquals("a", PureGrammarParserUtility.removeQuotes("Val"));
  }

  @Test
  public void testValidateAndExtractRequiredField() {
    // Arrange
    ArrayList<RuleContext> contexts = new ArrayList<RuleContext>();

    // Act and Assert
    assertThrows(EngineException.class, () -> PureGrammarParserUtility
        .<RuleContext>validateAndExtractRequiredField(contexts, "Field Name", new SourceInformation()));
  }

  @Test
  public void testValidateAndExtractRequiredField2() {
    // Arrange
    ArrayList<RuleContext> ruleContextList = new ArrayList<RuleContext>();
    ruleContextList.add(null);

    // Act and Assert
    assertNull(PureGrammarParserUtility.<RuleContext>validateAndExtractRequiredField(ruleContextList, "Field Name",
        new SourceInformation()));
  }

  @Test
  public void testValidateAndExtractRequiredField3() {
    // Arrange
    ArrayList<RuleContext> ruleContextList = new ArrayList<RuleContext>();
    ruleContextList.add(null);
    ruleContextList.add(null);

    // Act and Assert
    assertThrows(EngineException.class, () -> PureGrammarParserUtility
        .<RuleContext>validateAndExtractRequiredField(ruleContextList, "Field Name", new SourceInformation()));
  }

  @Test
  public void testValidateAndExtractOptionalField() {
    // Arrange
    ArrayList<RuleContext> contexts = new ArrayList<RuleContext>();

    // Act and Assert
    assertNull(PureGrammarParserUtility.<RuleContext>validateAndExtractOptionalField(contexts, "Field Name",
        new SourceInformation()));
  }

  @Test
  public void testValidateAndExtractOptionalField2() {
    // Arrange
    ArrayList<RuleContext> ruleContextList = new ArrayList<RuleContext>();
    ruleContextList.add(null);

    // Act and Assert
    assertNull(PureGrammarParserUtility.<RuleContext>validateAndExtractOptionalField(ruleContextList, "Field Name",
        new SourceInformation()));
  }

  @Test
  public void testValidateAndExtractOptionalField3() {
    // Arrange
    ArrayList<RuleContext> ruleContextList = new ArrayList<RuleContext>();
    ruleContextList.add(null);
    ruleContextList.add(null);

    // Act and Assert
    assertThrows(EngineException.class, () -> PureGrammarParserUtility
        .<RuleContext>validateAndExtractOptionalField(ruleContextList, "Field Name", new SourceInformation()));
  }

  @Test
  public void testFromIdentifier() {
    // Arrange, Act and Assert
    assertEquals("", PureGrammarParserUtility.fromIdentifier(new ParserRuleContext()));
  }

  @Test
  public void testFromIdentifier2() {
    // Arrange
    ParserRuleContext parserRuleContext = new ParserRuleContext();
    parserRuleContext.setParent(new RuleContext());

    // Act and Assert
    assertEquals("", PureGrammarParserUtility.fromIdentifier(parserRuleContext));
  }
}

