package Testy;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Elements_textBox extends BaseTest {

    @Test
    public void elementsTextBox_positiveTest(){
        SoftAssert softAssert = new SoftAssert();
        driver.get(config.getProperty("elementsTextBoxURL"));

        String title = driver.getTitle();

        System.out.println(title);

        elementsPage.enterFullName(config.getProperty("fullName"));
        elementsPage.enterEmail(config.getProperty("email"));
        elementsPage.enterCurrentAddress(config.getProperty("currentAddress"));
        elementsPage.enterPermanentAddress(config.getProperty("permanentAddress"));

        elementsPage.clickSubmit();

        String textNameSummary = elementsPage.getTextNameSummary();
        System.out.println(textNameSummary);
        String emailSummary = elementsPage.getEmailSummary();
        System.out.println(emailSummary);
        String currentAddressSummary = elementsPage.getCurrentAddressSummary();
        System.out.println(currentAddressSummary);
        String permanentAddressSummary = elementsPage.getPermanentAddressSummary();
        System.out.println(permanentAddressSummary);

        softAssert.assertEquals(textNameSummary, "Name:" + config.getProperty("fullName"));
        softAssert.assertEquals(emailSummary, "Email:" + config.getProperty("email"));
        softAssert.assertEquals(currentAddressSummary, "Current Address :" + config.getProperty("currentAddress"));
        softAssert.assertEquals(permanentAddressSummary, "Permananet Address :" + config.getProperty("permanentAddress"));

        softAssert.assertAll();
    }
}
