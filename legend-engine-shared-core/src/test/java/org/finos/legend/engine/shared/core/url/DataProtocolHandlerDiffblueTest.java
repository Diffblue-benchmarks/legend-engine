package org.finos.legend.engine.shared.core.url;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DataProtocolHandlerDiffblueTest {
  @Test
  public void testHandles() {
    // Arrange, Act and Assert
    assertFalse((new DataProtocolHandler()).handles("https://example.org/example"));
    assertTrue((new DataProtocolHandler()).handles("data"));
  }

  @Test
  public void testGetHandler() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> (new DataProtocolHandler()).getHandler("https://example.org/example"));
  }

  @Test
  public void testGetHandler2() {
    // Arrange
    DataProtocolHandler dataProtocolHandler = new DataProtocolHandler();

    // Act and Assert
    assertSame(dataProtocolHandler, dataProtocolHandler.getHandler("data"));
  }
}

