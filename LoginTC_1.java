package com.LoginTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Common.BaseClass;

public class LoginTC_1 extends BaseClass
{
	
	 @Test(description = "RAMs Login with invalid email and invalid password")
	  public void login() throws InterruptedException, IOException
	  
	  {
		   driver.get("https://rams-software.com/Login/Index");
		 
		   WebElement EmailAddress = driver.findElement(By.id("UserName"));

		   WebElement Password = driver.findElement(By.name("Password"));

		   WebElement SigninBtn = driver.findElement(By.cssSelector("#btnSignIn")); 
		    
		   
		   EmailAddress.sendKeys("test@paronsoft.net");
		   Password.sendKeys("Password1!0");
		   
		   Thread.sleep(3000);
		   
		   SigninBtn.click();
		   
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    
		    
		    String ExpectedErrorMessage = "Incorrect log in details provided, please check email and password.";
		    
		    String ActualMessage = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/form/div[1]/div/ul/li")).getText();
		    
		    if(ExpectedErrorMessage.contains(ActualMessage)) 
		    {
		    	captureScreen(driver,"LoginTC_1");
		    	System.out.println("Test Case Passed");
		    }
		    else 
		    {
		    	System.out.println("Test Case Failed, Bug Found");
		    }
		    
		   			    
	  }

	  
}
