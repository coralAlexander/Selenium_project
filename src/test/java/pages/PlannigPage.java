package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlannigPage extends Base{

    public PlannigPage() {
        super();
    }

    @FindBy(css = "button[id='btn_add_order']")
    private WebElement addOrderButtonOnListViewPage;
    @FindBy(css = "input[placeholder='* Select Teams..']")
    private WebElement selectTeamsField;
    @FindBy(xpath = "//*[text()='* Where to?']")
    private WebElement whereToField;
    @FindBy(xpath = "//*[text()='To Whom?']")
    private WebElement toWhomField;
    @FindBy(css = "input[id='txt_order_title']")
    private WebElement orderTitle;
    @FindBy(css = "input[id='btn_add_new_order']")
    private WebElement saveOrderButton;
    @FindBy(css = "input[id='wayPointCustomerEmail']")
    private WebElement emailField;
    @FindBy(css = "div[class='group-title']")
    private WebElement ordersNumber;
    @FindBy(css = "input[id='external_id']")
    private WebElement externalId;
    @FindBy(xpath = "//*[text()='Phone?']")
    private WebElement phoneField;
    @FindBy(css = "div[class='group-title']")
    private WebElement numberOfOrders;





    @FindBy(css = "button[id='customize_columns_btn']")
    private WebElement customizeButton;
    @FindBy(css = "button[id='apply_columns_selection']")
    private WebElement applyButton;

    public void pressAddOrderButton(){
      commonActions.click(addOrderButtonOnListViewPage);
    }


   public void fillPhoneField(){
        commonActions.addText(phoneField,"054678900");
       commonActions.enter(phoneField);
   }

   public void fillExternalId(){
        commonActions.addText(externalId,"33333");
        commonActions.enter(externalId);
   }

   public void fillEmail(String email){
        commonActions.addText(emailField,email);
        commonActions.enter(emailField);
   }

   public void fillToWhomField(String toWhom){
       commonActions.addText(toWhomField,toWhom);
       commonActions.enter(toWhomField);
   }

    public void selectTeam(String team){
        commonActions.addText(selectTeamsField,team);
        commonActions.pressEnter(selectTeamsField);
    }

    public void  fillWhereToField(String text){
       commonActions.addText(whereToField,text);
       commonActions.enter(whereToField);
    }

    public void fillOrderTitle(String title){
        commonActions.addText(orderTitle,title);
    }

    public void saveOrder(){
        commonActions.click(saveOrderButton);
        commonActions.threadSleep(3000);
    }

    public void refreshPlanningPage(){
        commonActions.refreshPage();
    }

    public void verifyNumberOfOrders(int numOfOrders){
        verification.assertNumberOfOrder(numberOfOrders,numOfOrders);
    }
}
