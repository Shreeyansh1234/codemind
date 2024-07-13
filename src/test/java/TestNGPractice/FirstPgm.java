package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstPgm {
	@Test
	public void verifyHomePageTitle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));

		driver.get("https://omayo.blogspot.com/");

		// omayo (QAFox.com)

		// actual
		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "omayo (QAFox.com)");
	}
}
