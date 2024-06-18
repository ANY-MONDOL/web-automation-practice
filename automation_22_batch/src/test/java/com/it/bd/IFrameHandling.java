package com.it.bd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameHandling extends BaseDriver{
	
	String url="https://demoqa.com/frames";
	@Test
	public void testIFrame() {
		driver.manage().window().maximize();
		driver.get(url);
		
		List<WebElement> iFrame_number=driver.findElements(By.tagName("iframe"));
		System.out.println(iFrame_number.size());
//		switch to frame
		driver.switchTo().frame("frame1");
		
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		
//		switch to parent
		driver.switchTo().parentFrame();
		
		WebElement text2= driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]"));
		System.out.println(text2.getText());
	}

	
}
