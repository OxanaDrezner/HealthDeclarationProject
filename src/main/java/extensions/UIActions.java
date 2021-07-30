package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

public class UIActions extends CommonOps {

    @Step("Click on Element")
    public static void click(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Update Text in Element")
    public static void updateText(WebElement elem,String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }
}
