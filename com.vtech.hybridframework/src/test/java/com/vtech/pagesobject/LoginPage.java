package com.vtech.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtech.utility.Helper;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement username_txt;
	
	@FindBy(name="password")
	WebElement password_txt;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public Homepage login(String username,String password)
	{
		username_txt.clear();
		username_txt.sendKeys(username);
		
		password_txt.clear();
		password_txt.sendKeys(password);
		//Helper.captureScreenshot(driver);
        loginBtn.click();
    //    Helper.captureScreenshot(driver);
   //     Helper.handleAlert(driver);
        
        return new Homepage(driver);
	}
	
}
