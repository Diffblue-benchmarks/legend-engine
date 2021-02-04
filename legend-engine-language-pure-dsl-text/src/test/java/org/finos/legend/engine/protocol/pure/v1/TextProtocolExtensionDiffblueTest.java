package org.finos.legend.engine.protocol.pure.v1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TextProtocolExtensionDiffblueTest {
  @Test
  public void testGetExtraProtocolSubTypeInfoCollectors() {
    // Arrange, Act and Assert
    assertEquals(1, (new TextProtocolExtension()).getExtraProtocolSubTypeInfoCollectors().size());
  }
}

