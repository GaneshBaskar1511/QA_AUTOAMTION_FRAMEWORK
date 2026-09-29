package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static void main(String[] args) throws InterruptedException {

        // CREATE DRIVER
        WebDriver driver = new ChromeDriver();

        // COMMON METHODS
        CommonMethods cm = new CommonMethods(driver);
        cm.setUp();
        cm.implicitWait();

        // LOCATORS & ACTIONS
        LocatorsActions la = new LocatorsActions(driver);

        // TEXT FIELDS
        la.enterName(TestData.NAME);
        la.enterEmail(TestData.EMAIL);
        la.enterPhone(TestData.PHONE);
        la.enterAddress(TestData.ADDRESS);

        // GENDER
        la.selectGender(TestData.GENDER);

        // DAYS
        la.selectDays();
        
        // COUNTRY

        la.selectCountry(     TestData.COUNTRY);
        
        // COLORS
        la.selectColors();

        // SORTED LIST
        la.selectSortedList(TestData.SORTED_ITEM);

        // DATE PICKER 1
        la.enterDatePicker1( TestData.DATE1);

        // DATE PICKER 2
//        la.enterDatePicker2(TestData.DATE2 );
        la.enterDatePicker2();

        // DATE RANGE
        la.enterStartDate(TestData.START_DATE);
        la.enterEndDate(TestData.END_DATE);

        // SUBMIT
        la.enterSubmit();
        
        // RESULT
        la.printresult();
        
        // FINAL

        System.out.println("=================================");

        System.out.println("ALL FORM DATA ENTERED SUCCESSFULLY");

        System.out.println("=================================");

        Thread.sleep(3000);

        driver.quit();

        System.out.println("Browser closed - Test Completed");
    }
}