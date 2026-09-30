package com.selenium.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LocatorsActions {

    WebDriver driver;

    // TEXT FIELDS 

    By NAME = By.xpath("//input[@id='name']");
    By EMAIL = By.xpath("//input[@id='email']");
    By PHONE = By.xpath("//input[@id='phone']");
    By ADDRESS = By.xpath("//textarea[@id='textarea']");

    // GENDER 

    By MALE = By.xpath("//input[@id='male']");
    By FEMALE = By.xpath("//input[@id='female']");

    // DAYS 

    By SUNDAY = By.xpath("//input[@id='sunday']");
    By MONDAY = By.xpath("//input[@id='monday']");
    By TUESDAY = By.xpath("//input[@id='tuesday']");
    By WEDNESDAY = By.xpath("//input[@id='wednesday']");
    By THURSDAY = By.xpath("//input[@id='thursday']");
    By FRIDAY = By.xpath("//input[@id='friday']");
    By SATURDAY = By.xpath("//input[@id='saturday']");

    // DROPDOWNS 

    By COUNTRY = By.xpath("//select[@id='country']");
    By COLORS = By.xpath("//select[@id='colors']");
    By SORTED_LIST = By.xpath("//select[@id='animals']");

    // DATE PICKERS 

    By DATE_PICKER_1 = By.xpath("//input[@id='datepicker']");
    By DATE_PICKER_2 = By.xpath("//*[@id=\"txtDate\"]");

    // DATE RANGE
    By START_DATE = By.xpath("//input[@id='start-date']");
    By END_DATE = By.xpath("//input[@id='end-date']");

    // SUBMIT
    By SUBMIT = By.xpath("//button[@class='submit-btn']");
    
    // RESULT
    By RESULT = By.xpath("//div[@id='result']");
    
    //  CONSTRUCTOR 

    public LocatorsActions(WebDriver driver) {
        this.driver = driver;
    }

    // TEXT FIELDS

    public void enterName(String value) {
        driver.findElement(NAME).sendKeys(value);
        System.out.println("Name entered: " + value);
        System.out.println("Name - Completed");
    }

    public void enterEmail(String value) {
        driver.findElement(EMAIL).sendKeys(value);
        System.out.println("Email entered: " + value);
        System.out.println("Email - Completed");
    }

    public void enterPhone(String value) {
        driver.findElement(PHONE).sendKeys(value);
        System.out.println("Phone entered: " + value);
        System.out.println("Phone - Completed");
    }

    public void enterAddress(String value) {
    	driver.findElement(ADDRESS).sendKeys(value);
        System.out.println("Address entered: " + value);
        System.out.println("Address - Completed");
    }

    // GENDER

    public void selectGender(String gender) {
        driver.findElement(MALE).click();
        System.out.println("Gender - Completed");
    }

    // DAYS / CHECKBOXES

    public void selectDays() {

        driver.findElement(SUNDAY).click();
        System.out.println("Day selected: Sunday");

        driver.findElement(MONDAY).click();
        System.out.println("Day selected: Monday");

        driver.findElement(FRIDAY).click();
        System.out.println("Day selected: Friday");

        System.out.println("Days selection - Completed");
    }

    // COUNTRY DROPDOWN

    public void selectCountry(String countryName) {

        WebElement countryElement = driver.findElement(COUNTRY);

        Select country = new Select(countryElement);
        country.selectByVisibleText(countryName);

        String selectedCountry = country.getFirstSelectedOption().getText();

        System.out.println("Country selected: " + selectedCountry);
        System.out.println("Country - Completed");
    }

    // COLORS MULTI SELECT

    public void selectColors() {

        WebElement colorElement =driver.findElement(COLORS);

        Select colors = new Select(colorElement);
        
        colors.selectByVisibleText("Red");
        System.out.println("Color selected: Red");
        
        colors.selectByVisibleText("Blue");
        System.out.println("Color selected: Blue");

        // Print all selected colors
        List<WebElement> selectedColors = colors.getAllSelectedOptions();
        System.out.println("Selected Colors:");

        for (WebElement color : selectedColors) {
            System.out.println( "- " + color.getText());
        }
        System.out.println("Colors - Completed");
    }

    // SORTED LIST
 
    public void selectSortedList(String animal) {
        WebElement animalElement = driver.findElement(SORTED_LIST);

        Select animals = new Select(animalElement);
        animals.selectByVisibleText(animal);

        String selectedAnimal = animals.getFirstSelectedOption().getText();

        System.out.println( "Sorted List selected: " + selectedAnimal);

        System.out.println("Sorted List - Completed");
    }

    // DATE PICKER 1
   
    public void enterDatePicker1(String date) {
        WebElement dateElement =driver.findElement(DATE_PICKER_1);
        dateElement.sendKeys(date);

        System.out.println("Date Picker 1: " + date);
        System.out.println("Date Picker 1 - Completed");
    }

    // DATE PICKER 2

    public void enterDatePicker2() {

        WebElement datePicker2 = driver.findElement(DATE_PICKER_2);
        datePicker2.click();
        System.out.println("Date Picker 2 opened");

        WebElement date = driver.findElement( By.xpath("//a[@data-date='23']"));

        date.click();

        System.out.println("Date Picker 2 selected: 23/09/2026");
        System.out.println("Date Picker 2 - Completed");
    }
    
    // DATE PICKER 3 - START DATE
   
    public void enterStartDate(String date) {
        WebElement startDate =driver.findElement(START_DATE);
        startDate.sendKeys(date);
        System.out.println( "Start Date: " + date );
        System.out.println("Start Date - Completed");
    }

    // DATE PICKER 3 - END DATE

    public void enterEndDate(String date) {
        WebElement endDate = driver.findElement(END_DATE);
        endDate.sendKeys(date);
        System.out.println("End Date: " + date );
        System.out.println("End Date - Completed");
    }
    
    // SUBMIT
    public void enterSubmit() {
    	WebElement submit = driver.findElement(SUBMIT);
    	submit.click();
    	 System.out.println("Submitted Sucessfully");
    }
    
    // PRINT THE RESULT
    public void printresult() {
    	WebElement result = driver.findElement(RESULT);
    	System.out.println(result.getText());
    }
}