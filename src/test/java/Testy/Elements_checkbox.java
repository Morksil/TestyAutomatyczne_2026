package Testy;

import base.BaseTest;
import org.testng.annotations.Test;

public class Elements_checkbox extends BaseTest {
    long sleepTime = 1000;
    @Test
    public void elementsCheckbox_positiveTest() throws InterruptedException {
        driver.get(config.getProperty("elementsCheckboxURL"));


        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickHomeCheckbox();
        }

        Thread.sleep(sleepTime);
        elementsPage.clickHomeCheckboxExpand();

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickDesktopCheckbox();
        }

        Thread.sleep(sleepTime);
        elementsPage.clickDesktopCheckboxExpand();

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickNotesCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickCommandsCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickDocumentsCheckbox();
        }

        Thread.sleep(sleepTime);
        elementsPage.clickDocumentsCheckboxExpand();

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickWorkspaceCheckbox();
        }

        Thread.sleep(sleepTime);
        elementsPage.clickWorkspaceCheckboxExpand();

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickReactCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickAngularCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickVeuCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickOfficeCheckbox();
        }

        Thread.sleep(sleepTime);
        elementsPage.clickOfficeCheckboxExpand();

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickPublicCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickPrivateCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickClassifiedCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickGeneralCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickDownloadsCheckbox();
        }

        Thread.sleep(sleepTime);
        elementsPage.clickDownloadsCheckboxExpand();

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickWordFileCheckbox();
        }

        for(int i=0; i<2; i++){
            Thread.sleep(sleepTime);
            elementsPage.clickExcelFileCheckbox();
        }

    }
}
