package org.finos.legend.engine.shared.core.kerberos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SystemAccountLoginConfigurationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    SystemAccountLoginConfiguration actualSystemAccountLoginConfiguration = new SystemAccountLoginConfiguration(
        "Keytab Location", "Principal", true);

    // Assert
    assertNull(actualSystemAccountLoginConfiguration.getProvider());
    assertNull(actualSystemAccountLoginConfiguration.getParameters());
    assertNull(actualSystemAccountLoginConfiguration.getType());
  }

  @Test
  public void testGetAppConfigurationEntry() {
    // Arrange, Act and Assert
    assertEquals(1, (new SystemAccountLoginConfiguration("Keytab Location", "Principal", true))
        .getAppConfigurationEntry("Name").length);
  }
}

