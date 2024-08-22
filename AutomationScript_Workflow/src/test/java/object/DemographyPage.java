package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemographyPage {
	public WebDriver driver;
	public DemographyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[@class='form-name']")
	WebElement headingOfDemoForm;
	
	@FindBy(xpath = "//div/input[@id='ekvaned-patient_first_name']")
	WebElement fname;
	
	@FindBy(xpath = "//div/input[@id='eplwk05-patient_last_name']")
	WebElement lname;
	
	@FindBy(xpath = "//div/input[@id='ek3mvs-patient_dob']")
	WebElement dobInput;
	
	@FindBy(xpath = "//span[@class='ng-star-inserted']/button[contains(text(),'Continue')]")
	WebElement clickOnContinueButton;
	
	public String getHeadingText() {
		return headingOfDemoForm.getText();
	}
	
	public String returnFirstName() {
		return fname.getText();
	}
	public String returnLastName() {
		return lname.getText();
	}
	public String returnDateOfBirth() {
		return dobInput.getText();
	}
	public void clickOnButtonOfContinue() {
		clickOnContinueButton.click();
	}
	
	
	
	
	
	
	
	
}
