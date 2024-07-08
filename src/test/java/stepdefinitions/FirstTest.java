package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstTest {

    @Given("user on net banking login page")
    public void user_on_net_banking_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user landed on net banking login page");
    }
    @When("user login into application")
    public void user_login_into_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user login to application");
    }
    @Then("user navigated to homepage")
    public void user_navigated_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user navigated to home page");
    }
    @Then("cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
    }

    @And("log off button displayed")
    public void logOffButtonDisplayed() {
        System.out.println("Log off button displayed");
    }

    @When("^user login into application as user (.+) and password as (.+)$")
    public void userLoginIntoApplicationAsUserAndPasswordAs(String username, String password) {
        System.out.println("User Name is "+ username);
        System.out.println("Password is "+ password);
    }
}
