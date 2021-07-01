package temp.common.pages.loans;

public enum CarLoansPageLocators {

    TAB_AGREEMENTS("//div[contains(text(),'Agreements')]");

    private final String locator;

    CarLoansPageLocators(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}
