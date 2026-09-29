package com.selenium.main;

import com.selenium.actions.AccountActions;
import com.selenium.actions.FileActions;
import com.selenium.actions.PageActions;
import com.selenium.configure.Configuration;

public class Main {

    public static void main(String[] args)
            throws InterruptedException {

        // CONFIGURATION - It is static method so we can call using class name 
        Configuration.setUp();

        // ACCOUNT - It is non static method so we can create the object then call 
        AccountActions account = new AccountActions( Configuration.driver);
        account.executeAccount();
        
        // PAGES
        PageActions page =new PageActions(Configuration.driver);
        page.executePages();

        // FILES
        FileActions files = new FileActions( Configuration.driver);
        files.executeFiles();

        // CLOSE
        Thread.sleep(3000);
        Configuration.handlequit();
    }
}