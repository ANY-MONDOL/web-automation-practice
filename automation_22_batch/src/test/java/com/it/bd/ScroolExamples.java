package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScroolExamples extends BaseDriver{
	@Test
	public void ScroolTest()throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(10000);
		
//		specific
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement SpecificLocator= driver.findElement(By.xpath("//div[contains(text(),'Make Money with Us')]"));
		js.executeScript("arguments[0].scrollIntoView(true)",  SpecificLocator);
		Thread.sleep(5000);
		
//		Top
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(5000);
//		Down
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		
	}
}
