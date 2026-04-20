package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
	private WebElement profileelement;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;

	@FindBy(linkText = "Calendar")
	private WebElement calenarlink;
	
	@FindBy(linkText = "Leads")
	private WebElement leadslink;
	
	@FindBy(xpath = "//a[text()='Organizations']/../../../../../../td[2]/table/tbody/tr/td[6]")
	private WebElement organizationslink;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactslink;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productslink;
	
	@FindBy(xpath =  "//a[text()='Documents']")
	private WebElement documentslink;
	
	@FindBy(xpath = "//a[text()='Email']")
	private WebElement emaillink;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement troubleticketslink;
	
	@FindBy(linkText = "Dashboard")
	private WebElement dashboardlink;
	
	@FindBy(linkText = "More")
	private WebElement morelink;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProfileelement() {
		return profileelement;
	}

	public WebElement getCalenarlink() {
		return calenarlink;
	}

	public WebElement getLeadslink() {
		return leadslink;
	}

	public WebElement getOrganizationslink() {
		return organizationslink;
	}

	public WebElement getContactslink() {
		return contactslink;
	}

	public WebElement getProductslink() {
		return productslink;
	}

	public WebElement getDocumentslink() {
		return documentslink;
	}

	public WebElement getEmaillink() {
		return emaillink;
	}

	public WebElement getTroubleticketslink() {
		return troubleticketslink;
	}

	public WebElement getDashboardlink() {
		return dashboardlink;
	}

	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	
	
}
