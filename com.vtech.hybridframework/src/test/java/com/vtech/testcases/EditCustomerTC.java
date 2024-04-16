package com.vtech.testcases;

import org.testng.annotations.Test;

import com.vtech.pagesobject.Homepage;
import com.vtech.testbase.TestBase;

public class EditCustomerTC extends TestBase {

	@Test
	public void editCustomerPage()
	{
         lp.login(configFile.getUserName(), configFile.getPassword());
		
		Homepage hp = new Homepage(driver);
		hp.navigateToEditCustomerPage();
		ecp.CustomerId();
		
	}
}
