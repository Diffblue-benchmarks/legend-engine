package org.finos.legend.engine.shared.core.api.result;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class ConstantResultHelperDiffblueTest {
  @Test
  public void testStream() throws IOException {
    // Arrange, Act and Assert
    assertEquals("\"value\"", ConstantResultHelper.stream("value"));
    assertEquals("42", ConstantResultHelper.stream(42));
  }
}

