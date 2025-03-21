package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
    public static WebDriver driver;

    @BeforeMethod
    public void openBrowser() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       System.out.println(driver.getCurrentUrl());
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
