package com.crm.Vtiger.genericLibrary;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	public void launchBrowserUtility(WebDriver driver) {
		driver = new ChromeDriver();
	}
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	public void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void navigateToApplication(WebDriver driver, String URL) {
		driver.get(URL);
	}
	
	public void mouseHover(WebDriver driver,WebElement address) {
		Actions a=new Actions(driver);
		a.moveToElement(address).perform();
	}
	
	public void handleDropDownByVisible(WebElement address,String text) {
		Select s = new Select(address);
		s.selectByVisibleText(text);
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
}
