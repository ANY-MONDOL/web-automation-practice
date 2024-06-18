package com.it.bd;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPasteExample extends BaseDriver{
	@Test
         public void CopyPasteTest() throws InterruptedException {
		 
        	 driver.manage().window().maximize();
     		driver.get("https://demoqa.com/automation-practice-form");
     		
     		Actions action= new Actions(driver);
     		WebElement firstName = driver.findElement(By.id("firstName"));
     		firstName.sendKeys("Any");
     		Thread.sleep(3000);
     		
//     		select
     		action.keyDown(Keys.CONTROL);
     		action.sendKeys("a");
     		action.keyUp(Keys.CONTROL);
     		action.build().perform();
//     		copy
     		action.keyDown(Keys.CONTROL);
     		action.sendKeys("c");
     		action.keyUp(Keys.CONTROL);
     		action.build().perform();
//     		tab
     		action.keyDown(Keys.TAB);
     		action.build().perform();
////     		paste
//     		action.keyDown(Keys.CONTROL);
//     		action.sendKeys("v");
//     		action.keyUp(Keys.CONTROL);
//     		action.build().perform();
//     		Thread.sleep(3000);
     		
     		
     		WebElement Subject=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
     	    
     		Subject.click();
//     		paste
     		action.keyDown(Keys.CONTROL);
     		action.sendKeys("v");
     		action.keyUp(Keys.CONTROL);
     		action.build().perform();
     		Thread.sleep(3000);
     		
		
	}

}
