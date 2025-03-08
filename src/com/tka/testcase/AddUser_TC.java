package com.tka.testcase;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddUser_TC {
	WebDriver driver;
	@BeforeMethod
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://javabykiran.com/liveproject/pages/examples/add_user.html");
		driver.manage().window().maximize();

}
//verify if the drop down exist and we can select the items from dropdown
	@Test
	public void verify_addUser()
	{
		driver.findElement (By.id("username")).sendKeys("AAA");
		driver.findElement (By.id("mobile")).sendKeys("70286666157");
		driver.findElement (By.id("email")).sendKeys("w@gmail.com");
		driver.findElement (By.id("course")).sendKeys("BBB");
		driver.findElement (By.id("password")).sendKeys("CCC");
		Select state=new Select(driver.findElement(By.xpath("//Select")));
		state.selectByVisibleText("HP");
		//getoptions () will fetch all the options from the 
		/*List<WebElement> listofState=state.getOptions();
		for(WebElement st:listofState)
		{
			System.out.println(st.getText());
		}*/
		
		WebElement maleradiobtn=driver.findElement(By.id("Male"));
		 maleradiobtn.click();
		 driver.findElement(By.xpath("//button[text()='Sumit']")).click();
		 Alert alert=driver.switchTo().alert();
			String actualalert=alert.getText();
			String expectedtext="User Added successfully. You can not see added user.";
			alert.accept();
			Assert.assertEquals(actualalert,expectedtext);
			driver.close();
			
	}

	}
