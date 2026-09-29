package com.selenium.hooks;

import com.selenium.stepdefinitions.CommonSteps;

import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown() {

        if (CommonSteps.driver != null) {

            CommonSteps.driver.quit();

            System.out.println(
                "Browser closed"
            );
        }
    }
}