package com.it.bd;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPasteExamples extends BaseDriver{
	@Test
	public void CopyPaste() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		Actions action= new Actions(driver);
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Any");
		Thread.sleep(3000);
		
        //select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
       
		// Copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		 //Tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		
        //	Paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		Thread.sleep(3000);
		
		
		
		
		
		
    }
    
	
	
	
}
