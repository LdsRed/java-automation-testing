package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage {


    private By userNameField = By.id("username");
    private By pasword = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    public void setName(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void setPasword(String password){
        driver.findElement(pasword).sendKeys(password);
    }

    public SecureAreaPage clickButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }


}
