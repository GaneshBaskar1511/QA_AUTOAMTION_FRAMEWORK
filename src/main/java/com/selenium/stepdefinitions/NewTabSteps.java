package com.selenium.stepdefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class NewTabSteps {

    WebDriver driver;

    String mainWindow;
    String newWindow;

    @When("I click the New Tab button")
    public void clickNewTab() {

        mainWindow = driver.getWindowHandle();

        driver.findElement(
            By.xpath("//button[normalize-space()='New Tab']")
        ).click();

        System.out.println("New Tab button clicked");
    }

    @Then("a new tab should be opened")
    public void verifyNewTab() {

        Set<String> windows =
                driver.getWindowHandles();

        System.out.println(
            "Number of windows: " + windows.size()
        );

        if (windows.size() > 1) {

            System.out.println(
                "New tab opened successfully"
            );
        }
    }

    @When("I switch to the new tab")
    public void switchToNewTab() {

        Set<String> windows =
                driver.getWindowHandles();

        for (String window : windows) {

            if (!window.equals(mainWindow)) {

                newWindow = window;

                driver.switchTo().window(newWindow);

                break;
            }
        }

        System.out.println("Switched to new tab");
    }

    @Then("the new tab should be displayed")
    public void verifyNewTabDisplayed() {

        System.out.println(
            "New Tab Title: " + driver.getTitle()
        );
    }

    @When("I close the new tab")
    public void closeNewTab() {

        driver.close();

        System.out.println("New tab closed");
    }

    @Then("I should return to the main tab")
    public void returnMainTab() {

        driver.switchTo().window(mainWindow);

        System.out.println(
            "Returned to main tab"
        );
    }
}