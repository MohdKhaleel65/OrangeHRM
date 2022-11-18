package com.TestNG;

import org.testng.annotations.Test;

public class TestNGExample {
	
	@Test(priority=1) 
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail application launch successfully");
		
	}
	@Test(priority=2)
	public void inbox()
	{
		System.out.println("Gmail inbox launch successfully");
	}
	@Test (priority=3)
	public void composeMail()
	{
		System.out.println("compose mail launch successfully");
	}
	@Test(enabled=false)
	public void SentMail()
	{
		System.out.println(" sent mail launch successfully ");
	}

}
