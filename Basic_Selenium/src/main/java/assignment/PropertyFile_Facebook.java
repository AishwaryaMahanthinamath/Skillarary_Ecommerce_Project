package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile_Facebook {

	public static void main(String[] args) throws Throwable {
		
		//create an object for properties class
		Properties p = new Properties();
		//create an object for physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		//loading fis
		p.load(fis);
		String Url = p.getProperty("url");
		Thread.sleep(2000);
	    
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(p.getProperty("username"));
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(p.getProperty("password"));
		
      
	}

}
