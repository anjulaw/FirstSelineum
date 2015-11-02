package com.selenium.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Anjulaw on 11/1/2015.
 */
public class MercuryLoginTest {
    String baseUrl = "http://newtours.demoaut.com";
    WebDriver driver = new FirefoxDriver();
    String expectedTitle = "";
    String actualTitle = "";


    @BeforeTest
    public void initDriver(){
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @BeforeClass
    public void verifyHomePageTitle(){
        expectedTitle="Welcome: Mercury Tours";
        actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @Test
    public void logIn(){
        MercuryLogin homepageOne = PageFactory.initElements(driver,MercuryLogin.class);
        homepageOne.logIn("anjulaw","anjula@123");
    }


    @AfterTest
    public void terminateDriver(){
        driver.close();
        System.exit(0);
    }
}
