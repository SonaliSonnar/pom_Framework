package ShareKhan.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.Configuration;

import ShareKhan.Pages.TC_001_Verify_ShareKhan_Page;
import ShareKhan.Properties.Configuaration;
import ShareKhan.Utils.ExcelReader;

import ShareKhan.Utils.Utility;
import ShareKhan_core.TestCore;


public class Test_TC_001_Verify_ShareKhan_Page extends TestCore{
	 
	 @BeforeTest
	public void isTestExecutable() throws Exception
	{
			
		if (!Utility.isExecutable("TC_001_Verify_ShareKhan_Page", excel1))
		{
			throw new SkipException("Skiping this TC_001_Verify_ShareKhan_Page test case");
		}
		setup("Firefox");
	}	

	@Test
	public void verifyShareKhanLaunch() throws InterruptedException
	{  
		
		try{
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		TC_001_Verify_ShareKhan_Page VS = PageFactory.initElements(driver, TC_001_Verify_ShareKhan_Page.class);
		VS.verify_Launch_ShareKhan();
		
		
		System.out.println("Sending mail");
		
		//SendMailUsingAuthentication mail = new SendMailUsingAuthentication();
		//mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt,SendMailUsingAuthentication.emailFromAddress);
		
		
	} catch(Throwable t)
	{
	   //Utility.captureScreenshot();

	}
	//driver.quit();

	}

}
