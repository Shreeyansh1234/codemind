package selenium.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
try {
		 // Open the target website
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        // Click on the element to trigger the prompt alert
        driver.findElement(By.xpath("//input[@id='prompt']")).click();

        // Switch to the alert and wait for it to be present
        Alert alt = driver.switchTo().alert();

        // Print the alert text
        System.out.println("Alert text: " + alt.getText());

        // Send keys to the prompt alert
        alt.sendKeys("Welcome");
        Thread.sleep(1000);

        // Accept the alert
        //alt.accept();

               
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close the browser
        driver.quit();
    }
	}

}
