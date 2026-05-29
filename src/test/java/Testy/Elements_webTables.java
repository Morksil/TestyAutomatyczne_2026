package Testy;

import base.BaseTest;
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
        boolean firstButtonAvailability = elementsPage.isEnabledFirstButton();
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
            SoftAssert tempSoftAssert = new SoftAssert();
            Thread.sleep(sleepTime);

            String tempFirstName = config.getProperty("firstNameRegistrationForm") + i;
            String tempLastName = config.getProperty("lastNameRegistrationForm") + i;
            String tempEmail = i + config.getProperty("emailRegistrationForm");
            String tempAge = String.valueOf(i + 1);
            String tempSalary = config.getProperty("salaryRegistrationForm") + i;
            String tempDepartment = config.getProperty("departmentRegistrationForm") + i;

            elementsPage.clickAddButton();
            elementsPage.typeFirstNameRegistrationForm(tempFirstName);
            elementsPage.typeLastNameRegistrationForm(tempLastName);
            elementsPage.typeEmailRegistrationForm(tempEmail);
            elementsPage.typeAgeRegistrationForm(tempAge);
            elementsPage.typeSalaryRegistrationForm(tempSalary);
            elementsPage.typeDepartmentRegistrationForm(tempDepartment);
            elementsPage.clickSubmitButtonRegistrationForm();

            elementsPage.enterSearchbox(tempFirstName);
            elementsPage.clickSearchboxButton();

            tempSoftAssert.assertEquals(elementsPage.getTextCellRow1Column1(), tempFirstName);
            tempSoftAssert.assertEquals(elementsPage.getTextCellRow1Column2(), tempLastName);
            tempSoftAssert.assertEquals(elementsPage.getTextCellRow1Column3(), tempAge);
            tempSoftAssert.assertEquals(elementsPage.getTextCellRow1Column4(), tempEmail);
            tempSoftAssert.assertEquals(elementsPage.getTextCellRow1Column5(), tempSalary);
            tempSoftAssert.assertEquals(elementsPage.getTextCellRow1Column6(), tempDepartment);
            tempSoftAssert.assertAll();

            elementsPage.clearInputSearchbox();
        }
        Assert.assertTrue(elementsPage.isEnabledNextButton());
        Assert.assertTrue(elementsPage.isEnabledLastButton());
        Assert.assertFalse(elementsPage.isEnabledFirstButton());
        Assert.assertFalse(elementsPage.isEnabledPreviousButton());

        Thread.sleep(sleepTime);
        elementsPage.clickNextButton();

        Assert.assertFalse(elementsPage.isEnabledNextButton());
        Assert.assertFalse(elementsPage.isEnabledLastButton());
        Assert.assertTrue(elementsPage.isEnabledFirstButton());
        Assert.assertTrue(elementsPage.isEnabledPreviousButton());

        Thread.sleep(sleepTime);
        elementsPage.clickFirstButton();

        Assert.assertTrue(elementsPage.isEnabledNextButton());
        Assert.assertTrue(elementsPage.isEnabledLastButton());
        Assert.assertFalse(elementsPage.isEnabledFirstButton());
        Assert.assertFalse(elementsPage.isEnabledPreviousButton());

        Thread.sleep(sleepTime);
        elementsPage.clickLastButton();

        Assert.assertFalse(elementsPage.isEnabledNextButton());
        Assert.assertFalse(elementsPage.isEnabledLastButton());
        Assert.assertTrue(elementsPage.isEnabledFirstButton());
        Assert.assertTrue(elementsPage.isEnabledPreviousButton());

        Thread.sleep(sleepTime);
        elementsPage.clickPreviousButton();

        Assert.assertTrue(elementsPage.isEnabledNextButton());
        Assert.assertTrue(elementsPage.isEnabledLastButton());
        Assert.assertFalse(elementsPage.isEnabledFirstButton());
        Assert.assertFalse(elementsPage.isEnabledPreviousButton());
    }

    @Test
    public void webTable_paginationTestCase() throws InterruptedException {
        driver.get(config.getProperty("elementsWebTablesURL"));

        elementsPage.selectPagination10Button();
        Thread.sleep(sleepTime);
        elementsPage.neutralClick();
        Thread.sleep(sleepTime);

        String paginationButtonText = elementsPage.getTextPaginationButton();
        System.out.println(paginationButtonText);

        elementsPage.selectPagination20Button();
        Thread.sleep(sleepTime);
        elementsPage.neutralClick();
        Thread.sleep(sleepTime);

        paginationButtonText = elementsPage.getTextPaginationButton();
        System.out.println(paginationButtonText);

        elementsPage.selectPagination30Button();
        Thread.sleep(sleepTime);
        elementsPage.neutralClick();
        Thread.sleep(sleepTime);
        paginationButtonText = elementsPage.getTextPaginationButton();
        System.out.println(paginationButtonText);

        elementsPage.selectPagination40Button();
        Thread.sleep(sleepTime);
        elementsPage.neutralClick();
        Thread.sleep(sleepTime);
        paginationButtonText = elementsPage.getTextPaginationButton();
        System.out.println(paginationButtonText);

        elementsPage.selectPagination50Button();
        paginationButtonText = elementsPage.getTextPaginationButton();
        System.out.println(paginationButtonText);

    }
}
