package Testy;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Elements_TextBox extends BaseTest {


    @Test
    public void elementsTextBox_comprehensive(){
        SoftAssert softAssert = new SoftAssert();
        driver.get(config.getProperty("baseURL"));

        String title = driver.getTitle();

        System.out.println(title);

        homePage.enterFullName(config.getProperty("fullName"));
        homePage.enterEmail(config.getProperty("email"));
        homePage.enterCurrentAddress(config.getProperty("currentAddress"));
        homePage.enterPermanentAddress(config.getProperty("permanentAddress"));

        homePage.clickSubmit();

        String textNameSummary = homePage.getTextNameSummary();
        System.out.println(textNameSummary);
        String emailSummary = homePage.getEmailSummary();
        System.out.println(emailSummary);
        String currentAddressSummary = homePage.getCurrentAddressSummary();
        System.out.println(currentAddressSummary);
        String permanentAddressSummary = homePage.getPermanentAddressSummary();
        System.out.println(permanentAddressSummary);

        softAssert.assertEquals(textNameSummary, "Name:" + config.getProperty("fullName"));
        softAssert.assertEquals(emailSummary, "Email:" + config.getProperty("email"));
        softAssert.assertEquals(currentAddressSummary, "Current Address :" + config.getProperty("currentAddress"));
        softAssert.assertEquals(permanentAddressSummary, "Permananet Address :" + config.getProperty("permanentAddress"));

        softAssert.assertAll();
    }
}
