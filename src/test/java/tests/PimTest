package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PimPage;

public class PimTest extends TestBase {
    PimPage pimPage;
    LoginPage loginPage;

    @BeforeMethod
    public void init() {
        loginPage = new LoginPage(driver);
        pimPage = new PimPage(driver);
    }

    @Test
    public void testPim() throws InterruptedException {
        loginPage.fillUserName("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickOnLoginButton();
        Thread.sleep(10000);
       pimPage.clickPim();
       Thread.sleep(10000);
       pimPage.fillEmpName("joe");
       Thread.sleep(10000);
       pimPage.clickSearch();
       Thread.sleep(10000);
    }
}
