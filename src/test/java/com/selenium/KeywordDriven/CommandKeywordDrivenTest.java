package com.selenium.KeywordDriven;

import com.selenium.keywordDriven.MercuryLoginPage;
import com.selenium.keywordDriven.TestCommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anjulaw on 11/1/2015.
 */
public class CommandKeywordDrivenTest extends TestCommands{

    String baseUrl = "http://newtours.demoaut.com";

    private WebDriver driver=null;

    private static TestCommands commands;

    @BeforeMethod
    public void initDriver(){
        commands = new TestCommands();
        driver = commands.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void logIn(){
        launch("http://newtours.demoaut.com");
        type(MercuryLoginPage.userName, "anjulaw");
        type(MercuryLoginPage.password, "anjula@123");
        click(MercuryLoginPage.btnLogin);
    }

    @AfterMethod
    public void closeDriver(){
        driver.close();
        driver.quit();
    }


}
