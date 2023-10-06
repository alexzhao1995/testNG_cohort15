package testNG_day03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@Parameters("browser")
	@BeforeClass(enabled = true)
	public void setUp(String browser) {
		
//		setting up multi browsers
		
//		if-else:
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);
		
		
//		switch:
//		String platform = "";
//		browser.equalsIgnoreCase(platform);
//		switch(browser) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//			
//		case "safari":
//			WebDriverManager.safaridriver().setup();
//			driver = new SafariDriver();
//			break;
//		}
//		
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.com/");
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		wait = new WebDriverWait(driver, 15);
		
	}
	
	
	@Test(enabled = true)
	public void searchItem() {
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("90 degree elbow");
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchButton.click();
		
//		verify "results for" text
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'results for')]")));
		WebElement resultText = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		Assert.assertTrue(resultText.isDisplayed(), "Result isn't displayed"); // text will display in exception log
		
	}
	
	@AfterClass(enabled = true)
	public void close() {
		driver.quit();
	}
	
}
