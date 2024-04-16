package com.vtech.pagesobject;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtech.utility.Helper;

public class NewCustomerPage {

	WebDriver driver;

	public NewCustomerPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Object Repo on New Customer Page

	@FindBy(name = "name")
	WebElement customerName;

	@FindBy(name = "dob")
	WebElement DOB;

	@FindBy(xpath = "//input[@type=\"radio\"and @value=\"m\"]")
	WebElement genderMale;

	@FindBy(xpath = "//input[@type=\"radio\"and @value=\"f\"]")
	WebElement genderFemale;

	@FindBy(name = "addr")
	WebElement address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "pinno")
	WebElement Pin;

	@FindBy(name = "telephoneno")
	WebElement Mobno;

	@FindBy(name = "emailid")
	WebElement email;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "sub")
	WebElement submitBtn;

	@FindBy(name = "res")
	WebElement resetBtn;
	
	@FindBy(xpath="//*[@id=\"customer\"]")
	WebElement CustomerId;
	
	//@FindBy(xpath="//*[@id=\"customer\"]/tbody/tr[14]/td/a")
//	WebElement ContinueBtn;

	public Homepage newCustomerDatafeed(String cName, String gender, String Dob, String Address, String city,String state, String Pincode, String mob, String Emailid, String password) throws InterruptedException {

		customerName.sendKeys(cName);
		if (gender.equals("Male")) 
		{
			genderMale.click();
		} else {
			genderFemale.click();
		}
		DOB.sendKeys(Dob);
		address.sendKeys(Address);
		City.sendKeys(city);
		State.sendKeys(state);
		Pin.sendKeys(Pincode);
		Mobno.sendKeys(mob);
		email.sendKeys(Emailid);
		Password.sendKeys(password);

		Thread.sleep(5000);
		submitBtn.click();
		
		Helper.captureScreenshot(driver);
		
		
		 return new Homepage(driver);
		

}
	
	/* public void newcstdatafeed(String cname, String gend, String Db, String Addr, String cityname,String statename, String pincode, String mobno, String mail, String pass)
			 {
	 customerName.sendKeys(cname);
	 if(gend.equals("Male")) 
	 { 
		 genderMale.click(); }
	 else 
	 { genderFemale.click(); }
	    DOB.sendKeys(Db);
		address.sendKeys(Addr);
		City.sendKeys(cityname);
		State.sendKeys(statename);
		Pin.sendKeys(pincode);
		Mobno.sendKeys(mobno);
		email.sendKeys(mail);
		Password.sendKeys(pass);

		submitBtn.click();
		Helper.captureScreenshot(driver);
	 
	 }*/
	 

}
