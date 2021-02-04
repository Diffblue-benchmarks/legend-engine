package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.section;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class ImportAwareCodeSectionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ImportAwareCodeSection actualImportAwareCodeSection = new ImportAwareCodeSection();

    // Assert
    List<String> stringList = actualImportAwareCodeSection.elements;
    assertTrue(stringList instanceof java.util.ArrayList);
    assertNull(actualImportAwareCodeSection.parserName);
    assertTrue(stringList.isEmpty());
    List<String> stringList1 = actualImportAwareCodeSection.imports;
    assertTrue(stringList1 instanceof java.util.ArrayList);
    assertNull(actualImportAwareCodeSection.sourceInformation);
    assertTrue(stringList1.isEmpty());
  }
}

