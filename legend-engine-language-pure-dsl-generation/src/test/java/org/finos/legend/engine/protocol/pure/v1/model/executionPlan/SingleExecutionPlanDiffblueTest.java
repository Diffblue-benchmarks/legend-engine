package org.finos.legend.engine.protocol.pure.v1.model.executionPlan;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.eclipse.collections.impl.block.function.CaseFunction;
import org.junit.Test;

public class SingleExecutionPlanDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new SingleExecutionPlan()).templateFunctions.isEmpty());
  }

  @Test
  public void testGetSingleExecutionPlan() {
    // Arrange
    SingleExecutionPlan singleExecutionPlan = new SingleExecutionPlan();

    // Act and Assert
    assertSame(singleExecutionPlan, singleExecutionPlan.getSingleExecutionPlan(new HashMap<String, Object>()));
  }

  @Test
  public void testGetSingleExecutionPlan2() {
    // Arrange
    SingleExecutionPlan singleExecutionPlan = new SingleExecutionPlan();

    // Act and Assert
    assertSame(singleExecutionPlan, singleExecutionPlan.getSingleExecutionPlan(new CaseFunction<String, Object>()));
  }
}

