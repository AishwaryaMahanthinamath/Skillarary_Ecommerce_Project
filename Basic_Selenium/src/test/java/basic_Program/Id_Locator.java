package basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Locator {

	public static void main(String[] args) throws Throwable {
		//manages the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting 
		WebDriver driver = new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.facebook.com/");
		//inspect usdername textfield
		driver.findElement(By.id("email")).sendKeys("sasi");
		//wait
		Thread.sleep(2000);
		//inspect password textfield
		driver.findElement(By.name("pass")).sendKeys("vnjmk.221");
		//wait
		Thread.sleep(2000);
		//inspect forgetten password link
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		//close window
        driver.close();
	}

}
