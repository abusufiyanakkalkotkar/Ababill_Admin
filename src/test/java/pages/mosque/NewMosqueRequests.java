
package pages.mosque;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class NewMosqueRequests {
    private final Page page;
    private final String newMosqueRequestsUrl = "//button[@data-sidebar='trigger']";
    private final String mosqueNameInput = "(//button[@type='button'])[4]";
    private final String mosqueTypeDropdown = "//span[text()='New Mosque Requests']";

    public NewMosqueRequests(Page page) {
        this.page = page;
    }

    public void openNewMosqueRequestsPage() {
        navigateToNewMosqueRequestsPage();
        processMosqueProfiles();
    }

    private void navigateToNewMosqueRequestsPage() {
        page.click(newMosqueRequestsUrl);
        page.click(mosqueNameInput);
        page.click(mosqueTypeDropdown);
    }

    private void processMosqueProfiles() {
        String[] mosqueProfiles = {"masjid-ae-bahrat", "sunni Hilal masjid", "sunni Noori masjid"};
        for (String profile : mosqueProfiles) {
            processProfile(profile);
        }
    }

    private void processProfile(String profileName) {
        clickOnProfile(profileName);
        scrollDown(2);
        approveRequest();
        closeModals();
    }

    private void clickOnProfile(String profileName) {
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(profileName))
            .getByRole(AriaRole.BUTTON)
            .click();
    }

    private void scrollDown(int times) {
        for (int i = 0; i < times; i++) {
            page.keyboard().press("PageDown");
        }
    }

    private void approveRequest() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Approve request")).click();
    }

    private void closeModals() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }
}
