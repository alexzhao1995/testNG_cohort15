package testNG_day01;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PrioritizeTests {

//	priority can sort out which test to run first, overrides alphanumerical unless same numbers
	@Test(priority = 1, groups = "loadTesting") 
	public void B() {
		System.out.println("B");
	}

	@Test(priority = 2, groups = "regression")
	public void D() {
		System.out.println("D");
	}


	@Test(priority = 3, groups = {"smoke", "loadTesting"})
	public void A() {
		System.out.println("A");
	}

	@Test(priority = 4, groups = "regression")
	public void C() {
		System.out.println("C");
	}
	
}
