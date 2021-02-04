package org.finos.legend.engine.language.pure.modelManager.sdlc.alloy;

import static org.junit.Assert.assertTrue;
import org.finos.legend.engine.language.pure.modelManager.sdlc.configuration.MetaDataServerConfiguration;
import org.finos.legend.engine.language.pure.modelManager.sdlc.configuration.ServerConnectionConfiguration;
import org.finos.legend.engine.protocol.pure.v1.model.context.AlloySDLC;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextData;
import org.junit.Test;

public class AlloySDLCLoaderDiffblueTest {
  @Test
  public void testCheckAllPathsExist() {
    // Arrange
    AlloySDLCLoader alloySDLCLoader = new AlloySDLCLoader(new MetaDataServerConfiguration());
    PureModelContextData data = PureModelContextData.newPureModelContextData();

    // Act and Assert
    assertTrue(alloySDLCLoader.checkAllPathsExist(data, new AlloySDLC()).isEmpty());
  }

  @Test
  public void testCheckAllPathsExist2() {
    // Arrange
    AlloySDLCLoader alloySDLCLoader = new AlloySDLCLoader(
        new MetaDataServerConfiguration(new ServerConnectionConfiguration("localhost", 8080)));
    PureModelContextData data = PureModelContextData.newPureModelContextData();

    // Act and Assert
    assertTrue(alloySDLCLoader.checkAllPathsExist(data, new AlloySDLC()).isEmpty());
  }
}

