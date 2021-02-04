package org.finos.legend.engine.language.pure.grammar.api.grammarToJson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Type;
import java.util.HashMap;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.finos.legend.engine.shared.core.operational.errorManagement.ExceptionError;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.Test;

public class TransformGrammarToJsonDiffblueTest {
  @Test
  public void testTransformGrammarToJson() {
    // Arrange
    TransformGrammarToJson transformGrammarToJson = new TransformGrammarToJson();

    // Act
    Response actualTransformGrammarToJsonResult = transformGrammarToJson
        .transformGrammarToJson(new GrammarToJsonInput(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=200, reason=OK, hasEntity=true, closed=false, buffered=false}",
        actualTransformGrammarToJsonResult.toString());
    assertEquals(200, actualTransformGrammarToJsonResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualTransformGrammarToJsonResult).getContext();
    assertNull(context.getLanguage());
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertFalse(context.isCommitted());
    MediaType expectedMediaType = actualTransformGrammarToJsonResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
    assertTrue(context.hasEntity());
    assertEquals(1, actualTransformGrammarToJsonResult.getHeaders().get("Content-Type").size());
  }

  @Test
  public void testTransformGrammarToJson2() {
    // Arrange and Act
    Response actualTransformGrammarToJsonResult = (new TransformGrammarToJson()).transformGrammarToJson(null, null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualTransformGrammarToJsonResult.toString());
    assertEquals(500, actualTransformGrammarToJsonResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualTransformGrammarToJsonResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualTransformGrammarToJsonResult.getEntity()).status);
    assertEquals("NullPointerException: ",
        ((ExceptionError) actualTransformGrammarToJsonResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualTransformGrammarToJsonResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualTransformGrammarToJsonResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualTransformGrammarToJsonResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  public void testTransformGrammarToJson3() {
    // Arrange
    TransformGrammarToJson transformGrammarToJson = new TransformGrammarToJson();

    // Act
    Response actualTransformGrammarToJsonResult = transformGrammarToJson
        .transformGrammarToJson(new GrammarToJsonInput(new HashMap<String, String>()), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=200, reason=OK, hasEntity=true, closed=false, buffered=false}",
        actualTransformGrammarToJsonResult.toString());
    assertEquals(200, actualTransformGrammarToJsonResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualTransformGrammarToJsonResult).getContext();
    assertNull(context.getLanguage());
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertFalse(context.isCommitted());
    MediaType expectedMediaType = actualTransformGrammarToJsonResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
    assertTrue(context.hasEntity());
    assertEquals(1, actualTransformGrammarToJsonResult.getHeaders().get("Content-Type").size());
  }

  @Test
  public void testTransformGrammarToJson4() {
    // Arrange
    TransformGrammarToJson transformGrammarToJson = new TransformGrammarToJson();

    // Act
    Response actualTransformGrammarToJsonResult = transformGrammarToJson
        .transformGrammarToJson(new GrammarToJsonInput(null), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualTransformGrammarToJsonResult.toString());
    assertEquals(500, actualTransformGrammarToJsonResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualTransformGrammarToJsonResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualTransformGrammarToJsonResult.getEntity()).status);
    assertEquals("NullPointerException: ",
        ((ExceptionError) actualTransformGrammarToJsonResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualTransformGrammarToJsonResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualTransformGrammarToJsonResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualTransformGrammarToJsonResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }
}

