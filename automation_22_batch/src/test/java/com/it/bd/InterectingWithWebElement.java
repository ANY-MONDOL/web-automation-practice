package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InterectingWithWebElement extends BaseDriver{
	
	public void Idlocator() throws InterruptedException  {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Any");
		Thread.sleep(3000);
		
		firstName.clear();
		firstName.sendKeys("mondol");
		Thread.sleep(3000);
    }
	
	public void getAttribute() throws InterruptedException  {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		System.out.println(firstName.getAttribute("placeholder"));
		Thread.sleep(3000);
		
		
    }
	@Test
	public void getText() throws InterruptedException  {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement Text = driver.findElement(By.xpath("//*[@class='practice-form-wrapper']"));
		System.out.println(Text.getText());
		Thread.sleep(3000);
		
		
    }
}
