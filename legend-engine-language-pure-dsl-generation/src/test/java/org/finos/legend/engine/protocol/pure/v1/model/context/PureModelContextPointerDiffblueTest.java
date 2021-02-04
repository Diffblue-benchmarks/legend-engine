package org.finos.legend.engine.protocol.pure.v1.model.context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PureModelContextPointerDiffblueTest {
  @Test
  public void testCombine() {
    // Arrange
    PureModelContextPointer pureModelContextPointer = new PureModelContextPointer();

    // Act
    PureModelContextPointer actualCombineResult = pureModelContextPointer.combine(new PureModelContextPointer());

    // Assert
    assertEquals(pureModelContextPointer, actualCombineResult);
    assertNull(actualCombineResult.serializer);
    assertNull(((PureSDLC) actualCombineResult.sdlcInfo).baseVersion);
    assertEquals("none", ((PureSDLC) actualCombineResult.sdlcInfo).version);
  }

  @Test
  public void testCombine2() {
    // Arrange
    PureModelContextPointer pureModelContextPointer = new PureModelContextPointer();

    // Act and Assert
    assertSame(pureModelContextPointer, pureModelContextPointer.combine(null));
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    SDLC sdlc = (new PureModelContextPointer()).sdlcInfo;
    assertTrue(sdlc instanceof PureSDLC);
    assertEquals("none", ((PureSDLC) sdlc).version);
    assertTrue(((PureSDLC) sdlc).packageableElementPointers.isEmpty());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new PureModelContextPointer()).equals("o"));
    assertFalse((new PureModelContextPointer()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(105004906, (new PureModelContextPointer()).hashCode());
  }

  @Test
  public void testSafeEqual() {
    // Arrange, Act and Assert
    assertFalse((new PureModelContextPointer()).safeEqual("o", "o2"));
    assertFalse((new PureModelContextPointer()).safeEqual(null, "o2"));
    assertTrue((new PureModelContextPointer()).safeEqual(null, null));
  }
}

