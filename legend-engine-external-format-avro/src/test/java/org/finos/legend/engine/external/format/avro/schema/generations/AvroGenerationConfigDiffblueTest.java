package org.finos.legend.engine.external.format.avro.schema.generations;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class AvroGenerationConfigDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    AvroGenerationConfig actualAvroGenerationConfig = new AvroGenerationConfig();

    // Assert
    List<String> stringList = actualAvroGenerationConfig.scopeElements;
    assertTrue(stringList.isEmpty());
    assertTrue(
        actualAvroGenerationConfig.namespaceOverride instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertSame(stringList, actualAvroGenerationConfig.propertyProfile);
  }
}

