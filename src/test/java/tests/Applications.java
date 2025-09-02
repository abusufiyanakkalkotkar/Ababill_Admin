package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.application.Applicationrating;
import pages.application.CreateNewNotification;
import pages.application.ManageApplicationLinks;
import pages.application.ManageFAQ;
import pages.login.LoginPage;

public class Applications extends BaseTest {
    @Test
    public void Notification() {
        LoginPage loginPage = new LoginPage(page);
        CreateNewNotification manageNotificationInputs = new CreateNewNotification(page);

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

        // TODO: Implement the assertions for notification inputs
        manageNotificationInputs.setNotificationTitle();
    }

    @Test
    public void FAQmanage() {
        LoginPage loginPage = new LoginPage(page);
        ManageFAQ manageFAQInputs = new ManageFAQ(page);

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

        // TODO: Implement the assertions for FAQ inputs
        manageFAQInputs.searchFAQ();
    }

    @Test
    public void VerifyRating() {
        LoginPage loginPage = new LoginPage(page);
        Applicationrating applicationRatingInputs = new Applicationrating(page);

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

        // TODO: Implement the assertions for Rating inputs
        applicationRatingInputs.isRatingVisible();
    }

    @Test
    public void Link(){
        LoginPage loginPage = new LoginPage(page);
        ManageApplicationLinks manageApplicationLinks = new ManageApplicationLinks(page);

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

        // TODO: Implement the assertions for Link inputs
        manageApplicationLinks.navigateToLinksPage();
    }
}
