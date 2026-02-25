package testCases;

//import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.InsideLoginPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Tc002_LoginTest extends BaseClass{
	@Test(groups= {"Regression", "Master"})
	void homepage() {
		try {
		HomePage hp= new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
	
	
		LoginPage lp= new LoginPage(driver);
		
		lp.setEmail( BaseClass.registeredEmail);
		lp.setPass( BaseClass.registeredPassword);
		lp.clickLogin();
	

/// Next Proccess

		
		InsideLoginPage ip= new  InsideLoginPage(driver);

		 boolean value= ip.validate();
		 Assert.assertTrue(value);
		 ip.clickDeskTop();
//		 Thread.sleep(5000);
//		 ip.getName();
		 ip.clickCart();
		 boolean  validateCart= ip.validateCart();
		 Assert.assertTrue(validateCart);
		 ip.selectClr();
		 ip.clickAddToCart();
//		boolean validateProduct= ip.validateProductAdded();
//		Assert.assertTrue(validateProduct);
//		ip.exitMsg();
		
		//Next process
		
		CartPage cart= new CartPage(driver);
		cart.clickCart();
		cart.clickGoToCart();

		
		cart.clickCheckOut();
		
		//Next process
		CheckOutPage checkOut= new CheckOutPage(driver);
		checkOut.enterFirstName(randomString());
		checkOut.enterLastName(randomString());
		checkOut.enterCompanyName(randomString());
		checkOut.enterAddress1(randomString());
		checkOut.enterAddress2(randomString());
		checkOut.enterCity(randomString());
		checkOut.enterPostCode(randomNumber());
		checkOut.selectRegion();
		checkOut.clickContinue();
		checkOut.clickDevelaryDetails();
		checkOut.clickDelevaryMethod();
		checkOut.clickTermandConditions();
		checkOut.clickPaymentMethod();
		checkOut.clickConfirmOrder();
		boolean validation= checkOut.checkorderConfirm();
		Assert.assertTrue(validation);
	
		
		
		}catch(Exception e) {
			 e.printStackTrace();
			    Assert.fail("Test failed due to exception: " + e.getMessage());
	
	
	}
}
}
