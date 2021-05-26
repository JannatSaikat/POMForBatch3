package ReportPKG;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class QEReport extends TestListenerAdapter {

    public void onTestStart(ITestResult ref){

    }

    public void onTestSuccess(ITestResult ref){
        System.out.println("Test Passed");
    }

    public void onTestFailure(ITestResult ref){
//        ref.
        System.out.println("Test Failed");
    }
}
