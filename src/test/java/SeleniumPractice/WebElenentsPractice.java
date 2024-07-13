package SeleniumPractice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElenentsPractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement wb=driver.findElement(By.xpath("//input[@id=\"uploadfile\"]"));
		System.out.println(wb.getAttribute("Choose File"));
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",wb);
//		wb.sendKeys("D:\\CodeMind\\Automat 	ion\\Locator stratergies in selenium.pdf");
	}

}
