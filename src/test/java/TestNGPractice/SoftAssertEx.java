package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	WebDriver driver;
	SoftAssert softAssert;

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		softAssert = new SoftAssert();
	}

	@Test
	public void verifyPageUrl() {
		softAssert.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");//true

		softAssert.assertNotEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/  ", "Current url is equal");

		softAssert.assertFalse(driver.findElement(By.cssSelector("#radio1")).isSelected());

		softAssert.assertTrue(driver.findElement(By.cssSelector("#checkbox1")).isSelected());

		softAssert.assertTrue(driver.getCurrentUrl().equals("https://omayo.blogspot.com/"), "Url is not equals");

		System.out.println("Before failing assertion");

		softAssert.assertTrue(driver.findElement(By.cssSelector("#radio2")).isSelected(), "**Female radio button**");

		System.out.println("After failing assertion");

		softAssert.assertAll();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {

		driver.quit();
	}

}
