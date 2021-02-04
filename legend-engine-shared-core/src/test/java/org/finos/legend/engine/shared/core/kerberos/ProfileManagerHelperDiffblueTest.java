package org.finos.legend.engine.shared.core.kerberos;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.pac4j.core.profile.CommonProfile;
import org.pac4j.core.profile.ProfileManager;

public class ProfileManagerHelperDiffblueTest {
  @Test
  public void testExtractSubject() {
    // Arrange, Act and Assert
    assertNull(ProfileManagerHelper.extractSubject((ProfileManager<?>) null));
  }

  @Test
  public void testExtractProfiles() {
    // Arrange, Act and Assert
    assertTrue(ProfileManagerHelper.<CommonProfile>extractProfiles(null).isEmpty());
  }
}

