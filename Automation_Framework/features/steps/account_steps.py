from behave import given, when, then
from pages.account_page import AccountPage


@given("the automation form is opened")
def form_opened(context):
    context.account_page = AccountPage(context.driver)


@when("I enter valid account details")
def enter_details(context):
    context.account_page.enter_account_details(
        "Thrinethra", "thrinethra@gmail.com", "9876543210", "Salem, Tamil Nadu"
    )


@then("the female gender should be selected")
def verify_gender(context):
    assert context.account_page.is_female_selected()
