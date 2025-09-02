package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import pages.mosque.ExistingMosque;
import pages.mosque.NewMosqueRequests;

public class Mosque extends BaseTest {
    @Test
    public void testMosque() {
        LoginPage loginPage = new LoginPage(page);
        ExistingMosque existingMosque = new ExistingMosque(page);

        test.info("Navigating to the login page");
        page.navigate("https://admin.ababillapp.online/");

        //TODO : Implement the login flow and assertions
        test.info("Adding username and password");
        loginPage.addUsername("test_o1@gmail.com");
        loginPage.addPassword("Admin@test123");

        //TODO: Implement the assertion for successful login
        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        System.out.println("Test completed");
        existingMosque.openExistingMosque();
    }

    @Test
    public void newMosque () {
        LoginPage loginPage = new LoginPage(page);
        NewMosqueRequests newMosqueRequests = new NewMosqueRequests(page);

        test.info("Navigating to the login page");
        page.navigate("https://admin.ababillapp.online/");

        //TODO : Implement the login flow and assertions
        test.info("Adding username and password");
        loginPage.addUsername("test_o1@gmail.com");
        loginPage.addPassword("Admin@test123");

        //TODO: Implement the assertion for successful login
        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        System.out.println("Test completed");
        newMosqueRequests.openNewMosqueRequestsPage();
    }
}
