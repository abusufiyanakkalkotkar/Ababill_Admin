package pages.manageinputs;

import com.microsoft.playwright.Page;

public class ManageBusinessTypes {
    private final Page page;
    private final String businessTypesTab = "//button[@data-sidebar='trigger']";
    private final String addBusinessTypeButton = "(//button[@type='button'])[7]";
    private final String searchInput = "//span[text()='Business Types']";


    public ManageBusinessTypes(Page page) {
        this.page = page;
    }

    public void searchForBusinessType() {
        openBusinessTypesTab();
        enterSearchTerm();
        verifyBusinessTypeAdded();
    }

    public void openBusinessTypesTab() {
        page.click(businessTypesTab);
        page.click(addBusinessTypeButton);
        page.click(searchInput);
    }

    public void enterSearchTerm() {
        page.locator("//input[@placeholder='Enter business type ']").fill("Business Type");
        page.locator("//button[text()='Add Business Type']").click();
    }

    public void verifyBusinessTypeAdded() {
        page.locator("(//button[@data-state='closed'])[24]").click();
        page.locator("//button[text()='Delete']").click();
    }
}
