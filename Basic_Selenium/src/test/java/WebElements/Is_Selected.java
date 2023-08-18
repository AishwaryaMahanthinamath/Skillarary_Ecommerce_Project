package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Selected {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(4000);
        WebElement radiob = driver.findElement(By.linkText("Female"));
	     radiob.submit();
	     if (radiob.isSelected()) {
	    	 System.out.println("Pass");
	    	}
	     else {
	    	 System.out.println("fali");
	     }
	}

}
