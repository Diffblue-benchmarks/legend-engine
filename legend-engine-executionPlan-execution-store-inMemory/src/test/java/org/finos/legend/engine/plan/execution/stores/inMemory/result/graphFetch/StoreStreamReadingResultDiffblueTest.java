package org.finos.legend.engine.plan.execution.stores.inMemory.result.graphFetch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StoreStreamReadingResultDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    StoreStreamReadingResult<Object> actualStoreStreamReadingResult = new StoreStreamReadingResult<Object>(null);

    // Assert
    assertNull(actualStoreStreamReadingResult.getObjectsIterator());
    assertEquals("success", actualStoreStreamReadingResult.status);
    assertTrue(actualStoreStreamReadingResult.activities instanceof org.eclipse.collections.impl.list.mutable.FastList);
    assertNull(actualStoreStreamReadingResult.generationInfo);
  }
}

