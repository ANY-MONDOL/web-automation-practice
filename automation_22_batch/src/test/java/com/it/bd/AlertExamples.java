package com.it.bd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertExamples extends BaseDriver{
	@Test
	
	public void TestAlert()throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement alertButton= driver.findElement(By.xpath("//button[@id='alertButton']"));
		
		alertButton.click();
		Thread.sleep(3000);
		
		Alert alert =driver.switchTo().alert();
		alert.accept();
		WebElement confirmButton= driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton.click();
		alert.dismiss();
		Thread.sleep(3000);
		
		WebElement promptButton= driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptButton.click();
		alert.sendKeys("hello automation");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(5000);
		
		
		
		
	}

}
