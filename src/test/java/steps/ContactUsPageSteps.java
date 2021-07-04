package steps;

import pages.ContactUsPage;

public class ContactUsPageSteps {

    private ContactUsPage contactUsPage = new ContactUsPage();

    public ContactUsPageSteps sendMessage(String option, String order, String message){
        contactUsPage.selectFromDropDownSubjectHeading(option);
        contactUsPage.selectDropDownOrderReference(order);
        contactUsPage.fillMessage(message);
        contactUsPage.sendEmail();
        contactUsPage.assertThatMessageWasSentSuccessfully();
        return this;
    }

}
