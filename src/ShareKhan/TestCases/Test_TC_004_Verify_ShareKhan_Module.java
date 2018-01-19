package ShareKhan.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ShareKhan.Pages.TC_001_Verify_ShareKhan_Page;
import ShareKhan.Pages.TC_002_Verify_ShareKhan_VisitHomePage;
import ShareKhan.Pages.TC_003_Verify_Sharekhan_Login;
import ShareKhan.Pages.TC_004_Verify_ShareKhan_Module;
import ShareKhan.Utils.Utility;
import ShareKhan_core.TestCore;

public class Test_TC_004_Verify_ShareKhan_Module extends TestCore {
	

	@BeforeTest
	public void isTestExecutable() throws Exception
	{
		// ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\com\\way2automation\\twitter\\testdata\\testdata1.xlsx");
			
		if (!Utility.isExecutable("TC_004_Verify_ShareKhan_Module", excel1))
		{
			throw new SkipException("Skiping this TC_004_Verify_ShareKhan_Module test case");
		}
		setup("Firefox");
		
	}

@Test(dataProvider="getdata")
public void verify_Each_Module(String LogIn_id,String Mpin,String Tpin)
	 {
		try
		{
			
			System.out.println("4th Test Case");
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			TC_001_Verify_ShareKhan_Page VS = PageFactory.initElements(driver, TC_001_Verify_ShareKhan_Page.class);
			TC_002_Verify_ShareKhan_VisitHomePage vhp = VS.verify_Launch_ShareKhan();
			vhp =PageFactory.initElements(driver, TC_002_Verify_ShareKhan_VisitHomePage.class);
			TC_003_Verify_Sharekhan_Login lp = vhp.Verify_VisitHomePage_Button();
			lp=PageFactory.initElements(driver, TC_003_Verify_Sharekhan_Login.class);
			TC_004_Verify_ShareKhan_Module se=lp.dologin(LogIn_id,Mpin,Tpin);	
			se=PageFactory.initElements(driver, TC_004_Verify_ShareKhan_Module.class);
			se.Verify_Module();
			
	System.out.println("Sending mail");
	//SendMailUsingAuthentication mail = new SendMailUsingAuthentication();
	//mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt,SendMailUsingAuthentication.emailFromAddress);
	
	} catch(Throwable t)
	 {
			//Utility.captureScreenshot();
		t.printStackTrace();

	 }
		//driver.quit();

}	 
@DataProvider
public Object[][] getdata()
{
	return Utility.getData("Sheet2",excel1);
		
}


}
