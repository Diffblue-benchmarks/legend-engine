package org.finos.legend.engine.shared.core.operational.errorManagement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ExceptionErrorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Throwable throwable = new Throwable();
    throwable
        .setStackTrace(new StackTraceElement[]{new StackTraceElement("Declaring Class", "Method Name", "foo.txt", 2)});

    // Act
    ExceptionError actualExceptionError = new ExceptionError(1, throwable);

    // Assert
    assertEquals("java.lang.Throwable\n\tat Declaring Class.Method Name(foo.txt:2)\n", actualExceptionError.getTrace());
    assertNull(actualExceptionError.generationInfo);
    assertEquals("error", actualExceptionError.status);
    assertEquals("Throwable: ", actualExceptionError.getMessage());
    assertEquals(1, actualExceptionError.getCode());
  }
}

