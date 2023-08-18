package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload_popup {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.foundit.in/");
        driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\hirem\\Downloads\\Manual Testing_Sample Resume.docx");
        


	}

}
