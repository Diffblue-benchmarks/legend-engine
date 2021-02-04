package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.fileGeneration;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class FileGenerationSpecificationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    FileGenerationSpecification actualFileGenerationSpecification = new FileGenerationSpecification();

    // Assert
    List<String> stringList = actualFileGenerationSpecification.scopeElements;
    assertTrue(stringList.isEmpty());
    assertSame(stringList, actualFileGenerationSpecification.configurationProperties);
  }
}

