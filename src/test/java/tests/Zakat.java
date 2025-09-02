package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import pages.zakat.ManageGoldSilverPrices;

public class Zakat extends BaseTest {
    @Test
    public void GoldandSilver() {
        LoginPage loginPage = new LoginPage(page);
        ManageGoldSilverPrices manageGoldandSilverInputs = new ManageGoldSilverPrices(page);

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

        // TODO: Implement the assertions for Gold and Silver inputs
        manageGoldandSilverInputs.openGoldSilverPrices();
    }
}
