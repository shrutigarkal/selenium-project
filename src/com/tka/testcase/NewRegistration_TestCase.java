package com.tka.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewRegistration_TestCase {
	WebDriver driver;
	@Test
	public void verify_newregistration()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
//		 browser will open the website
//		used absolute
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/liveproject/index.html");
//		used relative
	   WebElement heading=driver.findElement(By.xpath("//a[@href='pages/examples/register.html']"));
		String actualheading=heading.getText();
		String expectedheading="Register a new membership";
		Assert.assertEquals(actualheading, expectedheading);
		driver.close();

	}
	@Test
	public void verify_Alert()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
//		 browser will open the website
//		used absolute
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("AA");
	    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("27623432");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("m@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ABC");
	    driver.findElement(By.xpath("//button")).click();
		Alert alert=driver.switchTo().alert();
		String actualalert=alert.getText();
		String expectedtext="User registered successfully.";
		alert.accept();
		Assert.assertEquals(actualalert,expectedtext);
		driver.close();

	}
}
