package com.cybertek.tests.Soft_Skills_Projects.JiraVyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.application.Application;
import javafx.stage.Stage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC3AutomationTruckDriverShouldAddDeleteEvents extends Application {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize(); // maximize web page
        String userNameStoreMngr="user171";
        String passwordStoreMngr="UserUser123";
        //login with above username and password
        driver.findElement(By.id("prependedInput")).sendKeys(userNameStoreMngr+ Keys.ENTER);
        driver.findElement(By.id("prependedInput2")).sendKeys(passwordStoreMngr+ Keys.ENTER);

        //put more wait here as well, if didn't click
        Thread.sleep(3000);

        //click on Activities
        // driver.findElement(Activities_By).click();
        //Actions class is used for more advanced browser interactions
        Actions actions = new Actions(driver);
        //move to element instead of click

        WebElement activities = driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Activities')]"));
        actions.moveToElement(activities).perform();

        Thread.sleep(4000);

        //click on Calender Events
        driver.findElement(By.linkText("Calendar Events")).click();

       // driver.findElement(By.linkText("Calender Events")).click();


        Thread.sleep(3000);
       // WebElement createEvent = driver.findElement(By.xpath("/html/body/div[2]/div/a3"));


       // driver.findElement(By.tagName("//a[.='    Create Calendar event - Calendar Events - Activities']")).click();


//oro_calendar_event_form_title-uid-5f61a813bd568

        //Thread.sleep(4000);
//        WebElement addEvent = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div"));
      //  driver.get("https://qa2.vytrack.com/calendar/event/create");

       WebElement createCalendarEvent = driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        createCalendarEvent.click();
        Thread.sleep(3000);

        //add event title - input[name='oro_calendar_event_form[title]'
        String eventTitle = "Maintenance Schedule";
        driver.findElement(By.cssSelector("input[name='oro_calendar_event_form[title]'")).sendKeys(eventTitle);

        Thread.sleep(3000);



        //add event description
      //  WebElement addDescription = driver.findElement(By.cssSelector("input[name='oro_calendar_event_form[title]'")).sendKeys(eventTitle);
       // WebElement addDescription = driver.findElement(By.cssSelector("#tinymce > p "));
        //actions2.moveToElement(addDescription).perform();

        WebElement addDescription = driver.findElement(By.cssSelector("#tinymce > p")); //document.querySelector("#tinymce > p");

         //WebElement addDescription = driver.findElement(By.xpath("//body[contains(@class='mce-content-body ']"));//document.querySelector("#tinymce > p");

     addDescription.sendKeys("Maintenance for the car has been set, please follow the guidelines!");

        Thread.sleep(3000);


       //driver.close();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}

