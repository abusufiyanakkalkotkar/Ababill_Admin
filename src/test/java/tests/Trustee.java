package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.trustee.ExistingTrustee;
import pages.login.LoginPage;
import pages.trustee.NewTrusteeRequests;

import java.awt.*;

public class Trustee extends BaseTest {
    @Test
    public void test1() throws AWTException {
        LoginPage loginPage = new LoginPage(page);
        ExistingTrustee homePage = new ExistingTrustee(page);


        test.info("Navigating to the login page");
        page.navigate("https://admin.ababillapp.online/");

        test.info("Adding username and password");
        loginPage.addUsername("test_o1@gmail.com");
        loginPage.addPassword("Admin@test123");

        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        System.out.println("Test completed");

        test.info("Verifying the home page title");
        homePage.clickOnTimeLink();

        test.info("All page completed");

        test.info("clickong on trustee to open dropdown menu and perform view existing trustee");
        homePage.getTimeText();

        System.out.println("Test completed");
    }
    @Test
    public void test2() throws AWTException {
        LoginPage loginPage = new LoginPage(page);
        NewTrusteeRequests homePage = new NewTrusteeRequests(page);

        test.info("Navigating to the login page");
        page.navigate("https://admin.ababillapp.online/");

        test.info("Adding username and password");
        loginPage.addUsername("test_o1@gmail.com");
        loginPage.addPassword("Admin@test123");

        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        System.out.println("Test completed");

        test.info("Clicking on view existing trustee");
        homePage.navigateTo();

        System.out.println("Test completed");
    }
}
