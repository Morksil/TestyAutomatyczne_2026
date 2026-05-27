package Testy;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Elements_radioButton extends BaseTest {
    long sleepTime = 1000;
    @Test
    public void elementsRadioButton_positiveTest() throws InterruptedException {
        SoftAssert softAssertAvailability = new SoftAssert();
        SoftAssert softAssertSelection = new SoftAssert();
        driver.get(config.getProperty("elementsRadioButtonURL"));

        boolean yesRadioButtonAvailability = elementsPage.yesRadioButtonAvailability();
        boolean noRadioButtonAvailability = elementsPage.noRadioButtonAvailability();
        boolean impressiveRadioButtonAvailability = elementsPage.impressiveRadioButtonAvailability();

        System.out.println("Radio Button Yes: " + yesRadioButtonAvailability);
        System.out.println("Radio Button No: " + noRadioButtonAvailability);
        System.out.println("Radio Button Impressive: " + impressiveRadioButtonAvailability);

        softAssertAvailability.assertEquals(yesRadioButtonAvailability, true);
        softAssertAvailability.assertEquals(noRadioButtonAvailability, false);
        softAssertAvailability.assertEquals(impressiveRadioButtonAvailability, true);

        softAssertAvailability.assertAll();

        Thread.sleep(sleepTime);
        elementsPage.clickYesRadioButton();
        System.out.println("Yes Radio Button selected");

        boolean yesRadioButtonSelection = elementsPage.yesRadioButtonIsSelected();
        boolean noRadioButtonSelection = elementsPage.noRadioButtonIsSelected();
        boolean impressiveRadioButtonSelection = elementsPage.impressiveRadioButtonIsSelected();

        System.out.println("Radio button Yes selected: " + yesRadioButtonSelection);
        System.out.println("Radio button No selected: " + noRadioButtonSelection);
        System.out.println("Radio button Impressive selected: " + impressiveRadioButtonSelection);

        softAssertSelection.assertEquals(yesRadioButtonSelection, true);
        softAssertSelection.assertEquals(noRadioButtonSelection, false);
        softAssertSelection.assertEquals(impressiveRadioButtonSelection, false);

        Thread.sleep(sleepTime);
        elementsPage.clickImpressiveRadioButton();
        System.out.println("Impressive Radio Button selected");

        System.out.println("Radio button Yes selected: " + yesRadioButtonSelection);
        System.out.println("Radio button No selected: " + noRadioButtonSelection);
        System.out.println("Radio button Impressive selected: " + impressiveRadioButtonSelection);

        yesRadioButtonSelection = elementsPage.yesRadioButtonIsSelected();
        noRadioButtonSelection = elementsPage.noRadioButtonIsSelected();
        impressiveRadioButtonSelection = elementsPage.impressiveRadioButtonIsSelected();

        softAssertSelection.assertEquals(yesRadioButtonSelection, false);
        softAssertSelection.assertEquals(noRadioButtonSelection, false);
        softAssertSelection.assertEquals(impressiveRadioButtonSelection, true);


        softAssertSelection.assertAll();

    }
}
