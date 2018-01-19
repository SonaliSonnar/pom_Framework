package ShareKhan.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ShareKhan.Pages.TC_001_Verify_ShareKhan_Page;
import ShareKhan.Pages.TC_002_Verify_ShareKhan_VisitHomePage;
import ShareKhan.Properties.Configuaration;
import ShareKhan.Utils.Utility;
import ShareKhan_core.TestCore;

public class Test_TC_002_Verify_ShareKhan_VisitHomePage extends TestCore{
	 @BeforeTest
		public void isTestExecutable() throws Exception
		{
			// ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\com\\way2automation\\twitter\\testdata\\testdata1.xlsx");
				
			if (!Utility.isExecutable("TC_002_Verify_ShareKhan_VisitHomePage", excel1))
			{
				throw new SkipException("Skiping this TC_002_Verify_ShareKhan_VisitHomePage test case");
			}
			setup("Firefox");
			
		}
	 
	 @Test public void verify_HomePage()
		 {
		 try
		 {
			// System.out.println("2nd Test case");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		TC_001_Verify_ShareKhan_Page VS = PageFactory.initElements(driver, TC_001_Verify_ShareKhan_Page.class);
		TC_002_Verify_ShareKhan_VisitHomePage vhp = VS.verify_Launch_ShareKhan();
		vhp =PageFactory.initElements(driver, TC_002_Verify_ShareKhan_VisitHomePage.class);
		vhp.Verify_VisitHomePage_Button();
		
		
			System.out.println("Sending mail");
		//SendMailUsingAuthentication mail = new SendMailUsingAuthentication();
		//mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt,SendMailUsingAuthentication.emailFromAddress);
		
		} catch(Throwable t)
		 {
				//Utility.captureScreenshot();

		 }
	
	}

}
