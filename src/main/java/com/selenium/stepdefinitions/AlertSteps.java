package com.selenium.stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class AlertSteps {

    WebDriver driver;

    Alert alert;

    @When("I click the Simple Alert button")
    public void clickSimpleAlert() {

        driver.findElement(By.id("alertBtn")).click();
    }

    @Then("I should get a simple alert")
    public void simpleAlert() {

        alert = driver.switchTo().alert();

        System.out.println(
            "Simple Alert: " + alert.getText()
        );
    }

    @When("I accept the simple alert")
    public void acceptSimpleAlert() {

        alert.accept();

        System.out.println("Simple Alert accepted");
    }

    @When("I click the Confirm Alert button")
    public void clickConfirmAlert() {

        driver.findElement(By.id("confirmBtn")).click();
    }

    @Then("I should get a confirm alert")
    public void confirmAlert() {

        alert = driver.switchTo().alert();

        System.out.println(
            "Confirm Alert: " + alert.getText()
        );
    }

    @When("I accept the confirm alert")
    public void acceptConfirmAlert() {

        alert.accept();

        System.out.println("Confirm Alert accepted");
    }

    @When("I click the Prompt Alert button")
    public void clickPromptAlert() {

        driver.findElement(By.id("promptBtn")).click();
    }

    @Then("I should get a prompt alert")
    public void promptAlert() {

        alert = driver.switchTo().alert();

        System.out.println(
            "Prompt Alert: " + alert.getText()
        );
    }

    @When("I enter {string} in the prompt alert")
    public void enterPrompt(String text) {

        alert.sendKeys(text);

        System.out.println(
            "Entered Prompt: " + text
        );
    }

    @When("I accept the prompt alert")
    public void acceptPrompt() {

        alert.accept();

        System.out.println("Prompt Alert accepted");
    }

    @Then("the prompt result should be displayed")
    public void promptResult() {

        String result =
            driver.findElement(By.id("demo")).getText();

        System.out.println(
            "Prompt Result: " + result
        );
    }
}