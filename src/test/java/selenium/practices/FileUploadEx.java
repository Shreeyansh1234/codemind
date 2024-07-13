package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement FileUpload=driver.findElement(By.cssSelector("input#uploadfile"));
		//Not Applicable---FileUpload.sendKeys("\"D:\\\\CodeMind\\\\Automation\\\\Selinium Mock.docx\"");
		//FileUpload.click(); //Gives org.openqa.selenium.InvalidArgumentException: 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",FileUpload);
		FileUpload.sendKeys("D:\\CodeMind\\Automation\\Selinium Mock.docx");
	}

}
