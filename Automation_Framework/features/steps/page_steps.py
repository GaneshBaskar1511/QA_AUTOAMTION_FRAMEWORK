from behave import when, then
from pages.form_page import FormPage


def page(context):
    if not hasattr(context, "form_page"):
        context.form_page = FormPage(context.driver)
    return context.form_page


@when("I select all days")
def select_days(context):
    page(context).select_all_days()


@when("I select India, Blue and Cat from the dropdowns")
def select_dropdowns(context):
    page(context).select_dropdowns()


@when("I enter the required dates")
def enter_dates(context):
    page(context).enter_dates()


@then("I submit the form")
def submit_form(context):
    page(context).submit()
