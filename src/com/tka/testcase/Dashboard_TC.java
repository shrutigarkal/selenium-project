package com.tka.testcase;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dashboard_TC {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://javabykiran.com/liveproject/pages/examples/dashboard.html");
		driver.manage().window().maximize();
	}
	
	public void verify_dashboard_contents()
	{
		ArrayList<String> expectedList=new ArrayList<String>();
		expectedList.add("Selenium");
		expectedList.add("Java /J2EE ");
		expectedList.add("Python");
		expectedList.add("Php");
		ArrayList<String> actualList=new ArrayList();
		List<WebElement> listofCOurses=driver.findElements(By.tagName("h3"));
		
		for(WebElement c:listofCOurses)
		{
			actualList.add(c.getText());
		}
		Assert.assertEquals(actualList, expectedList);
		driver.close();
	}
		
	}


