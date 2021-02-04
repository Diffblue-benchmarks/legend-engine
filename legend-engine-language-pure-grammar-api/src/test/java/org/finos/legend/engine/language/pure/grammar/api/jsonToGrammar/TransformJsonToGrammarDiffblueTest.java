package org.finos.legend.engine.language.pure.grammar.api.jsonToGrammar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Type;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.finos.legend.engine.shared.core.operational.errorManagement.ExceptionError;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.Test;

public class TransformJsonToGrammarDiffblueTest {
  @Test
  public void testTransformJsonToGrammar() {
    // Arrange
    TransformJsonToGrammar transformJsonToGrammar = new TransformJsonToGrammar();

    // Act
    Response actualTransformJsonToGrammarResult = transformJsonToGrammar
        .transformJsonToGrammar(new JsonToGrammarInput(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=200, reason=OK, hasEntity=true, closed=false, buffered=false}",
        actualTransformJsonToGrammarResult.toString());
    assertEquals(200, actualTransformJsonToGrammarResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualTransformJsonToGrammarResult).getContext();
    assertNull(context.getLanguage());
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertFalse(context.isCommitted());
    MediaType expectedMediaType = actualTransformJsonToGrammarResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
    assertTrue(context.hasEntity());
    assertEquals(1, actualTransformJsonToGrammarResult.getHeaders().get("Content-Type").size());
  }

  @Test
  public void testTransformJsonToGrammar2() {
    // Arrange and Act
    Response actualTransformJsonToGrammarResult = (new TransformJsonToGrammar()).transformJsonToGrammar(null, null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualTransformJsonToGrammarResult.toString());
    assertEquals(500, actualTransformJsonToGrammarResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualTransformJsonToGrammarResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualTransformJsonToGrammarResult.getEntity()).status);
    assertEquals("NullPointerException: ",
        ((ExceptionError) actualTransformJsonToGrammarResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualTransformJsonToGrammarResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualTransformJsonToGrammarResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualTransformJsonToGrammarResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  public void testTransformJsonToGrammar3() {
    // Arrange
    TransformJsonToGrammar transformJsonToGrammar = new TransformJsonToGrammar();

    // Act
    Response actualTransformJsonToGrammarResult = transformJsonToGrammar
        .transformJsonToGrammar(new JsonToGrammarInput(new LambdaInput()), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualTransformJsonToGrammarResult.toString());
    assertEquals(500, actualTransformJsonToGrammarResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualTransformJsonToGrammarResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualTransformJsonToGrammarResult.getEntity()).status);
    assertEquals("NullPointerException: ",
        ((ExceptionError) actualTransformJsonToGrammarResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualTransformJsonToGrammarResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualTransformJsonToGrammarResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualTransformJsonToGrammarResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }
}

