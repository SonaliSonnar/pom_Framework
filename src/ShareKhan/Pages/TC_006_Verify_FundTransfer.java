package ShareKhan.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShareKhan.Properties.Configuaration;
import ShareKhan_core.TestCore;

public class TC_006_Verify_FundTransfer extends TestCore{
	
	
	@FindBy(xpath=Configuaration.MoveFunds)
	public WebElement MoveFunds;
	
	@FindBy(xpath=Configuaration.TransferMoneyAmount)
	public WebElement TransferMoneyAmount;
	
	@FindBy(xpath=Configuaration.FromBank)
	public WebElement FromBank;
	
	@FindBy(xpath=Configuaration.ToBank)
	public WebElement ToBank;
	
	@FindBy(xpath=Configuaration.TransferFundButton)
	public WebElement TransferFundButton;
	
	@FindBy(xpath=Configuaration.ErrorMsg)
	public WebElement ErrorMsg;
	
	
	public TC_007_Verify_Report verify_Transfer_Fund()
	{
		try{
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		MoveFunds.click();
		TransferMoneyAmount.sendKeys("10");
		Select_From_Dropdown(FromBank,3);
		Select_From_Dropdown(ToBank,3);
		TransferFundButton.click();
		Alert alert = driver.switchTo().alert();		
		System.out.println(alert.getText());
		alert.accept();
		driver.navigate().back();
		}catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		return PageFactory.initElements(driver,TC_007_Verify_Report.class);
	}

}
