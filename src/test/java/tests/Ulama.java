package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import pages.ulama.ExistingUlama;
import pages.ulama.NewUlamaRequest;

public class Ulama extends BaseTest {
    @Test
    public void testUlama() {
        LoginPage loginPage = new LoginPage(page);
        ExistingUlama tests = new ExistingUlama(page);

        test.info("Navigating to the login page");
        page.navigate("https://admin.ababillapp.online/");

        test.info("Adding username and password");
        loginPage.addUsername("test_o1@gmail.com");
        loginPage.addPassword("Admin@test123");

        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        System.out.println("Test completed");

        // Add assertions to verify the login was successful
        test.info("Verfifying Existing Ulama");
        tests.openUlamaPage();
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(page);
        NewUlamaRequest testss = new NewUlamaRequest(page);

        test.info("Navigating to the login page");
        page.navigate("https://admin.ababillapp.online/");

        test.info("Adding invalid username and password");
        loginPage.addUsername("test_o1@gmail.com");
        loginPage.addPassword("Admin@test123");

        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        System.out.println("Test completed");

        // Add assertions to verify the login failed
        test.info("Verfifying Invalid Login");
        testss.openNewUlamaRequest();
    }
}
