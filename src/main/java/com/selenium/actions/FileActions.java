package com.selenium.actions;

import org.openqa.selenium.WebDriver;

import com.selenium.locators.File;

public class FileActions {

    File file;

    public FileActions(WebDriver driver) {

        file = new File(driver);
    }
    
//    TEST CASES FOR FILE ACTIONS  
//    Open the website.
//    Select a file using the Choose File button.
//    Click Upload Single File.
//    Verify the single file is uploaded successfully.
//    Select two files using the Choose Files button.
//    Click Upload Multiple Files.
//    Verify both files are uploaded successfully.
//    Click the Simple Alert button.
//    Verify the alert message and click OK.
//    Click the Confirm Alert button.
//    Verify the alert message and click OK.
//    Click the Prompt Alert button.
//    Verify the prompt alert message.
//    Enter Subiksha in the prompt alert.
//    Click OK and verify the entered name is displayed on the webpage.
//    Verify all file upload and alert operations are completed successfully.


    public void executeFiles() {

        System.out.println("========== FILES ==========");

        String filePath ="C:/Users/UTIS LAPTOP 624/Desktop/Testing/Functional_requirements_OAT.pdf";
        String filePath1 ="C:/Users/UTIS LAPTOP 624/Desktop/Testing/Functional_requirements_OAT.pdf";
        String filePath2 ="C:/Users/UTIS LAPTOP 624/Desktop/Testing/Functional_requirements_OAT.pdf";

        // Choose file → Upload Single File
        file.uploadSingleFile(filePath);
        // Choose file → Upload Multiple File
        file.uploadMultipleFiles(filePath1, filePath2);

        // Handle upload alert
        file.handleSimpleAlert();
        file.handleConfirmAlert();
        file.handlePromptAlert();
        
//        //New Tab
//        file.handleNewTab();

        System.out.println("========== FILES COMPLETED ==========");
    }
   }