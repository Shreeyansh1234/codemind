package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExTestCaseGroup {
WebDriver driver;

@BeforeMethod(alwaysRun = true)
public void LuanchBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
}

@Test(groups = { "sanity" })
public void verifyPageUrl() {
	Reporter.log("Before Verify Page URL");
	Assert.assertEquals(driver.getCurrentUrl(), " https://www.tutorialspoint.com/selenium/practice/radio-button.php");
	Reporter.log("After Verify Page URL");
}

@Test(groups= {"sanity"})
public void radioButtonYes() {
	Assert.assertFalse(driver.findElement(By.xpath("//label[text()=\"Yes\"]")).isSelected());
	
}

@Test(groups={"sanity","smoke"})
public void radioButtonImpressive() {
	
	Assert.assertFalse(driver.findElement(By.xpath("//label[text()=\"Impressive\"]")).isSelected());
	
} 

@AfterMethod(alwaysRun = true)
public void tearDown() {
	driver.quit();
}
}
