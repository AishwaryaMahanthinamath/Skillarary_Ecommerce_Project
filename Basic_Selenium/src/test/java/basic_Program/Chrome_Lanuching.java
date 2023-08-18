package basic_Program;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Lanuching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//manage the chrome driver
	WebDriverManager.chromedriver().setup();
	
	   //opening chrome browser
    ChromeDriver driver = new ChromeDriver();
	}

}
