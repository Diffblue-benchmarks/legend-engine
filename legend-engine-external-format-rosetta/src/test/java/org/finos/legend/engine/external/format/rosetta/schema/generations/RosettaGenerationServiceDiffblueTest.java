package org.finos.legend.engine.external.format.rosetta.schema.generations;

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

public class RosettaGenerationServiceDiffblueTest {
  @Test
  public void testGenerateCdm() {
    // Arrange
    RosettaGenerationService rosettaGenerationService = new RosettaGenerationService(
        new ModelManager(DeploymentMode.INT));

    // Act
    Response actualGenerateCdmResult = rosettaGenerationService.generateCdm(new RosettaGenerationInput(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualGenerateCdmResult.toString());
    assertEquals(500, actualGenerateCdmResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualGenerateCdmResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualGenerateCdmResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualGenerateCdmResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualGenerateCdmResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualGenerateCdmResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualGenerateCdmResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  public void testGenerateCdm2() {
    // Arrange
    RosettaGenerationService rosettaGenerationService = new RosettaGenerationService(new ModelManager(null));

    // Act
    Response actualGenerateCdmResult = rosettaGenerationService.generateCdm(new RosettaGenerationInput(), null);

    // Assert
    assertEquals("OutboundJaxrsResponse{status=500, reason=Internal Server Error, hasEntity=true, closed=false,"
        + " buffered=false}", actualGenerateCdmResult.toString());
    assertEquals(500, actualGenerateCdmResult.getStatus());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualGenerateCdmResult).getContext();
    Type entityType = context.getEntityType();
    assertTrue(entityType instanceof Class);
    assertEquals(0, context.getEntityAnnotations().length);
    assertSame(entityType, context.getEntityClass());
    assertEquals(-1, context.getLength());
    assertFalse(context.isCommitted());
    assertEquals("error", ((ExceptionError) actualGenerateCdmResult.getEntity()).status);
    assertEquals("NullPointerException: ", ((ExceptionError) actualGenerateCdmResult.getEntity()).getMessage());
    assertEquals(-1, ((ExceptionError) actualGenerateCdmResult.getEntity()).getCode());
    assertNull(((ExceptionError) actualGenerateCdmResult.getEntity()).generationInfo);
    MediaType expectedMediaType = actualGenerateCdmResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }
}

