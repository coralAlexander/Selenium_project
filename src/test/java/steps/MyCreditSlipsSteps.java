package steps;

import pages.MyCreditSlipsPage;
import pages.HomePage;

public class MyCreditSlipsSteps  {

    private MyCreditSlipsPage myCreditSlipsPage = new MyCreditSlipsPage();
    private HomePage homePage = new HomePage();

    public MyCreditSlipsSteps verifyThatCurrentPageIsMyCreditSlips(String text){
        homePage.scrollDown(0,1000);
        homePage.chooseMyOrders();
        myCreditSlipsPage.verifyThatSectionNameIsCorrect(text);
        return this;
    }
}
