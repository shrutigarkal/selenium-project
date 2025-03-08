package com.tka.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DriverTest {
	WebDriver driver;
	
//	code written using @BeforeMethod annotation will get executed before every test case
	@BeforeMethod
	public void siteopen()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
//		 browser will open
		driver.get("https://javabykiran.com/liveproject/index.html");
	}
	
	@Test
	public void verifyTitle()
	{
		
		String actualTitle=driver.getTitle();
		String expectedTitle="JavaByKiran | Log in";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}
	@Test
//	Functionality-login
//	test description when the login page opens it should display the TKA image
	//to verify image is displayed is not
	public void verifyDispImage()
	{
		
//		used absolute
		WebElement img=driver.findElement(By.xpath("/html/body/div/center/img"));
//		used relative
		boolean flg=img.isDisplayed();
		Assert.assertEquals(flg,true);
		driver.close();
		
	}
	@Test
	//to verify text contents
	public void verifyText()
	{
		
//		used relative
	WebElement heading=driver.findElement(By.xpath("//p"));
	
	
		String actualheading=heading.getText();
		String expectedheading="Sign in to start your session";
		
		Assert.assertEquals(actualheading, expectedheading);
		driver.close();

	}
	//To verify the url
	@Test
	public void verifyURL()
	{
		
		String currenturl=driver.getCurrentUrl();
		String actualurl="https://javabykiran.com/liveproject/index.html";
		Assert.assertEquals(currenturl,actualurl);
		driver.close();
		
	}
	
	@Test
	//To find element using relative xpath with axes
	public void verifyPasswordBox()
	{
		
		driver.get("https://javabykiran.com/jbkcrm/admin");
	
		WebElement item = driver.findElement (By.xpath("//*[@type='email']//following::input[1]"));
		boolean flg=item.isDisplayed();
		Assert.assertEquals(flg, true);
		driver.close();
		
		
	}
	@Test
	//To verify title of next page
	public void verifyNextPageTitle()
	{
		WebElement email=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
		email.sendKeys("kiran@gmail.com");
		WebElement password=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
		password.sendKeys("1234567");
		WebElement button=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
		button.click();
		String actualTitle=driver.getTitle();
		String expectedTitle="JavaByKiran | Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
		
	}
	@Test
	//to verify text contents
	public void verifyText_Dashboard_Users()
	{
//		used absolute
		driver.get("https://javabykiran.com/liveproject/pages/examples/dashboard.html");
//		used relative
	WebElement heading=driver.findElement(By.xpath("//span[text()='Users']"));
	
	
		String actualheading=heading.getText();
		String expectedheading="Users";
		
		Assert.assertEquals(actualheading, expectedheading);
		driver.close();

	}
	@Test
//	using contains
	//to verify text contents
	public void verifyText_Dashboard_Selenium()
	{
		driver.get("https://javabykiran.com/liveproject/pages/examples/dashboard.html");
//		used relative
	WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Selenium')]"));
	
	
		String actualheading=heading.getText();
		String expectedheading="Selenium";
		
		Assert.assertEquals(actualheading, expectedheading);
		driver.close();

	}
	@Test
//	using contains
	//to verify text contents
	public void verifyText_Dashboard_Download()
	{
		driver.get("https://javabykiran.com/liveproject/pages/examples/dashboard.html");
//		used relative
	WebElement heading=driver.findElement(By.xpath("//span[text()=,'Downloads']"));
	
	
		String actualheading=heading.getText();
		String expectedheading="Downloads List";
		
		Assert.assertEquals(actualheading, expectedheading);
		driver.close();

	}
	
}


