package org.finos.legend.engine.shared.core.operational.logs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;
import org.pac4j.core.profile.CommonProfile;

public class LogInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    LogInfo actualLogInfo = new LogInfo(new ArrayList<CommonProfile>(), LoggingEventType.SERVER_START);

    // Assert
    assertNull(actualLogInfo.mode);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }

  @Test
  public void testConstructor10() {
    // Arrange
    ArrayList<CommonProfile> commonProfileList = new ArrayList<CommonProfile>();
    commonProfileList.add(new CommonProfile());

    // Act
    LogInfo actualLogInfo = new LogInfo(commonProfileList, LoggingEventType.SERVER_START,
        "Not all who wander are lost");

    // Assert
    assertNull(actualLogInfo.mode);
    assertEquals("Not all who wander are lost", actualLogInfo.message);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<CommonProfile> commonProfileList = new ArrayList<CommonProfile>();
    commonProfileList.add(new CommonProfile());

    // Act
    LogInfo actualLogInfo = new LogInfo(commonProfileList, LoggingEventType.SERVER_START);

    // Assert
    assertNull(actualLogInfo.mode);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    LogInfo actualLogInfo = new LogInfo(new ArrayList<CommonProfile>(), LoggingEventType.SERVER_START, 10.0);

    // Assert
    assertEquals(10.0, actualLogInfo.duration, 0.0);
    assertNull(actualLogInfo.mode);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }

  @Test
  public void testConstructor4() {
    // Arrange
    ArrayList<CommonProfile> commonProfileList = new ArrayList<CommonProfile>();
    commonProfileList.add(new CommonProfile());

    // Act
    LogInfo actualLogInfo = new LogInfo(commonProfileList, LoggingEventType.SERVER_START, 10.0);

    // Assert
    assertEquals(10.0, actualLogInfo.duration, 0.0);
    assertNull(actualLogInfo.mode);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }

  @Test
  public void testConstructor5() {
    // Arrange and Act
    LogInfo actualLogInfo = new LogInfo(new ArrayList<CommonProfile>(), LoggingEventType.SERVER_START, (Object) "info");

    // Assert
    assertNull(actualLogInfo.mode);
    assertTrue(actualLogInfo.info instanceof String);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }

  @Test
  public void testConstructor6() {
    // Arrange
    ArrayList<CommonProfile> commonProfileList = new ArrayList<CommonProfile>();
    commonProfileList.add(new CommonProfile());

    // Act
    LogInfo actualLogInfo = new LogInfo(commonProfileList, LoggingEventType.SERVER_START, (Object) "info");

    // Assert
    assertNull(actualLogInfo.mode);
    assertTrue(actualLogInfo.info instanceof String);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }

  @Test
  public void testConstructor7() {
    // Arrange and Act
    LogInfo actualLogInfo = new LogInfo(new ArrayList<CommonProfile>(), LoggingEventType.SERVER_START, "info", 10.0);

    // Assert
    assertEquals(10.0, actualLogInfo.duration, 0.0);
    assertNull(actualLogInfo.mode);
    assertTrue(actualLogInfo.info instanceof String);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }

  @Test
  public void testConstructor8() {
    // Arrange
    ArrayList<CommonProfile> commonProfileList = new ArrayList<CommonProfile>();
    commonProfileList.add(new CommonProfile());

    // Act
    LogInfo actualLogInfo = new LogInfo(commonProfileList, LoggingEventType.SERVER_START, "info", 10.0);

    // Assert
    assertEquals(10.0, actualLogInfo.duration, 0.0);
    assertNull(actualLogInfo.mode);
    assertTrue(actualLogInfo.info instanceof String);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }

  @Test
  public void testConstructor9() {
    // Arrange and Act
    LogInfo actualLogInfo = new LogInfo(new ArrayList<CommonProfile>(), LoggingEventType.SERVER_START,
        "Not all who wander are lost");

    // Assert
    assertNull(actualLogInfo.mode);
    assertEquals("Not all who wander are lost", actualLogInfo.message);
    assertEquals(LoggingEventType.SERVER_START, actualLogInfo.eventType);
    assertEquals("_UNKNOWN_", actualLogInfo.user);
  }
}

