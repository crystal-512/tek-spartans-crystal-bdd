package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void userClickOnSignInLink () {
        clickOnElement(By.id("signinLink"));
    }

    @Then("validate user is in sign in page")
    public void validateUserIsInSignInPage () {
        String pageSubTitle = getElementText(By.className("login__subtitle"));
        Assert.assertEquals("Sign In", pageSubTitle);

    }

    @When("user enter username and password and click login")
    public void userEnterUsernameAndPasswordAndClickLogin () {
        sendText(By.name("email"), "crystal.a512@gmail.com");
        sendText(By.name("password"), "CC512cc!");
        clickOnElement(By.id("loginBtn"));

    }

    @Then("user should be able to see account link")
    public void userShouldSeeAccountLink () {
        boolean isAccountDisplayed = isElementDisplayed(By.id("accountLink"));
        Assert.assertTrue(isAccountDisplayed);

    }
}
