package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.AccountPage;
import tek.bdd.pages.SignUpPage;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.RandomGenerator;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;
import java.util.Map;

public class CreateAccountSteps extends SeleniumUtility {

    private static String emailToUse;

    @When("user enter {string} and {string} and {string}")
    public void user_enter_name_email_password_and_confirm_password_and_click_create_account
            (String name, String email, String password) {
        emailToUse = email.equalsIgnoreCase("random")
                ? RandomGenerator.generateRandomString() : email;
     //   String emailToUse;
     //  // if (email.equalsIgnoreCase("random")) {
     //      emailToUse = RandomGenerator.generateRandomString();
     //  }else {
     //      emailToUse = email;
        sendText(SignUpPage.NAME_INPUT, name);
        sendText(SignUpPage.EMAIL_INPUT, emailToUse);
        sendText(SignUpPage.PASSWORD_INPUT, password);
        sendText(SignUpPage.CONFIRM_PASSWORD, password);

    }


    @Then("validate user is in account page")
    public void validateUserInAccountPage() {
        String actualText  = getElementText(AccountPage.PROFILE_PAGE_TITLE);

        Assert.assertEquals("Account page should contains Your Profile Text"
                ,"Your Profile", actualText);
    }

    @Then("validate email address in account page match")
    public void validateEmailAddressInAccountPageMatch() {
        String actualEmail = getElementText(AccountPage.PROFILE_EMAIL_TEXT);

        Assert.assertEquals("Email in Account page should match with email used in create account step",
                emailToUse, actualEmail);
    }

    @When("user enter new account info")
    public void user_enter_new_account_info(DataTable dataTable) {
        //Converting data table to Map<String, String>
        Map<String, String> data = dataTable.asMap();
        String email = data.get("email");
        String name = data.get("name");
        String password = data.get("password");

        emailToUse = email.equalsIgnoreCase("random")
                ? RandomGenerator.generateRandomString() : email;

        sendText(SignUpPage.NAME_INPUT, name);
        sendText(SignUpPage.EMAIL_INPUT, emailToUse);
        sendText(SignUpPage.PASSWORD_INPUT, password);
        sendText(SignUpPage.CONFIRM_PASSWORD, password);
    }

    @When("user enter new account info using list Data")
    public void user_enter_new_account_info_using_list_data(DataTable dataTable) {
        //Convert Data Table to List.
        List<String> data = dataTable.asList();
        String name = data.get(0);
        String email = data.get(1);
        String password = data.get(2);

        emailToUse = email.equalsIgnoreCase("random")
                ? RandomGenerator.generateRandomString() : email;

        sendText(SignUpPage.NAME_INPUT, name);
        sendText(SignUpPage.EMAIL_INPUT, emailToUse);
        sendText(SignUpPage.PASSWORD_INPUT, password);
        sendText(SignUpPage.CONFIRM_PASSWORD, password);
    }


}
