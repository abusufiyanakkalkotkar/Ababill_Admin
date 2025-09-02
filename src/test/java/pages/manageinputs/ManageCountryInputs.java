
package pages.manageinputs;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.AriaRole;

public class ManageCountryInputs {
    private final Page page;
    private final Locator sidebarTrigger;
    private final Locator countryInputButton;
    private final Locator addCountryButton;
    private final Locator countryNameInput;
    private final Locator isoCodeInput;
    private final Locator countryCodeInput;
    private final Locator addCountrySubmitButton;
    private final Locator viewCountryButton;
    private final Locator editCountryButton;

    public ManageCountryInputs(Page page) {
        this.page = page;
        this.sidebarTrigger = page.locator("//button[@data-sidebar='trigger']");
        this.countryInputButton = page.locator("(//button[@type='button'])[7]");
        this.addCountryButton = page.locator("//span[text()='Country']");
        this.countryNameInput = page.locator("//input[@placeholder='Enter country name']");
        this.isoCodeInput = page.locator("//input[@placeholder='Enter ISO code']");
        this.countryCodeInput = page.locator("//input[@placeholder='Enter country code']");
        this.addCountrySubmitButton = page.locator("//button[text()='Add Country']");
        this.viewCountryButton = page.locator("(//button[@data-state='closed'])[19]");
        this.editCountryButton = page.locator("(//button[@data-state='closed'])[23]");
    }

    public void open() {
        openCountryInputs();
        addCountry();
        viewCountry();
        editCountry("China", "CN", "156");
    }

    public void openCountryInputs() {
        sidebarTrigger.click();
        countryInputButton.click();
        addCountryButton.click();
    }

    public void addCountry(String name, String isoCode, String countryCode) {
        countryNameInput.fill(name);
        isoCodeInput.fill(isoCode);
        countryCodeInput.fill(countryCode);
        addCountrySubmitButton.click();
    }

    public void addCountry() {
        addCountry("Brazil", "BZ", "98");
    }

    public void viewCountry() {
        viewCountryButton.click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }

    public void editCountry(String newName, String newIsoCode, String newCountryCode) {
        editCountryButton.click();

        // Use existing locators with index [1] for edit form (assuming [0] is for add form)
        Locator editCountryNameInput = page.locator("(//input[@placeholder='Enter country name'])[2]");
        Locator editIsoCodeInput = page.locator("(//input[@placeholder='Enter ISO code'])[2]");
        Locator editCountryCodeInput = page.locator("(//input[@placeholder='Enter country code'])[2]");

        editCountryNameInput.clear();
        editCountryNameInput.fill(newName);

        editIsoCodeInput.clear();
        editIsoCodeInput.fill(newIsoCode);

        editCountryCodeInput.clear();
        editCountryCodeInput.fill(newCountryCode);

        page.locator("//button[text()='Edit Country']").click();
    }
}
