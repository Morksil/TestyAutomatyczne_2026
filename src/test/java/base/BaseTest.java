package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.ConfigReader;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected ConfigReader config;
    protected HomePage homePage;

    @BeforeMethod
    public void setup(){
        config = new ConfigReader();

        String browser = config.getProperty("browser");
        if(browser.equals("chrome")){
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(
                Duration.ofMillis(Integer.parseInt(config.getProperty("durationOfMillis"))));
        homePage = new HomePage(driver);

        System.out.println("BaseTest driver: " + driver);
    }

    @AfterMethod
    public void tearDown(){
        if(Boolean.parseBoolean(config.getProperty("closeBrowser"))) {
            driver.quit();
        }
    }
}
