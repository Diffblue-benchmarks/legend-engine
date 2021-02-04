package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SourceInformationHelperDiffblueTest {
  @Test
  public void testFromM3SourceInformation() {
    // Arrange and Act
    org.finos.legend.engine.protocol.pure.v1.model.SourceInformation actualFromM3SourceInformationResult = SourceInformationHelper
        .fromM3SourceInformation(
            SourceInformationHelper.toM3SourceInformation(SourceInformationHelper.fromM3SourceInformation(
                SourceInformationHelper.toM3SourceInformation(SourceInformationHelper.fromM3SourceInformation(null)))));

    // Assert
    assertEquals(0, actualFromM3SourceInformationResult.endColumn);
    assertEquals(0, actualFromM3SourceInformationResult.endLine);
    assertEquals("X", actualFromM3SourceInformationResult.sourceId);
    assertEquals(0, actualFromM3SourceInformationResult.startLine);
    assertEquals(0, actualFromM3SourceInformationResult.startColumn);
  }

  @Test
  public void testToM3SourceInformation() {
    // Arrange and Act
    org.finos.legend.pure.m4.coreinstance.SourceInformation actualToM3SourceInformationResult = SourceInformationHelper
        .toM3SourceInformation(
            SourceInformationHelper.fromM3SourceInformation(SourceInformationHelper.toM3SourceInformation(
                SourceInformationHelper.fromM3SourceInformation(SourceInformationHelper.toM3SourceInformation(null)))));

    // Assert
    assertEquals("X", actualToM3SourceInformationResult.getSourceId());
    assertEquals(0, actualToM3SourceInformationResult.getLine());
    assertEquals(0, actualToM3SourceInformationResult.getStartColumn());
    assertEquals(0, actualToM3SourceInformationResult.getStartLine());
    assertEquals(0, actualToM3SourceInformationResult.getEndLine());
    assertEquals(0, actualToM3SourceInformationResult.getColumn());
    assertEquals(0, actualToM3SourceInformationResult.getEndColumn());
  }

  @Test
  public void testToM3SourceInformation2() {
    // Arrange and Act
    org.finos.legend.pure.m4.coreinstance.SourceInformation actualToM3SourceInformationResult = SourceInformationHelper
        .toM3SourceInformation(null);

    // Assert
    assertEquals("X", actualToM3SourceInformationResult.getSourceId());
    assertEquals(0, actualToM3SourceInformationResult.getLine());
    assertEquals(0, actualToM3SourceInformationResult.getStartColumn());
    assertEquals(0, actualToM3SourceInformationResult.getStartLine());
    assertEquals(0, actualToM3SourceInformationResult.getEndLine());
    assertEquals(0, actualToM3SourceInformationResult.getColumn());
    assertEquals(0, actualToM3SourceInformationResult.getEndColumn());
  }
}

