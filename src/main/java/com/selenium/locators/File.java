package com.selenium.locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class File{

    WebDriver driver;

    // FILE UPLOAD

    By SINGLE_UPLOAD_BTN=By.xpath("//button[normalize-space()='Upload Single File']");
    By MULTIPLE_UPLOAD_BTN = By.xpath("//button[normalize-space()='Upload Multiple Files']");
    By CHOOSE_1 = 	By.xpath("//input[@id='singleFileInput']");
    By CHOOSE_2 = By.xpath("//input[@id='multipleFilesInput']");
    
    // ALERTS
    By SIMPLE_ALERT = By.xpath("//button[@id='alertBtn']");
    By COMFIRM_ALERT =By.xpath("//button[@id='confirmBtn']");
    By PROMPT_ALERT = By.xpath("//button[@id='promptBtn']");
    
    // NEW TAB
    By NEW_TAB = By.xpath("//button[normalize-space()='New Tab']");
    
    // CONSTRUCTOR

    public File(WebDriver driver) {

        this.driver = driver;
    }

    // SINGLE FILE UPLOAD


    public void uploadSingleFile(String filePath) {

        // 1. Send file path to Choose File input
        driver.findElement(CHOOSE_1).sendKeys(filePath);

        System.out.println("File selected: " + filePath);

        // 2. Click Upload Single File
        driver.findElement(SINGLE_UPLOAD_BTN).click();

        System.out.println("Upload Single File button clicked");

        System.out.println("Single File Upload - Completed");
    }


   
    // MULTIPLE FILE UPLOAD

    public void uploadMultipleFiles(String filePath1, String filePath2) {

        // Select multiple files
        driver.findElement(CHOOSE_2).sendKeys(filePath1 + "\n" + filePath2);

        System.out.println("File 1 selected: " + filePath1);
        System.out.println("File 2 selected: " + filePath2);

        // Click Upload Multiple Files
        driver.findElement(MULTIPLE_UPLOAD_BTN).click();

        System.out.println("Upload Multiple Files button clicked");

        System.out.println("Multiple File Upload - Completed");
    }

    // SIMPLE ALERT
    
       public void handleSimpleAlert() {
    	
    	driver.findElement(SIMPLE_ALERT).click();
    	
        Alert alert = driver.switchTo().alert();

        System.out.println("Simple Alert Text: " +alert.getText());
        
        alert.accept();

        System.out.println("Simple Alert accepted");

        System.out.println(  "Simple Alert - Completed");
    }
    
 // CONFIRM ALERT
    
    public void handleConfirmAlert() {
    	driver.findElement(COMFIRM_ALERT).click();
    	
    	Alert alert = driver.switchTo().alert();

        System.out.println("Confirm Alert Text: " +alert.getText());

        alert.accept();

        System.out.println("Confirm Alert accepted");

        System.out.println(  "Confirm Alert - Completed");
    }

    
 // PROMPT ALERT

    public void handlePromptAlert() {

        // Click Prompt button
        driver.findElement(PROMPT_ALERT).click();
        // Switch to alert
        Alert alert = driver.switchTo().alert();
        // Get alert text
        String textPrompt = alert.getText();
        System.out.println("Prompt Alert Text: " + textPrompt);
        // Enter text into prompt
        alert.sendKeys("Subiksha");
        System.out.println("Entered text: Subiksha");
        // Click OK
        alert.accept();
        System.out.println("Prompt Alert accepted");

        // Get result displayed on webpage
        String result = driver.findElement(By.id("demo")).getText();

        System.out.println("Prompt Result: " + result);
        System.out.println("Prompt Alert - Completed");
    }


//// NEW TAB
//
//    	public void handleNewTab() {
//    		driver.findElement(NEW_TAB).click();
//    		
//    		System.out.println("New tab is opened or not: ");
//            System.out.println("New Tab - Completed");
//}


}