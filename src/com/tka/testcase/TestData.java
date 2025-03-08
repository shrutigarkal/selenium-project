package com.tka.testcase;

import org.testng.annotations.Test;

import org.testng.Assert;

public class TestData {
@Test	
	public void verify() 
	{
		String actual="TKA";
		String expected="TKA";
		Assert.assertEquals(actual,expected);
	}
@Test	
public void verify1() 
{
	String actual="TKAd";
	String expected="TKA";
	Assert.assertEquals(actual,expected);
}
@Test	
public void verify2() 
{
	String actual="TKA";
	String expected="TKA";
	Assert.assertEquals(actual,expected);
}

}
