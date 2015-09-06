package com.codegen.webdriverTestNG;

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
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = "";
    WebDriver driver = new FirefoxDriver();

    @BeforeSuite
    public void initDriver(){

        driver.get(baseUrl);

    }

    @Test
    public void checkTitle(){
        actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @AfterSuite
    public void quit(){
        driver.close();
        System.exit(0);
    }


}
