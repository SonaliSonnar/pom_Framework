package ShareKhan.Utils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import ShareKhan.TestCases.Test_TC_001_Verify_ShareKhan_Page;



public class Utility extends Test_TC_001_Verify_ShareKhan_Page{
	
//private static final TakesScreenshot  = null;

	//static WebDriver driver;
	public static boolean isExecutable(String test_name, Xls_Reader excel1){
		
		String sheetName="Sheet1";
		for(int rowNum=2;rowNum<=excel1.getRowCount(sheetName);rowNum++){
			
			if(excel1.getCellData(sheetName, "test_name", rowNum).equals(test_name)){
						
				if(excel1.getCellData(sheetName, "runmode", rowNum).equalsIgnoreCase("Y"))
					
						return true;
					else
						return false;
				
			}
		}
		
		return false;
	}
	
	
	//TestNG Parameterization
		/*public static Object[][] getData(String sheetName, ExcelReader excel){
			// return test data;
			// read test data from xls
			
			int rows=excel.getRowCount(sheetName)-1;
			if(rows <=0){
				Object[][] testData =new Object[1][0];
				return testData;
				
			}
		    rows = excel.getRowCount(sheetName);  // 3
			int cols = excel.getColumnCount(sheetName);
			Object data[][] = new Object[rows-1][cols];
			
			for( int rowNum = 2 ; rowNum <= rows ; rowNum++){
				
				for(int colNum=0 ; colNum< cols; colNum++){
					data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
				}
			}
			
			return data;
			
			
		}*/
	
	public static Object[][] getData(String sheetName ,Xls_Reader excel1){
		// return test data;
		// read test data from xls
		
		int rows=excel1.getRowCount(sheetName)-1;
		if(rows <=0){
			Object[][] testData =new Object[1][0];
			return testData;
			
		}
	    rows = excel1.getRowCount(sheetName);  // 3
		int cols = excel1.getColumnCount(sheetName);
		//System.out.println("total rows -- "+ rows);
		//System.out.println("total cols -- "+cols);
		Object data[][] = new Object[rows-1][cols];
		
		for( int rowNum = 2 ; rowNum <= rows ; rowNum++){
			
			for(int colNum=0 ; colNum< cols; colNum++){
				data[rowNum-2][colNum]=excel1.getCellData(sheetName, colNum, rowNum);
			}
		}
		
		return data;
		
		
	}


	public static void captureScreenshot() 
	{
		
		  String mailscreenshotpath;
	      Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH);
		  int year = cal.get(Calendar.YEAR);
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
		  
		  
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    try {
		    	mailscreenshotpath = System.getProperty("user.dir")+"\\screenshot\\"+"_"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
				FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
			} catch (IOException e) 
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
	    
	   
	    	      
	         }
		    
		    
	 }
	/*public  void takeScreenShot (ITestResult testResult) throws IOException 
    {
    	if (testResult.getStatus() == ITestResult.FAILURE) 
    	{
    		captureScreenshot("failure", testResult.getName());
    	} else if (testResult.getStatus() == ITestResult.SUCCESS)
    	{
    		captureScreenshot("passed", testResult.getName());
    	} else if (testResult.getStatus() == ITestResult.SKIP)
    	{
    		captureScreenshot("skipped", testResult.getName());
    	}*/

    }

		
	








