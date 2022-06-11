Feature: Amazon.com
  Scenario: Amazon.com Adding and Removing Products
    Given User is on Home Page
    When Click the search button
    When Write "product" name
    When click search button
    When click accept cookies
    When Filter for "Shipped by Amazon"
    When Go to the second page
    When Click the first "product"
    When Go to cart page
    When Check at cart page
    When The product is removed from the basket
    Then Check that the basket is empty























