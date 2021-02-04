package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.diagram.geometry;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Rectangle actualRectangle = new Rectangle(10.0, 10.0);

    // Assert
    assertEquals(10.0, actualRectangle.width, 0.0);
    assertEquals(10.0, actualRectangle.height, 0.0);
  }
}

