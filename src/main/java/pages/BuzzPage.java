package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuzzPage extends PageBase {
    By BuzzBtn = By.xpath("(//*[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]");
    By PostBtn = By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--main\"]");
    By InputPost = By.xpath("//*[@class=\"oxd-buzz-post-input\"]");

    public BuzzPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickBuzz(){clickOnElement(BuzzBtn);}
    public void inputPost(String name){
        sendKeys(InputPost,name);
    }
    public void clickPost(){clickOnElement(PostBtn);}




}
