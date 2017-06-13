package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jeff206462799 on 6/12/17.
 */
public class LoginPage {
    private WebDriver webDriver;

    @FindBy(id ="username")
    private WebElement usernameField;

    @FindBy(id ="password")
    private WebElement passwordField;

    @FindBy(className ="radius")
    private WebElement submitButton;

    @FindBy(xpath ="//*[@id=\"flash\"]")
    private WebElement loginSuccessBanner;

    @FindBy(linkText ="Logout")
    private WebElement logOutButton;

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getLoginSuccessBanner() {
        return loginSuccessBanner;
    }

    public WebElement getLogOutButton() {
        return logOutButton;
    }

    public void setUsername(String username) {
        this.usernameField.sendKeys(username);
    }

    public void setPassword(String password) {
        this.passwordField.sendKeys(password);
    }

    public void logIn() {
        submitButton.click();
    }

    public boolean logInWithSuccessConfirmation() {
        submitButton.click();
        return logOutButton.isDisplayed();
    }

    public LoginPage() {

    }

    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
    }
}
