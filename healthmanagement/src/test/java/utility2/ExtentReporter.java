package utility2;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {

	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void OnStart(ITestContext contextStart) {
		
	
		String path = System.getProperty("user.dir")+"//reports//myReprt.html";
		sparkReporter  = new ExtentSparkReporter(path);
		
		sparkReporter.config().setDocumentTitle("test reports");
	    sparkReporter.config().setReportName("My testing");
	    sparkReporter.config().setTheme(Theme.DARK);
	
	extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
	extent.setSystemInfo("tester name", "bharathi");
	extent.setSystemInfo("browser", "chrome");
	extent.setSystemInfo("environment", "QA testing");
	
	}
	
	public void OnTestSucess(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "test passed : " +result.getName());
	}
	public void OnTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "test failed : " +result.getName());
		test.log(Status.FAIL,"test failed reason :"+result.getThrowable());
		
	}
	
	public void OnTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "test skipped : " +result.getName());
		
		
	}
	
	public void OnFinish(ITestContext context) {
		extent.flush();
	}
	}