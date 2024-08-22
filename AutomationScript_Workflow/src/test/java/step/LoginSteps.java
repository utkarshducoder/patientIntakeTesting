package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import object.DemographyPage;
import object.LoginScreen;

public class LoginSteps {
	public WebDriver driver;
	public LoginScreen loginscreen;
	public DemographyPage demopageobj;
	
	 @Before
	    public void setUp() {
	        // Initialize the WebDriver and create a new instance before each scenario
	        driver = new ChromeDriver();
	        loginscreen = new LoginScreen(driver);
	    }

	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
		driver = new ChromeDriver();
		loginscreen = new LoginScreen(driver);
		
	}

	@Given("search for {string}")
	public void search_for(String url) {
		driver.get(url);
	}


	@Given("enters firstname as {string} and lastname as {string}")
	public void enters_firstname_as_and_lastname_as(String fname, String lname) throws InterruptedException {
		loginscreen.enterFname(fname);
		loginscreen.enterLname(lname);
	}

	@Given("enters phone number {string}")
	public void enters_phone_number(String number) throws InterruptedException {
		loginscreen.enterPhoneNumber(number);
	}

	@Given("dob as {string}")
	public void dob_as(String date) throws InterruptedException {
		loginscreen.enterDateOfBirth(date);
	}

	@Then("click on send otp button")
	public void click_on_send_otp_button() throws InterruptedException {
		loginscreen.clickOtp();
	}

	@Then("enters otp as {string}")
	public void enters_otp_as(String otp) throws InterruptedException {
		loginscreen.enterOtp(otp);
	}

	@Then("clicks on Verify button")
	public void clicks_on_verify_button() throws InterruptedException {
		loginscreen.clickVerify();
	}

	@Then("clicks on Continue button")
	public void clicks_on_continue_button() {
		loginscreen.clickingOnContinue();
		}

	@Then("selects Yes radiobutton")
	public void selects_yes_radiobutton() {
		loginscreen.selectYesRadioButton();
	}
	//
	@Then("clicks on Continue to move to the next page")
	public void clicks_on_continue_to_move_to_the_next_page() {
		loginscreen.clickContinue();
	}
	
		@Then("clicks on Continue button of Form")
		public void clicks_on_continue_button_of_form() {
			loginscreen.clickedOnContinueButton();
		}
		



	//Demography.feature

	@Given("the user is on the demography page with heading as {string}")
	public void the_user_is_on_the_demography_page_with_heading_as(String expectedHeading) {
		demopageobj = new DemographyPage(driver);
		String actualHeading = demopageobj.getHeadingText();
		Assert.assertEquals(expectedHeading, actualHeading);
		System.out.println("Heading match");
	}
	
	@Then("the user verifies firstname as {string}")
	public void the_user_verifies_firstname_as(String expectedFname) {
		String actualFname = demopageobj.returnLastName();
		Assert.assertEquals(expectedFname, actualFname);
		System.out.println("First name match");

	}
	@Then("the user verifies lastname as {string}")
	public void the_user_verifies_lastname_as(String expectedLname) {
		String actualLname = demopageobj.returnLastName();
		Assert.assertEquals(expectedLname, actualLname);
		System.out.println("Last name match");

	}
	@Then("the user verifies date of birth as {string}")
	public void the_user_verifies_date_of_birth_as(String expectedDob) {
		String actualDob = demopageobj.returnDateOfBirth();
		Assert.assertEquals(expectedDob, actualDob);
	}
	@When("the user clicks on the continue button")
	public void the_user_clicks_on_the_continue_button() {
		demopageobj.clickOnButtonOfContinue();
	}
//	@Then("the user should be navigated to the next page")
//	public void the_user_should_be_navigated_to_the_next_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}




}
