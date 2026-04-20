package com.crm.Vtiger.genericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepository.Homepage;
import ObjectRepository.LoginVtiger;

public class BaseClass 
{ 
	 FileUtility f =  new FileUtility();
	 SeleniumUtility s = new SeleniumUtility();
	 public static WebDriver driver;
	 
    @BeforeSuite 
 	public void connectToDatabase() {
	 Reporter.log("Database connected",true);
 }
 
 @BeforeTest
 	public void browserLaunched() throws IOException {
	 driver = new ChromeDriver();
	
	 s.maximizeBrowser(driver);
	 s.implicitwait(driver);
	
	 String URL = f.readDataFromPropertyFile("url");
	 s.navigateToApplication(driver, URL);
	 
	 Reporter.log("Browser Launching...",true);
 }
 
 @BeforeMethod
 	public void loginToCMS() throws IOException {
	 LoginVtiger log = new LoginVtiger(driver);
	 String username = f.readDataFromPropertyFile("username");
	 String pass = f.readDataFromPropertyFile("password");
	
	 log.getUntbx().sendKeys(username);
	 log.getPstbx().sendKeys(pass);
	 log.getLogin().click();
	 Reporter.log("Login into Vtiger",true); 
 }
 @AfterMethod
 	public void logoutfromVtiger() {
	    Homepage hp=new Homepage(driver);
	    WebElement element = hp.getProfileelement();
		s.mouseHover(driver, element);
		hp.getSignoutlink().click();
		Reporter.log("logout successfully",true);
 }
  @AfterTest
    public void closeBrowser() {
 	s.closeBrowser(driver);
 	Reporter.log("Browser closed successfully",true);
 }
  @AfterSuite
  public void databaseDisconnect() {
  	Reporter.log("Database disconnected",true);
  }
  
  
}
