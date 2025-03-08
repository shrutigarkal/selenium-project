package com.tka.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork{
	WebDriver driver;
	@Test
	//To verify the text contents
	 public void verifyText()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			//browser will open
			driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");
			WebElement heading=driver.findElement(By.xpath("//b"));
			
			String a=heading.getText();
			String e="Java By Kiran";
			Assert.assertEquals(a, e);
			driver.close();
		}
	@Test
	 public void verifyText1()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			//browser will open
			driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");
			WebElement heading=driver.findElement(By.xpath("//p"));
			
			String a=heading.getText();
			String e="Register a new membership ";
			Assert.assertEquals(a, e);
			driver.close();
		}
	@Test
	 public void verifyText2()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			//browser will open
			driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");
			WebElement heading=driver.findElement(By.xpath("//a[text()='I already have a membership']"));
			
			String a=heading.getText();
			String e="I already have a membership";
			Assert.assertEquals(a, e);
			driver.close();
		}
	
	@Test
	 public void verifyTextBox()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			//browser will open
			driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");
			WebElement item=driver.findElement(By.xpath("//input[@placeholder='Name']"));
			
			boolean flg = item.isDisplayed();
			Assert.assertEquals(flg,true);
			driver.close();
		}
	@Test
	 public void verifyTextBox1()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			//browser will open
			driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");
			WebElement item=driver.findElement(By.xpath("//input[@placeholder='Mobile']"));
			
			boolean flg = item.isDisplayed();
			Assert.assertEquals(flg,true);
			driver.close();
		}
	@Test
	 public void verifyTextBox2()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			//browser will open
			driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");
			WebElement item=driver.findElement(By.xpath("//input[@placeholder='Email']"));
			
			boolean flg = item.isDisplayed();
			Assert.assertEquals(flg,true);
			driver.close();
		}
	@Test
	 public void verifyTextBox3()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			//browser will open
			driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");
			WebElement item=driver.findElement(By.xpath("//input[@placeholder='Password']"));//input[@placeholder='Password']
			
			boolean flg = item.isDisplayed();
			Assert.assertEquals(flg,true);
			driver.close();
		}
	@Test
	public void verifyButton()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		//browser will open
		driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");
		WebElement item=driver.findElement(By.xpath("//button"));
		
		boolean flg = item.isDisplayed();
		Assert.assertEquals(flg,true);
		driver.close();
	
}

	}