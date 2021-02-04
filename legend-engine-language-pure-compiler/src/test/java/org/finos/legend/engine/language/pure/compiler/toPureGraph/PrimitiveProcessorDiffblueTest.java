package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.Test;

public class PrimitiveProcessorDiffblueTest {
  @Test
  public void testProcess() {
    // Arrange, Act and Assert
    assertEquals("o", PrimitiveProcessor.process("o"));
    assertEquals(0L, ((Long) PrimitiveProcessor.process(0)).longValue());
    assertNull(PrimitiveProcessor.process(null));
    assertEquals(10.0, ((Double) PrimitiveProcessor.process(10.0f)).doubleValue(), 0.0);
    assertTrue(PrimitiveProcessor
        .process(LocalDate.ofEpochDay(1L)) instanceof org.finos.legend.pure.m4.coreinstance.primitive.date.StrictDate);
    assertTrue(PrimitiveProcessor.process(LocalDateTime.of(1, 1, 1, 1,
        1)) instanceof org.finos.legend.pure.m4.coreinstance.primitive.date.DateWithMinute);
  }
}

