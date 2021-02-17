package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RaghavDefinations {

	WebDriver driver;



	@Given("^browser is open$")
	public void browser_is_open() {
		System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\geckodriver.exe");
		driver =new FirefoxDriver();
		
	}

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		driver.get("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username , String password) throws InterruptedException  {

		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
	    
		driver.findElement(By.id("login")).click();
	}
	
	
	@Then("^user is navigated to homepage$")
	public void user_is_navigated_to_homepage() {
 
		String curl =driver.getCurrentUrl();
		System.out.println("the current url is "+curl);
		driver.close();
	}





}
