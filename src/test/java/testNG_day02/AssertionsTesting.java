package testNG_day02;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionsTesting {
	
	@Test
	public void test1() {
		
//		find report under test-output folder --> index.html --> Reporter output
		Reporter.log("Verifying the title of the page");
		
		String expectedTitle = "Hello World dev";
		String actualTitle = "Hello World Dev";
		
		Assert.assertEquals(actualTitle, expectedTitle, "Titles of the website do not match");
	}

}
