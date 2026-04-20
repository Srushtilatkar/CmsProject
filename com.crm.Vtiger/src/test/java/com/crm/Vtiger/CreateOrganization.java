package com.crm.Vtiger;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Vtiger.genericLibrary.BaseClass;
import com.crm.Vtiger.genericLibrary.FileUtility;
import com.crm.Vtiger.genericLibrary.ListenerImplimentation;
import com.crm.Vtiger.genericLibrary.SeleniumUtility;

import ObjectRepository.Homepage;
import ObjectRepository.OrganisationPage;

public class CreateOrganization extends BaseClass {
	
	@Test
	public void create() throws EncryptedDocumentException, IOException {
		Homepage hp = new Homepage(driver);
		hp.getOrganizationslink().click();
		
		OrganisationPage op = new OrganisationPage(driver);
		op.getPlusicon().click();
		
		FileUtility f = new FileUtility();
		String name = f.readDataFromExcel("Organization",1, 1);
		op.getAccountname().sendKeys(name);
		String email = f.readDataFromExcel("Organization", 1, 2);
		op.getEmail().sendKeys(email);
		WebElement address = op.getDropdown();
		SeleniumUtility s = new SeleniumUtility();
		s.handleDropDownByVisible(address, "Engineering");
		String billaddress = f.readDataFromExcel("Organization", 1, 3);
		op.getBillAddress().sendKeys(billaddress);
		String shipaddress = f.readDataFromExcel("Organization", 1, 4);
		op.getShipaddress().sendKeys(shipaddress);
		String billcity = f.readDataFromExcel("Organization", 1, 5);
		op.getBillcity().sendKeys(billcity);
	    String shipcity = f.readDataFromExcel("Organization", 1, 8);
		op.getShipcity().sendKeys(shipcity);
		String billstate = f.readDataFromExcel("Organization", 1, 7);
		op.getBillstate().sendKeys(billstate);
		String shipstate = f.readDataFromExcel("Organization", 1, 9);
		op.getShipstate().sendKeys(shipstate);
		String billcountry = f.readDataFromExcel("Organization", 1, 6);
		op.getBillcountry().sendKeys(billcountry);
	    String shipcountry = f.readDataFromExcel("Organization", 1, 10);
	    op.getShipcountry().sendKeys(shipcountry);
	    op.getSavebutton().click();
	 
		
		
		
		
		
		
		
	}
}
