package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private static WebDriverManager webDriverManager;

    public static void main(String[] args) throws InterruptedException{

        //1- setup web driver
        webDriverManager.chromedriver().setup();
        //System.setProperty("driver.type", "path to the driver");
        //System.setProperty("webdriver.chrome.driver", "path to the driver");


        //2- create the instance of the crome driver
        WebDriver driver = new ChromeDriver();//This line opens the browser
        driver.manage().window().maximize();

        //3- Use the driver instance to test selenium (if driver is working)
        driver.get("https://www.google.com");

        System.out.println("The title of the page is: "+ driver.getTitle());

        String actualTitle = driver.getTitle();
        System.out.println("Actual Title String :"+ actualTitle);
//below 2 lines are long code for getting above url
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);

        //when actualUrl.soutv typed and press enter will give the below printing sentence

        System.out.println("actualUrl = "+actualUrl);
        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com");

        String pageSource = driver.getPageSource();

        System.out.println("pageSource = "+pageSource);

       driver.close();

      //  driver.quit();




    }
}
