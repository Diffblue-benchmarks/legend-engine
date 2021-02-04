package org.finos.legend.engine.external.format.avro.schema.generations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Type;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.finos.legend.engine.language.pure.modelManager.ModelManager;
import org.finos.legend.engine.shared.core.deployment.DeploymentMode;
import org.finos.legend.engine.shared.core.operational.errorManagement.ExceptionError;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.Test;

public class AvroGenerationServiceDiffblueTest {
  @Test
  public void testGenerateAvro() {
    // Arrange
    AvroGenerationService avroGenerationService = new AvroGenerationService(new ModelManager(DeploymentMode.INT));

    // Act
    Response actualGenerateAvroResult = avroGenerationService.generateAvro(new AvroGenerationInput(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualGenerateAvroResult.toString());
    assertEquals(500, actualGenerateAvroResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualGenerateAvroResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualGenerateAvroResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualGenerateAvroResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualGenerateAvroResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualGenerateAvroResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualGenerateAvroResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  public void testGenerateAvro2() {
    // Arrange
    AvroGenerationService avroGenerationService = new AvroGenerationService(new ModelManager(null));

    // Act
    Response actualGenerateAvroResult = avroGenerationService.generateAvro(new AvroGenerationInput(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualGenerateAvroResult.toString());
    assertEquals(500, actualGenerateAvroResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualGenerateAvroResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualGenerateAvroResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualGenerateAvroResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualGenerateAvroResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualGenerateAvroResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualGenerateAvroResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }
}

