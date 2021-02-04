package org.finos.legend.engine.language.pure.modelManager.sdlc.pure;

import static org.junit.Assert.assertEquals;
import org.finos.legend.engine.language.pure.modelManager.sdlc.configuration.MetaDataServerConfiguration;
import org.junit.Test;

public class PureServerLoaderDiffblueTest {
  @Test
  public void testBuildPureMetadataVersionURL() {
    // Arrange, Act and Assert
    assertEquals("http://null:null/alloy/pureServerBaseVersionhttps://example.org/example",
        (new PureServerLoader(new MetaDataServerConfiguration()))
            .buildPureMetadataVersionURL("https://example.org/example"));
    assertEquals("http://null:null/alloy/pureServerBaseVersion",
        (new PureServerLoader(new MetaDataServerConfiguration())).buildPureMetadataVersionURL(""));
  }
}

