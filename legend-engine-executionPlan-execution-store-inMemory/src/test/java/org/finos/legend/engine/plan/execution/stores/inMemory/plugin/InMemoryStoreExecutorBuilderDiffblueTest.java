package org.finos.legend.engine.plan.execution.stores.inMemory.plugin;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class InMemoryStoreExecutorBuilderDiffblueTest {
  @Test
  public void testBuild() {
    // Arrange and Act
    InMemoryStoreExecutor actualBuildResult = (new InMemoryStoreExecutorBuilder()).build();

    // Assert
    assertSame(actualBuildResult.INSTANCE, actualBuildResult);
  }
}

