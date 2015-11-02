package com.codegen.webdriverTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created with IntelliJ IDEA.
 * User: Anjulaw
 * Date: 3/30/15
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebdriverTestng {

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
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Test(priority = 0)
    public void goSignIn(){
        driver.findElement(By.linkText("SIGN-ON")).click();
        expectedTitle="Sign-on: Mercury Tours";
        actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Test(priority = 1)
    public void logIn(){
        driver.findElement(By.linkText("SIGN-ON")).click();
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("anjulaw");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("anjula@123");
        driver.findElement(By.name("login")).click();
        Assert.assertEquals("SIGN-OFF",driver.findElement(By.linkText("SIGN-OFF")).getText());
    }

    @AfterTest
    public void terminateDriver(){
        driver.close();
        System.exit(0);
    }


}
