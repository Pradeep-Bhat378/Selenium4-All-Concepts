package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("Test Started -ITestLisners: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed -ITestLisners: " + result.getName());
    }

     public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed -ITestLisners: " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped -ITestLisners: " + result.getName());
    }
}
