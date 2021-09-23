Feature: Test login and product checkout functionalities

  Scenario Outline:

    Given user navigate to home page
    When user click on menu bar from left
    Then user click on Sign In Button
    Then user enters email "<Email>" and "<Password>" password click continue button
    Then user mouse hover to outdoor menu and click on garden
    Then user click on planters and select type and product
    And  user click on add to Cart button
    And user clicked on No Thanks button
    Then user click on Review Cart button
    Then user click on ship to button
    And  user provide the "<Zip Code>" in Ship to option and click the update button
    Then user click on Proceed to Checkout button
    Then user click on Back to Cart button
    And user click on menu bar from left again and click SignOut Button
    And  user close the browser successfully

    Examples:
      | Email               | Password|Zip Code|
      |asdmithun30@gmail.com|M1thun007|67346   |