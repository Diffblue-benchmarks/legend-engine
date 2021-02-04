package org.finos.legend.engine.language.pure.modelManager.sdlc.configuration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class MetaDataServerConfigurationDiffblueTest {
  @Test
  public void testGetPure() {
    // Arrange and Act
    ServerConnectionConfiguration actualPure = (new MetaDataServerConfiguration()).getPure();

    // Assert
    assertNull(actualPure.host);
    assertEquals("", actualPure.prefix);
    assertNull(actualPure.port);
  }

  @Test
  public void testGetPure2() {
    // Arrange
    MetaDataServerConfiguration metaDataServerConfiguration = new MetaDataServerConfiguration(
        new ServerConnectionConfiguration());

    // Act and Assert
    assertSame(metaDataServerConfiguration.pure, metaDataServerConfiguration.getPure());
  }
}

