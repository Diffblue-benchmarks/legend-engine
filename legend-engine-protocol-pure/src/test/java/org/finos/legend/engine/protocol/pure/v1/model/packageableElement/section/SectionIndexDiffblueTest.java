package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.section;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class SectionIndexDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    SectionIndex actualSectionIndex = new SectionIndex();

    // Assert
    assertNull(actualSectionIndex.getPath());
    assertNull(actualSectionIndex.name);
    assertNull(actualSectionIndex.sourceInformation);
    List<Section> sectionList = actualSectionIndex.sections;
    assertTrue(sectionList instanceof java.util.ArrayList);
    assertNull(actualSectionIndex._package);
    assertTrue(sectionList.isEmpty());
  }
}

