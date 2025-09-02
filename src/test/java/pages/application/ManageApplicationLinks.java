package pages.application;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ManageApplicationLinks {
    private final Page page;
    private final String url = "//button[@data-sidebar='trigger']";
    private final String linkTitle = "(//button[@type='button'])[9]";
    private final String linkDescription = "//span[text()='Links']";

    public ManageApplicationLinks(Page page) {
        this.page = page;
    }

    public void navigateToLinksPage() {
        openLinksPage();
        verifyLinksPageTitle();
        deleteLinkAdded();
    }

    public void openLinksPage() {
        page.click(url);
        page.click(linkTitle);
        page.click(linkDescription);
    }

    public void verifyLinksPageTitle() {
        Locator titleLocator = page.locator("//input[@placeholder=\"Enter link title\"]");
        titleLocator.fill("Test Link Title");
        Locator descriptionLocator = page.locator("//input[@placeholder=\"Enter URL\"]");
        descriptionLocator.fill("https://example.com");
        Locator saveButtonLocator = page.locator("//button[text()='Add Link']");
        saveButtonLocator.click();
    }

    public void deleteLinkAdded() {
        Locator deleteLinkLocator = page.locator("//input[@placeholder=\"Filter links...\"]");
        deleteLinkLocator.fill("Test Link Title");
        Locator deleteButtonLocator = page.locator("(//button[@data-state=\"closed\"])[19]");
        deleteButtonLocator.click();
        page.locator("//button[text()='Delete']").click();
    }

}
