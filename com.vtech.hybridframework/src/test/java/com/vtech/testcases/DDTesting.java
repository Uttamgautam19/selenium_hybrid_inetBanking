package com.vtech.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtech.pagesobject.Homepage;
import com.vtech.testbase.TestBase;
import com.vtech.utility.Helper;

public class DDTesting extends TestBase {

	@DataProvider(name="LoginTestData") 
	public String[][] loginTestData()
	{
	String[][] data= excelDataProvider.getExcelTestData("ddTesting");
		return data;
	}
	
	@Test(dataProvider="LoginTestData")
	public void loginDDTest(String username,String password,String pageTitle)
	{
		Homepage hp=lp.login(username, password);
		Assert.assertEquals(driver.getTitle(),pageTitle);
		try {
			hp.Logout();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Helper.handleAlert(driver);
		
		
	}
	
}
