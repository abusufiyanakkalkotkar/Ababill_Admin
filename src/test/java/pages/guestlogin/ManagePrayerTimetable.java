package pages.guestlogin;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.TimeoutError;
import com.microsoft.playwright.options.AriaRole;

public class ManagePrayerTimetable {
    private final Page page;
    private static final String SIDEBAR_TRIGGER = "//button[@data-sidebar='trigger']";
    private static final String GUEST_LOGIN_BUTTON = "(//button[@type='button'])[12]";
    private static final String PRAYER_TIMETABLE_LINK = "//span[text()='Prayer Timetable']";

    public ManagePrayerTimetable(Page page){
        this.page = page;
    }

    public void open(){
        openguest();
        timeable();
    }

    public void openguest(){
        try {
            page.waitForSelector(SIDEBAR_TRIGGER).click();
            page.waitForSelector(GUEST_LOGIN_BUTTON).click();
            page.waitForSelector(PRAYER_TIMETABLE_LINK).click();
        } catch (TimeoutError e) {
            throw new RuntimeException("Failed to locate or click prayer timetable elements within timeout", e);
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error during prayer timetable navigation", e);
        }
    }

    public void timeable(){
        try {
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add New Prayer Timetable")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select a city")).click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("EAST GODAVARI")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Start Date *")).click();
            page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("2").setExact(true)).first().click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("End Date *")).click();
            page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("4")).first().click();
            page.locator(".flex.h-9.w-full.cursor-pointer").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("05")).click();
            page.locator("button:nth-child(4)").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("15")).click();
            page.locator("[id=\"«r5p»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("05")).click();
            page.locator("[id=\"«r5p»-form-item\"] > button:nth-child(4)").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("30")).click();
            page.locator("[id=\"«r5v»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("01")).click();
            page.locator("[id=\"«r5v»-form-item\"] > button:nth-child(4)").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("15")).click();
            page.locator("[id=\"«r5v»-form-item\"] > .flex.h-9.cursor-pointer.items-center.justify-between.whitespace-nowrap.rounded-md.border.border-input.bg-transparent.px-3.py-2.text-sm.shadow-xs.ring-offset-background.placeholder\\:text-muted-foreground.focus\\:outline-hidden.focus\\:ring-1.focus\\:ring-ring.disabled\\:cursor-not-allowed.disabled\\:opacity-50.\\[\\&\\>span\\]\\:line-clamp-1.w-20").click();
            page.getByLabel("PM").getByText("PM").click();
            page.locator("[id=\"«r63»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("01")).click();
            page.locator("[id=\"«r63»-form-item\"] > button:nth-child(4)").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("30")).click();
            page.locator("[id=\"«r63»-form-item\"] > .flex.h-9.cursor-pointer.items-center.justify-between.whitespace-nowrap.rounded-md.border.border-input.bg-transparent.px-3.py-2.text-sm.shadow-xs.ring-offset-background.placeholder\\:text-muted-foreground.focus\\:outline-hidden.focus\\:ring-1.focus\\:ring-ring.disabled\\:cursor-not-allowed.disabled\\:opacity-50.\\[\\&\\>span\\]\\:line-clamp-1.w-20").click();
            page.getByLabel("PM").getByText("PM").click();
            page.locator("[id=\"«r69»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("05")).click();
            page.locator("[id=\"«r69»-form-item\"] > button:nth-child(4)").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("15")).click();
            page.locator("[id=\"«r69»-form-item\"] > .flex.h-9.cursor-pointer.items-center.justify-between.whitespace-nowrap.rounded-md.border.border-input.bg-transparent.px-3.py-2.text-sm.shadow-xs.ring-offset-background.placeholder\\:text-muted-foreground.focus\\:outline-hidden.focus\\:ring-1.focus\\:ring-ring.disabled\\:cursor-not-allowed.disabled\\:opacity-50.\\[\\&\\>span\\]\\:line-clamp-1.w-20").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("PM")).click();
            page.locator("[id=\"«r6d»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("05")).click();
            page.locator("[id=\"«r6d»-form-item\"] > button:nth-child(4)").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("30")).click();
            page.locator("[id=\"«r6d»-form-item\"] > .flex.h-9.cursor-pointer.items-center.justify-between.whitespace-nowrap.rounded-md.border.border-input.bg-transparent.px-3.py-2.text-sm.shadow-xs.ring-offset-background.placeholder\\:text-muted-foreground.focus\\:outline-hidden.focus\\:ring-1.focus\\:ring-ring.disabled\\:cursor-not-allowed.disabled\\:opacity-50.\\[\\&\\>span\\]\\:line-clamp-1.w-20").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("PM")).click();
            page.locator("[id=\"«r6j»-form-item\"] > button").first().click();
            page.getByLabel("06").getByText("06").click();
            page.locator("[id=\"«r6j»-form-item\"] > button:nth-child(4)").click();
            page.getByLabel("55").getByText("55").click();
            page.locator("[id=\"«r6j»-form-item\"] > .flex.h-9.cursor-pointer.items-center.justify-between.whitespace-nowrap.rounded-md.border.border-input.bg-transparent.px-3.py-2.text-sm.shadow-xs.ring-offset-background.placeholder\\:text-muted-foreground.focus\\:outline-hidden.focus\\:ring-1.focus\\:ring-ring.disabled\\:cursor-not-allowed.disabled\\:opacity-50.\\[\\&\\>span\\]\\:line-clamp-1.w-20").click();
            page.getByLabel("PM").getByText("PM").click();
            page.locator("[id=\"«r6n»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("07")).click();
            page.locator("[id=\"«r6n»-form-item\"] > .flex.h-9.cursor-pointer.items-center.justify-between.whitespace-nowrap.rounded-md.border.border-input.bg-transparent.px-3.py-2.text-sm.shadow-xs.ring-offset-background.placeholder\\:text-muted-foreground.focus\\:outline-hidden.focus\\:ring-1.focus\\:ring-ring.disabled\\:cursor-not-allowed.disabled\\:opacity-50.\\[\\&\\>span\\]\\:line-clamp-1.w-20").click();
            page.getByLabel("PM").getByText("PM").click();
            page.locator("[id=\"«r6t»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("08")).click();
            page.locator("[id=\"«r6t»-form-item\"] > button:nth-child(4)").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("15")).click();
            page.locator("[id=\"«r6t»-form-item\"] > .flex.h-9.cursor-pointer.items-center.justify-between.whitespace-nowrap.rounded-md.border.border-input.bg-transparent.px-3.py-2.text-sm.shadow-xs.ring-offset-background.placeholder\\:text-muted-foreground.focus\\:outline-hidden.focus\\:ring-1.focus\\:ring-ring.disabled\\:cursor-not-allowed.disabled\\:opacity-50.\\[\\&\\>span\\]\\:line-clamp-1.w-20").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("PM")).click();
            page.locator("[id=\"«r71»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("08")).click();
            page.locator("[id=\"«r71»-form-item\"] > button:nth-child(4)").click();
            page.getByLabel("30").getByText("30").click();
            page.locator("[id=\"«r77»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("05")).click();
            page.locator("[id=\"«r77»-form-item\"] > button:nth-child(4)").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("55")).click();
            page.locator("[id=\"«r7d»-form-item\"] > button").first().click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("06")).click();
            page.locator("[id=\"«r7d»-form-item\"] > button:nth-child(4)").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("55")).click();
            page.locator("[id=\"«r7d»-form-item\"] > .flex.h-9.cursor-pointer.items-center.justify-between.whitespace-nowrap.rounded-md.border.border-input.bg-transparent.px-3.py-2.text-sm.shadow-xs.ring-offset-background.placeholder\\:text-muted-foreground.focus\\:outline-hidden.focus\\:ring-1.focus\\:ring-ring.disabled\\:cursor-not-allowed.disabled\\:opacity-50.\\[\\&\\>span\\]\\:line-clamp-1.w-20").click();
            page.getByLabel("PM").getByText("PM").click();
            page.getByRole(AriaRole.COMBOBOX).filter(new Locator.FilterOptions().setHasText("00")).nth(1).click();
            page.getByLabel("01").getByText("01").click();
            page.locator("[id=\"«r7j»-form-item\"] > .flex.h-9.cursor-pointer.items-center.justify-between.whitespace-nowrap.rounded-md.border.border-input.bg-transparent.px-3.py-2.text-sm.shadow-xs.ring-offset-background.placeholder\\:text-muted-foreground.focus\\:outline-hidden.focus\\:ring-1.focus\\:ring-ring.disabled\\:cursor-not-allowed.disabled\\:opacity-50.\\[\\&\\>span\\]\\:line-clamp-1.w-20").click();
            page.getByLabel("PM").getByText("PM").click();
            page.getByRole(AriaRole.COMBOBOX).filter(new Locator.FilterOptions().setHasText("00")).nth(2).click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("01")).click();
            page.getByRole(AriaRole.COMBOBOX).filter(new Locator.FilterOptions().setHasText("00")).nth(2).click();
            page.getByLabel("30").getByText("30").click();
            page.getByRole(AriaRole.COMBOBOX).filter(new Locator.FilterOptions().setHasText("AM")).nth(4).click();
            page.getByLabel("PM").getByText("PM").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Prayer Timetable")).click();
        }catch (TimeoutError e) {
            throw new RuntimeException("Failed to locate or click prayer timetable elements within timeout", e);
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error during prayer timetable navigation", e);
        }
    }

    public void deletetimeable(){
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Select row ANANTAPUR 2025-06-")).getByRole(AriaRole.BUTTON).nth(2).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
    }
}
