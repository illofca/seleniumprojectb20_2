package com.cybertek.tests.day12_review_jsexecutor_pom;


import com.cybertek.pages.LoginPage;
import com.cybertek.pages.VytrackLoginPage;
import org.testng.annotations.Test;

public class PageObjectModelPractice {
    LoginPage loginPage;
    VytrackLoginPage vytrackLoginPage;
  //  LandingPage landingPage;

    @Test
    public void login_to_smartbear() {
        LoginPage loginPage = new LoginPage();
        //get url --> smartbear

        loginPage.usernameInput.sendKeys("anyusername");
    }
    @Test
    public void login_to_vytrack(){
        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.usernameInput.sendKeys("anyusername");
        }
    }


