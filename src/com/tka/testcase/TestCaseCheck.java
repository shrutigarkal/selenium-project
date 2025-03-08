package com.tka.testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;

;

public class TestCaseCheck {
	@Test
	public void check() 
	{
		String a="Java";
		String e="Java1";
		AssertJUnit.assertEquals(a, e);
	}

}
