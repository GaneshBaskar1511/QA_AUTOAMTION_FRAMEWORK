from selenium import webdriver
from config.configuration import URL


def create_driver():
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.get(URL)
    return driver
