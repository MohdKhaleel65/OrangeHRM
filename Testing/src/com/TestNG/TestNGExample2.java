package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample2{
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail application launch successfully");
		
	}
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println(" Gmail closed successfully");
	}


	@Test(priority=1)
	public void inbox()
	{
		System.out.println("Gmail inbox launch successfully");
	}
	@Test (enabled=false)
	public void composeMail()
	{
		System.out.println("compose mail launch successfully");
	}
	@Test(priority=2)
	public void SentMail()
	{
		System.out.println(" sent mail launch successfully ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
