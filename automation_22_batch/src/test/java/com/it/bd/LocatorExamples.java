package com.it.bd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExamples extends BaseDriver{
    
	public void Idlocator() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Any");
		Thread.sleep(3000);
    }
		
//	    WebElement gender=driver.findElement(By.id("gender-radio-1"));
//        gender.click();
		public void linklocator() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		Thread.sleep(3000);
		
        }
		
		public void partiallinklocator() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/links");
			WebElement partialLink = driver.findElement(By.partialLinkText("Ho"));
			partialLink.click();
			Thread.sleep(3000);
			
		}
	
		public void tagnamelocator() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");
			List<WebElement> tagName = driver.findElements(By.tagName("a"));
			System.out.println(tagName.size());
			Thread.sleep(3000);
	    }
		
		public void classnamelocator() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://www.daraz.com.bd/");
			WebElement className = driver.findElement(By.className("bld-txt"));
			className.click();
			Thread.sleep(3000);
		
		
           }
		
		public void cssselectorLolocator() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://www.daraz.com.bd/");
			WebElement cssSelector = driver.findElement(By.cssSelector(".bld-txt"));
			cssSelector.click();
			Thread.sleep(3000);
		
}
		
		public void format() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("https://www.daraz.com.bd/");
			/*
			 * Relative Xpath:
			 * format1=//tagName[@AttributeName='value']
			 * format2=//*[@AttributeName='value']
			 * format3=//*[contains(test(),'value')]
			 * format3=//*[@AttributeName='value']
			 * format4=//*[@AttributeName='value' and @AttributeName='value']
			 * format4=//*[@AttributeName='value' or @AttributeName='value']
			 */
			
			WebElement Format = driver.findElement(By.cssSelector(".bld-txt"));
			Format.click();
			Thread.sleep(3000);
		
}
}