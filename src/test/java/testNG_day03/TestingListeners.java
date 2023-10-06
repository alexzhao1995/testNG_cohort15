package testNG_day03;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenersTestNG.class)
public class TestingListeners {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test
	public void openBrowser() {
		WebDriverManager.chromedriver().setup(); // success test
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techcircle.dev/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false); // failed test
	}

}
