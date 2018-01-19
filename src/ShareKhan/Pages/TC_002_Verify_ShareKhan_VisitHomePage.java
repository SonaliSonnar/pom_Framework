package ShareKhan.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.security.auth.login.Configuration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ShareKhan.Properties.Configuaration;
import ShareKhan_core.TestCore;


public class TC_002_Verify_ShareKhan_VisitHomePage extends TestCore{
	@FindBy(xpath=Configuaration.popupclose)
	public WebElement popupclose;

	
	@FindBy(xpath=Configuaration.VisitHomePage)
	public WebElement VisitHomePage;

	
	@FindBy(xpath=Configuaration.LogInButton)
	public WebElement LogInButton;

	@FindBy(xpath=Configuaration.TradeNowHomePage)
	public WebElement TradeNowHomePage;
	
	@FindBy(xpath=Configuaration.ContactUsHomePage)
	public WebElement ContactUsHomePage;

 @FindBy(how = How.ID, using="rbtnSuggest")
 public List<WebElement> AllRadioButton;

 public TC_003_Verify_Sharekhan_Login Verify_VisitHomePage_Button()
	{
		try
		{
			
			 System.out.println("2nd Test case");	
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

			//check VisitHomePage is present and enabled
			isElementPresent(Configuaration.VisitHomePage);
			Enabled(Configuaration.VisitHomePage);
			
		VisitHomePage.click();
		Thread.sleep(1000L);
	    
			
		//check LogInButton is present and enabled
		isElementPresent(Configuaration.LogInButton);
		Enabled(Configuaration.LogInButton);


		//check TradeNowHomePage is present and enabled
		isElementPresent(Configuaration.TradeNowHomePage);
		Enabled(Configuaration.TradeNowHomePage);
		

		//check ContactUsHomePage is present and enabled
		isElementPresent(Configuaration.ContactUsHomePage);
		Enabled(Configuaration.ContactUsHomePage);
		
		//((JavascriptExecutor)driver).executeScript("document.getElementByXpath('.//*[@id='divBanner']/div/div/span')");
		popupclose.click();
		/*
		############-------HANDLE RADIO Button----###############
		 */
		Select_RadioButton(AllRadioButton,2);
	
		
		}catch(Throwable t){
			t.printStackTrace();
		}
		return PageFactory.initElements(driver, TC_003_Verify_Sharekhan_Login.class);
		
	}


}
