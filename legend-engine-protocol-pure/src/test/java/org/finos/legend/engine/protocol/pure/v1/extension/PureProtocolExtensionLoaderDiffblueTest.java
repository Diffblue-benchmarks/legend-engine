package org.finos.legend.engine.protocol.pure.v1.extension;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PureProtocolExtensionLoaderDiffblueTest {
  @Test
  public void testExtensions() {
    // Arrange, Act and Assert
    assertEquals(1, PureProtocolExtensionLoader.extensions().size());
  }
}

