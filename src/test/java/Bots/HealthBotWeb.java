package Bots;

import io.qameta.allure.Description;
import org.apache.commons.mail.EmailException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonMethods;
import utilities.CommonOps;
import workflows.WebEducationFlow;

import java.io.IOException;

@Listeners(utilities.Listeners.class)
public class HealthBotWeb extends CommonOps {

    @Test(description = "BOT01 - Send Health Declaration to my E-mail")
    @Description("This bot logs in to Education site, fills Health form and sends it to my E-mail every morning")
    public void BOT01_sendHealthDeclarationForm() throws IOException, EmailException {
        WebEducationFlow.LoginAndFillHealthForm();
        CommonMethods.takeSnapShot(getData("FilePath"));
        WebEducationFlow.CreateEmailWithAttachmentAndSend();
    }
}
