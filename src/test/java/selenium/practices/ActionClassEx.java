package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com/");

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		actions.click(driver.findElement(By.cssSelector("textarea[name='q']"))).build().perform();

		actions.keyDown(Keys.SHIFT).keyDown("a").keyUp(Keys.SHIFT).keyUp("a").build().perform();

		actions.doubleClick(driver.findElement(By.cssSelector("textarea[name='q']"))).build().perform();

		driver.navigate().to("https://omayo.blogspot.com/");

		actions.moveToElement(driver.findElement(By.cssSelector("span#blogsmenu"))).build().perform();

		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		actions.dragAndDrop(driver.findElement(By.cssSelector("#draggable")),
				driver.findElement(By.cssSelector("#droppable"))).build().perform();
		Thread.sleep(5000);
		actions.contextClick().build().perform();

	}
}
