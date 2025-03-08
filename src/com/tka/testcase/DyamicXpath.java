package com.tka.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DyamicXpath {
WebDriver driver;
	
@Test
//To verify the text contents
 public void verifyText_Dashboard_Users()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		//browser will open the website
		//Used absolute
		driver.get("https://javabykiran.com/liveproject/pages/examples/dashboard.html");
		//used relative
		WebElement heading=driver.findElement(By.xpath("//span[text()='Users']"));
		
		String actualheading=heading.getText();
		String expectedheading ="Users" ;
		
		Assert.assertEquals(actualheading, expectedheading);
		driver.close();
	}

@Test
//To find element using relative xpath with axes
public void verifyPasswordBox()
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://javabykiran.com/liveproject/index.html");
	//used relative
	WebElement item=driver.findElement (By.xpath("//*[@id='email']//following::input[1]"));
	boolean flg=item.isDisplayed();
	Assert.assertEquals(flg, true);
	driver.close();
}

@Test
//using Contains
//To verify the text Contents
public void verifyText_Dashboard_Selenium()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		//browser will open the website
		//Used absolute
		driver.get("https://javabykiran.com/liveproject/pages/examples/dashboard.html");
		//used relative
		WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Selenium')]"));
		
		String actualheading=heading.getText();
		String expectedheading ="Selenium";
		
		
	}
@Test
public void verify_newregistration()
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	//browser will open the website
	//Used absolute
	driver.get("https://javabykiran.com/liveproject/index.html");
	//used relative
	WebElement heading=driver.findElement(By.xpath("//a[@href='pages/examples/register.html']"));
	
	String actualheading=heading.getText();
	String expectedheading ="Register a new membership" ;
	Assert.assertEquals(actualheading, expectedheading);
	driver.close();
}
}
