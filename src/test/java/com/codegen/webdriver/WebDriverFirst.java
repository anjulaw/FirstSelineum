package com.codegen.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created with IntelliJ IDEA.
 * User: Anjulaw
 * Date: 3/30/15
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebDriverFirst {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        //launch Firefox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle=driver.getTitle();

        if(actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test fail");
        }

        //close Firefox
        driver.close();

        // exit the program explicitly
        System.exit(0);


    }
}
