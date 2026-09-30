package com.selenium.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page {

    WebDriver driver;

    // DAYS 

    By SUNDAY = By.xpath("//input[@id='sunday']");
    By MONDAY = By.xpath("//input[@id='monday']");
    By TUESDAY = By.xpath("//input[@id='tuesday']");
    By WEDNESDAY = By.xpath("//input[@id='wednesday']");
    By THURSDAY = By.xpath("//input[@id='thursday']");
    By FRIDAY = By.xpath("//input[@id='friday']");
    By SATURDAY = By.xpath("//input[@id='saturday']");

    // DROPDOWNS 

    By COUNTRY = By.xpath("//select[@id='country']");
    By COLORS = By.xpath("//select[@id='colors']");
    By SORTED_LIST = By.xpath("//select[@id='animals']");

    // DATE PICKERS 

    By DATE_PICKER_1 = By.xpath("//input[@id='datepicker']");
    By DATE_PICKER_2 = By.xpath("//*[@id=\"txtDate\"]");

    // DATE RANGE
    By START_DATE = By.xpath("//input[@id='start-date']");
    By END_DATE = By.xpath("//input[@id='end-date']");

    // SUBMIT
    By SUBMIT = By.xpath("//button[@class='submit-btn']");
    
    // RESULT
    By RESULT = By.xpath("//div[@id='result']");

    // CONSTRUCTOR

    public Page(WebDriver driver) {

        this.driver = driver;
    }

    // DAYS

    public void selectDays() {

        driver.findElement(SUNDAY).click();
        System.out.println("Sunday selected");

        driver.findElement(MONDAY).click();
        System.out.println("Monday selected");

        driver.findElement(FRIDAY).click();
        System.out.println("Friday selected");

        System.out.println("Days - Completed");
    }

    // COUNTRY
 
    public void selectCountry(String countryName) {

        Select country =
                new Select(driver.findElement(COUNTRY));

        country.selectByVisibleText(countryName);

        System.out.println(
                "Country selected: " +
                country.getFirstSelectedOption().getText());

        System.out.println("Country - Completed");
    }

    // COLORS

    public void selectColors() {

        Select colors = new Select(driver.findElement(COLORS));

        colors.selectByVisibleText("Red");

        colors.selectByVisibleText("Blue");

        List<WebElement> selected =colors.getAllSelectedOptions();

        System.out.println("Selected Colors:");

        for (WebElement color : selected) {
            System.out.println("- " + color.getText());
        }

        System.out.println("Colors - Completed");
    }


    // ==============================
    // DATE PICKER 1
    // ==============================

    public void selectDatePicker1(String date) {

        driver.findElement(DATE_PICKER_1) .sendKeys(date);

        System.out.println("Date Picker 1: " + date);

        System.out.println( "Date Picker 1 - Completed");
    }


    // ==============================
    // DATE PICKER 2
    // ==============================

    public void selectDatePicker2() {

        driver.findElement(DATE_PICKER_2) .click();

        System.out.println( "Date Picker 2 opened");

        WebElement date = driver.findElement(By.xpath("//a[@data-date='23']") );

        date.click();

        System.out.println( "Date Picker 2 selected: 23");

        System.out.println( "Date Picker 2 - Completed");
    }


    // ==============================
    // DATE PICKER 3
    // ==============================

    public void selectDateRange( String start, String end) {

        driver.findElement(START_DATE) .sendKeys(start);

        System.out.println( "Start Date: " + start);

        driver.findElement(END_DATE) .sendKeys(end);

        System.out.println("End Date: " + end);

        System.out.println("Date Range - Completed");
    }


    // ==============================
    // SUBMIT
    // ==============================

    public void submit() {

        driver.findElement(SUBMIT).click();

        System.out.println("Submit button clicked");

        System.out.println("Submit - Completed");
    }


    // ==============================
    // RESULT
    // ==============================

    public void result() {

        System.out.println( "Current URL: " + driver.getCurrentUrl());

        System.out.println(  "Page Title: " +  driver.getTitle());

        System.out.println(  "Result - Completed");
    }
}