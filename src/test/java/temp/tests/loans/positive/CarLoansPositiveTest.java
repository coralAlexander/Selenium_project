package temp.tests.loans.positive;
import org.testng.annotations.Test;
import temp.tests.base.BaseTest;

import static temp.common.constans.Constant.Urls.CAR_LOANS_URL;

public class CarLoansPositiveTest extends BaseTest {

   @Test
    public void selectAgreementsTabInPublicSession(){
        basePage.goToUrl(CAR_LOANS_URL);
        carLoans.selectAgreementsTab();
        basePage.isAuthWidgetPresent();
    }
}
