package org.finos.legend.engine.shared.core.url;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ExecutorProtocolHandlerDiffblueTest {
  @Test
  public void testHandles() {
    // Arrange, Act and Assert
    assertFalse((new ExecutorProtocolHandler()).handles("https://example.org/example"));
    assertTrue((new ExecutorProtocolHandler()).handles("executor"));
  }

  @Test
  public void testGetHandler() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> (new ExecutorProtocolHandler()).getHandler("https://example.org/example"));
  }

  @Test
  public void testGetHandler2() {
    // Arrange
    ExecutorProtocolHandler executorProtocolHandler = new ExecutorProtocolHandler();

    // Act and Assert
    assertSame(executorProtocolHandler, executorProtocolHandler.getHandler("executor"));
  }
}

