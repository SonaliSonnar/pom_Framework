package ShareKhan_core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import ShareKhan.Properties.Configuaration;
import ShareKhan.Utils.TestUtil;
import ShareKhan.Utils.Xls_Reader;

public class TestCore {
	public static Properties config  = new Properties();
	public static Properties object  = new Properties();
	public static Xls_Reader excel1 = null;
	public static WebDriver driver = null;
	public static Logger app_logs =  Logger.getLogger("devpinoyLogger");
	public static String captionName;
	

	@BeforeSuite
	public static void init() throws IOException
	{
		
		if(driver==null)
		{
			excel1 = new ShareKhan.Utils.Xls_Reader(System.getProperty("user.dir")+"\\src\\ShareKhan\\Properties\\Testdata.xlsx");
			app_logs.debug("Loading the excel file");
		}
	}
	
    public int setup(String browser)throws Exception
    {
		if(browser.equalsIgnoreCase("Firefox"))	
		{
			System.setProperty("webdriver.gecko.driver","D:\\software\\gecko\\geckodriver-v0.16.1-win32\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			//driver.get(config.getProperty("testsite"));
			driver.get(Configuaration.testsite);
			
		}else if(browser.equalsIgnoreCase("ie"))
		{
			
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(Configuaration.testsite);
			
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.get(config.getProperty("testsite"));
			driver.get(Configuaration.testsite);
			
		}
	
		driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
		
	return 0;

}
    public void TradingProfile()
    {
System.out.println("Trading Profile");
		
		String xp_start="html/body/center/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/form/table/tbody/tr/td/table/tbody/tr/td[1]/div[1]/div[2]/table/tbody/tr[";
		String xp_mid="]/td[";
		String xp_end="]";
		
		for(int i=1;i<30;i++)
		{
			if(i==6||i==13||i==20||i==21||i==22)
			{
			
			}else
			{
			for(int j=1;j<=3;j++)
			{
				
				System.out.println(driver.findElement(By.xpath(xp_start+i+xp_mid+j+xp_end)).getText());
				
			}
			}
			
			
		}		
    }
    public void BankDetais()
    {
System.out.println("Bank Details");
		
		String xp_start="html/body/center/div/table/tbody/tr[2]/td/div/table/tbody/tr/td[2]/form/table/tbody/tr/td/table/tbody/tr/td[1]/div[2]/div[2]/table/tbody/tr[";
		String xp_mid="]/td[";
		String xp_end="]";
		
		for(int i=1;i<11;i++)
		{
			for(int j=1;j<=3;j++)
			{
				
				System.out.println(driver.findElement(By.xpath(xp_start+i+xp_mid+j+xp_end)).getText());
				
			}
		}		
    }
    
    public void NewlyOpenWindowHandle()
	{
		String windowTitle= getCurrentWindowTitle();
		String mainWindow = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindow));
		//Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"), "Main window title is not matching");
		
	}
	public String getMainWindowHandle(WebDriver driver) 
	{
		return driver.getWindowHandle();
	}

	public String getCurrentWindowTitle()
	{
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	//To close all the other windows except the main window.
	public static boolean closeAllOtherWindows(String openWindowHandle )
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles)
		{
			if (!currentWindowHandle.equals(openWindowHandle))
			{
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}
	
	public void HandleWebtable(WebElement Webtable)
	{
	//WebElement htmltable=driver.findElement(By.xpath("//*[@id='main']/table[1]/tbody"));
	
		System.out.println("handling webtable");
		List<WebElement> rows=Webtable.findElements(By.tagName("tr"));
	
		for(int rnum=0;rnum<rows.size();rnum++)
		{
	
		List<WebElement> columns=rows.get(rnum).findElements(By.tagName("th"));
	
		System.out.println("Number of columns:"+columns.size());
	
		 
	
		for(int cnum=0;cnum<columns.size();cnum++)
	
		{
	
		System.out.println(columns.get(cnum).getText());
	
		}
		}
		System.out.println("handled webtable");
	}
    public void switchToFrame(String framee) {
    	try {
    
    		
    		  String MainWindow=driver.getWindowHandle();		
      		
    	        // To handle all new opened window.				
    	            Set<String> s1=driver.getWindowHandles();		
    	        Iterator<String> i1=s1.iterator();		
    	        		
    	        while(i1.hasNext())			
    	        {		
    	            String ChildWindow=i1.next();		
    	            		
    	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
    	            {    		
    	                 
    	                    // Switching to Child window
    	            	 driver.switchTo().window(ChildWindow);
    	            	 driver.close();
    	                                                                                         
    	            }
    	        }
    	        driver.switchTo().window(MainWindow);	

    		
		} catch (Exception e) {
			System.out.println("unable to navigate back to main webpage from frame"
							+ e.getStackTrace());
		}
	}
    

	public boolean Enabled(String locator)
	{

		try
		{
			
		driver.findElement(By.xpath(locator)).isEnabled();
		captionName=(driver.findElement(By.xpath(locator))).getText();	
		System.out.println(captionName +":Element is Enabled");
		return  true;
		
		}catch(Throwable t)
		{
			System.out.println(locator+": Element is Disabled");
			//TestUtil.captureScreenshot();
		return false;
 	
		}
		
	
	}
	
	public void Comparestring(List<WebElement> Links)
	{

			String []linkText =new String[Links.size()];
			int j=0;

			//Storing List elements text into String array
			for(WebElement a: Links)
			{
				linkText[j]=a.getText();
				j++;
			}
			
			
			for(int i=0;i<linkText.length;i++)
			{
				
				if(linkText[i].contains("Abdul Kalam"))
		 		{
			 		
					System.out.println(Links.get(i).getText());	
		 		}
 		}
		
		//Thread.sleep(5000L);
	}


	public boolean clicked(WebElement button)
	{
		try
		{
			
			button.click();
			return  true;
			
		}catch(Throwable t)
	 	{
			
			System.out.println(" Element is Disabled");
			return false;
	 	}
	
	}

	public boolean selected(String locator)
	{
		try
		{
			
		driver.findElement(By.xpath(locator)).isSelected();
		captionName=(driver.findElement(By.xpath(locator))).getText();	
		System.out.println(captionName +":Element is selected");
		return  true;
		
		}catch(Throwable t)
		{
			System.out.println(locator+": Element is not selected");
			TestUtil.captureScreenshot();
		return false;
 	
		}
		
	}

	public boolean isElementPresent(String locator)
	{
	
		try
		{
			
		driver.findElement(By.xpath(locator)).isDisplayed();
		captionName=(driver.findElement(By.xpath(locator))).getText();	
			
		
		System.out.println(captionName +":Element is Present");
		return  true;
		
		}catch(Throwable t)
		{
			System.out.println(locator+": Element is Absent");
			TestUtil.captureScreenshot();
		return false;
 	
		}
		
	
			
	}
	/*
	############-------HANDLE RADIO Button----###############
	 */
	
	public void Select_RadioButton(List<WebElement> AllRadioButton ,int Index)
	{

		 for (int i = 0; i < AllRadioButton.size(); i++)
		 {
			 if(!AllRadioButton.get(Index).isSelected())
			 {
				 
			 if(! AllRadioButton.get(i).isSelected())
		       {
		    	   AllRadioButton.get(i).click();
		       }
		       else
		       {
		    	//break;   
		       }
		        try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }  
		   //}
		 }
	}
	public void Select_From_Dropdown(WebElement mySelectElement,int Index)
	{
		Select dropdown = new Select(mySelectElement);
		dropdown.selectByIndex(Index);
	}
	

	
		@AfterSuite
		public static void QuitDriver() throws AddressException, MessagingException
		{
		
			
			//driver.quit();
			/*
			monitoringMail mail = new monitoringMail();
			mail.sendMail(TestConfig.server,TestConfig.from , TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
			*/
		}
	
	

}
