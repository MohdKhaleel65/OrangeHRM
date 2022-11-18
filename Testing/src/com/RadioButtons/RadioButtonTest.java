package com.RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {
	
	@Test
	public void RadioButtonTesting_Group1() throws InterruptedException
	{
		 WebElement radioButtonBlock=
				 driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	List<WebElement>radioButtons=radioButtonBlock.findElements(By.name("group1"));
	System.out.println(radioButtons.size());
	for(int i=0;i<radioButtons.size();i++)
	{
		radioButtons.get(i).click();
		Thread.sleep(10000);
	for(int j=0;j<radioButtons.size();j++)
	{
		System.out.println(radioButtons.get(j).getAttribute("value")+" "+radioButtons.get(j).getAttribute("checked"));
	}
	System.out.println();
	}
	
		
	}
	@Test
	public void RadioButtonTesting() throws InterruptedException
	{
		 WebElement radioButtonBlock=
				 driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	List<WebElement>radioButtons=radioButtonBlock.findElements(By.name("group2"));
	System.out.println(radioButtons.size());
	for(int i=0;i<radioButtons.size();i++)
	{
		radioButtons.get(i).click();
		Thread.sleep(10000);
	for(int j=0;j<radioButtons.size();j++)
	{
		System.out.println(radioButtons.get(j).getAttribute("value")+" "+radioButtons.get(j).getAttribute("checked"));
	}
	System.out.println();
	}
	
	}
}
