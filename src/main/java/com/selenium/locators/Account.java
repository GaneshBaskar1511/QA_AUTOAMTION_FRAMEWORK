package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account {

    WebDriver driver;

    // ACCOUNT LOCATORS
    // TEXT FIELDS 

    By NAME = By.xpath("//input[@id='name']");
    By EMAIL = By.xpath("//input[@id='email']");
    By PHONE = By.xpath("//input[@id='phone']");
    By ADDRESS = By.xpath("//textarea[@id='textarea']");

    // GENDER 

    By MALE = By.xpath("//input[@id='male']");
    By FEMALE = By.xpath("//input[@id='female']");

    // CONSTRUCTOR

    public Account(WebDriver driver) {

        this.driver = driver;
    }

    // ACCOUNT METHODS
   
    public void enterName(String value) {

        driver.findElement(NAME).sendKeys(value);

        System.out.println("Name entered: " + value);
        System.out.println("Name - Completed");
    }


    public void enterEmail(String value) {

        driver.findElement(EMAIL).sendKeys(value);

        System.out.println("Email entered: " + value);
        System.out.println("Email - Completed");
    }


    public void enterAddress(String value) {

        driver.findElement(ADDRESS).sendKeys(value);

        System.out.println("Address entered: " + value);
        System.out.println("Address - Completed");
    }


    public void selectGender(String gender) {
            driver.findElement(MALE).click();

        System.out.println("Gender selected: " + gender);
        System.out.println("Gender - Completed");
    }
}