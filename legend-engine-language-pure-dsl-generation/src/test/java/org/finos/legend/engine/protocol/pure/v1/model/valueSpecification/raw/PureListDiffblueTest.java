package org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PureListDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new PureList()).values.isEmpty());
  }
}

