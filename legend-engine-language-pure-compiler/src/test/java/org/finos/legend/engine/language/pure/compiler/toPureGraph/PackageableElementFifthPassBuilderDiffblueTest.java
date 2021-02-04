package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertNull;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.PackageableConnection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Association;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Class;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Enumeration;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Function;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Measure;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.domain.Profile;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.mapping.Mapping;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.runtime.PackageableRuntime;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.section.SectionIndex;
import org.junit.Test;

public class PackageableElementFifthPassBuilderDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new PackageableConnection()));
  }

  @Test
  public void testVisit10() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new SectionIndex()));
  }

  @Test
  public void testVisit2() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new Association()));
  }

  @Test
  public void testVisit3() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new Class()));
  }

  @Test
  public void testVisit4() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new Enumeration()));
  }

  @Test
  public void testVisit5() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new Function()));
  }

  @Test
  public void testVisit6() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new Measure()));
  }

  @Test
  public void testVisit7() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new Profile()));
  }

  @Test
  public void testVisit8() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new Mapping()));
  }

  @Test
  public void testVisit9() {
    // Arrange
    PackageableElementFifthPassBuilder packageableElementFifthPassBuilder = new PackageableElementFifthPassBuilder(
        null);

    // Act and Assert
    assertNull(packageableElementFifthPassBuilder.visit(new PackageableRuntime()));
  }
}

