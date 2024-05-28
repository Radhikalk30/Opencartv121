package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	

	@Test(groups={"Regression", "Master"})
	public void verify_account_registration()
	{
		logger.info("**Strating TC001_AccountRegistrationTest**");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount();
		logger.info("Clicked on MyAccount Link");
		hp.clickRegister();
		logger.info("Clicked on Register Link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		logger.info("Providing Customer Details");
		regpage.setFirstname(randomeString().toUpperCase());
		regpage.setLastname(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		logger.info("Clicked on Privacy Policy checkbox");
		regpage.clickContinue();
		logger.info("Clicked on Continue Button");
		
		logger.info("Validating expected message");
		
		String confmsg=regpage.getConfirmationMsg();
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test Failed");
			logger.debug("Debug Logs...");
			Assert.assertTrue(false);
		}
		
		}catch(Exception e)
		{
			
			Assert.fail();
		}
		logger.info("**Finished TC001_AccountRegistrationTest**");
		
	}
}
