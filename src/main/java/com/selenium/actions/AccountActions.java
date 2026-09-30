package com.selenium.actions;

import org.openqa.selenium.WebDriver;

import com.selenium.locators.Account;

public class AccountActions {

    Account account;

    public AccountActions(WebDriver driver) {

        account = new Account(driver);
    }
    
//  TEST CASE FOR ACCOUNTS
//  1) Open the website.
//  2) Enter Jeya in Name.
//  3) Enter jeya@gmail.com in Email.
//  4) Enter No 66/1 Arani Rangan Street in Address.
//  5) Select Male.

    public void executeAccount() {

        System.out.println( "========== ACCOUNT ==========");

        account.enterName("Jeya");

        account.enterEmail( "jeya@gmail.com");

        account.enterAddress(  "No 66/1 Arani Rangan Street");

        account.selectGender("Female");

        System.out.println( "========== ACCOUNT COMPLETED ==========");
    }
}