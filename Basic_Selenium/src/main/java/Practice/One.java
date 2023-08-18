package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class One {

	public static void main(String[] args) {
	
		//Explain how you can login into any site if it’s showing any authentication popup for password and username?
		//In that user name and the password need to enter with url
		//Syntax-http://username:password@url
		//ex- http://creyate:tom@www.gmail.com
		
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
