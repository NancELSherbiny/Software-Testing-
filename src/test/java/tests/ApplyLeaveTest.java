package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ApplyLeave;
import pages.DashboardPage;
import pages.LoginPage;

public class ApplyLeaveTest extends TestBase{

    LoginPage loginpage;
    ApplyLeave applyLeave;

    @BeforeMethod
    public void init(){
        loginpage = new LoginPage(driver);
        applyLeave = new ApplyLeave(driver);
    }

    @Test
    public void LoginWithValidUsernameAndValidPassword() throws InterruptedException {
        System.out.println(driver);
        loginpage.fillUserName("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickOnLoginButton();
        Thread.sleep(10000);
        //Assert.assertEquals(dashboardPage.ActualResultAssert(),dashboardPage.dashboardText);
        Thread.sleep(10000);
        applyLeave.clickLeave();
        Thread.sleep(10000);
        applyLeave.clickApply();


    }

}
