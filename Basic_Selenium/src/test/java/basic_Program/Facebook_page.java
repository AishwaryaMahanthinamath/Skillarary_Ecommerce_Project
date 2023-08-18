package basic_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_page {

	public static void main(String[] args) throws Throwable {
		
		//Managing drivers
		WebDriverManager.chromedriver().setup();
		//Opening the empty browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//entring url
		driver.get("https://www.facebook.com/");
		//printing title
		System.out.println(driver.getTitle());
		//printing current url
		System.out.println(driver.getCurrentUrl());
		//wait
		Thread.sleep(2000);
		//closing window
        driver.close();
	}

}
