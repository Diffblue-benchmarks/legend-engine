package org.finos.legend.engine.language.pure.compiler.toPureGraph.handlers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.finos.legend.pure.generated.Root_meta_pure_metamodel_function_LambdaFunction_LazyImpl;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.finos.legend.pure.runtime.java.compiled.metadata.MetadataLazy;
import org.finos.legend.pure.runtime.java.compiled.serialization.model.Obj;
import org.junit.Test;

public class UserDefinedFunctionHandlerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Obj instance = new Obj(new SourceInformation("42", 2, 1, 3, 3), "42", "Classifier", "Name");
    Root_meta_pure_metamodel_function_LambdaFunction_LazyImpl<Object> root_meta_pure_metamodel_function_LambdaFunction_LazyImpl = new Root_meta_pure_metamodel_function_LambdaFunction_LazyImpl<Object>(
        new Root_meta_pure_metamodel_function_LambdaFunction_LazyImpl<Object>(
            new Root_meta_pure_metamodel_function_LambdaFunction_LazyImpl<Object>(
                new Root_meta_pure_metamodel_function_LambdaFunction_LazyImpl<Object>(
                    new Root_meta_pure_metamodel_function_LambdaFunction_LazyImpl<Object>(instance,
                        new MetadataLazy())))));

    // Act
    UserDefinedFunctionHandler actualUserDefinedFunctionHandler = new UserDefinedFunctionHandler("Name",
        root_meta_pure_metamodel_function_LambdaFunction_LazyImpl, null, null);

    // Assert
    Function<?> func = actualUserDefinedFunctionHandler.getFunc();
    assertSame(root_meta_pure_metamodel_function_LambdaFunction_LazyImpl, func);
    assertNull(actualUserDefinedFunctionHandler.getDispatch());
    assertNull(actualUserDefinedFunctionHandler.getFunctionName());
    assertEquals("Name", actualUserDefinedFunctionHandler.getFullName());
    assertNull(actualUserDefinedFunctionHandler.getFunctionSignature());
    assertNull(((Root_meta_pure_metamodel_function_LambdaFunction_LazyImpl<?>) func)._name);
    assertNull(((Root_meta_pure_metamodel_function_LambdaFunction_LazyImpl<?>) func)._functionName);
  }
}

