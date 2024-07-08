Feature: Search and Place Order for Product
  @test
  Scenario Outline: Search Experience for  product search in both home and offer page
    Given user landing on greenkart homepage
    When user searched with shortname <name> and extracted actual name of product
    Then user searched for <name> shortname in offer page to check if product exist
    Examples:
    |name|
    |Tom |
    |Beet|