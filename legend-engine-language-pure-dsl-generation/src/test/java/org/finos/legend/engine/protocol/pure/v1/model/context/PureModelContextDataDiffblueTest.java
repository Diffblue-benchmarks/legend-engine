package org.finos.legend.engine.protocol.pure.v1.model.context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.PackageableElement;
import org.finos.legend.engine.protocol.pure.v1.model.packageableElement.connection.PackageableConnection;
import org.junit.Test;

public class PureModelContextDataDiffblueTest {
  @Test
  public void testBuilderAddElement() {
    // Arrange
    PureModelContextData.Builder newBuilderResult = PureModelContextData.newBuilder();

    // Act and Assert
    assertTrue(newBuilderResult.addElement(new PackageableConnection()));
  }

  @Test
  public void testBuilderAddElements() {
    // Arrange
    PureModelContextData.Builder newBuilderResult = PureModelContextData.newBuilder();

    // Act and Assert
    assertFalse(newBuilderResult.addElements(new ArrayList<PackageableElement>()));
  }

  @Test
  public void testBuilderAddElements2() {
    // Arrange
    PureModelContextData.Builder newBuilderResult = PureModelContextData.newBuilder();

    ArrayList<PackageableElement> packageableElementList = new ArrayList<PackageableElement>();
    packageableElementList.add(new PackageableConnection());

    // Act and Assert
    assertTrue(newBuilderResult.addElements(packageableElementList));
  }

  @Test
  public void testBuilderBuild() {
    // Arrange and Act
    PureModelContextData actualBuildResult = PureModelContextData.newBuilder().build();

    // Assert
    assertNull(actualBuildResult.getOrigin());
    assertNull(actualBuildResult.getSerializer());
  }

  @Test
  public void testBuilderRemoveDuplicates() {
    // Arrange, Act and Assert
    assertFalse(PureModelContextData.newBuilder().removeDuplicates());
  }

  @Test
  public void testCombine() {
    // Arrange
    PureModelContextData newPureModelContextDataResult = PureModelContextData.newPureModelContextData();

    // Act
    PureModelContextData actualCombineResult = newPureModelContextDataResult
        .combine(PureModelContextData.newPureModelContextData());

    // Assert
    assertNull(actualCombineResult.getOrigin());
    assertNull(actualCombineResult.getSerializer());
  }

  @Test
  public void testCombine2() {
    // Arrange
    PureModelContextData data1 = PureModelContextData.newPureModelContextData();

    // Act
    PureModelContextData actualCombineResult = PureModelContextData.combine(data1,
        PureModelContextData.newPureModelContextData());

    // Assert
    assertNull(actualCombineResult.getOrigin());
    assertNull(actualCombineResult.getSerializer());
  }

  @Test
  public void testCombine3() {
    // Arrange
    PureModelContextData data1 = PureModelContextData.newPureModelContextData();
    PureModelContextData data2 = PureModelContextData.newPureModelContextData();

    // Act
    PureModelContextData actualCombineResult = PureModelContextData.combine(data1, data2,
        PureModelContextData.newPureModelContextData());

    // Assert
    assertNull(actualCombineResult.getOrigin());
    assertNull(actualCombineResult.getSerializer());
  }

  @Test
  public void testCombine4() {
    // Arrange
    PureModelContextData data1 = PureModelContextData.newPureModelContextData();

    // Act
    PureModelContextData actualCombineResult = PureModelContextData.combine(data1,
        PureModelContextData.newPureModelContextData(), null);

    // Assert
    assertNull(actualCombineResult.getOrigin());
    assertNull(actualCombineResult.getSerializer());
  }

  @Test
  public void testCombine5() {
    // Arrange
    PureModelContextData data1 = PureModelContextData.newPureModelContextData();

    // Act
    PureModelContextData actualCombineResult = PureModelContextData.combine(data1,
        PureModelContextData.newPureModelContextData());

    // Assert
    assertNull(actualCombineResult.getOrigin());
    assertNull(actualCombineResult.getSerializer());
  }

  @Test
  public void testCombine6() {
    // Arrange
    PureModelContextData data1 = PureModelContextData.newPureModelContextData();
    PureModelContextData data2 = PureModelContextData.newPureModelContextData();
    PureModelContextData newPureModelContextDataResult = PureModelContextData.newPureModelContextData();

    // Act
    PureModelContextData actualCombineResult = PureModelContextData.combine(data1, data2, newPureModelContextDataResult,
        PureModelContextData.newPureModelContextData());

    // Assert
    assertNull(actualCombineResult.getOrigin());
    assertNull(actualCombineResult.getSerializer());
  }

  @Test
  public void testGetAllElements() {
    // Arrange, Act and Assert
    assertTrue(PureModelContextData.newPureModelContextData().getAllElements().isEmpty());
  }

  @Test
  public void testGetElements() {
    // Arrange, Act and Assert
    assertTrue(PureModelContextData.newPureModelContextData().getElements().isEmpty());
  }

  @Test
  public void testGetElementsOfType() {
    // Arrange
    PureModelContextData newPureModelContextDataResult = PureModelContextData.newPureModelContextData();

    // Act and Assert
    assertTrue(newPureModelContextDataResult.<PackageableElement>getElementsOfType(PackageableElement.class).isEmpty());
  }

  @Test
  public void testNewPureModelContextData() {
    // Arrange and Act
    PureModelContextData actualNewPureModelContextDataResult = PureModelContextData.newPureModelContextData();

    // Assert
    assertNull(actualNewPureModelContextDataResult.getOrigin());
    assertNull(actualNewPureModelContextDataResult.getSerializer());
  }

  @Test
  public void testPartition() {
    // Arrange and Act
    List<PureModelContextData> actualPartitionResult = PureModelContextData
        .partition(PureModelContextData.newPureModelContextData(), 1);

    // Assert
    assertEquals(1, actualPartitionResult.size());
    PureModelContextData getResult = actualPartitionResult.get(0);
    assertNull(getResult.getOrigin());
    assertNull(getResult.getSerializer());
  }

  @Test
  public void testShallowCopy() {
    // Arrange and Act
    PureModelContextData actualShallowCopyResult = PureModelContextData.newPureModelContextData().shallowCopy();

    // Assert
    assertNull(actualShallowCopyResult.getOrigin());
    assertNull(actualShallowCopyResult.getSerializer());
  }
}

