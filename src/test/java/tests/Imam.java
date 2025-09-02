package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.imam.ExistingImams;
import pages.imam.NewImamRequests;
import pages.login.LoginPage;

public class Imam extends BaseTest {
    @Test
    public void testImam() {
        //TODO: Implement the login test
        LoginPage loginPage = new LoginPage(page);
        ExistingImams imamPage = new ExistingImams(page);


        //TODO: Implement the assertions and error handling for the login test
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

        //TODO Existing imam test
        test.info("Navigating to existing imams page");
        imamPage.openTimeSlot();

        //TODO: Implement the assertion for existing imam page
        test.info("Asserting existing imam page");
    }

    @Test
    public void testImamErrorHandling() {
        LoginPage loginPage = new LoginPage(page);
        NewImamRequests newImamRequests = new NewImamRequests(page);

        //TODO: Implement the assertions and error handling for the login test
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

        //TODO New imam request test
        test.info("Checking the new imam");
        newImamRequests.navigateToPage();


    }
}
