package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathEx {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/2013/05/page-one.html");//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Relative XPath
		driver.findElement(By.xpath("//*[@id=\"radio2\"]")).click();
		//Absolute XPath
		//Needs to Revise driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[8]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[input(@id=\"radio2\"]")).click();
		//input[contains(@class, 'login')]

	}

}
