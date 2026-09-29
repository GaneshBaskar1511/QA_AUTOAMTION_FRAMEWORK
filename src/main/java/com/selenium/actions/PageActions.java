package com.selenium.actions;

import org.openqa.selenium.WebDriver;

import com.selenium.locators.Page;

public class PageActions {

    Page page;

    public PageActions(WebDriver driver) {

        page = new Page(driver);
    }
    
//	  TEST CASES FOR PAGES
//    Open the website.
//    Select Sunday, Monday, and Friday.
//    Select India from the Country dropdown.
//    Select Red and Blue from the Colors dropdown.
//    Enter 09/23/2026 in Date Picker 1.
//    Open Date Picker 2 and select 23.
//    Enter 24-09-2026 as the Start Date.
//    Enter 30-09-2026 as the End Date.
//    Click the Submit button.
//    Verify the result is displayed.
//    Verify the current URL and page title.
//    Verify all the selected and entered values are correct.

    public void executePages() {

        System.out.println( "========== PAGES ==========");

        page.selectDays();

        page.selectCountry("India");

        page.selectColors();

        page.selectDatePicker1(  "09/23/2026");

        page.selectDatePicker2();

        page.selectDateRange("24-09-2026", "30-09-2026");

        page.submit();

        page.result();


        System.out.println( "========== PAGES COMPLETED ==========");
    }
}