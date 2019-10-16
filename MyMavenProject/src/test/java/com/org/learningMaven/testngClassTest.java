package com.org.learningMaven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngClassTest {

	@Test
	public void testTestNG()
	{
		Reporter.log("From TestNG Test!!!!", true);
	}
}
