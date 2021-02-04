package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertNull;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.PackageableConnection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Association;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Enumeration;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Function;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Measure;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Profile;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.runtime.PackageableRuntime;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.section.SectionIndex;
import org.junit.Test;

public class PackageableElementFourthPassBuilderDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    PackageableElementFourthPassBuilder packageableElementFourthPassBuilder = new PackageableElementFourthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFourthPassBuilder.visit(new PackageableConnection()));
  }

  @Test
  public void testVisit2() {
    // Arrange
    PackageableElementFourthPassBuilder packageableElementFourthPassBuilder = new PackageableElementFourthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFourthPassBuilder.visit(new Association()));
  }

  @Test
  public void testVisit3() {
    // Arrange
    PackageableElementFourthPassBuilder packageableElementFourthPassBuilder = new PackageableElementFourthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFourthPassBuilder.visit(new Enumeration()));
  }

  @Test
  public void testVisit4() {
    // Arrange
    PackageableElementFourthPassBuilder packageableElementFourthPassBuilder = new PackageableElementFourthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFourthPassBuilder.visit(new Function()));
  }

  @Test
  public void testVisit5() {
    // Arrange
    PackageableElementFourthPassBuilder packageableElementFourthPassBuilder = new PackageableElementFourthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFourthPassBuilder.visit(new Measure()));
  }

  @Test
  public void testVisit6() {
    // Arrange
    PackageableElementFourthPassBuilder packageableElementFourthPassBuilder = new PackageableElementFourthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFourthPassBuilder.visit(new Profile()));
  }

  @Test
  public void testVisit7() {
    // Arrange
    PackageableElementFourthPassBuilder packageableElementFourthPassBuilder = new PackageableElementFourthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFourthPassBuilder.visit(new PackageableRuntime()));
  }

  @Test
  public void testVisit8() {
    // Arrange
    PackageableElementFourthPassBuilder packageableElementFourthPassBuilder = new PackageableElementFourthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFourthPassBuilder.visit(new SectionIndex()));
  }
}

