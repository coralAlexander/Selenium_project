package temp.tests.telecomunication.positive;

import org.testng.annotations.Test;
import temp.tests.base.BaseTest;

import static temp.common.constans.Constant.MobileReplenishmentTestData.*;
import static temp.common.constans.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentPositivePageTest extends BaseTest {


    @Test
    public void checkIsRedirectToAuth() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplenishmentAmount() {
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("A")
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCardCvv(MOBILE_PAYMENT_CARD_CVV)
                .submitToTheCard();

    }
}
