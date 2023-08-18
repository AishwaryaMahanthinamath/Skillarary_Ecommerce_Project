package basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector {

	public static void main(String[] args) {
		//manages the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting 
		WebDriver driver = new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.facebook.com/");
		//fetching address of email text field
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sasi");
		//fetching address of password text field
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sasi");
		
	}

}
