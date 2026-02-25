package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends BasePage {
	 public CheckOutPage(WebDriver driver){
		super(driver);
	}
	@FindBy(xpath="//input[@id='input-payment-firstname']")
	WebElement txt_FirstName;
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	WebElement txt_LastName;             
	@FindBy(xpath="//input[@id='input-payment-company']")
	WebElement txt_CompanyName;
	
	@FindBy(xpath="//div[@class='col-sm-10']//input[@id='input-payment-address-1']")
	WebElement txt_Address1;                                                                  
	
	
	
	
	//input[@id='input-payment-postcode']
	//select[@id='input-payment-country']
	//select[@id='input-payment-zone']
	//input[@id='button-payment-address']
	//div[@id='collapse-payment-address']//div[@class='panel-body']
	//div[@id='collapse-payment-address']//script[1]
	//button[@class='btn-close']
	@FindBy(xpath="//div[@class='col-sm-10']//input[@id='input-payment-address-2']")
	WebElement txt_Address2;

	@FindBy(xpath="//input[@id='input-payment-city']")
	WebElement txt_City;
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	WebElement txt_PostCode;
	@FindBy(xpath="//select[@id='input-payment-country']")
	WebElement selectBtn_Contry;

	@FindBy(xpath="//select[@id='input-payment-zone']")
	WebElement selectBtn_Region;

	@FindBy(xpath="//input[@id='button-payment-address']")
	WebElement btn_Continue;
	
	
	
	//input[@id='button-shipping-address']
	@FindBy(xpath="//input[@id='button-shipping-address']")
	WebElement btn_DevelaryDetails;
	
	@FindBy(xpath="//input[@id='button-shipping-method']") //button[@id='button-shipping-method']
	WebElement btn_DelevaryMethod;
	@FindBy(xpath="//input[@name='agree']")
	WebElement btn_TermsandConditions;
	@FindBy(xpath="//input[@id='button-payment-method']")
	WebElement btn_PaymentMethod;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	WebElement confirmOrder;
	@FindBy(xpath="//h1[normalize-space()='Your order has been placed!']")
	WebElement orderConfirm_Msg;
	

	public void enterFirstName(String name) {
		wait.until(ExpectedConditions.visibilityOf(txt_FirstName)).clear();
		txt_FirstName.sendKeys(name);
	}
	public void enterLastName(String name) {
		wait.until(ExpectedConditions.visibilityOf(txt_LastName)).clear();
		txt_LastName.sendKeys(name);
	}
	public void  enterCompanyName(String name) {
		wait.until(ExpectedConditions.visibilityOf(txt_CompanyName)).clear();
		txt_CompanyName.sendKeys(name);

	}
	public void enterAddress1(String name) {
		wait.until(ExpectedConditions.visibilityOf(txt_Address1)).clear();
		txt_Address1.sendKeys(name);	
	}
	public void enterAddress2(String name) {
		wait.until(ExpectedConditions.visibilityOf(txt_Address2)).clear();
		txt_Address2.sendKeys(name);
		
	}
	public void  enterPostCode(String code) {
		wait.until(ExpectedConditions.visibilityOf(txt_PostCode)).clear();
		txt_PostCode.sendKeys(code);	
	}
	
	public void enterCity(String name) {
		wait.until(ExpectedConditions.visibilityOf(txt_City)).clear();
		txt_City.sendKeys(name);
	}
	public void selectContry() {
		wait.until(ExpectedConditions.elementToBeClickable(selectBtn_Contry));
		new Select(selectBtn_Contry).selectByIndex(3);
	}
	public void selectRegion() {
		wait.until(ExpectedConditions.elementToBeClickable(selectBtn_Region));
		new Select(selectBtn_Region).selectByIndex(3);
	}
	public void clickContinue() {
		js.executeScript("arguments[0].scrollIntoView({block:'center'});",btn_Continue);
		wait.until(ExpectedConditions.elementToBeClickable(btn_Continue)).click();
		
	}
	public void clickDevelaryDetails() {
		
		js.executeScript("arguments[0].scrollIntoView({block:'center'});",btn_DevelaryDetails);
		wait.until(ExpectedConditions.elementToBeClickable(btn_DevelaryDetails)).click();
	}

	public void clickDelevaryMethod() {
		js.executeScript("arguments[0].scrollIntoView({block:'center'});",btn_DelevaryMethod);
		wait.until(ExpectedConditions.elementToBeClickable(btn_DelevaryMethod)).click();
	}
	public void clickTermandConditions() {
		if(!btn_TermsandConditions.isSelected()){
			wait.until(ExpectedConditions.elementToBeClickable(btn_TermsandConditions));
			btn_TermsandConditions.click();
		}
	}
	public void clickPaymentMethod() {
		js.executeScript("arguments[0].scrollIntoView({block:'center'});",btn_PaymentMethod);
		wait.until(ExpectedConditions.elementToBeClickable(btn_PaymentMethod)).click();
	}
	public void clickConfirmOrder() {
		js.executeScript("arguments[0].scrollIntoView({block:'center'});",confirmOrder);
		wait.until(ExpectedConditions.elementToBeClickable(confirmOrder)).click();	
	}
	public boolean checkorderConfirm() {
		 return wait.until(ExpectedConditions.visibilityOf(orderConfirm_Msg)).isDisplayed();
	}
	
	//==============================================================================

	
	
	


}
