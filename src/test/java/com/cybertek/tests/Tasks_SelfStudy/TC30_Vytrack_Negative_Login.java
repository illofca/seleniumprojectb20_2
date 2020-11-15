package com.cybertek.tests.Tasks_SelfStudy;

import com.cybertek.pages.VytrackLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC30_Vytrack_Negative_Login {
    /*
    TC#30 : Vytrack negative login test à Wrong Password Test
1. Go to https://qa3.vytrack.com
2. Enter correct username
3. Enter incorrect password
4. Verify error message text is as expected
Expected: “Invalid user name or password.”
Note: Follow Page Object Model design pattern, and get your correct credentials from
configuration.properties file
     */
    VytrackLoginPage vytrackLoginPage;

    @Test(description = "entering incorrect username")
    public void negative_login_wrong_password_test1() {

        String url = ConfigurationReader.getProperty("vytrackUrl");
        Driver.getDriver().get(url);



        //Lets start using PageObjectModel

        //#1- We need to create the object of the class we want to use
        vytrackLoginPage = new VytrackLoginPage();
        //When we create the instance of this class, the constructor immediately
        //initializes our Driver and the object 'loginPage'

        //#2- Call the object to use the web elements

        // Entering correct username
        String username = ConfigurationReader.getProperty("vytrack_username");
        vytrackLoginPage.usernameInput.sendKeys(username);

        // Enter inCORRECT password
        vytrackLoginPage.passwordInput.sendKeys("wrong_password");

        // Click to login button
        vytrackLoginPage.loginButton.click();

        //assert true that error message is displayed on the page
        Assert.assertTrue(vytrackLoginPage.errorMessage.isDisplayed() , "Error message is not displayed. Verification Failed!");
        //BREAK UNTIL 8.15PM CST - 9.15PM EST
    }
}
