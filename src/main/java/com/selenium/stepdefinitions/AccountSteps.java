package com.selenium.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class AccountSteps {

    WebDriver driver;

    @When("I enter {string} in the Name field")
    public void enterName(String name) {

        driver.findElement(By.id("name")).sendKeys(name);

        System.out.println("Name entered: " + name);
    }

    @When("I enter {string} in the Email field")
    public void enterEmail(String email) {

        driver.findElement(By.id("email")).sendKeys(email);

        System.out.println("Email entered: " + email);
    }

    @When("I enter {string} in the Address field")
    public void enterAddress(String address) {

        driver.findElement(By.id("textarea")).sendKeys(address);

        System.out.println("Address entered: " + address);
    }

    @When("I select {string} gender")
    public void selectGender(String gender) {

        if (gender.equalsIgnoreCase("Female")) {

            driver.findElement(By.id("female")).click();

        } else {

            driver.findElement(By.id("male")).click();
        }

        System.out.println("Gender selected: " + gender);
    }

    @Then("the personal information should be entered successfully")
    public void verifyAccountInformation() {

        System.out.println("Account information completed");
    }
}