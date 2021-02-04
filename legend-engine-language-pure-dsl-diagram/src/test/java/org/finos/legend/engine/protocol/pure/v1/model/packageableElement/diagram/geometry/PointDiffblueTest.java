package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.diagram.geometry;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PointDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Point actualPoint = new Point(2.0, 3.0);

    // Assert
    assertEquals(3.0, actualPoint.y, 0.0);
    assertEquals(2.0, actualPoint.x, 0.0);
  }
}

