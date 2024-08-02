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

    @When("user enter {string}, {string}, {string}, and {string} and click create account")
    public void user_enter_name_email_password_and_confirm_password_and_click_create_account
            (String name, String email, String password, String confirmPassword) {
        sendText(CreateNewAccountPage.NAME_INPUT, name);
        sendText(CreateNewAccountPage.EMAIL_INPUT, email);
        sendText(CreateNewAccountPage.PASSWORD_INPUT, password);
        sendText(CreateNewAccountPage.CONFIRM_PASSWORD_INPUT, confirmPassword);
        clickOnElement(CreateNewAccountPage.SIGN_UP);
    }


    @Then("validate new account is created")
    public void validate_new_account_is_created() {
        boolean isAccountDisplayed = isElementDisplayed(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(isAccountDisplayed);
    }






}
