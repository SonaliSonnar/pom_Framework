package ShareKhan.Pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShareKhan.Properties.Configuaration;
import ShareKhan_core.TestCore;



public class TC_004_Verify_ShareKhan_Module extends TestCore{

@FindBy(xpath=Configuaration.Equity)
public WebElement Equity;

@FindBy(xpath=Configuaration.Derivative)
public WebElement Derivative;

@FindBy(xpath=Configuaration.Mutual_Fund)
public WebElement Mutual_Fund;

@FindBy(xpath=Configuaration.currency)
public WebElement currency;

@FindBy(xpath=Configuaration.IPO)
public WebElement IPO;


@FindBy(xpath=Configuaration.moduleSection)
public WebElement moduleSection ;


	public TC_005_Verify_Equity_Module Verify_Module()
	{
		try
		{
		
		System.out.println("4th Test Case");
		driver.switchTo().defaultContent();
		//moduleSection.click();
		
	//check Equity is present and enabled
	isElementPresent(Configuaration.Equity);
	Enabled(Configuaration.Equity);


	//check Derivative is present and enabled
	isElementPresent(Configuaration.Derivative);
	Enabled(Configuaration.Derivative);


	//check Mutual_Fund is present and enabled
	isElementPresent(Configuaration.Mutual_Fund);
	Enabled(Configuaration.Mutual_Fund);


	//check currency is present and enabled
	isElementPresent(Configuaration.currency);
	Enabled(Configuaration.currency);


	//check IPO is present and enabled
	
	isElementPresent(Configuaration.IPO);
	Enabled(Configuaration.IPO);
	
	Equity.click();
	

		}catch(Throwable t)
		{
			t.printStackTrace();
		}

	
    return PageFactory.initElements(driver, TC_005_Verify_Equity_Module.class);

}
}
