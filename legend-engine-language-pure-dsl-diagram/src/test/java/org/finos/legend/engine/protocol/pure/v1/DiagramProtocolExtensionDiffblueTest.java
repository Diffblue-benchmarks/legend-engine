package org.finos.legend.engine.protocol.pure.v1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DiagramProtocolExtensionDiffblueTest {
  @Test
  public void testGetExtraProtocolSubTypeInfoCollectors() {
    // Arrange, Act and Assert
    assertEquals(1, (new DiagramProtocolExtension()).getExtraProtocolSubTypeInfoCollectors().size());
  }
}

