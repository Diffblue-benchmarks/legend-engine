package org.finos.legend.engine.language.pure.compiler.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Type;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.finos.legend.engine.language.pure.modelManager.ModelManager;
import org.finos.legend.engine.protocol.pure.v1.model.SourceInformation;
import org.finos.legend.engine.protocol.pure.v1.model.context.EngineErrorType;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextPointer;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextText;
import org.finos.legend.engine.shared.core.deployment.DeploymentMode;
import org.finos.legend.engine.shared.core.operational.errorManagement.EngineException;
import org.finos.legend.engine.shared.core.operational.errorManagement.ExceptionError;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.Test;

public class CompileDiffblueTest {
  @Test
  public void testCompile() {
    // Arrange
    Compile compile = new Compile(new ModelManager(DeploymentMode.INT));

    // Act
    Response actualCompileResult = compile.compile(new PureModelContextPointer(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualCompileResult.toString());
    assertEquals(500, actualCompileResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualCompileResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualCompileResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualCompileResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualCompileResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualCompileResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualCompileResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  public void testCompile2() {
    // Arrange and Act
    Response actualCompileResult = (new Compile(new ModelManager(DeploymentMode.INT))).compile(null, null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualCompileResult.toString());
    assertEquals(500, actualCompileResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualCompileResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualCompileResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualCompileResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualCompileResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualCompileResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualCompileResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  public void testCompile3() {
    // Arrange
    Compile compile = new Compile(new ModelManager(DeploymentMode.INT));

    // Act
    Response actualCompileResult = compile.compile(new PureModelContextText(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=400, reason=Bad Request, hasEntity=true, closed=false, buffered=false}",
        actualCompileResult.toString());
    assertEquals(400, actualCompileResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualCompileResult).getContext();
    assertNull(context.getEntityTag());
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertFalse(context.isCommitted());
    assertEquals(EngineErrorType.PARSER, ((EngineException) actualCompileResult.getEntity()).getErrorType());
    SourceInformation sourceInformation = ((EngineException) actualCompileResult.getEntity()).getSourceInformation();
    assertEquals(1, sourceInformation.startColumn);
    assertEquals("", sourceInformation.sourceId);
    assertEquals(1, sourceInformation.endLine);
    assertEquals(4, sourceInformation.endColumn);
    assertEquals(1, sourceInformation.startLine);
  }

  @Test
  public void testCompile4() {
    // Arrange and Act
    Response actualCompileResult = (new Compile(null)).compile(null, null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualCompileResult.toString());
    assertEquals(500, actualCompileResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualCompileResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualCompileResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualCompileResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualCompileResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualCompileResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualCompileResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  public void testLambdaReturnType() {
    // Arrange
    Compile compile = new Compile(new ModelManager(DeploymentMode.INT));

    // Act
    Response actualLambdaReturnTypeResult = compile.lambdaReturnType(new LambdaReturnTypeInput(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualLambdaReturnTypeResult.toString());
    assertEquals(500, actualLambdaReturnTypeResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualLambdaReturnTypeResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualLambdaReturnTypeResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualLambdaReturnTypeResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualLambdaReturnTypeResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualLambdaReturnTypeResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualLambdaReturnTypeResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  public void testLambdaReturnType2() {
    // Arrange
    Compile compile = new Compile(null);

    // Act
    Response actualLambdaReturnTypeResult = compile.lambdaReturnType(new LambdaReturnTypeInput(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualLambdaReturnTypeResult.toString());
    assertEquals(500, actualLambdaReturnTypeResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualLambdaReturnTypeResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualLambdaReturnTypeResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualLambdaReturnTypeResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualLambdaReturnTypeResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualLambdaReturnTypeResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualLambdaReturnTypeResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  public void testLambdaReturnType3() {
    // Arrange and Act
    Response actualLambdaReturnTypeResult = (new Compile(new ModelManager(DeploymentMode.INT))).lambdaReturnType(null,
        null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualLambdaReturnTypeResult.toString());
    assertEquals(500, actualLambdaReturnTypeResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualLambdaReturnTypeResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualLambdaReturnTypeResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualLambdaReturnTypeResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualLambdaReturnTypeResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualLambdaReturnTypeResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualLambdaReturnTypeResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }
}

