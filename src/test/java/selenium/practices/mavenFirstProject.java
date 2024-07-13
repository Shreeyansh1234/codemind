package selenium.practices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;//forMicrosoftEdge

import org.openqa.selenium.chrome.ChromeDriver;//forChrome//
import org.openqa.selenium.firefox.FirefoxDriver;//forFireFox//
public class mavenFirstProject {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
driver.navigate().to("https://www.facebook.com/");//driver.get("https://www.facebook.com/");
driver.findElement(By.id ("email")).sendKeys("1@gmail.com"); 
driver.findElement(By.id ("pass")).sendKeys("123456789");  
driver.findElement(By.name("login")).click(); 
	//driver.quit();
		
//		System.out.println("*****//forMicrosoftEdge//******");
//		WebDriver driver =new EdgeDriver();
//		driver.get("https://www.acko.com/");
//		driver.quit();
		
//		System.out.println("*****//forFireFox//******");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.acko.com/");
//		driver.quit();
		
		
	}

}
