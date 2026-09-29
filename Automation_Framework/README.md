# SeleniumTest - POM + BDD + Behave + PyTest

This project reorganizes the original Selenium script into a Page Object Model (POM) structure while adding BDD/Gherkin feature files, Behave step definitions, hooks, and PyTest fixtures.

## Structure

- `pages/` - Page Object Model classes
- `features/` - Gherkin Feature Files
- `features/steps/` - Behave Step Definitions
- `features/environment.py` - Behave hooks
- `tests/conftest.py` - PyTest fixture
- `tests/` - PyTest test cases
- `utils/` - WebDriver creation
- `config/` - URL/configuration

## Concepts included

BDD, Gherkin, Feature Files, Step Definitions, POM, Hooks, Fixtures, Behave, PyTest, Selenium.

## Execution

Install dependencies:
`pip install -r requirements.txt`

Run PyTest:
`pytest`

Run Behave:
`behave`

Note: Behave executes the Gherkin Feature Files. PyTest executes the Python test files using fixtures. They are kept as two execution paths in the same project so each tool's role is clear.
