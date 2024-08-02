package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.CreateNewAccountPage;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void user_click_on_sign_in_link() {
        clickOnElement(HomePage.SING_IN_LINK);
    }

    @Then("validate user is in sign in page")
    public void validate_user_is_in_sign_in_page() {
        String pageSubTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageSubTitle);
    }

    @When("user click on create new account link")
    public void user_click_on_create_new_account_link() {
        clickOnElement(CreateNewAccountPage.CREATE_NEW_ACCOUNT_LINK);
    }

    @Then("validate user is in create new account page")
    public void validate_user_is_in_create_new_account_page() {
        String pageSubTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageSubTitle);
    }

    @When("user enter new account information and click on create account")
    public void user_enter_new_account_information_and_click_on_create_account() {
        sendText(CreateNewAccountPage.NAME_INPUT, "Crystal");
        sendText(CreateNewAccountPage.EMAIL_INPUT, "crystal.a512@gmail.com");
        sendText(CreateNewAccountPage.PASSWORD_INPUT, "CC234cc!");
        sendText(CreateNewAccountPage.CONFIRM_PASSWORD_INPUT, "CC234cc!");
        clickOnElement(CreateNewAccountPage.SIGN_UP);
    }

    @When("user enter {string} and {string} and click on login")
    public void userEnterUsernameAndPassword(String username, String password) {
        sendText(SignInPage.EMAIL_INPUT, username);
        sendText(SignInPage.PASSWORD_INPUT, password);
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }




}
