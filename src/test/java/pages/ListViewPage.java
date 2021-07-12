package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListViewPage extends Base{

    public ListViewPage() {
        super();
    }

    @FindBy(css = "button[id='btn_add_order']")
    private WebElement addOrderButtonOnListViewPage;
    @FindBy(css = "input[placeholder='* Select Teams..']")
    private WebElement selectTeamsField;
    @FindBy(xpath = "//*[text()='* Where to?']")
    private WebElement whereToField;
    @FindBy(css = "input[id='txt_order_title']")
    private WebElement orderTitle;
    @FindBy(css = "input[id='btn_add_new_order']")
    private WebElement saveOrderButton;
    @FindBy(css = "div[class='group-title']")
    private WebElement ordersNumber;
    @FindBy(css = "li[id='column_nextStop']")
    private WebElement nextStopColumn;
    @FindBy(css = "li[id='column_taskProgress']")
    private WebElement progressColumn;
    @FindBy(xpath = "//li[@id='column_nextStop']/span[@class='glyphicon glyphicon-option-vertical pull-right drag-handler ui-sortable-handle']")
    private WebElement nextsGlypthicon;



    @FindBy(css = "button[id='customize_columns_btn']")
    private WebElement customizeButton;
    @FindBy(css = "button[id='apply_columns_selection']")
    private WebElement applyButton;

    public void pressAddOrderButton(){
      commonActions.click(addOrderButtonOnListViewPage);
    }

    public void selectTeam(String team){
        commonActions.addText(selectTeamsField,team);
        commonActions.pressEnter(selectTeamsField);
    }

    public void  fillWhereToField(String text){
        commonActions.click(whereToField);
        commonActions.addTextJavaScrip(whereToField,text);
    }

    public void fillOrderTitle(String title){
        commonActions.addText(orderTitle,title);
    }

    public void saveOrder(){
        commonActions.click(saveOrderButton);
    }

    public void verifyNumberOfOrders(int orderNum){
        verification.assertNumberOfOrder(ordersNumber,orderNum);
    }

    public void dragAndDrop(){
       commonActions.dragAndDrop(nextsGlypthicon,progressColumn);
    }
    public void pressCustomizeButton(){
        commonActions.click(customizeButton);
    }

    public void pressApplyButton(){
        commonActions.click(applyButton);
    }



}
