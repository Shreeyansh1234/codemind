package TestNGPractice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertEx {
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
	}

	@Test
	public void verifyPageUrl() {
		assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
		System.out.println("###########");
		assertNotEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/ ", "Current url is equal");

		assertFalse(driver.findElement(By.cssSelector("#radio1")).isSelected());//true

		assertTrue(driver.findElement(By.cssSelector("#checkbox1")).isSelected());//true

		//assertTrue(driver.getCurrentUrl().equals(" https://omayo.blogspot.com/"), "Url is not equals");//false

		System.out.println("Before failing assertion");

		assertTrue(driver.findElement(By.cssSelector("#radio2")).isSelected(), "Female radio button");

		System.out.println("After failing assertion");
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
