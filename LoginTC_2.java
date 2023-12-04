package com.LoginTest;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Common.BaseClass;

public class LoginTC_2 extends BaseClass
{
	
	 @Test(description = "RAMs Login with valid email and valid password")
		  public void login() throws InterruptedException, IOException
		  
		  {
		 	   driver.get("https://rams-software.com/Login/Index");
		 	   
		 	  
		 
			   WebElement EmailAddress = driver.findElement(By.id("UserName"));

			   WebElement Password = driver.findElement(By.name("Password"));

			   WebElement SigninBtn = driver.findElement(By.cssSelector("#btnSignIn")); 
			    
			  
			   
			   EmailAddress.sendKeys("test4@paronsoft.net");
			   Password.sendKeys("Password1!");
			   
			   Thread.sleep(3000);
			   
			   SigninBtn.click();
			   
			   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   
			   
			   String ExpectedPostCondition = "Risk Assessment & Method Statement";
			    
			   String ActualText = driver.findElement(By.cssSelector(".riskAssessment_RAMs_Header_top > div:nth-child(1) > div:nth-child(1)")).getText();
			    
			   if(ExpectedPostCondition.contains(ActualText)) 
			     {
				    captureScreen(driver,"LoginTC_2");
			    	System.out.println("Login Success, Test Passed");
				 }
			   
				 else 
				 {
					
				    System.out.println("Test Case Failed, Bug Found");
				 }
				    
		    
		  }

	  
}
