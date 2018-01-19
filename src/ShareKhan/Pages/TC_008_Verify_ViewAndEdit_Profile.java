package ShareKhan.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShareKhan.Properties.Configuaration;
import ShareKhan_core.TestCore;

public class TC_008_Verify_ViewAndEdit_Profile extends TestCore {

	@FindBy(xpath=Configuaration.ProfileMenu)
	public WebElement ProfileMenu;
	
	@FindBy(xpath=Configuaration.ViewProfile)
	public WebElement ViewProfile;

	
	@FindBy(xpath=Configuaration.EditProfile)
	public WebElement EditProfile ;
	
	@FindBy(xpath=Configuaration.SwitchToOldSite)
	public WebElement SwitchToOldSite ;
	
	public TC_010_Verify_News_Section verify_Profile()
	{
		try{
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		ProfileMenu.click();
		ViewProfile.click();
		TradingProfile();
		BankDetais();
		driver.navigate().back();
		
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		return PageFactory.initElements(driver,TC_010_Verify_News_Section.class);

	}


}
