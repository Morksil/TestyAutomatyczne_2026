package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    //Inputs
    By fullNameInput = By.id("userName");
    By emailInput = By.id("userEmail");
    By currentAddressInput = By.id("currentAddress");
    By permanentAddressInput = By.id("permanentAddress");

    //Buttons
    By submitButton = By.id("submit");

    //Fields
    By nameSummaryField = By.cssSelector("p[class='mb-1'][id='name']");
    By emailSummaryField = By.cssSelector("p[class='mb-1'][id='email']");
    By currentAddressSummaryField = By.cssSelector("p[class='mb-1'][id='currentAddress']");
    By permanentAddressSummaryField = By.cssSelector("p[class='mb-1'][id='permanentAddress']");

    public HomePage(WebDriver driver){
        super(driver);
    }

    //Input funcions
    public void enterFullName(String fullName){
        type(fullNameInput, fullName);
    }

    public void enterEmail(String email){
        type(emailInput, email);
    }

    public void enterCurrentAddress(String address){
        type(currentAddressInput, address);
    }

    public void enterPermanentAddress(String permanentAddress){
        type(permanentAddressInput, permanentAddress);
    }

    //Click functions
    public void clickSubmit() {
        click(submitButton);
    }

    //GetText functions
    public String getTextNameSummary(){
        return getText(nameSummaryField);
    }

    public String getEmailSummary(){
        return getText(emailSummaryField);
    }

    public String getCurrentAddressSummary(){
        return getText(currentAddressSummaryField);
    }

    public String getPermanentAddressSummary(){
        return getText(permanentAddressSummaryField);
    }
}
