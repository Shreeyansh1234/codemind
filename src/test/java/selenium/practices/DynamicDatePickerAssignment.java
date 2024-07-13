package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDatePickerAssignment {

    public static void main(String[] args) {
        // Set up the path to the chromedriver executable if needed
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver (e.g., using Chrome WebDriver)
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL containing the date picker
        driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Dynamic date parameters
        String year = "2019";
        String month = "May";
        String day = "22";

        // Select the date dynamically
        selectDate(driver, year, month, day); 

      }

   
    public static void selectDate(WebDriver driver, String year, String month, String day) {
        // Locate the date picker input element and click to open the date picker
        WebElement datePickerInput = driver.findElement(By.id("datetimepicker2"));
        datePickerInput.click();

        // Locate the year input field, clear it, and set it to the desired year
        WebElement yearInput = driver.findElement(By.xpath("(//input[@class='numInput cur-year'])[2]"));
        yearInput.clear();
        yearInput.sendKeys(year);

        // Locate the month dropdown, create a Select object, and select the desired month
        WebElement monthDropdown = driver.findElement(By.xpath("(//select[@class='flatpickr-monthDropdown-months'])[2]"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText(month);

        // Locate and click on the desired day in the date picker
        WebElement dayElement = driver.findElement(By.xpath("(//div[@class='dayContainer']//span[@class='flatpickr-day' and text()='" + day + "'])[2]"));
        dayElement.click();
    }
}
