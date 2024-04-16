package com.vtech.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.vtech.testbase.TestBase;
import com.vtech.utility.Helper;

public class HomePageTC extends TestBase {

	@Test(priority = 1)
	public void verifyUserLandedOnHomePage() {
		// LoginPage lp = new LoginPage(driver);
		// hp = lp.login(configFile.getUserName(), configFile.getPassword());

		String expmangText = "Welcome To Manager's Page of Guru99 Bank";

		Assert.assertEquals(hp.verifyManagerLogin(), expmangText);
	}

	@Test(priority = 2)
	public void validateManagerId() {
		// LoginPage lp = new LoginPage(driver);
		// hp = lp.login(configFile.getUserName(), configFile.getPassword());
		Assert.assertEquals(hp.getManagerId(), "Manger Id : mngr559680");

	}
	
	@Test(priority=3)
	public void verifyLogoutFunctionality()
	{
		hp.Logout();
		Helper.handleAlert(driver);
		
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
		
	}
}
