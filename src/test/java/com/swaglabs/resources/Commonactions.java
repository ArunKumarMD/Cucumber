package com.swaglabs.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;	
	
	public void login(String url) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get(url);
		    Thread.sleep(2000);
	}
	
	public void insertText(WebElement element, String value) {
	
		element.sendKeys(value);

	}
	
	public void click(WebElement element) {

		element.click();

	}
	

}
