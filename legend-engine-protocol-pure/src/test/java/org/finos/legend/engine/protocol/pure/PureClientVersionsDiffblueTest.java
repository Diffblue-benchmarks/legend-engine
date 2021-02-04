package org.finos.legend.engine.protocol.pure;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PureClientVersionsDiffblueTest {
  @Test
  public void testVersionAGreaterThanOrEqualsVersionB() {
    // Arrange, Act and Assert
    assertTrue(PureClientVersions.versionAGreaterThanOrEqualsVersionB("1.0.2", "1.0.2"));
  }
}

