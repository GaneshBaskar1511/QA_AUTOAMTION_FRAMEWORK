from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select
from pages.base_page import BasePage


class FormPage(BasePage):
    DAYS = {
        "Sunday": (By.ID, "sunday"), "Monday": (By.ID, "monday"),
        "Tuesday": (By.ID, "tuesday"), "Wednesday": (By.ID, "wednesday"),
        "Thursday": (By.ID, "thursday"), "Friday": (By.ID, "friday"),
        "Saturday": (By.ID, "saturday")
    }
    COUNTRY = (By.ID, "country")
    COLOR = (By.ID, "colors")
    ANIMAL = (By.ID, "animals")
    DATE_PICKER_1 = (By.ID, "datepicker")
    DATE_PICKER_2 = (By.ID, "txtDate")
    START_DATE = (By.ID, "start-date")
    END_DATE = (By.ID, "end-date")
    SUBMIT = (By.CSS_SELECTOR, "button.submit-btn")

    def select_all_days(self):
        for locator in self.DAYS.values():
            self.click(locator)

    def select_dropdowns(self):
        Select(self.driver.find_element(*self.COUNTRY)).select_by_visible_text("India")
        Select(self.driver.find_element(*self.COLOR)).select_by_visible_text("Blue")
        Select(self.driver.find_element(*self.ANIMAL)).select_by_visible_text("Cat")

    def enter_dates(self):
        self.enter_text(self.DATE_PICKER_1, "09/23/2026")
        self.enter_text(self.START_DATE, "23/09/2026")
        self.enter_text(self.END_DATE, "30/09/2026")

        self.driver.execute_script(
            "arguments[0].click();",
            self.driver.find_element(*self.DATE_PICKER_2)
        )

        self.driver.execute_script(
            "$('#txtDate').datepicker('setDate', new Date(2026, 8, 23));"
        )

        self.driver.find_element(By.TAG_NAME, "body").click()

    def submit(self):
        self.click(self.SUBMIT)