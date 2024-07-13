package TestNGPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.utility;

public class TestCaseForGroupEx {
	WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws IOException{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(utility.readProperty("envURL"));
		//driver.get("https://omayo.blogspot.com/");
		
	}

	@Test(groups = { "sanity" })
	public void verifyPageUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
	}

	@Test(groups = { "sanity", "regression" })
	public void verifyMaleRadioBtnStatus() {
		Assert.assertFalse(driver.findElement(By.cssSelector("#radio1")).isSelected());
	}

	@Test(groups = { "regression", "smoke" })
	public void verifyFemaleRadioBtnStatus() {
		Assert.assertFalse(driver.findElement(By.cssSelector("#radio2")).isSelected());
	}

	@Test(enabled=true)
	public void verifyTitle() {
		Reporter.log("before verify title");
		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com) ");
		Reporter.log("after verify title");
	}

	@Test(groups = { "smoke" })
	public void verifyOrangeCheckboxStatus() {
		Reporter.log("before verify orage checkbox");
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkbox1")).isSelected());
		Reporter.log("after verify orage checkbox");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}


}
