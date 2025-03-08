package com.tka.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTC {
	SoftAssert softAssert = new SoftAssert();
	@Test
	public void d_jbkTestcase_One()
	{
		Assert.assertEquals(5,5);//pass
		System.out.println("Pass1");
		softAssert.assertAll();
		
	}
	@Test
	public void e_jbkTestcase_Two()
	{
		softAssert.assertEquals(22,22);//pass
		System.out.println("Pass2");
		softAssert.assertAll();

}


}
