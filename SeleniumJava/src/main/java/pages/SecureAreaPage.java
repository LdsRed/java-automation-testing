package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {


    private By statusAlert = By.id("flash");
    private By logoutButton = By.linkText("Logout");
    private WebDriver driver;


    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }


    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

    public HomePage clickLogoutButton(){
        driver.findElement(logoutButton).click();
        return new HomePage(driver);
    }

}
