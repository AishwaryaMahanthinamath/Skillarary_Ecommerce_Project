package AutoSuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoapp.skillrary.com/");
        Thread.sleep(3000);
        //address of course
        WebElement course = driver.findElement(By.xpath("//a[@id='course']"));
        //creating an object for actions class
        Actions a = new Actions(driver);
        a.moveToElement(course).perform();
        //address for selenium training
        driver.findElement(By.xpath("//a[text()='Selenium Training'][1]")).click();
        WebElement button = driver.findElement(By.xpath("//button[@id='add']"));
        a.doubleClick(button).perform();
        Thread.sleep(3000);
        driver.close();
        
	}

}
