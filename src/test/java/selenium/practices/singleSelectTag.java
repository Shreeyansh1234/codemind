package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleSelectTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement singleSelectDropdown = driver.findElement(By.cssSelector("select#drop1"));

		Select select = new Select(singleSelectDropdown);

			 /*	List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText()); 
			getAllSelectedOptions() is particularly useful for multi-select dropdowns. 
			For single-select dropdowns, getFirstSelectedOption() might be more appropriate.
			*/
		 
		System.out.println("***********");
		WebElement firstSelectedOption = select.getFirstSelectedOption();

		System.out.println("First selected option is = " + firstSelectedOption.getText());

		List<WebElement> allOption = select.getOptions();

		System.out.println("####################  All Options from dropdown  ###############################");

		for (WebElement option : allOption) {
			System.out.println(option.getText());
		}

		System.out.println("#####################is allow multiple selection################################");

		System.out.println("Is allow multi selection = " + select.isMultiple());

		select.selectByIndex(3);

		Thread.sleep(3000);

		select.selectByValue("mno");

		Thread.sleep(3000);
		select.selectByVisibleText("doc 1");

	}

}
