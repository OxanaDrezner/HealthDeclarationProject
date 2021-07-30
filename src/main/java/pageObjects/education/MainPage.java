package pageObjects.education;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath="//input[@class='btn btn-primary bt-pd-b']")
    private WebElement btn_declare;

    @FindBy(xpath="//div[@class='user-pass-login login-box pull-left hidden-xs unselected-login']")
    private WebElement btn_login;



    /*
    #########################################################################
    Methods Names: Getters
    Method Description: This Method return WebElements of this Page Class.
    Method Parameters: void
    Method Return Type: WebElement
    #########################################################################
     */

    public WebElement getBtn_declare(){
        return btn_declare;
    }

    public WebElement getBtn_login(){
        return btn_login;
    }
}
