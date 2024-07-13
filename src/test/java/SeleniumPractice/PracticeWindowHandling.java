package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		String OldWindow=driver.getWindowHandle();
		WebElement wb=driver.findElement(By.cssSelector("#selenium143"));
		wb.click();
		Set<String> allWindow=driver.getWindowHandles();
		for(String window:allWindow) {
			if(!window.equals(OldWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/c/QAFox/playlists\"]//img")).click();
		driver.close();
		driver.switchTo().window(OldWindow);
	}

}
