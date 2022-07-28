package listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListner implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 2;


    @Override
    public boolean retry(ITestResult iTestResult) {
        if(counter<retryLimit){
          //  System.out.println("Before Increment +++++++++++++++++++++++++++++++++++++++++++++++++++"+counter);
            counter++;
           // System.out.println("After Increment +++++++++++++++++++++++++++++++++++++++++++++++++++"+counter);
            return true;
        }
        else {
            return false;
        }
    }
}
