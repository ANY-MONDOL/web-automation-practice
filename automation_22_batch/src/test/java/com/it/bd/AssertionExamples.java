package com.it.bd;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class AssertionExamples extends BaseDriver{
	
	public void HardAssertionTest()throws InterruptedException{
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		String expectedTitle="Amazon.com. Spend less. Smile more.";
	    String actualTitle=driver.getTitle();
	    
	    Assert.assertEquals(actualTitle, expectedTitle);
		WebElement option= driver.findElement(By.id("searchDropdownBox"));
		
		Select select= new Select(option);
//		index
        select.selectByIndex(5);
        Thread.sleep(5000);
////        Text
//        select.selectByVisibleText("Electronics");
//        Thread.sleep(5000);
        

}
	@Test
public void SoftAssertionTest()throws InterruptedException{
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		SoftAssert assertion=new SoftAssert();
		String expectedTitle="Amazon.com. Spend less. Smile more.";
	    String actualTitle=driver.getTitle();
	    
	    assertion.assertEquals(actualTitle, expectedTitle);
		WebElement option= driver.findElement(By.id("searchDropdownBox"));
		
		Select select= new Select(option);
//		index
        select.selectByIndex(5);
        Thread.sleep(5000);
        assertion.assertAll();
}
}
