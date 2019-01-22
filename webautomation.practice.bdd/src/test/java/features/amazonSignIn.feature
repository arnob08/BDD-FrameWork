@FunctionalTest


Feature: A description

Scenario Outline:
Given user is alraedy on home page
When try log in by "<email>" and "<password>"
Then error Msg Is There

Examples:
| email            |  password  |
|  rash@gmail.com  |  qhdiqwuh  |
|  hash@gmail.com  |  shwej     |



Scenario:
Given user already on home page
When enter invalid data from Data Table
|  email            |    password     |
|  zen@gmail.com    |    qwkdmqwlk    |
|   ras@gmail.com   |     swmwqwww    |
Then error msg should be there