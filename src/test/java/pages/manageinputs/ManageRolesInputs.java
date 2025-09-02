package pages.manageinputs;

import com.microsoft.playwright.Page;

public class ManageRolesInputs {
    private final Page page;
    private final String url = "//button[@data-sidebar='trigger']";
    private final String inputRoleName = "(//button[@type='button'])[7]";
    private final String inputRoleDescription = "//span[text()='Role']";


    public ManageRolesInputs(Page page) {
        this.page = page;
    }

    public void clickRoleInputs() {
        openRolesInputs();
        enterRoleName();
        //deleteRoleDescription();
    }

    public void openRolesInputs() {
        page.click(url);
        page.click(inputRoleName);
        page.click(inputRoleDescription);
    }

    public void enterRoleName() {
        page.locator("//input[@placeholder='Enter role name']").fill("Test Role");
        page.locator("(//button[@data-state='closed'])[17]").click();
        page.locator("//div[text()='Red']").click();
        page.locator("//button[text()='Add Role']").click();
    }

    /*public void deleteRoleDescription() {
        page.locator("").fill("");
    }*/

}
