package selenium.practices;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table//thead/tr//th"));

		for (WebElement header : tableHeaders) {
			System.out.print(header.getText() + "\t");
		}
		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		List<WebElement> lastNamesColumnsData = driver.findElements(By.xpath("//table//tbody//tr//td[2]"));
		for (WebElement lastName : lastNamesColumnsData) {
			System.out.println(lastName.getText());
		}

		System.out.println("############################################################################");
		List<WebElement> rowData = driver
		.findElements(By.xpath("//table//tbody//tr[3]")); ////table//tbody//tr/td[text()='kierra@example.com']/..//td"
		for (WebElement lastName : rowData) {
			System.out.println(lastName.getText());
		}

		System.out.println("*********############################################################################");
		List<WebElement> tableData = driver.findElements(By.xpath("//table//tbody//tr//td"));
		for (WebElement data : tableData) {
			System.out.println(data.getText() + "\t");
		}

		driver.findElement(
				By.xpath("//table//tbody//tr/td[text()='kierra@example.com']/..//td/a[not(@title='delete')]")).click();

		List<WebElement> departments = driver.findElements(By.xpath("//table//tbody//tr//td[6]"));

		LinkedHashSet<String> dept = new LinkedHashSet<String>();

		for (WebElement department : departments) {

			if (!(department.getText().isEmpty()) && !(department.getText().isEmpty())) {
				dept.add(department.getText());
			}
		}

		//System.out.println(deptartments.getText());

		System.out.println("Number of departments = " + dept.size());


	}

}
