
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

import java.sql.Driver;
import java.time.Duration;

public class seleniumtest {
    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationintesting.com/selenium/testpage/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span)[5]")));
        String text = ele.getAttribute("textContent");
        System.out.println(text);
        driver.quit();

    }

}
