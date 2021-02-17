package Pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	WebDriver driver;

	By txt_usernmae =By.id("name");
	By txt_password =By.id("password");
	By btn_login =By.id("login");


	public void enterusername(String username) {


		driver.findElement(txt_usernmae).sendKeys(username);	

	}

	public void enterpassword(String password) {

		driver.findElement(txt_password).sendKeys(password);


	}

	public void clicklogin() {

		driver.findElement(btn_login).click();

	}

}
