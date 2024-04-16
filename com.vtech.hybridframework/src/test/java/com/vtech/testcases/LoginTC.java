package com.vtech.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtech.pagesobject.LoginPage;
import com.vtech.testbase.TestBase;

public class LoginTC extends TestBase {

//	@Test(priority = 2)
//	public void verifyloginfunctionality() {
//		LoginPage lp = new LoginPage(driver);
//		lp.login("mngr565005", "YzAdYvU");
//
//		String expTitle = "Guru99 Bank Manager HomePage";
//		String actTitle = driver.getTitle();
//		Assert.assertEquals(actTitle, expTitle);
//	}

//	@Test(priority = 2)
//	public void verifyloginfunctionality() {
//	 LoginPage lp = new LoginPage(driver);
//	 lp.login(configFile.getUserName(), configFile.getPassword());

//		String expTitle = "Guru99 Bank Manager HomePage";
//	 String actTitle = driver.getTitle();
//	 Assert.assertEquals(actTitle, expTitle);

//		Assert.assertEquals(driver.getTitle(), propFile.searchkey("homepageTitle"));
//	}

	@Test(priority = 2)
	public void verifyloginfunctionality() {
		LoginPage lp = new LoginPage(driver);

		// String username = excelDataProvider.fetchStringCellValue("Login", 1, 0);
		// String password = excelDataProvider.fetchStringCellValue("Login", 1, 1);
		// String lptitle = excelDataProvider.fetchStringCellValue("Login", 1, 2);

		String username = excelDataProvider.fetchStringCellValue(0, 1, 0);
		String password = excelDataProvider.fetchStringCellValue(0, 1, 1);
		String lptitle = excelDataProvider.fetchStringCellValue(0, 1, 2);

		lp.login(username, password);
		
		Assert.assertEquals(driver.getTitle(), lptitle);
	}

	@Test(priority = 1)
	public void verifyLoginPageTitle() {
		// String expTitle = "Guru99 Bank Home Page";
		// String actTitle = driver.getTitle();
		// Assert.assertEquals(actTitle, expTitle);
		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), propFile.searchkey("loginPageTitle"));
	}
}
