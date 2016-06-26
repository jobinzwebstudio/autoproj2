package com.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Load {
	
	static WebDriver driver;
	
  @BeforeTest
  public static WebDriver Browser(String URL, String Browser) {
	  
	  //Firefox Browser
	  
	  if (Browser.equalsIgnoreCase("Firefox"))
	  {
		driver = new FirefoxDriver();
		driver.get(URL);  
	  }
	  
	  
	return driver;
  }
  
  
  
  
  //Chrome Browser
  
  
  //IE Browser
  
  
  //Phantom Browser
  
}
