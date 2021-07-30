package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

public class WebEducationFlow extends CommonOps {

    @Step("BOT Flow: Login and fill Health form")
    public static void LoginAndFillHealthForm() {
        UIActions.click(educationMain.getBtn_declare());
        UIActions.click(educationMain.getBtn_login());
        UIActions.updateText(educationLogin.getTxt_username(),getData("Username"));
        UIActions.updateText(educationLogin.getTxt_password(),getData("Password"));
        UIActions.click(educationLogin.getBtn_login());
        UIActions.click(educationForm.getChk_cough());
        UIActions.click(educationForm.getChk_fever());
        wait.until(ExpectedConditions.visibilityOf(educationDeclaration.getPic_checkCircle()));
    }

    @Step("BOT Flow: Create external E-mail message, add attachment and send it to my personal E-mail ")
    public static void CreateEmailWithAttachmentAndSend() throws EmailException {
        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(getData("FilePath"));
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription(getData("AttachmentDescription"));
        attachment.setName(getData("AttachmentName"));
        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName(getData("EmailHostName"));
        email.setSmtpPort(Integer.parseInt(getData("EmailSmtpPort")));
        email.setAuthenticator(new DefaultAuthenticator(getData("EmailAuthenticatorUsername"), getData("EmailAuthenticatorPassword")));
        email.setSSLOnConnect(true);
        email.setFrom(getData("EmailFrom"));
        email.setSubject(getData("EmailSubject"));
        email.setMsg(getData("EmailMsg"));
        email.addTo(getData("EmailAddTo"));
        // add the attachment
        email.attach(attachment);
        // send the email
        email.send();
    }
}
