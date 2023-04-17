package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage {

	public WebDriver driver;


	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement elemReg;

	@FindBy(name="firstName")
	WebElement fname;

	@FindBy(name="lastName")
	WebElement lname;

	@FindBy(name="phone")
	WebElement elemPhone;

	@FindBy(id="userName")
	WebElement uname;

	@FindBy(xpath="//input[@name='address1']")
	WebElement elemAddress;

	@FindBy(xpath="//input[@name='city']")
	WebElement elemCity;

	@FindBy(xpath="//input[@name='state']")
	WebElement elemState;

	@FindBy(xpath="//input[@name='postalCode']")
	WebElement elemPostCode;

	@FindBy(xpath="//select[@name='country']")
	WebElement elemCountry;

	@FindBy(id="email")
	WebElement elemEmail;

	@FindBy(xpath="//input[@name='password']")
	WebElement elemPassword;

	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement elemCPassword;

	@FindBy(xpath="//span[text()='PAssword and con.password does not match']")
	WebElement confirmPassElem;

	@FindBy(xpath="//input[@name='submit']")
	WebElement submitBtn;



	public void registerDetails() {

		elemReg.click();
	}


	public void registerFillFormFirstNameDetails() {
		fname.sendKeys("Sangeetha");

	}

	public void registerFillFormLastNameDetails() {
		lname.sendKeys("Varghese");

	}

	public void registerFillFormPhoneDetails() {
		elemPhone.sendKeys("5778899");

	}

	public void registerFillFormEmailDetails() {
		uname.sendKeys("sav");

	}

	public void registerFillFormAddressDetails() {
		elemAddress.sendKeys("Ushus");

	}

	public void registerFillFormCityDetails() {
		elemCity.sendKeys("Chengannur");

	}

	public void registerFillFormStateDetails() {
		elemState.sendKeys("Kerala");

	}

	public void registerFillFormPostalCodeDetails() {
		elemPostCode.sendKeys("689521");

	}

	public void registerFillFormCountryDetails() {
		Select elemCountryDropDown=new Select(elemCountry);
		elemCountryDropDown.selectByVisibleText("BAKER ISLAND");

	}

	public void registerFillFormUserNameDetails() {
		elemEmail.sendKeys("user1");

	}

	public String getUserName()
	{
		String uname=elemEmail.getAttribute("value");
		return uname;
	}

	public void registerFillFormPasswordDetails() {
		elemPassword.sendKeys("user12");

	}

	public void registerFillFormCPasswordDetails() {
		elemCPassword.sendKeys("user12");

	}

	public void registerFillFormSubmitBtn() {
		submitBtn.click();

	}

	//	public WebElement confirmPassword()
	//	{
	//		return confirmPassElem;
	//	}

	public String registrationSuccessStatusCheck() {

		String actUrl=driver.getCurrentUrl();
		return actUrl;

	}

	public String getPassword() {

		String pass=elemPassword.getAttribute("value");
		return pass;

	}

	public String getConfirmPassword() {

		String cPass=elemCPassword.getAttribute("value");
		return cPass;

	}
	
	public Boolean getConfirmPassText()
	{
		Boolean cPassText=confirmPassElem.isDisplayed();
		return cPassText;
	}

	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}











}
