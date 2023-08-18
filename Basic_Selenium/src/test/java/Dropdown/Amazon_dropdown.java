package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_dropdown {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.co.uk/");
        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='url']"));
        // Handling this drop down
        Select s = new Select(dropdown);
        s.selectByIndex(8);
        Thread.sleep(2000);
        s.selectByValue("search-alias=beauty");
        Thread.sleep(2000);
        s.selectByVisibleText("Car & Motorbike");
        Thread.sleep(2000);
        System.out.println(s.isMultiple());
        
        List<WebElement> values = s.getOptions();
        
        for(WebElement b:values) {
        	System.out.println(b.getText());
        }
        
	}

}
