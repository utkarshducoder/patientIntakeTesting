	Feature: Login with valid credentials
	
	  Scenario: to check the login functionality
	    Given the user opens the browser
	    And search for "https://formsgen-user-staging.centerforvein.com/#/patient-intake/57DE0F5E-2EC0-4F89-BCE3-502E1405BC20"
	    And enters firstname as "Janis" and lastname as "Lafont"
	    And enters phone number "1234567890"
	    And dob as "03/03/1956"
	    Then click on send otp button
	    And enters otp as "032218"
	    And clicks on Verify button
	    And clicks on Continue button
	    Then selects Yes radiobutton 
	    And clicks on Continue to move to the next page
			And clicks on Continue button of Form
	    