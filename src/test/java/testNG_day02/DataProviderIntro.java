package testNG_day02;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIntro {

	@DataProvider(name = "names")
	public Object[][] dataProviderMethod1() { // using Object instead of specific dataType is more flexible
		return new Object[][] { { "Shafkat" }, { "Alex" }, { "Imran" }, { "EverAtLowes" } };
	}

	@DataProvider(name = "listValues")
	public Object[][] dataProviderMethod2() { // using 2D arrays lets you pass multiple sets of data
		return new Object[][] { { "Shafkat", 36 }, { "Alex", 28 }, { "Imran", 33 }, { "EverAtLowes", 22 } };
	}

//	@DataProvider(name = "names")
//	public String[][] dataProviderMethod() {
//		return new String[][] {{"Shafkat"}, {"Alex"}, {"Imran"}, {"EverAtLowes"}};
//	}

	@Test(dataProvider = "names", enabled = false)
	public void myTest1(String name) {
		System.out.println("My name is " + name);
	}

	@Test(dataProvider = "listValues", enabled = false)
	public void myTest2(String name, Integer age) { // when dealing with Objects its better to use wrapper classes
		System.out.println("My name is " + name + " and I am " + age + " years old");
	}

//	pass 3 values a, b, and result to check if the sum is equal to result or not.
//	a, b, sum
//	check to see if the sum of the 2 values are actually equal to sum value

	@DataProvider(name = "values")
	public Object[][] values() {
		return new Object[][] { { 1, 2, 3 }, { 2, 3, 5 }, { 3, 7, 10 } };
	}

	@Test(dataProvider = "values", enabled = true)
	public void sum(Integer a, Integer b, Integer result) {
		int sum = a + b;
		Assert.assertEquals(result, sum);
		System.out.println("result " + result + " = " + sum);
	}

//	Key:

	@DataProvider(name = "addedValues")
	public Object[][] dataProvider3() {
		return new Object[][] { { 2, 3, 5 }, { 5, 7, 9 } };
	}

	@Test(dataProvider = "addedValues", enabled = true)
	public void checkValues(int a, int b, int result) {
		int sum = a + b;
		Assert.assertEquals(result, sum);
		System.out.println(result);
	}

}
