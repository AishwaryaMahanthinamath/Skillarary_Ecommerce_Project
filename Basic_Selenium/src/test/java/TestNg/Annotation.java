package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	  @AfterMethod
	     public void close() throws Throwable {
	    	 Thread.sleep(2000);
		  driver.close();
	}
     @Test
     public void login() throws Throwable {
    	 Thread.sleep(2000);
	 driver.findElement(By.id("email"));
	 driver.findElement(By.id("pass"));
     }
   
}
