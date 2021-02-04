package org.finos.legend.engine.shared.core.kerberos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class LocalLoginConfigurationDiffblueTest {
  @Test
  public void testGetAppConfigurationEntry() {
    // Arrange, Act and Assert
    assertEquals(1, (new LocalLoginConfiguration()).getAppConfigurationEntry("Name").length);
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    LocalLoginConfiguration actualLocalLoginConfiguration = new LocalLoginConfiguration();

    // Assert
    assertNull(actualLocalLoginConfiguration.getProvider());
    assertNull(actualLocalLoginConfiguration.getParameters());
    assertNull(actualLocalLoginConfiguration.getType());
  }
}

