package com.selenium.keywordDriven;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anjulaw on 11/1/2015.
 */
public class CommandKeywordDriven extends TestCommands {
    private static WebDriver driver = null;

    private static TestCommands commands;

    public static void main(String[] args) {
        commands = new TestCommands();
        driver = commands.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        launch("http://newtours.demoaut.com");
        type(MercuryLoginPage.userName,"anjulaw");
        type(MercuryLoginPage.password,"anjula@123");
        click(MercuryLoginPage.btnLogin);

        driver.close();

    }


}
