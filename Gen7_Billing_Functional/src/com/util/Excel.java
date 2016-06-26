package com.util;

import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Excel {

	static File fl = new File (com.libs.Test_Variables.TestSheet);
	
	
	
	
	//Read a Vlaue from the Excel Sheet
	@BeforeTest
	public static String Read()
	{
		try {
			XSSFWorkbook wb = new XSSFWorkbook (fl);
		} 
		
		catch (Exception e) {
			System.out.println("Error : In reading the Excel Sheet. File format should be .xslx. Exception: "+e);
			Assert.fail("Error in Reading Excel");
		} 
		
		
		
		
		
		return null;
		
	}
	
	
	
	//Write a Value to the Excel Sheet
	public String Write()
	{
		return null;
		
	}

}
