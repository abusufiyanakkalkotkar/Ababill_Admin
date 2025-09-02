
package pages.member;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ExistingMembers {
    private final Page page;
    private final String title = "//button[@data-sidebar='trigger']";
    private final String addMemberLink = "(//button[@type='button'])[5]";
    private final String addMemberModalTitle = "//span[text()='Existing Members']";

    public ExistingMembers(Page page) {
        this.page = page;
    }

    public void openAddMemberModal() {
        page.click(title);
        page.click(addMemberLink);
        page.click(addMemberModalTitle);

        String[] usernames = {"user7382", "user1122", "username9078", "user09272", "yadi", "qwer"};

        for (String username : usernames) {
            processProfile(username);
        }
    }

    private void processProfile(String username) {
        // Click on the profile
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(username)).getByRole(AriaRole.BUTTON).click();

        // Scroll down using PageDown key presses
        page.keyboard().press("PageDown");
        page.keyboard().press("PageDown");
        page.keyboard().press("PageDown");

        // Close the modal
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }
}
