package basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Page {

	public static void main(String[] args) {
		//manages the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting 
		WebDriver driver = new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.amazon.co.uk/");
		//Search tab
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		

	}

}
