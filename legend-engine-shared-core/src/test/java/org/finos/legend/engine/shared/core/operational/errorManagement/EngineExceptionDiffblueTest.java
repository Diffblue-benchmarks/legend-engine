package org.finos.legend.engine.shared.core.operational.errorManagement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.finos.legend.engine.protocol.pure.v1.model.SourceInformation;
import org.finos.legend.engine.protocol.pure.v1.model.context.EngineErrorType;
import org.junit.Test;

public class EngineExceptionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new EngineException("An error occurred")).getErrorType());
    assertNull((new EngineException("An error occurred", new Exception())).getErrorType());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    SourceInformation sourceInformation = new SourceInformation();

    // Act
    EngineException actualEngineException = new EngineException("An error occurred", sourceInformation,
        new Throwable());

    // Assert
    assertNull(actualEngineException.getErrorType());
    assertSame(sourceInformation, actualEngineException.getSourceInformation());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    SourceInformation sourceInformation = new SourceInformation();

    // Act
    EngineException actualEngineException = new EngineException("An error occurred", sourceInformation,
        EngineErrorType.PARSER);

    // Assert
    assertEquals(EngineErrorType.PARSER, actualEngineException.getErrorType());
    assertSame(sourceInformation, actualEngineException.getSourceInformation());
  }

  @Test
  public void testConstructor4() {
    // Arrange
    SourceInformation sourceInformation = new SourceInformation();

    // Act
    EngineException actualEngineException = new EngineException("An error occurred", sourceInformation,
        EngineErrorType.PARSER, new Throwable());

    // Assert
    assertEquals(EngineErrorType.PARSER, actualEngineException.getErrorType());
    assertSame(sourceInformation, actualEngineException.getSourceInformation());
  }

  @Test
  public void testFindException() {
    // Arrange, Act and Assert
    assertNull(EngineException.findException(new Throwable()));
  }

  @Test
  public void testBuildPrettyErrorMessage() {
    // Arrange, Act and Assert
    assertEquals("PARSER error: An error occurred",
        EngineException.buildPrettyErrorMessage("An error occurred", null, EngineErrorType.PARSER));
    assertEquals("PARSER error at [2:1-3:3]: An error occurred", EngineException
        .buildPrettyErrorMessage("An error occurred", new SourceInformation("42", 2, 1, 3, 3), EngineErrorType.PARSER));
    assertEquals("PARSER error", EngineException.buildPrettyErrorMessage(null, null, EngineErrorType.PARSER));
    assertEquals(": An error occurred", EngineException.buildPrettyErrorMessage("An error occurred", null, null));
  }
}

