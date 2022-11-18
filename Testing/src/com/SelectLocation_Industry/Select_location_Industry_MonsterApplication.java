package com.SelectLocation_Industry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_location_Industry_MonsterApplication {

	public static void main(String[] args) {
		String ApplicatoinUrlAddress="https://my.monsterindia.com/sponsered_popup.html";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(ApplicatoinUrlAddress);
		WebElement selectLocation=driver.findElement(By.className("border_grey1"));
		Select select=new Select(selectLocation);
		select.selectByVisibleText("Delhi");
		select.selectByValue("1091");
		select.selectByIndex(8);
		select.selectByVisibleText("Nirmal");
		
		WebElement industry=driver.findElement(By.name("industry"));
		Select selection=new Select(industry);
		selection.selectByIndex(1);
		selection.selectByValue("4");
		selection.selectByVisibleText("Bio Technology & Life Sciences");
		//de select methods
		  selection.deselectByVisibleText("Other");
		  selection.deselectByIndex(0);
		//selection.deselectAll();
		/*List<WebElement>selectLocationList=selectLocation.findElements(By.tagName("option"));
		int selectLocationList_Count=selectLocationList.size();
		System.out.println(selectLocationList_Count);
		for (int i=0;i<selectLocationList_Count;i++)
		{
			 String locationNames=selectLocationList.get(i).getText();
			System.out.println(i+" "+locationNames);*/
		  //driver.quit();
		}

		
}

