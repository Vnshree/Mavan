package mavan.mavan1stprogram;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mavan.mavan1stprogram1.Basepage;

public class Testng1 
{
	public class Class1 extends Basepage 
	{
		@BeforeMethod
		@Parameters("browser")
		  public void setup(String browser) throws Exception 
		  {
			browserLaunch (browser,getdata("enaduurl")) ;
		  }
		
	  @Test
	  public void linktesting() 
	  {
		  driver.findElement(By.linkText("Register Now")).getText();
	  }
	  

	  @AfterMethod
	  public void killprocess() 
	  {
		  
	  }
	}
}

	

