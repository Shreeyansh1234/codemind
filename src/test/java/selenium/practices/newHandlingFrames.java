package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class newHandlingFrames {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		// switch on frame by using name or id attribute
		// driver.switchTo().frame("navbar-iframe");

		// switch on frame by using index
		// driver.switchTo().frame(0);

		// switch on frame by using WebElement
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		driver.switchTo().frame(frame);

		driver.findElement(By.cssSelector("input#b-query")).sendKeys("new Sample Text");

		// Selects either the first frame on the page, or the main document when a page
		// containsiframes
		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Sample text");


	}

}
