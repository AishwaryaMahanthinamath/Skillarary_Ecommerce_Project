package basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locators {

	public static void main(String[] args) throws Throwable {
		//manages the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting 
		WebDriver driver = new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.facebook.com/");
		//fetching address of email text field
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sasi");
		//fetching password text field
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("sasi");
		//click on login button
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).submit();
		//close 
		driver.findElement(By.xpath("//i[contains(@class,'_9ai6 img sp_vxiiSmFDFzJ sx_082a2e')]")).click();
		//wait
		Thread.sleep(3000);
		//click on forgotten password
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		//click on cancel button
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
	}

}
