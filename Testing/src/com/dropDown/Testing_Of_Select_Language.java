package com.dropDown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing_Of_Select_Language {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String ApplicationUrlAddress="https://www.osmania.ac.in";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		
		driver=new ChromeDriver();
		
		driver.navigate().to(ApplicationUrlAddress);
		driver.manage().window().maximize();
		WebElement selectlanguage=driver.findElement(By.id("gtranslate_selector"));
		
		List<WebElement>selectlanguageList=selectlanguage.findElements(By.tagName("option"));
	

		int selectLanguagelistCount=selectlanguageList.size();
		System.out.println("The number of elements in Select language DropDown are - "+selectLanguagelistCount);
		
		for(int i=0;i<selectLanguagelistCount;i++)
		{
			String selectlanguagedListNames=selectlanguageList.get(i).getText();
				System.out.println(i+" "+selectlanguagedListNames);
				//selectlanguageList.get(i).click();
				//Thread.sleep(3000);
				Select select=new Select(selectlanguage);
				//select.deselectByVisibleText("Hindi");
				//select.selectByIndex(7); // Telugu
				//select.selectByIndex(i);
				String Attributes=selectlanguageList.get(i).getAttribute("value");
		//System.out.println(i+""+Attributes);
			select.selectByValue(Attributes);
			Thread.sleep(3000);
			//File LanguagesScreeshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(LanguagesScreeshot,new File("./OU_Language_ScShots/"+i+".png"));
			File LanguagesScreeshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(LanguagesScreeshot,new File("./OU_Language_ScShots/"+selectlanguagedListNames+".png"));
				
		}
		driver.quit();
		}

}
