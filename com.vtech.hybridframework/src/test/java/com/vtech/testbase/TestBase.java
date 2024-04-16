package com.vtech.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.vtech.pagesobject.EditCustomerPage;
import com.vtech.pagesobject.Homepage;
import com.vtech.pagesobject.LoginPage;
import com.vtech.pagesobject.NewCustomerPage;
import com.vtech.utility.ConfigDataProvider;
import com.vtech.utility.ExcelDataProvider;

public class TestBase {
	public static WebDriver driver;
    public static ConfigDataProvider configFile;
    public static ConfigDataProvider propFile;
    public static LoginPage lp;
    public static Homepage hp;
    public static NewCustomerPage cp;
    public static EditCustomerPage ecp;
    public static  ExcelDataProvider excelDataProvider;
    
    public static String lptitle;
	@BeforeSuite
	public void init() {
		configFile=new ConfigDataProvider("config");
        propFile= new ConfigDataProvider("prop");
        excelDataProvider=new ExcelDataProvider("InetBankingTestData");
	}
	@BeforeClass
	public void initWebObject()  
	{
		lp= new LoginPage(driver);
		//hp = lp.login(configFile.getUserName(), configFile.getPassword());
		

	}

	@BeforeTest
	@Parameters({ "brName"})
	public void setup(@Optional("chrome")String browser) {
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		} 
		else if (browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Browser doesn't matched with expected Browser launch");
		}
		driver.manage().window().maximize();
		driver.get(configFile.getAppURL());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
