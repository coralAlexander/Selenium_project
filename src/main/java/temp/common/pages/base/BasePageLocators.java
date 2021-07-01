package temp.common.pages.base;

public enum BasePageLocators {
    AUTH_WIDGET("//iframe[@src='https://login-widget.privat24.ua/']");

    private final String locator;

    BasePageLocators(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }


}
