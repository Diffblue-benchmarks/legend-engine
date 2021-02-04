package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertNull;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.PackageableConnection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Enumeration;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Profile;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.runtime.PackageableRuntime;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.section.SectionIndex;
import org.junit.Test;

public class PackageableElementSecondPassBuilderDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    PackageableElementSecondPassBuilder packageableElementSecondPassBuilder = new PackageableElementSecondPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementSecondPassBuilder.visit(new PackageableConnection()));
  }

  @Test
  public void testVisit2() {
    // Arrange
    PackageableElementSecondPassBuilder packageableElementSecondPassBuilder = new PackageableElementSecondPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementSecondPassBuilder.visit(new Enumeration()));
  }

  @Test
  public void testVisit3() {
    // Arrange
    PackageableElementSecondPassBuilder packageableElementSecondPassBuilder = new PackageableElementSecondPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementSecondPassBuilder.visit(new Profile()));
  }

  @Test
  public void testVisit4() {
    // Arrange
    PackageableElementSecondPassBuilder packageableElementSecondPassBuilder = new PackageableElementSecondPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementSecondPassBuilder.visit(new PackageableRuntime()));
  }

  @Test
  public void testVisit5() {
    // Arrange
    PackageableElementSecondPassBuilder packageableElementSecondPassBuilder = new PackageableElementSecondPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementSecondPassBuilder.visit(new SectionIndex()));
  }
}

