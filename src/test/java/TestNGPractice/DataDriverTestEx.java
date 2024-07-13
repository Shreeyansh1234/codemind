package TestNGPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverTestEx {
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/newtours/");
	}

	@Test(dataProvider = "loginData")
	public void verifyValidLogin(String userName, String password) {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		String actualLoginSuccesfulMsg = driver.findElement(By.xpath("//h3")).getText();

		Assert.assertEquals(actualLoginSuccesfulMsg, "Login Successfully");

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name = "loginData")
	public String[][] dataProvider() {

		String users[][] = { { "admin", "admin@123" }, { "admin1", "admin@432" }, { "admin2", "admin@455" } };

		return users;
	}


}
