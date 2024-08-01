package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {


    @When("user click on sign in link")
    public void userClickOnSignInLink () {
        clickOnElement(HomePage.SING_IN_LINK);
    }

    @Then("validate user is in sign in page")
    public void validateUserIsInSignInPage () {
        String pageSubTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign In", pageSubTitle);

    }

    @When("user enter username and password and click login")
    public void userEnterUsernameAndPasswordAndClickLogin () {
        sendText(SignInPage.EMAIL_INPUT, "crystal.a512@gmail.com");
        sendText(SignInPage.PASSWORD_INPUT, "CC512cc!");
        clickOnElement(SignInPage.LOGIN_BUTTON);

    }

    @When("user enter {string} and {string} and click on login")
    public void userEnterUsernameAndPassword(String username, String password) {
        sendText(SignInPage.EMAIL_INPUT, username);
        sendText(SignInPage.PASSWORD_INPUT, password);
        clickOnElement(SignInPage.LOGIN_BUTTON);
    }
    @Then("user should be able to see account link")
    public void userShouldBeAbleToSeeAccountLink() {
        boolean isAccountDisplayed = isElementDisplayed(HomePage.ACCOUNT_LINK);
        Assert.assertTrue(isAccountDisplayed);

    }
}
