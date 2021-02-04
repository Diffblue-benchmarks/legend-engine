package org.finos.legend.engine.protocol.pure.v1.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SourceInformationDiffblueTest {
  @Test
  public void testGetMessage() {
    // Arrange, Act and Assert
    assertEquals("[2:1-3:3]", (new SourceInformation("42", 2, 1, 3, 3)).getMessage());
    assertEquals("[3:1-3]", (new SourceInformation("42", 3, 1, 3, 3)).getMessage());
    assertEquals("[3:3]", (new SourceInformation("42", 3, 3, 3, 3)).getMessage());
  }
}

