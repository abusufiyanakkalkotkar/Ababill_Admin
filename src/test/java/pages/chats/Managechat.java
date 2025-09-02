package pages.chats;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class Managechat {
    private final Page page;
    public static final String CHAT_MANAGE_PAGE_URL = "//button[@data-sidebar='trigger']";
    public static final String CHAT_MANAGE_PAGE_HEADER = "//span[text()='Chats']";

    public Managechat(Page page) {
        this.page = page;
    }

    public void verifyChatManagePage() {
        open();
        ViewChat();
    }

    public void open() {
        page.click(CHAT_MANAGE_PAGE_URL);
        page.click(CHAT_MANAGE_PAGE_HEADER);
    }

    public void ViewChat() {
        page.click("(//button[@data-state=\"closed\"])[18]");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
        page.click("(//button[@data-state=\"closed\"])[19]");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
        page.click("(//button[@data-state=\"closed\"])[20]");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
        page.click("(//button[@data-state=\"closed\"])[21]");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    }

}
