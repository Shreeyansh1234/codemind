package selenium.practices;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWhichIsNotUnderSelectTag {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.airvistara.com/in/en");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//img[contains(@src,'arrow-purple')]")).click();

//		driver.findElement(By.xpath("//ul[@id='country-scroll']//li/span[text()='Qatar']")).click();

		List<WebElement> countries = driver.findElements(By.xpath("//ul[@id='country-scroll']//li/span"));

		for (WebElement country : countries) {
			if (country.getText().equals("Germany")) {
				country.click();
				break;
			}
		}
	}
}


