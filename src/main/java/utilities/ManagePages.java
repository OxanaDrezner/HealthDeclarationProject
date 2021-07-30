package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.education.*;

public class ManagePages extends Base {

    /*
    ######################################################################################
    Method Name: initEducation
    Method Description: This Method Initializes elements and return Page Objects
                        of all Page Objects classes referred to Education Application.
    Method Parameters: void
    Method Return Type: void
    ######################################################################################
     */
    public static void initEducation(){
        educationMain = PageFactory.initElements(driver, MainPage.class);
        educationLogin = PageFactory.initElements(driver, LoginPage.class);
        educationForm = PageFactory.initElements(driver, FormPage.class);
        educationDeclaration = PageFactory.initElements(driver, DeclarationPage.class);
    }
}
