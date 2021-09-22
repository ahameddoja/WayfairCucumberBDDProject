Feature: Test functionalities of furniture page

  Scenario:
    Given user is in the home page
    When user mouse hover to furniture tab
    Then click Living Room Furniture
    Then user click on Sofas tab
    And select sofa type
    And select sofa design
    Then user click on Price Per Item option
    And input min price range for an item
    Then input max price range for an item
    Then user close the browser