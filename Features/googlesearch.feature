Feature: google Search

  Scenario Outline: perform a google job search
    Given when I am on google home page
    When I enter search "<term>"
    And I click on google search button
    Then I receive related search result

    Examples: 
      | term              |
      | Quality Assurance |
      | Software Testing  |
