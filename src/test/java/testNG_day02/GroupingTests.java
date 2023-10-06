package testNG_day02;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingTests {
	
//	grouping is like a filter, ex. IG hashtag
	@Test(groups = "smoke")
	public void alexTest() {
		System.out.println("alexTest");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void everTest() {
		System.out.println("everTest");
	}
	
	@Test(groups = "functional")
	public void shafkatTest() {
		System.out.println("shafkatTest");
	}
	
	@Test(groups = {"functional", "smoke"})
	public void gianinaTest() {
		System.out.println("gianinaTest");
	}
	
	@Test(groups = "example")
	public void anotherBoringTest() {
		System.out.println();
	}

}
