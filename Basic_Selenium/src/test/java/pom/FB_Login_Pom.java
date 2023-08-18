package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Login_Pom {
	
		//declaration
		//address of email textfiled
		@FindBy(xpath="//input[@id='email']")
		private WebElement emailTf;
		
		//declaration
		//address of password textfiled
		@FindBy(xpath="//input[@type='password']")
		private WebElement passwordTf;
		
		//declaration
		//address of login button
		@FindBy(xpath="//button[@id='u_0_5_3b']")
		private WebElement LoginButton;
		
		//Initialization
		public FB_Login_Pom(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		 //getter and setter
		public WebElement getEmailTf() {
			return emailTf;
		}

		public void setEmailTf(WebElement emailTf) {
			this.emailTf = emailTf;
		}

		public WebElement getPasswordTf() {
			return passwordTf;
		}

		public void setPasswordTf(WebElement passwordTf) {
			this.passwordTf = passwordTf;
		}

		public WebElement getLoginButton() {
			return LoginButton;
		}

		public void setLoginButton(WebElement loginButton) {
			LoginButton = loginButton;
		}
        
		//utilization
		public void emailTextField(String data) {
			emailTf.sendKeys(data);
		}
	    public void passwordTextField(String data) {
	    	passwordTf.sendKeys(data);
	    }
	    public void LoginBButton(String data) {
	    	LoginButton.click();
	    
	    }
	    
	    
		}



