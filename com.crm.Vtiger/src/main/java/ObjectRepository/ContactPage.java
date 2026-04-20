package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement plusicon;
	
	@FindBy(name = "firstname")
	private WebElement ftxb;
	
	@FindBy(name = "lastname")
	private WebElement ltxb;
	
	@FindBy(name = "account_name")
	private WebElement organizationName;
	
	@FindBy(id = "mobile")
	private WebElement mobile;
	
	@FindBy(id ="homephone")
	private WebElement homePhone;
	

	
}
