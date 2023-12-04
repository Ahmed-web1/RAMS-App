package com.Common;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public static WebDriver driver;
	
  @BeforeClass
  public void browser_Config()
  {
//	  System.out.println(System.getProperty("user.dir"));
	  
	  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }
  
  @AfterClass
  public void closeTest()
  {
	  driver.quit();
  }
  
  public void captureScreen(WebDriver driver, String name) throws IOException 
  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  File target = new File(System.getProperty("user.dir")+"/ScreenShots/"+ name + ".png");
	  FileUtils.copyFile(source, target); 
	  System.out.println("ScreenShots");
  }
  
}
