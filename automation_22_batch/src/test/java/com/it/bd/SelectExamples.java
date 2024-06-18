package com.it.bd;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectExamples extends BaseDriver{
	@Test
	public void HoverTest()throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		WebElement option= driver.findElement(By.id("searchDropdownBox"));
		
		Select select= new Select(option);
//		index
        select.selectByIndex(5);
        Thread.sleep(5000);
//        Text
        select.selectByVisibleText("Electronics");
        Thread.sleep(5000);
        
		
}
}
