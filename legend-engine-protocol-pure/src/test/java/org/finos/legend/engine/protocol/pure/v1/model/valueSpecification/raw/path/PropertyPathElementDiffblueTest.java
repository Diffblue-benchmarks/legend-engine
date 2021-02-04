package org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw.path;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PropertyPathElementDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new PropertyPathElement()).parameters.isEmpty());
  }
}

