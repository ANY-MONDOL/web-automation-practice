package com.it.bd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExamples {
	@Test(priority = 1)
	public void firstTest(){
		System.out.println("THIS IS A FIRST TEST");
	}
	@Test(priority = 0)
	public void secondTest(){
		System.out.println("THIS IS A second TEST");
	}
	@Test(priority = 2)
	public void thirdTest(){
		System.out.println("THIS IS A third TEST");
	}
	@BeforeSuite
	public void beforesuiteTest(){
		System.out.println("THIS IS A beforesuite TEST");
	}
	@AfterSuite
	public void aftersuiteTest(){
		System.out.println("THIS IS A aftersuite TEST");
	}
	@BeforeClass
	public void beforeclassTest(){
		System.out.println("THIS IS A beforeclass TEST");
	}
	@AfterClass
	public void afterclassTest(){
		System.out.println("THIS IS A afterclass TEST");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("THIS IS A before TEST");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("THIS IS A after TEST");
	}
	@AfterMethod
	public void aftermethodTest(){
		System.out.println("THIS IS A aftermethod TEST");
	}
	@BeforeMethod
	public void beforemethodTest(){
		System.out.println("THIS IS A beforemethod TEST");
	}
	
	







}
