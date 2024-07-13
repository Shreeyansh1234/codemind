package TestNGPractice;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationUseCaseEx {
	
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
		Assert.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
	}

	@Test
	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
