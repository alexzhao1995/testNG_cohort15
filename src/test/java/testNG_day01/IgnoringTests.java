package testNG_day01;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoringTests {
	
	@Test(enabled = true, groups = "smoke") 
	public void test1() {
		System.out.println("enabled Test1");
	}
	
	@Test(groups = "regression")
	public void test2() {
		System.out.println("enabled Test2");
	}

}
