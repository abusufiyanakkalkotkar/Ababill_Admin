package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.application.ManageApplicationLinks;
import pages.guestlogin.ManagePrayerTimetable;
import pages.login.LoginPage;

public class GuestLogin extends BaseTest {
    @Test
    public void guestLogin() {
        LoginPage loginPage = new LoginPage(page);
        ManagePrayerTimetable managePrayerTimetable = new ManagePrayerTimetable(page);

        // TODO: Implement the assertions and error handling for the login test
        test.info("Navigating to the login page");
        page.navigate("https://admin.ababillapp.online/");

        //TODO : Implement the login flow and assertions
        test.info("Adding username and password");
        loginPage.addUsername("test_o1@gmail.com");
        loginPage.addPassword("Admin@test123");

        //TODO: Implement the assertion for successful login
        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        // TODO: Implement the assertions for Guest inputs
        managePrayerTimetable.open();
    }
}
