package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	
	//Constructor
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	//Locators
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")   //added in step6
	WebElement lnkLogout;
	
	//Action Method
	
	public boolean isMyAccountPageExist()
	{
		try {
			return (msgHeading.isDisplayed());
			
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
