

@iphone

Feature: Atomatic search

  Scenario Outline:
    Given user is alredy on home page
    When search info is added from "<data>" list
    Then get text from iphone page
    Examples:
    | data           |
    | iphone charger |
    | iphone charger |
    | iphone charger |