package selenium.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		// switch on frame by using name or id attribute
		// driver.switchTo().frame("navbar-iframe");

		// switch on frame by using index
		// driver.switchTo().frame(0);

		// switch on frame by using WebElement
		WebElement frame = driver.findElement(By.xpath("//button[@aria-controls=\"collapseThree\"]"));
		//driver.switchTo().frame(frame);
		frame.click();
		WebElement Fr=driver.findElement(By.xpath("//a[@href=\"frames.php\"]"));
		Fr.click();
		 Thread.sleep(3000);
		 driver.close();
		//driver.findElement(By.cssSelector("input#b-query")).sendKeys("Sample Text");

		// Selects either the first frame on the page, or the main document when a page
		// containsiframes
		//driver.switchTo().defaultContent();

		//driver.findElement(By.cssSelector("#ta1")).sendKeys("Sample text");

		//driver.quit();		
	}

}
