package pages.application;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class Applicationrating {
    private final Page page;
    private final String ratingSelector = "//button[@data-sidebar='trigger']";
    private final String submitSelector = "(//button[@type='button'])[9]";
    private final String errorMessageSelector = "//span[text()='Rate us']";

    public Applicationrating(Page page) {
        this.page = page;
    }

    public void isRatingVisible() {
        rateApplication();
        verifyRatingErrorMessage();
    }

    public void rateApplication() {
        page.click(ratingSelector);
        page.click(submitSelector);
        page.click(errorMessageSelector);
    }

    public void verifyRatingErrorMessage() {
        Locator errorMessage = page.locator("(//button[@data-state=\"closed\"])[18]");
        errorMessage.click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
        Locator errorMessageLocator = page.locator("(//button[@data-state=\"closed\"])[20]");
        errorMessageLocator.click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
        Locator errorMessageLocator2 = page.locator("(//button[@data-state=\"closed\"])[22]");
        errorMessageLocator2.click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }
}
