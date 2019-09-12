Feature: we need to check color of orange dress. Can we filter it

  Scenario: check orange dress
    Given automation practice homepage
    When we click on "Dresses" tab
    Then dress page opens
    When we click on "Blue" color filter
    Then orange dresses appears on the page
    And we check "Orange" color existing
    When we click on "Printed Dress" dress
    Then chosen dress page appears
    And we check that dress has "Orange" color
    When we add 100 dresses to the cart
    Then return one page before
    Then dress page opens
    When we click on "Printed Chiffon Dress" dress
    And we add 200 dresses to the cart
    Then press on the cart button
    And page with all chosen products opens
    Then compare total cost of product with sum in cart


  Scenario: send product to friend and compare another two
    Given automation practice homepage
    When we click on "Women" tab
    And press on "Tops"
    Then Tops page opens
#    Then we filter price cost from 19.00 to 28.00
    And press on "Blouse" at Tops page
    When press on send to a friend
    Then opens new frame
    And write "Billy" as name and "lameroccc@inbox.lv" as mail
    Then press on Send button
    When we click on "T-Shirt" tab
    Then T-Shirts page opens
    And press compare under T-Shirt
    When we click on "Dresses" tab
    Then dress page opens
    And press compare under any Dress
    When press compare button
    Then opens Product Comparison page
