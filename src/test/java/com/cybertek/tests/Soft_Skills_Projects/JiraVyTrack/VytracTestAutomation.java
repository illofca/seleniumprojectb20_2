package com.cybertek.tests.Soft_Skills_Projects.JiraVyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VytracTestAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize(); // maximize web page
        String userNameStoreMngr="storemanager221";
        String passwordStoreMngr="UserUser123";
        //login with above username and password
        driver.findElement(By.id("prependedInput")).sendKeys(userNameStoreMngr+ Keys.ENTER);
        driver.findElement(By.id("prependedInput2")).sendKeys(passwordStoreMngr+ Keys.ENTER);

        //put more wait here as well, if didn't click
        Thread.sleep(3000);

        //click on fleet
        // driver.findElement(fleetBy).click();
        //Actions class is used for more advanced browser interactions
        Actions actions = new Actions(driver);
        //move to element instead of click
        WebElement fleet = driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(),'Fleet')]"));
        actions.moveToElement(fleet).perform();


        Thread.sleep(3000);

        //click on Vehicles
        driver.findElement(By.linkText("Vehicles")).click();

        Thread.sleep(3000);
        WebElement header = driver.findElement(By.tagName("thead"));
        System.out.println(header.getText());

        //go to table and click row 2 column 2 cell
        WebElement table = driver.
                findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[4]/td[2]"));
        table.click();

        //      Thread.sleep(2000);
//        WebElement cell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[2]"));
//        cell.click();
        Thread.sleep(3000);
        WebElement addEvent = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/div[1]/div[1]/div[3]/a"));
        addEvent.click();
        Thread.sleep(7000);
        driver.close();
    }
}
