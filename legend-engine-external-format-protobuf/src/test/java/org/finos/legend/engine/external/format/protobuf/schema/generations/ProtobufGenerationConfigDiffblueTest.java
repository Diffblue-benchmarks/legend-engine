package org.finos.legend.engine.external.format.protobuf.schema.generations;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ProtobufGenerationConfigDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new ProtobufGenerationConfig()).scopeElements.isEmpty());
  }
}

