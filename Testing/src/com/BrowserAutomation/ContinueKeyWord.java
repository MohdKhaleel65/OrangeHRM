package com.BrowserAutomation;

public class ContinueKeyWord {
public static void main(String[] args) {
	int i;
	for(i=1;i<=6;i++)
	{
		if(i==4)
		{
			System.out.println(i+""+"testing");
			continue;//continue skips the current iteration
		}
		System.out.println(i+"" + " Selenium");
			
	}
	
}
}
