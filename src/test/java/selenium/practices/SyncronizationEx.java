package selenium.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncronizationEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement wb=driver.findElement(By.cssSelector("#delayedText"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb));
		System.out.println(wb.isDisplayed());
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("#deletesuccess"))));
		//System.out.println(driver.findElement(By.cssSelector("#deletesuccess")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("#deletesuccess")).isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#myBtn"))));
				//ExpectedConditions.attributeContains(driver.findElement(By.cssSelector("#myBtn")), "disabled", ""));
				//

		System.out.println(driver.findElement(By.cssSelector("#myBtn")).isEnabled());
		
		driver.quit();
		
		
	}

}
