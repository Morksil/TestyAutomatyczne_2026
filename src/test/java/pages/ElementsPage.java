package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

    /// Web Tables ///
    //locators
    By firstNameColumn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/thead/tr/th[1]");
    By lastNameColumn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/thead/tr/th[2]");
    By ageColumn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/thead/tr/th[3]");
    By emailColumn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/thead/tr/th[4]");
    By salaryColumn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/thead/tr/th[5]");
    By departmentColumn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/thead/tr/th[6]");
    By actionColumn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/thead/tr/th[7]");
    By addButton = By.cssSelector("button[id='addNewRecordButton']");
    By searchButton = By.cssSelector("button[id='basic-addon2']");
    By firstButton = By.xpath("//div[@role='group']/button[1]");
    By previousButton = By.xpath("//div[@role='group']/button[2]");
    By nextButton = By.xpath("//div[@role='group']/button[3]");
    By lastButton = By.xpath("//div[@role='group']/button[4]");
    By searchboxInput = By.cssSelector("input[id='searchBox']");
    By filteredValue = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr/td[1]");
    By editButton = By.cssSelector("span[id='edit-record-1']");
    By firstNameRegistrationForm = By.cssSelector("input[id='firstName']");
    By lastNameRegistrationForm = By.cssSelector("input[id='lastName']");
    By emailRegistrationForm = By.cssSelector("input[id='userEmail']");
    By ageRegistrationForm = By.cssSelector("input[id='age']");
    By salaryRegistrationForm = By.cssSelector("input[id='salary']");
    By departmentRegistrationForm = By.cssSelector("input[id='department']");
    By submitButtonRegistrationForm = By.cssSelector("button[id='submit']");
    By cellRow1Column1 = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[1]");
    By cellRow1Column2 = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]");
    By cellRow1Column3 = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[3]");
    By cellRow1Column4 = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[4]");
    By cellRow1Column5 = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[5]");
    By cellRow1Column6 = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[6]");
    By paginationButton = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/div[3]/div/div[3]/select");
    By paginationOption10Button = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/div[3]/div/div[3]/select/option[1]");
    By paginationOption20Button = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/div[3]/div/div[3]/select/option[2]");
    By neutralClick = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[1]/div/h1");

    //column names
    public String getTextFirstNameColumn(){
        return getText(firstNameColumn);
    }

    public String getTextLastNameColumn(){
        return getText(lastNameColumn);
    }

    public String getTextAgeColumn(){
        return getText(ageColumn);
    }

    public String getTextEmailColumn(){
        return getText(emailColumn);
    }

    public String getTextSalaryColumn(){
        return getText(salaryColumn);
    }

    public String getTextDepartmentColumn(){
        return getText(departmentColumn);
    }

    public String getTextActionColumn(){
        return getText(actionColumn);
    }

    public boolean isDisplayedAddButton(){
        return isDisplayed(addButton);
    }

    public boolean isEnabledAddButton(){
        return isEnabled(addButton);
    }

    public boolean isDisplayedSearchButton(){
        return isDisplayed(searchButton);
    }

    public boolean isEnabledSearchButton(){
        return isEnabled(searchButton);
    }

    public boolean isDisplayedFirstButton(){
        return isDisplayed(firstButton);
    }

    public boolean isEnabledFirstButton(){
        return isEnabled(firstButton);
    }

    public boolean isDisplayedPreviousButton(){
        return isDisplayed(previousButton);
    }

    public boolean isEnabledPreviousButton(){
        return isEnabled(previousButton);
    }

    public boolean isDisplayedNextButton(){
        return isDisplayed(nextButton);
    }

    public boolean isEnabledNextButton(){
        return isEnabled(nextButton);
    }

    public boolean isDisplayedLastButton(){
        return isDisplayed(lastButton);
    }

    public boolean isEnabledLastButton(){
        return isEnabled(lastButton);
    }

    public void enterSearchbox(String text){
        type(searchboxInput, text);
    }

    public String getTextFilteredValue(){
        return getText(filteredValue);
    }

    public void clearInputSearchbox(){
        clearInput(searchboxInput);
    }

    public boolean isEmptyValueSearchbox(){
        return isEmptyValueAttribute("value", searchboxInput);
    }

    public void clickEditButton(){
        click(editButton);
    }

    public void clearInputFirstNameRegistrationForm(){
        clearInput(firstNameRegistrationForm);
    }

    public void typeFirstNameRegistrationForm(String text){
        type(firstNameRegistrationForm, text);
    }

    public void typeLastNameRegistrationForm(String text){
        type(lastNameRegistrationForm, text);
    }

    public void typeEmailRegistrationForm(String text){
        type(emailRegistrationForm, text);
    }

    public void typeAgeRegistrationForm(String text){
        type(ageRegistrationForm, text);
    }

    public void typeSalaryRegistrationForm(String text){
        type(salaryRegistrationForm, text);
    }

    public void typeDepartmentRegistrationForm(String text){
        type(departmentRegistrationForm, text);
    }

    public void clickSubmitButtonRegistrationForm(){
        click(submitButtonRegistrationForm);
    }

    public String getTextCellRow1Column1(){
        return getText(cellRow1Column1);
    }

    public String getTextCellRow1Column2(){
        return getText(cellRow1Column2);
    }

    public String getTextCellRow1Column3(){
        return getText(cellRow1Column3);
    }

    public String getTextCellRow1Column4(){
        return getText(cellRow1Column4);
    }

    public String getTextCellRow1Column5(){
        return getText(cellRow1Column5);
    }

    public String getTextCellRow1Column6(){
        return getText(cellRow1Column6);
    }

    public void clickAddButton(){
        click(addButton);
    }

    public void clickSearchboxButton(){
        click(searchButton);
    }

    public void clickNextButton(){
        click(nextButton);
    }

    public void clickLastButton(){
        click(lastButton);
    }

    public void clickPreviousButton(){
        click(previousButton);
    }

    public void clickFirstButton(){
        click(firstButton);
    }

    public String getTextPaginationButton(){
        Select select = new Select(driver.findElement(paginationButton));
        System.out.println("Value: " + select.getWrappedElement().getAttribute("value"));

        for(WebElement option : select.getOptions()){
            System.out.println(option.getText() + " | selected=" + option.isSelected());
        }
        return select.getFirstSelectedOption().getText();
    }

    public void selectPagination10Button(){
        Select select = new Select(driver.findElement(paginationButton));
        select.selectByIndex(0);
    }

    public void selectPagination20Button(){
        Select select = new Select(driver.findElement(paginationButton));
        select.selectByIndex(1);
    }

    public void selectPagination30Button(){
        Select select = new Select(driver.findElement(paginationButton));
        select.selectByIndex(2);
    }

    public void selectPagination40Button(){
        Select select = new Select(driver.findElement(paginationButton));
        select.selectByIndex(3);
    }

    public void selectPagination50Button(){
        Select select = new Select(driver.findElement(paginationButton));
        select.selectByIndex(4);
        System.out.println("Value = " + select.getWrappedElement().getAttribute("value"));
        System.out.println("selected = " + select.getFirstSelectedOption().getText());
    }

    public void neutralClick(){
        click(neutralClick);
    }
}
