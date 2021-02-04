package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.section;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class DefaultCodeSectionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DefaultCodeSection actualDefaultCodeSection = new DefaultCodeSection();

    // Assert
    List<String> stringList = actualDefaultCodeSection.elements;
    assertTrue(stringList instanceof java.util.ArrayList);
    assertNull(actualDefaultCodeSection.parserName);
    assertTrue(stringList.isEmpty());
    assertNull(actualDefaultCodeSection.sourceInformation);
  }
}

