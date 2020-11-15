package com.cybertek.tests.day14_excel;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.ExcelUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidePractice {

    @FindBy(id = "prependedInput")
    private WebElement usernameElement;

    @FindBy(id = "prependedInput2")
    private WebElement passwordElement;

    public DataProvidePractice() {
        PageFactory.initElements(Driver.getDriver() , this);
    }


    @Test(dataProvider = "usersTestDataFromExcel")
    public void ddtLoginTest1(String execute , String username, String password , String firstname , String lastname) {
        System.out.println("User name is: "+firstname+" "+lastname+", execute ? "+ execute);

        if()

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password, Keys.ENTER);
        System.out.println(Driver.getDriver().getTitle());

    }

    @DataProvider
    public Object[][] usersTestData() {
        return new Object[][]{
                {"storemanager85" , "UserUser123"} ,
                {"salsemanager110" , "UserUser123"} ,
                {"user153" , "UserUser123"} ,
                {"storemanager85" , "UserUser123"}

        };
    }
    //execute	username	password	firstname	lastname

    public Object[][] userTestDataFromExcel() {
        ExcelUtil excelUtil = new ExcelUtil("vytrack>testusers.xlsx" , "QA3-short");
        return excelUtil.getDataArray();

    }


    @BeforeMethod
     public void setup(){
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        Driver.getDriver().manage().window().maximize();
         PageFactory.initElements(Driver.getDriver(), this);




    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }




}
