package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectTag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement multiSelectDropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));

		Select select = new Select(multiSelectDropdown);

		select.selectByVisibleText("Audi");
		select.selectByIndex(1);
		select.selectByValue("Hyundaix");

	

		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		for (WebElement option : allSelectedOptions) {
			System.out.println(option.getText());
		}

		System.out.println("First selected option is = " + select.getFirstSelectedOption().getText());

		List<WebElement> allOption = select.getOptions();

		System.out.println("#################### All Options from dropdown ###############################");

		for (WebElement option : allOption) {
			System.out.println(option.getText());
		}

		System.out.println("Is multiselection allowed = " + select.isMultiple());
		select.deselectAll();
		select.selectByValue("Hyundaix");
		select.selectByIndex(0);
		select.selectByVisibleText("Audi");
		select.deselectByIndex(2);
		select.deselectByValue("audix");
		select.deselectByVisibleText("Volvo");


	}

}
