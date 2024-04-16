package com.vtech.pagesobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerPage {

	WebDriver driver;
	public EditCustomerPage(WebDriver driver) {
		
		this.driver=driver;
	}

	@FindBy(xpath="//input[@type=\"text\" ]")
	WebElement Customerid;
	
	@FindBy(xpath="//input[@type=\"submit\" ]")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//input[@type=\"reset\" ]")
	WebElement ResetBtn;
	
	public void CustomerId()
	{
		
		Customerid.sendKeys();
		SubmitBtn.click();
	}
	
}
