
package pages.manageinputs;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;

public class ManageVotingWardInputs {
    private final Page page;
    private final Locator sidebarTrigger;
    private final Locator manageInputsTab;
    private final Locator votingWardButton;
    private final Locator votingWardNameInput;
    private final Locator votingWardCodeInput;
    private final Locator countryDropdown;
    private final Locator indiaOption;
    private final Locator stateDropdown;
    private final Locator andhraPradeshOption;
    private final Locator cityDropdown;
    private final Locator anantapurOption;
    private final Locator addVotingWardButton;
    private final Locator filterInput;
    private final Locator actionButton;
    private final Locator deleteButton;

    public ManageVotingWardInputs(Page page) {
        this.page = page;
        this.sidebarTrigger = page.locator("//button[@data-sidebar='trigger']");
        this.manageInputsTab = page.locator("(//button[@type='button'])[7]");
        this.votingWardButton = page.locator("//span[text()='Voting Ward']");
        this.votingWardNameInput = page.locator("//input[@placeholder='Enter voting ward name']");
        this.votingWardCodeInput = page.locator("//input[@placeholder='Enter voting ward code']");
        this.countryDropdown = page.locator("(//button[@type='button'])[15]");
        this.indiaOption = page.locator("(//div[text()='India'])[1]");
        this.stateDropdown = page.locator("(//button[@type='button'])[16]");
        this.andhraPradeshOption = page.locator("(//div[text()='Andhra Pradesh'])[1]");
        this.cityDropdown = page.locator("(//button[@type='button'])[17]");
        this.anantapurOption = page.locator("(//div[text()='ANANTAPUR'])[1]");
        this.addVotingWardButton = page.locator("(//button[text()='Add Voting Ward'])[1]");
        this.filterInput = page.locator("//input[@placeholder='Filter constituencies...']");
        this.actionButton = page.locator("(//button[@data-state='closed'])[24]");
        this.deleteButton = page.locator("//button[text()='Delete']");
    }

    public void manageVotingWardInputs() {
        openManageVotingWardInputsPage();
        addVotingWard("karvar", "karvar123");
        deleteVotingWard("Karvar");
    }

    private void openManageVotingWardInputsPage() {
        sidebarTrigger.click();
        manageInputsTab.click();
        votingWardButton.click();
    }

    private void addVotingWard(String name, String code) {
        votingWardNameInput.fill(name);
        votingWardCodeInput.fill(code);
        selectCountry();
        selectState();
        selectCity();
        addVotingWardButton.click();
    }

    private void selectCountry() {
        countryDropdown.click();
        indiaOption.click();
    }

    private void selectState() {
        stateDropdown.click();
        andhraPradeshOption.click();
    }

    private void selectCity() {
        cityDropdown.click();
        anantapurOption.click();
    }

    private void deleteVotingWard(String wardName) {
        filterInput.fill(wardName);
        actionButton.click();
        deleteButton.click();
    }
}
