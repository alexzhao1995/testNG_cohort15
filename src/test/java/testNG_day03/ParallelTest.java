package testNG_day03;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test
	public void chromeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://techcircle.dev/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);
	}
	
	
	@Test
	public void safariTest() {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://techcircle.dev/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);
	}

}
