package pages.buisness;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class NewBusinessRequest {
    private final Page page;
    private final String url = "//button[@data-sidebar='trigger']";
    private final String title = "(//button[@type='button'])[6]";
    private final String name = "//span[text()='New Business Request']";


    public NewBusinessRequest(Page page) {
        this.page = page;
    }

    public void navigateToBusiness() {
        clickNewBusinessRequestButton();
        waitUntilPageLoads();
    }

    public void clickNewBusinessRequestButton() {
        page.click(url);
        page.click(title);
        page.click(name);
    }

    private void waitUntilPageLoads() {
        String[] BusinessNames = {"Dairy Farming", "Crop Production", "Clothing & Apparel Retail", "Poultry Farming"};
        for (String busName : BusinessNames) {
            waitUntilPageLoad(busName);
        }
    }

    private void waitUntilPageLoad(String busName) {
        clickOnProfiles(busName);
        scrollDown(5);
        approveRequest();
        closeProfile();
    }

    private void clickOnProfiles(String busName) {
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(busName)).getByRole(AriaRole.BUTTON).click();
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
