package SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPresentTestNG {

    WebDriver driver = utilities.DriverFactory.open ("chrome");
    String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

    @Test
    public void LoginElementsPresentTest() {

        System.out.println ("Running test" );

        boolean loginEmailBox = driver.findElement (By.id ("MainContent_txtUserName" )).isDisplayed ();
        boolean passwordBox = driver.findElement (By.id("MainContent_txtPassword")).isDisplayed ();

        Assert.assertTrue (loginEmailBox, "Email textbox present");
        Assert.assertTrue (passwordBox, "Password textbox not present");
       // driver.close ();
    }

    @BeforeMethod
    public void setUp(){
        System.out.println ("Starting test" );
        //driver = utilities.DriverFactory.open ("chrome");
        driver.get (webURL);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println ("Closing test" );
        driver.close ();
    }
}
