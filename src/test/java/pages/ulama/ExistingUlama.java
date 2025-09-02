
package pages.ulama;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ExistingUlama {
    private final Page page;
    private final String ulamaUrl = "//button[@data-sidebar='trigger']";
    private final String ulamaTitle = "(//button[@type='button'])[3]";
    private final String ulamaText = "//span[text()='Existing Ulamas']";

    public ExistingUlama(Page page) {
        this.page = page;
    }

    public void openUlamaPage() {
        navigateToUlamaPage();
        processUlamaProfile("love");
    }

    private void navigateToUlamaPage() {
        page.click(ulamaUrl);
        page.click(ulamaTitle);
        page.click(ulamaText);
    }

    private void processUlamaProfile(String profileName) {
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
