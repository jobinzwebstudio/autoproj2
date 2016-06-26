package sandbox;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.functions.*;

import com.libs.variables;
import com.util.Excel;

public class Check_functions extends variables {
	
	@Test

	public void loadanewURL()
	{
		Load.Browser(URL, "FireFOX");	
		browserfactory.findelementby();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Google"), "Test Passed");
		
	}
	
	
	


	




	@Test
	public void readfromexcel()
	{
		Excel.Read();
		
	}
	
}
