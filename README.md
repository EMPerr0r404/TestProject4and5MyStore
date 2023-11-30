# TestProject4and5MyStore

Task 1:

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

Task 2:

