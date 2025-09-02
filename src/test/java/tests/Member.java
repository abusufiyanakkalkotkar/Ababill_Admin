package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import pages.member.ExistingMembers;

import java.awt.*;

public class Member extends BaseTest {
    @Test
    public void testMember() throws AWTException {
        // Test case for Member class
        LoginPage loginPage = new LoginPage(page);
        ExistingMembers existingMembers = new ExistingMembers(page);

        // Navigate to login page
        test.info("Navigating to the login page");
        page.navigate("https://admin.ababillapp.online/");

        test.info("Adding username and password");
        loginPage.addUsername("test_o1@gmail.com");
        loginPage.addPassword("Admin@test123");

        test.info("Clicking on login button");
        loginPage.clickLoginButton();

        System.out.println("Test completed");

        test.info("Clicking on view existing trustee");
        existingMembers.openAddMemberModal();
    }
}
