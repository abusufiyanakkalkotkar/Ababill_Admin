
package pages.trustee;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class NewTrusteeRequests {
    private final Page page;
    private final String requestsTab = "//button[@data-sidebar='trigger']";
    private final String newRequestButton = "(//button[@type='button'])[1]";
    private final String nameInput = "//span[text()='New Trustee Requests']";

    public NewTrusteeRequests(Page page) {
        this.page = page;
    }

    public void navigateTo() {
        page.click(requestsTab);
        page.click(newRequestButton);
        page.click(nameInput);

        String[] profiles = {
            "undefined's profile Shahrukh",
            "undefined's profile neon neon",
            "undefined's profile sanoya",
            "undefined's profile yusuf"
        };

        for (String profile : profiles) {
            processProfile(profile);
        }
    }

    private void processProfile(String profileName) {
        // Click on profile
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(profileName)).getByRole(AriaRole.BUTTON).click();

        // Scroll down to see all the options
        int scrollCount = profileName.equals("undefined's profile neon neon") ? 5 : 4;
        for (int i = 0; i < scrollCount; i++) {
            page.keyboard().press("PageDown");
        }

        // Click on 'Add Trustee'
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Approve request")).click();

        // Close the modal
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }
}
