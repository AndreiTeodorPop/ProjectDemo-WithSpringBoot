package com.testing.endava.steps;

import com.testing.endava.pages.RegisterPage;
import com.testing.endava.pojo.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {

    User user = User.builder()
            .firstName("Andrei")
            .lastName("Pop")
            .build();
    @Autowired
    private RegisterPage registerPage;

    @Given("I have navigated to register page")
    public void iHaveNavigatedToRegisterPage() {
        registerPage.validateRegisterPage();
    }

    @When("I enter first and last name to Full Name box")
    public void iRegisterWithFirstNameAndLastName() {
        registerPage.acceptConsent();
        registerPage.registerUser(user);
    }

    @Then("I refresh the page and navigate to Home Page")
    public void iRefreshThePage() throws InterruptedException {
        registerPage.clickRefresh();
        registerPage.goToHomePage();
        Thread.sleep(3000);
    }


}