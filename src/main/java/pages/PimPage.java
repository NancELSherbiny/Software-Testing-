package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PimPage extends PageBase {
    By PimBtn = By.xpath("(//*[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[2]");
    By SearchBtn = By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
    By EmpName = By.xpath("(//input[@placeholder=\"Type for hints...\"])[1]");

    public PimPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickPim(){clickOnElement(PimBtn);}
    public void fillEmpName(String name){
        sendKeys(EmpName,name);
    }
    public void clickSearch(){clickOnElement(SearchBtn);}




}
