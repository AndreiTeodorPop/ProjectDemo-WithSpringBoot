package com.testing.endava.steps;

import com.testing.endava.pages.LoginPage;
import com.testing.endava.pojo.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {

    User user = User.builder()
            .username("Andrei")
            .password("Parola")
            .build();
    @Autowired
    private LoginPage loginPage;

    @Given("I have navigated to login page")
    public void iHaveNavigatedToLoginPage() {
        loginPage.validateHomePage();
    }

    @And("I login with username and password")
    public void iLoginWithUserNameAndPassword() {
        loginPage.loginIn(user)
                .clickLogin();

    }


}