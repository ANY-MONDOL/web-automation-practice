package com.it.bd;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabAndWindowHandling extends BaseDriver{
	
   String url1 ="https://demoqa.com/frames";
   String url2 ="https://www.daraz.com.bd/";
   
   public void tabTest() throws InterruptedException{
	  driver.manage().window().maximize();
	  driver.get(url1);
	  
	  String originalTab = driver.getWindowHandle();
	  Thread.sleep(3000);
	  
	  driver.switchTo().newWindow(WindowType.TAB);
	  String secondTab = driver.getWindowHandle();
	  
	  driver.get(url2);
	  Thread.sleep(3000);
	  
	  driver.switchTo().window(originalTab);
	  Thread.sleep(3000);

	  driver.switchTo().window(secondTab);
	  Thread.sleep(3000);
   }
   @Test

public void windowTest() throws InterruptedException{
	  driver.manage().window().maximize();
	  driver.get(url1);
	  
	  String originalWindow = driver.getWindowHandle();
	  Thread.sleep(3000);
	  
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  String secondWindow = driver.getWindowHandle();
	  
	  driver.get(url2);
	  Thread.sleep(3000);
	  
	  driver.switchTo().window(originalWindow);
	  Thread.sleep(3000);

	  driver.switchTo().window(secondWindow);
	  Thread.sleep(3000);
 }
   public void WithClickTest() throws InterruptedException{
		  driver.manage().window().maximize();
		  driver.get(url1);
		  
		  String originalWindow = driver.getWindowHandle();
		  Thread.sleep(3000);
		  
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  String secondWindow = driver.getWindowHandle();
		  
		  driver.get(url2);
		  Thread.sleep(3000);
		  
		  driver.switchTo().window(originalWindow);
		  Thread.sleep(3000);

		  driver.switchTo().window(secondWindow);
		  Thread.sleep(3000);
	 }
}
