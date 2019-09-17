Feature: we need to check color of orange dress. Can we filter it

#  Scenario: check orange dress
#    Given automation practice homepage
#    When we click on "Dresses" tab
#    Then dress page opens
#    When we click on "Blue" color filter
#    Then orange dresses appears on the page
#    And we check "Orange" color existing
#    When we click on "Printed Dress" dress
#    Then chosen dress page appears
#    And we check that dress has "Orange" color
#    When we add 100 dresses to the cart
#    Then return one page before
#    Then dress page opens
#    When we click on "Printed Chiffon Dress" dress
#    And we add 200 dresses to the cart
#    Then press on the cart button
#    And page with all chosen products opens
#    Then compare total cost of product with sum in cart


  Scenario: send product to friend and compare another two
    Given automation practice homepage
    When we click on "Women" tab
    Then press on "Tops"
    And Tops page opens
    When press on "Blouse" at Tops page
    Then press on send to a friend
    And opens new form to send mail
      #sprositj sawu ob koordinatah knopki i ih nazimanii.
      #sprositj sawu ob etoj hreni, kogda staviw | i tipo tam piwew paroli i logini.
    Then write "Billy" as name and "billy@inbox.lv" as mail
#    Examples:
#      | friendName | friendMail         |
#      | Billy      | billy@inbox.lv |
#      | kate       | kate@inbox.lv      |
#      | Lilly      | lilly@inbox.gop    |
    And send all written information
    When we click on "T-shirts" tab
    Then T-Shirts page opens
    And press compare under product
    And click on big compare button
    When we click on "Dresses" tab
    Then dress page opens
    And press compare under product
    When click on big compare button
    Then opens Product Comparison page
    Then compare two products and add to cart cheapest one
