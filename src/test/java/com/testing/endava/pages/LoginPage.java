package com.testing.endava.pages;

import com.testing.endava.pojo.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static org.testng.AssertJUnit.assertEquals;

@Component
public class LoginPage extends AbstractPage {

    public LoginPage() {
        System.out.println("Login Page instantiated.");
    }

    public void getPage() {
        System.out.println("Page name.");
    }


    @FindBy(how = How.NAME, using = "UserName")
    private WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    private WebElement txtPassword;

    @FindBy(how = How.NAME, using = "Login")
    private WebElement btnLogin;


    public LoginPage validateHomePage() {
        assertEquals("Execute Automation", driver.getTitle());
        return this;
    }

    public LoginPage loginIn(User user) {
        txtUserName.sendKeys(user.getUsername());
        txtPassword.sendKeys(user.getPassword());
        return this;
    }

    public LoginPage clickLogin() {
        btnLogin.submit();
        return this;
    }
}