package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/2013/05/page-one.html");//driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("drop1")).click();
		//driver.findElement(By.className ("combobox")).click();//Older NewsLetter Dropdown
		//driver.findElement(By.tagName("select")).click();
		//Needs to revise driver.findElement(By.linkText("select")).click();
		driver.findElement(By.xpath("//span[@id='blogsmenu']")).click();
		// driver.findElement(By.xpath("//tag[@attribute='value']"));
		driver.findElement(By.cssSelector("#but2")).click();
	}

}
