package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

	//Contructor
	public HomePage(WebDriver driver){
		
		super(driver);
		
	}
	
	
	//Locators
	
	//To click on MyAccount from HomePage
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	
	//To click on Register
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	//To click on Login from HomePage
	@FindBy(linkText = "Login")
	WebElement linkLogin;
	
	
	
	//Action Methods
	
	public void clickOnMyAccount() 
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister() 
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		linkLogin.click();
	}
	
}
