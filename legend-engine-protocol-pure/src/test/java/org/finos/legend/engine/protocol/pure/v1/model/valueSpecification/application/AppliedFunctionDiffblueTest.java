package org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.application;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppliedFunctionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new AppliedFunction()).parameters.isEmpty());
  }
}

