from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from pages.base_page import BasePage


class FilePage(BasePage):
    SINGLE_FILE = (By.ID, "singleFileInput")
    MULTIPLE_FILES = (By.ID, "multipleFilesInput")
    POPUP = (By.ID, "PopUp")
    NEW_TAB = (By.XPATH, "//button[normalize-space()='New Tab']")
    DRAG = (By.ID, "draggable")
    DROP = (By.ID, "droppable")

    def upload_single_file(self, path):
        self.driver.find_element(*self.SINGLE_FILE).send_keys(path)

    def upload_multiple_files(self, file1, file2):
        self.driver.find_element(*self.MULTIPLE_FILES).send_keys(f"{file1}\n{file2}")

    def drag_and_drop(self):
        ActionChains(self.driver).drag_and_drop(
            self.driver.find_element(*self.DRAG),
            self.driver.find_element(*self.DROP)
        ).perform()

    def open_popup(self):
        old_window = self.driver.current_window_handle
        self.click(self.POPUP)
        self.wait.until(lambda d: len(d.window_handles) > 1)
        for window in self.driver.window_handles:
            if window != old_window:
                self.driver.switch_to.window(window)
                break
        self.driver.close()
        self.driver.switch_to.window(old_window)

    def open_new_tab(self):
        old_tab = self.driver.current_window_handle
        self.click(self.NEW_TAB)
        self.wait.until(lambda d: len(d.window_handles) > 1)
        for tab in self.driver.window_handles:
            if tab != old_tab:
                self.driver.switch_to.window(tab)
                break
