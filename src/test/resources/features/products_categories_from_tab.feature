Feature: Get products categories from above tab

  Scenario Outline: Get categories of products related to sports from above tab

    Given User is on homepage to validate "<Scenario>"
    Then Hover on Sports tab
    Then Get different categories available
    Examples:
      |Scenario|
      |Hover on products available in tabs and get different categories available for them|