package pageObjects.education;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {

    @FindBy(xpath="//input[@class='btn btn-primary float-left bt-pd']")
    private WebElement chk_cough;

    @FindBy(xpath="//input[@class='btn btn-primary float-left bt-pi']")
    private WebElement chk_fever;



    /*
    #########################################################################
    Methods Names: Getters
    Method Description: This Method return WebElements of this Page Class.
    Method Parameters: void
    Method Return Type: WebElement
    #########################################################################
     */

    public WebElement getChk_cough(){
        return chk_cough;
    }

    public WebElement getChk_fever(){
        return chk_fever;
    }
}
