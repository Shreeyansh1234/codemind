package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allInOne {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//###### Locator Stratergies #########
		
		driver.findElement(By.id("radio2")).click();
		//driver.findElement(By.name("q")).sendKeys("Codemind");
		
		//driver.findElement(By.className("gsc-input")).sendKeys("Codemind");-Not Working
		//driver.findElement(By.tagName("input"));
		
		//driver.findElement(By.linkText("http://www.Selenium143.blogspot.com")).click();
		//driver.findElement(By.partialLinkText("http://www.Selenium143")).click();
		//driver.findElement(By.xpath("//input[@id=\"radio2\"]")).click();
		//driver.findElement(By.cssSelector("#radio2")).click();
		
		//***********What is WelElement & It’s Method’s :->*********
		
		WebElement wb= driver.findElement(By.xpath("//h2[text()=\"Search This Blog\"]"));
		//wb.sendKeys("Codemind");
		String text=wb.getText();
		
		System.out.println(text);
		
		
		//Thread.sleep(500);
		
		
		//driver.close();
		

	}

}
