package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyLeave extends PageBase {
    By LeaveBtn = By.xpath("(//*[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[3]");
    By ApplyBtn = By.xpath("(//*[@class=\"oxd-topbar-body-nav-tab-item\"])[1]");

    public ApplyLeave(WebDriver driver){
       this.driver=driver;
        }

    public void clickLeave(){driver.findElement(LeaveBtn).click();}
    public void clickApply(){driver.findElement(ApplyBtn).click();}


}
