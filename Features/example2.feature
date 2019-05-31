Feature: purchase product using TestMeApp

@category
Scenario: search product by category
Given user login
When search product using category
Then verify the list of products And close the application


@sub-category
Scenario: search product by sub-category
Given user login
When search product using sub-category
Then verify the list of products And close the application


@productname
Scenario: search product by productname
Given user login
When search product using productname
Then verify the list of products And close the application
