package com.crm.Vtiger;

import com.crm.Vtiger.genericLibrary.BaseClass;

import ObjectRepository.Homepage;

public class CreateContact extends BaseClass {
	public void creteContacts() {
		
	
	Homepage hp = new Homepage(driver);
	hp.getContactslink().click();
	
	}
}
