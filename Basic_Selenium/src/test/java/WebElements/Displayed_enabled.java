package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Displayed_enabled {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
         //isdisplayed
		if(login.isDisplayed()) {
			login.sendKeys("sasi");
			}
		else {
			System.out.println("Element is not displayed");
		}
		WebElement loginb = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		//isenabled
		if(loginb.isEnabled()) {
			loginb.click();
		}
		else {
			System.out.println("Element is enabled");
			
		}
	}
	

}
