package org.pojo;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Pojoclass extends BaseClass {
    
    
    public Pojoclass() {
        PageFactory.initElements(driver, this);
    }

    // Login Locators
    @FindBy(xpath = "//input[@type='email']") 
    private WebElement txtUsername;

    @FindBy(xpath = "//input[@type='password']") 
    private WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']") 
    private WebElement btnLogin;

    // Navigation Locators
    @FindBy(xpath = "//a[contains(@href,'subscription')]")
    private WebElement btnBilling;
    @FindBy(xpath = "\"//div[contains(text(), 'SETTINGS')]")
    private WebElement btnSettings;
    @FindBy(xpath = "//*[text()='Logout']") 
    private WebElement btnLogout;

    // Billing & Settings Locators
 // Pojoclass.java
    @FindBy(xpath = "//input[@placeholder='State' or @name='state']")
    private WebElement txtState;

    @FindBy(xpath = "//input[@placeholder='City' or @name='city']")
    private WebElement txtCity;

    
    @FindBy(xpath = "//button[contains(text(),'Save')]") 
    private WebElement btnSave;
    @FindBy(xpath = "//button[contains(text(),'Edit')]") 
    private WebElement btnEdit;
    @FindBy(xpath = "//button[text()='Update Plan']") 
    private WebElement btnUpdatePlan;

    // Dynamic Input Fields
    @FindBy(xpath = "//div[contains(.,'Amount')]//input | //label[contains(normalize-space(),'Amount')]/following-sibling::input")
    private WebElement inputField1;
    @FindBy(xpath = "//input[@name='tax']")
    private WebElement inputField2;
    @FindBy(xpath = "//input[@name='discount']")
    private WebElement inputField3;
    @FindBy(xpath = "//input[@name='total']")
    private WebElement inputField4;
    @FindBy(name = "userslimit") 
    private WebElement txtUsersLimit;
    @FindBy(name = "features")
    private WebElement txtFeatures;

    // Feedback/Message Locators
    @FindBy(xpath = "//*[contains(text(),'Invalid')]")
    private WebElement errorMsg;
    @FindBy(xpath = "//*[contains(text(),'success')]")
    private WebElement successMsg;
    
    
    @FindBy(xpath = "//span[text()='SETTINGS']")
    private WebElement menuSettings;

    @FindBy(xpath = "//button[contains(text(),'Location Management')]")
    private WebElement btnLocationMgmt;

    

    @FindBy(xpath = "//button[text()='Update Location']")
    private WebElement btnUpdateLoc;

    
    @FindBy(xpath = "//button[contains(text(),'Add')]")
    private WebElement btnAdd;

    @FindBy(xpath = "//button[text()='Save City']")
    private WebElement btnSaveCity;
    

    // Getters
    public WebElement getMenuSettings() { return menuSettings; }
    public WebElement getBtnLocationMgmt() { return btnLocationMgmt; }
    
    public WebElement getBtnUpdateLoc() { return btnUpdateLoc; }
    public WebElement getBtnAdd() { return btnAdd; }
    public WebElement getBtnSaveCity() { return btnSaveCity; }

    public WebElement getTxtUserword() { 
    	return txtPassword; 
    	}
	public WebElement getTxtPassword() { 
    	return txtPassword; 
    	}
    public WebElement getBtnLogin() { 
    	return btnLogin; 
    	}
    public WebElement getBtnBilling() {
    	return btnBilling;
    	}
    public WebElement getBtnSettings(){ 
    	return btnSettings;
    	}
    public WebElement getTxtState() {
    	return txtState;
    	}
    public WebElement getTxtCity() { 
    	return txtCity; 
    	}
    public WebElement getBtnSave() { 
    	return btnSave;
    	}
    public WebElement getBtnEdit() { 
    	return btnEdit;
    	}
    public WebElement getInputField1() {
    	return inputField1; 
    	}
    public WebElement getInputField2() {
    	return inputField2;
    	}
    public WebElement getInputField3() {
    	return inputField3;
    	}
    public WebElement getInputField4() {
    	return inputField4; 
    	}
    public WebElement getTxtUsersLimit() { 
    	return txtUsersLimit;
    	}
    public WebElement getTxtFeatures() {
    	return txtFeatures;
    	}
    public WebElement getBtnUpdatePlan() {
    	return btnUpdatePlan;
    	}
    public WebElement getErrorMsg() {
    	return errorMsg;
    	}
    public WebElement getSuccessMsg() 
    {
    	return successMsg;
    	}
    public WebElement getBtnLogout()
    { 
    	return btnLogout; }

//Open BillingPage.java and replace the @FindBy locators with these:

//1. A broad search for the dropdown container or input field
@FindBy(xpath = "//span[contains(text(),'Plan')] | //input[contains(@placeholder,'Plan')] | //select[contains(@id,'plan')]")
private WebElement planDropdown;

//2. A broad search for the options that pop up
@FindBy(xpath = "//li[contains(text(),'Plan')] | //option")
private List<WebElement> dropdownOptions;
}

