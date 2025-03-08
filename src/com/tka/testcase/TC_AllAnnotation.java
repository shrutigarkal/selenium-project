package com.tka.testcase;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC_AllAnnotation {
	WebDriver driver;
	
  @Test
  public void f() 
  {
	  String actualTitle=driver.getTitle();
		String expectedTitle="JavaByKiran | Log in";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before Method");
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/liveproject/index.html");
	}
  

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After Suite");
  }

}

