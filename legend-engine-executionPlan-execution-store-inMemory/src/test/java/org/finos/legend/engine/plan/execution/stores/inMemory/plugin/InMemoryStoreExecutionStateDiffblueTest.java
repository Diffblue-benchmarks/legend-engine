package org.finos.legend.engine.plan.execution.stores.inMemory.plugin;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.collections.impl.list.mutable.MultiReaderFastList;
import org.finos.legend.engine.plan.execution.nodes.state.ExecutionState;
import org.finos.legend.engine.plan.execution.result.Result;
import org.finos.legend.engine.plan.execution.stores.StoreExecutionState;
import org.junit.Test;
import org.pac4j.core.profile.CommonProfile;

public class InMemoryStoreExecutionStateDiffblueTest {
  @Test
  public void testGetVisitor() {
    // Arrange
    InMemoryStoreExecutionState inMemoryStoreExecutionState = new InMemoryStoreExecutionState(new InMemoryStoreState());
    MultiReaderFastList<CommonProfile> profiles = new MultiReaderFastList<CommonProfile>();
    HashMap<String, Result> res = new HashMap<String, Result>();
    ArrayList<String> templateFunctions = new ArrayList<String>();

    // Act and Assert
    assertTrue(((InMemoryExecutionNodeExecutor) inMemoryStoreExecutionState.getVisitor(profiles, new ExecutionState(res,
        templateFunctions, new ArrayList<StoreExecutionState>()))).pm instanceof MultiReaderFastList);
  }

  @Test
  public void testCopy() {
    // Arrange
    InMemoryStoreState inMemoryStoreState = new InMemoryStoreState();

    // Act and Assert
    assertSame(inMemoryStoreState, (new InMemoryStoreExecutionState(inMemoryStoreState)).copy().getStoreState());
  }
}

