package com.tka.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases4 {
	WebDriver driver;
	
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		//browser will open
		driver.get("http://www.google.com");
		String actualTitle=driver.getTitle();
		String expectedTiltle="Google";
		Assert.assertEquals(actualTitle, expectedTiltle);
		//driver.close();
	}
	@Test
	//To verify the text contents
	 public void verifyText()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			//browser will open
			driver.get("https://javabykiran.com/liveproject/index.html");
			WebElement heading=driver.findElement(By.xpath("/html/body/div/div[2]/a"));
			
			String actualTitle=driver.getTitle();
			String expectedTiltle="Sign in to start your session";
			Assert.assertEquals(actualTitle, expectedTiltle);
			driver.close();
		}
	//To verify title of next page
	@Test
	public void verifyNextPagrTitle()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		//browser will open
		driver.get("https://javabykiran.com/liveproject/index.html");
		WebElement email=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
		email.sendKeys("kiran@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
		password.sendKeys("123456");
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
		button.click();
		
		String actualTitle=driver.getTitle();
		String expectedTiltle="JavaByKiran | Dashboard";
		Assert.assertEquals(actualTitle, expectedTiltle);
		driver.close();
	}
	
	//**************HomeWork Test Cases************
	@Test
	public void verifyTitle1()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		//browser will open
		driver.get("https://javabykiran.com/liveproject/index.html");
		
		WebElement heading=driver.findElement(By.xpath("//b"));
		String actualheading=heading.getText();
		String expectedheading="TheKiranAcademy";
		Assert.assertEquals( actualheading , expectedheading);
		driver.close();

	}
}
