package com.codegen.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

/**
 * Created with IntelliJ IDEA.
 * User: Anjulaw
 * Date: 3/5/15
 * Time: 11:43 PM
 * To change this template use File | Settings | File
 * Templates.
 */
public class MyFirstTest {

    @Test(priority=1)
    public void startWebdriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.lk/");

    }
   /* @Test
    public void firstMethod(){
        System.out.println("TestNG method");
    }*/

}
