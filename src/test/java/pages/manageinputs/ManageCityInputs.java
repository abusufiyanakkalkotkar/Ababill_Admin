
package pages.manageinputs;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;

public class ManageCityInputs {
    private final Page page;
    private final Locator sidebarTrigger;
    private final Locator manageCityInputsTab;
    private final Locator cityInputFields;
    private final Locator cityNameInput;
    private final Locator postalCodeInput;
    private final Locator countryDropdown;
    private final Locator indiaOption;
    private final Locator stateDropdown;
    private final Locator andhraPradeshOption;
    private final Locator addCityButton;
    private final Locator filterCitiesInput;
    private final Locator cityActionButton;
    private final Locator deleteButton;

    public ManageCityInputs(Page page) {
        this.page = page;
        this.sidebarTrigger = page.locator("//button[@data-sidebar='trigger']");
        this.manageCityInputsTab = page.locator("(//button[@type='button'])[7]");
        this.cityInputFields = page.locator("//span[text()='City']");
        this.cityNameInput = page.locator("//input[@placeholder='Enter city name']");
        this.postalCodeInput = page.locator("//input[@placeholder='Enter postal code']");
        this.countryDropdown = page.locator("(//button[@type='button'])[15]");
        this.indiaOption = page.locator("(//div[text()='India'])[1]");
        this.stateDropdown = page.locator("(//button[@type='button'])[16]");
        this.andhraPradeshOption = page.locator("(//div[text()='Andhra Pradesh'])[1]");
        this.addCityButton = page.locator("(//button[text()='Add City'])[1]");
        this.filterCitiesInput = page.locator("//input[@placeholder='Filter cities...']");
        this.cityActionButton = page.locator("(//button[@data-state='closed'])[26]");
        this.deleteButton = page.locator("//button[text()='Delete']");
    }

    public void manageCity() {
        openManageCityInputsTab();
        addCity("Solapur", "413003");
        deleteCity("Solapur");
    }

    public void openManageCityInputsTab() {
        sidebarTrigger.click();
        manageCityInputsTab.click();
        cityInputFields.click();
    }

    public void addCity(String cityName, String postalCode) {
        cityNameInput.fill(cityName);
        postalCodeInput.fill(postalCode);
        countryDropdown.click();
        indiaOption.click();
        stateDropdown.click();
        andhraPradeshOption.click();
        addCityButton.click();
    }

    public void deleteCity(String cityName) {
        filterCitiesInput.fill(cityName);
        cityActionButton.click();
        deleteButton.click();
    }
}
