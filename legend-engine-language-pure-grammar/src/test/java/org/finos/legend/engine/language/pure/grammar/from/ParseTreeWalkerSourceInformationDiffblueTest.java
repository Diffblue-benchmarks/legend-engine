package org.finos.legend.engine.language.pure.grammar.from;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ParseTreeWalkerSourceInformationDiffblueTest {
  @Test
  public void testBuilderBuild() {
    // Arrange and Act
    ParseTreeWalkerSourceInformation actualBuildResult = (new ParseTreeWalkerSourceInformation.Builder("42", 2, 1))
        .build();

    // Assert
    assertEquals("42", actualBuildResult.getSourceId());
    assertEquals(1, actualBuildResult.getColumnOffset());
    assertEquals(2, actualBuildResult.getLineOffset());
  }

  @Test
  public void testBuilderWithColumnOffset() {
    // Arrange
    ParseTreeWalkerSourceInformation.Builder builder = new ParseTreeWalkerSourceInformation.Builder("42", 2, 1);

    // Act and Assert
    assertSame(builder, builder.withColumnOffset(1));
  }

  @Test
  public void testBuilderWithLineOffset() {
    // Arrange
    ParseTreeWalkerSourceInformation.Builder builder = new ParseTreeWalkerSourceInformation.Builder("42", 2, 1);

    // Act and Assert
    assertSame(builder, builder.withLineOffset(2));
  }

  @Test
  public void testBuilderWithSourceId() {
    // Arrange
    ParseTreeWalkerSourceInformation.Builder builder = new ParseTreeWalkerSourceInformation.Builder("42", 2, 1);

    // Act and Assert
    assertSame(builder, builder.withSourceId("42"));
  }
}

