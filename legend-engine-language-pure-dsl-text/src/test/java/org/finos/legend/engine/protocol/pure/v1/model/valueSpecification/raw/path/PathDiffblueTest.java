package org.finos.legend.engine.protocol.pure.v1.model.valueSpecification.raw.path;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PathDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new Path()).path.isEmpty());
  }
}

