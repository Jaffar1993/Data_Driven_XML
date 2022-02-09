package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class AddCustomer {

	WebDriver driver;

	public AddCustomer(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMERS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement ADD_CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROPDOWN_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement GROUP_DROPDOWN_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement ADD_CUSTOMER_SAVE_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")
	WebElement LIST_CUSTOMERS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-success']")
	WebElement ADD_CUSTOMER_LIST_CUSTOMER_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='foo_filter']")
	WebElement SEARCH_BAR_LOCATOR;

	public void ClickCustomers() {
		CUSTOMERS_FIELD_LOCATOR.click();
	}

	public void ClickAddCustomer() {
		ADD_CUSTOMER_FIELD_LOCATOR.click();
	}

	String EnteredName;
	public void EnterFullName(String FullName) {
		String EnteredName = FullName + BasePage.RandomNumGenerate();
		FULL_NAME_FIELD_LOCATOR.sendKeys(EnteredName);
	}

	public void CompanyDropDown(String company) {
		BasePage.DropDown(COMPANY_DROPDOWN_FIELD_LOCATOR, company);
	}

	public void EnterEmail(String Email) {
		String EnteredEmail = Email + BasePage.RandomNumGenerate();
		EMAIL_FIELD_LOCATOR.sendKeys(EnteredEmail);
	}

	public void EnterPhone(String phone) {
		PHONE_FIELD_LOCATOR.sendKeys(phone);
	}

	public void EnterAddress(String address) {
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
	}

	public void EnterCity(String city) {
		CITY_FIELD_LOCATOR.sendKeys(city);
	}

	public void EnterState(String state) {
		STATE_FIELD_LOCATOR.sendKeys(state);
	}

	public void EnterZipCode(String zipcode) {
		ZIP_FIELD_LOCATOR.sendKeys(zipcode);
	}

	public void EnterGroup(String group) {
		BasePage.DropDown(GROUP_DROPDOWN_FIELD_LOCATOR, group);
	}

	public void ClickSaveButtonOnAddCustomerPage() {
		ADD_CUSTOMER_SAVE_BUTTON_LOCATOR.click();
	}

	public void ClickListCustomers() {
		LIST_CUSTOMERS_FIELD_LOCATOR.click();
	}

	public void ClickAddCustomerOnListCustomerPage() {
		ADD_CUSTOMER_LIST_CUSTOMER_LOCATOR.click();
	}

	public void TestSearchBarOnListCustomerPage() {
		SEARCH_BAR_LOCATOR.sendKeys("Sep Batch701");
	}

}
