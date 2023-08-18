package basic_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Program {

	public static void main(String[] args) throws Throwable {
		
		//managing drivers
		WebDriverManager.chromedriver().setup();
		//opening the empty browers
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.facebook.com/");
		//wait
		Thread.sleep(5000);
		//navigate to amazon
		driver.navigate().to("https://www.amazon.co.uk/");
		//wait
		Thread.sleep(5000);
		//navigate to back it should move to facebook
		driver.navigate().back();
		//wait
		Thread.sleep(5000);
		//navigate to forward it should move to amazon
		driver.navigate().forward();
		//wait
		Thread.sleep(5000);
		//refresh the page
		driver.navigate().refresh();
		//wait
		Thread.sleep(5000);
		//close window
		driver.close();
		
		

	}

}
