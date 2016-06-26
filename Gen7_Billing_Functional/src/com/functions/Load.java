package com.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.libs.variables;

public class Load extends variables {
	

	
  @BeforeTest
  public static WebDriver Browser(String URL, String Browser) {
	  
	  //Firefox Browser
	  
	  if (Browser.equalsIgnoreCase("Firefox"))
	  {
		driver = new FirefoxDriver();
		driver.get(URL);  
	  }
	  
	  
	return null;
  }
  
  
  
  
  //Chrome Browser
  
  
  //IE Browser
  
  
  //Phantom Browser
  
}
