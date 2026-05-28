package Testy;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Elements_webTables extends BaseTest {
    long sleepTime = 1000;

    @Test
    public void webTable_elementsVisibilityTestCase(){
        //Visibility of columns
        SoftAssert softAssertVisibility_01 = new SoftAssert();
        //Visibility of buttons
        SoftAssert softAssertVisibility_02 = new SoftAssert();
        //Availability of buttons
        SoftAssert softAssertAvailability_02 = new SoftAssert();

        driver.get(config.getProperty("elementsWebTablesURL"));

        String firstNameColumn = elementsPage.getTextFirstNameColumn();
        String lastNameColumn = elementsPage.getTextLastNameColumn();
        String ageColumn = elementsPage.getTextAgeColumn();
        String emailColumn = elementsPage.getTextEmailColumn();
        String salaryColumn = elementsPage.getTextSalaryColumn();
        String departmentColumn = elementsPage.getTextDepartmentColumn();
        String actionColumn = elementsPage.getTextActionColumn();

        System.out.println("***Columns***");
        System.out.println(firstNameColumn);
        System.out.println(lastNameColumn);
        System.out.println(ageColumn);
        System.out.println(emailColumn);
        System.out.println(salaryColumn);
        System.out.println(departmentColumn);
        System.out.println(actionColumn);

        softAssertVisibility_01.assertEquals(firstNameColumn, "First Name");
        softAssertVisibility_01.assertEquals(lastNameColumn, "Last Name");
        softAssertVisibility_01.assertEquals(ageColumn, "Age");
        softAssertVisibility_01.assertEquals(emailColumn, "Email");
        softAssertVisibility_01.assertEquals(salaryColumn, "Salary");
        softAssertVisibility_01.assertEquals(departmentColumn, "Department");
        softAssertVisibility_01.assertEquals(actionColumn, "Action");

        softAssertVisibility_01.assertAll();

        System.out.println("***Buttons***");
        boolean addButtonVisibility = elementsPage.isDisplayedAddButton();
        System.out.println("Add button visible: " + addButtonVisibility);
        boolean addButtonAvailability = elementsPage.isEnabledAddButton();
        System.out.println("Add button is enable: " + addButtonAvailability);
        boolean searchButtonVisibility = elementsPage.isDisplayedSearchButton();
        System.out.println("Search button is visible: " + searchButtonVisibility);
        boolean searchButtonAvailability = elementsPage.isEnabledSearchButton();
        System.out.println("Search button is enabled: " + searchButtonAvailability);

        boolean firstButtonVisibility = elementsPage.isDisplayedFirstButton();
        boolean previousButtonVisibility = elementsPage.isDisplayedPreviousButton();
        boolean nextButtonVisibility = elementsPage.isDisplayedNextButton();
        boolean lastButtonVisibility = elementsPage.isDisplayedLastButton();
        boolean firstButtonAvailability = elementsPage.isEnabledFirstbutton();
        boolean previousButtonAvailabilty = elementsPage.isEnabledPreviousButton();
        boolean nextButtonAvailability = elementsPage.isEnabledNextButton();
        boolean lastButtonAvailability = elementsPage.isEnabledLastButton();

        System.out.println("First button visible: " + firstButtonVisibility);
        System.out.println("First button enable: " + firstButtonAvailability);
        System.out.println("Previous button visible: " + previousButtonVisibility);
        System.out.println("Previous button enable: " + previousButtonAvailabilty);
        System.out.println("Next button visible: " + nextButtonVisibility);
        System.out.println("Next button enable: " + nextButtonAvailability);
        System.out.println("Last button visible: " + lastButtonVisibility);
        System.out.println("Last button enable: " + lastButtonAvailability);

        softAssertVisibility_02.assertEquals(addButtonVisibility, true);
        softAssertVisibility_02.assertEquals(searchButtonVisibility, true);
        softAssertVisibility_02.assertEquals(firstButtonVisibility, true);
        softAssertVisibility_02.assertEquals(previousButtonVisibility, true);
        softAssertVisibility_02.assertEquals(nextButtonVisibility, true);
        softAssertVisibility_02.assertEquals(lastButtonVisibility, true);
        softAssertVisibility_02.assertAll();

        softAssertAvailability_02.assertEquals(addButtonAvailability, true);
        softAssertAvailability_02.assertEquals(searchButtonAvailability, true);
        softAssertAvailability_02.assertEquals(firstButtonAvailability, false);
        softAssertAvailability_02.assertEquals(previousButtonAvailabilty, false);
        softAssertAvailability_02.assertEquals(nextButtonAvailability, false);
        softAssertAvailability_02.assertEquals(lastButtonAvailability, false);
        softAssertAvailability_02.assertAll();

    }

    @Test
    public void webTable_searchbarTestCase() throws InterruptedException {
        driver.get(config.getProperty("elementsWebTablesURL"));
        elementsPage.enterSearchbox(config.getProperty("searchboxText"));

        Assert.assertEquals(elementsPage.getTextFilteredValue(), "Kierra");
        Thread.sleep(sleepTime);
        elementsPage.clearInputSearchbox();
        Assert.assertEquals(elementsPage.isEmptyValueSearchbox(), true);
    }

    @Test
    public void webTable_editRecordTestCase() throws InterruptedException {
        driver.get(config.getProperty("elementsWebTablesURL"));
        elementsPage.clickEditButton();

        elementsPage.clearInputFirstNameRegistrationForm();
        elementsPage.typeFirstNameRegistrationForm(config.getProperty("elementsWebTablesRegistrationFormFirstNameEdit"));
        Thread.sleep(sleepTime);
        elementsPage.clickSubmitButtonRegistrationForm();
        String editedCell = elementsPage.getTextCellRow1Column1();
        System.out.println(editedCell);
        Assert.assertEquals(editedCell, "Adam");
    }

    @Test
    public void webTable_addRecordTestCase() throws InterruptedException {
        driver.get(config.getProperty("elementsWebTablesURL"));
        int numberOfNewRecordsWebTables = Integer.parseInt(config.getProperty("numberOfNewRecords"));

        for(int i=0; i<numberOfNewRecordsWebTables; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickAddButton();
            elementsPage.typeFirstNameRegistrationForm(config.getProperty("firstNameRegistrationForm") + i);
            elementsPage.typeLastNameRegistrationForm(config.getProperty("lastNameRegistrationForm") + i);
            elementsPage.typeEmailRegistrationForm(i + config.getProperty("emailRegistrationForm"));
            elementsPage.typeAgeRegistrationForm(config.getProperty("ageRegistrationForm") + i);
            elementsPage.typeSalaryRegistrationForm(config.getProperty("salaryRegistrationForm") + i);
            elementsPage.typeDepartmentRegistrationForm(config.getProperty("departmentRegistrationForm") + i);

            elementsPage.clickSubmitButtonRegistrationForm();
        }
    }
}
