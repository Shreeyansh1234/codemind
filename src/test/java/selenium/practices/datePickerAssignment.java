package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datePickerAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");

		driver.manage().window().maximize();
		WebElement wb=driver.findElement(By.xpath("//input[@id=\"datetimepicker2\"]"));
		wb.click();
		
		WebElement yearwb=driver.findElement(By.xpath("(//input[@class=\"numInput cur-year\"])[2]"));
		yearwb.clear();
		yearwb.sendKeys("2019");
		
		WebElement monthwb=driver.findElement(By.xpath("(//select[@class=\"flatpickr-monthDropdown-months\"])[2]"));
		Select dropdown = new Select(monthwb);
		dropdown.selectByVisibleText("July");
		 
		driver.findElement(By.xpath("(//div[@class='dayContainer']//span[@class='flatpickr-day' "
				+ "and text()=\"1\"])[2]")).click();
		
	}

}
