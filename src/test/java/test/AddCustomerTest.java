package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomer;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	@Test
	@Parameters({ "username", "password", "FullName", "Company", "Email", "Phone", "Address", "City", "State", "Zip",
			"Group" })
	public void ValidUserShouldBeAbleToLoginPage(String username, String password, String FullName, String company,
			String Email, String phone, String address, String city, String state, String zipcode, String group) {
		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.EnterUserName(username);
		login.EnterPassword(password);
		login.ClickLoginButton();

		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.VerifyDashBoardPage();

		AddCustomer customer = PageFactory.initElements(driver, AddCustomer.class);
		customer.ClickCustomers();
		customer.ClickAddCustomer();
		customer.EnterFullName(FullName);
		customer.CompanyDropDown(company);
		customer.EnterEmail(Email);
		customer.EnterPhone(phone);
		customer.EnterAddress(address);
		customer.EnterCity(city);
		customer.EnterState(state);
		customer.EnterZipCode(zipcode);
		customer.ClickSaveButtonOnAddCustomerPage();
		customer.ClickListCustomers();
		customer.ClickAddCustomerOnListCustomerPage();
	}

	@Test
	@Parameters({ "username", "password", "FullName", "Company", "Email", "Phone", "Address", "City", "State", "Zip",
			"Group" })
	public void ValidUserShouldBeAbleToUseSearchBarLocator(String username, String password, String FullName,
			String company, String Email, String phone, String address, String city, String state, String zipcode,
			String group) {
		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.EnterUserName(username);
		login.EnterPassword(password);
		login.ClickLoginButton();

		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.VerifyDashBoardPage();

		AddCustomer customer = PageFactory.initElements(driver, AddCustomer.class);
		customer.ClickCustomers();
		customer.ClickListCustomers();
		customer.ClickAddCustomerOnListCustomerPage();
		customer.EnterFullName(FullName);
		customer.CompanyDropDown(company);
		customer.EnterEmail(Email);
		customer.EnterPhone(phone);
		customer.EnterAddress(address);
		customer.EnterCity(city);
		customer.EnterState(state);
		customer.EnterZipCode(zipcode);
		customer.ClickSaveButtonOnAddCustomerPage();
		customer.ClickListCustomers();
		customer.TestSearchBarOnListCustomerPage();
	}

}
