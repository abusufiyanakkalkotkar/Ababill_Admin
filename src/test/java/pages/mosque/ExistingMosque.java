package pages.mosque;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import java.nio.file.Paths;

public class ExistingMosque {
    private final Page page;
    private final String urll = "//button[@data-sidebar='trigger']";
    private final String mosqueName = "(//button[@type='button'])[4]";
    private final String mosqueAddress = "//span[text()='Existing Mosques']";

    public ExistingMosque(Page page) {
        this.page = page;
    }
    public void openExistingMosque() {
        page.click(urll);
        page.click(mosqueName);
        page.click(mosqueAddress);

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add New Mosque")).click();
        //page.locator("input[name=\"profile_image\"]").click();
        page.locator("input[name=\"profile_image\"]").setInputFiles(Paths.get("C:\\Users\\User1\\Pictures\\Screenshots\\Screenshot 2025-08-20 115537.png"));
        //page.locator("input[name=\"banner_image\"]").click();
        page.locator("input[name=\"banner_image\"]").setInputFiles(Paths.get("C:\\Users\\User1\\Pictures\\Screenshots\\Screenshot 2025-08-20 115537.png"));
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mosque Name")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mosque Name")).fill("Seerat Nagar Masjid");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select a country")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("India")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select a state")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Delhi")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select a city")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("NEW")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select a voting ward")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("CANTT")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Latitude")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Latitude")).fill("100.876.987");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Longitude")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Longitude")).fill("108.987.456");
        page.getByRole(AriaRole.COMBOBOX).filter(new Locator.FilterOptions().setHasText("Hour")).first().click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("06")).click();
        page.getByRole(AriaRole.COMBOBOX).filter(new Locator.FilterOptions().setHasText("Minute")).first().click();
        page.getByLabel("03").getByText("03").click();
        page.getByRole(AriaRole.COMBOBOX).filter(new Locator.FilterOptions().setHasText("Hour")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("09")).click();
        page.getByRole(AriaRole.COMBOBOX).filter(new Locator.FilterOptions().setHasText("Minute")).click();
        page.getByLabel("05").getByText("05").click();
        page.getByRole(AriaRole.COMBOBOX).filter(new Locator.FilterOptions().setHasText("AM")).nth(1).click();
        page.getByLabel("PM").getByText("PM").click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Postal Code")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Postal Code")).fill("413987");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Street Address")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Street Address")).fill("Seerat nagar masjid near hotgi road");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Contact Number")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Contact Number")).fill("9021598879");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Short Description")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Short Description")).fill("Seerat nagar arabi madarasa and quran hub ");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Mosque")).click();
    }

}
