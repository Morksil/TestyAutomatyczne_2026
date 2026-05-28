package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
        System.out.println("BasePage driver: " + driver);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void type(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void clearInput(By locator){
        driver.findElement(locator).clear();
    }

    public boolean isEmptyValueAttribute(String attribute, By locator){
        String value = driver.findElement(locator).getAttribute(attribute);
        if (value.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    public boolean isEnabled(By locator){
        return driver.findElement(locator).isEnabled();
    }

    public boolean isSelected(By locator){
        return driver.findElement(locator).isSelected();
    }

    public boolean isDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }
}
