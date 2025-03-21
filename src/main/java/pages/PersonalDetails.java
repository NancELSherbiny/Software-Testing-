package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalDetails extends PageBase {

    By MyInfo = By.xpath("(//*[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]");
    By firstNameField = By.xpath("//*[@class=\"oxd-input oxd-input--active orangehrm-firstname\"]");
    By lastNameField = By.xpath("//*[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]");
    //By licenseExpiryDateField = By.xpath("//*[@name='licenseExpiryDate']");
    By saveButton = By.xpath("(//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"])[1]");

    public PersonalDetails(WebDriver driver) {
        super(driver);
    }

    public void clickMyInfo(){driver.findElement(MyInfo).click();}

    public void fillFirstName(String name){
        clearField(firstNameField);
        sendKeys(firstNameField,name);
    }
    public void fillLastName(String name){
        clearField(lastNameField);
        sendKeys(lastNameField,name);
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }
}
