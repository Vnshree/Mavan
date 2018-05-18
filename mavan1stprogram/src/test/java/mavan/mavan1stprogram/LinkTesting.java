package mavan.mavan1stprogram;

import org.testng.annotations.Test;

import mavan.mavan1stprogram1.Basepage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class LinkTesting  extends Basepage
{
  
  @BeforeClass
  @Parameters("browser")
  public void startProcess  (String browser) throws Exception 
  
  {
	  
	  browserLaunch(browser, getdata("enaduurl"));
  }

  @Test
  public void singleLink() 
  {
	  
  }
  
  @AfterClass
  public void endProcess() 
  {
	  
  }

}
