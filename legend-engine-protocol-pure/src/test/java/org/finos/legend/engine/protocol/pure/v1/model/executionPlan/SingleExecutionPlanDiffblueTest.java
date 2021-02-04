package org.finos.legend.engine.protocol.pure.v1.model.executionPlan;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.eclipse.collections.impl.block.function.IfFunction;
import org.eclipse.collections.impl.block.predicate.DropIterablePredicate;
import org.junit.Test;

public class SingleExecutionPlanDiffblueTest {
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
    DropIterablePredicate<String> newPredicate = new DropIterablePredicate<String>(3);
    DropIterablePredicate<String> newPredicate1 = new DropIterablePredicate<String>(3);
    DropIterablePredicate<String> newPredicate2 = new DropIterablePredicate<String>(3);

    // Act and Assert
    assertSame(singleExecutionPlan,
        singleExecutionPlan.getSingleExecutionPlan(
            new IfFunction<String, Object>(newPredicate, new IfFunction<String, Object>(newPredicate1,
                new IfFunction<String, Object>(newPredicate2, new IfFunction<String, Object>(null, null))))));
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new SingleExecutionPlan()).templateFunctions.isEmpty());
  }
}

