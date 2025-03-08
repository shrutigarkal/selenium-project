package com.tka.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	
		WebDriver driver;
		
		@Test
		public void verifyTitle()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			//browser will open
			driver.get("https://thekiranacademy.com/test/");
			//WebElement heading=driver.findElement(By.xpath("//b"));
			String actualTitle=driver.getTitle();
			String expectedTiltle="Online Quiz to test your skills in Java,Python,MySQL,Testing";
			Assert.assertEquals(actualTitle, expectedTiltle);
			driver.close();
			
		}

		
		
	}


