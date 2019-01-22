# new feature
# Tags: optional
@zen
Feature: Amazon Book

  Background:
    Given User is already on Home Page
    When user goes to Book page

    Scenario: Award Winner
      Then get text from Award Winner and assert

      Scenario:Bargain Books
        Then get text from Bargain Books and Assert

        Scenario: Fall Reading
          Then get Text from Fall Reading and assert

          Scenario: Book Of the Month
            Then get text from Book Of the month and Assert

            Scenario: Book Of the Year
              Then get text from Book of the Year and Year

              Scenario: Celebrity Pick
                Then get text from Celebrity Pick and Assert

                Scenario: Books in Spanish
                  Then get text from Books in Spanish and Assert

                  Scenario: Children's Book
                    Then get text from Children's Book