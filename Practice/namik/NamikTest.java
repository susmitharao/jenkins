package namik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NamikTest 
{
	 ExtentReports report;
	 ExtentTest logger;
	 WebDriver driver;

	 @Test
	 public void display()
	 {	
		
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 report = new ExtentReports("./reports.html");
		 logger =report.startTest("display");
		 logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		 report.endTest(logger);
	     report.flush();
	     report.close();
	 }	 	
		
}
