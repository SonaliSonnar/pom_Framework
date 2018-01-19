package ShareKhan.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShareKhan.Properties.Configuaration;
import ShareKhan_core.TestCore;

public class TC_010_Verify_News_Section extends TestCore{
	@FindBy(xpath=Configuaration.ProfileMenu)
	public WebElement ProfileMenu;
	
	
	public void verify_NewsSection()
	{
		try{
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
		
		
		
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		//return PageFactory.initElements(driver,TC_010_Verify_News_Section.class);

	}

	

}
