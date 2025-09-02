
package pages.trustee;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import java.awt.*;

public class ExistingTrustee {
    private final Page page;
    private final String timeLink = "//button[@data-sidebar='trigger']";
    private final String timeText = "(//button[@type='button'])[1]";
    private final String timeValue = "//span[text()='Existing Trustee']";
    private final String timeValueText = "(//button[@data-state='closed'])[18]";

    public ExistingTrustee(Page page) {
        this.page = page;
    }

    public void clickOnTimeLink() {
        page.click(timeLink);
    }

    public void getTimeText() throws AWTException {
        page.click(timeText);
        page.click(timeValue);
        page.click(timeValueText);

        String[] profiles = {
            "",
            "user2002's profile user2002",
            "thor's profile thor Thor",
            "asdf's profile asdf asdf asdf",
            "username112's profile"
        };

        for (String profile : profiles) {
            processProfile(profile);
        }
    }

    private void processProfile(String profileName) {
        if (!profileName.isEmpty()) {
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(profileName)).getByRole(AriaRole.BUTTON).click();
        }

        // Scroll down to see all the options
        for (int i = 0; i < 3; i++) {
            page.keyboard().press("PageDown");
        }

        // Close the modal
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();

        // Additional PageDown for the last profile
        if (profileName.equals("username112's profile")) {
            page.keyboard().press("PageDown");
        }
    }
}
