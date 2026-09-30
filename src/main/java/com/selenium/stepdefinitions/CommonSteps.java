package com.selenium.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class CommonSteps {

    public static WebDriver driver;

    @Given("I open the Automation Testing Practice website")
    public void openWebsite() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(
            "https://testautomationpractice.blogspot.com/"
        );

        System.out.println(
            "Website opened successfully"
        );
    }
}