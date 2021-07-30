package pageObjects.education;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeclarationPage {

    @FindBy(xpath="//div[@class='col-md-3 col-sm-12 col-xs-12 mh-align pr-4 ng-star-inserted']/div/i[@class='fa fa-check-circle']")
    private WebElement pic_checkCircle;


    /*
    #########################################################################
    Methods Names: Getter
    Method Description: This Method return WebElement of this Page Class.
    Method Parameters: void
    Method Return Type: WebElement
    #########################################################################
     */

    public WebElement getPic_checkCircle(){
        return pic_checkCircle;
    }
}
