package selenium.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAlertHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[contains(@id,'confirm')]")).click();

		Alert alt = driver.switchTo().alert();

		System.out.println(alt.getText());

		// accept will do positive action, ok, yes, accept
		// alt.accept();

		// Dismiss will do negative action cancel, deny, no
		alt.dismiss();
		

		WebElement textbox = driver.findElement(By.xpath("//input[contains(@name,'textbox')]"));
		textbox.sendKeys("after handle alert");
		driver.quit();

	}

}
