package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BuzzPage;
import pages.LoginPage;


public class BuzzTest extends TestBase {
    BuzzPage buzzPage;
    LoginPage loginPage;

    @BeforeMethod
    public void init() {
        loginPage = new LoginPage(driver);
        buzzPage = new BuzzPage(driver);
    }

    @Test
    public void testPim() throws InterruptedException {
        loginPage.fillUserName("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickOnLoginButton();
        Thread.sleep(10000);
        buzzPage.clickBuzz();
        Thread.sleep(10000);
        buzzPage.inputPost("Hey, this is a test");
        Thread.sleep(10000);
        buzzPage.clickPost();
        Thread.sleep(10000);
    }
}
