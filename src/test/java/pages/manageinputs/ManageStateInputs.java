
package pages.manageinputs;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;

public class ManageStateInputs {
    private final Page page;
    private final Locator sidebarTrigger;
    private final Locator manageStateInputsTab;
    private final Locator stateInputFields;
    private final Locator stateNameInput;
    private final Locator countryDropdown;
    private final Locator indiaOption;
    private final Locator addStateButton;
    private final Locator filterStatesInput;
    private final Locator stateActionButton;
    private final Locator deleteButton;

    public ManageStateInputs(Page page) {
        this.page = page;
        this.sidebarTrigger = page.locator("//button[@data-sidebar='trigger']");
        this.manageStateInputsTab = page.locator("(//button[@type='button'])[7]");
        this.stateInputFields = page.locator("//span[text()='State']");
        this.stateNameInput = page.locator("//input[@placeholder='Enter state name']");
        this.countryDropdown = page.locator("(//button[@type='button'])[15]");
        this.indiaOption = page.locator("(//div[text()='India'])[1]");
        this.addStateButton = page.locator("//button[text()='Add State']");
        this.filterStatesInput = page.locator("//input[@placeholder='Filter states...']");
        this.stateActionButton = page.locator("(//button[@data-state='closed'])[22]");
        this.deleteButton = page.locator("//button[text()='Delete']");
    }

    public void manageState(String stateName) {
        openManageStateInputsTab();
        addState(stateName);
        deleteState(stateName);
    }

    public void openManageStateInputsTab() {
        sidebarTrigger.click();
        manageStateInputsTab.click();
        stateInputFields.click();
    }

    public void addState(String stateName) {
        stateNameInput.fill(stateName);
        countryDropdown.click();
        indiaOption.click();
        addStateButton.click();
    }

    public void deleteState(String stateName) {
        filterStatesInput.fill(stateName);
        stateActionButton.click();
        deleteButton.click();
    }
}
