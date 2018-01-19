package ShareKhan.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShareKhan.Properties.Configuaration;
import ShareKhan_core.TestCore;

public class TC_007_Verify_Report extends TestCore{

	@FindBy(xpath=Configuaration.ViewReport)
	public WebElement ViewReport;
	
	@FindBy(xpath=Configuaration.OrderReport)
	public WebElement OrderReport;

	@FindBy(xpath=Configuaration.SelectTypeOfReport)
	public WebElement SelectTypeOfReport;
	
	@FindBy(xpath=Configuaration.LimitStatementTableRow)
	 List<WebElement> LimitStatementTableRow ;
	
	@FindBy(xpath=Configuaration.LimitStatementTableColumn)
	 List<WebElement> LimitStatementTableColumn ;
	
	
	public TC_008_Verify_ViewAndEdit_Profile verify_Report()
	{
		try{
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
		ViewReport.click();
		OrderReport.click();
		Select_From_Dropdown(SelectTypeOfReport,7);
		String xp_start=".//*[@id='sort']/tbody/tr[";
		String xp_mid="]/td[";
		String xp_end="]";
		for(int i=2;i<=12;i++)
		{
			for(int j=1;j<=4;j++)
			{
				
				String result= driver.findElement(By.xpath(xp_start+i+xp_mid+j+xp_end)).getText();
				System.out.println(result);
			}
			
		}
				}catch(Throwable t)
		{
			t.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		return PageFactory.initElements(driver,TC_008_Verify_ViewAndEdit_Profile.class);

	}

}
