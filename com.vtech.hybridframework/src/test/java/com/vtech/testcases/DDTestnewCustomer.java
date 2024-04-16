package com.vtech.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtech.pagesobject.Homepage;
import com.vtech.testbase.TestBase;





public class DDTestnewCustomer extends TestBase{
	
	@DataProvider(name="NewCustomerData") 
	public String[][] newCustomerData()
	{
	String[][] data= excelDataProvider.getNewCustomerData("cstdatafeed");
		return data;
	}
	
	@Test(dataProvider="NewCustomerData")
	public void newCustomerTesting(String Username, String gen, String db, String Add, String City, String State,String pincode, String mob, String Email, String pass)
	{
		lp.login("mngr565005", "YzAdYvU");
		Homepage hp = new Homepage(driver);
		//cp=hp.naviagateToNewCustomerPage();
	
		//cp.newcstdatafeed(Username, gen,db, Add, City, State, pincode, mob, Email, pass);
	}
}
