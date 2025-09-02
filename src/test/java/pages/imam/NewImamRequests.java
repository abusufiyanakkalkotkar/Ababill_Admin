
package pages.imam;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class NewImamRequests {
    private final Page page;
    private final String imamRequestsPageUrl = "//button[@data-sidebar='trigger']";
    private final String imamRequestsPageTitle = "(//button[@type='button'])[2]";
    private final String newImamRequestButton = "//span[text()='New Imam Requests']";

    public NewImamRequests(Page page) {
        this.page = page;
    }

    public void navigateToPage() {
        openNewImamRequestsPage();
        processImamProfiles();
    }

    private void openNewImamRequestsPage() {
        page.click(imamRequestsPageUrl);
        page.click(imamRequestsPageTitle);
        page.click(newImamRequestButton);
    }

    private void processImamProfiles() {
        String[] imamNames = {"salma", "Zeeshan", "sofia", "samim"};
        for (String imamName : imamNames) {
            processImamProfile(imamName);
        }
    }

    private void processImamProfile(String imamName) {
        clickOnProfile(imamName);
        scrollDown(5);
        approveRequest();
        closeProfile();
    }

    private void clickOnProfile(String imamName) {
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(imamName)).getByRole(AriaRole.BUTTON).click();
    }

    private void scrollDown(int times) {
        for (int i = 0; i < times; i++) {
            page.keyboard().press("PageDown");
        }
    }

    private void approveRequest() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Approve request")).click();
    }

    private void closeProfile() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }
}
