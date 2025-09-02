package pages.manageinputs;

import com.microsoft.playwright.Page;

public class ManageZakatQuestionInputs {
    private final Page page;
    private final String questionType = "//button[@data-sidebar='trigger']";
    private final String questionDescription = "(//button[@type='button'])[7]";
    private final String questionTitle = "//span[text()='Zakat Questions']";

    public void ManageZakat() {
        clickQuestionType();
        clickQuestionTitle();
        deleteZakatQuestion();
    }

    public ManageZakatQuestionInputs(Page page) {
        this.page = page;
    }
    public void clickQuestionType() {
        page.click(questionType);
        page.click(questionDescription);
        page.click(questionTitle);
    }
    public void clickQuestionTitle() {
        page.locator("//input[@placeholder='Enter your zakat-related question']").fill("Test Question");
        page.locator("//button[text()='Add zakat question ']").click();
    }
    public void deleteZakatQuestion() {
        page.locator("(//button[@data-state='closed'])[39]").click();
        page.locator("//button[text()='Delete']").click();
    }
}
