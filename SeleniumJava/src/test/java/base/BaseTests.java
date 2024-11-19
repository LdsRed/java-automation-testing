package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTests {

    private WebDriver driver;

    @AfterAll
    void closeBrowser(){
        driver.close();
    }

    @Test
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ldsred.github.io/wdd231/");

        driver.manage().window().fullscreen();
        System.out.println(driver.getTitle());
    }



}
