package TestNGPractice;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.utility;

public class RegistrationTestCaseEx {
	WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws IOException{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(utility.readProperty("registration"));
		//driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	}

	@Test(groups = { "sanity" })
	public void verifyPageUrl() throws InvalidFormatException, IOException {
		ArrayList<String> alist = utility.readExcelFile("Sheet1");

		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(alist.get(0));
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(alist.get(1));
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys(alist.get(2));
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys(alist.get(3));

		WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='country']"));
		utility.selectValueFromDropdown(countryDropdown, alist.get(4));
	}


	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}


}
