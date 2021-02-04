package org.finos.legend.engine.shared.core;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LightSchedulerDiffblueTest {
  @Test
  public void testPrintStats() {
    // Arrange, Act and Assert
    assertEquals("[]", (new LightScheduler()).printStats());
  }
}

