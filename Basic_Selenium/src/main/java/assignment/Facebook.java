package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
        WebElement page = driver.findElement(By.xpath("//a[@class='_8esh']"));
	     
        Point coordinate = page.getLocation();
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
        
        System.out.println(page.getAttribute("class"));
	
	    System.out.println(page.getTagName());
	}

}
