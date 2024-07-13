package selenium.practices;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethod19 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement searchThisBlog =driver.findElement(By.xpath("//input[@name=\"q\" and @size=\"10\"]"));
		searchThisBlog.sendKeys("Welcome to Codemind");
		searchThisBlog.clear();
		System.out.println(searchThisBlog.getAccessibleName());
		System.out.println(searchThisBlog.getAriaRole());
		System.out.println(searchThisBlog.getAttribute("title"));
		System.out.println("******");
		searchThisBlog.sendKeys("Welcome to Codemind");
		System.out.println(searchThisBlog.getAttribute("value"));

		Point p = searchThisBlog.getLocation();
		System.out.println("X value of Location is: " + p.getX());
		System.out.println("Y value of Location is: " + p.getY());
		
//		File file=searchThisBlog.getScreenshotAs(OutputType.FILE);
//		File file_1=new File("src/test/resources/screenShot/textBox.png");
//		FileUtils.copyFile(file, file_1);
		
		Dimension d= searchThisBlog.getSize();
		System.out.println("Height of TextBox is: " + d.getHeight());
		System.out.println("Width of TextBox is: " + d.getWidth());

		System.out.println("TagName of TextBox is: "+searchThisBlog.getTagName());
		System.out.println("*********");
		
		//WebElement Text=driver.findElement(By.xpath("//div[@id=\"delayedText\"]"));
		WebElement Text=driver.findElement(By.cssSelector("div#delayedText"));
		System.out.println("Is Deleyed Text Displayed: " +Text.isDisplayed());
		
		System.out.println("Is Button 1 is Enabled: " + driver.findElement(By.cssSelector("#but1")).isEnabled());
		System.out.println("Is Button 2 is Enabled: " + driver.findElement(By.cssSelector("#but2")).isEnabled());
		
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@id='radio1']"));

		WebElement orageCheckBox = driver.findElement(By.xpath("//input[@id='checkbox1']"));

		System.out.println("Is Redio Male Button selected: " + maleRadioBtn.isSelected());//Applicable only for Radio Button n checkBox

		System.out.println("Is Orange Check Box selected: " + orageCheckBox.isSelected());

		maleRadioBtn.click();

		System.out.println("Is Redio Male Button selected After Click: " + maleRadioBtn.isSelected());

		WebElement greenDropdown = driver.findElement(By.xpath("//button[text()='Dropdown']"));

		System.out.println("Background Colore for DropDown Button: "+ greenDropdown.getCssValue("background-color"));

	}

}
