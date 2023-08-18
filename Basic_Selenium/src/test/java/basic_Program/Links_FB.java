package basic_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links_FB {

	public static void main(String[] args) {
		//manages the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting 
		WebDriver driver = new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.facebook.com/");
         List<WebElement> links = driver.findElements(By.tagName("a"));
         for(WebElement allLinks:links) {
        	 System.out.println(allLinks.getText());
         }
	}

}
