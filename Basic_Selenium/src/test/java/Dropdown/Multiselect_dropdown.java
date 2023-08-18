package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect_dropdown {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoapp.skillrary.com/");
        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='cars']"));
        
        Select s = new Select(dropdown);
        
        s.selectByIndex(3);
        Thread.sleep(3000);
        s.selectByValue("99");
        Thread.sleep(3000);
       // s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
        Thread.sleep(3000);
        s.deselectByIndex(3);
        Thread.sleep(3000);
       
      //  s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");
        Thread.sleep(3000);
        
        List<WebElement> ele = s.getAllSelectedOptions();
        for (WebElement ele1 : ele) {
        	System.out.println(ele1.getText());
        }
	}

}
