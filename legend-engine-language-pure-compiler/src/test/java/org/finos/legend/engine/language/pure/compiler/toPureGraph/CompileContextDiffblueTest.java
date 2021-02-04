package org.finos.legend.engine.language.pure.compiler.toPureGraph;

import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.finos.legend.engine.language.pure.compiler.Compiler;
import org.finos.legend.engine.protocol.pure.v1.model.context.PureModelContextData;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.PackageableConnection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.section.DefaultCodeSection;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.section.ImportAwareCodeSection;
import org.finos.legend.engine.shared.core.deployment.DeploymentMode;
import org.junit.Test;
import org.pac4j.core.profile.CommonProfile;

public class CompileContextDiffblueTest {
  @Test
  public void testBuilderWithElement() {
    // Arrange
    PureModelContextData model = PureModelContextData.newPureModelContextData();
    CompileContext.Builder builder = new CompileContext.Builder(
        Compiler.compile(model, DeploymentMode.INT, new ArrayList<CommonProfile>(), "java.text"));

    // Act and Assert
    assertSame(builder, builder.withElement("Element Path"));
  }

  @Test
  public void testBuilderWithElement2() {
    // Arrange
    PureModelContextData pure = PureModelContextData.newPureModelContextData();
    CompileContext.Builder builder = new CompileContext.Builder(
        new PureModel(pure, new ArrayList<CommonProfile>(), DeploymentMode.INT));

    // Act and Assert
    assertSame(builder, builder.withElement("Element Path"));
  }

  @Test
  public void testBuilderWithElement3() {
    // Arrange
    PureModelContextData model = PureModelContextData.newPureModelContextData();
    CompileContext.Builder builder = new CompileContext.Builder(
        Compiler.compile(model, DeploymentMode.INT, new ArrayList<CommonProfile>(), "java.text"));

    // Act and Assert
    assertSame(builder, builder.withElement(new PackageableConnection()));
  }

  @Test
  public void testBuilderWithSection() {
    // Arrange
    PureModelContextData model = PureModelContextData.newPureModelContextData();
    CompileContext.Builder builder = new CompileContext.Builder(
        Compiler.compile(model, DeploymentMode.INT, new ArrayList<CommonProfile>(), "java.text"));

    // Act and Assert
    assertSame(builder, builder.withSection(new DefaultCodeSection()));
  }

  @Test
  public void testBuilderWithSection2() {
    // Arrange
    PureModelContextData model = PureModelContextData.newPureModelContextData();
    CompileContext.Builder builder = new CompileContext.Builder(
        Compiler.compile(model, DeploymentMode.INT, new ArrayList<CommonProfile>(), "java.text"));

    // Act and Assert
    assertSame(builder, builder.withSection(new ImportAwareCodeSection()));
  }
}

