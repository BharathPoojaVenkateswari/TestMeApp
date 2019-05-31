Feature: The user one who wants to selects the product and proceed with checkout

Scenario: Select Product and Checkout

Given user login to TestMeApp
When user selects product as "shopping bag"
When user clicks on add to cart
When user clicks on cart link
When user provides quantity as 1
When user proceeds checkout
Then verify the payment and payment page