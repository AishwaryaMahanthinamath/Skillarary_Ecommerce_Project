package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.co.uk/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();
		
		Thread.sleep(3000);
	
		driver.close();
	}

}
