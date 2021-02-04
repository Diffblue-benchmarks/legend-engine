package org.finos.legend.engine.protocol.pure.v1.model.executionPlan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class CompositeExecutionPlanDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    CompositeExecutionPlan actualCompositeExecutionPlan = new CompositeExecutionPlan();

    // Assert
    assertTrue(
        actualCompositeExecutionPlan.executionPlans instanceof org.eclipse.collections.impl.map.mutable.UnifiedMap);
    assertTrue(actualCompositeExecutionPlan.executionKeys.isEmpty());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    HashMap<String, SingleExecutionPlan> executionPlans = new HashMap<String, SingleExecutionPlan>();

    // Act and Assert
    assertEquals("Execution Key Name",
        (new CompositeExecutionPlan(executionPlans, "Execution Key Name", new ArrayList<String>())).executionKeyName);
  }
}

