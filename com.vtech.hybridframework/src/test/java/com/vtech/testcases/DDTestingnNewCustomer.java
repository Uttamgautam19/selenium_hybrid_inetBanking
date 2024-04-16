package com.vtech.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtech.pagesobject.Homepage;
import com.vtech.testbase.TestBase;
import com.vtech.utility.Helper;

public class DDTestingnNewCustomer extends TestBase {

	@DataProvider(name = "NewCustomerData")
	public String[][] newCustomerData() {
		String[][] data = excelDataProvider.getNewCustomerData("newCustomer");
		return data;
	}

	@Test(dataProvider = "NewCustomerData")
	public void newCustomerTesting(String Username, String gen, String db, String Add, String City, String State,
			String pincode, String mob, String Email, String pass) throws InterruptedException {
		lp.login(configFile.getUserName(), configFile.getPassword());

		Homepage hp = new Homepage(driver);
		cp = hp.naviagateToNewCustomerPage();

		cp.newCustomerDatafeed(Username, gen, db, Add, City, State, pincode, mob, Email, pass);

		if (driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).isDisplayed()) {

			System.out.println(driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText());
		}
	}
}
