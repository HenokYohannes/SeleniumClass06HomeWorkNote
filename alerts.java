package com.company.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

driver.get("http://www.uitestpractice.com/Students/Switchto");

        driver.manage().window().maximize();

Thread.sleep(2000);
//enable the alert
//handling simple alert
driver.findElement(By.cssSelector("button#alert")).click();
// switch the focus of selenium
        Alert simpleAlert = driver.switchTo().alert();
    simpleAlert.accept();

// handling confirmation alert

driver.findElement(By.cssSelector("button#confirm")).click();

// switch the focus

        Alert confirmationAlert=driver.switchTo().alert();
//get the text from this alert

        System.out.println(confirmationAlert.getText());

// cancel alert

        //confirmationAlert.dismiss();
Thread.sleep(2000);
      // prompt alert
driver.findElement(By.cssSelector("buttom#prompt")).click();

    //switch focus

     Alert promptAlert= driver.switchTo().alert();


     promptAlert.sendKeys("Hello we need to sleep");

        promptAlert.accept();

    }
}