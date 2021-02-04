package org.finos.legend.engine.shared.core.url;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EngineUrlStreamHandlerFactoryDiffblueTest {
  @Test
  public void testCreateURLStreamHandler() {
    // Arrange, Act and Assert
    assertNull((new EngineUrlStreamHandlerFactory()).createURLStreamHandler("https://example.org/example"));
    assertTrue((new EngineUrlStreamHandlerFactory()).createURLStreamHandler("data") instanceof DataProtocolHandler);
    assertNull((new EngineUrlStreamHandlerFactory()).createURLStreamHandler("mailto"));
  }
}

