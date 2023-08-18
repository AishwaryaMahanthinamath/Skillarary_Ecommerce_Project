package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class property_Browser {

	public static void main(String[] args) throws Throwable {
		
		//create an object for properties class
				Properties p = new Properties();
				//create an object for physical file
				FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
				//loading fis
				p.load(fis);
				String Url = p.getProperty("url");
				
				String browser = p.getProperty("browser");
				WebDriver driver;
				if(browser.equals("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					} else {
						WebDriverManager.firefoxdriver().setup();
						driver = new FirefoxDriver();
					}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(Url);

	}

}
