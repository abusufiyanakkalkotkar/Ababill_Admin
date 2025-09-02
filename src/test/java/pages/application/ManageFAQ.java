package pages.application;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ManageFAQ {
    private final Page page;
    private final String faqLink = "//button[@data-sidebar='trigger']";
    private final String addNewQuestionLink = "(//button[@type='button'])[9]";
    private final String searchInput = "//span[text()='FAQ']";

    public ManageFAQ(Page page) {
        this.page = page;
    }

    public void searchFAQ() {
        open();
        isSearchInputVisible();
        deleteFAQAdded();
    }

    public void open() {
        page.click(faqLink);
        page.click(addNewQuestionLink);
        page.click(searchInput);
    }

    public void isSearchInputVisible() {
        Locator sa = page.locator("//input[@placeholder='Enter the faq question.']");
        sa.fill("Test Question");
        Locator sa2 = page.locator("//input[@placeholder='Enter the faq answer']");
        sa2.fill("Test Answer");
        Locator sa3 = page.locator("//button[text()='Add FAQ']");
        sa3.click();
    }

    public void deleteFAQAdded() {
        Locator aa = page.locator("//input[@placeholder=\"Filter FAQ's...\"]");
        aa.fill("Test Question");
        Locator aa2 = page.locator("(//button[@data-state=\"closed\"])[21]");
        aa2.click();
        Locator aa3 = page.locator("//button[text()='Delete']");
        aa3.click();
    }
}
