package com.tka.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {
	
	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
		// For Checking the subjects on dashboard after we login
		@Test
		public void verify_dashboard_contents()
		{
			//Implicit Wait
			WebDriverWait wait = new WebDriverWait(driver, 15);
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("Admin");
		      
			
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button")).click();
	}
}