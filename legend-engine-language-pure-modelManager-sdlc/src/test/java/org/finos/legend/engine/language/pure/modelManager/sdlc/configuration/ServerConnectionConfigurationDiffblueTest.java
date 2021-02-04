package org.finos.legend.engine.language.pure.modelManager.sdlc.configuration;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServerConnectionConfigurationDiffblueTest {
  @Test
  public void testGetBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("http://null:null", (new ServerConnectionConfiguration()).getBaseUrl());
  }
}

