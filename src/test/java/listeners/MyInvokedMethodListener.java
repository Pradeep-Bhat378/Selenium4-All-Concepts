package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MyInvokedMethodListener implements IInvokedMethodListener {

    public void beforeInvocation(IInvokedMethod method, ITestResult result) {
        System.out.println(">>> Before method: " + method.getTestMethod().getMethodName());
    }

    
    public void afterInvocation(IInvokedMethod method, ITestResult result) {
        System.out.println("<<< After method: " + method.getTestMethod().getMethodName());

        // Check if test failed
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("!!! Test Failed: " + result.getName());
            // You could take a screenshot or log additional details here
        }
    }
}
