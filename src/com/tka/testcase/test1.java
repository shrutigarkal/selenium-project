package com.tka.testcase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	public class test1 {
		WebDriver driver;
		
		
		@BeforeMethod
		public void siteopen()
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://thekiranacademy.com/test/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
	@Test
		public void pageTitle()
		{
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Online Quiz to test your skills in Java,Python,MySQL,Testing";
		Assert.assertEquals(actualTitle,expectedTitle);
			
		driver.close();
		}

	@Test
		public void logo()
		{
		WebElement img=driver.findElement(By.xpath("//img[@src='https://thekiranacademy.com/img/tka.png']"));
		boolean flag=img.isDisplayed();
		Assert.assertEquals(flag,true);
		driver.close();
		}


	@Test
		public void hyperlink()
		{
		WebElement heading=driver.findElement(By.xpath("//span[@class='sr-only']"));
		String actualurlheading=heading.getText();
		String expectedheading="Home";
		Assert.assertEquals(actualurlheading,expectedheading);
		driver.close();
		}


	@Test
		public void emailInput()
		{
		WebElement emailInput= driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		boolean isDisplayed = emailInput.isDisplayed();
	    Assert.assertEquals(isDisplayed,true);
	    driver.close();
		}


	@Test
		public void VerifyTextBox()
		{
		WebElement heading=driver.findElement(By.xpath("//h4[text()='Core Java']"));
		String actualurlName=heading.getText();
		String expectedName="Core Java";
		Assert.assertEquals(actualurlName,expectedName);
		driver.close();
		}


	@Test
		public void VerifyTestTextBox1()
		{
		WebElement heading=driver.findElement(By.xpath("//h4[text()='Selenium']"));
		String actualurlName=heading.getText();
		String expectedName="Selenium";
		Assert.assertEquals(actualurlName,expectedName);
		driver.close();
		}

	@Test
		public void VerifyTestTextBox2() {
		WebElement heading=driver.findElement(By.xpath("//h4[text()='Python']"));
		String actualurlName=heading.getText();
		String expectedName="Python";
		Assert.assertEquals(actualurlName,expectedName);
		driver.close();
	}

	@Test
	public void VerifyButton()
	{	
		WebElement button= driver.findElement(By.xpath("//button[@type='submit']"));
		boolean isDisplayed = button.isDisplayed();
	    Assert.assertEquals(isDisplayed,true);
	    driver.close();
		}
}
