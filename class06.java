package com.company.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class06 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement statesDD = driver.findElement(By.cssSelector("select#multi-select"));

        Select select=new Select(statesDD);
        boolean isnul=select.isMultiple();
        System.out.println(isnul);


        select.selectByIndex(2);
        Thread.sleep(2000);

   select.deselectByVisibleText("Texas");
   select.selectByValue("Ohio");
        Thread.sleep(3000);

    select.deselectByIndex(2);
        Thread.sleep(3000);

    select.deselectByVisibleText("Texas");
select.deselectByVisibleText("Ohio");

// to use iterator to get all the options text and print is consol


    }
}