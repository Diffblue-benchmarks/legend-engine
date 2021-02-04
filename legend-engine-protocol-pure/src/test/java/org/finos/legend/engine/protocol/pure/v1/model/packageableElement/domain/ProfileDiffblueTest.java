package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class ProfileDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Profile actualProfile = new Profile();

    // Assert
    List<String> stringList = actualProfile.tags;
    assertTrue(stringList.isEmpty());
    assertSame(stringList, actualProfile.stereotypes);
  }
}

