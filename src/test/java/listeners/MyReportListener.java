package listeners;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class MyReportListener implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        System.out.println("==== Custom Report ====");

        for (ISuite suite : suites) {
            Map<String, ISuiteResult> results = suite.getResults();

            for (ISuiteResult result : results.values()) {
                ITestContext context = result.getTestContext();

                System.out.println("Suite: " + suite.getName());
                System.out.println("Passed Tests: " + context.getPassedTests().size());
                System.out.println("Failed Tests: " + context.getFailedTests().size());
                System.out.println("Skipped Tests: " + context.getSkippedTests().size());
            }
        }

        System.out.println("==== Report End ====");
    }
}
