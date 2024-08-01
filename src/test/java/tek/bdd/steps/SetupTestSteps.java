package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {

    @Then("validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo() {
        String text = getElementText(By.className("top-nav__logo"));

        Assert.assertEquals("TEKSCHOOL", text);

        System.out.println(text);
    }

    @Then("Validate Sign in button is enabled")
    public void validateSignInButtonEnabled () {
        boolean isSignInButtonEnabled = isElementEnabled(By.id("signinLink"));
        Assert.assertTrue(isSignInButtonEnabled);
    }



}
