package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_type {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
		login.sendKeys("sasi");
        Thread.sleep(1000);
        login.clear();
        
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        loginButton.submit();

	}

}
