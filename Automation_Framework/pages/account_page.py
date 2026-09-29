from selenium.webdriver.common.by import By
from pages.base_page import BasePage


class AccountPage(BasePage):
    NAME = (By.ID, "name")
    EMAIL = (By.ID, "email")
    PHONE = (By.ID, "phone")
    ADDRESS = (By.ID, "textarea")
    FEMALE = (By.ID, "female")

    def enter_account_details(self, name, email, phone, address):
        self.enter_text(self.NAME, name)
        self.enter_text(self.EMAIL, email)
        self.enter_text(self.PHONE, phone)
        self.enter_text(self.ADDRESS, address)
        self.click(self.FEMALE)

    def is_female_selected(self):
        return self.wait.until(lambda d: d.find_element(*self.FEMALE).is_selected())
