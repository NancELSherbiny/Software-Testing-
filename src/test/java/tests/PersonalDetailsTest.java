package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PersonalDetails;

public class PersonalDetailsTest extends TestBase {
     PersonalDetails personalDetailsPage;
     LoginPage loginPage;
     DashboardPage dashboardPage;

    @BeforeMethod
    public void init() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        personalDetailsPage = new PersonalDetails(driver);
    }

    @Test
    public void testPersonalDetails() throws InterruptedException {
        loginPage.fillUserName("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickOnLoginButton();
        Thread.sleep(10000);
        personalDetailsPage.clickMyInfo();
        Thread.sleep(10000);
        personalDetailsPage.fillFirstName("Nancy");
        Thread.sleep(10000);
        personalDetailsPage.fillLastName("EL-Sherbiny");
        Thread.sleep(10000);
        personalDetailsPage.clickSave();
    }
}
