package pages.zakat;

import com.microsoft.playwright.Page;

public class ManageGoldSilverPrices {
    private final Page page;
    private final String goldSilverPricesLink = "//button[@data-sidebar='trigger']";
    private final String goldSilverPricesTable = "(//button[@type='button'])[8]";
    private final String addNewPriceButton = "//span[text()='Manage Gold Silver Prices']";

    public ManageGoldSilverPrices(Page page) {
        this.page = page;
    }

    public void openGoldSilverPrices() {
        openGoldSilverPricesTable();
        addNewGoldSilverPrice();
        addNewGoldSilverPrices();
        closePage();
    }

    public void openGoldSilverPricesTable() {
        page.click(goldSilverPricesLink);
        page.click(goldSilverPricesTable);
        page.click(addNewPriceButton);
    }

    public void addNewGoldSilverPrice() {
        page.locator("//input[@placeholder='24K Gold (per gram)']").fill("780");
        page.locator("//input[@placeholder='18K Gold (per gram)']").fill("580");
        page.locator("//input[@placeholder='22K Gold (per gram)']").fill("750");
        page.locator("//input[@placeholder='14K Gold (per gram)']").fill("550");
        page.locator("//input[@placeholder='Silver price (per ounce)']").fill("6");
    }

    public void addNewGoldSilverPrices(){
        page.locator("//input[@placeholder='24K Gold (per gram)']").fill("7800");
        page.locator("//input[@placeholder='18K Gold (per gram)']").fill("5850");
        page.locator("//input[@placeholder='22K Gold (per gram)']").fill("7150");
        page.locator("//input[@placeholder='14K Gold (per gram)']").fill("4550");
        page.locator("//input[@placeholder='Silver price (per ounce)']").fill("96");
    }

    public void closePage() {
        page.locator("//button[text()='Update Gold Prices']").click();
        page.locator("//button[text()='Update Silver Prices']").click();
    }

}
