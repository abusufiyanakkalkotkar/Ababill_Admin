
package pages.buisness;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class NewBusinessAdsRequest {
    private final Page page;
    private final String url = "//button[@data-sidebar='trigger']";
    private final String selector = "(//button[@type='button'])[6]";
    private final String inputSelector = "//span[text()='New Ad Request']";

    public NewBusinessAdsRequest(Page page) {
        this.page = page;
    }

    public void submitForm() {
        openNewAdRequest();
        untilPageLoads();
    }

    public void openNewAdRequest() {
        page.click(url);
        page.click(selector);
        page.click(inputSelector);
    }

    private void untilPageLoads() {
        String[] BusinessAds = {"gtfg", "ad name", "Pyament"};
        for (String businessAd : BusinessAds) {
            waitUntilPageLoads(businessAd);
        }
    }

    private void waitUntilPageLoads(String businessAd) {
        clickOnAds(businessAd);
        scrollDown(5);
        approveRequest();
        closeProfile();
    }

    private void clickOnAds(String businessAd) {
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(businessAd)).getByRole(AriaRole.BUTTON).click();
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
