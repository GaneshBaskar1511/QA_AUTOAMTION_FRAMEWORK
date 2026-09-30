package com.selenium.tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

    protected WebDriver driver;

    // Constructor
    public CommonMethods(WebDriver driver) {
        this.driver = driver;
    }

    // Setup
    public void setUp() {

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(
            "https://testautomationpractice.blogspot.com/"
        );

        System.out.println("Browser opened successfully");
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Setup - Completed");
    }

    // Maximize
    public void maximize() {

        driver.manage().window().maximize();

        System.out.println("Browser maximized");
        System.out.println("Maximize - Completed");
    }

    // Implicit Wait
    public void implicitWait() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("Implicit wait: 10 seconds");
        System.out.println("Implicit Wait - Completed");
    }

    // Scroll down
    public void scrollDown() {

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        System.out.println("Page scrolled down");
        System.out.println("Scroll Down - Completed");
    }
}