package org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.application;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppliedPropertyDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new AppliedProperty()).parameters.isEmpty());
  }
}

