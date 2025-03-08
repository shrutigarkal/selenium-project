package com.tka.testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverEg {
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
		driver.close();
	}
	@Test
 //Functionality-login
 //test description when the login page opens it shoudle display the TKA image
 //To verify image is displayed is not
 public void verifyDisplayImage()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//browser will open
		driver.get("https://javabykiran.com/liveproject/index.html");
		WebElement img=driver.findElement(By.xpath("/html/body/div/center/img"));
		boolean flg=img.isDisplayed();
		Assert.assertEquals(flg,true);
		//driver.close();
}
 
 @Test
 public void verifyDisplayImage1()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//browser will open
		driver.get("https://www.instagram.com/");
		WebElement img=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/section/main/article/div[2]/div[1]/div[1]/i"));
		boolean flg=img.isDisplayed();
		Assert.assertEquals(flg,true);
		//driver.close();
	}
 @Test
 //To verify the text contents
 public void verifyText()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		//browser will open the website
		driver.get("https://javabykiran.com/liveproject/index.html");
		WebElement heading=driver.findElement(By.xpath("/html/body/div/div[2]/a"));
		
		String actualTitle=driver.getTitle();
		String expectedTiltle="Sign in to start your session";
		Assert.assertEquals(actualTitle, expectedTiltle);
		driver.close();
	}
 @Test
 //To Verify the Url
 public void verifyURL()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		//browser will open the website
		driver.get("https://javabykiran.com/liveproject/index.html");
		
		String currenturl=driver.getCurrentUrl();
		String actualurl="https://javabykiran.com/liveproject/index.html";
		Assert.assertEquals(currenturl, actualurl);
		driver.close();
	}
 @Test
 //To Find element by id
 public void verifyEmail_ById()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		//browser will open the website
		driver.get("https://javabykiran.com/liveproject/index.html");
	
		WebElement item = driver.findElement(By.id("email"));
		boolean flg=item.isDisplayed();
		Assert.assertEquals(flg, true);
		driver.close();
		
	}
 @Test
	public void verifyNextPageTitle()
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
}
