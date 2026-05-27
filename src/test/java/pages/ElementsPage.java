package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {

    /// Text box ///
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

    public ElementsPage(WebDriver driver){
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

    /// Checkbox ///
    // checkbox
    By homeCheckbox = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/span[3]");
    By homeCheckboxExpand = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/span[2]");
    By desktopCheckbox = By.cssSelector("span[aria-label='Select Desktop']");
    By desktopCheckboxExpand = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]");
    By notesCheckbox = By.cssSelector("span[aria-label='Select Notes']");
    By commandsCheckbox = By.cssSelector("span[aria-label='Select Commands']");
    By documentsCheckbox = By.cssSelector("span[aria-label='Select Documents']");
    By documentsCheckboxExpand = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[5]/span[2]");
    By workspaceCheckbox = By.cssSelector("span[aria-label='Select WorkSpace']");
    By workspaceCheckboxExpand = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[6]/span[2]");
    By reactCheckbox = By.cssSelector("span[aria-label='Select React']");
    By angularCheckbox = By.cssSelector("span[aria-label='Select Angular']");
    By veuCheckbox = By.cssSelector("span[aria-label='Select Veu']");
    By officeCheckbox = By.cssSelector("span[aria-label='Select Office']");
    By officeCheckboxExpand = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[10]/span[2]");
    By publicCheckbox = By.cssSelector("span[aria-label='Select Public']");
    By privateCheckbox = By.cssSelector("span[aria-label='Select Private']");
    By classifiedCheckbox = By.cssSelector("span[aria-label='Select Classified']");
    By generalCheckbox = By.cssSelector("span[aria-label='Select General']");
    By downloadsCheckbox = By.cssSelector("span[aria-label='Select Downloads']");
    By downloadsCheckboxExpand = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div[15]/span[2]");
    By wordFileCheckbox = By.cssSelector("span[aria-label='Select Word File.doc']");
    By excelFileCheckbox = By.cssSelector("span[aria-label='Select Excel File.doc']");

    //checkbox click
    public void clickHomeCheckbox(){
        click(homeCheckbox);
    }

    public void clickHomeCheckboxExpand(){
        click(homeCheckboxExpand);
    }

    public void clickDesktopCheckbox(){
        click(desktopCheckbox);
    }

    public void clickDesktopCheckboxExpand(){
        click(desktopCheckboxExpand);
    }

    public void clickNotesCheckbox(){
        click(notesCheckbox);
    }

    public void clickCommandsCheckbox(){
        click(commandsCheckbox);
    }

    public void clickDocumentsCheckbox(){
        click(documentsCheckbox);
    }

    public void clickDocumentsCheckboxExpand(){
        click(documentsCheckboxExpand);
    }

    public void clickWorkspaceCheckbox(){
        click(workspaceCheckbox);
    }

    public void clickWorkspaceCheckboxExpand(){
        click(workspaceCheckboxExpand);
    }

    public void clickReactCheckbox(){
        click(reactCheckbox);
    }

    public void clickAngularCheckbox(){
        click(angularCheckbox);
    }

    public void clickVeuCheckbox(){
        click(veuCheckbox);
    }

    public void clickOfficeCheckbox(){
        click(officeCheckbox);
    }

    public void clickOfficeCheckboxExpand(){
        click(officeCheckboxExpand);
    }

    public void clickPublicCheckbox(){
        click(publicCheckbox);
    }

    public void clickPrivateCheckbox(){
        click(privateCheckbox);
    }

    public void clickClassifiedCheckbox(){
        click(classifiedCheckbox);
    }

    public void clickGeneralCheckbox(){
        click(generalCheckbox);
    }

    public void clickDownloadsCheckbox(){
        click(downloadsCheckbox);
    }
    public void clickDownloadsCheckboxExpand(){
        click(downloadsCheckboxExpand);
    }

    public void clickWordFileCheckbox(){
        click(wordFileCheckbox);
    }

    public void clickExcelFileCheckbox(){
        click(excelFileCheckbox);
    }

    /// RadioButton ///
    // radiobutton
    By yesRadioButton = By.cssSelector("input[id='yesRadio']");
    By noRadioButton = By.cssSelector("input[id='noRadio']");
    By impressiveRadioButton = By.cssSelector("input[id='impressiveRadio']");

    //radiobutton click
    public void clickYesRadioButton(){
        click(yesRadioButton);
    }

    public void clickImpressiveRadioButton(){
        click(impressiveRadioButton);
    }

    public void clickNoRadioButton(){
        click(noRadioButton);
    }

    //radiobutton isEnable
    public boolean yesRadioButtonAvailability(){
        return isEnabled(yesRadioButton);
    }

    public boolean noRadioButtonAvailability(){
        return isEnabled(noRadioButton);
    }

    public boolean impressiveRadioButtonAvailability(){
        return isEnabled(impressiveRadioButton);
    }

    //radioButton isSelected
    public boolean yesRadioButtonIsSelected(){
        return isSelected(yesRadioButton);
    }

    public boolean impressiveRadioButtonIsSelected(){
        return isSelected(impressiveRadioButton);
    }

    public boolean noRadioButtonIsSelected(){
        return isSelected(noRadioButton);
    }
}
