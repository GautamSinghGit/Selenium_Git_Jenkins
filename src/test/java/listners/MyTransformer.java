package listners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyTransformer implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation , Class testclass , Constructor constructor , Method methods){
        annotation.setRetryAnalyzer(RetryListner.class);
    }

}
