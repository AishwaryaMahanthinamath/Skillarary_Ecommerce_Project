package AutoSuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over_action {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://snapdeal.com/");
        Thread.sleep(3000);
        WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
         
        Actions a = new Actions(driver);
        a.moveToElement(signIn).perform();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//span[text()='Register']")).click();
        Thread.sleep(3000);
        driver.close();
        }
 
}
