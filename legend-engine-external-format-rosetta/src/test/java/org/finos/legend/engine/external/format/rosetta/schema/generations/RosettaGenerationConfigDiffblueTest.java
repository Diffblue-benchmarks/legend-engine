package org.finos.legend.engine.external.format.rosetta.schema.generations;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RosettaGenerationConfigDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new RosettaGenerationConfig()).scopeElements.isEmpty());
  }
}

