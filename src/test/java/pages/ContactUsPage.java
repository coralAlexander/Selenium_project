package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import static utils.PropertyReader.getPathToUploadFile;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ContactUsPage extends BasePages {

    private final static String PATH_TO_FILE = getPathToUploadFile();

    @FindBy(css="select[name='id_contact']")
    private WebElement selectSubjectHeading;

    @FindBy(css="select[name='id_order']")
    private WebElement selectOrderReference;

    @FindBy(css="input[type='file']")
    private WebElement attachFile;

    @FindBy(css="textarea[class='form-control']")
    private WebElement fillMessage;

    @FindBy(css="button[type='submit']")
    private WebElement sendEmail;

    @FindBy(css="p[class='alert alert-success']")
    private WebElement emailSendConfirmation;

    public ContactUsPage() {
      super();
    }

    public void selectFromDropDownSubjectHeading(String option){
        Select dropDown = new Select(selectSubjectHeading);
        dropDown.selectByVisibleText(option);
    }

    public void selectDropDownOrderReference(String option){
        Select dropDown = new Select(selectOrderReference);
        wait.until(ExpectedConditions.visibilityOfAllElements(selectOrderReference));
        dropDown.selectByVisibleText(option);
    }

    public void attachFile(String file){
        attachFile.sendKeys(PATH_TO_FILE+file);
    }

    public void fillMessage(String message){
        fillMessage.sendKeys(message);
    }

    public void sendEmail(){
        sendEmail.click();
    }

    public void assertThatMessageWasSentSuccessfully(){
        wait.until(ExpectedConditions.visibilityOfAllElements(emailSendConfirmation));
        assertThat(emailSendConfirmation.getText()).as("Message not sent !").isEqualTo("Your message has been successfully sent to our team.");
    }





}
