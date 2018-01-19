package ShareKhan.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ShareKhan.Properties.Configuaration;
import ShareKhan_core.TestCore;

public class TC_005_Verify_Equity_Module extends TestCore{
	
	
	@FindBy(xpath=Configuaration.ExchangeField)
	public WebElement ExchangeField;
	
	@FindBy(xpath=Configuaration.BUYorSELL_Field)
	public WebElement BUYorSELL_Field;

	@FindBy(xpath=Configuaration.ScripField)
	public WebElement ScripField;
	
	@FindBy(xpath=Configuaration.ValidityField)
	public WebElement ValidityField;
	
	@FindBy(xpath=Configuaration.OrderQuantityField)
	public WebElement OrderQuantityField;

	@FindBy(xpath=Configuaration.Cancel)
	public WebElement Cancel;
	
	@FindBy(xpath=Configuaration.limitPriceField)
	public WebElement limitPriceField;
	
	@FindBy(xpath=Configuaration.PlaceNewOrder)
	public WebElement PlaceNewOrder;
	
	public TC_006_Verify_FundTransfer verify_Equity()
	{
		try{
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		Select_From_Dropdown(ExchangeField,2);
		ScripField.sendKeys("INFOSYS");
		ScripField.click();
		Select_From_Dropdown(BUYorSELL_Field,1);
		OrderQuantityField.sendKeys("1");
		Select_From_Dropdown(ValidityField,1);
		PlaceNewOrder.click();
		Cancel.click();
		limitPriceField.sendKeys("10");
		driver.navigate().back();
		
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		 return PageFactory.initElements(driver,TC_006_Verify_FundTransfer.class);

	}

}
