package SeleniumFunctions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class IsDisplayedTest {
    @Test
    public void isDisplayedTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        boolean isTextDisplayed = driver.findElement(By.className("header-hotel-name")).isDisplayed();
        assertTrue(isTextDisplayed);
    }
}
