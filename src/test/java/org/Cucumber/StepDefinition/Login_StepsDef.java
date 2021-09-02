package org.Cucumber.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Login_StepsDef {
	static WebDriver driver = null;
	@Given("Login to the application")
	public void login_to_the_application() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	    Thread.sleep(2000);
	      
	}

	@When("Enter User name and Password")
	public void enter_User_name_and_Password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	    
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("login-button")).click();
	   
	}

	@Then("Verify the login page")
	public void verify_the_login_page() {
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Swag Labs";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Scenario Passed");
	}


}
