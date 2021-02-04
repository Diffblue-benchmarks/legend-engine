package org.finos.legend.engine.shared.core.kerberos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.sun.security.auth.UserPrincipal;
import java.security.Principal;
import java.util.HashSet;
import javax.security.auth.Subject;
import org.junit.Test;

public class SubjectToolsDiffblueTest {
  @Test
  public void testGetPrincipal() {
    // Arrange, Act and Assert
    assertEquals("_UNKNOWN_", SubjectTools.getPrincipal(null));
  }

  @Test
  public void testGetPrincipal2() {
    // Arrange
    HashSet<Principal> principalSet = new HashSet<Principal>();
    principalSet.add(new UserPrincipal("e"));
    HashSet<Object> pubCredentials = new HashSet<Object>();

    // Act and Assert
    assertEquals("e",
        SubjectTools.getPrincipal(new Subject(true, principalSet, pubCredentials, new HashSet<Object>())));
  }

  @Test
  public void testGetKerberos() {
    // Arrange, Act and Assert
    assertEquals("_UNKNOWN_", SubjectTools.getKerberos(null));
  }

  @Test
  public void testGetKerberos2() {
    // Arrange
    HashSet<Principal> principalSet = new HashSet<Principal>();
    principalSet.add(new UserPrincipal("@"));
    HashSet<Object> pubCredentials = new HashSet<Object>();

    // Act and Assert
    assertEquals("", SubjectTools.getKerberos(new Subject(true, principalSet, pubCredentials, new HashSet<Object>())));
  }

  @Test
  public void testGetCurrentSubject() {
    // Arrange, Act and Assert
    assertNull(SubjectTools.getCurrentSubject());
  }

  @Test
  public void testGetPrincipalFromSubject() {
    // Arrange, Act and Assert
    assertNull(SubjectTools.getPrincipalFromSubject(new Subject()));
    assertNull(SubjectTools.getPrincipalFromSubject(null));
  }

  @Test
  public void testGetCurrentPrincipal() {
    // Arrange, Act and Assert
    assertNull(SubjectTools.getCurrentPrincipal());
  }

  @Test
  public void testGetCurrentUsername() {
    // Arrange, Act and Assert
    assertNull(SubjectTools.getCurrentUsername());
  }
}

