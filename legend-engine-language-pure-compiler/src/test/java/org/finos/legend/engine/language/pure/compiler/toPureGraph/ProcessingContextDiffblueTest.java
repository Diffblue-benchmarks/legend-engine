package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Stack;
import org.junit.Test;

public class ProcessingContextDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ProcessingContext actualProcessingContext = new ProcessingContext("First Tag");

    // Assert
    Stack<String> stack = actualProcessingContext.getStack();
    assertEquals(1, stack.size());
    assertEquals("First Tag", stack.get(0));
    assertTrue(
        actualProcessingContext.inferredVariableList instanceof org.eclipse.collections.impl.list.mutable.FastList);
  }
}

