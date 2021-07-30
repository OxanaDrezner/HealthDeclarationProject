package pageObjects.education;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id="HIN_USERID")
    private WebElement txt_username;

    @FindBy(id="Ecom_Password")
    private WebElement txt_password;

    @FindBy(id="loginButton2")
    private WebElement btn_login;



    /*
    #########################################################################
    Methods Names: Getters
    Method Description: This Method return WebElements of this Page Class.
    Method Parameters: void
    Method Return Type: WebElement
    #########################################################################
     */

    public WebElement getTxt_username(){
        return txt_username;
    }

    public WebElement getTxt_password(){
        return txt_password;
    }

    public WebElement getBtn_login(){
        return btn_login;
    }
}
