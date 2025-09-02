
package pages.ulama;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class NewUlamaRequest {
    private final Page page;
    private final String url = "//button[@data-sidebar='trigger']";
    private final String newUlamaButton = "(//button[@type='button'])[3]";
    private final String nameInput = "//span[text()='New Ulama Requests']";

    public NewUlamaRequest(Page page) {
        this.page = page;
    }

    public void openNewUlamaRequest() {
        navigateToNewUlamaRequestPage();
        processUlamaProfiles();
    }

    private void navigateToNewUlamaRequestPage() {
        page.click(url);
        page.click(newUlamaButton);
        page.click(nameInput);
    }

    private void processUlamaProfiles() {
        String[] profiles = {"salman", "salim", "salam"};
        for (String profile : profiles) {
            processProfile(profile);
        }
    }

    private void processProfile(String profileName) {
        // Click on profile
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(profileName))
            .getByRole(AriaRole.BUTTON)
            .click();

        // Scroll down to see all the options
        scrollDown(4);

        // Close the modal
        closeModal();
    }

    private void scrollDown(int times) {
        for (int i = 0; i < times; i++) {
            page.keyboard().press("PageDown");
        }
    }

    private void closeModal() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }
}
