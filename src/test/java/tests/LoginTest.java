package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.RegisterPage;
import utilities.Base;


public class LoginTest extends Base {

	RegisterPage obj;
	//WebElement cPassElem;

	@Test(priority=14)
	public void register() {

		obj=new RegisterPage(driver);
		obj.registerDetails();

	}

	@Test(priority=15)

	public void register1() {

		obj=new RegisterPage(driver);
		obj.registerDetails();

	}

	@Test(priority=1)
	public void registerFillFormFirstNameTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormFirstNameDetails();

	}

	@Test(priority=2)
	public void registerFillFormLastNameTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormLastNameDetails();

	}

	@Test(priority=3)
	public void registerFillFormPhoneTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormPhoneDetails();

	}

	@Test(priority=4)
	public void registerFillFormEmailTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormEmailDetails();

	}

	@Test(priority=5)
	public void registerFillFormAddressTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormAddressDetails();

	}

	@Test(priority=6)
	public void registerFillFormCityTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormCityDetails();

	}

	@Test(priority=7)
	public void registerFillFormStateTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormStateDetails();

	}

	@Test(priority=8)
	public void registerFillFormPostalCodeTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormPostalCodeDetails();

	}

	@Test(priority=9)
	public void registerFillFormCountryTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormCountryDetails();

	}

	@Test(priority=10)
	public void registerFillFormUserNameTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormUserNameDetails();
		
		String uname=obj.getUserName();
		Assert.assertEquals(uname, "user1");
		System.out.println("Username is correct");

	}

	@Test(priority=11)
	public void registerFillFormPasswordTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormPasswordDetails();

	}

	@Test(priority=12)
	public void registerFillFormCPasswordTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormCPasswordDetails();
		
//		cPassElem=obj.confirmPassword();
//		Assert.assertNotNull(cPassElem);
		
		String pass=obj.getPassword();
		String cPass=obj.getConfirmPassword();
		Assert.assertEquals(pass, cPass);
		System.out.println("Password and Confirm Password are matching");
		
		Boolean cPassText=obj.getConfirmPassText();
		Assert.assertTrue(cPassText);
		System.out.println("No such text is displayed");
		
	}

	@Test(priority=13)
	public void registerFormSubmitBtnTest() {

		obj=new RegisterPage(driver);
		obj.registerFillFormSubmitBtn();
		
		String actUrl=obj.registrationSuccessStatusCheck();
		Assert.assertEquals(actUrl, "https://demo.guru99.com/test/newtours/register_sucess.php");
		System.out.println("Successfully Registered");

	}

	
	@Test(priority=16)
	public void registerFormSubmitBtnTest1() {

		obj=new RegisterPage(driver);
		obj.registerFillFormSubmitBtn();
		
		String actUrl=obj.registrationSuccessStatusCheck();
		Assert.assertEquals(actUrl, "https://demo.guru99.com/test/newtours/register_sucess.php");
		System.out.println("Successfully Registered");

	}

	
	@Test(priority=17)
	public void registerFormSubmitBtnTest2() {

		obj=new RegisterPage(driver);
		obj.registerFillFormSubmitBtn();
		
		String actUrl=obj.registrationSuccessStatusCheck();
		Assert.assertEquals(actUrl, "https://demo.guru99.com/test/newtours/register_sucess.php");
		System.out.println("Successfully Registered");

	}



}
