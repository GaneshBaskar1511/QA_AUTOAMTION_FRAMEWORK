from pages.account_page import AccountPage
from pages.form_page import FormPage
from pages.file_page import FilePage


def test_complete_automation(driver):

    print("\n========== AUTOMATION STARTED ==========")

    # 1. Account details
    print("1. Entering account details...")
    account = AccountPage(driver)

    account.enter_account_details(
        "Thrinethra",
        "thrinethra@gmail.com",
        "9876543210",
        "Salem, Tamil Nadu"
    )
    print("   Account details completed.")

    # 2. Form controls
    print("2. Selecting days...")
    form = FormPage(driver)
    form.select_all_days()
    print("   Days selected.")

    print("3. Selecting dropdowns...")
    form.select_dropdowns()
    print("   Dropdowns selected.")

    print("4. Entering dates...")
    form.enter_dates()
    print("   Dates entered.")

    print("5. Submitting form...")
    form.submit()
    print("   Form submitted.")

    # 3. Other automation actions
    print("6. Performing drag and drop...")
    file_page = FilePage(driver)
    file_page.drag_and_drop()
    print("   Drag and drop completed.")

    print("7. Handling popup...")
    file_page.open_popup()
    print("   Popup completed.")

    print("8. Opening new tab...")
    file_page.open_new_tab()
    print("   New tab completed.")

    print("\n========== AUTOMATION COMPLETED ==========")