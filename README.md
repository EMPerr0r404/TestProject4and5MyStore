# TestProject4and5MyStore - Tests on https://mystore-testlab.coderslab.pl/

Test 1:

Feature: My store - final exercise part 1

  Scenario Outline: Login and fill up address form

    Given Page 'https://mystore-testlab.coderslab.pl/' opened in browser

    When Button SignIn clicked
    And Email filled
    And Password filled
    And Button Sign clicked
    And Address clicked
    And Create new address clicked
    And Alias '<Alias>' field filled
    And Address '<Address>' field filled
    And City '<City>' field filled
    And ZipCode '<ZipCode>' field filled
    And Phone '<Phone>' field filled
    And Save button clicked


    Then Check if address expectedAlias equals '<Alias>'
    Then Check if address Address equals '<Address>'
    Then Check if address City equals '<City>'
    Then Check if address ZipCode equals '<ZipCode>'
    Then Check if address Phone equals '<Phone>'
    Then Delete address
    Then Check if address deleted
    And Close browser

Test 2:

Feature: My store - final exercise part 2

  Scenario: Login and buy product

    Given Page 'https://mystore-testlab.coderslab.pl/' opened in browser2

    When Logged in
    And MyStore clicked
    And HUMMINGBIRD PRINTED SWEATER clicked
    And Discount checked
    And Size 'M' chosen
    And Numbers 5 of item chosen
    And Item added to cart
    And Proceed to checkout clicked
    And Proceed to checkout clicked2
    And Continue clicked
    And Pick up in store chosen
    And Continue to payment clicked
    And Pay by check chosen, and agreed to terms
    And Place order clicked
    Then Save screenshot
    Then Check if order have "Awaiting check payment" status, same price and same number
    And Close browser2

