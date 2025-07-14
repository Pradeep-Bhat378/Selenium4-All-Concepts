package listeners;

import org.testng.IClassListener;
import org.testng.ITestClass;

public class MyClassListener implements IClassListener {

    public void onBeforeClass(ITestClass testClass) {
        System.out.println("=== BEFORE CLASS: " + testClass.getName() + " ===");
    }

    public void onAfterClass(ITestClass testClass) {
        System.out.println("=== AFTER CLASS: " + testClass.getName() + " ===");
    }
}
