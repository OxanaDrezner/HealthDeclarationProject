package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.education.*;

public class Base {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    // Page Objects - Web Education
    protected static MainPage educationMain;
    protected static LoginPage educationLogin;
    protected static FormPage educationForm;
    protected static DeclarationPage educationDeclaration;


}
