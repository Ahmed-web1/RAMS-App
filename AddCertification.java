package com.Trainng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Common.BaseClass;

public class AddCertification extends BaseClass {
  @Test
  public void traningMenu() throws InterruptedException
  {
	  driver.get("https://rams-software.com/Login/Index");
	  
	   WebElement EmailAddress = driver.findElement(By.id("UserName"));

	   WebElement Password = driver.findElement(By.name("Password"));

	   WebElement SigninBtn = driver.findElement(By.cssSelector("#btnSignIn")); 
	    	   
	   EmailAddress.sendKeys("test4@paronsoft.net");
	   Password.sendKeys("Password1!");
	   
	   Thread.sleep(2000);
	   
	   SigninBtn.click();
	   
	   Thread.sleep(5000);
	   
	   WebElement trainingMenu = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul/li[7]/a/span[1]"));
	   trainingMenu.click();
	   
	   Actions scroll = new Actions(driver);
	   scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
	   
	   Thread.sleep(2000);
	   
	   Actions actions = new Actions(driver);
	   
	   Thread.sleep(3000);
		
	   actions.moveToElement(trainingMenu).build().perform();
	   
	   WebElement certSubMenu = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul/li[7]/ul/li[3]/a"));
	   
	   certSubMenu.click();
	   
	   Thread.sleep(3000);
	   
	   WebElement newCertBtn = driver.findElement(By.xpath("//*[@id=\"btncreatenewcertification\"]"));
	   newCertBtn.click();
	   
	   Thread.sleep(5000);
	   
	   WebElement certName = driver.findElement(By.id("txtCertificationName"));
	   certName.sendKeys("Test Certification one");
	   
	   WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"CertificationTypeId\"]"));
	    
	   Select drdw=new Select(dropdown);
	    
	   Thread.sleep(3000);
	   
	   drdw.selectByVisibleText("Test Type 123");
	   
	   Thread.sleep(3000);
	   
	   Actions srl = new Actions(driver);
	   srl.sendKeys(Keys.PAGE_DOWN).build().perform();
	   
	   Thread.sleep(3000);
	   
//	   WebElement tickCheckBox = driver.findElement(By.id("CheckBox_30085"));
//	   tickCheckBox.click();
//	   Thread.sleep(3000);   
	   
//	   WebElement clickDatePicker = driver.findElement(By.cssSelector("div.addReviewers_textbox_content:nth-child(1) > span:nth-child(2) > span:nth-child(1) > span:nth-child(3)"));
//	   clickDatePicker.click();
//	   Thread.sleep(3000);

//      Date currentDate = new Date();
//      Calendar calendar = Calendar.getInstance();
//      calendar.setTime(currentDate);

   
//	   WebElement currentDate = driver.findElement(By.className("k-link k-nav-today"));
//	   currentDate.click();
//	   Thread.sleep(3000);
//	   
//	   WebElement expDatePicker = driver.findElement(By.xpath("\n" + "/html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/span/span/span[2]"));
//	   expDatePicker.click();
//	   Thread.sleep(3000);
  
	   
	   
	   WebElement saveBtn = driver.findElement(By.cssSelector("#btnAddImageInfo"));
	   saveBtn.click();
	   
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
  }
}
