package com.vtech.pagesobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {

	WebDriver driver;

	@FindBy(xpath = "//*[@class=\"heading3\" and @behavior =\"alternate\"]")
	WebElement managralTxt;

	@FindBy(linkText = "New Customer")
	WebElement newCustomerLink;

	@FindBy(linkText = "Edit Customer")
	WebElement editCustomerLink;

	@FindBy(linkText = "Delete Customer")
	WebElement deleteCustomerLink;

	@FindBy(linkText = "New Account")
	WebElement newAccountLink;

	@FindBy(linkText = "Edit Account")
	WebElement editAccountLink;

	@FindBy(linkText = "Delete Account")
	WebElement deleteAccountLink;

	@FindBy(linkText = "Deposit")
	WebElement depositLink;

	@FindBy(linkText = "Withdrawal")
	WebElement withdrawalLink;

	@FindBy(linkText = "Fund Transfer")
	WebElement fundTransferLink;

	@FindBy(linkText = "Change Password")
	WebElement changePasswordLink;

	@FindBy(linkText = "Balance Enquiry")
	WebElement balanceEnquiryLink;

	@FindBy(linkText = "Mini Statement")
	WebElement miniStatementLink;

	@FindBy(linkText = "Customised Statement")
	WebElement customisedStatementLink;

	@FindBy(linkText = "Log out")
	WebElement logoutLink;

	public Homepage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String verifyManagerLogin() {
		return managralTxt.getText();

	}

	public String getManagerId() {
		return driver.findElement(By.xpath("//*[@align='center']/td")).getText();
	}
	
	public NewCustomerPage naviagateToNewCustomerPage() 
	{
		newCustomerLink.click();
	    return new NewCustomerPage(driver);
	}
	
	public NewAccountPage naviagateToNewAccountPage() 
	{
		newAccountLink.click();
		return new NewAccountPage(driver);
	}
	
	 public EditCustomerPage navigateToEditCustomerPage()
	 {
		 editCustomerLink.click();
		 return new EditCustomerPage(driver);
	 }
	 
	 public EditAccountPage navigateToEditAccountPage()
	 {
		 editAccountLink.click();		
		 return new EditAccountPage(driver);
	 }
	 
	 public DeleteAccountPage navigateToDeleteAccountPage()
	 {
		 deleteAccountLink.click();	
		 return new DeleteAccountPage(driver);
	 }
	 
	 public DeleteCustomerPage navigateToDeleteCustomerPage()
	 {
		 deleteCustomerLink.click();
		 return new DeleteCustomerPage(driver);
	 }
	 
	 public DepositPage navigateToDepositPage()
	 {
		depositLink.click();
		 return new DepositPage(driver);
	 }
	 
	 public WithdrawalPage navigateToWithdrawalPage()
	 {
		withdrawalLink.click();
		 return new WithdrawalPage(driver);
	 }
	 
	 public ChangePasswordPage navigateToChangePasswordPage()
	 {
		 changePasswordLink.click();
		 return new ChangePasswordPage(driver);
	 }
	 
	 public BalanceEnquiryPage navigateToBalanceEnquiryPage()
	 {
		 balanceEnquiryLink.click();
		 return new BalanceEnquiryPage(driver);
	 }
	 
	 public CustomisedStatementPage navigateToCustomisedStatementPage()
	 {
		 customisedStatementLink.click();
		 return new CustomisedStatementPage(driver);
	 }
	 
	 public FundTransferPage navigateToFundTransferPage()
	 {
		fundTransferLink.click();
		 return new FundTransferPage(driver);
	 }
	 
	 public MiniStatementPage navigateToMiniStatementPage()
	 {
		 miniStatementLink.click();
		 return new MiniStatementPage(driver);
	 }
	 
	 public void Logout()
	 {
		 if(logoutLink.isDisplayed()) {
			 logoutLink.click();
		 }
		 
		 
	 }
}
