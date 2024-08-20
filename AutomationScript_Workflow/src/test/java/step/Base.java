package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import object.LoginScreen;

public class Base {
	public WebDriver driver;
	public LoginScreen loginscreen;

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

	@Then("clicks on Continue to move to the next page")
	public void clicks_on_continue_to_move_to_the_next_page() {
		loginscreen.clickContinue();
	}

	@Then("clicks on Continue button of Form")
	public void clicks_on_continue_button_of_form() {
		loginscreen.clickedOnContinueButton();
	}
	
}
