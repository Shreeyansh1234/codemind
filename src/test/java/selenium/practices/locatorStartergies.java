package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locatorStartergies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("radio2")).click();
		driver.findElement(By.name("q")).sendKeys("Codemind");
		//driver.findElement(By.className("gsc-input")).sendKeys("Codemind");
		//driver.findElement(By.partialLinkText("Selenium14")).click(); 
		driver.findElement(By.partialLinkText("SeleniumT")).click();
		//driver.findElement(By.linkText("SeleniumTutorial")).click();

	}

}
