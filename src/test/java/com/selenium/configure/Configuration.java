package com.selenium.configure;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {

    public static WebDriver driver;

    public static final String URL ="https://testautomationpractice.blogspot.com/";

    public static void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts() .implicitlyWait(Duration.ofSeconds(10));

        driver.get(URL);

        System.out.println("Browser opened");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
    }

    public static void handlequit() {

        driver.quit();

        System.out.println("Browser closed");
    }
}