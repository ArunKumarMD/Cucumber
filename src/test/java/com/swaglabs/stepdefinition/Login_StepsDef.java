package com.swaglabs.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Login_StepsDef {

	@When("Enter User name and Password")
	public void enter_User_name_and_Password() {
		Hooks.driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Hooks.driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		Hooks.driver.findElement(By.id("login-button")).click();

	}

	@Then("Verify the login page")
	public void verify_the_login_page() {

		String ActualTitle = Hooks.driver.getTitle();
		String ExpectedTitle = "Swag Labs";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Scenario Passed");
	}

	@When("Enter {int}D User name and Password")
	public void enter_D_User_name_and_Password(Integer int1, DataTable datas) {
		List<String> l1 = datas.asList(String.class);
		Hooks.driver.findElement(By.id("user-name")).sendKeys(l1.get(0));
		Hooks.driver.findElement(By.id("password")).sendKeys(l1.get(1));

	}
	
	@When("Enter {int}D User name and Password tables")
	public void enter_D_User_name_and_Password_tables(Integer int1, DataTable dataTable) {
		Map<String, String> m1 = dataTable.asMap(String.class, String.class);
		Hooks.driver.findElement(By.id("user-name")).sendKeys(m1.get("Username"));
		Hooks.driver.findElement(By.id("password")).sendKeys(m1.get("Password"));
	}
	

}
