package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v137.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement plusicon;
	
	@FindBy(name = "accountname")
	private WebElement accountname;
	
	@FindBy(id="email1")
	private WebElement email;
	
	@FindBy(name="bill_street")
	private WebElement billAddress;
	
	@FindBy(name="ship_street")
	private WebElement shipaddress;
	
	@FindBy(id="bill_city")
	private WebElement billcity;
	
	@FindBy(id = "ship_city")
	private WebElement shipcity;
	
	public WebElement getShipcity() {
		return shipcity;
	}

	@FindBy(id = "bill_state")
	private WebElement billstate;
	
	@FindBy(id = "ship_state")
	private WebElement shipstate;
	
	@FindBy(id = "bill_country")
	private WebElement billcountry;
	
	@FindBy(id = "ship_country")
	private WebElement shipcountry;
	
	@FindBy(name = "description")
	private WebElement description;
	
	@FindBy(name = "button")
	private WebElement savebutton;
	
	@FindBy(name = "button")
	private WebElement cancelbtn;
	@FindBy(name = "industry")
	private WebElement dropdown;
	
	
	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getAccountname() {
		return accountname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillAddress() {
		return billAddress;
	}

	public WebElement getShipaddress() {
		return shipaddress;
	}

	public WebElement getBillcity() {
		return billcity;
	}

	public WebElement getBillstate() {
		return billstate;
	}

	public WebElement getShipstate() {
		return shipstate;
	}

	public WebElement getBillcountry() {
		return billcountry;
	}

	public WebElement getShipcountry() {
		return shipcountry;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlusicon() {
		return plusicon;
	}
	
	
	
}
