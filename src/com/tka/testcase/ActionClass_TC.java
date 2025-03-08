package com.tka.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass_TC {
	WebDriver driver; 
	Actions act; 
	@Test 
	public void login() throws InterruptedException 
	{ 
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	driver=new ChromeDriver(); 
	//browser will open 
	driver.get("https://javabykiran.com/liveproject/index.html"); 
	WebElement img=driver.findElement(By.xpath("//img")); 
	act=new Actions (driver); 
	// right click on image 
	act.contextClick(img).click(); 
	// Thread.sleep(1000); 
	WebElement email = driver.findElement (By.id("email")); 
	WebElement password = driver.findElement (By.id("password")); 
	WebElement button = driver.findElement (By.xpath("//button")); 
	act.moveToElement(email).click().sendKeys("kiran@gmail.com").build().perform();
	Thread.sleep(1000); 
	act.click(password).sendKeys("123456").build().perform(); 
	Thread.sleep(1000); 
	act.click(button).perform(); 
	driver.quit(); 
	} 
	}