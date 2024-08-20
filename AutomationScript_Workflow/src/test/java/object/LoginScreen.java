package object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;

public class LoginScreen {
	public WebDriver driver;
	public LoginScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[contains(@class,'p-inputtext')])[1]")
	WebElement fname;

	@FindBy(xpath = "(//input[contains(@class,'p-inputtext')])[2]")
	WebElement lname;

	@FindBy(xpath = "(//input[contains(@class,'p-inputtext')])[3]")
	WebElement pno;

	@FindBy(xpath = "(//input[contains(@class,'p-inputtext')])[4]")
	WebElement dob;

	@FindBy(xpath = "//button[contains(text(),'Send OTP')]")
	WebElement otpBtn;

	@FindBy(xpath = "//input[@inputmode='numeric']")
	WebElement otpInput;

	@FindBy(xpath = "//button[contains(text(),'Verify')]")
	WebElement verifyBtn;
	
//	@FindBy(xpath = "//h3[@class='form-name']")
//	WebElement headingView;
	
	@FindBy(xpath = "//span/button")
	WebElement continueBtn;
	
	@FindBy(xpath = "//input[@value='Yes']")
	WebElement yesRadioButton;
	
	@FindBy(xpath = "//span[@class='ng-star-inserted'][2]/button")
	WebElement clickOnContinueButton;
	
	@FindBy(xpath = "//div[contains(@style,'space-between')]/span[2]")
	WebElement clickedContinue;
	
	public void enterFname(String firstname) throws InterruptedException {
		Thread.sleep(9000);
		fname.sendKeys(firstname);
	}

	public void enterLname(String lastname) throws InterruptedException {
		Thread.sleep(9000);
		lname.sendKeys(lastname);
	}

	public void enterPhoneNumber(String phone) throws InterruptedException {
		Thread.sleep(9000);
		pno.sendKeys(phone);
	}

	public void enterDateOfBirth(String date) throws InterruptedException {
		Thread.sleep(9000);
		dob.sendKeys(date);
	}

	public void clickOtp() throws InterruptedException {

		Thread.sleep(4000);
		otpBtn.click();
	}

	public void enterOtp(String otp) throws InterruptedException {
		Thread.sleep(9000);
		otpInput.sendKeys(otp);
	}

	public void clickVerify() throws InterruptedException {
	    verifyBtn.click();
	}

	public void clickingOnContinue() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	    wait.until(ExpectedConditions.visibilityOf(continueBtn));
	    
	    // Scroll the element into view
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueBtn);
	    
	    // Use JavaScript to click the element
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", continueBtn);
	}

	
	public void selectYesRadioButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(yesRadioButton));
		yesRadioButton.click();
	}
	
	public void clickContinue() {
		clickOnContinueButton.click();
	}
	
	public void clickedOnContinueButton() {
		clickedContinue.click();
	}
	
	
	
}
