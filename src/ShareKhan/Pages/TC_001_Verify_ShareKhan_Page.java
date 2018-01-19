package ShareKhan.Pages;

import java.util.concurrent.TimeUnit;

import javax.security.auth.login.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import ShareKhan.Properties.Configuaration;
import ShareKhan_core.TestCore;

public class TC_001_Verify_ShareKhan_Page extends TestCore {

	@FindBy(xpath =Configuaration.ShareKhanLogo)
	public WebElement ShareKhanLogo;
	
	@FindBy(xpath=Configuaration.VisitHomePage)
	public WebElement VisitHomePage;
	
	
	@FindBy(xpath=Configuaration.TradeNow)
	public WebElement TradeNow;
	
	@FindBy(xpath=Configuaration.OpenAccount)
	public WebElement OpenAccount;
	
	@FindBy(xpath=Configuaration.Help)
	public WebElement Help;
	

	@FindBy(xpath=Configuaration.Gallary)
	public WebElement Gallary;
	
	@FindBy(xpath=Configuaration.popupclose)
	public WebElement popupclose;
	
	
	public TC_002_Verify_ShareKhan_VisitHomePage verify_Launch_ShareKhan()
	{
		try{
			
		
	  System.out.println("1st Test case");		
      driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
      
     // popupclose.click();
      
		//check ShareKhanLogo is present and enabled
		isElementPresent(Configuaration.ShareKhanLogo);
		Enabled(Configuaration.ShareKhanLogo);
		
		//check VisitHomePageButton is present and Enabled
		isElementPresent(Configuaration.VisitHomePage);
		Enabled(Configuaration.VisitHomePage);
		
		//check TradeNow Button is present and enabled
		isElementPresent(Configuaration.TradeNow);
		Enabled(Configuaration.TradeNow);
		 
		 //check OpenAccount Button is present and enabled or not
		isElementPresent(Configuaration.OpenAccount);
		Enabled(Configuaration.OpenAccount);
			
		 //check Help Button is present and enabled or not
		isElementPresent(Configuaration.Help);
		Enabled(Configuaration.Help);
		
		System.out.println("Sharekhan Site successfully launched");
			
		
	}catch(Throwable t)
		{
		//TestUtil.captureScreenshot();
		}
		return PageFactory.initElements(driver,TC_002_Verify_ShareKhan_VisitHomePage.class);

	}
	
}
