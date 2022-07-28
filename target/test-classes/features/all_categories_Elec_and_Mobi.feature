Feature: Get most popular and top brands from All Categories

  #@Mobiles
  Scenario Outline: Get most popular and top brands Mobiles and Electronics from All Categories
    Given User is on homepage to validate "<Scenario>"
    Then Hover on All Categories section
    Then Hover on Electronics and Mobiles
    And Get Most popular and top brands products name
    Examples:
        |Scenario|
        |Hover on Electronics and Mobiles to get most popular and top brands|

  #@Mobiles
  Scenario Outline: Get most popular and top brands Mahali from All Categories
    Given User is on homepage to validate "<Scenario>"
    Then Hover on All Categories section
    Then Hover on Mahali
    And Get Most popular and top brands products name
    Examples:
      |Scenario|
      |Hover on Mahali to get most popular and top brands|