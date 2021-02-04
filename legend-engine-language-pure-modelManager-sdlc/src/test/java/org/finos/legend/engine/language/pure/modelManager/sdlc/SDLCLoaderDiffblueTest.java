package org.finos.legend.engine.language.pure.modelManager.sdlc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.finos.legend.engine.language.pure.modelManager.sdlc.configuration.MetaDataServerConfiguration;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextPointer;
import org.finos.legend.engine.shared.core.kerberos.LocalLoginConfiguration;
import org.finos.legend.pure.m3.tools.kerberos.SubjectGetter;
import org.junit.Test;

public class SDLCLoaderDiffblueTest {
  @Test
  public void testShouldCache() {
    // Arrange
    MetaDataServerConfiguration metaDataServerConfiguration = new MetaDataServerConfiguration();
    SDLCLoader sdlcLoader = new SDLCLoader(metaDataServerConfiguration,
        new SubjectGetter(new LocalLoginConfiguration()));

    // Act and Assert
    assertTrue(sdlcLoader.shouldCache(new PureModelContextPointer()));
  }

  @Test
  public void testShouldCache2() {
    // Arrange
    MetaDataServerConfiguration metaDataServerConfiguration = new MetaDataServerConfiguration();

    // Act and Assert
    assertFalse((new SDLCLoader(metaDataServerConfiguration, new SubjectGetter(new LocalLoginConfiguration())))
        .shouldCache(null));
  }

  @Test
  public void testSupports() {
    // Arrange
    MetaDataServerConfiguration metaDataServerConfiguration = new MetaDataServerConfiguration();
    SDLCLoader sdlcLoader = new SDLCLoader(metaDataServerConfiguration,
        new SubjectGetter(new LocalLoginConfiguration()));

    // Act and Assert
    assertTrue(sdlcLoader.supports(new PureModelContextPointer()));
  }

  @Test
  public void testSupports2() {
    // Arrange
    MetaDataServerConfiguration metaDataServerConfiguration = new MetaDataServerConfiguration();

    // Act and Assert
    assertFalse(
        (new SDLCLoader(metaDataServerConfiguration, new SubjectGetter(new LocalLoginConfiguration()))).supports(null));
  }
}

