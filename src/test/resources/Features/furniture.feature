Feature: Test functionalities of Furniture category

  Scenario: verify Living Room Furniture Category
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

    Scenario: verify Bed Room Furniture Category
      Given user navigate to the home page
      Then user mouse hover to furniture option
      And click Bed Room Furniture
      Then user click on Bedroom Sets tab
      Then user select bed size
      Then user select White color
      And user select Gray color
      Then user click on Bed Type
      And select Bed Platform Type
      Then user click on Sort by dropdown menu
      And select price per item Low to High
      Then user closed the browser

      Scenario: verify Kitchen & Dining Furniture Category
        Given user navigated to the home page
        Then user mouse hovered to furniture option
        And click Kitchen and Dining Furniture
        Then user click on Dining Tables and Seating tab
        Then user click on Kitchen and Dining Tables
        Then user select Rectangular from Table Shape Option
        Then user select Seats 2 and 4 from Seating Capacity Option
        Then user click on Price Per Item options
        And Input Min price 200 and Max price 600
        Then user closing the browser

        Scenario: verify Office Furniture Category
          Given user open the homepage
          Then user mouse hover to furniture options
          And click on Office Furniture
          Then user click on Office Chair tab
          Then Input Min price 75 and Max price 250 in Price Per item section
          Then user click on Executive Chair under Type section
          Then user click on Arm Type tab
          And select Arm Style as Armless
          Then user click on next button
          And user did close the browser

          Scenario: verify Game Room Furniture Category
            Given user is navigated to home page
            Then user mouse hovering to furniture tab
            And click on Game Room Furniture
            Then user click on gaming Chair tab
            Then Input Min price 100 and Max price 400 in Price Per item section
            Then user clicked on PC & Racing Chair under Chair Type section
            Then user click on Weight Capacity tab
            And select Up to 200 lbs and 200lbs-300lbs option
            Then user click on Sort by tab and select Price per Item High to Low
            And user close the webbrowser