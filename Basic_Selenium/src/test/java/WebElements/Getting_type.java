package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_type {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
		login.sendKeys("sasi");
		//it wont print because it will print only inbulit one not manually entered
		System.out.println(login.getText());
		
		
		//fetch the coordinates
		Point coordinate = login.getLocation();
		System.out.println("x and y coordinates of email textfield are below");
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
        
        //fetching the dimensions
        Dimension size = login.getSize();
        System.out.println("width and height of email textfield are below");
        System.out.println(size.getHeight());
        System.out.println(size.getWidth());
	}

}
