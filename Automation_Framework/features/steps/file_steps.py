from behave import when, then
from pages.file_page import FilePage


@when("I perform the file and browser actions")
def file_actions(context):
    context.file_page = FilePage(context.driver)
    context.file_page.drag_and_drop()
    context.file_page.open_popup()
    context.file_page.open_new_tab()


@then("the file and browser actions should complete successfully")
def verify_actions(context):
    assert context.driver.current_window_handle
