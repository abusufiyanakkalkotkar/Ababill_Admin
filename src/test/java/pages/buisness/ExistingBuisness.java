
package pages.buisness;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ExistingBuisness {
    private final Page page;
    private static final String SIDEBAR_TRIGGER = "//button[@data-sidebar='trigger']";
    private static final String EXISTING_BUSINESS_TAB = "(//button[@type='button'])[6]";
    private static final String EXISTING_BUSINESSES_BUTTON = "//span[text()='Existing Businesses']";

    public ExistingBuisness(Page page) {
        this.page = page;
    }

    public void processExistingBusinesses() {
        navigateToExistingBusinessesPage();
        String[] businessProfiles = {
            "sk farm's profile sk farm",
           /* "ABT's profile ABT IT Services",
            "textbooks 's profile",
            "lkjlkjlkjlk's profile"*/
        };
        
        for (String profile : businessProfiles) {
            openBusinessProfile(profile);
        }
        
        scrollDown(3);
        closeProfile();
    }

    private void navigateToExistingBusinessesPage() {
        page.click(SIDEBAR_TRIGGER);
        page.click(EXISTING_BUSINESS_TAB);
        page.click(EXISTING_BUSINESSES_BUTTON);
    }

    private void openBusinessProfile(String businessName) {
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(businessName))
            .getByRole(AriaRole.BUTTON)
            .click();
    }

    private void scrollDown(int count) {
        for (int i = 0; i < count; i++) {
            page.keyboard().press("PageDown");
        }
    }

    private void closeProfile() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }
}
