package com.it.bd;

import org.testng.annotations.Test;

public class OpenUrl extends BaseDriver{
	String url = "https://testng.org/";
	@Test
	public void TestUrl(){
		driver.manage().window().maximize();
		driver.get(url);
	}

}

