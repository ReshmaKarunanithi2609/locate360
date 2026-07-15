Feature: Locate360 End-to-End Automation Functionality

  Background: 
    Given The user is on the Locate360 login page
    When The user enters valid username "ragu.kiaq@gmail.com" and password "Ragu@123"
    And The user clicks the login button
 
  @ValidFeatures
  @SkipMe
  Scenario: To validate login, billing section, and settings page with valid credentials
    When The user enters valid username "ragu.kiaq@gmail.com" and password "Ragu@123"
    And The user clicks the login button
    Then The user should be successfully redirected to the dashboard

    # Billing Section Validation
    When The user navigates to the Billing section
    Then The user validates that revenue and pending payments are displayed correctly

    # Settings Section Validation
    When The user navigates to the Settings page
    And The user updates the profile settings
    Then The user verifies that settings are saved successfully

    # Logout
    And The user clicks the logout button
    Then The user is successfully logged out
   @SkipMe
   Scenario Outline: Verify Settings with different locations and Add new city
    Given The user is on the Locate360 login page
    When The user navigates to the Settings page
    And The user clicks the Location Management option
    
    # Existing Edit process
    And The user edits existing location with State as "<State>" and City as "<City>"
    And The user clicks the Update Location button
    
    # New Add process
    And The user clicks the Add Location button
    And The user adds new State as "<NewState>" and City as "<NewCity>"
    Then The user verifies that settings are saved successfully

    Examples:
      | State      | City              | NewState   | NewCity   |
      | Maharashtra| Mumbai to Chennai | Tamil Nadu | Chennai   |
      | Delhi      | Mumbai to Delhi   | Karnataka  | Bengaluru |

  @BillingValidationBug
  @SkipMe
  Scenario: Verify regional validation cross-matching rules for State and City
    When The user enters valid username "ragu.kiaq@gmail.com" and password "Ragu@123"
    And The user clicks the login button
    Then The user should be successfully redirected to the dashboard
    When The user navigates to the Billing section
    And The user selects details as "name" and inputs plan as "planining details"
    And The user saves the billing plan details
    Then The system should display a regional validation error message
    
    @InvalidLogin
  Scenario Outline: To verify login functionality with invalid credentials
    When The user enters invalid username "<username>" and password "<password>"
    And The user clicks the login button
    Then The user should see an error message "Invalid credentials"

    Examples: 
      | username           | password     |
      | admin@wrong.com    | Admin123     |
      | admin@locate360.com| WrongPass123 |