package org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LambdaDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new Lambda()).parameters.isEmpty());
  }
}

