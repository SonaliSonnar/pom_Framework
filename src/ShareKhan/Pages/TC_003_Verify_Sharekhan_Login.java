package ShareKhan.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ShareKhan.Properties.Configuaration;
import ShareKhan_core.TestCore;

public class TC_003_Verify_Sharekhan_Login extends TestCore {
	
	
	@FindBy(xpath=Configuaration.LogIn_id)
	public WebElement LogIn_id;
	
	@FindBy(xpath=Configuaration.popupclose)
	public WebElement popupclose;
	

	@FindBy(xpath=Configuaration.popupimage)
	public WebElement popupimage;
	
	@FindBy(xpath=Configuaration.Mpin)
	public WebElement Mpin;
	
	@FindBy(xpath=Configuaration.Tpin)
	public WebElement Tpin;
	
	@FindBy(xpath=Configuaration.Go_To)
	public WebElement Go_To;
	
	
	@FindBy(xpath=Configuaration.signin)
	public WebElement signin;
	

	@FindBy(xpath=Configuaration.VisitHomePage)
	public WebElement VisitHomePage;

	
	@FindBy(xpath=Configuaration.LogInButton)
	public WebElement LogInButton;
	

	@FindBy(xpath=Configuaration.Profile)
	public WebElement Profile;
	
	@FindBy(how = How.ID, using="name")
	public WebElement ActiveMember;
	
	@FindBy(xpath=Configuaration.Webtable)
	public WebElement Webtable;
	
	
	public TC_004_Verify_ShareKhan_Module dologin(String myLogIn_id, String myMpin,String myTpin)
	{
		try
		{
			
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		    LogInButton.click();
		//calculate total number of frames
		//int size = driver.findElements(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).size();
		//System.out.println(size);

		driver.switchTo().frame("TrdLoginFrame");
		LogIn_id.sendKeys(myLogIn_id);
		Thread.sleep(3000L);
		Mpin.sendKeys(myMpin);
		Thread.sleep(3000L);
		Tpin.sendKeys(myTpin);
		Thread.sleep(3000L);
		Select_From_Dropdown(Go_To,1);
		signin.click();
		Thread.sleep(3000L);
		NewlyOpenWindowHandle();
		Thread.sleep(3000L);
		signin.click();
		Thread.sleep(3000L);
		NewlyOpenWindowHandle();
		Thread.sleep(3000L);
		signin.click();
		/*
		
		//HandleWebtable(Webtable);
		//Thread.sleep(10000L);
		driver.switchTo().defaultContent();
		System.out.println("Active Member is:");
		ActiveMember.getText();
	*/
		
		}catch(Throwable t){
			t.printStackTrace();
		}
	
	return PageFactory.initElements(driver, TC_004_Verify_ShareKhan_Module.class);
		
	}




}
