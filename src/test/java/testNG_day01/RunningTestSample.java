package testNG_day01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunningTestSample {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@BeforeTest
	public void beforeTest() {
//		group of many classes == 1 test
		System.out.println("Before test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}

	@Test(groups = {"regression", "smoke"})
	public void test1() {
		System.out.println("Test1");
	}

	@Test(groups = {"regression", "loadTesting"})
	public void test2() {
		System.out.println("Test2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

	@AfterTest
	public void afterTest() {
//		group of many classes == 1 test
		System.out.println("After test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}

}
