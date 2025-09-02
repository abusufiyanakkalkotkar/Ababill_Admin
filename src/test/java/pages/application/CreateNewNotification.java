package pages.application;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import java.nio.file.Paths;

public class CreateNewNotification {
    private final Page page;
    private final String titleInputSelector = "//button[@data-sidebar='trigger']";
    private final String contentInputSelector = "(//button[@type='button'])[9]";
    private final String saveButtonSelector = "//span[text()='Push notification']";

    public CreateNewNotification(Page page) {
        this.page = page;
    }

    public void setNotificationTitle() {
        createNotification();
        NotificationCreated();
        //deleteNotificationPage();
    }

    public void createNotification() {
        page.click(titleInputSelector);
        page.click(contentInputSelector);
        page.click(saveButtonSelector);
    }

    public void NotificationCreated() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).setInputFiles(Paths.get("C:\\Users\\User1\\Pictures\\BlueStacks\\Screenshot_2025.08.26_18.47.52.110.png"));
        page.locator("//input[@placeholder='Enter notification title']").fill("notification titleInputSelector");
        page.locator("//input[@placeholder='Enter notification message']").fill("notification");
        page.locator("//input[@placeholder='Enter notification link']").fill("https://notification.com");
        page.locator("//button[text()='Send Notification']").click();
    }

    /*public void deleteNotificationPage() {
        page.locator("//input[@placeholder='Search notifications ...']").fill("notification");
        page.locator("").click();
    }*/
}
