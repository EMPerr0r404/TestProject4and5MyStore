Feature: My store - final exercise part 1

  Scenario Outline: Login and fill up address form

    Given Page 'https://mystore-testlab.coderslab.pl/' opened in browser

    When Button SignIn clicked
   # And Email filled
   #  And Password filled
   #  And Button Sign clicked
   #  And Address clicked
   #  And Create new address clicked
   #  And Alias '<Alias>' field filled
   #  And Address '<Address>' field filled
   #  And City '<City>' field filled
   #  And ZipCode '<ZipCode>' field filled
   #  And Phone '<Phone>' field filled
   #  And Save button clicked


   #  Then Check if address expectedAlias equals '<Alias>'
   #  Then Check if address Address equals '<Address>'
   #  Then Check if address City equals '<City>'
   #  Then Check if address ZipCode equals '<ZipCode>'
   #  Then Check if address Phone equals '<Phone>'
   #  Then Delete address
   #  Then Check if address deleted
    And Close browser

    Examples:
      | Alias | Address      | City       | ZipCode | Phone     |
      | Ad1   | Test Street1 | Bristol    | BS 11E  | 123456789 |
      | Ad2   | Test Street2 | London     | E1 8RU  | 234567890 |
      | Ad3   | Test Street3 | Manchester | M1 1AG  | 345678901 |
