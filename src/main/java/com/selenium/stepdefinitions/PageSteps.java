package com.selenium.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class PageSteps {

    WebDriver driver;

    @When("I select Sunday Monday and Friday")
    public void selectDays() {

        driver.findElement(By.id("sunday")).click();
        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("friday")).click();

        System.out.println("Sunday, Monday and Friday selected");
    }

    @When("I select {string} from the Country dropdown")
    public void selectCountry(String countryName) {

        Select country =
                new Select(driver.findElement(By.id("country")));

        country.selectByVisibleText(countryName);

        System.out.println("Country selected: " + countryName);
    }

    @When("I select Red and Blue colors")
    public void selectColors() {

        Select colors =
                new Select(driver.findElement(By.id("colors")));

        colors.selectByVisibleText("Red");
        colors.selectByVisibleText("Blue");

        System.out.println("Red and Blue selected");
    }

    @When("I enter {string} in Date Picker 1")
    public void datePicker1(String date) {

        driver.findElement(By.id("datepicker")).sendKeys(date);

        System.out.println("Date Picker 1: " + date);
    }

    @When("I select day {string} from Date Picker 2")
    public void datePicker2(String day) {

        driver.findElement(By.id("txtDate")).click();

        driver.findElement(
            By.xpath("//a[@data-date='" + day + "']")
        ).click();

        System.out.println("Date Picker 2 selected: " + day);
    }

    @When("I enter {string} as the start date")
    public void startDate(String date) {

        driver.findElement(By.id("start-date")).sendKeys(date);

        System.out.println("Start date: " + date);
    }

    @When("I enter {string} as the end date")
    public void endDate(String date) {

        driver.findElement(By.id("end-date")).sendKeys(date);

        System.out.println("End date: " + date);
    }

    @When("I click the Submit button")
    public void submit() {

        driver.findElement(
            By.cssSelector("button.submit-btn")
        ).click();

        System.out.println("Submit button clicked");
    }

    @Then("the result should be displayed")
    public void verifyResult() {

        WebElement result =
                driver.findElement(By.id("result"));

        System.out.println(
            "Result displayed: " + result.getText()
        );
    }
}