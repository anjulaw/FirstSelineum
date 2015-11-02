package com.selenium.pagefactory;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Anjulaw on 11/1/2015.
 */
public class MercuryLogin {

    WebDriver driver;

    @FindBy(how = How.NAME,using = "userName")
    private WebElement userName;

    @FindBy(how = How.NAME,using = "password")
    private WebElement password;

    @FindBy(how = How.NAME,using = "login")
    private WebElement logIn;

    @FindBy(how = How.LINK_TEXT,using = "SIGN-ON")
    private WebElement btnSignOn;

    public void logIn(String uName,String pwd){

        userName.sendKeys(uName);
        password.sendKeys(pwd);
        logIn.click();

    }

    public String getBtnSignOnText(){
        String linkText = btnSignOn.getText();
        return linkText;
    }


}
