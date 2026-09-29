package com.selenium.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class FileSteps {

    WebDriver driver;

    String file1 =
        "C:/Users/UTIS LAPTOP 624/Desktop/Testing/Functional_requirements_OAT.pdf";

    String file2 =
        "C:/Users/UTIS LAPTOP 624/Desktop/Testing/Functional_requirements_OAT.pdf";

    @When("I select the single file")
    public void selectSingleFile() {

        driver.findElement(
            By.id("singleFileInput")
        ).sendKeys(file1);

        System.out.println("Single file selected");
    }

    @When("I click Upload Single File")
    public void uploadSingleFile() {

        driver.findElement(
            By.xpath("//button[normalize-space()='Upload Single File']")
        ).click();

        System.out.println("Single file uploaded");
    }

    @Then("the single file should be uploaded successfully")
    public void verifySingleUpload() {

        System.out.println(
            "Single File Upload - Completed"
        );
    }

    @When("I select two files")
    public void selectMultipleFiles() {

        driver.findElement(
            By.id("multipleFilesInput")
        ).sendKeys(file1 + "\n" + file2);

        System.out.println("Two files selected");
    }

    @When("I click Upload Multiple Files")
    public void uploadMultipleFiles() {

        driver.findElement(
            By.xpath("//button[normalize-space()='Upload Multiple Files']")
        ).click();

        System.out.println("Multiple files uploaded");
    }

    @Then("the multiple files should be uploaded successfully")
    public void verifyMultipleUpload() {

        System.out.println(
            "Multiple File Upload - Completed"
        );
    }
}