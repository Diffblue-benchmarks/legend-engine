package org.finos.legend.engine.protocol.pure.v1.model.packageableElement.store.modelToModel.mapping;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ObjectInputDataDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(ObjectInputType.JSON, (new ObjectInputData()).inputType);
  }
}

