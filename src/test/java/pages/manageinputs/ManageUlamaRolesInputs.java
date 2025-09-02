package pages.manageinputs;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ManageUlamaRolesInputs {
    private final Page page;
    private final String inputRoleName = "//button[@data-sidebar='trigger']";
    private final String inputRoleDescription = "(//button[@type='button'])[7]";
    private final String buttonSave = "//span[text()='Ulama Roles']";

    public ManageUlamaRolesInputs(Page page) {
        this.page = page;
    }

    public void enterRole() {
        enterRoleName();
        enterRoleDescription();
        deleteButton();
    }

    public void enterRoleName() {
        page.click(inputRoleName);
        page.click(inputRoleDescription);
        page.click(buttonSave);
    }

    public void enterRoleDescription() {
        page.locator("//input[@placeholder='Enter the role name']").fill("Ababill");
        page.locator("//button[@role='combobox']").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Male").setExact(true)).click();
        page.locator("//button[text()='Add ulama role']").click();
    }

    public void deleteButton() {
        page.locator("//input[@placeholder='Search roles...']").fill("Ababill");
        page.locator("(//button[@data-state='closed'])[22]").click();
    }
}
