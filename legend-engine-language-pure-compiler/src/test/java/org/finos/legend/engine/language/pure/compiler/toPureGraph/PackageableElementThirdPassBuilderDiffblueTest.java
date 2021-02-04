package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertNull;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.PackageableConnection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Enumeration;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Function;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Measure;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Profile;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.runtime.PackageableRuntime;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.section.SectionIndex;
import org.junit.Test;

public class PackageableElementThirdPassBuilderDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    PackageableElementThirdPassBuilder packageableElementThirdPassBuilder = new PackageableElementThirdPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementThirdPassBuilder.visit(new PackageableConnection()));
  }

  @Test
  public void testVisit2() {
    // Arrange
    PackageableElementThirdPassBuilder packageableElementThirdPassBuilder = new PackageableElementThirdPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementThirdPassBuilder.visit(new Enumeration()));
  }

  @Test
  public void testVisit3() {
    // Arrange
    PackageableElementThirdPassBuilder packageableElementThirdPassBuilder = new PackageableElementThirdPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementThirdPassBuilder.visit(new Function()));
  }

  @Test
  public void testVisit4() {
    // Arrange
    PackageableElementThirdPassBuilder packageableElementThirdPassBuilder = new PackageableElementThirdPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementThirdPassBuilder.visit(new Measure()));
  }

  @Test
  public void testVisit5() {
    // Arrange
    PackageableElementThirdPassBuilder packageableElementThirdPassBuilder = new PackageableElementThirdPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementThirdPassBuilder.visit(new Profile()));
  }

  @Test
  public void testVisit6() {
    // Arrange
    PackageableElementThirdPassBuilder packageableElementThirdPassBuilder = new PackageableElementThirdPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementThirdPassBuilder.visit(new PackageableRuntime()));
  }

  @Test
  public void testVisit7() {
    // Arrange
    PackageableElementThirdPassBuilder packageableElementThirdPassBuilder = new PackageableElementThirdPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementThirdPassBuilder.visit(new SectionIndex()));
  }
}

