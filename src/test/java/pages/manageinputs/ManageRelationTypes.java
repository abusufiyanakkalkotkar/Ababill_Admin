package pages.manageinputs;

import com.microsoft.playwright.Page;

public class ManageRelationTypes {
    private final Page page;
    private final String url = "//button[@data-sidebar='trigger']";
    private final String title = "(//button[@type='button'])[7]";
    private final String inputLabel = "//span[text()='Relation Types']";

    public ManageRelationTypes(Page page) {
        this.page = page;
    }

    public void openRelation() {
        clickManageRelationTypes();
        verifyPageTitle();
        verifyRelationTypeAdded();
    }
    public void clickManageRelationTypes() {
        page.click(url);
        page.click(title);
        page.click(inputLabel);
    }

    public void verifyPageTitle() {
        page.locator("//input[@placeholder='Enter relation type ']").fill("Relation");
        page.locator("//button[text()='Add Relation Type']").click();
    }

    public void verifyRelationTypeAdded() {
        page.locator("//input[@placeholder='Filter relation types...']").fill("Relation");
        page.locator("(//button[@data-state='closed'])[20]").click();
    }

}
