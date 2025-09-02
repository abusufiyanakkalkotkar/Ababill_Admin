
package pages.imam;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ExistingImams {
    private final Page page;
    private final String timeLink = "//button[@data-sidebar='trigger']";
    private final String timeText = "(//button[@type='button'])[2]";
    private final String existingImam = "//span[text()='Existing Imams']";

    public ExistingImams(Page page) {
        this.page = page;
    }

    public void openTimeSlot() {
        navigateToExistingImams();
        openImamProfile("user988");
        scrollDown(3);
        closeProfile();
    }

    private void navigateToExistingImams() {
        page.click(timeLink);
        page.click(timeText);
        page.click(existingImam);
    }

    private void openImamProfile(String imamName) {
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(imamName)).getByRole(AriaRole.BUTTON).click();
    }

    private void scrollDown(int times) {
        for (int i = 0; i < times; i++) {
            page.keyboard().press("PageDown");
        }
    }

    private void closeProfile() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }
}
