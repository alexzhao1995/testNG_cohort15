package testNG_day02;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplication {
	
	@Test
	@Parameters({"val1", "val2"})
	public void multiply(int value1, int value2) {
		int finalValue = value1 * value2;
		System.out.println(value1 + " * " + value2 + " = " + finalValue);
		
	}

}
