
package tests;

import base.BaseTest;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;
import pages.buisness.ExistingBuisness;
import pages.buisness.NewBusinessAdsRequest;
import pages.buisness.NewBusinessRequest;
import pages.login.LoginPage;

public class Business extends BaseTest {
    @Test
    public void testCalculateInterest() {
        LoginPage loginPage = new LoginPage(page);
        ExistingBuisness existingBusiness = new ExistingBuisness(page);

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
        // TODO: Implement assertions and error handling for the business calculations

        test.info("Navigating to the existing business page");
        // Assuming ExistingBuisness has a method to navigate to the page
        existingBusiness.processExistingBusinesses();

    }

    @Test
    public void testBusinessDetails() {
        LoginPage loginPage = new LoginPage(page);
        NewBusinessRequest newBusinessPage = new NewBusinessRequest(page);

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
        // TODO: Implement assertions and error handling for the business calculations

        test.info("Navigating to the new business page");
        newBusinessPage.navigateToBusiness();
    }

    @Test
    public void testNewBusinessRequest() {
        LoginPage loginPage = new LoginPage(page);
        NewBusinessAdsRequest newBusinessAdsRequest = new NewBusinessAdsRequest(page);

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
        // TODO: Implement assertions and error handling for the business calculations

        test.info("Clicking on new business request button");
        newBusinessAdsRequest.submitForm();
    }
}
