package testNG_day03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlakyTests {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}

}
