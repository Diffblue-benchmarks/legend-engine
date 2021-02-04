package org.finos.legend.engine.shared.core.kerberos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import javax.security.auth.Subject;
import org.junit.Test;

public class SubjectCacheDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Subject subject = new Subject();

    // Act and Assert
    assertSame(subject, (new SubjectCache(subject)).getSubject());
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertTrue((new SubjectCache(new Subject())).isValid());
    assertFalse((new SubjectCache(null)).isValid());
  }
}

