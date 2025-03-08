package com.tka.testcase;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewTest {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://javabykiran.com/liveproject/index.html");
		}
  @Test
  public void f() 
  {
		String actualTitle=driver.getTitle();
		String expectedTitle="JavaByKiran | Log in";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
  }
 
}
