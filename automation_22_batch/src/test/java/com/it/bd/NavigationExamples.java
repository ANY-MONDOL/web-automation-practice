package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationExamples extends BaseDriver{
	
	@Test
	public void getCurrentUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
	
		WebElement cssSelector = driver.findElement(By.cssSelector(".bld-txt"));
		cssSelector.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		driver.get("https://www.goggle.com/");
	
}
}
