package AutoSuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_to {

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
        
        driver.findElement(By.xpath("//span[text()='Register'][1]")).click();
        
        //inspect the popup frame and on ctrl+f enter iframe
        
        //handling the frame through the index
        //driver.switchTo().frame(0);
        
        //handling the frame id
        driver.switchTo().frame("loginIframe");
        
        //handling the frame name
        //driver.switchTo().frame("iframeLogin");
        
        driver.findElement(By.xpath("//input[@class='col-xs-24']")).sendKeys("9876");
        driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
        driver.switchTo().defaultContent();
        
        Thread.sleep(2000);
        
        driver.close();
        
        

	}

}
