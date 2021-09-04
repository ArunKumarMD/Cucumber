package com.swaglabs.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.swaglabs.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions {
	
	
	
	@Before
	
	public void login_to_the_application() throws InterruptedException {
	   Commonactions c = new Commonactions();
	   c.login("https://www.saucedemo.com/");
		
	      
	}
	
		@After
		public void afterscenario(Scenario scenario){
			
			//driver.close();
			if(scenario.isFailed()){

				final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

				scenario.embed(screenshot, "image/png");
			}else{
				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");

			}
			
		

	}
}
