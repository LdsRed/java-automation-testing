package exercisesTAUniversity;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Chapter3ShiftingContent {

    private WebDriver driver;

    @BeforeAll
    void setup(){
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterAll
    void closePage(){
        driver.close();
    }



    //Tests
    @Test
    void printMenuElementsOnShiftingContentMenuElement() {
        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();
        WebElement exampleOneMenuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        exampleOneMenuElement.click();

        List<WebElement> menuElement = driver.findElements(By.tagName("li"));

        for (WebElement element : menuElement) {
            System.out.println(element.getText());
        }

    }





}
