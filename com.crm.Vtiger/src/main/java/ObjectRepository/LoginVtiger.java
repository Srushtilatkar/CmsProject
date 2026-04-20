package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class for the login page 
public class LoginVtiger {
	//declaration
	@FindBy(name="user_name")
	private WebElement untbx;
	@FindBy(name="user_password")
	private WebElement pstbx;
	@FindBy(id="submitButton")
	private WebElement login;
	
	//initialization
	public LoginVtiger(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPstbx() {
		return pstbx;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
