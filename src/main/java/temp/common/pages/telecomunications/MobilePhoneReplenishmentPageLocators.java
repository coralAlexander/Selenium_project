package temp.common.pages.telecomunications;

public enum MobilePhoneReplenishmentPageLocators {

    BUTTON_WALLET("//div[contains(text(), 'My wallet')]");

    public String getLocator() {
        return locator;
    }

    private  String locator;

    MobilePhoneReplenishmentPageLocators(String locator) {
        this.locator = locator;
    }


}
