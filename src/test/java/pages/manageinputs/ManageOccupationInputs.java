package pages.manageinputs;

import com.microsoft.playwright.Page;

public class ManageOccupationInputs {
    private final Page page;
    private final String occupationInputSelector = "//button[@data-sidebar='trigger']";
    private final String occupationInputFieldSelector = "(//button[@type='button'])[7]";
    private final String occupationInputText = "//span[text()='Occupation']";

    public ManageOccupationInputs(Page page) {
        this.page = page;
    }

    public void openOccupation() {
        openOccupationInput();
        addOccupation();
    }

    public void openOccupationInput() {
        page.click(occupationInputSelector);
        page.click(occupationInputFieldSelector);
        page.click(occupationInputText);
    }

    public void addOccupation() {
        page.locator("//input[@placeholder='Enter occupation name']").fill("Software Engineer");
        page.locator("//button[text()='Add Occupation']").click();
        page.locator("(//button[@data-state='closed'])[33]").click();
        page.locator("//button[text()='Delete']").click();
    }


}
