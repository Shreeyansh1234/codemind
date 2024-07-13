package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleBasicEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium143.blogspot.com/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/c/QAFox/playlists\"]//img")).click();

	}

}
