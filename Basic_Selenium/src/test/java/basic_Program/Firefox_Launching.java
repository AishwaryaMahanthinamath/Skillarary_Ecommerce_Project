package basic_Program;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox_Launching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//manage the firefox driver
		WebDriverManager.firefoxdriver().setup();
		
		//opening firefox browser
		FirefoxDriver driver = new FirefoxDriver();

	}

}
