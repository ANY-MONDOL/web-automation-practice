package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommands extends BaseDriver{
	@Test
	public void getCurrentUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		WebElement cssSelector = driver.findElement(By.cssSelector(".bld-txt"));
		cssSelector.click();
		Thread.sleep(3000);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
	
}

}
