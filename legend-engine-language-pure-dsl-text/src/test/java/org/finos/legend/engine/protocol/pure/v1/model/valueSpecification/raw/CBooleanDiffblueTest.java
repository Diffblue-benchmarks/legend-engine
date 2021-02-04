package org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CBooleanDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new CBoolean()).values.isEmpty());
  }
}

