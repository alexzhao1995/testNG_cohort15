package testNG_day02;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotations extends GroupingTests { 

	@Test(dependsOnMethods = "enviromentTest")
	public void testPrintMessage() {
		System.out.println("inside testPrintMessage");
	}

	@Test(dependsOnMethods = "anotherBoringTest") // method from GroupingTests, need to extend if from another class
	public void enviromentTest() {
		System.out.println("Testing environment");
//		Assert.assertTrue(false);
	}

}
