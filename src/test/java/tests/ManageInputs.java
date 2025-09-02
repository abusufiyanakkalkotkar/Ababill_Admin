package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import pages.manageinputs.*;
import pages.zakat.ManageGoldSilverPrices;

public class ManageInputs extends BaseTest {
    @Test
    public void Country() {
        LoginPage loginPage = new LoginPage(page);
        ManageCountryInputs manageCountryInputs = new ManageCountryInputs(page);

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

        //TODO: Implement the assertions for country inputs
        manageCountryInputs.open();
    }

    @Test
    public void State() {
        LoginPage loginPage = new LoginPage(page);
        ManageStateInputs manageStateInputs = new ManageStateInputs(page);

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

        //TODO: Implement the assertions for state inputs
        manageStateInputs.openManageStateInputsTab();
    }

    @Test
    public void City() {
        LoginPage loginPage = new LoginPage(page);
        ManageCityInputs manageCityInputs = new ManageCityInputs(page);

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

        //TODO: Implement the assertions for city inputs
        manageCityInputs.manageCity();
    }

    @Test
    public void VotingWard() {
        LoginPage loginPage = new LoginPage(page);
        ManageVotingWardInputs manageVotingWardInputs = new ManageVotingWardInputs(page);

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

        System.out.println("Test completed");

        // TODO: Implement the assertions for voting ward inputs
        test.info("uploading the voting ward");
        manageVotingWardInputs.manageVotingWardInputs();
    }

    @Test
    public void Role() {
        LoginPage loginPage = new LoginPage(page);
        ManageRolesInputs manageRolesInputs = new ManageRolesInputs(page);

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

        System.out.println("Test completed");

        // TODO: Implement the assertions for role permissions
        manageRolesInputs.clickRoleInputs();
    }

    @Test
    public void Inputs() {
        LoginPage loginPage = new LoginPage(page);
        ManageOccupationInputs manageOccupationInputs = new ManageOccupationInputs(page);

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

        System.out.println("Test completed");

        // TODO: Implement the assertions for occupation inputs
        manageOccupationInputs.openOccupation();
    }

    @Test
    public void ZakatQuestions() {
        LoginPage loginPage = new LoginPage(page);
        ManageZakatQuestionInputs manageZakatInputs = new ManageZakatQuestionInputs(page);

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

        // TODO: Implement the assertions for zakat inputs
        manageZakatInputs.ManageZakat();
    }

    @Test
    public void UlamaRole() {
        LoginPage loginPage = new LoginPage(page);
        ManageUlamaRolesInputs manageRolesInputs = new ManageUlamaRolesInputs(page);

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

        // TODO: Implement the assertions for Ulama role permissions
        manageRolesInputs.enterRole();
    }

    @Test
    public void Businesstype() {
        LoginPage loginPage = new LoginPage(page);
        ManageBusinessTypes manageBusinessTypeInputs = new ManageBusinessTypes(page);

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

        // TODO: Implement the assertions for business type inputs
        manageBusinessTypeInputs.searchForBusinessType();
    }

    @Test
    public void Relation() {
        LoginPage loginPage = new LoginPage(page);
        ManageRelationTypes manageRelationTypes = new ManageRelationTypes(page);

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

        // TODO: Implement the assertions for Relation type inputs
        manageRelationTypes.openRelation();
    }


}
